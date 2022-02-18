public class BabyFactory {

    public static void main(String[] args) {
/*
        Baby shiloh = new Baby("Shiloh", true);
        Baby shiloh2 = new Baby("Shiloh2", true);
        Baby Know = new Baby("Know", true);

        System.out.println(shiloh.name);
        System.out.println(shiloh.numPoops);
        shiloh.sayHi();
        shiloh.eat(1);
        System.out.println(shiloh == shiloh2);
*/

        Baby.numBabiesMade = 100;
        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby.numBabiesMade = 2000;
        System.out.println(b1.numBabiesMade);
        System.out.println(b2.numBabiesMade);

        b1.cry(new Baby());

    }

}
