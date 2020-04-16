package app.StrategyPatternDemo;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck(){

    }

    public void setflyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setquackBehavior(IQuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public String performQuack(){
        return quackBehavior.Iquack();
    }
    public String performFly(){
        return flyBehavior.Ifly();
    }

    public String swim(){
        return "This ducky can swim!";
    }

    public abstract String Display();
}