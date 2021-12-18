import java.util.Scanner;
class NestedSwitch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Year of Studing");
        int year = sc.nextInt();

        switch (year)
        {
            case 1:
                System.out.println("You are not applicable");
                break;

            case 2:
                System.out.println("You are not applicable");
                break;
            
            case 3:
                System.out.println("Enter your Gender");
                String g = sc.next().toLowerCase();
                char gender=g.charAt(0);

                switch (gender)
                {
                    case 'f':
                        System.out.println("You are applicable");
                        break;

                    default:
                        System.out.println("You are not applicable");
                }
                break;
            
            case 4:
                System.out.println("You are not applicable");
                break;

            default:
                System.out.println("Enter properly");
        }
    }
}