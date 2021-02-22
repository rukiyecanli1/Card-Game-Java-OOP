package kartoyunu_prolab_proje2;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;



public class Kullanici extends Oyuncu {
  

    public Kullanici() {
        super();
    }

    public Kullanici(String oyuncuAdi, int skor) {
        super(oyuncuAdi, skor);
    }

   

    @Override
      public Futbolcu fKartSec(ArrayList<Futbolcu>futListe) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Lütfen bir kart seciniz: ");
        int sectigin = sc.nextInt();
     return futListe.get(sectigin);
     }
    
     

    @Override
    public Basketbolcu bKartSec(ArrayList<Basketbolcu>basListe) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Lütfen bir kart seciniz: ");
        int sectigin = sc.nextInt();
     return basListe.get(sectigin);
     }

}
