package Practice;

public class OopConceptsNotes {

    //One object will be created (object) is the reference variable referencing to this object
    //Functions object = new Functions();
    //first
        //object.test();
    //second
        //System.out.println(object.testTwo());
    //third
       // System.out.println(object.qa());
        //System.out.println(object.multiply(10,10));
    //Methods
    // Main method do NOT have access because they are NOT STATIC
    //Object( like a bridge, to connect me to the methods)
    // Object ----> test()
    // Object ----> testTwo()
    // Object ---> qa()
    // Object ----> multiply()
//}

    //non static methods
    //void -- does not return any value
    //return type is void
    public void test() {
        System.out.println("test method");
    }

    //return type = int
    public int testTwo() {
        System.out.println();
        int a = 10; // example of instance variable. Within the method use ONLY
        int b = 20;
        int c = a + b;
        return c;
    }

    //return type is String
    private String qa() {
        System.out.println("qa method");
        String a = "learning to code";
        return a;
    }

    //return type is int
    //x,y --> input parameters/arguments
    public int multiply(int x, int y) {
        System.out.println("Multiplication Method");
        int total = x * y;
        return total;
    }


}
