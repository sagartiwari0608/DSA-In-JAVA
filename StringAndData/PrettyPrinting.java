package StringAndData;

public class PrettyPrinting {
    public static void main(String[] args) {

        // now output modification or string modification while printing is one
        // important concept to learn
        // so basically we use printf() method to "print in formatted way" or "pretty print" the output.
        // formatters moslty start with % and then followed by some characters to specify the modifications.

        float a = 123.4567892f;
        System.out.printf("Formatted value  with : %.2f %n new line ", a); // %.2f = 2 digits after the decimal
        // and %n for new line. and '/' will be used as an escape character.

        // we can also use String.format() and following are the placeholders 
        //  %d for integers, %s for strings, %c for characters, and so on.
        String result = String.format("%2$,3.2f %1$s", "meters", 1260.5052);
        // first argument is format string, and then we rest of the comma separated values are arguments and these have specific order and that is the way you write.
        // but we can also use the arguments however we like for exampe in this example we used 1260.5052 (the second argument first and then we used first one later) 
        System.out.println(result); // 1260.51 meters and 51 befause this float formatting also rounds off.

        // some more examples
        double myNumber = 123456.78;

        // Default
        result = String.format("%f", myNumber); // 123456.780000
        System.out.println(result);

        // Two decimal digits
        result = String.format("%.2f", myNumber); // 123456.78
        System.out.println(result);

        // No decimal digits
        result = String.format("%.0f", myNumber); //123456
        System.out.println(result);

        // No decimal digits but keep the decimal point
        result = String.format("%#.0f", myNumber); //123456.
        System.out.println(result);

        // Group digits
        result = String.format("%,.2f", myNumber); // 123,456.78 (grouping in terms of thousands in terms of thousand millions etc)
        System.out.println(result);

        // Scientific notation with two digits of precision
        result = String.format("%.2e", myNumber); // 1.23e+05
        System.out.println(result);
    }
}
