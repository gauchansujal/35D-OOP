public class arrayrevise {
   // public static int arrayfinder:String[] arr, String find {

    }
    public static void main(String[] args) {
        /* 3 ways to create array */
        int[] arrayone;
        arrayone = new int[2];//->[0,0]
        int[] arraytwo = {1, 2, 4, 5, 10}; // ->[1,2,4,5,10]
        System.out.println(arraytwo[3]);
        arraytwo[1] = 200;
        /*looping an array */
        int arraytwolength = arraytwo.length;
        for (int index = 0; index < arraytwolength; index++) {
            System.out.println("Index " + index + " Value " + arraytwo[index]);
        }
        /* or loop from <= arraytwolength */
        String[] names = {"Ram", "John", "Shyam", "Doe"};
        String finder = "Shyam";
        /*Loop names and find the index of shyam */
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(finder)) {
                System.out.println(finder + " found at index " + i);
                break; // If you only want to find the first occurrence
            }
        }
        /* make a function named arrayfinder 
         * that takes array of string and string and string finder
         * return the index if found else retrun -1
         * eg { 1, 2, 3, 4} , 10
         * Return { 11, 12, 13, 14}
         */
    }
}
