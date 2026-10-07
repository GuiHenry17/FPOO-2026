package br.edu.utfpr.tsi.addressbook.view.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.utfpr.tsi.addressbook.util.StringUtils;
import br.edu.utfpr.tsi.addressbook.view.util.ConsoleInput;

public class Menu {
	
	private static record MenuItem (String text, Runnable action) {};
	
	private ConsoleInput console;
	
	private List<MenuItem> items = new ArrayList<>();
	private String name          = "";
	private int MENU_WIDTH = 30;
	
	public Menu(ConsoleInput console) {
		this.console = console;
		addMenuItem("VOLTAR", ()->{});
	}
	
	public Menu(String name, int width, ConsoleInput console) {
		
		this(console);
		this.name = name.toUpperCase();
		this.MENU_WIDTH = width;
	}
	
	public Menu addMenuItem(String text, Runnable action) {
		
		this.items.add(new MenuItem(text.trim(), action));
		return this;
	}
	
	private void showMenu() {
		
		String lineOfTraces = "-".repeat(MENU_WIDTH);
		String menuHeader = StringUtils.center(name, MENU_WIDTH);
		
		System.out.println(lineOfTraces);
		System.out.println(menuHeader);
		System.out.println(lineOfTraces);
		
		String format = "| %2d - %-" + (MENU_WIDTH -8) + "s|\n";
		for(int i=0; i<items.size(); i++) {
			System.out.printf(format, i, items.get(i).text);
		}
		
		System.out.println(lineOfTraces);
	}
	
	public void run() {
		
		int option = 0;
		do {
			do {
				showMenu();
				option = console.readInt("Opção: ");
			} while (option < 0 || option >= items.size());
			
			items.get(option).action.run();
		} while (option != 0);
	}
	
	
	/*TEST ONLY*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		Menu menu = new Menu("Teste", 50, console);
		menu.addMenuItem("Opção 1", ()->System.out.println("Escolheu 1"));
		menu.addMenuItem("Opção 2", ()->System.out.println("Escolheu 2"));
		menu.run();
		System.out.println("Fim do teste.");
	}
	
	
}
