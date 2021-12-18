import java.util.Scanner;
class DivideBy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double num;
        System.out.println("Enter number");
        num= sc.nextInt();
        double rem15=num%15;
        double rem11=num%11;
        double rem5=num%5;

        switch ((int)rem15)
        {
            case 0:
                System.out.println("Number is divisible by 15");
                break;
            default:
                System.out.println("Number is not divisible by 15");
        }

        switch ((int)rem11)
        {
            case 0:
                System.out.println("Number is divisible by 11");
                break;
            default:
                System.out.println("Number is not divisible by 11");
        }

        switch ((int)rem5)
        {
            case 0:
                System.out.println("Number is divisible by 5");
                break;
            default:
                System.out.println("Number is not divisible by 5");
        }
    }
}