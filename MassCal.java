import java.util.Scanner;
class MassCal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int num= sc.nextInt();

        switch (num)
        {
            case 1:
                System.out.println("How many numbers you want to add");
                int num1 =sc.nextInt();
                switch(num1)
                {
                    case 2:
                        System.out.println("Enter 2 numbers");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        int sum= a+b;
                        System.out.println("Sum of entered number is" + sum);
                    break;

                    case 3:
                        System.out.println("Enter 3 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        int c=sc.nextInt();
                        sum= a+b+c;
                        System.out.println("Sum of entered number is" + sum);
                    break;

                    case 4:
                        System.out.println("Enter 2 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        int d=sc.nextInt();
                        sum= a+b+c+d;
                        System.out.println("Sum of entered number is" + sum);
                    break;
                }
            break;

            case 2:
                System.out.println("How many numbers you want to subtract");
                num1 =sc.nextInt();
                switch(num1)
                {
                    case 2:
                        System.out.println("Enter 2 numbers");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        int sub= a-b;
                        System.out.println("Subtraction of entered number is" + sub);
                    break;

                    case 3:
                        System.out.println("Enter 3 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        int c=sc.nextInt();
                        sub= (a-b)-c;
                        System.out.println("Subtraction of entered number is" + sub);
                    break;

                    case 4:
                        System.out.println("Enter 2 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        int d=sc.nextInt();
                        sub= ((a-b)-c)-d;
                        System.out.println("Subtraction of entered number is" + sub);
                    break;
                }
            break;

            case 3:
                System.out.println("How many numbers you want to multiply");
                num1 =sc.nextInt();
                switch(num1)
                {
                    case 2:
                        System.out.println("Enter 2 numbers");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        int mul= a*b;
                        System.out.println("Multiplication of entered number is" + mul);
                    break;

                    case 3:
                        System.out.println("Enter 3 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        int c=sc.nextInt();
                        mul= (a*b)*c;
                        System.out.println("Multiplication of entered number is" + mul);
                    break;

                    case 4:
                        System.out.println("Enter 2 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        int d=sc.nextInt();
                        mul= (a*b)*(c*d);
                        System.out.println("Multiplication of entered number is" + mul);
                    break;
                }
            break;

            case 4:
                 System.out.println("How many numbers you want to Divide");
                num1 =sc.nextInt();
                switch(num1)
                {
                    case 2:
                        System.out.println("Enter 2 numbers");
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        if(a>=1 && b>=1)
                        {
                            int div= a/b;
                            System.out.println("Division of entered number is" + div);
                        }
                        else
                        {
                            System.out.println("Cant Divide the numbers");
                        }
                    break;

                    case 3:
                        System.out.println("Enter 3 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        int c=sc.nextInt();
                        if(a>=1 && b>=1 && c>=1)
                        {
                            int div= (a/b)/c;
                            System.out.println("Division of entered number is" + div);
                        }
                        else
                        {
                            System.out.println("Cant Divide the numbers");
                        }
                    break;

                    case 4:
                        System.out.println("Enter 4 numbers");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        int d=sc.nextInt();
                        if(a>=1 && b>=1 && c>=1 && d>=1)
                        {
                            double res1= a/b;
                            double res2= c/d;
                            if(res1>=1 && res2>=1){
                                double div = res1/res2;
                            System.out.println("Division of entered number is" + div);
                            }
                            else
                            {
                                System.out.println("Cant Divide the numbers");
                            }
                        }
                        else
                        {
                            System.out.println("Cant Divide the numbers");
                        }
                    break;
                }
            break;

            default:
            System.out.println("Enter valid Number");   
        }       
    }
}