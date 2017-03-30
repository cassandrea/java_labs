package part_08;

class Stack {
    private int[] s; // this array holds the Stack
    private int index; // the top of the stack index

    // Construct an empty Stack given its size.
    Stack(int size) {
        s = new int[size]; // allocate memory for Stack
        index = 0;
    }
    //Construct a stack from a stack
    Stack (Stack ob) {
        index = ob.index;
        s = new int[ob.s.length];
        //copy elements
        for (int i = 0; i < index; i++)
            s[i] = ob.s[i];
    }
    // Construct a stack with initial values
    Stack(int a[]) {
        s = new int[a.length];

        for (int i = 0; i < a.length; i++){
            try {
                push(a[i]);
            }catch(StackFullException exc) {
                System.out.println(exc);
            }
        }
    }
    // Push numbers into the Stack
    void push(int numbers)
        throws StackFullException{
        if(index==s.length) {
            throw new StackFullException(s.length);
            }
        s[index] = numbers;
        index++;
    }
    // Pop a string from the Stack
    int pop()
        throws StackEmptyException{
        if(index == 0) {
           throw new StackEmptyException();
        }
        index--;
        return s[index];
    }
}
class StackDemo {
    public static void main(String args[])
            throws StackFullException, StackEmptyException{
        //construct 10-element empty stack
        Stack s1 = new Stack(10);

        int numbers[] = {8,6,7,5,3,0,9};

        //construct stack from array
        Stack s2 = new Stack(numbers);

        int number;
        int i;

        //put numbers into s1
        for (i=0; i< 10; i++)
            s1.push(i);
        //construct stack from another stack
        Stack s3 = new Stack(s1);
        //show the stacks
        System.out.print("Contents of s1: ");
        for (i=0; i<10; i++){
            number = s1.pop();
            System.out.print(number);
        }
        System.out.println("\n");
        System.out.println("Contents of s2: ");
        for (i=0; i<7; i++){
            number = s2.pop();
            System.out.print(number);
        }
        System.out.println("\n");
        System.out.println("Contents of s3: ");
        for (i=0; i<10; i++){
            number = s3.pop();
            System.out.print(number);
        }
    }
}
class StackFullException extends Exception {
    private int size;
    StackFullException(int size){
        this.size = size;
    }
    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }
}
class StackEmptyException extends Exception {
    public String toString() {
        return "\nStack is empty.";
    }
}
