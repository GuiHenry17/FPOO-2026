package aula01;

public class Counter {

	private int start = 1;
	private int end   = 10;
	private int step  = 1;
	
	public Counter() {
		//nothing for while
	}
	
	public Counter(int start, int end) {
		
		this.start = start;
		this.end   = end;
	}

	public Counter(int start, int end, int step) {
		
		this(start, end);
		this.step  = Math.abs(step);
	}
	
	public void count() {
		
		for (int i=start; i <= end; i+=step) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
	}
	
	public void countDown() {
		
		for (int i=end; i >= start; i-=step) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
	}
	
	//********************************************/
	//Test only
	//********************************************/
	public static void main(String[] args) {
		Counter counter = null; //Isso é uma referência chamada counter
		counter = new Counter(); // cria um Objeto counter em algum lugar na memória
		counter.count();
		counter.countDown();
		
		counter = new Counter(5,15);
		counter.count();
		counter.countDown();
		
		counter = new Counter(1,10,2);
		counter.count();
		counter.countDown();
	}
}

