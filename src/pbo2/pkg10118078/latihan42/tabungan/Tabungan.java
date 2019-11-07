/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan42.tabungan;

/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas: Tabungan
 */
public class Tabungan {
    private final int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
