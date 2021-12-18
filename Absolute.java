import java.util.Scanner;
class Absolute
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<0)
        {
            num = num * (-1);
            System.out.println(num);
        }
        else
        {
            System.out.println(num);
        }
    }
}