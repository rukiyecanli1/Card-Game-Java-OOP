package kartoyunu_prolab_proje2;

public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    static int kontrol = 0;
    boolean kartBilgisi = false;

    //parametresiz constructor
    public Basketbolcu() {
    }

    //parametreli constuctor
    public Basketbolcu(String sporcuIsim,String sporcuTakim,int ikilik,int ucluk,int serbestAtis) {
        //üst sınıftan constructor çağırma ve değişken atama
        super(sporcuIsim, sporcuTakim);
        //"Messi","Barcelona"
        this.ikilik=ikilik;
        this.ucluk=ucluk;
        this.serbestAtis=serbestAtis;
    }

  
    
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    String dosya = "src\\Resimler\\Pikachu.jpg";

    public String getDosya(String dosya) {
        return dosya;
    }

    @Override
    public void sporcuPuaniGöster() {
        System.out.println(this.ikilik);
        System.out.println(this.ucluk);
        System.out.println(this.serbestAtis);
    }

    
    
       @Override
    public boolean kartKullanildiMi() {
        if (kartBilgisi == true) // Gelen değerle dizi de eşleşen değer var mı kontrol ediyoruz
            return true;
        else
        return false;
    }
}
