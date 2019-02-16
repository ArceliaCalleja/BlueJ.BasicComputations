 


public class LargestInteger {
        
    public Integer findLargestNumberUsingConditional(Integer[] integers){
      
        int a = integers[0];
        int b = integers[1];
        int c = integers[2];
        if ( a > b ){
            if( a > c ){
                return a; 
            }
            else {
                return c;
            }
        }
        else{
            if(b > c){
                return b;
            } 
            else{
                return c;
            }
        }
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
         int a = integers[0];
         int b=  integers[1];
         int c = integers[2];
         int max = Math.max(a,b);
         max = Math.max(max, c);
         return max;
        
    }
}
