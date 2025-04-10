/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary;

import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author yannf
 */
public class FrameJeu extends javax.swing.JFrame {

    /**
     * Creates new form FrameJeu
     */
    public FrameJeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelParent = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menuPanelBackground = new boundary.components.JPanelWithBackground();
        titleMenu = new javax.swing.JLabel();
        startButton = new boundary.components.JButtonCustom();
        optionButton = new boundary.components.JButtonCustom();
        quitButton = new boundary.components.JButtonCustom();
        optionPanel = new javax.swing.JPanel();
        optionPanelBackground = new boundary.components.JPanelWithBackground();
        titleOption = new javax.swing.JLabel();
        optionPanelRound = new boundary.components.JPanelRound();
        resolutionLabel = new javax.swing.JLabel();
        fullScreenLabel = new javax.swing.JLabel();
        volumeLabel = new javax.swing.JLabel();
        fullscreenCheckBox = new javax.swing.JCheckBox();
        volumeSlider = new javax.swing.JSlider();
        leftArrowRes = new boundary.components.JButtonCustom();
        rightArrowRes = new boundary.components.JButtonCustom();
        resolutionNbLabel = new javax.swing.JLabel();
        menuBoutonOp = new boundary.components.JButtonCustom();
        plateauPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Argonautes");
        setIconImage(
            getIcon("Icon23.png")
        );
        setPreferredSize(new java.awt.Dimension(720, 480));

        jPanelParent.setLayout(new java.awt.CardLayout());

        titleMenu.setFont(new java.awt.Font("Windlass", 0, 48)); // NOI18N
        titleMenu.setText("ArgoNautes");

        startButton.setText("Start");
        startButton.setFont(new java.awt.Font("Windlass", 0, 14)); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        optionButton.setText("Option");
        optionButton.setFont(new java.awt.Font("Windlass", 0, 14)); // NOI18N
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.setFont(new java.awt.Font("Windlass", 0, 14)); // NOI18N
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelBackgroundLayout = new javax.swing.GroupLayout(menuPanelBackground);
        menuPanelBackground.setLayout(menuPanelBackgroundLayout);
        menuPanelBackgroundLayout.setHorizontalGroup(
            menuPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelBackgroundLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addGroup(menuPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(titleMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelBackgroundLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(menuPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(optionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );
        menuPanelBackgroundLayout.setVerticalGroup(
            menuPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleMenu)
                .addGap(42, 42, 42)
                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(optionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(228, 228, 228))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelParent.add(menuPanel, "card2");

        titleOption.setFont(new java.awt.Font("Windlass", 0, 48)); // NOI18N
        titleOption.setText("ArgoNautes");

        resolutionLabel.setFont(new java.awt.Font("Windlass", 0, 18)); // NOI18N
        resolutionLabel.setText("Resolution : ");

        fullScreenLabel.setFont(new java.awt.Font("Windlass", 0, 18)); // NOI18N
        fullScreenLabel.setText("FullScreen : ");

        volumeLabel.setFont(new java.awt.Font("Windlass", 0, 18)); // NOI18N
        volumeLabel.setText("Volume : ");

        fullscreenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullscreenCheckBoxActionPerformed(evt);
            }
        });

        leftArrowRes.setText("<");
        leftArrowRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftArrowResActionPerformed(evt);
            }
        });

        rightArrowRes.setText(">");
        rightArrowRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightArrowResActionPerformed(evt);
            }
        });

        resolutionNbLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resolutionNbLabel.setText("720x480");

        javax.swing.GroupLayout optionPanelRoundLayout = new javax.swing.GroupLayout(optionPanelRound);
        optionPanelRound.setLayout(optionPanelRoundLayout);
        optionPanelRoundLayout.setHorizontalGroup(
            optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelRoundLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionPanelRoundLayout.createSequentialGroup()
                        .addComponent(volumeLabel)
                        .addGap(90, 90, 90)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionPanelRoundLayout.createSequentialGroup()
                        .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resolutionLabel)
                            .addComponent(fullScreenLabel))
                        .addGap(56, 56, 56)
                        .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullscreenCheckBox)
                            .addGroup(optionPanelRoundLayout.createSequentialGroup()
                                .addComponent(leftArrowRes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(resolutionNbLabel)
                                .addGap(55, 55, 55)
                                .addComponent(rightArrowRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(100, 100, 100))
        );
        optionPanelRoundLayout.setVerticalGroup(
            optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelRoundLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resolutionLabel)
                    .addComponent(leftArrowRes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightArrowRes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolutionNbLabel))
                .addGap(19, 19, 19)
                .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullscreenCheckBox)
                    .addComponent(fullScreenLabel))
                .addGap(18, 18, 18)
                .addGroup(optionPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        menuBoutonOp.setText("Retrun Menu");
        menuBoutonOp.setFont(new java.awt.Font("Windlass", 0, 14)); // NOI18N
        menuBoutonOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoutonOpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelBackgroundLayout = new javax.swing.GroupLayout(optionPanelBackground);
        optionPanelBackground.setLayout(optionPanelBackgroundLayout);
        optionPanelBackgroundLayout.setHorizontalGroup(
            optionPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelBackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(optionPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(menuBoutonOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(optionPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(titleOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(375, 375, 375))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelBackgroundLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(optionPanelRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98))
        );
        optionPanelBackgroundLayout.setVerticalGroup(
            optionPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelBackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleOption)
                .addGap(18, 18, 18)
                .addComponent(optionPanelRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(menuBoutonOp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelParent.add(optionPanel, "card3");

        javax.swing.GroupLayout plateauPanelLayout = new javax.swing.GroupLayout(plateauPanel);
        plateauPanel.setLayout(plateauPanelLayout);
        plateauPanelLayout.setHorizontalGroup(
            plateauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        plateauPanelLayout.setVerticalGroup(
            plateauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanelParent.add(plateauPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBoutonOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoutonOpActionPerformed
        switchPanel(menuPanel);
    }//GEN-LAST:event_menuBoutonOpActionPerformed

    private void leftArrowResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftArrowResActionPerformed
        currentRes = (currentRes - 1)%resolution.length;
        if (currentRes <0){ currentRes = resolution.length -1 ;}
        resolutionNbLabel.setText(resolution[currentRes]);

        String[] res = (resolution[currentRes]).split("[x]");
        setSize(Integer.parseInt(res[0]), Integer.parseInt(res[1]));
    }//GEN-LAST:event_leftArrowResActionPerformed

    private void rightArrowResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightArrowResActionPerformed
        currentRes = (currentRes + 1)%resolution.length;
        resolutionNbLabel.setText(resolution[currentRes]);

        String[] res = (resolution[currentRes]).split("[x]");
        setSize(Integer.parseInt(res[0]), Integer.parseInt(res[1]));
    }//GEN-LAST:event_rightArrowResActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustom1ActionPerformed
        switchPanel(plateauPanel);
    }//GEN-LAST:event_jButtonCustom1ActionPerformed

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustom2ActionPerformed
        switchPanel(optionPanel);
    }//GEN-LAST:event_jButtonCustom2ActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustom3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCustom3ActionPerformed

    private void fullscreenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullscreenCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullscreenCheckBoxActionPerformed

    private void switchPanel (JPanel p){
        jPanelParent.removeAll();
        jPanelParent.add(p);
        repaint();
        revalidate();
    }

    private Image getIcon(String filename){
        Image res = null;
        try{
            res  = ImageIO.read(new File("src/main/java/com/ilu4/jeuxpirate/boundary/ressources/" + filename));
        }catch(IOException e){
            System.out.print("Icon not found");
        }
        return res;
    }



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
            java.util.logging.Logger.getLogger(FrameJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fullScreenLabel;
    private javax.swing.JCheckBox fullscreenCheckBox;
    private javax.swing.JPanel jPanelParent;
    private boundary.components.JButtonCustom leftArrowRes;
    private boundary.components.JButtonCustom menuBoutonOp;
    private javax.swing.JPanel menuPanel;
    private boundary.components.JPanelWithBackground menuPanelBackground;
    private boundary.components.JButtonCustom optionButton;
    private javax.swing.JPanel optionPanel;
    private boundary.components.JPanelWithBackground optionPanelBackground;
    private boundary.components.JPanelRound optionPanelRound;
    private javax.swing.JPanel plateauPanel;
    private boundary.components.JButtonCustom quitButton;
    private javax.swing.JLabel resolutionLabel;
    private javax.swing.JLabel resolutionNbLabel;
    private boundary.components.JButtonCustom rightArrowRes;
    private boundary.components.JButtonCustom startButton;
    private javax.swing.JLabel titleMenu;
    private javax.swing.JLabel titleOption;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables

    /*private javax.swing.JCheckBox fullscreenCheckBox;
    private javax.swing.JPanel jPanelParent;
    private javax.swing.JSlider jSlider1;
    private boundary.components.JButtonCustom leftArrowRes;
    private boundary.components.JButtonCustom menuBoutonOp;
    private javax.swing.JPanel menuPanel;
    private boundary.components.JPanelWithBackground menuPanelBackground;
    private boundary.components.JButtonCustom optionButton;
    private javax.swing.JPanel optionPanel;
    private boundary.components.JPanelWithBackground optionPanelBackground;
    private boundary.components.JPanelRound optionPanelRound;
    private boundary.Plateau plateau1;
    private javax.swing.JPanel plateauPanel;
    private boundary.components.JButtonCustom quitButton;
    private javax.swing.JLabel resolutionLabel;
    private javax.swing.JLabel resolutionNbLabel;
    private boundary.components.JButtonCustom rightArrowRes;
    private boundary.components.JButtonCustom startButton;
    private javax.swing.JLabel titleMenu;
    private javax.swing.JLabel titleOption;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JLabel volumeLabel1;*/
    private final String[] resolution ={"720x480", "1280x720", "1920x1080"};
    private int currentRes = 0;
}
