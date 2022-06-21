import java.util.*;

public class Source {
    public static void main(String[] args) {
int a = 2;
int b =1;
int c = 2;
        System.out.println(expressionsMatter(a,b,c)==6);
    }
    public static int expressionsMatter(int a, int b, int c)    {
        List<Integer> temp = Arrays.asList(a + b + c, a * (b + c), (a + b) * c, a * b * c, a + b * c, a * b + c);
        return Collections.max(temp);
    }
}
