import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args){
        /* import arryalis tfrom java.util */
        ArrayList<String> names = new ArrayList<>();
        names.add("ayam");
        names.add("adhar");
        names.add("yausan");
        names.add("niraj");
        names.add("ayaush");
        names.add("rijan");
        /* to loop, find the length/element count,. size() */
        int namesLength = names.size();
        /*loop same as array */
        for(int index = 0; index <namesLength; index++){
            //get each eklement with .get(index)
            String singleName = names.get(index);
            System.out.println("Index :"+ index + "value" + singleName);


        }
        /* using foreach in java, iterate with elaement/actual value */
        for(String element:names){
            System.out.println(element);
        }
    }
    
}
