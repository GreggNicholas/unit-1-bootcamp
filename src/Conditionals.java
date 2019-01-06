
public class Conditionals {

    public static void main(String args[]) {


    }
// 1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.

    public int isOdd(int n) {
        if (n % 2 == 0)
            return true;
    }

    //2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
    public int isMultioleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    //3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.
    public int isOddAndIsMultipleOfThree(int n) {
        if (n % 2 != 0 && n % 3 == 0) {
            return true;
        }
        return false;
    }

    //4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.
    public int isOddAndIsMultipleOfThree2(int n) {
        if (isOdd(n) && isMultipleOfThree(n)) {
            return true;
        }
    }

    //5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
    public int fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean fromLondon() {
        if (Person.getCity().equals("London")) {
            return true;
        }
        return false:
    }

    private static void nameLongerThan5Characters(Person person) {
        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }


}

