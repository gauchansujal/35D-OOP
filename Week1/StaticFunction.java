public class StaticFunction {
    /*in the following public and staic is optional */
    public static int addTwoNumber(int a, int b){
        int sum = a + b;
        return sum;


    }
    public static String vendingMachine(int menu){
        if (menu == 1){
            return "Cocke";

        }
        if(menu == 2){
            return  "Water";

        }
        if(menu == 3){
            return"Froot";

        }
        return "Nothing";
    }
    public static void main(String[] args){
        //if a function is staic no need to maek object
        //if the function is staic in same calss simple call the method 
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("the sum is " + sumReturn);

        String froot1 = vendingMachine(3);
       System.out.println("Frooti check"+ froot1);
    /*task make a function checkEven */
    /*that retrun one int */
    /*that retrun a boolean  */
    /*if the int even retrun true aslo false */

    }
    
}
