import java.util.Scanner;

import static java.lang.Math.pow;

public class Narcissistic {
    //basamak sayısını sayan bir metod (Recursive)
    int countDigits(int number)
    {
        if (number == 0)
            return 0;
        return 1 + countDigits(number / 10);
    }
    //verilen sayının narcissistic olup olmadığını kontrol eden bir metod
    boolean isNarcissistic(int number)
    {
        int pwr = countDigits(number);
        int n = number;
        int sum = 0;
        while(n > 0)
        {
            //verilen sayının son rakamını bulur ve son basamağın gücünü hesaplar ve toplam sonucu sum değişkenine eklenir
            sum+= pow(n % 10, pwr);
            //verilen sayıdan son basamağı kaldırır
            n = n / 10;
        }
        //verilen sayı ile toplam sonucu eşitse true döndürür
        return (number == sum);
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = s.nextInt();

        Narcissistic n = new Narcissistic();
        if (n.isNarcissistic(number))
            System.out.println(number + " is a narcissistic number.");
        else
            System.out.println(number + " is not a narcissistic number.");
    }
}
