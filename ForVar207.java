import java.util.Scanner;

public class ForVar207 {
    public static void main(String[] args) {
        Scanner sc07= new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        for (; !berhenti;) {
            System.out.print("Masukkan bilangan: ");
            bil = sc07.nextInt();
            System.out.println("Bilangan yang anda masukkan: " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
         System.out.println("Progam berakhir");
    }
}