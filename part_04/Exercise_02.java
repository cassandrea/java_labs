package part_04;

/**
 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.
 */

class Counting {
    public static void main(String [] args) {
        int years[] = new int[2018];
        int i;

        for (i = 1; i <= 2017; i++) {
            years[i] = i;
                    }

        for (i = 2018; i >= 1; i--) {
            if (!(i % 2 == 0)) System.out.println(years[i]);
        }
    }
}
