
public class Methods {

    public static void main(String args[]) {
        System.out.println(calculateSquare(33));

        System.out.println(calculateSquareRoot(20));

        System.out.println(toLowerCase("MEOOOOOWWWWWWWWW"));

        System.out.println(isMultiple(10, 200));

        prettyInteger(30);

        System.out.println(random(11, 110));
    }

    /// Write a method called `calculateSquare` that takes an int as a parameter and returns the square of that integer.
    public static int calculateSquare(int x) {
        int squareOfTheInt = x * x;
        return squareOfTheInt;
        //Write a method called `calculateSquareRoot` that takes an int as a parameter and returns the square root of that integer.
        private static double calculateSquareRoot ( int x){
            return Math.sqrt(x);
        }

        // Write a method called `toLowerCase` that takes a String as a parameter and returns the String in lower case.
        private static String toLowerCase (String string){
            return string.toLowerCase();
        }

        // Write a method called `isMultiple` that takes 2 int parameters and determines if the second is a multiple of the first.
        private static boolean isMultiple ( int x, int y){
            if (y % x == 0) {
                return true;
            }


            //Write a method called `prettyInteger` that takes an int as a parameter and prints the integer surrounded by asterisks
            private static void prettyInteger ( int x){
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
                System.out.print(x);
                for (int i = 0; i < x; i++) {
                    System.out.print("*");
                }
            }


            //  Write a method called `random` that takes 2 ints as parameters and returns a random int within that range.
            private static int random ( int x, int y){
                int randomNum = (int) (Math.random() * ((x - 1) - y)) + y;
                return randomNum;
            }


        }
