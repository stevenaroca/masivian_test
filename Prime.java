public class Prime{

    private int amountNumbers;
    private int arrNumbers[];

    public Prime(int amount){
        this.amountNumbers = amount;
        this.arrNumbers = new int[amount+1];
    }

    public int[] getNumbers(){
        int prime = 0;
        int num = 0;
        int position = 1;

        while(position <= this.amountNumbers){
            prime++;
            int counter = 0;
            for(num = prime; num>=1; num--){
              if(prime%num == 0)
 		           counter += 1;
              if(counter > 2)
                break;
	          }
	          if (counter == 2 ){
	            this.arrNumbers[position] = prime;
	            position++;
	          }
        }
        return this.arrNumbers;
    }

}
