
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/


package cpm.lsz.morec;

import java.io.*;
import javax.sound.sampled.*;

public class Mlio{

   public void pSau(final String s, final int x){
      new Thread(){
         @Override
          public void run(){
            if(x==1){
                try{
                  InputStream is1=getClass().getResourceAsStream(s);
                  InputStream bufs=new BufferedInputStream(is1);
                  AudioInputStream nsau=AudioSystem.getAudioInputStream(bufs);
                  Clip clip1=AudioSystem.getClip();
                  clip1.open(nsau); clip1.start();
               }catch(Exception cl){cl.printStackTrace();}
            } 
      }}.start();
   } 

} 
