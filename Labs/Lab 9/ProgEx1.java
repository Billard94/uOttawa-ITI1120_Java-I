public class ProgEx1 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){
		double result =  m(i);
      System.out.println(result);
	}
  }

  public static double m(int i) {
    if (i == 1)
      return 1.0 / 3;
    else
      return m(i - 1) + i * 1.0 / (2 * i + 1);
  }
}
