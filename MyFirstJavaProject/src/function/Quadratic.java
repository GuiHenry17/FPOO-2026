package function;

public class Quadratic {
	
	private float a = 0;
	private float b = 0;
	private float c = 0;
	
	public Quadratic(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}
	
	public float delta() {
		
		return (b*b - 4*a*c);
	}
	
	public boolean isConcaveUp() {
		return (a > 0);
	}
	
	public float[] rootsValues() {
		
		float delta = delta();
		if(delta < 0)
			return new float[0];
		
		float x1 = (float) (-b + Math.sqrt(delta)) / (2*a);
		if(delta == 0) {
			float[] result = {x1};
			return result;
		}
		else {
			float x2 = (float) (-b - Math.sqrt(delta)) / (2*a);
			float[] result = {x1, x2};
			return result;
		}
			
	}
	
	public int numberOfRoots() {
		
		float delta = delta();
		if(delta < 0)
			return 0;
		if(delta == 0)
			return 1;
		return 2;
	}
	
	public float vertexCoordinate() {
		return (-b / (2*a));
	}
	
	public float valueFor(float x) {
		return a*(x*x) + b*x + c;
	}
	
	//***********************************************//
	//Test
	//***********************************************//
	public static void main(String[] args) {
		
		float a=1, b=12, c=35;
		Quadratic function = new Quadratic(a,b,c);
		
		if(function.isConcaveUp())
			System.out.println("Concavidade para cima");
		else
			System.out.println("Concavidade para baixo");
		
		System.out.println("A função tem " + function.numberOfRoots() + " raízes.");
		
		System.out.println("As raízes são:");
		float[] roots = function.rootsValues();
		for(int i=0; i<roots.length; i++)
			System.out.printf("x%d = %5.2f ", i+1, roots[i]);
	}
	
	
}
