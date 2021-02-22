/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartoyunu_prolab_proje2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buton extends JPanel implements ActionListener {

    private JButton buton1, bsFutbolcu1,bsFutbolcu2,bsFutbolcu3,bsFutbolcu4;
    Bilgisayar bs = new Bilgisayar("Bilgisayar", 0);
    Kullanici kc = new Kullanici("Kullanici", 0);

    JFrame gr = new JFrame();
    Futbolcu f=new Futbolcu();
    public void tablo() {

        JFrame graf = new JFrame();
        graf.setTitle("Kart Oyunu");
        graf.setSize(760, 530);
        JPanel ekran = new JPanel();
        graf.add(ekran);
        ekran.setBackground(Color.black);
        String dosya="src//img//arkaplan.jpg";
        JLabel plan = new JLabel(new ImageIcon(dosya));

        plan.setBounds(0, 20, 750, 480);

        ekran.setLayout(null);
        ekran.add(plan);
        JLabel se = new JLabel("Kartları çarpıştır");

        se.setForeground(Color.white);
        Font font = new Font("Times new roman", Font.BOLD, 45);
        se.setFont(font);

        se.setBounds(10, -27, 1000, 80);
        se.setBackground(Color.red);
        plan.add(se);
        
        buton1 = new JButton("Oyna");
        bsFutbolcu2=new JButton("");
        bsFutbolcu3 =new JButton("");
        bsFutbolcu4=new JButton("");
        plan.add(buton1);
        buton1.setBounds(250, 180, 100, 30);
        buton1.addActionListener(this);
        
        plan.add(bsFutbolcu1);
        plan.add(bsFutbolcu2);
        plan.add(bsFutbolcu3);
        plan.add(bsFutbolcu4);
        bsFutbolcu1.setBounds(90, 100, 110, 150);
     //   bsFutbolcu1.setIcon(new javax.swing.ImageIcon(bs.fKartSec(futKartListesi).getDosya1()));
        bsFutbolcu1.addActionListener(this);
        bsFutbolcu2.setBounds(240, 100, 110, 150);
        bsFutbolcu2.addActionListener(this);
        bsFutbolcu3.setBounds(390, 100, 110, 150);
        bsFutbolcu3.addActionListener(this);
        bsFutbolcu4.setBounds(540, 100, 110, 150);
        bsFutbolcu4.addActionListener(this);
        graf.setVisible(true);
        graf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == buton1) {
            gr = new JFrame("");
            gr.setVisible(true);
            gr.setSize(1870, 1000);

            JPanel sad = new JPanel();
            gr.add(sad);
            sad.setBackground(Color.black);
        } 
        
        /*  
        
         for(i=0;i<10;i++){
         dizi[i]=true;
            
           
         }
         for(i=0;i<10;i++){
         sa=ras.nextInt(10);
            
         if(dizi[sa]==true){
         System.out.println(sa);
           
           
        
      
         if(e.getSource()==buton1){
   
         if(i<3){
       
                  
        
         a[i]= pol.kartbelle(sa);
             
            
         }
         else if(i>=3&&i<6){
                 
    
       
         b[i-3]= la.kartbelle(sa);
             
            
      
        
         }
         else {
         switch(i){
         case 6:
         a[3]=pol.kartbelle(sa);
         break;
         case 7:
         b[3]=la.kartbelle(sa);
         break;
         case 8:
         a[4]=pol.kartbelle(sa);
         break;
         case 9:
         b[4]=la.kartbelle(sa);
         break;
         default: break;
         }
         }
         }
         if(e.getSource()==buton2){
         if(i<3){
       
       
         a[i]= pal.kartbelle(sa);
             
            
             
         }
         else if(i>=3&&i<6){
       
       
       
         b[i-3]= la.kartbelle(sa);
             
            
       
  
               
         }
         else {
         switch(i){
         case 6:
         a[3]=pol.kartbelle(sa);
         break;
         case 7:
         b[3]=la.kartbelle(sa);
         break;
         case 8:
         a[4]=pol.kartbelle(sa);
         break;
         case 9:
         b[4]=la.kartbelle(sa);
         break;
         default: break;
         }}
        
  
            
         } dizi[sa]=false;
         }
         else { 
         i=i-1;
         }
        
         
  	 
        
    
        
         gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         } 
         System.out.println("acilan kartlar:\n"+a[0]+" "+b[0]);
         System.out.println(a[1]+" "+b[1]);
         System.out.println(a[2]+" "+b[2]);
         System.out.println(a[3]+" "+b[3]);
         System.out.println(a[4]+" "+b[4]);
         for(k=0;k<5;k++){
    
         if(a[k]<b[k]){
         puan2=puan2+5;
         }
         else if(b[k]<a[k]){
         puan1=puan1+5;
                
         } else System.out.println("beraberlik");
         }
         if(puan1<puan2){
         System.out.println("2. oyuncu kazandi.");
         }
         else if(puan2<puan1){
         System.out.println("1. oyuncu kazandi.");
            
         } else System.out.println("berabere dostluk kazandi");
         }
         */
    }
}
