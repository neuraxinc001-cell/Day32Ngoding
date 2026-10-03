import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        int s1 = angka1;
        s1++;
        System.out.println(angka1);
        System.out.println(s1);

        boolean lb = angka1 > angka2;
        boolean sd = (angka1 == angka2);

        System.out.println(lb);
        System.out.println(sd);

        boolean kp = (angka1 > 0) && (angka2 > 0);
        boolean sg = (angka1 % 2 == 0) || (angka2 % 2 == 0);

        System.out.println(kp);
        System.out.println(sg);

        input.close();
    }
}
