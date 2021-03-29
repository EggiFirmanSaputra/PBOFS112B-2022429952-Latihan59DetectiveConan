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
public class TokohPendukung extends TokohDetectiveConan {
    private String[] daftarTokoh = {"Ayumi Yoshida","Mitsuhiko Tsuburaya","Genta Kojima",
            "Ai Haibara","Sumiko Kobayashi","Sonoko Suzuki","Heiji Hattori","Kazuha Toyama"};

    public void daftarTokohPendukung() {
        System.out.println("\n==Daftar Tokoh Utama==");
        for (int i = 0; i < daftarTokoh.length; i++) {
            System.out.println(i+4 + ". " + daftarTokoh[i]);
        }
    }

}
