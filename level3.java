
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
public class level3 extends javax.swing.JFrame {
    
    int counter1=0;
    int counter1_1=0;
    int counter2=0;
    int counter2_2=0;
    int counter3=0;
    int counter3_3=0;
    int counter4=0;
    int counter4_4=0;
    int counter5=0;
    int counter5_5=0;
    int counter6=0;
    int counter6_6=0;
    int counter7=0;
    int counter7_7=0;
    int counter8=0;
    int counter8_8=0;
    int counter9=0;
    int counter9_9=0;
    int counter10=0;
    int counter10_10=0;
    int counter11=0;
    int counter11_11=0;
    int counter12=0;
    int counter12_12=0;
    int click=0;
    int defeat=5;
    int win=0;
    
    
    
    public level3() {
        initComponents();
        
        jPanel1.setSize(890, 550);
        
        ImagePanel pan1 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel1.add(pan1);        
        
        ImagePanel pan1_1 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel1_1.add(pan1_1);
        
        ImagePanel pan2 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel2.add(pan2);        
        
        ImagePanel pan2_2 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel2_2.add(pan2_2);
        
        ImagePanel pan3 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel3.add(pan3);        
        
        ImagePanel pan3_3 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel3_3.add(pan3_3);
        
        ImagePanel pan4 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel4.add(pan4);
        
        ImagePanel pan4_4 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel4_4.add(pan4_4);
        
        ImagePanel pan5 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel5.add(pan5);
        
        ImagePanel pan5_5 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel5_5.add(pan5_5);
        
        ImagePanel pan6 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel6.add(pan6);
        
        ImagePanel pan6_6 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel6_6.add(pan6_6);
        
        ImagePanel pan7 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel7.add(pan7);
        
        ImagePanel pan7_7 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel7_7.add(pan7_7);
        
        ImagePanel pan8 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel8.add(pan8);
        
        ImagePanel pan8_8 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel8_8.add(pan8_8);
        
        ImagePanel pan9 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel9.add(pan9);
        
        ImagePanel pan9_9 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel9_9.add(pan9_9);
        
        ImagePanel pan10 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel10.add(pan10);
        
        ImagePanel pan10_10 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel10_10.add(pan10_10);
        
        ImagePanel pan11 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel11.add(pan11);
        
        ImagePanel pan11_11 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel11_11.add(pan11_11);
        
        ImagePanel pan12 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel12.add(pan12);
        
        ImagePanel pan12_12 = new ImagePanel(new ImageIcon("test.jpg").getImage());
        panel12_12.add(pan12_12);
        
//        image1.setVisible(true);
//        image1_1.setVisible(true);
//        image2.setVisible(true);
//        image2_2.setVisible(true);
//        image3.setVisible(true);
//        image3_3.setVisible(true); 
//        image4.setVisible(true);
//        image4_4.setVisible(true);
//        image5.setVisible(true);
//        image5_5.setVisible(true);
//        image6.setVisible(true);
//        image6_6.setVisible(true);
//        image7.setVisible(true);
//        image7_7.setVisible(true);
//        image8.setVisible(true);
//        image8_8.setVisible(true);
//        image9.setVisible(true);
//        image9_9.setVisible(true); 
//        image10.setVisible(true);
//        image10_10.setVisible(true);
//        image11.setVisible(true);
//        image11_11.setVisible(true);
//        image12.setVisible(true);
//        image12_12.setVisible(true);
//        
//        
//        
//        int delay = 3000; //milliseconds
//            ActionListener taskPerformer = new ActionListener() {
//                public  void actionPerformed(ActionEvent evt) {
//                    //...Perform a task...
//                    //panel1.setVisible(false);
//                    image1.setVisible(false);
//                    image1_1.setVisible(false);
//                    image2.setVisible(false);
//                    image2_2.setVisible(false);
//                    image3.setVisible(false);
//                    image3_3.setVisible(false); 
//                    image4.setVisible(false);
//                    image4_4.setVisible(false);
//                    image5.setVisible(false);
//                    image5_5.setVisible(false);
//                    image6.setVisible(false);
//                    image6_6.setVisible(false);
//                    image7.setVisible(false);
//                    image7_7.setVisible(false);
//                    image8.setVisible(false);
//                    image8_8.setVisible(false);
//                    image9.setVisible(false);
//                    image9_9.setVisible(false); 
//                    image10.setVisible(false);
//                    image10_10.setVisible(false);
//                    image11.setVisible(false);
//                    image11_11.setVisible(false);
//                    image12.setVisible(false);
//                    image12_12.setVisible(false);            
//                }               
//            };
//        new Timer(delay, taskPerformer).start();
Timer timer = new Timer(4000, new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent arg0) {
    // Code to be executed
    image1.setVisible(false);
                    image1.setVisible(false);
                    image1_1.setVisible(false);
                    image2.setVisible(false);
                    image2_2.setVisible(false);
                    image3.setVisible(false);
                    image3_3.setVisible(false); 
                    image4.setVisible(false);
                    image4_4.setVisible(false);
                    image5.setVisible(false);
                    image5_5.setVisible(false);
                    image6.setVisible(false);
                    image6_6.setVisible(false);
                    image7.setVisible(false);
                    image7_7.setVisible(false);
                    image8.setVisible(false);
                    image8_8.setVisible(false);
                    image9.setVisible(false);
                    image9_9.setVisible(false); 
                    image10.setVisible(false);
                    image10_10.setVisible(false);
                    image11.setVisible(false);
                    image11_11.setVisible(false);
                    image12.setVisible(false);
                    image12_12.setVisible(false);
    }
  });
  timer.setRepeats(false); // Only execute once
  timer.start(); // Go go go!

        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        image3 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        image2 = new javax.swing.JLabel();
        panel6_6 = new javax.swing.JPanel();
        image6_6 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        image4 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        image7 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        image12 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        image8 = new javax.swing.JLabel();
        panel1_1 = new javax.swing.JPanel();
        image1_1 = new javax.swing.JLabel();
        panel10_10 = new javax.swing.JPanel();
        image10_10 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        image6 = new javax.swing.JLabel();
        heart_image_1 = new javax.swing.JLabel();
        heart_image_2 = new javax.swing.JLabel();
        heart_image_3 = new javax.swing.JLabel();
        panel5_5 = new javax.swing.JPanel();
        image5_5 = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        image10 = new javax.swing.JLabel();
        panel7_7 = new javax.swing.JPanel();
        image7_7 = new javax.swing.JLabel();
        panel8_8 = new javax.swing.JPanel();
        image8_8 = new javax.swing.JLabel();
        panel9_9 = new javax.swing.JPanel();
        image9_9 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        image5 = new javax.swing.JLabel();
        panel3_3 = new javax.swing.JPanel();
        image3_3 = new javax.swing.JLabel();
        panel2_2 = new javax.swing.JPanel();
        image2_2 = new javax.swing.JLabel();
        panel4_4 = new javax.swing.JPanel();
        image4_4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        panel12_12 = new javax.swing.JPanel();
        image12_12 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        image9 = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        image11 = new javax.swing.JLabel();
        panel11_11 = new javax.swing.JPanel();
        image11_11 = new javax.swing.JLabel();
        heart_image_4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 137, 137));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(104, 217, 217));
        back.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\back.png")); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        panel3.setBorder(new javax.swing.border.MatteBorder(null));
        panel3.setAlignmentX(0.0F);
        panel3.setAlignmentY(0.0F);
        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel3.setPreferredSize(new java.awt.Dimension(150, 150));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });

        image3.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x3.png")); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(image3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 100));

        panel2.setBorder(new javax.swing.border.MatteBorder(null));
        panel2.setAlignmentX(0.0F);
        panel2.setAlignmentY(0.0F);
        panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel2.setPreferredSize(new java.awt.Dimension(150, 150));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });

        image2.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x2.png")); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(image2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, 100));

        panel6_6.setBorder(new javax.swing.border.MatteBorder(null));
        panel6_6.setAlignmentX(0.0F);
        panel6_6.setAlignmentY(0.0F);
        panel6_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel6_6.setPreferredSize(new java.awt.Dimension(150, 150));
        panel6_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel6_6MouseClicked(evt);
            }
        });

        image6_6.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x6.png")); // NOI18N

        javax.swing.GroupLayout panel6_6Layout = new javax.swing.GroupLayout(panel6_6);
        panel6_6.setLayout(panel6_6Layout);
        panel6_6Layout.setHorizontalGroup(
            panel6_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image6_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel6_6Layout.setVerticalGroup(
            panel6_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6_6Layout.createSequentialGroup()
                .addComponent(image6_6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panel6_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 100));

        panel4.setBorder(new javax.swing.border.MatteBorder(null));
        panel4.setAlignmentX(0.0F);
        panel4.setAlignmentY(0.0F);
        panel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel4.setPreferredSize(new java.awt.Dimension(150, 150));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });

        image4.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x4.png")); // NOI18N

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image4))
        );

        jPanel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 100));

        panel7.setBorder(new javax.swing.border.MatteBorder(null));
        panel7.setAlignmentX(0.0F);
        panel7.setAlignmentY(0.0F);
        panel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel7.setPreferredSize(new java.awt.Dimension(150, 150));
        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel7MouseClicked(evt);
            }
        });

        image7.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x7.png")); // NOI18N

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image7))
        );

        jPanel1.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 100));

        panel12.setBorder(new javax.swing.border.MatteBorder(null));
        panel12.setAlignmentX(0.0F);
        panel12.setAlignmentY(0.0F);
        panel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel12.setPreferredSize(new java.awt.Dimension(150, 150));
        panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel12MouseClicked(evt);
            }
        });

        image12.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x12.png")); // NOI18N

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image12))
        );

        jPanel1.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, 100));

        panel8.setBorder(new javax.swing.border.MatteBorder(null));
        panel8.setAlignmentX(0.0F);
        panel8.setAlignmentY(0.0F);
        panel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel8.setPreferredSize(new java.awt.Dimension(150, 150));
        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel8MouseClicked(evt);
            }
        });

        image8.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x8.png")); // NOI18N

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image8))
        );

        jPanel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 100, 100));

        panel1_1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1_1.setAlignmentX(0.0F);
        panel1_1.setAlignmentY(0.0F);
        panel1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1_1.setPreferredSize(new java.awt.Dimension(150, 150));
        panel1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1_1MouseClicked(evt);
            }
        });

        image1_1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x1.png")); // NOI18N

        javax.swing.GroupLayout panel1_1Layout = new javax.swing.GroupLayout(panel1_1);
        panel1_1.setLayout(panel1_1Layout);
        panel1_1Layout.setHorizontalGroup(
            panel1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1_1Layout.setVerticalGroup(
            panel1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image1_1))
        );

        jPanel1.add(panel1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 100));

        panel10_10.setBorder(new javax.swing.border.MatteBorder(null));
        panel10_10.setAlignmentX(0.0F);
        panel10_10.setAlignmentY(0.0F);
        panel10_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel10_10.setPreferredSize(new java.awt.Dimension(150, 150));
        panel10_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel10_10MouseClicked(evt);
            }
        });

        image10_10.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x10'.png")); // NOI18N

        javax.swing.GroupLayout panel10_10Layout = new javax.swing.GroupLayout(panel10_10);
        panel10_10.setLayout(panel10_10Layout);
        panel10_10Layout.setHorizontalGroup(
            panel10_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10_10Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(image10_10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel10_10Layout.setVerticalGroup(
            panel10_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10_10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image10_10))
        );

        jPanel1.add(panel10_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 100, 100));

        panel6.setBorder(new javax.swing.border.MatteBorder(null));
        panel6.setAlignmentX(0.0F);
        panel6.setAlignmentY(0.0F);
        panel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel6.setPreferredSize(new java.awt.Dimension(150, 150));
        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel6MouseClicked(evt);
            }
        });

        image6.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x6.png")); // NOI18N

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image6))
        );

        jPanel1.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 100, 100));

        heart_image_1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\heart.png")); // NOI18N
        jPanel1.add(heart_image_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        heart_image_2.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\heart.png")); // NOI18N
        jPanel1.add(heart_image_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        heart_image_3.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\heart.png")); // NOI18N
        jPanel1.add(heart_image_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        panel5_5.setBorder(new javax.swing.border.MatteBorder(null));
        panel5_5.setAlignmentX(0.0F);
        panel5_5.setAlignmentY(0.0F);
        panel5_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel5_5.setPreferredSize(new java.awt.Dimension(150, 150));
        panel5_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5_5MouseClicked(evt);
            }
        });

        image5_5.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x5.png")); // NOI18N

        javax.swing.GroupLayout panel5_5Layout = new javax.swing.GroupLayout(panel5_5);
        panel5_5.setLayout(panel5_5Layout);
        panel5_5Layout.setHorizontalGroup(
            panel5_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image5_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel5_5Layout.setVerticalGroup(
            panel5_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5_5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image5_5))
        );

        jPanel1.add(panel5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 100, 100));

        panel10.setBorder(new javax.swing.border.MatteBorder(null));
        panel10.setAlignmentX(0.0F);
        panel10.setAlignmentY(0.0F);
        panel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel10.setPreferredSize(new java.awt.Dimension(150, 150));
        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel10MouseClicked(evt);
            }
        });

        image10.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x10.png")); // NOI18N

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image10))
        );

        jPanel1.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 100, 100));

        panel7_7.setBorder(new javax.swing.border.MatteBorder(null));
        panel7_7.setAlignmentX(0.0F);
        panel7_7.setAlignmentY(0.0F);
        panel7_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel7_7.setPreferredSize(new java.awt.Dimension(150, 150));
        panel7_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel7_7MouseClicked(evt);
            }
        });

        image7_7.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x7'.png")); // NOI18N

        javax.swing.GroupLayout panel7_7Layout = new javax.swing.GroupLayout(panel7_7);
        panel7_7.setLayout(panel7_7Layout);
        panel7_7Layout.setHorizontalGroup(
            panel7_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image7_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel7_7Layout.setVerticalGroup(
            panel7_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7_7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image7_7))
        );

        jPanel1.add(panel7_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 100));

        panel8_8.setBorder(new javax.swing.border.MatteBorder(null));
        panel8_8.setAlignmentX(0.0F);
        panel8_8.setAlignmentY(0.0F);
        panel8_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel8_8.setPreferredSize(new java.awt.Dimension(150, 150));
        panel8_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel8_8MouseClicked(evt);
            }
        });

        image8_8.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x8'.png")); // NOI18N

        javax.swing.GroupLayout panel8_8Layout = new javax.swing.GroupLayout(panel8_8);
        panel8_8.setLayout(panel8_8Layout);
        panel8_8Layout.setHorizontalGroup(
            panel8_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image8_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel8_8Layout.setVerticalGroup(
            panel8_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8_8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image8_8))
        );

        jPanel1.add(panel8_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 100));

        panel9_9.setBorder(new javax.swing.border.MatteBorder(null));
        panel9_9.setAlignmentX(0.0F);
        panel9_9.setAlignmentY(0.0F);
        panel9_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel9_9.setPreferredSize(new java.awt.Dimension(150, 150));
        panel9_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel9_9MouseClicked(evt);
            }
        });

        image9_9.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x9'.png")); // NOI18N

        javax.swing.GroupLayout panel9_9Layout = new javax.swing.GroupLayout(panel9_9);
        panel9_9.setLayout(panel9_9Layout);
        panel9_9Layout.setHorizontalGroup(
            panel9_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image9_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel9_9Layout.setVerticalGroup(
            panel9_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9_9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image9_9))
        );

        jPanel1.add(panel9_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 100, 100));

        panel5.setBorder(new javax.swing.border.MatteBorder(null));
        panel5.setAlignmentX(0.0F);
        panel5.setAlignmentY(0.0F);
        panel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel5.setPreferredSize(new java.awt.Dimension(150, 150));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
        });

        image5.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x5.png")); // NOI18N

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image5))
        );

        jPanel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 100, 100));

        panel3_3.setBorder(new javax.swing.border.MatteBorder(null));
        panel3_3.setAlignmentX(0.0F);
        panel3_3.setAlignmentY(0.0F);
        panel3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel3_3.setPreferredSize(new java.awt.Dimension(150, 150));
        panel3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3_3MouseClicked(evt);
            }
        });

        image3_3.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x3.png")); // NOI18N

        javax.swing.GroupLayout panel3_3Layout = new javax.swing.GroupLayout(panel3_3);
        panel3_3.setLayout(panel3_3Layout);
        panel3_3Layout.setHorizontalGroup(
            panel3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel3_3Layout.setVerticalGroup(
            panel3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3_3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image3_3))
        );

        jPanel1.add(panel3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 100, 100));

        panel2_2.setBorder(new javax.swing.border.MatteBorder(null));
        panel2_2.setAlignmentX(0.0F);
        panel2_2.setAlignmentY(0.0F);
        panel2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel2_2.setPreferredSize(new java.awt.Dimension(150, 150));
        panel2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2_2MouseClicked(evt);
            }
        });

        image2_2.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x2.png")); // NOI18N

        javax.swing.GroupLayout panel2_2Layout = new javax.swing.GroupLayout(panel2_2);
        panel2_2.setLayout(panel2_2Layout);
        panel2_2Layout.setHorizontalGroup(
            panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2_2Layout.setVerticalGroup(
            panel2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2_2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image2_2))
        );

        jPanel1.add(panel2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 100, 100));

        panel4_4.setBorder(new javax.swing.border.MatteBorder(null));
        panel4_4.setAlignmentX(0.0F);
        panel4_4.setAlignmentY(0.0F);
        panel4_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel4_4.setPreferredSize(new java.awt.Dimension(150, 150));
        panel4_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4_4MouseClicked(evt);
            }
        });

        image4_4.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x4.png")); // NOI18N

        javax.swing.GroupLayout panel4_4Layout = new javax.swing.GroupLayout(panel4_4);
        panel4_4.setLayout(panel4_4Layout);
        panel4_4Layout.setHorizontalGroup(
            panel4_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image4_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel4_4Layout.setVerticalGroup(
            panel4_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4_4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image4_4))
        );

        jPanel1.add(panel4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 100, 100));

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

        image1.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x1.png")); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image1))
        );

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 100, 100));

        panel12_12.setBorder(new javax.swing.border.MatteBorder(null));
        panel12_12.setAlignmentX(0.0F);
        panel12_12.setAlignmentY(0.0F);
        panel12_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel12_12.setPreferredSize(new java.awt.Dimension(150, 150));
        panel12_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel12_12MouseClicked(evt);
            }
        });

        image12_12.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x12'.png")); // NOI18N

        javax.swing.GroupLayout panel12_12Layout = new javax.swing.GroupLayout(panel12_12);
        panel12_12.setLayout(panel12_12Layout);
        panel12_12Layout.setHorizontalGroup(
            panel12_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image12_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel12_12Layout.setVerticalGroup(
            panel12_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12_12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image12_12))
        );

        jPanel1.add(panel12_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 100, 100));

        panel9.setBorder(new javax.swing.border.MatteBorder(null));
        panel9.setAlignmentX(0.0F);
        panel9.setAlignmentY(0.0F);
        panel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel9.setPreferredSize(new java.awt.Dimension(150, 150));
        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel9MouseClicked(evt);
            }
        });

        image9.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x9.png")); // NOI18N

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image9))
        );

        jPanel1.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 100, 100));

        panel11.setBorder(new javax.swing.border.MatteBorder(null));
        panel11.setAlignmentX(0.0F);
        panel11.setAlignmentY(0.0F);
        panel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel11.setPreferredSize(new java.awt.Dimension(150, 150));
        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel11MouseClicked(evt);
            }
        });

        image11.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x11'.png")); // NOI18N

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image11))
        );

        jPanel1.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 100, 100));

        panel11_11.setBorder(new javax.swing.border.MatteBorder(null));
        panel11_11.setAlignmentX(0.0F);
        panel11_11.setAlignmentY(0.0F);
        panel11_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel11_11.setPreferredSize(new java.awt.Dimension(150, 150));
        panel11_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel11_11MouseClicked(evt);
            }
        });

        image11_11.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\x11'.png")); // NOI18N

        javax.swing.GroupLayout panel11_11Layout = new javax.swing.GroupLayout(panel11_11);
        panel11_11.setLayout(panel11_11Layout);
        panel11_11Layout.setHorizontalGroup(
            panel11_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image11_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel11_11Layout.setVerticalGroup(
            panel11_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11_11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image11_11))
        );

        jPanel1.add(panel11_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 100, 100));

        heart_image_4.setIcon(new javax.swing.ImageIcon("D:\\study\\Year 2\\2\\C202 Data\\project\\MindGame\\heart.png")); // NOI18N
        jPanel1.add(heart_image_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        userWindow u = new userWindow();
        u.setVisible(true);
        close();
    }//GEN-LAST:event_backMouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        click++;
        counter3++;
        if(click==1)
        {
            music_click();
            image3.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter3==counter3_3)
            {
                win++;
                if(win==12)
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
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter3==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel1MouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        click++;
        counter2++;
        if(click==1)
        {
            music_click();
            image2.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter2==counter2_2)
            {
                win++;
                if(win==12)
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
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter2==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel2MouseClicked

    private void panel6_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6_6MouseClicked
        click++;
        counter6_6++;
        if(click==1)
        {
            music_click();
            image6_6.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter6_6==counter6)
            {
                win++;
                if(win==12)
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
                    panel6_6.setVisible(false);
                    panel6.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter6_6==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel6_6MouseClicked

    private void panel3Mouseimaged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        click++;
        counter3++;
        if(click==1)
        {
            music_click();
            image3.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter3==counter3_3)
            {
                win++;
                if(win==12)
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
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter3==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel3MouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        click++;
        counter4++;
        if(click==1)
        {
            music_click();
            image4.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter4==counter4_4)
            {
                win++;
                if(win==12)
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
                    panel4.setVisible(false);
                    panel4_4.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter4==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel4MouseClicked

    private void panel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseClicked
        click++;
        counter7++;
        if(click==1)
        {
            music_click();
            image7.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter7==counter7_7)
            {
                win++;
                if(win==12)
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
                    panel7.setVisible(false);
                    panel7_7.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter7==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel7MouseClicked

    private void panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseClicked
        click++;
        counter12++;
        if(click==1)
        {
            music_click();
            image12.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter12==counter12_12)
            {
                win++;
                if(win==12)
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
                    panel12.setVisible(false);
                    panel12_12.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter12==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel12MouseClicked

    private void panel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseClicked
        click++;
        counter8++;
        if(click==1)
        {
            music_click();
            image8.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter8==counter8_8)
            {
                win++;
                if(win==12)
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
                    panel8.setVisible(false);
                    panel8_8.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter8==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel8MouseClicked

    private void panel1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1_1MouseClicked
        click++;
        counter1_1++;
        if(click==1)
        {
            music_click();
            image1_1.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter1_1==counter1)
            {
                win++;
                if(win==12)
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
                    panel1_1.setVisible(false);
                    panel1.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter1==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel1_1MouseClicked

    private void panel10_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10_10MouseClicked
        click++;
        counter10_10++;
        if(click==1)
        {
            music_click();
            image10_10.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter10_10==counter10)
            {
                win++;
                if(win==12)
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
                    panel10_10.setVisible(false);
                    panel10.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter10_10==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel10_10MouseClicked

    private void panel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseClicked
        click++;
        counter6++;
        if(click==1)
        {
            music_click();
            image6.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter6==counter6_6)
            {
                win++;
                if(win==12)
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
                    panel6.setVisible(false);
                    panel6_6.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter6==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel6MouseClicked

    private void panel5_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5_5MouseClicked
        click++;
        counter5_5++;
        if(click==1)
        {
            music_click();
            image5_5.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter5_5==counter5)
            {
                win++;
                if(win==12)
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
                    panel5_5.setVisible(false);
                    panel5.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter5_5==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel5_5MouseClicked

    private void panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseClicked
        click++;
        counter10++;
        if(click==1)
        {
            music_click();
            image10.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter10==counter10_10)
            {
                win++;
                if(win==12)
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
                    panel10.setVisible(false);
                    panel10_10.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter10==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel10MouseClicked

    private void panel7_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7_7MouseClicked
        click++;
        counter7_7++;
        if(click==1)
        {
            music_click();
            image7_7.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter7_7==counter7)
            {
                win++;
                if(win==12)
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
                    panel7_7.setVisible(false);
                    panel7.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter7_7==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel7_7MouseClicked

    private void panel8_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8_8MouseClicked
        click++;
        counter8_8++;
        if(click==1)
        {
            music_click();
            image8_8.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter8_8==counter8)
            {
                win++;
                if(win==12)
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
                    panel8_8.setVisible(false);
                    panel8.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter8_8==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel8_8MouseClicked

    private void panel9_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9_9MouseClicked
        click++;
        counter9_9++;
        if(click==1)
        {
            music_click();
            image9_9.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter9_9==counter9)
            {
                win++;
                if(win==12)
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
                    panel9_9.setVisible(false);
                    panel9.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter9_9==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel9_9MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        click++;
        counter5++;
        if(click==1)
        {
            music_click();
            image5.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter5==counter5_5)
            {
                win++;
                if(win==12)
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
                    panel5.setVisible(false);
                    panel5_5.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter5==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel5MouseClicked

    private void panel3_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3_3MouseClicked
        click++;
        counter3_3++;
        if(click==1)
        {
            music_click();
            image3_3.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter3_3==counter3)
            {
                win++;
                if(win==12)
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
                    panel3_3.setVisible(false);
                    panel3.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter3_3==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel3_3MouseClicked

    private void panel2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2_2MouseClicked
        click++;
        counter2_2++;
        if(click==1)
        {
            music_click();
            image2_2.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter2_2==counter2)
            {
                win++;
                if(win==12)
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
                    panel2_2.setVisible(false);
                    panel2.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter2_2==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel2_2MouseClicked

    private void panel4_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4_4MouseClicked
        click++;
        counter4_4++;
        if(click==1)
        {
            music_click();
            image4_4.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter4_4==counter4)
            {
                win++;
                if(win==12)
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
                    panel4_4.setVisible(false);
                    panel4.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter4_4==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel4_4MouseClicked

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel16MouseClicked
        click++;
        counter1++;
        if(click==1)
        {
            music_click();
            image1.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter1==counter1_1)
            {
                win++;
                if(win==12)
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
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter1==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel16MouseClicked

    private void panel12_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12_12MouseClicked
        click++;
        counter12_12++;
        if(click==1)
        {
            music_click();
            image12_12.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter12_12==counter12)
            {
                win++;
                if(win==12)
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
                    panel12_12.setVisible(false);
                    panel12.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter12_12==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel12_12MouseClicked

    private void panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseClicked
        click++;
        counter9++;
        if(click==1)
        {
            music_click();
            image9.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter9==counter9_9)
            {
                win++;
                if(win==12)
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
                    panel9.setVisible(false);
                    panel9_9.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter9==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel9MouseClicked

    private void panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseClicked
        click++;
        counter11++;
        if(click==1)
        {
            music_click();
            image11.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter11==counter11_11)
            {
                win++;
                if(win==12)
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
                    panel11.setVisible(false);
                    panel11_11.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter11==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel11MouseClicked

    private void panel11_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11_11MouseClicked
        click++;
        counter11_11++;
        if(click==1)
        {
            music_click();
            image11_11.setVisible(true);
            
        }
        else if(click==2)
        {
            if(counter11_11==counter11)
            {
                win++;
                if(win==12)
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
                    panel11_11.setVisible(false);
                    panel11.setVisible(false);
                    counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                    counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                    counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                    counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                }
               
            }
            else if(counter11_11==2)
            {
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
            }
            else
            {
                defeat--;
                if(defeat==0){
                    music_lose();
                    ImagePanel pan1 = new ImagePanel(new ImageIcon("lost.png").getImage());
                    JOptionPane.showMessageDialog(null,pan1,"Lost",JOptionPane.PLAIN_MESSAGE);
                    userWindow u = new userWindow();
                    u.setVisible(true);
                    close();                    
                }
                else
                {
                    if(defeat==4)
                    {
                        music_lostHeart();
                        heart_image_4.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your first heart\nstill 3 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==3)
                    {
                        music_lostHeart();
                        heart_image_3.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 2 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==2)
                    {
                        music_lostHeart();
                        heart_image_2.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your second heart\nstill 1 to go","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(defeat==1)
                    {
                        music_lostHeart();
                        heart_image_1.setVisible(false);
                        JOptionPane.showMessageDialog(null,"you lost your final heart :( \nIt's your last try","Lost",JOptionPane.INFORMATION_MESSAGE);
                    }   
                }
                counter1=0;counter2=0;counter3=0;counter1_1=0;counter2_2=0;counter3_3=0;click=0;
                counter4=0;counter5=0;counter6=0;counter4_4=0;counter5_5=0;counter6_6=0;
                counter7=0;counter8=0;counter9=0;counter7_7=0;counter8_8=0;counter9_9=0;
                counter10=0;counter11=0;counter12=0;counter10_10=0;counter11_11=0;counter12_12=0;
                image1.setVisible(false); image1_1.setVisible(false); image2.setVisible(false);
                image2_2.setVisible(false); image3.setVisible(false); image3_3.setVisible(false); 
                image4.setVisible(false); image4_4.setVisible(false); image5.setVisible(false);
                image5_5.setVisible(false); image6.setVisible(false); image6_6.setVisible(false);
                image7.setVisible(false); image7_7.setVisible(false); image8.setVisible(false);
                image8_8.setVisible(false); image9.setVisible(false); image9_9.setVisible(false); 
                image10.setVisible(false); image10_10.setVisible(false); image11.setVisible(false);
                image11_11.setVisible(false); image12.setVisible(false); image12_12.setVisible(false);
            }
        }
    }//GEN-LAST:event_panel11_11MouseClicked

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
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel heart_image_1;
    private javax.swing.JLabel heart_image_2;
    private javax.swing.JLabel heart_image_3;
    private javax.swing.JLabel heart_image_4;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image10;
    private javax.swing.JLabel image10_10;
    private javax.swing.JLabel image11;
    private javax.swing.JLabel image11_11;
    private javax.swing.JLabel image12;
    private javax.swing.JLabel image12_12;
    private javax.swing.JLabel image1_1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image2_2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image3_3;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel image4_4;
    private javax.swing.JLabel image5;
    private javax.swing.JLabel image5_5;
    private javax.swing.JLabel image6;
    private javax.swing.JLabel image6_6;
    private javax.swing.JLabel image7;
    private javax.swing.JLabel image7_7;
    private javax.swing.JLabel image8;
    private javax.swing.JLabel image8_8;
    private javax.swing.JLabel image9;
    private javax.swing.JLabel image9_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel10_10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel11_11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel12_12;
    private javax.swing.JPanel panel1_1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel2_2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel3_3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel4_4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel5_5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel6_6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel7_7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel8_8;
    private javax.swing.JPanel panel9;
    private javax.swing.JPanel panel9_9;
    // End of variables declaration//GEN-END:variables
}
