/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package boundary;

import boundary.component_manager.GestionnaireCartes;
import boundary.components.JCarte;
import boundary.components.JZoneInteraction;

/**
 *
 * @author yannf
 */
public class Plateau2 extends javax.swing.JPanel {
    private JZoneInteraction zoneInteraction = null;
    private JCarte carte;
    private GestionnaireCartes gestionnaire = new GestionnaireCartes();

    /**
     * Creates new form Plateau
     */
    public Plateau2() {
        initComponents();
        /*zoneInteraction = zoneInteraction1;
        carte = jCarte1;
        jCarte1.changeCardFace();
        gestionnaire.ajouterCarte(carte);
        carte = jCarte2;
        gestionnaire.ajouterCarte(carte);
        gestionnaire.ajouterCarte(carte);
        gestionnaire.ajouterZone(zoneInteraction1);
        setNbViesRestantes(4);*/
        //imagePanelJ1.setImage("ressources/Icon12.png");
        //imageJ2.setImage("com/ilu4/jeuxpirate/boundary/ressources/Icon12.png");
        //PopJ1.setImage("com/ilu4/jeuxpirate/boundary/ressources/Icon12.png");
        //PopJ2.setImage("com/ilu4/jeuxpirate/boundary/ressources/Icon12.png");
        //imagePanel1.setImage("/boundary.ressources/blackSmoke00.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plateauBackground = new boundary.components.JPanelWithBackground();
        iconP1 = new boundary.components.JPanelWithBackground();
        jZoneInteraction2 = new boundary.components.JZoneInteraction();
        jaugePopulariteP3 = new boundary.components.JPanelWithBackground();
        jaugePointDeVieP2 = new javax.swing.JPanel();
        jPointDeVie4 = new boundary.components.JPointDeVie();
        jPointDeVie5 = new boundary.components.JPointDeVie();
        jPointDeVie6 = new boundary.components.JPointDeVie();
        jPointDeVie7 = new boundary.components.JPointDeVie();
        jPointDeVie8 = new boundary.components.JPointDeVie();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jZoneInteraction5 = new boundary.components.JZoneInteraction();
        jPanel1 = new javax.swing.JPanel();
        jaugePopulariteP2 = new boundary.components.JPanelWithBackground();
        jaugePointDeVieP4 = new javax.swing.JPanel();
        jPointDeVie10 = new boundary.components.JPointDeVie();
        jPointDeVie11 = new boundary.components.JPointDeVie();
        jPointDeVie12 = new boundary.components.JPointDeVie();
        jPointDeVie13 = new boundary.components.JPointDeVie();
        jPointDeVie14 = new boundary.components.JPointDeVie();
        jZoneInteraction1 = new boundary.components.JZoneInteraction();
        iconP2 = new boundary.components.JPanelWithBackground();

        setPreferredSize(new java.awt.Dimension(720, 480));

        plateauBackground.setPreferredSize(new java.awt.Dimension(720, 480));
        plateauBackground.setImage("Plateau.png");
        plateauBackground.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        iconP1.setBackground(new java.awt.Color(153, 153, 0));
        iconP1.setPreferredSize(new java.awt.Dimension(150, 150));
        iconP1.setImage("IconJ1.png");

        javax.swing.GroupLayout iconP1Layout = new javax.swing.GroupLayout(iconP1);
        iconP1.setLayout(iconP1Layout);
        iconP1Layout.setHorizontalGroup(
            iconP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        iconP1Layout.setVerticalGroup(
            iconP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        plateauBackground.add(iconP1);

        javax.swing.GroupLayout jZoneInteraction2Layout = new javax.swing.GroupLayout(jZoneInteraction2);
        jZoneInteraction2.setLayout(jZoneInteraction2Layout);
        jZoneInteraction2Layout.setHorizontalGroup(
            jZoneInteraction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jZoneInteraction2Layout.setVerticalGroup(
            jZoneInteraction2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        plateauBackground.add(jZoneInteraction2);

        jaugePopulariteP3.setBackground(new java.awt.Color(0, 102, 204));
        jaugePopulariteP3.setPreferredSize(new java.awt.Dimension(103, 103));

        jaugePointDeVieP2.setBackground(new java.awt.Color(204, 0, 0));
        jaugePointDeVieP2.setPreferredSize(new java.awt.Dimension(45, 160));

        javax.swing.GroupLayout jPointDeVie4Layout = new javax.swing.GroupLayout(jPointDeVie4);
        jPointDeVie4.setLayout(jPointDeVie4Layout);
        jPointDeVie4Layout.setHorizontalGroup(
            jPointDeVie4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie4Layout.setVerticalGroup(
            jPointDeVie4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie5Layout = new javax.swing.GroupLayout(jPointDeVie5);
        jPointDeVie5.setLayout(jPointDeVie5Layout);
        jPointDeVie5Layout.setHorizontalGroup(
            jPointDeVie5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie5Layout.setVerticalGroup(
            jPointDeVie5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie6Layout = new javax.swing.GroupLayout(jPointDeVie6);
        jPointDeVie6.setLayout(jPointDeVie6Layout);
        jPointDeVie6Layout.setHorizontalGroup(
            jPointDeVie6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie6Layout.setVerticalGroup(
            jPointDeVie6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie7Layout = new javax.swing.GroupLayout(jPointDeVie7);
        jPointDeVie7.setLayout(jPointDeVie7Layout);
        jPointDeVie7Layout.setHorizontalGroup(
            jPointDeVie7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie7Layout.setVerticalGroup(
            jPointDeVie7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie8Layout = new javax.swing.GroupLayout(jPointDeVie8);
        jPointDeVie8.setLayout(jPointDeVie8Layout);
        jPointDeVie8Layout.setHorizontalGroup(
            jPointDeVie8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie8Layout.setVerticalGroup(
            jPointDeVie8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jaugePointDeVieP2Layout = new javax.swing.GroupLayout(jaugePointDeVieP2);
        jaugePointDeVieP2.setLayout(jaugePointDeVieP2Layout);
        jaugePointDeVieP2Layout.setHorizontalGroup(
            jaugePointDeVieP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaugePointDeVieP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPointDeVie8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jaugePointDeVieP2Layout.setVerticalGroup(
            jaugePointDeVieP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaugePointDeVieP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jaugePointDeVieP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPointDeVie8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jaugePopulariteP3Layout = new javax.swing.GroupLayout(jaugePopulariteP3);
        jaugePopulariteP3.setLayout(jaugePopulariteP3Layout);
        jaugePopulariteP3Layout.setHorizontalGroup(
            jaugePopulariteP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaugePopulariteP3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jaugePointDeVieP2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jaugePopulariteP3Layout.setVerticalGroup(
            jaugePopulariteP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jaugePopulariteP3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jaugePointDeVieP2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        plateauBackground.add(jaugePopulariteP3);

        jLabel1.setText("Pioche");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );

        plateauBackground.add(jPanel2);

        javax.swing.GroupLayout jZoneInteraction5Layout = new javax.swing.GroupLayout(jZoneInteraction5);
        jZoneInteraction5.setLayout(jZoneInteraction5Layout);
        jZoneInteraction5Layout.setHorizontalGroup(
            jZoneInteraction5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jZoneInteraction5Layout.setVerticalGroup(
            jZoneInteraction5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        plateauBackground.add(jZoneInteraction5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        plateauBackground.add(jPanel1);

        jaugePopulariteP2.setBackground(new java.awt.Color(0, 102, 204));
        jaugePopulariteP2.setPreferredSize(new java.awt.Dimension(103, 103));

        jaugePointDeVieP4.setBackground(new java.awt.Color(204, 0, 0));
        jaugePointDeVieP4.setPreferredSize(new java.awt.Dimension(45, 160));

        javax.swing.GroupLayout jPointDeVie10Layout = new javax.swing.GroupLayout(jPointDeVie10);
        jPointDeVie10.setLayout(jPointDeVie10Layout);
        jPointDeVie10Layout.setHorizontalGroup(
            jPointDeVie10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie10Layout.setVerticalGroup(
            jPointDeVie10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie11Layout = new javax.swing.GroupLayout(jPointDeVie11);
        jPointDeVie11.setLayout(jPointDeVie11Layout);
        jPointDeVie11Layout.setHorizontalGroup(
            jPointDeVie11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie11Layout.setVerticalGroup(
            jPointDeVie11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie12Layout = new javax.swing.GroupLayout(jPointDeVie12);
        jPointDeVie12.setLayout(jPointDeVie12Layout);
        jPointDeVie12Layout.setHorizontalGroup(
            jPointDeVie12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie12Layout.setVerticalGroup(
            jPointDeVie12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie13Layout = new javax.swing.GroupLayout(jPointDeVie13);
        jPointDeVie13.setLayout(jPointDeVie13Layout);
        jPointDeVie13Layout.setHorizontalGroup(
            jPointDeVie13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie13Layout.setVerticalGroup(
            jPointDeVie13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPointDeVie14Layout = new javax.swing.GroupLayout(jPointDeVie14);
        jPointDeVie14.setLayout(jPointDeVie14Layout);
        jPointDeVie14Layout.setHorizontalGroup(
            jPointDeVie14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPointDeVie14Layout.setVerticalGroup(
            jPointDeVie14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jaugePointDeVieP4Layout = new javax.swing.GroupLayout(jaugePointDeVieP4);
        jaugePointDeVieP4.setLayout(jaugePointDeVieP4Layout);
        jaugePointDeVieP4Layout.setHorizontalGroup(
            jaugePointDeVieP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaugePointDeVieP4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPointDeVie14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPointDeVie10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jaugePointDeVieP4Layout.setVerticalGroup(
            jaugePointDeVieP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jaugePointDeVieP4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jaugePointDeVieP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPointDeVie14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPointDeVie10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jaugePopulariteP2Layout = new javax.swing.GroupLayout(jaugePopulariteP2);
        jaugePopulariteP2.setLayout(jaugePopulariteP2Layout);
        jaugePopulariteP2Layout.setHorizontalGroup(
            jaugePopulariteP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jaugePopulariteP2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jaugePointDeVieP4, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jaugePopulariteP2Layout.setVerticalGroup(
            jaugePopulariteP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jaugePopulariteP2Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jaugePointDeVieP4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        plateauBackground.add(jaugePopulariteP2);

        javax.swing.GroupLayout jZoneInteraction1Layout = new javax.swing.GroupLayout(jZoneInteraction1);
        jZoneInteraction1.setLayout(jZoneInteraction1Layout);
        jZoneInteraction1Layout.setHorizontalGroup(
            jZoneInteraction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jZoneInteraction1Layout.setVerticalGroup(
            jZoneInteraction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        plateauBackground.add(jZoneInteraction1);

        iconP2.setBackground(new java.awt.Color(153, 153, 0));
        iconP2.setPreferredSize(new java.awt.Dimension(150, 150));
        iconP1.setImage("IconJ1.png");

        javax.swing.GroupLayout iconP2Layout = new javax.swing.GroupLayout(iconP2);
        iconP2.setLayout(iconP2Layout);
        iconP2Layout.setHorizontalGroup(
            iconP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        iconP2Layout.setVerticalGroup(
            iconP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        plateauBackground.add(iconP2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plateauBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plateauBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private boundary.components.JPanelWithBackground iconP1;
    private boundary.components.JPanelWithBackground iconP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private boundary.components.JPointDeVie jPointDeVie10;
    private boundary.components.JPointDeVie jPointDeVie11;
    private boundary.components.JPointDeVie jPointDeVie12;
    private boundary.components.JPointDeVie jPointDeVie13;
    private boundary.components.JPointDeVie jPointDeVie14;
    private boundary.components.JPointDeVie jPointDeVie4;
    private boundary.components.JPointDeVie jPointDeVie5;
    private boundary.components.JPointDeVie jPointDeVie6;
    private boundary.components.JPointDeVie jPointDeVie7;
    private boundary.components.JPointDeVie jPointDeVie8;
    private boundary.components.JPointDeVie jPointDeVie9;
    private boundary.components.JZoneInteraction jZoneInteraction1;
    private boundary.components.JZoneInteraction jZoneInteraction2;
    private boundary.components.JZoneInteraction jZoneInteraction3;
    private boundary.components.JZoneInteraction jZoneInteraction4;
    private boundary.components.JZoneInteraction jZoneInteraction5;
    private javax.swing.JPanel jaugePointDeVieP2;
    private javax.swing.JPanel jaugePointDeVieP3;
    private javax.swing.JPanel jaugePointDeVieP4;
    private boundary.components.JPanelWithBackground jaugePopulariteP2;
    private boundary.components.JPanelWithBackground jaugePopulariteP3;
    private boundary.components.JPanelWithBackground plateauBackground;
    // End of variables declaration//GEN-END:variables
}
