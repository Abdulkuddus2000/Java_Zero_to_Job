/**
 * Created by Abdulkuddus Kosimov
 * 06/jul./2022
 */

public class Primitive_types {
    public static void main(String[] args) {
        byte b = 1;
        short s;
        int i = 3;
        long l = 4;

        char c = 'a';

        boolean bool = true;

        float f = 1.2f; /* float maken van een double */

        long l2 = 2_000_000_000_000l;

        double d = 1.3;

        var v = 1;
//        v = true;
//        v = 1.3;

        int i3 = 5;

        char c2 = 100;
        System.out.println(c2);

        double d2 = i3;
        d2 = l;

        byte b2 = (byte) 128;
        System.out.println("b2 = " + b2);

        long number = 499_999_999_000_000_001L;
        double converted = (double) number;
        System.out.println(number - (long) converted);

        Integer i4 = 1; /* unboxing */
        int i5 = i4; /* autoboxing */

        System.out.println();

    }
}