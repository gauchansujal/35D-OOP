public class ForLoop{
    public static void main(String[] args){
        //use for loop when condation is fixed 
        for(int index = 0; index < 5; index ++){
            System.out.println("loop running " +index);
        }

        //deceriment loop 
        for(int index = 10; index >= 0 ; index --){
            System.out.println("loop running" +index );
        }
        
        // make tha loop table for this 


    }
     
    //nested loop 
    for(int outer = 0; outer < 3; outer ++){
        for(int inner = 2; inner >= 0; inner --){
            System.out.println("inner" + inner);
        }
        System.out.println("outer "+ outer);
    }
}