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
public class AyumiYoshida extends TokohUtama {

    public AyumiYoshida() {
        this.nama  = "Ayumi Yoshida";
        this.sifat = "Baik hati dan murah senyum";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah teman Conan yang ceria dan selalu menggunakan kata " +
                "\nyang membuat suasana tenang. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : - ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : - ");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
