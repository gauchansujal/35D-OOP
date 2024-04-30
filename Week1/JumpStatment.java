public class JumpStatment {
    public static void main(String[] args){
        //break and continue statment in java
        // breakl wil terminate the loop 
        for(int index =  0; index < 5; index ++){
            if(index == 3){
                break; // this line will break the loop scope 

            }
            System.out.println("index "+ index);

        }
        // can be used in any loop 
        int count = 0;
        while(count <= 10){
            if(count == 1){
                break;

            }
            System.out.println("count" + count);
            count++;
        }
    

    }
    
}
