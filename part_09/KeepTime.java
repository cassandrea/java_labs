package part_09;

class KeepTime {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if(!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        //wait 1/2 second
        try{
            Thread.sleep(500);
        }catch (InterruptedException exc) {
            System.out.println("Thread Interrupted");
        }
        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run
        try {
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { // stop the clock
            state = "tocked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.println("Tock");

        //wait 1/2 second
        try{
            Thread.sleep(500);
        }catch (InterruptedException exc) {
            System.out.println("Thread Interrupted");
        }

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread8 implements Runnable {
    Thread thrd;
    KeepTime ttOb;

    // Construct a new thread.
    MyThread8(String name, KeepTime tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
        KeepTime tt = new KeepTime();
        MyThread8 mt1 = new MyThread8("Tick", tt);
        MyThread8 mt2 = new MyThread8("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}