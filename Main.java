public class Main
{
	public static void main(String[] args) {
        Prime p = new Prime(100);
	    int[] numbers = p.getNumbers();
	    Printer printer = new Printer(numbers);
	    printer.print();
	}
}
