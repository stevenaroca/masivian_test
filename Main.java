public class Main
{
	public static void main(String[] args) {
      Prime p = new Prime(1000);
	    int[] numbers = p.getNumbers();
	    Printer printer = new Printer(numbers);
	    printer.print();
	}
}
