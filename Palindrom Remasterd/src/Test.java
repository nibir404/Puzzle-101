import java.util.Scanner;
public class Test {
    public void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,temp;
        int sum1 = 0;
        int rem = 0;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        temp = num;
        while (num > 0){
            rem = num%10;
            sum=(sum*10)+rem;
            sum1 = sum1+rem;
            num = num/10;
        }
        if (temp == sum){
            System.out.println("Palindrome Number");
            System.out.println("Sum of the palindrome is : "+sum1);
            Test t1 = new Test();
            t1.convertBinary(sum1);
            
        }
        else System.out.println("not palindrome");

    }
}
