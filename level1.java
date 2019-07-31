
import java.awt.MultipleGradientPaint;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elbostan
 */
public class level1 extends javax.swing.JFrame {
    boolean show = true;
    int counter1=0;
    int counter1_1=0;
    int counter2=0;
    int counter2_2=0;
    int counter3=0;
    int counter3_3=0;
    int click=0;
    int heart_1 =0;
    int win=0;int del=0;
    LinkedList list = new LinkedList();
    Timer time;

    @Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * Creates new form phase1
     */
    public level1() {
        
        initComponents();
        jPanel1.setSize(890, 550);
        ImagePanel pan1 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel3_3.add(pan1);
        
        ImagePanel pan2 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel2.add(pan2);
        
        ImagePanel pan3 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel3.add(pan3);
        
        ImagePanel pan4 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel1.add(pan4);
        
        ImagePanel pan5 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel1_1.add(pan5);
        
        ImagePanel pan6 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel2_2.add(pan6);
        
        
       
        
        
//        image1.setVisible(true);
//        image1_1.setVisible(true);
//        image2.setVisible(true);
//        image2_2.setVisible(true);
//        image3.setVisible(true);
//        image3_3.setVisible(true);
//        
//        
//        Timer time;
//       time.setDelay(1);
//        
//        image1.setVisible(false);
//        image1_1.setVisible(false);
//        image2.setVisible(false);
//        image2_2.setVisible(false);
//        image3.setVisible(false);
//        image3_3.setVisible(false);
        
//        if(show==true)
//        {
//            happen();
//        }
//        else
//        {}
        
        
        
        
////        image1.setVisible(true);
////        image1_1.setVisible(true);
////        image2.setVisible(true);
////        image2_2.setVisible(true);
////        image3.setVisible(true);
////        image3_3.setVisible(true);
////        int dely = 2000;
//        
//        
//        time = new Timer();

Timer timer = new Timer(2000, new ActionListener() {
  @Override
    public void actionPerformed(ActionEvent arg0) 
    {
      
        // Code to be executed
        image1.setVisible(false);
        image1_1.setVisible(false);
        image2.setVisible(false);
        image2_2.setVisible(false);
        image3.setVisible(false);
        image3_3.setVisible(false);
    }
});
timer.setRepeats(false); // Only execute once
timer.start(); // Go go go!
        
            
        
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(level1.class.getName()).log(Level.SEVERE, null, ex);
        }
        image1.setVisible(true);
        image1_1.setVisible(true);
        image2.setVisible(true);
        image2_2.setVisible(true);
        image3.setVisible(true);
        image3_3.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(level1.class.getName()).log(Level.SEVERE, null, ex);
        }
        image1.setVisible(false);
        image1_1.setVisible(false);
        */
        
    }
    
    public void happen()
    {
        show=false;
        image1.setVisible(true);
        image1_1.setVisible(true);
        image2.setVisible(true);
        image2_2.setVisible(true);
        image3.setVisible(true);
        image3_3.setVisible(true);
        int dely = 2000;
        
        
        int delay = dely; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public  void actionPerformed(ActionEvent evt) {
                    //...Perform a task...
                    image1.setVisible(false);
                    image1_1.setVisible(false);
                    image2.setVisible(false);
                    image2_2.setVisible(false);
                    image3.setVisible(false);
                    image3_3.setVisible(false);
                }
                
            };
        new Timer(delay, taskPerformer).start();
    }

    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public static void music_slip() 
    {      
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
 
        ContinuousAudioDataStream loop = null;
 
        try
        {
            InputStream test = new FileInputStream("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\slip.WAV");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);
 
        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }
    
    public static void music_lose() 
    {      
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
 
        ContinuousAudioDataStream loop = null;
 
        try
        {
            InputStream test = new FileInputStream("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\lost.WAV");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);
 
        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }
    
    public static void music_click() 
    {      
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
 
        ContinuousAudioDataStream loop = null;
 
        try
        {
            InputStream test = new FileInputStream("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\click.WAV");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);
 
        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }
    
    public static void music_lostHeart() 
    {      
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
 
        ContinuousAudioDataStream loop = null;
 
        try
        {
            InputStream test = new FileInputStream("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\lostHeart.WAV");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);
 
        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }
    
    public void music_win()
    {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM = null;
        AudioData MD;

        ContinuousAudioDataStream loop = null;
        
        try
        {
            InputStream test = new FileInputStream("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\win.WAV");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        heart1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        panel3_3 = new javax.swing.JPanel();
        image3_3 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        image2 = new javax.swing.JLabel();
        panel1_1 = new javax.swing.JPanel();
        image1_1 = new javax.swing.JLabel();
        panel2_2 = new javax.swing.JPanel();
        image2_2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        image3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(91, 185, 185));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(91, 185, 185));
        jPanel1.setMinimumSize(new java.awt.Dimension(601, 538));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\back.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        heart1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\heart.png")); // NOI18N
        jPanel1.add(heart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        panel1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1.setAlignmentX(0.0F);
        panel1.setAlignmentY(0.0F);
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });

        image1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l1.png")); // NOI18N
        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image1))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 151, 155));

        panel3_3.setBorder(new javax.swing.border.MatteBorder(null));
        panel3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel3_3.setPreferredSize(new java.awt.Dimension(150, 150));
        panel3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3_3MouseClicked(evt);
            }
        });

        image3_3.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l3.png")); // NOI18N

        javax.swing.GroupLayout panel3_3Layout = new javax.swing.GroupLayout(panel3_3);
        panel3_3.setLayout(panel3_3Layout);
        panel3_3Layout.setHorizontalGroup(
            panel3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3_3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image3_3))
        );
        panel3_3Layout.setVerticalGroup(
            panel3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3_3Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(image3_3))
        );

        jPanel1.add(panel3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 151, 155));

        panel2.setBorder(new javax.swing.border.MatteBorder(null));
        panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel2.setPreferredSize(new java.awt.Dimension(150, 150));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });

        image2.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l2.png")); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image2))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 155));

        panel1_1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1_1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1_1MouseClicked(evt);
            }
        });

        image1_1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l1.png")); // NOI18N

        javax.swing.GroupLayout panel1_1Layout = new javax.swing.GroupLayout(panel1_1);
        panel1_1.setLayout(panel1_1Layout);
        panel1_1Layout.setHorizontalGroup(
            panel1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image1_1))
        );
        panel1_1Layout.setVerticalGroup(
            panel1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        jPanel1.add(panel1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 155));

        panel2_2.setBorder(new javax.swing.border.MatteBorder(null));
        panel2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel2_2.setPreferredSize(new java.awt.Dimension(150, 150));
        panel2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2_2MouseClicked(evt);
            }
        });

        image2_2.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l2.png")); // NOI18N

        javax.swing.GroupLayout panel2_2Layout = new javax.swing.GroupLayout(panel2_2);
        panel2_2.setLayout(panel2_2Layout);
        panel2_2Layout.setHorizontalGroup(
            panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image2_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2_2Layout.setVerticalGroup(
            panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(image2_2))
        );

        jPanel1.add(panel2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 151, 155));

        panel3.setBorder(new javax.swing.border.MatteBorder(null));
        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel3.setPreferredSize(new java.awt.Dimension(150, 150));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });

        image3.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\l3.png")); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 151, 155));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        userWindow u = new userWindow();
        u.setVisible(true);
        close();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked
        
    }//GEN-LAST:event_image1MouseClicked

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        click++;
        counter1++;
        list.add(1);
        
        if(click==1)
        {
            music_click();
            image1.setVisible(true);
            
        }
        else if(click==2)
        {
            //if(counter1==counter1_1)
            if(counter1==counter1_1 && (int)list.remove()==1)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                    music_slip(); 
                    panel1.setVisible(false);
                    panel1_1.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
                
                
            }
            else if(counter1==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1){
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel1MouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        click++;
        counter2++;
        list.add(2);
        if(click==1)
        {
            music_click();
            image2.setVisible(true);
            
        }
        else if(click==2)
        {
            //if(counter2==counter2_2)
            if(counter2==counter2_2 && (int)list.remove()==2)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                  
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                    music_slip();
                    panel2.setVisible(false);
                    panel2_2.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
                
            }
            else if(counter2==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1){
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel2MouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        click++;
        counter3++;
        list.add(3);
        
        if(click==1)
        {
            music_click();
            image3.setVisible(true);
        }
        else if(click==2)
        {
            //if(counter3==counter3_3)
            if(counter3==counter3_3 && (int)list.remove()==3)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                    
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                    music_slip();
                    panel3.setVisible(false);
                    panel3_3.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
                
            }
            else if(counter3==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1){
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel3MouseClicked

    private void panel3_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3_3MouseClicked
        click++;
        counter3_3++;
        list.add(3);
        if(click==1)
        {
            music_click();
            image3_3.setVisible(true);
        }
        else if(click==2)
        {
            //if(counter3_3==counter3)
            if(counter3_3==counter3 && (int)list.remove()==3)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                    
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                     music_slip();
                    panel3.setVisible(false);
                    panel3_3.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
               
            }
            else if(counter3_3==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1){
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel3_3MouseClicked

    private void panel1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1_1MouseClicked
        click++;
        counter1_1++;
        list.add(1);
        
        if(click==1)
        {
            music_click();
            image1_1.setVisible(true);
        }
        else if(click==2)
        {
            //if(counter1_1==counter1)
            if(counter1_1==counter1&&(int)list.remove()==1)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                    
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                    music_slip();
                    panel1.setVisible(false);
                    panel1_1.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
                
            }
            else if(counter1_1==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1)
                {
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel1_1MouseClicked

    private void panel2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2_2MouseClicked
        click++;
        counter2_2++;
        list.add(2);
        if(click==1)
        {
            music_click();
            image2_2.setVisible(true);
            
        }
        else if(click==2)
        {
            //if(counter2_2==counter2)
            if(counter2_2==counter2&&(int)list.remove()==2)
            {
                win++;
                if(win==3)
                {
                    music_win();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("win.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Win",JOptionPane.PLAIN_MESSAGE);
                    
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                else
                {
                    music_slip();
                    panel2.setVisible(false);
                    panel2_2.setVisible(false);
                    click=0;list=new LinkedList();
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                }
                
                
            }
            else if(counter2_2==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
            }
            else
            {
                heart_1++;
                if(heart_1==1)
                {
                    music_lostHeart();
                    heart1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"you lost a heart","Lost",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(heart_1>1)
                {
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();
                }
                click=0;list=new LinkedList();
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                image1.setVisible(false);
                image1_1.setVisible(false);
                image2.setVisible(false);
                image2_2.setVisible(false);
                image3.setVisible(false);
                image3_3.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel2_2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {  
            
            public void run() {
                
                
                new level1().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heart1;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image1_1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image2_2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image3_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel1_1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel2_2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel3_3;
    // End of variables declaration//GEN-END:variables
}
