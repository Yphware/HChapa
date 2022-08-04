
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/

package cpm.lsz.mchak;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

import cpm.*;
import cpm.lsz.*;
import cpm.lsz.morec.*;

public class Ckt{

int inx=0;
public static Timer rt=null;
int slg=1;  
public static int vars=0; 
public static int tim=1700; 
public static String ap3="";

String[] sra=new String[0]; 
Mlio mlio1=new Mlio();

    public void doRand(ArrayList<JLabel>lebs){
        try{
            if(Bconfig.gtype==1){
                sra=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z"};
            }else
            if(Bconfig.gtype==2){
                sra=new String[]{"0","1","2","3","4","5","6","7","8","9"};
            }else
            if(Bconfig.gtype==3){
                sra=new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            }
        }finally{
            Collections.shuffle(Arrays.asList(sra));
        } 

        String[] srap=new String[sra.length+1];   
        for(int i=0;i<(sra.length);i++){srap[i]=sra[i];}
        srap[sra.length]="";   
         rt=new Timer(tim,new ActionListener(){
            public void actionPerformed(ActionEvent xion){
                if(slg==1){
                    Ls.charvar=srap[inx++];
                    lebs.get(2).setText(Ls.charvar); slg=2;
                } else if(slg==2){
                    Ls.charvar=srap[inx++];
                    lebs.get(3).setText(Ls.charvar); slg=1;}
                    vars=1;
                if(inx==srap.length){
                    rt.stop(); rt=null; mlio1.pSau(ap3,Chapa.sst); 
                    getPerc(lebs,sra); vars=0;
                    lebs.get(2).setText(""); lebs.get(3).setText("");
                }  
            }});
        rt.start(); rt.setRepeats(true);
    } 

    public  void getPerc(ArrayList<JLabel>xl, String[] array1){
        double valu=Double.parseDouble(xl.get(4).getText());
        double pcnt=((valu/(double)array1.length)*100);
        xl.get(0).setText(String.format("%.2f",pcnt)+"%");

        if(pcnt<0){xl.get(6).setText(Ls2.sl26);}else
        if((pcnt>=0)&&(pcnt<50)){xl.get(6).setText(Ls2.sl27);}else
        if((pcnt>=50)&&(pcnt<70)){xl.get(6).setText(Ls2.sl28);}else
        if((pcnt>=70)&&(pcnt<90)){xl.get(6).setText(Ls2.sl29);}else
        if((pcnt>=90)&&(pcnt<99)){xl.get(6).setText(Ls2.sl30);}else
        if(pcnt==100){xl.get(6).setText(Ls2.sl31);}
    } 

    public static void RESETvar(){
        try{Ckt.rt.stop();}catch(Exception e){} Ckt.rt=null;
        vars=0; tim=1700; Bconfig.gtype=1;
    }  


} 

