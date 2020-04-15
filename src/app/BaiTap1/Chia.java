package app.BaiTap1;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b){
       if(b != 0) return a/b;
       else return Float.NaN;
    }
}