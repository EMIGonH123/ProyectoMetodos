package interfaz;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public void resetAllColors(){
        Archivo.setBackground(new Color(153,153,153));
        Manual.setBackground(new Color(153,153,153));
    }
    
    public void setColor(JTextField jtf){
        jtf.setBackground(new Color(204,204,204)); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Manual = new javax.swing.JTextField();
        Archivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Metodos Cuantitativos");

        BtnSalir.setBackground(new java.awt.Color(153, 153, 153));
        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSalir.setText("X");
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtnSalir))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        Manual.setEditable(false);
        Manual.setBackground(new java.awt.Color(153, 153, 153));
        Manual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Manual.setForeground(new java.awt.Color(255, 255, 255));
        Manual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Manual.setText("Manual");
        Manual.setBorder(null);
        Manual.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ManualMouseMoved(evt);
            }
        });
        Manual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManualMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManualMouseExited(evt);
            }
        });

        Archivo.setEditable(false);
        Archivo.setBackground(new java.awt.Color(153, 153, 153));
        Archivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Archivo.setForeground(new java.awt.Color(255, 255, 255));
        Archivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Archivo.setText("Archivo");
        Archivo.setBorder(null);
        Archivo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ArchivoMouseMoved(evt);
            }
        });
        Archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchivoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ArchivoMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo carga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manual)
            .addComponent(Archivo)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addComponent(Manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    public ArrayList<String> buscarArhivos(String ruta){
        ArrayList<String> arreglo = new ArrayList<String>();
        String nombreArchivo;
        Matcher matcher;
       
        String expresionRegular = "(\\w)*.txt";
        Pattern pattern = Pattern.compile(expresionRegular);
        
        //Archivos
        File f = new File(ruta);
        File files[] = f.listFiles();
        int i;
         
        for( i = 0; i<files.length; i++ ){
            if( files[i].isFile() ){
                nombreArchivo = files[i].getName();
                matcher = pattern.matcher( nombreArchivo );
                if( matcher.matches() ){
                    arreglo.add(nombreArchivo);
                }
            }
        }
        return arreglo;
    }
    
    
    
    private void ArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivoMouseClicked
        String ruta = "C:\\Users\\Emi Gon H\\Desktop\\Archivos"; 
        ArrayList<String> arreglo = this.buscarArhivos(ruta);
        String nombreArchivo = JOptionPane.showInputDialog(null, "Seleccione un archivo para Simplex", "Archivos", 
                                    JOptionPane.QUESTION_MESSAGE,null, arreglo.toArray(),
                                    "Seleccione").toString();
        
        
        File f;
        FileReader fr;
        BufferedReader br;
        try {
            f = new File(ruta+"\\"+nombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String parrafo;
            while( (parrafo= br.readLine()) != null ){
                System.out.println(parrafo);
            }
            fr.close();
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_ArchivoMouseClicked

    private void ArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivoMouseExited
        resetAllColors();
    }//GEN-LAST:event_ArchivoMouseExited

    private void ArchivoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivoMouseMoved
       resetAllColors();
        setColor(Archivo);
    }//GEN-LAST:event_ArchivoMouseMoved

    private void ManualMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManualMouseMoved
        resetAllColors();
        setColor(Manual);
    }//GEN-LAST:event_ManualMouseMoved

    private void ManualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManualMouseClicked
        Integer numVariables []={1,2,3,4};
        Integer numRestricciones []={1,2,3,4,5};
        
        int x = Integer.parseInt( JOptionPane.showInputDialog(null,"Número de variables","Variables", 
                                    JOptionPane.QUESTION_MESSAGE, null, numVariables,
                                    "Seleccione").toString() );
        int y = Integer.parseInt( JOptionPane.showInputDialog(null,"Número de restricciones","Restricciones", 
                                    JOptionPane.QUESTION_MESSAGE, null, numRestricciones,
                                    "Seleccione").toString() );
        System.out.println("Variables: "+x);
        System.out.println("Restricciones: "+y);
        
        
        VistaCargarInfo vcis = new VistaCargarInfo(this,x,y);
        vcis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ManualMouseClicked

    private void ManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManualMouseExited
        resetAllColors();
    }//GEN-LAST:event_ManualMouseExited
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Archivo;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JTextField Manual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
