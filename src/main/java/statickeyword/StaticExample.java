package statickeyword;

public class StaticExample {
    //static variable
    static String msg;
    int num=10;

    static void printMessage(){
        System.out.println(msg);
    }

   static {
        msg = "Hello Bro";
    }
    public static void main(String[] args) {
        StaticExample.printMessage();
        StaticExample se = new StaticExample();
        //instance of the class can access static variable of the class
        //Vice versa is not allowed
        //because static variable is common to class, any instance can access but the value gonna be same
        //where as instance variables differs, so it is not allowed.
        //but instanceobj.staticvariable is not good method
        System.out.println(se.msg);
    }
}
