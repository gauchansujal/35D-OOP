import java.util.ArrayList;
public class ArryaListClass{
    public static void main(String[] args){
     /*to use arryalist import at the top like scanner from java.utils */
     ArrayList<String> animals = new ArrayList <> (); 
     /*size is automatically allocatement element*/
     /*to add data in animals*/
     animals.add("cat");
     animals.add("dog");
     animals.add("elephent");
     System.out.println(animals);
     /*can add element directly to index, it will shift rest to +1 of index */
     animals.add(1, "tiger");
     System.out.println(animals);
     /*notice how the pervious 1 and rest are shifted by 1 index */
     /* to remove use. remove(index) */
     animals.remove(2);
     System.out.println(animals);
     /*it will remove the item/element in 2nd index */
     //to update.set(index, value)
     animals.set(1, "snake");
     System.out.println(animals);
     // to acess cannot use [index] -> squar bracket, us .get(index)
      System.out.println(animals.get(0));// get 0th indexed element
      /*Task
       * make an arryalist of int 
       * [100, 200, 300, 400, 500]
       * remove the value 300
       * add -100 at the first o farray list 
       * change 200 -> 210 
       * change 400 -> 420
       * print the array list 
      */
      ArrayList<Integer> intArrayList = new ArrayList<> ();
      intArrayList.add(100);
      intArrayList.add(200);
      intArrayList.add(300);
      intArrayList.add(400);
      intArrayList.add(500);
      System.out.println(intArrayList);
      intArrayList.remove(2);
      System.out.println(intArrayList);
      intArrayList.add(0, -100);
      System.out.println(intArrayList);
      intArrayList.set(2, 210);
      System.out.println( intArrayList);

    }
}