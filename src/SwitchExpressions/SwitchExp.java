package SwitchExpressions;

class SwitchExp
{
    public static void print(Object obj)
    {
        int result=9;
        switch (obj) {
            case Integer i -> {
                result=2;
                result++; }
            case String s -> {
                result=3;
                result++;
            }
            case null -> result=2;
            default -> result=0;
        };
        System.out.println(result);
    }
    public static void main(String args[])
    {
        SwitchExp ob=new SwitchExp();
        ob.print("Gdenfjn");
    }
}