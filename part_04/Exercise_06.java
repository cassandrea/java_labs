package part_04;

/**
 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100
 */

class Queue {

        int queue[];
        int queueIn, queueOut;

        Queue(int size) {
            queue = new int[101];
            queueIn = queueOut = 0;
        }
        void put(int number) {
            if (queueIn == queue.length) {
                System.out.println("- Queue is full.");
                return;
            }
            queue[queueIn++] = number;
        }
        int get () {
            if (queueOut == queueIn) {
                System.out.println("- Queue is empty.");
                return 0;
            }
            return queue[queueOut++];
        }
}
class everyOtherQueue {
    public static void main(String [] args) {
        Queue oneHundred = new Queue (101);
        int number, i, other =0;

        for (i=0; i<101; i++) {
            oneHundred.put(i);
        }
        for (i=0; i < 101;i++) {
            number = oneHundred.get();
            if (other%2 ==0) System.out.println(number);
            other++;
        }
    }
}


