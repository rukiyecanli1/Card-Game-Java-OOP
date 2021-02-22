
package kartoyunu_prolab_proje2;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Futbolcu extends Sporcu {

    /* private ImageIcon messi = new ImageIcon("src\\kartoyunu_prolab2_proje2.Resimler\\Messi.jpg");
    private ImageIcon vanPersie = new ImageIcon("src\\kartoyunu_prolab2_proje2.Resimler\\VanPersie.jpg");
    private ImageIcon ronaldo = new ImageIcon("src\\kartoyunu_prolab2_proje2.Resimler\\Ronaldo.jpg");
    private String kaynak = "src\\kartoyunu_prolab2_proje2.Resimler\\Messi.png";
    private ImageIcon ikon = new ImageIcon(kaynak); */
  
    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;
    private boolean kartBilgisi=false;
    private String dosya1="src\\img\\messi.jpg";
    private String dosya2="src\\img\\ronaldo.jpg";
    private String dosya3="src\\kartoyunu_prolab2_proje2.Sporcular\\Ibrahimovic.jpeg";
    private String dosya4="src\\kartoyunu_prolab2_proje2.Sporcular\\Falcao.jpeg";
    private String dosya5="src\\kartoyunu_prolab2_proje2.Sporcular\\VanPersie.jpeg";
    private String dosya6="src\\kartoyunu_prolab2_proje2.Sporcular\\Ribery.jpeg";
    private String dosya7="src\\kartoyunu_prolab2_proje2.Sporcular\\Iniesta.jpeg";
    private String dosya8="src\\kartoyunu_prolab2_proje2.Sporcular\\Xavi.jpeg";
    
    
    //parametresiz constructor
    public Futbolcu() {
        super();
    }

    //parametreli constuctor
    public Futbolcu(String sporcuIsim, String sporcuTakim,int penalti,int serbestVurus,int kaleciKarsiKarsiya) {
        super(sporcuIsim,sporcuTakim);
        this.penalti=penalti;
        this.serbestVurus=serbestVurus;
        this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    }
    
    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }


    public String getDosya1() {
        return dosya1;
    }

    public void setDosya1(String dosya1) {
        this.dosya1 = dosya1;
    }

    public String getDosya2() {
        return dosya2;
    }

    public void setDosya2(String dosya2) {
        this.dosya2 = dosya2;
    }

    public String getDosya3() {
        return dosya3;
    }

    public void setDosyaYolu3(String dosya3) {
        this.dosya3 = dosya3;
    }

    public String getDosya4() {
        return dosya4;
    }

    public void setDosyaYolu4(String dosya4) {
        this.dosya4 = dosya4;
    }

    public String getDosya5() {
        return dosya5;
    }

    public void setDosya5(String dosya5) {
        this.dosya5 = dosya5;
    }

    public String getDosya6() {
        return dosya6;
    }

    public void setDosya6(String dosya6) {
        this.dosya6 = dosya6;
    }

    public String getDosya7() {
        return dosya7;
    }

    public void setDosyaYolu7(String dosya7) {
        this.dosya7 = dosya7;
    }

    public String getDosya8() {
        return dosya8;
    }

    public void setDosya8(String dosya8) {
        this.dosya8 = dosya8;
    }

    
    @Override
    public boolean kartKullanildiMi() {
        if (kartBilgisi == true) 
            return true;
        else
        return false;
    }

     @Override
    public void sporcuPuaniGöster() {
        System.out.println(this.penalti);
        System.out.println(this.serbestVurus);
        System.out.println(this.kaleciKarsiKarsiya);
    }
}
