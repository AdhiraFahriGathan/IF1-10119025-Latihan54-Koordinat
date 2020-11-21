/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan54.koordinat;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Koordinat
 */

    /**
     * @param args the command line arguments
     */
   public class Main {

    public static void main(String[] args) {
        WarnaKoordinat oo = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna koordinat : " + oo.getNamaWarna());
        System.out.println("Koordinat sumbu x : " + oo.getX() + ", y : " + oo.getY());
        
        System.out.println();
        System.out.println("by. Adhira Fahri Gathan");
    }
    
}

