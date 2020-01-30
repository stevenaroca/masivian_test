public class Main
{
	public static void main(String[] args) {
    try{
      Prime prime = new Prime(1000);
	    int[] primeNumbers = prime.getNumbers();
	    Printer printer = new Printer(primeNumbers);
	    printer.print();
    }catch(Exception e){
      e.printStackTrace();
    }
	}
}
