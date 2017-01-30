import java.util.*;

public class gradlestuff{

	public static void main(String[] args){
		
		String arg0 = args[0];
		arg0 = arg0.toLowerCase();
		if (!(arg0.equals("triangle") || arg0.equals("lazy"))){
			System.exit(1);
		}

    try {
      Integer.parseInt(args[1]);
    }
    catch(NumberFormatException e) {
      System.exit(2);
    }

		if (Integer.parseInt(args[1]) < 0){
			System.exit(2);
		}

		if (args[0].equals("triangle")){
			int solution = triangle(Integer.parseInt(args[1]));
      printSolution(Integer.parseInt(args[1]), solution, "Tri");
		}

		if (args[0].equals("lazy")){
			int solution = lazy(Integer.parseInt(args[1]));
      printSolution(Integer.parseInt(args[1]), solution, "Lazy");
		}
	}

  public static void printSolution(int startNum, int endNum, String algo){
    System.out.println(algo + "(" + startNum + ") = " + endNum);
  }

	public static int lazy(int n){
		int temp = n * n;
		temp += n + 2;
		temp /=2;
    return temp;
	}

  public static int triangle(int n){
    int triangular = n * (n + 1)/2;
    return triangular;
  }
}
