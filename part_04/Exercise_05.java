package part_04;

/**
 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.
 */
class enhancedLoop {
    public static void main(String [] args) {
        int array[] = new int[7];
        int populate = 1, print = 0;

        for (int x = 0; x < array.length; x++) {
            array[x] = populate;
            populate++;
        }
        for (int y : array) {
            System.out.println("Index " + print + " :" + y);
            print ++;
        }
    }
}