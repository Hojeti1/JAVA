class MAIN{
    public static void main(String[] args){
        printSessionTitle("NEW LINE");
        printThis("Hello, World \n Welcome to java Programming");

    //TABS
    printSessionTitle("TABS");
    printThis("Name: \\John Doe \n Age:\t25\nLocation:\tUSA");

    //BACKSLASH
    printSessionTitle("Back slash");
    printThis("To escape a backslash, use two: /////");

    //BACKSPACE
    printSessionTitle("BACKSPACE")
    printThis("Hello, world!\b\b\b\b\b\b\bJava!");

    //DOUBLE QUOTES
    printSessionTitle("Double quotes");
    printThis("she said, \n"Hello, wolrd!\"with a smile.");

    }


    static void printThis(String message){
    system.out.println(message);
}
static void printSessionTitle(String title){
    system.out.pritnln(title +
    "\n_____________________________");
}
}