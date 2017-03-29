package part_08;

import java.util.Scanner;

class Stack {
    private String[] s; // this array holds the Stack
    private int index; // the push and pop index
    private int exceptionFlag;

    // Construct an empty Stack given its size.
    Stack(int size) {
        s = new String[size]; // allocate memory for Stack
        index = 0;
    }
    // Create a new stack from user input
    public static Stack newStack() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names should the stack hold?");
        int size = input.nextInt();
        Stack s1 = new Stack(size);
        return s1;
    }
    // Push a string into the Stack
    String push(String words)
        throws StackFullException{
        if(index==s.length) {
            exceptionFlag = -1;
            throw new StackFullException(s.length);
            }
        s[index] = words;
        index++;
        return "added";
    }
    // Pop a string from the Stack
    String pop()
        throws StackEmptyException{
        if(index < 0) {
            exceptionFlag = -1;
            throw new StackEmptyException();
        }
            int popIndex = index-1;
        index--;
        return s[popIndex];
    }
    // Add strings from the user to a stack
    void addWords(Stack stack)
            throws StackFullException{
        Scanner input = new Scanner(System.in);
        System.out.println("How many names would you like to add to the stack now?");
        int numberNew = input.nextInt();
        int i = 0;
        System.out.println("Type each name, pressing enter between each one.");
        while (i < numberNew){
            Scanner input2 = new Scanner(System.in);
            String words = input2.next();
            stack.push(words);
            if (exceptionFlag == -1) break;
            i++;
        }
    }
    //Remove user-defined number of strings from the stack
    void removeWords(Stack stack)
            throws StackEmptyException{
        Scanner input = new Scanner(System.in);
        System.out.println("How many names would you like to remove from the stack now?");
        int numberRemove = input.nextInt();
        int i = 0;
        while (i < numberRemove) {
            System.out.println(stack.pop());
            if (exceptionFlag == -1) break;
            i++;
        }
    }
    //get user input to determine next step
    static int whatNow() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do now?\n" +
                "1. Add more names\n" +
                "2. Remove more names\n" +
                "3. Quit");
        int next = input.nextInt();
        return next;
    }
    //repeat process until quit

}
class StackDemo {
    public static void main(String args[])
            throws StackFullException, StackEmptyException{
        System.out.println("Let's create a stack of names!");
        // construct empty Stack with user defined length
        Stack s1 = Stack.newStack();
        //add strings to that stack
        s1.addWords(s1);
        //remove strings from the stack
        s1.removeWords(s1);

        for (;;) {
            int next = Stack.whatNow();
            if (next == 1) s1.addWords(s1);
            else if (next == 2) s1.removeWords(s1);
            else break;
        }
    }
}
class StackFullException extends Exception {
    int size;
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
