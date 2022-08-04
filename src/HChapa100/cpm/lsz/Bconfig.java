
/*
    Part of HChapa typing game (Java) By H.H.
    For more: https://yphware.itch.io/
    
    
    Copyrights 2017 (YPC-YPH).
    Dsm/Mtwara Tanzania.
*/

package cpm.lsz;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import cpm.lsz.morec.*;
import cpm.lsz.mchak.*;

public class Bconfig{

public static long gtype=1;     

    public static void Rcon(ArrayList<JRadioButton>rdb){ 
        rdb.get(0).setBounds(20,62,68,32);
        rdb.get(0).setToolTipText(Ls2.sl21);
        rdb.get(1).setBounds(100,62,68,32);
        rdb.get(1).setToolTipText(Ls2.sl22);
        rdb.get(2).setBounds(182,62,130,32);
        rdb.get(2).setToolTipText(Ls2.sl23);

        for(JRadioButton alist:rdb){
            alist.setFocusable(false);
            alist.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
            alist.setOpaque(false);
        }

        rdb.get(0).addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                gtype=1;
            }});

        rdb.get(1).addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               gtype=2;
             }});

        rdb.get(2).addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              gtype=3;
        }});
    }

    public void menuICing(ArrayList<JMenuItem>jmi){
    Poz mics=new Poz();
        jmi.get(0).setIcon(mics.dataAc(1));
        jmi.get(1).setIcon(mics.dataAc(2));
        jmi.get(2).setIcon(mics.dataAc(3));
        jmi.get(3).setIcon(mics.dataAc(4));
    } 
} 
