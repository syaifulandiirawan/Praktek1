/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author udin'
 */
public class Alat_Musik_GitarAksi {
    public static void main(String[] args) {
       Alat_Musik_Gitar  Akustik = new Alat_Musik_Gitar();
       Alat_Musik_Gitar  Elekstrik = new Alat_Musik_Gitar();
       Alat_Musik_Gitar  Bass = new Alat_Musik_Gitar();
       
       Akustik.Panjang="23 kotak";
       Akustik.Warna="Coklat";
       Akustik.Bentuk="Bulat";
       Akustik.Harga="Rp1.500.000";
       Akustik.Bunyi="Steel";
        
       Elekstrik.Panjang="24 Kotak";
       Elekstrik.Warna="Hitam";
       Elekstrik.Bentuk="Kotak Lonjong";
       Elekstrik.Harga="Rp7.000.000";
       Elekstrik.Bunyi="Distorsi";
        
       Bass.Panjang="22 Kotak";
       Bass.Warna="Coklat Tua";
       Bass.Bentuk="Body Besar";
       Bass.Harga="Rp1.000.000";
       Bass.Bunyi="Nada Rendah";
    }
    
}
