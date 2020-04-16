package app.StrategyPatternDemo;
public class MallarDuck extends Duck {
    public MallarDuck(){

    }
    @Override
    public String Display(){
        return "Hello! Greenduck is here! " + "\n" + performQuack() +  "\n" + performFly();
    }
}