package app.StrategyPatternDemo;
public class FlyByWings implements IFlyBehavior{
    @Override
    public String Ifly(){
        return "I believe that i can fly!";
    }
}