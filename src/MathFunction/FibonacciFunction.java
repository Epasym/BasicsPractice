package MathFunction;

public class FibonacciFunction extends AbstractFunction{
    private float f0;
    private float f1;

    public FibonacciFunction(){
        f0 = 0f;
        f1 = 1f;
    }

    public FibonacciFunction(float f0, float f1){
        this.f0 = f0;
        this.f1 = f1;
    }

    @Override
    public float runFunction(float x) {
        float y = 0f;
        for(int i = 0; i < x; i++){
            y = f0 + f1;
            f0 = f1;
            f1 = y;
        }
        return y;
    }
}
