import java.until.scanner;
import java.util.Scanner;
public class whileloop{
    public static void main(String[] args){
        int count = 0;
        // while takes boollen expression inside ()
        //the loop will run repatedaely when the bollen is true
        //if the bollen is false teh loop will end
        while(count < 5){
            System.out.println("while loop "+ count);
            ++count;

        }
        //in while loop the condation is checked at the begining 
        // if the com=ndation is false in the initial check the loop wil
    System.out.println("plese type the value between 0-100");
    Scanner scan = new Scanner(System.in);
    int inputeValue = scan.nextInt();
   while(inputeValue < 0 || inputeValue> 100){
    System.out.println("please input between 0-100");
    inputeValue = scan.nextInt();

    }

System.out.println("End loop");
scan.close();
    }
}