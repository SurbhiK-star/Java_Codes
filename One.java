class One
{
    public static void main(String args[])
    {
        int a=2;
        int b=3;
        System.out.println("Before Swapping:");
        System.out.println("The value of a=" +a+ " & the value of b=" +b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println("The value of a=" +a+ " & the value of b=" +b);
    }
}