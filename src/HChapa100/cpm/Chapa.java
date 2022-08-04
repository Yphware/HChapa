
/*
    Typing game, June17-2017.
    For more: https://yphware.itch.io/
    
    
    
    Copyrights 2017 (YPC-YPH).
    
    By H. Halfani
    Dsm/Mtwara Tanzania.
*/

package cpm;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import cpm.lsz.*;
import cpm.lsz.mchak.*;  
import cpm.lsz.morec.*;

public class Chapa{

public static int sst=0;   

   public static JFrame j=new JFrame("hChapa 1.00");
    JPanel p=new JPanel();
    JPanel pgame=new JPanel();
    JPanel panc=new JPanel();

    JLabel info1=new JLabel();    
    JLabel marks=new JLabel();
    JLabel anzl=new JLabel();  


    JLabel flot1=new JLabel();
    JLabel flot2=new JLabel();

    JLabel taa1=new JLabel();  
    JLabel sinf=new JLabel();  
    JLabel seew=new JLabel();  
    JLabel home1=new JLabel();  

    ButtonGroup btg=new ButtonGroup();
    JRadioButton ra1=new JRadioButton("Herufi",true);
    JRadioButton ra2=new JRadioButton("Namba");
    JRadioButton ra3=new JRadioButton("H & N");
    static JCheckBox sac=new JCheckBox();


    public static ArrayList<JLabel> lebarr=null;
    public static ArrayList<JMenu> mnu=null;
    public static ArrayList<JMenuItem> menus=null;
    public static ArrayList<JRadioButton> aradio=null;
    public static ArrayList<JComboBox> coarr=null;

    Logs ald=new Logs(); 
    public Chapa(){
        int laint=Poz.xyUnits("lang");
        if(laint==1){Ls2.lang="sw";}else
        if(laint==2){Ls2.lang="en";}
        Ls2.Lang(Ls2.lang);
        Poz ic=new Poz(); 

        JMenuBar jmb=new JMenuBar();
        JMenu m1=new JMenu(Ls2.sl01);
        JMenuItem m1i1=new JMenuItem(Ls2.sl02);
        JMenuItem m1i2=new JMenuItem(Ls2.sl03);

        JMenu m2=new JMenu(Ls2.sl04);
        JMenuItem m2i1=new JMenuItem(Ls2.sl05);
        JMenuItem m2i2=new JMenuItem(Ls2.sl05x1);
        
        j.setLayout(new GridBagLayout());
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(490,390);
         j.setIconImage(ic.dataAc(6).getImage());

        try{
          j.setLocation(Poz.xyUnits("jx"),Poz.xyUnits("jy"));
          Poz.bafr.close();
        }catch(Exception e){j.setLocation(70,70);}

        m1.add(m1i1); m1.add(m1i2);
        m2.add(m2i1); m2.add(m2i2);
        jmb.add(m1); jmb.add(m2); 
        j.setJMenuBar(jmb);

        mnu=new ArrayList<JMenu>(); mnu.add(m1); mnu.add(m2);
        menus=new ArrayList<JMenuItem>();  
        menus.add(m1i1); menus.add(m1i2); menus.add(m2i1); menus.add(m2i2);
        new Bconfig().menuICing(menus);

        lebarr=new ArrayList<JLabel>(); 
        lebarr.add(info1); 
        lebarr.add(anzl);   
        lebarr.add(flot1); 
        lebarr.add(flot2); 
        lebarr.add(marks); 
        lebarr.add(taa1);  
        lebarr.add(seew);   
        lebarr.add(home1); 


        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0; c.gridy=0; c.gridwidth=1; c.gridheight=1;
        c.ipadx=430; c.ipady=320;

        p.setLayout(null);
        p.setBorder(BorderFactory.createLineBorder(Color.decode("#61246A"),13));
        p.setBackground(Color.decode("#ACB286"));
        j.add(p,c);

        home1.setBounds(389,19,30,24);   
        home1.setText("W");
        home1.setToolTipText(Ls2.sl37);
        home1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home1.setFont(new Font("SansSerif",Font.BOLD,14));
        home1.setForeground(Color.BLUE);
        p.add(home1);

        info1.setOpaque(true);
        info1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        info1.setBackground(Color.decode("#CED1B5"));
        info1.setBounds(42,50,100,30);
        p.add(info1);

        marks.setOpaque(true);
        marks.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        marks.setBackground(Color.decode("#1AEFFE"));
        marks.setBounds(186,50,69,30);
        p.add(marks);

        anzl.setIcon(ic.dataAc(9));
        anzl.setBounds(296,35,50,50); p.add(anzl);
        anzl.setToolTipText(Ls2.sl06);
        Ls.aCT(lebarr,0,0);
        Ls.aCT(lebarr,0);

        pgame.setBackground(Color.decode("#258A95"));
        pgame.setBounds(13,124,405,48);
        pgame.setLayout(null);
        p.add(pgame);

        flot1.setBounds(0,0,60,45);
        flot1.setForeground(Color.decode("#E8EEB1"));
        flot1.setFont(new Font("Serif",Font.BOLD,36));
        flot1.setBackground(Color.decode("#FDE2F8"));
        flot1.setHorizontalAlignment(SwingConstants.CENTER);
        flot1.setVisible(true);
        pgame.add(flot1);

        flot2.setBounds(346,0,60,45);
        flot2.setForeground(Color.decode("#C7F0F6"));
        flot2.setFont(new Font("Serif",Font.BOLD,36));
        flot2.setBackground(Color.decode("#EEF5CC"));
        flot2.setHorizontalAlignment(SwingConstants.CENTER);
        flot2.setVisible(true);
        pgame.add(flot2);

        panc.setBackground(Color.decode("#ABB2B5"));
        panc.setBounds(27,193,375,103);
        panc.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panc.setLayout(null);
        p.add(panc);

        String chois[]={Ls2.sl07,Ls2.sl08,Ls2.sl09,Ls2.sl10};
        JComboBox<String> jc=new JComboBox<String>(chois);
        jc.setBounds(20,14,90,34);
        jc.setSelectedIndex(1);
        jc.setFocusable(false);
        panc.add(jc);     
        coarr=new ArrayList<JComboBox>(); 
        coarr.add(jc);

        taa1.setBounds(120,14,123,34);
        taa1.setText(Ls2.sl11);
        taa1.setForeground(Color.YELLOW);
        panc.add(taa1);

        sinf.setBounds(321,11,24,23);
        sinf.setText("S");
        sinf.setHorizontalAlignment(SwingConstants.CENTER);
        sinf.setForeground(Color.decode("#9E05AB"));
        sinf.setFont(new Font("Serif",Font.BOLD,16));
        sinf.setToolTipText(Ls2.sl25);
        panc.add(sinf);

        sac.setBounds(342,10,29,27);
        sac.setIcon(new Poz().dataAc(7));
        sac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sac.setSelectedIcon(new Poz().dataAc(8));
        sac.setOpaque(false);
        sac.setFocusable(false);
        panc.add(sac);

        seew.setBounds(131,6,143,35);   
        seew.setForeground(Color.decode("#C8F481"));
        seew.setHorizontalAlignment(SwingConstants.CENTER);
        seew.setFocusable(false);
        pgame.add(seew);


        home1.addMouseListener(new MouseAdapter(){
        public void mousePressed(MouseEvent e){
            new Logs().opnBrowser();
        }});

        jc.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent co){
            int ix=jc.getSelectedIndex();
            if(ix==0){Ckt.tim=NATIVE_HIGHLY_D;}else
            if(ix==1){Ckt.tim=NATIVE_HEAVY_;}else
            if(ix==2){Ckt.tim=NATIVE_MID;}else
            if(ix==3){Ckt.tim=NATIVE_EASY;}
        }});

        sac.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent tem){
               int isc=tem.getStateChange();
               int che=ItemEvent.SELECTED;
               sst=(isc==che)?1:0;
        }});

        aradio=new ArrayList<JRadioButton>();
        aradio.add(ra1); 
        aradio.add(ra2); 
        aradio.add(ra3);
        ra1.setText(Ls2.sl12); 
        ra2.setText(Ls2.sl13);
        ra3.setText(Ls2.sl14);
        Bconfig.Rcon(aradio);
        btg.add(ra1); 
        btg.add(ra2); 
        btg.add(ra3);
        panc.add(ra1); 
        panc.add(ra2); 
        panc.add(ra3);
        Ls2.sDialog(menus);
        ald.goDialoz(j,menus); 

        j.pack();
        j.repaint();
        j.revalidate();
        j.setVisible(true);
        new Poz().Hooking(j);
    } 

    public static void main(String args[]){
            Ls2.Lang("en");
            new Chapa();
            if(sst==0){sac.setSelected(false);}
            else if(sst==1){sac.setSelected(true);}
    } 
} 
