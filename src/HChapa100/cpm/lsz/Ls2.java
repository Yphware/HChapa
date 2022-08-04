
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/


package cpm.lsz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

import cpm.Chapa;
import cpm.lsz.mchak.*;

public class Ls2{

    public static String  lang=NATIVELG_DEFAULT; 
    public static String se="1";

    public  static String sl01, sl02, sl03, sl04, sl05, sl05x1, sl06, sl07, sl08, sl09, sl10, sl11, sl12, sl13, sl14;
    public  static String sl15="Ndio", sl16="La", sl17, sl18, sl19, sl20, sl21, sl22, sl23, sl24, sl25;
    public  static String sl26, sl27, sl28, sl29, sl30, sl31, sl32, sl33, sl34, sl35, sl36;
    public  static  String sl37;

    public static int vlu=0; 

    public static JPanel dp=new JPanel();
    public static JLabel lb1=new JLabel();
    public static JCheckBox ch1=new JCheckBox();


    public static void Lang(String langz){

        if(langz.equals("sw")){
            sl01="Faili"; sl02="Mpya"; sl03="Zima"; sl04="Auni"; sl05="Msaada"; sl05x1="Kuhusu";
            sl06="Anza"; sl07="rahisi"; sl08="wastani"; sl09="gumu"; sl10="hatari";
            sl11="Chagua kiwango"; sl12="Herufi"; sl13="Namba"; sl14="H & N"; sl15="Ndio"; sl16="La";
            sl17="Kiingereza"; sl18="safi"; sl19="kosa!"; sl20="Bado!";
            sl21=NATIVE_D1N01;
            sl22=NATIVE_D2N01;
            sl23=NATIVE_D3N01;
            sl24="Anza mchezo mpya?"; sl25="Sauti";
            sl26="Jaribu tena!"; sl27="Jitahidi"; sl28="Vizuri"; sl29="Safi!"; sl30="Safi mno!"; sl31="Haswaa!!";
            sl32="Zima program"; sl33="Unataka kuzima mchezo?";
            sl34=NATIVE_HELPL1; sl35="Sawa";
            sl36=NATIVE_YPC_INFO1;
            sl37="Tembelea kurasa yake";
        }else if(langz.equals("en")){
            sl01="File"; sl02="New"; sl03="Quit"; sl04="Help"; sl05="Help"; sl05x1="About";
            sl06="Start"; sl07="easy"; sl08="medium"; sl09="hard"; sl10="nasty";
            sl11="Select levels"; sl12="Letter"; sl13="Number"; sl14="L & N"; sl15="Yes"; sl16="No";
            sl17="English"; sl18="good"; sl19="err"; sl20="Not ready!!";
            sl21=NATIVE_D1N02;
            sl22=NATIVE_D2N02;
            sl23=NATIVE_D3N02;
            sl24="Sure to start new?"; sl25="Sound";
            sl26="Retry!"; sl27="Make effort"; sl28="Good."; sl29="Well!"; sl30="Excellent!"; sl31="Exactly!!";
            sl32="Quit program"; sl33="Do you want to quit game?";

            sl34=NATIVE_HELPL2; sl35="OK";
            sl36=NATIVE_YPC_INFO2;
            sl37="Visit homepage";
        }  
    } 

    public static void sDialog(ArrayList<JMenuItem>dii){
    dp.setBackground(Color.decode("#70B6C9"));
    dp.setPreferredSize(new Dimension(300,140));
    dp.setLayout(null);

    lb1.setBounds(29,20,180,30);
    lb1.setText(Ls2.sl24);
    dp.add(lb1);

    ch1.setBounds(29,100,120,30);
    ch1.setOpaque(false);
    ch1.setFocusable(false);
    ch1.setText(Ls2.sl17);
    dp.add(ch1);

    ch1.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent it){
            int stat1=it.getStateChange();
            int chang=ItemEvent.SELECTED;
            if(stat1==chang){vlu=1;}else{vlu=0;}
       }});


    dii.get(0).addMouseListener(new MouseAdapter(){     
    public void mousePressed(MouseEvent ms){
        Object[] opsh={sl15,sl16};
        int dlog=JOptionPane.showOptionDialog(Chapa.j,dp,Ls2.sl02,
        JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opsh,opsh[1]
        );
        if(dlog==0){
            if(vlu==1){
                Ckt.RESETvar(); writeJXY();
                try{Ls2.langSet(2); se="2"; Chapa.j.dispose();}finally{Chapa.main(new String[0]);}
            }else{
                Ckt.RESETvar(); writeJXY();
                try{Ls2.langSet(1); se="1"; Chapa.j.dispose();}finally{Chapa.main(new String[0]);}
            }    
        }else{} 
    }});
    } 

    public static void langSet(int nu){
        if(nu==1){Ls2.lang=NATIVELG1;}else
        if(nu==2){Ls2.lang=NATIVELG2;}
    } 


    public static void writeJXY(){
        String dirl=NATIVE_APP_DIRHOME;
        String fill=dirl+NATIVE_CFG;
        String thex=Integer.toString(Chapa.j.getX());
        String they=Integer.toString(Chapa.j.getY());
        try {
            BufferedWriter bfred=new BufferedWriter(new FileWriter(fill));
            bfred.write(NATIVE_HEADER+thex+"\n"+they+NATIVE_LAN);
            bfred.close();
        }catch (Exception e){e.printStackTrace();}
    }  

} 
