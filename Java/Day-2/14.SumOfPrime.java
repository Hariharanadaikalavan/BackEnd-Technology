class SumOfPrime
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int n,sum=0,i=1,j;
    System.out.println("Enter the sum of nth prime number");
    n=sc.nextInt();
    int t=n;
    while(n!=0)
    {
      int count=0;
      for(j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==2)
      {
        sum=sum+i;
        n--;
      }
      i++;
    }
    System.out.println("Sum of first "+t+" prime numbers is "+sum);
  }
}
