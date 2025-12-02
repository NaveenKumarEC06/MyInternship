package SwitchExpressions;

import java.util.*;

class SwitchExp3{

    public void print(Object b)
    {
        String result=switch (b){
            case Integer i ->
            {
                yield switch (i) {
                    case Integer k when k==0 -> "Zero";
                    case Integer k when k>0 -> "Positive Integer : "+k;
                    default -> "Negative Integer : " +i;
                };
            }
            case String s -> {
                yield switch(s){
                    case String str when str.length() >=5 -> "Long String :"+str;
                    default -> "Short String :"+s;
                };
            }
            case Double d -> "Double Value :" + d;
            case null -> "Null Value";
            default -> "Unknown Type";
        };
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        SwitchExp3 m=new SwitchExp3();
        Scanner sc=new Scanner(System.in);

        m.print('k');
    }
}
