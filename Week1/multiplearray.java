public class multiplearray {
    public static void main(String [] args){
        int[] oneDArray;
        int[][] twoDArray;
        /*3d Array */
        int [][][] threeDArray;
        /*allocating memeory /size */
        twoDArray =new int[3][5];
        /*first size 3 represent how many inner array */
        /*second size 5 represent how many value in inner array */
        /*[
            [0,0,0,0,0],
            [0,0,0,0,0],
            [0,0,0,0,0],
            
          ] 
        */
     /*take the first inner array use index */
     //twoDArray[0];
     /*two take the value in first inner array use internal index */
     twoDArray[0][0] = 10;
     twoDArray[0][1] = 20;
     twoDArray[1][2] = 100;
     twoDArray[2][4]= 200;
     
     /* fill the array like the following 
      * [
          [10,20,30,40,50], -> 0
          [80,90,100,110,120], ->1
          [150,160,170,180,200], ->2
        ]
     */
    

/*now print the 1th index array like 
 * Array in 1th index
 * 80
 * 90
 * 100
 * 110
 * 120
 * note : without using
 */
/* multiple dim array memeory alloc and assignment */
int [][] arrayTwo = {
{10, 20, 30},
{20, 30, 40},
{100, 200, 300},
{3, 4, 5}
    
} ;
//[4][5]
}

