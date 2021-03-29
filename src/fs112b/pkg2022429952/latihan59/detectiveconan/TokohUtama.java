/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs112b.pkg2022429952.latihan59.detectiveconan;

/**
 *
 * @author Eggi Firman S
 */
public class TokohUtama extends TokohDetectiveConan {
    private String[] daftarTokoh = {"Shinichi Kudo","Ran Mouri","Kogoro Mouri"};

    public void daftarTokohUtama() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+1 + ". " + daftarTokoh[i]);
        }
    }

}
