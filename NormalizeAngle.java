 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int normAngle = angle % 360;
        
        return normAngle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int a = integer;
        int b = 360;
        
      
        return Math.floorMod(a,b);
    }

    public static void main(String[] args){

    }
}
