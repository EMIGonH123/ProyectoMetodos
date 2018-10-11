package interfaz;

import java.awt.Color;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class VistaCargarInfo extends javax.swing.JFrame {
    
    public VentanaPrincipal vs;
    public int variables;
    public int restricciones;
    
    public void desabilitarTodasLasVariables(){
        Coeficiente1.setEnabled(false);
        Variable1.setEnabled(false);
        Operando1.setEnabled(false);
        Coeficiente2.setEnabled(false);
        Variable2.setEnabled(false);
        Operando2.setEnabled(false);
        Coeficiente3.setEnabled(false);
        Variable3.setEnabled(false);
        Operando3.setEnabled(false);
        Coeficiente4.setEnabled(false);
        Variable4.setEnabled(false);
    }
    
    public void habilitarTodasLasVariables(){
        Coeficiente1.setEnabled(true);
        Variable1.setEnabled(true);
        Operando1.setEnabled(true);
        Coeficiente2.setEnabled(true);
        Variable2.setEnabled(true);
        Operando2.setEnabled(true);
        Coeficiente3.setEnabled(true);
        Variable3.setEnabled(true);
        Operando3.setEnabled(true);
        Coeficiente4.setEnabled(true);
        Variable4.setEnabled(true);
    }
    
    public void habilitarTodasLasRestricciones(){
        CondicionIzquierda1.setEnabled(true);
        OperadorDeRelacion1.setEnabled(true);
        CondicionDerecha1.setEnabled(true);
        CondicionIzquierda2.setEnabled(true);
        OperadorDeRelacion2.setEnabled(true);
        CondicionDerecha2.setEnabled(true);
        CondicionIzquierda3.setEnabled(true);
        OperadorDeRelacion3.setEnabled(true);
        CondicionDerecha3.setEnabled(true);
        CondicionIzquierda4.setEnabled(true);
        OperadorDeRelacion4.setEnabled(true);
        CondicionDerecha4.setEnabled(true);
        CondicionIzquierda5.setEnabled(true);
        OperadorDeRelacion5.setEnabled(true);
        CondicionDerecha5.setEnabled(true);
    }
    
    public void desabilitarTodasLasRestricciones(){
        CondicionIzquierda1.setEnabled(false);
        OperadorDeRelacion1.setEnabled(false);
        CondicionDerecha1.setEnabled(false);
        CondicionIzquierda2.setEnabled(false);
        OperadorDeRelacion2.setEnabled(false);
        CondicionDerecha2.setEnabled(false);
        CondicionIzquierda3.setEnabled(false);
        OperadorDeRelacion3.setEnabled(false);
        CondicionDerecha3.setEnabled(false);
        CondicionIzquierda4.setEnabled(false);
        OperadorDeRelacion4.setEnabled(false);
        CondicionDerecha4.setEnabled(false);
        CondicionIzquierda5.setEnabled(false);
        OperadorDeRelacion5.setEnabled(false);
        CondicionDerecha5.setEnabled(false);
    }
    
    public void resetAllColors(){
        BtnLimpiar.setBackground(new Color(204,204,204));
        BtnResolver.setBackground(new Color(204,204,204));
    }
    
    public void setColor(JTextField jtf){
        jtf.setBackground(new Color(153,255,0));
    }
    
    public void hablititarCeldas(int variables, int restricciones){
        switch( variables ){
            case 1:
                desabilitarTodasLasVariables();
                Coeficiente1.setEnabled(true);
                Variable1.setEnabled(true);
                break;
            
            case 2:
                desabilitarTodasLasVariables();
                Coeficiente1.setEnabled(true);
                Variable1.setEnabled(true);
                Operando1.setEnabled(true); 
                Coeficiente2.setEnabled(true);
                Variable2.setEnabled(true);
                break;
                
            case 3:
                desabilitarTodasLasVariables();
                Coeficiente1.setEnabled(true);
                Variable1.setEnabled(true);
                Operando1.setEnabled(true); 
                Coeficiente2.setEnabled(true);
                Variable2.setEnabled(true);
                Operando2.setEnabled(true); 
                Coeficiente3.setEnabled(true);
                Variable3.setEnabled(true);
                break;
            case 4:
                habilitarTodasLasVariables();
                break;
        }
        
        switch( restricciones ){
            case 1:
                desabilitarTodasLasRestricciones();
                CondicionIzquierda1.setEnabled(true);
                OperadorDeRelacion1.setEnabled(true);
                CondicionDerecha1.setEnabled(true);
                break;
            
            case 2:
                desabilitarTodasLasRestricciones();
                CondicionIzquierda1.setEnabled(true);
                OperadorDeRelacion1.setEnabled(true);
                CondicionDerecha1.setEnabled(true);
                CondicionIzquierda2.setEnabled(true);
                OperadorDeRelacion2.setEnabled(true);
                CondicionDerecha2.setEnabled(true);
                break;
                
            case 3:
                desabilitarTodasLasRestricciones();
                CondicionIzquierda1.setEnabled(true);
                OperadorDeRelacion1.setEnabled(true);
                CondicionDerecha1.setEnabled(true);
                CondicionIzquierda2.setEnabled(true);
                OperadorDeRelacion2.setEnabled(true);
                CondicionDerecha2.setEnabled(true);
                CondicionIzquierda3.setEnabled(true);
                OperadorDeRelacion3.setEnabled(true);
                CondicionDerecha3.setEnabled(true);
                break;
                
            case 4:
                desabilitarTodasLasRestricciones();
                CondicionIzquierda1.setEnabled(true);
                OperadorDeRelacion1.setEnabled(true);
                CondicionDerecha1.setEnabled(true);
                CondicionIzquierda2.setEnabled(true);
                OperadorDeRelacion2.setEnabled(true);
                CondicionDerecha2.setEnabled(true);
                CondicionIzquierda3.setEnabled(true);
                OperadorDeRelacion3.setEnabled(true);
                CondicionDerecha3.setEnabled(true);
                CondicionIzquierda4.setEnabled(true);
                OperadorDeRelacion4.setEnabled(true);
                CondicionDerecha4.setEnabled(true);
                break;
                
            case 5:
                habilitarTodasLasRestricciones();
                break;
        }
    }
    
    public void limpiarCeldas(){
        Coeficiente1.setText("");
        Coeficiente2.setText("");
        Coeficiente3.setText("");
        Coeficiente4.setText("");
        CondicionDerecha1.setText("");
        CondicionDerecha2.setText("");
        CondicionDerecha3.setText("");
        CondicionDerecha4.setText("");
        CondicionDerecha5.setText("");
        CondicionIzquierda1.setText("");
        CondicionIzquierda2.setText("");
        CondicionIzquierda3.setText("");
        CondicionIzquierda4.setText("");
        CondicionIzquierda5.setText("");
        
    }
    
    public VistaCargarInfo(VentanaPrincipal vs, int variables, int restricciones) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.vs = vs;
        this.variables = variables;
        this.restricciones = restricciones;
        hablititarCeldas(variables, restricciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        FuncionObjetivo = new javax.swing.JLabel();
        Restricciones = new javax.swing.JLabel();
        Variable1 = new javax.swing.JComboBox<>();
        CondicionIzquierda1 = new javax.swing.JTextField();
        CondicionDerecha1 = new javax.swing.JTextField();
        Coeficiente1 = new javax.swing.JTextField();
        Operando1 = new javax.swing.JComboBox<>();
        OperadorDeRelacion1 = new javax.swing.JComboBox<>();
        Coeficiente2 = new javax.swing.JTextField();
        Variable2 = new javax.swing.JComboBox<>();
        Operando2 = new javax.swing.JComboBox<>();
        Coeficiente3 = new javax.swing.JTextField();
        Variable3 = new javax.swing.JComboBox<>();
        Operando3 = new javax.swing.JComboBox<>();
        Coeficiente4 = new javax.swing.JTextField();
        Variable4 = new javax.swing.JComboBox<>();
        FuncionO = new javax.swing.JLabel();
        CondicionIzquierda2 = new javax.swing.JTextField();
        OperadorDeRelacion2 = new javax.swing.JComboBox<>();
        CondicionDerecha2 = new javax.swing.JTextField();
        CondicionIzquierda3 = new javax.swing.JTextField();
        OperadorDeRelacion3 = new javax.swing.JComboBox<>();
        CondicionDerecha3 = new javax.swing.JTextField();
        CondicionIzquierda4 = new javax.swing.JTextField();
        OperadorDeRelacion4 = new javax.swing.JComboBox<>();
        CondicionDerecha4 = new javax.swing.JTextField();
        CondicionIzquierda5 = new javax.swing.JTextField();
        OperadorDeRelacion5 = new javax.swing.JComboBox<>();
        CondicionDerecha5 = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JTextField();
        BtnResolver = new javax.swing.JTextField();
        Operando4 = new javax.swing.JComboBox<>();
        Coeficiente5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTitulo.setBackground(new java.awt.Color(153, 255, 0));

        Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cargar Información");

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

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(BtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        FuncionObjetivo.setBackground(new java.awt.Color(204, 204, 204));
        FuncionObjetivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FuncionObjetivo.setForeground(new java.awt.Color(255, 255, 255));
        FuncionObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FuncionObjetivo.setText("Función Objetivo");

        Restricciones.setBackground(new java.awt.Color(204, 204, 204));
        Restricciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Restricciones.setForeground(new java.awt.Color(255, 255, 255));
        Restricciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Restricciones.setText("Restricciones");

        Variable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e" }));

        Operando1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        Operando1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operando1ActionPerformed(evt);
            }
        });

        OperadorDeRelacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "<=", "=" }));

        Variable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e" }));

        Operando2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        Operando2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operando2ActionPerformed(evt);
            }
        });

        Variable3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e" }));

        Operando3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        Operando3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operando3ActionPerformed(evt);
            }
        });

        Variable4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e" }));

        FuncionO.setBackground(new java.awt.Color(204, 204, 204));
        FuncionO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FuncionO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FuncionO.setText("Z = ");

        OperadorDeRelacion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "<=", "=" }));

        OperadorDeRelacion3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "<=", "=" }));

        OperadorDeRelacion4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "<=", "=" }));

        OperadorDeRelacion5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", ">=", "<=", "=" }));

        BtnLimpiar.setEditable(false);
        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseMoved(evt);
            }
        });
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseExited(evt);
            }
        });

        BtnResolver.setEditable(false);
        BtnResolver.setBackground(new java.awt.Color(204, 204, 204));
        BtnResolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnResolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnResolver.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BtnResolver.setText("Resolver");
        BtnResolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnResolverMouseMoved(evt);
            }
        });
        BtnResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnResolverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnResolverMouseExited(evt);
            }
        });

        Operando4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        Operando4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Operando4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(FuncionO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Coeficiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Variable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Operando1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Coeficiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Variable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(Operando2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Coeficiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Variable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Operando3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Coeficiente4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Variable4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Operando4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Coeficiente5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FuncionObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Restricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(CondicionIzquierda2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OperadorDeRelacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondicionDerecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(CondicionIzquierda1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OperadorDeRelacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondicionDerecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(CondicionIzquierda3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OperadorDeRelacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondicionDerecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(CondicionIzquierda4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OperadorDeRelacion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondicionDerecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(CondicionIzquierda5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OperadorDeRelacion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondicionDerecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FuncionObjetivo)
                .addGap(6, 6, 6)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Coeficiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Variable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operando1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coeficiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Variable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operando2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coeficiente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Variable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operando3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coeficiente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Variable4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuncionO, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operando4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coeficiente5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Restricciones)
                .addGap(12, 12, 12)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CondicionIzquierda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperadorDeRelacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CondicionDerecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CondicionIzquierda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperadorDeRelacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CondicionDerecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CondicionIzquierda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperadorDeRelacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CondicionDerecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CondicionIzquierda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperadorDeRelacion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CondicionDerecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CondicionIzquierda5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperadorDeRelacion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CondicionDerecha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 790, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        vs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void Operando1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operando1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Operando1ActionPerformed

    private void Operando2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operando2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Operando2ActionPerformed

    private void Operando3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operando3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Operando3ActionPerformed

    private void BtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseClicked
        limpiarCeldas();
        hablititarCeldas(variables, restricciones);
    }//GEN-LAST:event_BtnLimpiarMouseClicked

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        resetAllColors();
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseMoved
        resetAllColors();
        setColor(BtnLimpiar);
    }//GEN-LAST:event_BtnLimpiarMouseMoved

    public StringBuilder getRestriccion(int num){
        StringBuilder restriccion = new StringBuilder();
        CondicionIzquierda1.getText();
        return restriccion;
    }
    
    private void BtnResolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResolverMouseClicked
        StringBuilder funcionObjetivo = new StringBuilder();
        StringBuilder restriccion1 = new StringBuilder();
        StringBuilder restriccion2 = new StringBuilder();
        StringBuilder restriccion3 = new StringBuilder();
        StringBuilder restriccion4 = new StringBuilder();
        StringBuilder restriccion5 = new StringBuilder();
        
        /********************/
        /* Funcion Objetivo */
        /********************/
        String coef1, coef2, coef3, coef4, coef5;
        String var1, var2, var3, var4;
        String op1, op2, op3, op4;
        
        String ci1, ci2, ci3, ci4, ci5;
        String or1, or2, or3, or4, or5;
        String cd1, cd2, cd3, cd4, cd5;
        
        op4 = Operando4.getSelectedItem().toString();
        coef5 = Coeficiente5.getText();
        coef5 = (coef5.equals(""))?"0":coef5;
        
        switch( variables ){
            case 1:
                coef1 = Coeficiente1.getText();
                var1 = Variable1.getSelectedItem().toString();
                funcionObjetivo.append(coef1+var1+op4+coef5);
                break;
            
            case 2:
                coef1 = Coeficiente1.getText();
                var1 = Variable1.getSelectedItem().toString();
                op1 = Operando1.getSelectedItem().toString();
                coef2 = Coeficiente2.getText();
                var2 = Variable2.getSelectedItem().toString();
                funcionObjetivo.append(coef1+var1+op1+coef2+var2+op4+coef5);
                break;
            
            case 3:
                coef1 = Coeficiente1.getText();
                var1 = Variable1.getSelectedItem().toString();
                op1 = Operando1.getSelectedItem().toString();
                coef2 = Coeficiente2.getText();
                var2 = Variable2.getSelectedItem().toString();
                op2 = Operando2.getSelectedItem().toString();
                coef3 = Coeficiente3.getText();
                var3 = Variable3.getSelectedItem().toString();
                funcionObjetivo.append(coef1+var1+op1+coef2+var2+op2+coef3+var3+op4+coef5);
                break;
            
            case 4:
                coef1 = Coeficiente1.getText();
                var1 = Variable1.getSelectedItem().toString();
                op1 = Operando1.getSelectedItem().toString();
                coef2 = Coeficiente2.getText();
                var2 = Variable2.getSelectedItem().toString();
                op2 = Operando2.getSelectedItem().toString();
                coef3 = Coeficiente3.getText();
                var3 = Variable3.getSelectedItem().toString();
                op3 = Operando2.getSelectedItem().toString();
                coef4 = Coeficiente3.getText();
                var4 = Variable3.getSelectedItem().toString();
                funcionObjetivo.append(coef1+var1+op1+coef2+var2+op2+coef3+var3+op3+coef4+var4+op4+coef5);
                break;
        }
        
        /*****************/
        /* Restricciones */
        /*****************/
        switch( restricciones ){
            case 1:
                ci1 = CondicionIzquierda1.getText();
                or1 = OperadorDeRelacion1.getSelectedItem().toString();
                cd1 = CondicionDerecha1.getText();
                restriccion1.append(ci1+or1+cd1);
                break;
            
            case 2:
                ci1 = CondicionIzquierda1.getText();
                or1 = OperadorDeRelacion1.getSelectedItem().toString();
                cd1 = CondicionDerecha1.getText();
                restriccion1.append(ci1+or1+cd1);
                
                ci2 = CondicionIzquierda2.getText();
                or2 = OperadorDeRelacion2.getSelectedItem().toString();
                cd2 = CondicionDerecha2.getText();
                restriccion2.append(ci2+or2+cd2);
                break;
            
            case 3:
                ci1 = CondicionIzquierda1.getText();
                or1 = OperadorDeRelacion1.getSelectedItem().toString();
                cd1 = CondicionDerecha1.getText();
                restriccion1.append(ci1+or1+cd1);
                
                ci2 = CondicionIzquierda2.getText();
                or2 = OperadorDeRelacion2.getSelectedItem().toString();
                cd2 = CondicionDerecha2.getText();
                restriccion2.append(ci2+or2+cd2);
                
                ci3 = CondicionIzquierda3.getText();
                or3 = OperadorDeRelacion3.getSelectedItem().toString();
                cd3 = CondicionDerecha3.getText();
                restriccion3.append(ci3+or3+cd3);
                break;
            
            case 4:
                ci1 = CondicionIzquierda1.getText();
                or1 = OperadorDeRelacion1.getSelectedItem().toString();
                cd1 = CondicionDerecha1.getText();
                restriccion1.append(ci1+or1+cd1);
                
                ci2 = CondicionIzquierda2.getText();
                or2 = OperadorDeRelacion2.getSelectedItem().toString();
                cd2 = CondicionDerecha2.getText();
                restriccion2.append(ci2+or2+cd2);
                
                ci3 = CondicionIzquierda3.getText();
                or3 = OperadorDeRelacion3.getSelectedItem().toString();
                cd3 = CondicionDerecha3.getText();
                restriccion3.append(ci3+or3+cd3);
                
                ci4 = CondicionIzquierda4.getText();
                or4 = OperadorDeRelacion4.getSelectedItem().toString();
                cd4 = CondicionDerecha4.getText();
                restriccion4.append(ci4+or4+cd4);
                break;
                
            case 5:
                ci1 = CondicionIzquierda1.getText();
                or1 = OperadorDeRelacion1.getSelectedItem().toString();
                cd1 = CondicionDerecha1.getText();
                restriccion1.append(ci1+or1+cd1);
                
                ci2 = CondicionIzquierda2.getText();
                or2 = OperadorDeRelacion2.getSelectedItem().toString();
                cd2 = CondicionDerecha2.getText();
                restriccion2.append(ci2+or2+cd2);
                
                ci3 = CondicionIzquierda3.getText();
                or3 = OperadorDeRelacion3.getSelectedItem().toString();
                cd3 = CondicionDerecha3.getText();
                restriccion3.append(ci3+or3+cd3);
                
                ci4 = CondicionIzquierda4.getText();
                or4 = OperadorDeRelacion4.getSelectedItem().toString();
                cd4 = CondicionDerecha4.getText();
                restriccion4.append(ci4+or4+cd4);
                
                ci5 = CondicionIzquierda5.getText();
                or5 = OperadorDeRelacion5.getSelectedItem().toString();
                cd5 = CondicionDerecha5.getText();
                restriccion5.append(ci5+or5+cd5);
                break;
        }
        
        imprimirCadenaFO( funcionObjetivo );
        imprimirCadenaRestriccion( restriccion1 );
        imprimirCadenaRestriccion( restriccion2 );
        imprimirCadenaRestriccion( restriccion3 );
        imprimirCadenaRestriccion( restriccion4 );
        imprimirCadenaRestriccion( restriccion5 );
        
        String cadena01 = quitarEspacios( restriccion1 ); 
        String cadena02 = quitarEspacios( restriccion2 ); 
        String cadena03 = quitarEspacios( restriccion3 ); 
        String cadena04 = quitarEspacios( restriccion4 ); 
        String cadena05 = quitarEspacios( restriccion5 ); 
        
        double restricion1[] = getCoeficientes( cadena01 );
        double restricion2[] = getCoeficientes( cadena02 );
        double restricion3[] = getCoeficientes( cadena03 );
        double restricion4[] = getCoeficientes( cadena04 );
        double restricion5[] = getCoeficientes( cadena05 );
        
        Hashtable<Integer, double[]> conjuntoRestricciones = new Hashtable<Integer, double[]>();
        conjuntoRestricciones.put(1, restricion1);
        conjuntoRestricciones.put(2, restricion2);
        conjuntoRestricciones.put(3, restricion3);
        conjuntoRestricciones.put(4, restricion4);
        conjuntoRestricciones.put(5, restricion5);
        
        metodoAnalitico(variables, restricciones, conjuntoRestricciones);
        
    }//GEN-LAST:event_BtnResolverMouseClicked

    public void metodoAnalitico(int numVariables,int numRestricciones, Hashtable<Integer, double[]> conjuntoRestricciones){
        int i,j;
        for( i=1 ; i<numRestricciones ; i++ ){
            for( j=i+1 ; j<6 ; j++ ){
                System.out.println(i+" "+j);
            }
        }
    }
    
    public double[] getCoeficientes(String cadena){
        String funciones[] = cadena.split("(<|>|>=|<=)");
        double [] resultado1 = separarCoeficientes( funciones[0] );
        double [] resultado2 = separarCoeficientes( funciones[1] );
        double valorCoeficietes[] = {0.0,0.0,0.0,0.0,0.0,0.0};
        for( int i=0; i<valorCoeficietes.length; i++ ){
            valorCoeficietes[i] += ( resultado1[i] + resultado2[i] );
            System.out.println("X"+i+": "+valorCoeficietes[i]);
        }
        return valorCoeficietes;
    }
    
    public double[] separarCoeficientes( String cadena ){
        double valores[] = {0.0,0.0,0.0,0.0,0.0,0.0};
        String coeficientes[] = cadena.split("(\\*)?(a|b|c|d)?(\\+|-)");
        imprimirCoeficientes(coeficientes);
        for(int i= 0; i<coeficientes.length; i++){
            valores[i] += Double.parseDouble(coeficientes[i]);
        }
        return valores;
    }
    
    public void imprimirCoeficientes(String coeficientes[]){
        int i = 0;
        while( i < coeficientes.length ){
            System.out.println(coeficientes[i++]);
        }
    }
    
    public void imprimirCadenaFO( StringBuilder cadena ){
        if( cadena.length() > 0 ){
            if( analizarFO( cadena ) ){
                System.out.println( "Cadena: "+cadena.toString() );
            }
        }
    }
    public void imprimirCadenaRestriccion( StringBuilder cadena ){
        if( cadena.length() > 0 ){
            if( analizarRestriccion(cadena ) ){
                System.out.println( "Cadena: "+cadena.toString() );
            }
        }
    }
    
    public Boolean analizarRestriccion(StringBuilder cadena){
        String operandos ="(\\d)+(\\.(\\d)+)?(\\*)?(a|b|c|d)"; 
        String ecuacion = operandos+"(\\s)*((\\+|-)(\\s)*"+operandos+"){0,3}(\\s)*";
        String er = ecuacion+"((\\+|-)(\\s)*(\\d)*)?(\\s)*(<=|>=|<|>|=)(\\s)*("+ecuacion+")?(\\s)*(\\+|-)?(\\s)*(\\d)+(\\s)*";
        Pattern pat = Pattern.compile(er);
        Matcher mat = pat.matcher(cadena.toString());
        if(mat.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    public String quitarEspacios( StringBuilder cadena ){
        return (cadena.toString().replace(" ", ""));
    }
    
    public Boolean analizarFO(StringBuilder cadena){
        String operandos ="(\\d)+(\\.(\\d)+)?(\\*)?(a|b|c|d)"; 
        String er = operandos+"(\\s)*((\\+|-)(\\s)*"+operandos+"){0,3}(\\s)*(\\+|-)(\\d)+";
        Pattern pat = Pattern.compile(er);
        Matcher mat = pat.matcher(cadena.toString());
        if(mat.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    
    private void BtnResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResolverMouseExited
        resetAllColors();
    }//GEN-LAST:event_BtnResolverMouseExited

    private void BtnResolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResolverMouseMoved
        resetAllColors();
        setColor(BtnResolver);
    }//GEN-LAST:event_BtnResolverMouseMoved

    private void Operando4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Operando4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Operando4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BtnLimpiar;
    private javax.swing.JTextField BtnResolver;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JTextField Coeficiente1;
    private javax.swing.JTextField Coeficiente2;
    private javax.swing.JTextField Coeficiente3;
    private javax.swing.JTextField Coeficiente4;
    private javax.swing.JTextField Coeficiente5;
    private javax.swing.JTextField CondicionDerecha1;
    private javax.swing.JTextField CondicionDerecha2;
    private javax.swing.JTextField CondicionDerecha3;
    private javax.swing.JTextField CondicionDerecha4;
    private javax.swing.JTextField CondicionDerecha5;
    private javax.swing.JTextField CondicionIzquierda1;
    private javax.swing.JTextField CondicionIzquierda2;
    private javax.swing.JTextField CondicionIzquierda3;
    private javax.swing.JTextField CondicionIzquierda4;
    private javax.swing.JTextField CondicionIzquierda5;
    private javax.swing.JLabel FuncionO;
    private javax.swing.JLabel FuncionObjetivo;
    private javax.swing.JComboBox<String> OperadorDeRelacion1;
    private javax.swing.JComboBox<String> OperadorDeRelacion2;
    private javax.swing.JComboBox<String> OperadorDeRelacion3;
    private javax.swing.JComboBox<String> OperadorDeRelacion4;
    private javax.swing.JComboBox<String> OperadorDeRelacion5;
    private javax.swing.JComboBox<String> Operando1;
    private javax.swing.JComboBox<String> Operando2;
    private javax.swing.JComboBox<String> Operando3;
    private javax.swing.JComboBox<String> Operando4;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JLabel Restricciones;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> Variable1;
    private javax.swing.JComboBox<String> Variable2;
    private javax.swing.JComboBox<String> Variable3;
    private javax.swing.JComboBox<String> Variable4;
    // End of variables declaration//GEN-END:variables
}
