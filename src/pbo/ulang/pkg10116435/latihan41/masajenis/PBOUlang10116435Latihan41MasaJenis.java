/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan41.masajenis;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */

import java.util.Scanner;

public class PBOUlang10116435Latihan41MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Kubus kbs = new Kubus ();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kbs.setSisi(sc.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(sc.nextInt());
        
        System.out.println("\n"+"======Hasil Perhitungan======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
    }
    
}
