package basicjava;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 18;
        double age1 = 21;
        double sumOfAges = age0 + age1;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
//        a common mistake would be not using () when adding age0 and age1 together
//        after changing int to double, decimals are included.
        System.out.println(6 / 3);
        System.out.println(6 / 4);
        System.out.println(6.0 / 4.0);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
//        the integer.MAX/MIN_VALUE correspond to the maximum and minimum value that can be calculated in java,
//        Integer.MIN_VALUE-1 print out to be the same as Integer.MAC_VALUE because the integer overflows.
        double hours = 1600;
        System.out.println("There are " + hours + " hours in " + hours + " hours.");
        System.out.println("There are " + (hours/24) + " days in " + hours + " hours.");
        System.out.println("There are " + (hours/24/7) + " weeks in " + hours + " hours.");
        double h=5;
        double r=2;
        double V= Math.PI*Math.pow(r,2)*h/3;
        double A= Math.PI*Math.pow(r,2)+ Math.PI*r*Math.sqrt(Math.pow(r,2)+Math.pow(h,2));
        System.out.println("A cone with height "+h+" and radius "+r+" has volume "+V+" and surface area "+A+".");
    }
}
