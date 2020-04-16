package app.StrategyPatternDemo;
public class VitGioi extends Duck {

    @Override
    public String Display(){
        return "Hello! Angle has fallen from sky is here! " + "\n" + performQuack() +  "\n" + performFly();
    }
}