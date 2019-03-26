/*
Maria I Suarez
Program Diamond:
Print the Diamond Shape using two methods. top and Bot
March 25, 1019
Ver1
 */
public class Diamond2 {

    public static void main(String[] args)
    {
        diamondMethod();        // Calling the Diamond Method
        reverseDiamond();
        System.exit(0);

    }
    public static void diamondMethod()   // Defining the Diamond with println statements
    {
        top();
        bot();
    }
    public static void reverseDiamond()
    {
        bot();
        top();
    }
    public static void top()
    {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
    }
    public static void bot()
    {
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
    }

}
