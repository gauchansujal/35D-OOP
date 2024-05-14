public class ArrayClass {
    public static void main(String[] arg){
        /* to creat an array defin datatype followed by []  */
        int[] myFirstArray;
        /* Initally the array we need new refernece */
        myFirstArray = new int(6); // here the new int(6) = 6 refer to the size of array 
        /*the size of an array can be further acess by length  */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My First array size is " + myFirstArrayLength);
        
        /* using index for array operation */
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        /* to print the array use the same index */
        System.out.println("the first element is in 0 index " + myFirstArrayindex[0]);
        /*can also creat a new int value */ 
        int secondArrayIndex = myFirstArray[1];
        System.out.println("the second element stored" + secondArrayIndex);
        /* declaration initalization and value assign */
        int[] myThirdArray = (10, 20, 30, 0, 100);
        /* or using constructor */
        int[] myfourthArray = new int[](1,2,3, 4);
        /* task
         * Creat a array of int called my first array
         * with size of 5
         * insert the value of 10, 20, 30, 40, 50 
         * print the value of an array as well as the multiplled by 2 
         * eg :
         * 10 20
         * 20 40
         * 30 60
         * 40 80
         * 50 100
         */
    }
    public class Main {
        public static void main(String[] args) {
            // Declare and initialize an array of integers called myFirstArray
            int[] myFirstArray = new int[5]; // Array length is 5
    
            // Optionally, you can assign values to each element in the array
            myFirstArray[0] = 10;
            myFirstArray[1] = 20;
            myFirstArray[2] = 30;
            myFirstArray[3] = 40;
            myFirstArray[4] = 50;
    
            // Print the array elements
            for (int i = 0; i < myFirstArray.length; i++) {
                System.out.println("Element at index " + i + ": " + myFirstArray[i]);
            }
        }
    }
    
}
