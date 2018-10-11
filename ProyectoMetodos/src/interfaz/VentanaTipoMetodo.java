package interfaz;

import java.awt.Color;
import javax.swing.JTextField;

public class VentanaTipoMetodo extends javax.swing.JFrame {
    public VentanaTipoMetodo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void resetAllColors(){
        Simplex.setBackground(new Color(204,204,204));
        Genetico.setBackground(new Color(204,204,204));
        Analitico.setBackground(new Color(204,204,204));
        Aleatorios.setBackground(new Color(204,204,204));
    }
    
    public void setColor(JTextField jtf){
        jtf.setBackground(new Color(153,153,153)); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        BarraLateral = new javax.swing.JPanel();
        Simplex = new javax.swing.JTextField();
        Analitico = new javax.swing.JTextField();
        Genetico = new javax.swing.JTextField();
        Aleatorios = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTitulo.setBackground(new java.awt.Color(255, 102, 51));

        Titulo.setBackground(new java.awt.Color(51, 51, 255));
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Tipo Método");

        Salir.setBackground(new java.awt.Color(0, 51, 255));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("X");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(50, 50, 50)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(Titulo))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(PanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        BarraLateral.setBackground(new java.awt.Color(204, 204, 204));

        Simplex.setEditable(false);
        Simplex.setBackground(new java.awt.Color(204, 204, 204));
        Simplex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Simplex.setForeground(new java.awt.Color(255, 255, 255));
        Simplex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Simplex.setText("Simplex");
        Simplex.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SimplexMouseMoved(evt);
            }
        });
        Simplex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SimplexMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SimplexMouseExited(evt);
            }
        });

        Analitico.setEditable(false);
        Analitico.setBackground(new java.awt.Color(204, 204, 204));
        Analitico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Analitico.setForeground(new java.awt.Color(255, 255, 255));
        Analitico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Analitico.setText("Analítico");
        Analitico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AnaliticoMouseMoved(evt);
            }
        });
        Analitico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnaliticoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnaliticoMouseExited(evt);
            }
        });

        Genetico.setEditable(false);
        Genetico.setBackground(new java.awt.Color(204, 204, 204));
        Genetico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Genetico.setForeground(new java.awt.Color(255, 255, 255));
        Genetico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Genetico.setText("Genético");
        Genetico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                GeneticoMouseMoved(evt);
            }
        });
        Genetico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneticoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GeneticoMouseExited(evt);
            }
        });

        Aleatorios.setEditable(false);
        Aleatorios.setBackground(new java.awt.Color(204, 204, 204));
        Aleatorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Aleatorios.setForeground(new java.awt.Color(255, 255, 255));
        Aleatorios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Aleatorios.setText("Aleatorios");
        Aleatorios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AleatoriosMouseMoved(evt);
            }
        });
        Aleatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AleatoriosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AleatoriosMouseExited(evt);
            }
        });
        Aleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AleatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLateralLayout.createSequentialGroup()
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Simplex)
                    .addComponent(Genetico, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Analitico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Aleatorios))
                .addGap(22, 22, 22))
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Analitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genetico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirMouseClicked

    private void SimplexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimplexMouseClicked
        /*VentanaPrincipal vs = new VentanaPrincipal(this);
        vs.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_SimplexMouseClicked

    private void SimplexMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimplexMouseExited
        resetAllColors();
    }//GEN-LAST:event_SimplexMouseExited

    private void SimplexMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimplexMouseMoved
        resetAllColors();
        setColor(Simplex);
    }//GEN-LAST:event_SimplexMouseMoved

    private void AnaliticoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnaliticoMouseMoved
        resetAllColors();
        setColor(Analitico);
    }//GEN-LAST:event_AnaliticoMouseMoved

    private void AnaliticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnaliticoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AnaliticoMouseClicked

    private void AnaliticoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnaliticoMouseExited
        resetAllColors();
    }//GEN-LAST:event_AnaliticoMouseExited

    private void GeneticoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneticoMouseMoved
        resetAllColors();
        setColor(Genetico);
    }//GEN-LAST:event_GeneticoMouseMoved

    private void GeneticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneticoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneticoMouseClicked

    private void GeneticoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneticoMouseExited
        resetAllColors();
    }//GEN-LAST:event_GeneticoMouseExited

    private void AleatoriosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AleatoriosMouseMoved
        resetAllColors();
        setColor(Aleatorios);
    }//GEN-LAST:event_AleatoriosMouseMoved

    private void AleatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AleatoriosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AleatoriosMouseClicked

    private void AleatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AleatoriosMouseExited
        resetAllColors();
    }//GEN-LAST:event_AleatoriosMouseExited

    private void AleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AleatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AleatoriosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aleatorios;
    private javax.swing.JTextField Analitico;
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JTextField Genetico;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JLabel Salir;
    private javax.swing.JTextField Simplex;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
