import MathFunction.AXFunction;
import MathFunction.FibonacciFunction;
import MathFunction.IFunction;
import MathFunction.LogarithmicFunction;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        IFunction[] functions = InitFunctions();
        float[] results = RunFunctions(functions);
        PrintResults(results);
    }

    public static IFunction[] InitFunctions(){
        IFunction[] functions = new IFunction[3];
        functions[0] = new AXFunction(5);
        functions[1] = new FibonacciFunction(0, 1);
        functions[2] = new LogarithmicFunction();
        return functions;
    }

    public static float[] RunFunctions(IFunction[] functions){
        float[] results = new float[functions.length];
        Random rand = new Random();

        for(int i = 0; i < functions.length; i++){
            results[i] = functions[i].runFunction(rand.nextFloat(3, 8));
        }

        return results;
    }

    public static void PrintResults(float[] results){
        for(int i = 0; i < results.length; i++){
            System.out.printf("Function %d result: %.2f\n", i, results[i]);
        }
    }
}
