// hw9_7,
class Cmath
{
   public static void power(int x,int n)
   {
      int sum=1;
      for(int i=1;i<=n;i++)
         sum*=x;
      System.out.println(x+"��"+n+"����="+sum);
   }
}

public class hw9_7
{
   public static void main(String args[])
   {
      Cmath.power(2,5);
      Cmath.power(3,2);
   }
}

/* output-------------
2��5����=32
3��2����=9
--------------------*/