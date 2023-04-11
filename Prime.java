//Java Program to identify the Prime Number....

class Prime {
    public static void main(String args[])
    {
        int num=4;boolean flag=true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=false;break;
            }
        }
        if(flag==true)
        {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not prime");
        }
    }
}
