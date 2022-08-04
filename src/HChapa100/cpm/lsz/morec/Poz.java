
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/


package cpm.lsz.morec;

import java.io.*;
import java.awt.Image;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;

import cpm.lsz.*;

public class Poz{
    
    public static String fohome=NATIVE_APP_DIRHOME;
    public static String filoc=fohome+NATIVE_CFG;
    public static BufferedReader bafr=null;
    static String dvalue="0";
    static int dvaint=0;

    public static int xyUnits(String dim){
        int rlin=1;  
        if(dim.equals("jx")){rlin=2;}else if(dim.equals("jy")){rlin=3;}
        else if(dim.equals("lang")){rlin=4;}   
        try{
            bafr=new BufferedReader(new FileReader(filoc));
            for(int i=0;i<rlin;i++){dvalue=bafr.readLine();}
            if(!dim.equals("lang")){
                dvaint=Integer.parseInt(dvalue); bafr.close();
            }else{
                String cro1=dvalue.substring(5,6);
                dvaint=Integer.parseInt(cro1); bafr.close();
            }
        }catch(Exception rex){}
        return dvaint;
    } 

    public void Hooking(final JFrame j){
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){
        public void run(){
            String xa=Integer.toString(j.getX());
            String ya=Integer.toString(j.getY());
            File ffo=new File(fohome);
            if(!ffo.exists()){
                ffo.mkdirs();
            }
            try{
                BufferedWriter bfw=new BufferedWriter(new FileWriter(filoc));
                bfw.write(NATIVE_HEADER+xa+"\n"+ya+NATIVE_LAN);
                bfw.close();
            }catch(Exception ee){ee.printStackTrace();}
        } }));  
    }  

    //Custom implementation might be required here to get images/icons
    public ImageIcon dataAc(long lo){ 
        NATIVE_INDEX_N=lo;
        return NATIVE_IMAGE_LIST.get(NATIVE_INDEX_N);
    } 


} 
