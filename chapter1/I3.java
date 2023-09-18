package chapter1;
import java.util.Random;

public interface I3
{
    private int getNumber() { return (new Random()).nextInt(100); }
    default String M1(String s) {
        return s+ getNumber();
    }
}

class C4 implements I3
{
}

class TestI3
{
    public static void main(String[] args)
    {
        I3 objC4 = new C4();
        System.out.println(objC4.M1("Hello"));
    }
}
