
package kartoyunu_prolab_proje2;

import java.util.ArrayList;

public abstract class Oyuncu {
    
	private String oyuncuAdi;
	private  int skor=0;
	
	public Oyuncu(){
	}
	
	public Oyuncu(String oyuncuAdi,int skor) {
         this.oyuncuAdi=oyuncuAdi;
         this.skor=skor;
               
	}

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
	
 
	
  public int skorGöster() {
	  return this.skor;
  }
	 
  public  abstract Futbolcu fKartSec(ArrayList<Futbolcu>futListe) ;
	 
  public abstract Basketbolcu bKartSec(ArrayList<Basketbolcu>basListe) ;
    
  

    
 }







