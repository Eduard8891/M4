import java.util.Scanner;

public class Main
{
    public static void main(String[] args){

        sumDigits(12345);
        sumDigits(10);
        sumDigits(5059191);

        Container container = new Container();
        container.count += 7843;

    }

    public static Integer sumDigits(Integer number){
        String sLength = number.toString();
        Integer vLength = Integer.valueOf(sLength);
        int numParse = Integer.parseInt(sLength);
        int iLength = sLength.length();
        int sum = 0;
        for (int num = 0; num < iLength; num++) {
            char p = sLength.charAt(num);
            int intP = p - '0';
            sum = sum + intP;
        }
        System.out.println("Сумма чисел числа "+number+" равна "+sum);
        return 0;
    }
}
