/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas: Tabungan
 */
public class PBO2_10118078_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : "
                + tabungan.ambilUang(scanner.nextInt()));
    }
    
}
