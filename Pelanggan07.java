import java.util.Scanner;
public class Pelanggan07 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String nama;
        char jawab;
        int jumlah =0;

        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc.nextLine();
            jumlah++;
            System.out.print("Apakah anda ingin memasukkan nama pelanggan baru (Y/T)? ");
            jawab = sc.nextLine() .charAt(0);
        }while (jawab == 'y' || jawab == 'Y');
        System.out.println("Jumlah pelanggan yang Anda masukkan = "+ jumlah);
    }
}
