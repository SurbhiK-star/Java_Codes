//another java program for the concept of switch....

class Marks
{
    public static void main(String args[])
    {
        int marks=10;
        switch(marks)
        {
            case 10:
            case 9:
            case 8:
            System.out.println("Perfect");break;

            case 7:
            case 6:
            case 5:
            System.out.println("Average");break;

            case 4:
            case 3:
            case 2:
            case 1:
            System.out.println("Poor");break;

            default:
            System.out.println("Invalid");


        }
    }
}
