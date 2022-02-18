public class Baby {
    String name = "DMX";
//    String name;
    boolean isMale;
    double weight = 5.0;
    double decibels;
    int numPoops = 0;
    Baby[] siblings;

    static int numBabiesMade = 0;
    Baby() {
        numBabiesMade += 1;
    }

    static void cry(Baby thebaby) {
        System.out.println(thebaby.name + " cries");
    }

    void cry() {
        System.out.println(name + " cries");
    }

    /* non-static method can reference static methods, but not the other way around. */
    void whoami() {
        System.out.println(name);
    }

/*    Baby(String myname, boolean maleBaby) {
        name = myname;
        isMale = maleBaby;

    }*/

    void sayHi() {
        System.out.println("Hi. My name is " + name);
    }

    void eat(double foodWeight) {
        if (foodWeight >= 0 && foodWeight < weight) {
            weight += foodWeight;
        }
    }

    void pop() {
        numPoops += 1;
        System.out.println("I have pooped.");
    }
}