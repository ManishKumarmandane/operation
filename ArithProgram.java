package A.operation;

public class ArithProgram
{
    public static void main(String[] args)
    {
        int a = 50;
        int b = 40,c;
        float d = 4;
        float e;

        int z=60;
        System.out.println("a=" +a + "\n" +"b=" +b);
        c=a+b;
        System.out.println("sum:"  +c);
        c=a*b;
        System.out.println("mul: "+c);
        c=a-b;
        System.out.println("sub="+c);
        e = a/d;
        System.out.println("div="+e);
        System.out.println("a="+a);
        a++;
        System.out.println("a++="+a);

        System.out.println("z="+z);
        System.out.println("++z="+z);
        ++z;
        System.out.println("z="+z);
        int x=8;
        System.out.println("x="+x);
        x--;
        System.out.println(x);
        int y=6;
        System.out.println("y="+y);
        y--;
        System.out.println("y--="+y);
        --y;

        System.out.println("--y="+y);



    }
}
