
package kartoyunu_prolab_proje2;


import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 *
 */
public class Test extends JFrame {

    
    Futbolcu f=new Futbolcu();
    Bilgisayar bs=new Bilgisayar();
    public static void main(String[] args) {
        Pencere pnn = new Pencere();
        pnn.setVisible(true);

        Futbolcu messi = new Futbolcu("Messi", "Barcelona", 90, 90, 85);
        Futbolcu ronaldo = new Futbolcu("Ronaldo", "Real Madrid", 85, 90, 80);
        Futbolcu xavi = new Futbolcu("Xavi", "", 80, 70, 60);
        Futbolcu ibrahimovic = new Futbolcu("Ibrahimovic", "", 75, 60, 80);
        Futbolcu iniesta = new Futbolcu("Iniesta", "", 70, 50, 65);
        Futbolcu falcao = new Futbolcu("Falcao", "", 65, 85, 80);
        Futbolcu ribery = new Futbolcu("Ribery", "", 65, 75, 75);
        Futbolcu vanPersie = new Futbolcu("VanPersie", "F", 55, 45, 65);
        Basketbolcu lebron = new Basketbolcu("Lebron", "", 70, 50, 55);
        Basketbolcu micheal = new Basketbolcu("Micheal", "", 80, 85, 85);
        Basketbolcu magic = new Basketbolcu("Magic", "", 65, 85, 75);
        Basketbolcu kareem = new Basketbolcu("Kareem", "", 70, 80, 90);
        Basketbolcu kobe = new Basketbolcu("Kobe", "", 80, 85, 80);
        Basketbolcu shaquille = new Basketbolcu("Shaquille", "", 70, 75, 70);
        Basketbolcu bill = new Basketbolcu("Bill", "", 65, 70, 60);
        Basketbolcu wilt = new Basketbolcu("Wilt", "", 55, 60, 70);

        ArrayList<Futbolcu> futKartListesi = new ArrayList<>();
        futKartListesi.add(messi);
        futKartListesi.add(ronaldo);
        futKartListesi.add(xavi);
        futKartListesi.add(ibrahimovic);
        futKartListesi.add(iniesta);
        futKartListesi.add(falcao);
        futKartListesi.add(ribery);
        futKartListesi.add(vanPersie);

        ArrayList<Basketbolcu> basKartListesi = new ArrayList<>();
        basKartListesi.add(lebron);
        basKartListesi.add(micheal);
        basKartListesi.add(magic);
        basKartListesi.add(kareem);
        basKartListesi.add(kobe);
        basKartListesi.add(shaquille);
        basKartListesi.add(bill);
        basKartListesi.add(wilt);

        Collections.shuffle(futKartListesi);
        Collections.shuffle(basKartListesi);

        ArrayList<Futbolcu> bilgisayarKart = new ArrayList<>();
        ArrayList<Basketbolcu> bilgisayarKart2 = new ArrayList<>();
        ArrayList<Futbolcu> kullaniciKart = new ArrayList<>();
        ArrayList<Basketbolcu> kullaniciKart2 = new ArrayList<>();

        for (int i = 0; i < futKartListesi.size(); i++) {
            if (i < (futKartListesi.size()) / 2) {
                bilgisayarKart.add(futKartListesi.get(i));
                bilgisayarKart2.add(basKartListesi.get(i));
                //  bilgisayarKart2 = basKartListesi; xxx

            } else {
                kullaniciKart.add(futKartListesi.get(i));
                kullaniciKart2.add(basKartListesi.get(i));
                // kullaniciKart2 = basKartListesi; xxx
            }
        }

        System.out.print("Bilgisayarın elindeki futbolcular: ");
        for (int i = 0; i < futKartListesi.size() / 2; i++) {
            System.out.print(bilgisayarKart.get(i).getSporcuIsim() + " ");
        }
        System.out.println();

        System.out.print("Kullanicinin elindeki futbolcular: ");
        for (int i = 0; i < futKartListesi.size() / 2; i++) {
            System.out.print(kullaniciKart.get(i).getSporcuIsim() + " ");
        }
        System.out.println();

        System.out.print("Bilgisayarın elindeki basketbolcular: ");
        for (int i = 0; i < futKartListesi.size() / 2; i++) {
            System.out.print(bilgisayarKart2.get(i).getSporcuIsim() + " ");
        }
        System.out.println();

        System.out.print("Kullanicinin elindeki basketbolcular: ");
        for (int i = 0; i < futKartListesi.size() / 2; i++) {
            System.out.print(kullaniciKart2.get(i).getSporcuIsim() + " ");
        }
        System.out.println("\n");

        Bilgisayar bs = new Bilgisayar("Bilgisayar", 0);
        Kullanici kc = new Kullanici("Kullanici", 0);
        

        futbolcuKarsilastir(bs, kc, bilgisayarKart, kullaniciKart, bilgisayarKart2, kullaniciKart2);

    }

    public static void futbolcuKarsilastir(Bilgisayar bs, Kullanici kc, ArrayList<Futbolcu> bsKart, ArrayList<Futbolcu> kcKart,
            ArrayList<Basketbolcu> bsKart2, ArrayList<Basketbolcu> kcKart2) {

        Futbolcu secilen = bs.fKartSec(bsKart);
        System.out.println("\nSecilen Kart: "+secilen.getSporcuIsim()+" "+secilen.getPenalti()+", "+
          secilen.getSerbestVurus()+", "+secilen.getKaleciKarsiKarsiya());
        Futbolcu sectigin = kc.fKartSec(kcKart);
         System.out.println("Sectiginiz Kart: "+sectigin.getSporcuIsim()+" "+sectigin.getPenalti()+", "+
          sectigin.getSerbestVurus()+", "+sectigin.getKaleciKarsiKarsiya());
        String pozisyon = PozisyonBilgisiAl("futbolcu");
        System.out.println("Pozisyon bilgisi: " + pozisyon);
        switch (pozisyon) {
            case ("Penalti"):
                if (secilen.getPenalti() > sectigin.getPenalti()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (f)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getPenalti() < sectigin.getPenalti()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (f)");
                    kc.setSkor( kc.getSkor()+ 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getPenalti() == sectigin.getPenalti()) {
                    System.out.println("bilgisayar kart = kullanıcı kart (f)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                }
                break;
            case ("Serbest vurus"):
                if (secilen.getSerbestVurus() > sectigin.getSerbestVurus()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (f)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getSerbestVurus() < sectigin.getSerbestVurus()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (f)");
                    kc.setSkor(kc.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor()); 
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if ((secilen.getSerbestVurus() == sectigin.getSerbestVurus())) {
                    System.out.println("bilgisayar kart = kullanıcı kart (f)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("Bilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                }
                break;
            case ("Kaleci karsi karsiya"):
                if (secilen.getKaleciKarsiKarsiya() > sectigin.getKaleciKarsiKarsiya()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (f)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getKaleciKarsiKarsiya() < sectigin.getKaleciKarsiKarsiya()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (f)");
                    kc.setSkor(kc.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }

                } else if (secilen.getKaleciKarsiKarsiya() == sectigin.getKaleciKarsiKarsiya()) {
                    System.out.println("bilgisayar kart = kullanıcı kart (f)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki futbolcular: ");
                    ListeyiYaz(bsKart);
                    System.out.print("\nKullanicinin elindeki futbolcular: ");
                    ListeyiYaz(kcKart);
                    System.out.println("\n");
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                     if (!(bsKart2.isEmpty())) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                  /*  if (!(bsKart2.isEmpty()) && bsKart2.size() != 1) {
                        basketbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                        
                    } else {
                        futbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }*/
                }
                break;

        }
    }
    String pozisyon;

    public static void basketbolcuKarsilastir(Bilgisayar bs, Kullanici kc, ArrayList<Basketbolcu> bsKart, ArrayList<Basketbolcu> kcKart,
            ArrayList<Futbolcu> bsKart2, ArrayList<Futbolcu> kcKart2) {

        int sayacIkilik = 0, sayacUcluk2 = 0, sayacSerbestAtis = 0;
        String pozisyon;
        Basketbolcu secilen = bs.bKartSec(bsKart);
         System.out.println("\nSecilen Kart: "+secilen.getSporcuIsim()+" "+secilen.getIkilik()+", "+
         secilen.getUcluk()+", "+secilen.getSerbestAtis());
        Basketbolcu sectigin = kc.bKartSec(kcKart);
          System.out.println("Sectiginiz Kart: "+sectigin.getSporcuIsim()+" "+sectigin.getIkilik()+", "+
          sectigin.getUcluk()+", "+sectigin.getSerbestAtis());
          pozisyon = PozisyonBilgisiAl("basketbolcu");
          System.out.println("Pozisyon: " + pozisyon);
        /*  if((secilen.getIkilik()==sectigin.getIkilik() || secilen.getUcluk()==sectigin.getUcluk() || secilen.getSerbestAtis()==secilen.getSerbestAtis())
         && bsKart2.isEmpty() && bsKart.size()==1){
         pozisyon=
         }*/
        switch (pozisyon) {
            case ("Ikilik"):
                if (secilen.getIkilik() > sectigin.getIkilik()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (b)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getIkilik() < sectigin.getIkilik()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (b)");
                    kc.setSkor(kc.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getIkilik() == sectigin.getIkilik()) {
                    System.out.println("bilgisayar kart = kullanıcı kart (b)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                     if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                }
                break;
            case ("Ucluk"):
                if (secilen.getUcluk() > sectigin.getUcluk()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (b)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getUcluk() < sectigin.getUcluk()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (b)");
                    kc.setSkor(kc.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getUcluk() == sectigin.getUcluk()) {
                    System.out.println("bilgisayar kart = kullanıcı kart (b)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                }
                break;
            case ("Serbest atis"):
                if (secilen.getSerbestAtis() > sectigin.getSerbestAtis()) {
                    System.out.println("bilgisayar kart > kullanıcı kart (b)");
                    bs.setSkor(bs.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getSerbestAtis() < sectigin.getSerbestAtis()) {
                    System.out.println("kullanıcı kart > bilgisayar kart (b)");
                    kc.setSkor(kc.getSkor() + 10);
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    bsKart.remove(secilen);
                    kcKart.remove(sectigin);
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                } else if (secilen.getSerbestAtis() == sectigin.getSerbestAtis()) {

                    System.out.println("bilgisayar kart = kullanıcı kart (b)");
                    System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
                    System.out.print("Bilgisayarın elindeki basketbolcular: ");
                    ListeyiYaz2(bsKart);
                    System.out.print("\n" + "Kullanicinin elindeki basketbolcular: ");
                    ListeyiYaz2(kcKart);
                    System.out.println();
                    System.out.println();
                    if (bsKart.isEmpty() && bsKart2.isEmpty()) {
                        System.out.println("\nBilgisayarın skoru: " + bs.skorGöster());
                        System.out.println("Kullanıcın skoru: " + kc.skorGöster());
                        KazananiYazdir(bs.getSkor(), kc.getSkor());
                        System.exit(0);
                    }
                    if (!(bsKart2.isEmpty())) {
                        futbolcuKarsilastir(bs, kc, bsKart2, kcKart2, bsKart, kcKart);
                    } else {
                        basketbolcuKarsilastir(bs, kc, bsKart, kcKart, bsKart2, kcKart2);
                    }
                }

                break;
        }
    }

    public static String PozisyonBilgisiAl(String sira) {
        int random;
        String secilen;
        if (sira == "futbolcu") {
            int penalti = 0;
            int serbestVurus = 1;
            int kaleciKarsiKarsiya = 2;
            random = (int) (Math.random() * 3);
            if (random == 0) {
                secilen = "Penalti";
            } else if (random == 1) {
                secilen = "Serbest vurus";
            } else {
                secilen = "Kaleci karsi karsiya";
            }

            return secilen;
        } else {
            int ikilik = 0;
            int ucluk = 1;
            int serbestAtis = 2;
            random = (int) (Math.random() * 3);
            if (random == 0) {
                secilen = "Ikilik";
            } else if (random == 1) {
                secilen = "Ucluk";
            } else {
                secilen = "Serbest atis";
            }

        }
        return secilen;
    }

    public static void ListeyiYaz(ArrayList<Futbolcu> futLs) {
        int i = 0;
        while (i < futLs.size()) {
            System.out.print(futLs.get(i).getSporcuIsim() + " ");
            i++;
        }
    }

    public static void ListeyiYaz2(ArrayList<Basketbolcu> basLs) {
        int i = 0;
        while (i < basLs.size()) {
            if (i < basLs.size()) {
                System.out.print(basLs.get(i).getSporcuIsim() + " ");
                i++;
            }
        }
    }

     public static void KazananiYazdir(int skorBs, int skorKc) {
        if (skorBs > skorKc) {
            System.out.println("\n\n..BİLGİSAYAR KAZANDI!!..\n\n");
        } else if (skorBs < skorKc) {
            System.out.println("\n\n...SİZ KAZANDINIZ!!..\n\n");
        } else {
            System.out.println("\n\n...OYUN BERABERE...\n\n");
        }
    }
     
     
     
    /*
    public static String PozisyonDegistir(String pozisyon) {
        int random, ikilik, ucluk, serbestAtis;
        if (pozisyon == "Ikilik") {
            ucluk = 0;
            serbestAtis = 1;
            random = (int) (Math.random() * 2);
            if (random == 0) {
                return "Ucluk";
            } else {
                return "Serbest Atis";
            }
        } else if (pozisyon == "Ucluk") {
            ikilik = 0;
            serbestAtis = 1;
            random = (int) (Math.random() * 2);
            if (random == 0) {
                return "İkilik";
            } else {
                return "Serbest Atis";
            }
        } else {
            ikilik = 0;
            ucluk = 1;
            random = (int) (Math.random() * 2);
            if (random == 0) {
                return "Ikilik";
            } else {
                return "Ucluk";
            }
        }
    }

    public static void SonDurumKarsilastir(Bilgisayar bs, Kullanici kc,
            Basketbolcu secilen, Basketbolcu sectigin, String pozisyon) {
        int random;
        String yeniPozisyon;
        if ("Ikilik".equals(pozisyon)) {
            int ucluk = 0;
            int serbestAtis = 1;
            random = (int) (Math.random() * 2);
            if (random == 0) 
                yeniPozisyon = "Ucluk";
             else 
                yeniPozisyon = "SerbestAtis";
            
        }
        else if("Ucluk".equals(pozisyon)){
            int ikilik=0;
            int serbestAtis=1;
            random=(int)(Math.random()*2);
               if(random==0)
                   yeniPozisyon="Ikilik";
               else
                   yeniPozisyon="SerbestAtis";
        }
        else if("Serbest atis".equals(pozisyon)){
            int ikilik=0;
            int ucluk=1;
            random=(int)(Math.random()*2);
               if(random==0)
                   yeniPozisyon="Ikilik";
               else
                   yeniPozisyon="Ucluk";
        }
        System.out.println("Yeni Pozisyon: "+pozisyon);
        if(pozisyon=="Ucluk" && secilen.getUcluk()==sectigin.getUcluk() ){
           System.out.println("bilgisayar kart == kullanici kart (b)");
           System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor());
           System.out.println("Son Pozisyon Karşılaştırması:");
            if(secilen.getSerbestAtis()==secilen.getSerbestAtis()){
              System.out.println("bilgisayar kart == kullanici kart (b)");
              KazananiYazdir(bs.getSkor(),kc.getSkor());
            }
            else if(secilen.getSerbestAtis()>sectigin.getSerbestAtis()){
              System.out.println("bilgisayar kart > kullanici kart (b)"); 
              bs.setSkor(bs.getSkor()+10);
              System.out.println("Bilgisayarın skoru: "+bs.getSkor()+"\nKullanıcının skoru: "+kc.getSkor()); 
        }}
        if(pozisyon=="Serbest Atis" && secilen.getSerbestAtis()==sectigin.getSerbestAtis()){
              System.out.println("bilgisayar kart == kullanici kart (b)");
              System.out.println("Son Pozisyon Karşılaştırması:");
        }
    }
    
    */
 
    
   

}
