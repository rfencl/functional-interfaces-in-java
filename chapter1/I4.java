package chapter1;

public interface I4
{
    private static String getPrefix(String p) {
        return p.equals("male")? "Mr. " : "Ms. ";
    }
    public static String getName(String n, String p) {
        return getPrefix(p) + n;
    }

}

class TestI4
{
    public static void main(String[] args)
    {
        System.out.println(I4.getName("Smith", "female"));
        System.out.println(I4.getName("Jones", "male"));
    }
}
