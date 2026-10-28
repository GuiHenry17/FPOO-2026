package br.edu.utfpr.tsi.fpoo.tic_tac_toe.util;

public class Terminal {

    
    public static final String RESET = "\033[0m";
    
    public static final String BLACK   = "\033[30m";
    public static final String RED     = "\033[31m";
    public static final String GREEN   = "\033[32m";
    public static final String YELLOW  = "\033[33m";
    public static final String BLUE    = "\033[34m";
    public static final String MAGENTA = "\033[35m";
    public static final String CYAN    = "\033[36m";
    public static final String WHITE   = "\033[37m";
    
    public static final String BRIGHT_BLACK   = "\033[90m"; // Cinza escuro
    public static final String BRIGHT_RED     = "\033[91m";
    public static final String BRIGHT_VERDE   = "\033[92m";
    public static final String BRIGHT_AMARELO = "\033[93m";
    public static final String BRIGHT_AZUL    = "\033[94m";
    public static final String BRIGHT_MAGENTA = "\033[95m";
    public static final String BRIGHT_CIANO   = "\033[96m";
    public static final String BRIGHT_BRANCO  = "\033[97m";

    public static final String BG_BLACK   = "\033[40m";
    public static final String BG_RED     = "\033[41m";
    public static final String BG_GREEN   = "\033[42m";
    public static final String BG_YELLOW  = "\033[43m";
    public static final String BG_BLUE    = "\033[44m";
    public static final String BG_MAGENTA = "\033[45m";
    public static final String BG_CYAN    = "\033[46m";
    public static final String BG_WHITE   = "\033[47m";
    
    public static final String BG_BRIGHT_BLACK   = "\033[100m";
    public static final String BG_BRIGHT_RED     = "\033[101m";
    public static final String BG_BRIGHT_VERDE   = "\033[102m";
    public static final String BG_BRIGHT_AMARELO = "\033[103m";
    public static final String BG_BRIGHT_AZUL    = "\033[104m";
    public static final String BG_BRIGHT_MAGENTA = "\033[105m";
    public static final String BG_BRIGHT_CIANO   = "\033[106m";
    public static final String BG_BRIGHT_BRANCO  = "\033[107m";

    /**
     * Clears the terminal screen and resets the cursor position to the top-left corner.
     */
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Sets the text foreground color.
     * @param textColor Use the color constants from this class (e.g., TerminalScreen.RED)
     */
    public static void setTextColor(String textColor) {
        System.out.print(textColor);
    }

    /**
     * Sets the background color.
     * @param backgroundColor Use the background constants from this class (e.g., TerminalScreen.BACKGROUND_BLUE)
     */
    public static void setBackgroundColor(String backgroundColor) {
        System.out.print(backgroundColor);
    }

    /**
     * Resets text color back to the terminal default.
     */
    public static void resetTextColor() {
        // To safely reset only the text color while keeping background, 
        // ANSI technically uses \033[39m, but standard RESET is most universally stable.
        System.out.print("\033[39m");
    }

    /**
     * Resets background color back to the terminal default.
     */
    public static void resetBackgroundColor() {
        System.out.print("\033[49m");
    }

    /**
     * Resets all styling, colors, and background effects back to default.
     */
    public static void resetAll() {
        System.out.print(RESET);
    }
    
    /**
     * Moves the terminal cursor to a specific column (X) and row (Y).
     * Note: ANSI coordinates are 1-based, meaning (1, 1) is the top-left corner.
     * 
     * @param x Column coordinate (horizontal position)
     * @param y Row coordinate (vertical position)
     */
    public static void gotoXY(int x, int y) {
        // ANSI escape sequence expects: \033[row;columnH
        System.out.printf("\033[%d;%dH", y, x);
        System.out.flush();
    }
    
    //----------------------------------------------------------------------------------------------------------------
    // Test only
    //----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
    	
    	Terminal.clear();
    	Terminal.setTextColor(GREEN);
    	System.out.println("Green text over black background");
    	Terminal.setBackgroundColor(BG_YELLOW);
    	System.out.println("Green text over yellow background");
    	Terminal.resetTextColor();
    	System.out.println("White text over yellow background");
    	Terminal.resetAll();
    	System.out.println("White text over black background");
    	
    	Terminal.gotoXY(50, 10);
    	System.out.println("(50,10)");
    	
    	Terminal.gotoXY(30, 5);
    	System.out.println("(30,5)");
    	
    }
}

