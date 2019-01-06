
public class ClassesAndObjects {

    public static void main(String args[]) {

        Cat garfield = new Cat("Garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(10);
        garfield.setOwner(Gregg);

        Cat pinkPanther = new Cat("Pink Panther");
        pinkPanther.setFavoriteFood("Pizza");
        pinkPanther.setAge(33);
        pinkPanther.setOwner(Bob);

        Cat catwoman = new Cat("Catwoman");
        catwoman.setFavoriteFood("Batman's tears");
        catwoman.setAge(28);


        System.out.println(isOlder(garfield, catwoman));
        System.out.println(makeKitten(garfield, pinkPanther));
        adoption(garfield, gregg);
        System.out.println(isFree(catwoman));
        System.out.println(isSibling(garfield, pinkPanther));
    }

    public static boolean isOlder(Cat cat1, Cat cat2) {
        int cat1 = cat1.getAge();
        int cat2 = cat2.getAge();
        if (cat1 > cat2) {
            return true;
        }
        return false;
    }

    public static void makeBestFriends(Cat cat1, Cat cat2) {
        String favFood = "Anchovies";
        cat1.favoriteFood(favFood);
        cat2.favoriteFood(favFood);
    }

    public static String makeKitten(Cat cat1, Cat cat2) {
        Cat newCat = new Cat();
        newCat.setName(cat1.getName() + cat2.getName());
        newCat.setAge(0);
        String kittenNameAndAge = newCat.getName() + newCat.getAge();
        return kittenNameAndAge;
    }

    public static void adoption(Cat cat1, Person person1) {
        if (cat1.getName().equals("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            cat1.setOwner(person1);
            System.out.println(person1.getName() + " is now the proud owner of " + cat1.getName());
        }
    }

    public static boolean isFree(Cat catName) {
        if (catName.getOwner() != null) {
            return true;
        }
        return false;
    }

    public static boolean isSibling(Cat cat1, Cat cat2) {
        if (cat1.getOwner().equals(cat2.getOwner())) {
            return true;
        }
        return false;
    }
}