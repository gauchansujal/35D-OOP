public class multipledimarrayloop {
    public static void main(String[] args){
       /*creating an array with [4][2] */ 
       int[][] arr = new int[4][2];
       arr[0][0] = 10;
       arr [0][1] = 20;
       arr [1][0] = -10;
       arr [1][1] = -20;
       arr [2][0] = 100;
       arr [2][1] = 200;
       arr [3][0] = -100;
       arr [3][1] = -200;
       /*visual represantation
        * [ [10, 20], ->0
            [-10, -20], ->1
            [100, -200], ->2
            [-100, -200], ->3
        ]
        */
        /*loop outer array */
        int outerLength = arr.length; //->4
        for(int outer = 0; outer < outerLength; outer ++){
            System.out.println("Array in index"+ outer);
           // System.out.println(arr[outer][0]);
           // System.out.println(arr[outer][1]);
           int innerArrayLength = arr[outer].length;
           for(int inner =0; inner < innerArrayLength; inner ++){
            System.out.println(arr[outer][inner]); //inner looop from 0,1
         
           }
        }
        /* make an array of string names
         * [
         * ["sansskriti", "nikita", "anji"], ->
         * ["miraj", "niraj", "oskar"], ->
         * 
         * 
         * ]
         */
/*loop each names */
/*take 2 on the same loop, the on which array is oskhar in */
/*answer shouild be 1 */
//String[][] names= new String[2][3]; 
String [][] names = {
    {"sanskriti", "nikita", "anji"},
    {"miraj", "niraj", "oakar"},

};

int namesLength = names.length;
for(int outer = 0; outer <namesLength; outer ++){
    
}


    }
    
}
