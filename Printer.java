public class Printer{
    private int lines = 50;
    private int columns = 4;
    private int numbers[];

    public Printer(int numbers[]){
        this.numbers = numbers;
    }

    public Printer(int n[], int lines, int columns){
        this.numbers = n;
        this.lines = lines;
        this.columns = columns;
    }

    public void print(){
        int pageNumber = 1;
        int pageOffset = 1;
        int rowOffset,colum;

        while (pageOffset <= this.numbers.length - 1) {
            System.out.print("The First ");
            System.out.print(Integer.toString(this.numbers.length - 1));
            System.out.print(" Prime Numbers === Page ");
            System.out.print(Integer.toString(pageNumber));
            System.out.println("\n");

            for (rowOffset=pageOffset; rowOffset <= pageOffset+this.lines - 1;rowOffset++) {
                for (colum = 0; colum <= this.columns - 1; colum++)
                    if (rowOffset + colum * this.lines <= this.numbers.length-1)
                        System.out.printf("%10d", this.numbers[rowOffset + colum * this.lines]);
                System.out.println();
            }
            System.out.println("\f");
            pageNumber++;
            pageOffset += this.lines * this.columns;
        }
    }
}
