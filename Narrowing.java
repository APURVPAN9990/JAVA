class Narrowing
{
    public static void main(String args[])
    {
        double d = 200.6;
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double Data Type value" +d);
        System.out.println("Long Data Type value" +l);
        System.out.println("Int Data Type value" +i);
    }
}