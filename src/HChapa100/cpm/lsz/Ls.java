
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/

package cpm.lsz;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;


import cpm.*;
import cpm.lsz.mchak.*;
import cpm.lsz.morec.*;


public class Ls{
    static Mlio mlio1=new Mlio();

    public static String ap1=NATIVE_SOUND_SOURCE1;
    public static String ap2=NATIVE_SOUND_SOURCE2;
    public static int cou=0;
    public static String charvar="";  
    public static void aCT(ArrayList<JLabel>leboz, int i1, int nouse){

        leboz.get(1).addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                 if(Ckt.rt==null){ 
                    leboz.get(1).setIcon(new Poz().dataAc(10));
                    leboz.get(2).setText("");
                    leboz.get(3).setText("");
                    leboz.get(6).setText("");
                    cou=0; leboz.get(0).setText("");
                    leboz.get(4).setText(Integer.toString(cou));
                    new Ckt().doRand(leboz); 
                }  
            }
            public void mouseReleased(MouseEvent e){
                leboz.get(1).setIcon(new Poz().dataAc(9));  
            }
        });
    } 

    public static void aCT(ArrayList<JLabel>al, int i2){
        al.get(0).setFocusable(true);
        al.get(0).addKeyListener(new KeyAdapter(){   
          public void keyPressed(KeyEvent k){
            char c0='\u0000';   //default value
            try{
              char cr=Character.toLowerCase(k.getKeyChar());
              c0=charvar.charAt(0); Comparez(al, c0, cr);
            }catch(Exception ez){al.get(0).setText(Ls2.sl20);}
          }});
    } 

    public static void Comparez(ArrayList<JLabel>rleft1, char ccc1, char ccc2){
        if(Ckt.vars==1){ 
            if(ccc1==ccc2){                
                mlio1.pSau(ap1,Chapa.sst);
                rleft1.get(4).setText(Integer.toString(cou=cou+1));
                rleft1.get(0).setText(Ls2.sl18);  Ckt.vars=0;
            }else if(ccc1!=ccc2){       
                mlio1.pSau(ap2,Chapa.sst);
                rleft1.get(4).setText(Integer.toString(cou=cou-1));
                rleft1.get(0).setText(Ls2.sl19); Ckt.vars=0;
            }
        } 
    }  
} 

