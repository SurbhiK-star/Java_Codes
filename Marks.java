//java program on switch case....

class Marks
{
    public static void main(String args[])
    {
        int marks=10;
        switch(marks)
        {
            case 10,9,8:
            System.out.println("Perfect");break;

            case 7,6,5:
            System.out.println("Average");break;

            case 4,3,2,1:
            System.out.println("Poor");break;


        default:
           System.out.println("Invalid");


        }
    }
}
