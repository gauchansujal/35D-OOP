public class Function {
    /*Write a function inside a calss */
    void printSomthing(){
        System.out.println("this function prints");
    }
    /*in this funcctionvoid means nothing/null */
    /*with return type as int */
    int returnInteger(){
       int returnThis = 1;
       return returnThis;
    }
}
/*with return and press */
   boolean returnString(int num1, int num2){
   boolean check = num1 == num2;
   return check;
}
    public static void main(String[] args){
        /*to use a fumctiom you meed to make object */
        /*note just remember the syntax for now */
        Function fc = new Function();
        fc.printSomthing();
        /*you can call this function anytime in need */
        fc.printSomthing(); 
        /*if a function has a return type other than void we can save it */
        int callIntFunction = fc.returnInteger();
        bollean callReturnString = fc.returnString(10, 20);
        System.out.println("Function with return Int", calling)
    
}
