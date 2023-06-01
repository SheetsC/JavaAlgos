package introduction;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length != 2 ) {
            System.out.println("Please provide two names as command-line arguments.");
            return;
        }

        String name1 = args[0];
        String name2 = args[1];

        StdOut.println("Hello, " + name1 + " and " + name2 + "!");
        StdOut.println("Goodbye, " + name2 + " and " + name1 + "!");
    }
}



