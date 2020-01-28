public class Printer{
    private int rr = 50;
    private int cc = 4;
    private int numbers[];

    public Printer(int n[]){
        this.numbers = n;
    }

    public Printer(int n[], int rows, int columns){
        this.numbers = n;
        this.rr = rows;
        this.cc = columns;
    }

    public void print(){
        int PAGENUMBER = 1;
        int PAGEOFFSET = 1;
        int ROWOFFSET,C;

        while (PAGEOFFSET <= this.numbers.length - 1) {
            System.out.print("The First ");
            System.out.print(Integer.toString(this.numbers.length - 1));
            System.out.print(" Prime Numbers === Page ");
            System.out.print(Integer.toString(PAGENUMBER));
            System.out.println("\n");

            for (ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+this.rr - 1;ROWOFFSET++) {
                for (C = 0; C <= this.cc - 1; C++)
                    if (ROWOFFSET + C * this.rr <= this.numbers.length-1)
                        System.out.printf("%10d", this.numbers[ROWOFFSET + C * this.rr]);
                System.out.println();
            }
            System.out.println("\f");
            PAGENUMBER++;
            PAGEOFFSET += this.rr * this.cc;
        }
    }
}
