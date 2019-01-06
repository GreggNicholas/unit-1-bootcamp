
public class Loops {

    public static void main(String[] args) {
        //  OneToTen();
        // OneToTenLoopVariant();
        //oneToIntN(99);
        //   EvenNumbersOneToIntN(55);
        // SumOfNumsOneToTen();
        //SumOfNumsOneToN(333);
        // SumOfNumsOneToThousand(10000);
        // PrintSNumOfNTimes(6, "Skee Bapp");
        //firstTenFibonacciNums();
        // sumOfFirstTenFibonacciNums();
        //  NsumOfFibonacciNums(33);
//        System.out.println(sumNumbers("abc123xyz")); //→ 123
//        System.out.println(sumNumbers("aa11b33")); // → 44
//        System.out.println(sumNumbers("7 11"));// → 18
//        System.out.println(notReplace("is test")); //→ "is not test"
//        System.out.println(notReplace("is-is"));// → "is not-is not"
//        System.out.println(notReplace("This is right")); //→ "This is not right"
        posPairsWithNestedLoops4(33);
    }


//    1. Write a method that prints the numbers 1 through 10 using a loop.

    private static void OneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
    private static void OneToTenLoopVariant() {
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
    }

    //            3. Write a method that takes in an `int` n and prints the numbers 1 through n.
    private static void oneToIntN(int n) {
        for (int x = 1; x <= n; x++) {
            System.out.println(x);
        }
    }

    //            4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
    private static void EvenNumbersOneToIntN(int n) {
        for (int x = 2; x <= n; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //            5. Write a method that prints the sum of 1 through 10 using a loop.
    private static void SumOfNumsOneToTen() {
        int sum = 0;
        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
        }
        System.out.println(sum);
    }

//6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.

    private static void SumOfNumsOneToN(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum = sum + x;
        }
        System.out.println(sum);

    }

//7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.

    private static void SumOfNumsOneToThousand(int n) {
        int sum = 0;
        n = 1000;
        for (int x = 1; x <= n; x++) {
            sum = sum + x;
        }
        System.out.println(sum);

    }

    //            8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
    private static void PrintSNumOfNTimes(int n, String s) {
        for (int x = 1; x <= n; x++) {
            if (x > 1) {
                System.out.println(s + " " + s);
            } else if (n <= -1) {
                System.out.println(" ");
            }
        }
    }

//            9. Modify the method to print out the string concatenated with itself n times.
//10. Write a method that prints the first ten Fibonnaci numbers.

    private static void firstTenFibonacciNums() {
        int fibNum = 1;
        int x = 0;
        int y = 1;

        System.out.println(x + y);
        for (int c = 3; c < 12; c++) {
            fibNum = x + y;
            x = y;
            y = fibNum;
            System.out.println(fibNum);
        }
    }

//            11. Modify the method to sum the first ten Fibonnaci numbers.

    private static void sumOfFirstTenFibonacciNums() {
        int fibNum = 1;
        int sum = 1;
        int x = 0;
        int y = 1;

        for (int i = 3; i < 12; i++) {
            fibNum = x + y;
            x = y;
            y = fibNum;
            sum += fibNum;
        }
        System.out.println("Sum is " + sum);
    }
//            12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.

    private static void NsumOfFibonacciNums(int n) {
        int fibNum = 1;
        int sum = 1;
        int x = 0;
        int y = 1;

        for (int i = 3; i < n; i++) {
            fibNum = x + y;
            x = y;
            y = fibNum;
            sum += fibNum;
        }
        System.out.println(sum);
    }

    // 1. sumNumbers Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
    private static int sumNumbers(String string) {
        int sum = 0;
        String nums = "";
        string = string + " ";
        for (int x = 0; x < string.length(); x++) {
            if (Character.isDigit(string.charAt(x))) {
                nums = nums + string.charAt(x);
            } else if (!nums.equals("")) {
                sum += Integer.parseInt(nums);
                nums = "";
            }
        }
        return sum;
    }

    //#2 Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
    private static String notReplace(String string) {
        String result = "";
        for (int x = 0; x < string.length(); x++) {
            if (x - 1 >= 0 && Character.isLetter
                    (string.charAt(x - 1)) || x + 2 < string.length()
                    && Character.isLetter(string.charAt(x + 2))) {
                result += string.charAt(x);
            } else if (x + 1 < string.length()
                    && string.substring(x, x + 2).equals("is")) {
                result += "is not";
                x++;
            } else {
                result += string.charAt(x);
            }
        }
        return result;
    }


    //3. Between Words. Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
    private static String wordEnds(String firstString, String wordString) {
        int firstStringLength = firstString.length();
        int wordStringLength = wordString.length();
        String finalString = "";
        for (int i = 0; i < firstStringLength - wordStringLength + 1; i++) {
            String word = firstString.substring(i, i + wordStringLength);
            if (i > 0 && word.equals(wordString))
                finalString += firstString.substring(i - 1, i);
            if (i < firstStringLength - wordStringLength && word.equals(wordString))
                finalString += firstString.substring(i + wordStringLength, i + wordStringLength + 1);
        }
        return finalString;
    }

    //4. Number Puzzle. Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
    private static void posPairsWithSumOf60WithDiffIs14() {
        for (int x = 10; x <= 50; x++) {
            for (int j = 10; j <= 50; j++) {
                if ((x + j) == 60 && Math.abs(x - j) == 14) {
                    System.out.print(x + j);
                }
            }
        }
    }
//5. Digits

//Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers, and the sums of their digits.


    private static void posPairsWithNestedLoops4(int n) {
        for (int x = 1; x < n; x++) {
            for (int j = 0; j < n; j++) {
                System.out.println(x + "+" + j + " = " + (x + j));
            }
        }
    }
}





