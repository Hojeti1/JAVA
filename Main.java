class MAIN{
    public static void main(String[] args){
//         printSessionTitle("NEW LINE");
//         printThis("Hello, World \n Welcome to java Programming");

//     //TABS
//     printSessionTitle("TABS");
//     printThis("Name: \\John Doe \n Age:\t25\nLocation:\tUSA");

//     //BACKSLASH
//     printSessionTitle("Back slash");
//     printThis("To escape a backslash, use two: /////");

//     //BACKSPACE
//     printSessionTitle("BACKSPACE")
//     printThis("Hello, world!\b\b\b\b\b\b\bJava!");

//     //DOUBLE QUOTES
//     printSessionTitle("Double quotes");
//     printThis("she said, \n"Hello, wolrd!\"with a smile.");

//     }


//     static void printThis(String message){
//     system.out.println(message);
// }
// static void printSessionTitle(String title){
//     system.out.pritnln(title +
//     "\n_____________________________");
    boolean T = true, F = false;
    System.out.println(T && F); //false

    int c = 5;
    c += 3; // c c+3;, now c = 8
    System.out.println(c);


    int x = 5;  //0101 in binary
    int y = 3;
    int result = x & y;
    System.out.println("Butwise AND: " + result);

    int a = 10, b = 20;
    int max = (a>b) ?a:b;
    System.out.println("Maximum: "+ max);


    //Implicit CASTING

    // int i = 100;
    // double d = i;
    // System.out.println(d);

    // Explicit CASTING
    double d = 3.99;

    
    int i = (int) d;
    System.out.println(i);

    }
}