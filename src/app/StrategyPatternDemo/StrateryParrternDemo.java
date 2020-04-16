package app.StrategyPatternDemo;
public class StrateryParrternDemo {
    public static void main(String[] args) {
        Duck duck1 = new VitGioi();
        duck1.setquackBehavior(new SQuack());
        duck1.setflyBehavior(new FlyByWings());
        System.out.println(duck1.Display());

        Duck duck2 = new VitQuay();
        duck2.setquackBehavior(new SQuack());
        duck2.setflyBehavior(new FlyByWings());
        System.out.println(duck2.Display());
    }
}