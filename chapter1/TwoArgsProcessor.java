package chapter1;

import java.util.function.BiFunction;

@FunctionalInterface
public interface TwoArgsProcessor<X> {
    X process(X arg1, X arg2);
}

class TestTwoArgsProcessor {
    public static void main(String[] args)
    {
        TwoArgsProcessor<Integer> multiplyInts 
            = new TwoArgsProcessor<>() {
                @Override 
                public Integer process(Integer arg1, Integer arg2)
                {
                    return arg1 * arg2;
                }
            };

        BiFunction<Integer, Integer, Integer> multiplyIntsb = (a, b) -> a*b;

        TwoArgsProcessor<Double> addDoubles 
            = new TwoArgsProcessor<>() {
                @Override 
                public Double process(Double arg1, Double arg2)
                {
                    return arg1 + arg2;
                }
            };

        BiFunction<Double, Double, Double> addDoublesb = (a, b) -> a+b;

        TwoArgsProcessor<String> compareStrings
            = new TwoArgsProcessor<>() {
                @Override 
                public String process(String arg1, String arg2)
                {
                    return arg1.compareTo(arg2) > 0? arg1: arg2;
                }
            };
        BiFunction<String, String, String> compareStringsb = (a, b) -> { return a.compareTo(b) > 0?a:b;};

        System.out.println(multiplyInts.process(2,3));
        System.out.println(multiplyIntsb.apply(2, 3));
        System.out.println(addDoubles.process(4.1,5.2));
        System.out.println(addDoublesb.apply(4.1,5.2));
        System.out.println(compareStrings.process("ace","age"));
        System.out.println(compareStringsb.apply("ace","age"));
    }
}
