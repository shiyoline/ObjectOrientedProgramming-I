public class Main {
    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
    }
}