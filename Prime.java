public class Prime{

    private int m;
    private int p[];

    public Prime(int m){
        this.m = m;
        this.p = new int[m+1];
    }

    public int[] getNumbers(){
        int i =0;
        int num =0;
        int k = 1;

        while(k <= this.m){
            i++;
            int counter=0;
            for(num =i; num>=1; num--){
                if(i%num==0)
 		            counter = counter + 1;
	        }
	        if (counter ==2){
	            this.p[k] = i;
	            k++;
	        }
        }
        return this.p;
    }

}
