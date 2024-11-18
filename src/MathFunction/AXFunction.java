package MathFunction;

public class AXFunction extends AbstractFunction{

    private float a;

    public AXFunction(){
        a = 2f;
    }

    public AXFunction(float a){
        this.a = a;
    }

    @Override
    public float runFunction(float x) {
        return a*x;
    }
}
