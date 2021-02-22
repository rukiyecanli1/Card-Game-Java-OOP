package kartoyunu_prolab_proje2;


public abstract class Sporcu {

        String sporcuIsim;
	String sporcuTakim;
	boolean kartBilgisi;

	public Sporcu() {
	}
    
	public Sporcu(String sporcuIsim, String sporcuTakim) {
		this.sporcuIsim=sporcuIsim;
		this.sporcuTakim=sporcuTakim;
	}
	
	
	public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsım(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
       // public abstract boolean isKartBilgisi();
	//public abstract void setKartBilgisi(boolean kartBilgisi) ;
        
        
        
        
	public abstract void sporcuPuaniGöster();
        
        public abstract boolean kartKullanildiMi();
      
}

