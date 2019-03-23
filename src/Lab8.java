import java.util.ArrayList;


public class Lab8 {

	public static void main(String[] args)
	{
		for(int i=0;i<10;++i)
		{
			int x = CS2004.UI(0, 1);
			System.out.println(x);
		}
		ScalesSolution s = new ScalesSolution("10101x");
		s.println();
		testFitnessFC();
		CS2004.ReadNumberFile("C:\\Users\\Parth Patel\\Desktop\\1000 Primes.txt");
		
	}

	public static void testFitnessFC() {
		ArrayList<Double> weights = new ArrayList<Double>();
		weights.add(1.0);
		weights.add(2.0);
		weights.add(3.0);
		weights.add(4.0);
		weights.add(10.0);
		System.out.println(weights);
		
		System.out.print("Fitness: ");
		double testFitness = ScalesSolution.ScalesFitness(weights);
		System.out.print(testFitness);
	}
	
}
