/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main
{
    public static void printObjectArrayBackwardsIteratively(Object[] o) {
        for (int i = o.length - 1; i >= 0 ; i--)
            System.out.print(o[i] + ", ");
    }

    public static void printObjectArrayBackwardsRecursively(Object[] o) {
        if (o.length > 0) {
            ArrayList<Object> al = new ArrayList<Object>(Arrays.asList(o));
            System.out.print(o[o.length - 1] + ", ");
            al.remove(al.size() - 1);
            printObjectArrayBackwardsRecursively(al.toArray());
        }
    }

    public static void main(String[] args) {
        Object[] values = new Object[4];
        values[0] = new Integer("2");
        values[1] = new Double("3.5");
        values[2] = new Integer("5");
        values[3] = new Double("4.5");
        //prints 4.5, 5, 3.5, 2
        printObjectArrayBackwardsIteratively(values);
        System.out.println();
        printObjectArrayBackwardsRecursively(values);
        System.out.println();
    }
}
