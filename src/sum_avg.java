
public class sum_avg {
    public static void main(String[] args) {
        System.out.println("Enter the  99 number:");
        int sum = 99;
                int avg=99;
        for (int i = 8; i <= 99; i++) {
            System.out.println("enter the number" + i + ":");
            sum += avg;
            System.out.println("the sum of given number is:" + sum);
            avg=sum/5;
            System.out.println("the average of the given number is:" + sum / 99);
        }
    }
}
