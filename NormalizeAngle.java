 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        
        Integer result = (angle%360);
        return result;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
       
        
        Integer result = Math.floorMod(integer, 360);
        
       return result;
    }

    public static void main(String[] args){

    }
}
