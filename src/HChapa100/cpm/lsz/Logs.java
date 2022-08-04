
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

import cpm.*;
import cpm.lsz.morec.*;

public class Logs{

	ImageIcon imc=null;

	public void goDialoz(JFrame j, ArrayList<JMenuItem>i){
		imc=new ImageIcon(new Poz().dataAc(6).getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH));
		i.get(1).addMouseListener(new MouseAdapter(){
		 public void mousePressed(MouseEvent e){

		Object[] yno={Ls2.sl15,Ls2.sl16};
		int dcd1=JOptionPane.showOptionDialog(j,Ls2.sl33,Ls2.sl32,
		JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,imc,yno,yno[0]);
		if(dcd1==0){System.exit(0);}
		 }});
		 
		i.get(2).addMouseListener(new MouseAdapter(){
		 public void mousePressed(MouseEvent e){
			Object[] ok1={Ls2.sl35};
			int dcd2=JOptionPane.showOptionDialog(j,Ls2.sl34,Ls2.sl05,
			JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,imc,ok1,ok1[0]);
		 }});
		 
		i.get(3).addMouseListener(new MouseAdapter(){
		 public void mousePressed(MouseEvent e){
			Object[] ok2={Ls2.sl35};
			int dcd3=JOptionPane.showOptionDialog(j,Ls2.sl36,Ls2.sl05x1,
			JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,imc,ok2,ok2[0]);
		 }});
	} 


	public void opnBrowser(){
		Runtime openEnv = Runtime.getRuntime();
		String url1="http://tehelimu.ezyro.com/Subsites/enl/tls.html"; //alt home site
		String ostype=System.getProperty("os.name").toLowerCase();
		String osname4=ostype.subSequence(0,3).toString();
		switch(osname4){
		case "win":
		try{Desktop.getDesktop().browse(new java.net.URI(url1));}catch(Exception e1){e1.printStackTrace();}
		break;
		case "lin":
		try{openEnv.exec("xdg-open "+url1);}catch(Exception e2){e2.printStackTrace();}
		break;
		case "mac":
		try{openEnv.exec("open "+url1);}catch(Exception e2){e2.printStackTrace();}
		break;
		default:
		System.out.println("Cannot launch browser in this environment!");
		} 
	} 

} 
