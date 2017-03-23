package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you must manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */
//class Class_01 {
//    public static void main(String[] args) {
//    Class_02 firstInstance = new Class_02;
//    Class_02 secondInstance = new Class_02;
//
//    String message = secondInstance.method_02(firstInstance, 20);
//    }
//    Class_02 method_01(Class_02 instance, int x) {
//
//        instance.setVar1(x*10);
//        instance.setVar2(x*20);
//        instance.setVar3(x*30);
//        instance.setVar4(x*40);
//        instance.setVar5(x*50);
//
//        return instance;
//    }
//
//    String method_02(Class_02 instance, int x) {
//        instance.setVar1(x*15);
//        instance.setVar2(x*25);
//        instance.setVar3(x*35);
//        instance.setVar4(x*45);
//        instance.setVar5(x*55);
//
//        return "done!";
//    }
//
//}
//class Class_02 {
//    private int var1, var2, var3, var4, var5;
//
//    public int getVar1() {
//        return var1;
//    }
//
//    public void setVar1(int var1) {
//        this.var1 = var1;
//    }
//
//    public int getVar2() {
//        return var2;
//    }
//
//    public void setVar2(int var2) {
//        this.var2 = var2;
//    }
//
//    public int getVar3() {
//        return var3;
//    }
//
//    public void setVar3(int var3) {
//        this.var3 = var3;
//    }
//
//    public int getVar4() {
//        return var4;
//    }
//
//    public void setVar4(int va4) {
//        this.var4 = va4;
//    }
//
//    public int getVar5() {
//        return var5;
//    }
//
//    public void setVar5(int var5) {
//        this.var5 = var5;
//    }
//}