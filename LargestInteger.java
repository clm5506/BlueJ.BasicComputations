 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
            
            int maximumInt = integers[0];
            
            for(int i = 1; i < integers.length; i++){   
                   
                   if(integers[i] > maximumInt) {
                        
                       maximumInt= integers[i];        
                    
            }
                  
        }   return maximumInt;
    }   
    
    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        int maxInArray = Math.max(integers[0], (Math.max(integers[1],integers[2])));
        return maxInArray;
    }
    
    
}
