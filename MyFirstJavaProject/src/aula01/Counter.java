package aula01;

public class Counter {

	private int start;
	private int end;
	private int step;

	public Counter(int start, int end, int step) {
		
		this.start = start;
		this.end   = end;
		this.step  = step;
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
}
