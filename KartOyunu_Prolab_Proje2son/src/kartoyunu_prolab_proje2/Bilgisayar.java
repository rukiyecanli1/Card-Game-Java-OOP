package kartoyunu_prolab_proje2;

import java.util.ArrayList;
public class Bilgisayar extends Oyuncu {
   
        
        
	public Bilgisayar() {
		super();
	}

	public Bilgisayar(String oyuncuAdi, int skor) {
		super(oyuncuAdi, skor);
	}

   
      @Override  
      public Futbolcu fKartSec(ArrayList<Futbolcu>futListe){
          Futbolcu secilenKart = null;
          
              int randomm=(int)(Math.random()*futListe.size());
              if(futListe.get(randomm).kartKullanildiMi()==false){
                  secilenKart=futListe.get(randomm);
                 // futListe.remove(futListe.get(randomm));
              return secilenKart;
              }
               else
             return fKartSec(futListe);
      }  
       
      @Override
       public Basketbolcu bKartSec(ArrayList<Basketbolcu>basListe){
          Basketbolcu secilenKart = null;
              int randomm=(int)(Math.random()*basListe.size());
              if(basListe.get(randomm).kartKullanildiMi()==false){
                  secilenKart=basListe.get(randomm);
                 // basListe.remove(basListe.get(randomm));
          return secilenKart;
              }
                  else
             return bKartSec(basListe);
      } 
	
	
}
	

