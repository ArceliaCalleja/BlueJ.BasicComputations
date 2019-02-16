

public class ShortCalculator {
    
    public Short addShortValue (int value1, int value2){
        int add = value1 + value2;
        return (short)add;
      
    }

    public Short substractShortValue (int value1, int value2){
        int subs = value1 - value2;
        return (short)subs;
    }

    public Short productShortValue (int value1, int value2){
        int product = value1 * value2;
        return (short)product;
    }
    public Short quotientShortValue (int value1, int value2){
    int quotient = value1 / value2;
    return (short)quotient;
    }
    public Short reminderShortValue (int value1, int value2){
    int reminder = value1 % value2;
    return(short)reminder;
    }

}

