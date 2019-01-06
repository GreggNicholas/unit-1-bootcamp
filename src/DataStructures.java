public class DataStructures {

    public static void main(String args[]) {
        ArrayList<String> myCats;
        myCats = new ArrayList<String>();
        myCats.add("Garfield");
        myCats.add("Pink Panther");
        myCats.add("Catwoman");
        myCats.add("Maru");
        myCats.add("Smelly Cat");

        for (int x = 0; x <= myCats.size(); x++)
            System.out.println(myCats.get(x));


        //1. Create a HashMap that maps the names of all the Pursuit Fellows in your last group HW project to their age.
        //2. Use a loop to print each key-value pair of the HashMap.

        HashMap<String, Integer> pursuit;
        pursuit = new HashMap<>();
        pursuit.put("Marly", 23);
        pursuit.put("Khaing", 28);
        pursuit.put("Chelsea", 22);
        pursuit.put("Gregg", 30);

        for (Map.Entry<String, Integer> entry : pursuit.entrySet()) {
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println("Fellow: " + k + "\nAge: " + v);
        }
    }


    //Write a method called `mostFrequentElement` that takes an ArrayList of Integers and finds the most frequently occurring element in the ArrayList. At the end print the element and its number of occurrences. If there is more than one such element, any one of them may be printed.
    public void mostFrequentElement(Map<Integer, Integer> map;
            map=new HashMap<>();
        for(
    int i = 0; i<numbersArrayList.size();i++)

    {
        int key = numbersArrayList.get(i);
        if (map.containsKey(key)) {
            int frequency = map.get(key);
            frequency++;
            map.put(key, frequency);
        } else {
            map.put(key, 1);
        }
    }

    // Given an array of strings and an integer, write a method that return a an ArrayList where all the strings of the given length are omitted.

//Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element), and prints out the words in alphabetical order.
}
