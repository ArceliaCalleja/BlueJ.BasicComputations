 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(int value){
        //System.out.print("value=" + value);
        BigInteger fac=new BigInteger("1");
        for(int i=1;i<= value; i++){
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
    
}

