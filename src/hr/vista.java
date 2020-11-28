/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class vista extends javax.swing.JFrame {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbregasi";

    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConnection() {

        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idempleadoDatosGeneralesBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombresDatosGeneralesBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidopaternoDatosGeneralesBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidomaternoDatosGeneralesBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        curpDatosGeneralesBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaingresoDatosGeneralesBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        calleDatosGeneralesBox = new javax.swing.JTextField();
        numeroextDatosGeneralesBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numerointDatosGeneralesBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        coloniaDatosGeneralesBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cpDatosGeneralesBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        municipioDatosGeneralesComboBox = new javax.swing.JComboBox<>();
        estadoDatosGeneralesComboBox = new javax.swing.JComboBox<>();
        modificarDatosGeneralesBtn = new javax.swing.JButton();
        guardarDatosGeneralesBtn = new javax.swing.JButton();
        limpiarDatosGeneralesBtn = new javax.swing.JButton();
        actualizarDatosGeneralesBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        domingoEntradaHorarioBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lunesEntradaHorarioBox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        martesEntradaHorarioBox = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        miercolesEntradaHorarioBox = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        juevesEntradaHorarioBox = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        viernesEntradaHorarioBox = new javax.swing.JTextField();
        sabadoEntradaHorarioBox = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        domingoSalidaHorarioBox = new javax.swing.JTextField();
        lunesSalidaHorarioBox = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        martesSalidaHorarioBox = new javax.swing.JTextField();
        miercolesSalidaHorarioBox = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        juevesSalidaHorarioBox = new javax.swing.JTextField();
        viernesSalidaHorarioBox = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sabadoSalidaHorarioBox = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        actualizarHorarioBox = new javax.swing.JButton();
        limpiarHorariosBox = new javax.swing.JButton();
        actualizarHorariosBox = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        idHorarioBox = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        descripcionHorarioBox = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        limpiarHorarioBox = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        estadoHorarioComboBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        fechainicioHorariosEmpleadoBox = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        guardarHorariosEmpleadoBtn = new javax.swing.JButton();
        actualizarHorariosEmpleadoBtn = new javax.swing.JButton();
        limpiarHorariosEmpleadoBtn = new javax.swing.JButton();
        modificarHorariosEmpleadoBtn = new javax.swing.JButton();
        idhorarioHorariosEmpleadoComboBox = new javax.swing.JComboBox<>();
        idempleadoHorariosEmpleadoComboBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        motivoDiasNoLabBox = new javax.swing.JTextField();
        limpiarDiasNoLabBtn = new javax.swing.JButton();
        guardarDiasNoLabBtn = new javax.swing.JButton();
        jLabel167 = new javax.swing.JLabel();
        fechaDiasNoLabBox = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        estadoDiasNoLabComboBox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        subirRegistroAsistBtn = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        diaJustificantesComboBox = new javax.swing.JComboBox<>();
        tipoJustificantesComboBox = new javax.swing.JComboBox<>();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        descripcionJustificantesBox = new javax.swing.JTextField();
        idempleadoJustificantesComboBox = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        fechainicioIncidenciasBox = new javax.swing.JTextField();
        fechafinIncidenciasBox = new javax.swing.JTextField();
        procesarIncidenciasBtn = new javax.swing.JButton();
        jLabel166 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("DATOS GENERALES");
        jLabel1.setToolTipText("");

        idempleadoDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idempleadoDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("Estado:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("Nombres");
        jLabel3.setToolTipText("");

        nombresDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno:");
        jLabel4.setToolTipText("");

        apellidopaternoDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidopaternoDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Materno:");
        jLabel5.setToolTipText("");

        apellidomaternoDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidomaternoDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setText("CURP");
        jLabel6.setToolTipText("");

        curpDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setText("Fecha de Ingreso:");
        jLabel7.setToolTipText("");

        fechaingresoDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaingresoDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setText("Calle:");
        jLabel8.setToolTipText("");

        calleDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleDatosGeneralesBoxActionPerformed(evt);
            }
        });

        numeroextDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroextDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel9.setText("Num ext.");
        jLabel9.setToolTipText("");

        numerointDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerointDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setText("Nun int.");
        jLabel10.setToolTipText("");

        coloniaDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloniaDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setText("Colonia ");
        jLabel11.setToolTipText("");

        cpDatosGeneralesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDatosGeneralesBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel12.setText("CP");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel13.setText("ID Empleado ");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel14.setText("Municipio/alcaldia ");
        jLabel14.setToolTipText("");

        municipioDatosGeneralesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        estadoDatosGeneralesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        modificarDatosGeneralesBtn.setBackground(new java.awt.Color(51, 255, 153));
        modificarDatosGeneralesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        modificarDatosGeneralesBtn.setText("MODIFICAR");

        guardarDatosGeneralesBtn.setBackground(new java.awt.Color(51, 255, 153));
        guardarDatosGeneralesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        guardarDatosGeneralesBtn.setText("GUARDAR");
        guardarDatosGeneralesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosGeneralesBtnActionPerformed(evt);
            }
        });

        limpiarDatosGeneralesBtn.setBackground(new java.awt.Color(51, 255, 153));
        limpiarDatosGeneralesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        limpiarDatosGeneralesBtn.setText("LIMPIAR");

        actualizarDatosGeneralesBtn.setBackground(new java.awt.Color(51, 255, 153));
        actualizarDatosGeneralesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        actualizarDatosGeneralesBtn.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idempleadoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombresDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidopaternoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidomaternoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curpDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaingresoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calleDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroextDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numerointDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coloniaDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadoDatosGeneralesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(municipioDatosGeneralesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(modificarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(actualizarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idempleadoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombresDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidopaternoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidomaternoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curpDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaingresoDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calleDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroextDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerointDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coloniaDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDatosGeneralesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipioDatosGeneralesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoDatosGeneralesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarDatosGeneralesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS GENERALES ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel16.setText("Domingo");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel17.setText("Lunes");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel18.setText("Martes");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel19.setText("Miercoles");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel20.setText("Jueves");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel21.setText("Viernes");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel22.setText("Sabado");

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel23.setText("Domingo");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel24.setText("Lunes");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel25.setText("Martes");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel26.setText("Miercoles");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel27.setText("Jueves");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel28.setText("Viernes");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel29.setText("Sabado");

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel30.setText("Hora de Entrada");

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel40.setText("HORARIOS ");

        jLabel42.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel42.setText("Domingo");

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel43.setText("Lunes");

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel44.setText("Martes");

        jLabel45.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel45.setText("Miercoles");

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel46.setText("Jueves");

        jLabel47.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel47.setText("Viernes");

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel48.setText("Sabado");

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel49.setText("Hora de Salida");

        jLabel50.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel50.setText("Domingo");

        jLabel51.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel51.setText("Lunes");

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel52.setText("Martes");

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel53.setText("Miercoles");

        jLabel54.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel54.setText("Jueves");

        jLabel55.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel55.setText("Viernes");

        jLabel56.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel56.setText("Sabado");

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel57.setText("...");

        jLabel58.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel58.setText("...");

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel59.setText("...");

        jLabel60.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel60.setText("...");

        jLabel61.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel61.setText("...");

        jLabel62.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel62.setText("...");

        jLabel63.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel63.setText("...");

        jLabel64.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel64.setText("...");

        jLabel65.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel65.setText("...");

        jLabel66.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel66.setText("...");

        jLabel67.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel67.setText("...");

        jLabel68.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel68.setText("...");

        jLabel69.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel69.setText("...");

        jLabel70.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel70.setText("...");

        actualizarHorarioBox.setBackground(new java.awt.Color(51, 255, 51));
        actualizarHorarioBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        actualizarHorarioBox.setText("ACTUALIZAR");
        actualizarHorarioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarHorarioBoxActionPerformed(evt);
            }
        });

        limpiarHorariosBox.setBackground(new java.awt.Color(51, 255, 51));
        limpiarHorariosBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        limpiarHorariosBox.setText("LIMPIAR");

        actualizarHorariosBox.setBackground(new java.awt.Color(51, 255, 51));
        actualizarHorariosBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        actualizarHorariosBox.setText("ACTUALIZAR");

        jLabel73.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel73.setText("ID");

        jLabel74.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel74.setText("Descripción:");

        jLabel75.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel75.setText("Hora de Salida");

        jLabel146.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel146.setText("Hora de Salida");

        limpiarHorarioBox.setBackground(new java.awt.Color(51, 255, 51));
        limpiarHorarioBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        limpiarHorarioBox.setText("LIMPIAR");

        jLabel147.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel147.setText("Estado:");

        estadoHorarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sabadoEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viernesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(juevesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(miercolesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domingoEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lunesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(martesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domingoSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lunesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(martesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(limpiarHorariosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sabadoSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viernesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(juevesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(miercolesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel63))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel51)
                                            .addComponent(jLabel52))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel59)
                                            .addComponent(jLabel58)
                                            .addComponent(jLabel57)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel55))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62)
                                            .addComponent(jLabel61)
                                            .addComponent(jLabel60))))
                                .addGap(111, 111, 111)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel42))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel65)
                                            .addComponent(jLabel64)
                                            .addComponent(jLabel69)
                                            .addComponent(jLabel68)
                                            .addComponent(jLabel67)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel49))
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel74)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descripcionHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(actualizarHorariosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limpiarHorarioBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualizarHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel147)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estadoHorarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(231, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel146)
                    .addContainerGap(568, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel40)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(idHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(descripcionHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(estadoHorarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarHorarioBox))
                .addGap(3, 3, 3)
                .addComponent(jLabel30)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(domingoSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(lunesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(martesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(miercolesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(juevesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(viernesSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel58))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel59))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel60))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel61))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel63)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel48))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel65)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel66)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel70)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(sabadoSalidaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(domingoEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lunesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(martesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(miercolesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(juevesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(viernesEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(sabadoEntradaHorarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarHorariosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarHorariosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jLabel146)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("CATALOGO DE HORARIOS ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));

        jLabel71.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel71.setText("Id Horario");

        jLabel72.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel72.setText("Id Empleado");

        jLabel76.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel76.setText("Descripción del Hoario");

        jLabel77.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel77.setText("...");

        jLabel78.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel78.setText("Nombres");

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel79.setText("...");

        jLabel80.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel80.setText("Apellido Paterno");

        jLabel81.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel81.setText("...");

        jLabel82.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel82.setText("Apellido Materno");

        jLabel83.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel83.setText("...");

        jLabel84.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel84.setText("Fecha de Inicio ");

        jLabel86.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel86.setText("Estado");

        jLabel87.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel87.setText("...");

        jLabel88.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel88.setText(" Horarios de Entradas  ");

        jLabel89.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel89.setText("Horarios de Salidas");

        jLabel90.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel90.setText("Lunes");

        jLabel91.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel91.setText("Domingo ");

        jLabel92.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel92.setText("Martes");

        jLabel93.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel93.setText("Miércoles  ");

        jLabel94.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel94.setText("Jueves");

        jLabel95.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel95.setText("Viernes");

        jLabel96.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel96.setText("Sábado");

        jLabel97.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel97.setText("Domingo");

        jLabel98.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel98.setText("Lunes");

        jLabel99.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel99.setText("Martes");

        jLabel100.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel100.setText("Miércoles ");

        jLabel101.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel101.setText("Jueves");

        jLabel102.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel102.setText("Viernes");

        jLabel103.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel103.setText("Sabado");

        jLabel104.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel104.setText("...");

        jLabel105.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel105.setText("...");

        jLabel106.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel106.setText("...");

        jLabel107.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel107.setText("...");

        jLabel108.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel108.setText("...");

        jLabel109.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel109.setText("...");

        jLabel110.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel110.setText("...");

        jLabel111.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel111.setText("...");

        jLabel112.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel112.setText("...");

        jLabel113.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel113.setText("...");

        jLabel114.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel114.setText("...");

        jLabel115.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel115.setText("...");

        jLabel116.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel116.setText("...");

        jLabel117.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel117.setText("...");

        jLabel118.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel118.setText("HORARIOS POR EMPLEADO");

        guardarHorariosEmpleadoBtn.setBackground(new java.awt.Color(51, 255, 102));
        guardarHorariosEmpleadoBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        guardarHorariosEmpleadoBtn.setText("GUARDAR");

        actualizarHorariosEmpleadoBtn.setBackground(new java.awt.Color(51, 255, 102));
        actualizarHorariosEmpleadoBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        actualizarHorariosEmpleadoBtn.setText("ACTUALIZAR");

        limpiarHorariosEmpleadoBtn.setBackground(new java.awt.Color(51, 255, 102));
        limpiarHorariosEmpleadoBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        limpiarHorariosEmpleadoBtn.setText("LIMPIAR");

        modificarHorariosEmpleadoBtn.setBackground(new java.awt.Color(51, 255, 102));
        modificarHorariosEmpleadoBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        modificarHorariosEmpleadoBtn.setText("MODIFICAR");

        idhorarioHorariosEmpleadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        idempleadoHorariosEmpleadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 230, Short.MAX_VALUE)
                        .addComponent(modificarHorariosEmpleadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarHorariosEmpleadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualizarHorariosEmpleadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarHorariosEmpleadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idhorarioHorariosEmpleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel77))
                            .addComponent(jLabel118)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel82)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel83))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idempleadoHorariosEmpleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel87))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel78)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel79)
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel81))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel88)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel89))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel96))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel108)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel104))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel116)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel112)
                                    .addComponent(jLabel111)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechainicioHorariosEmpleadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(jLabel78)
                        .addComponent(jLabel79)
                        .addComponent(jLabel80)
                        .addComponent(jLabel81))
                    .addComponent(idempleadoHorariosEmpleadoComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(idhorarioHorariosEmpleadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechainicioHorariosEmpleadoBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(jLabel107))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(jLabel108))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel109))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(jLabel110)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel103))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarHorariosEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(actualizarHorariosEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(limpiarHorariosEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(modificarHorariosEmpleadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("HORARIOS POR EMPLEADO", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        jLabel119.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel119.setText("DIAS NO LABORABLES");

        jLabel131.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel131.setText("Motivo:");

        limpiarDiasNoLabBtn.setBackground(new java.awt.Color(0, 255, 153));
        limpiarDiasNoLabBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        limpiarDiasNoLabBtn.setText("LIMPIAR");

        guardarDiasNoLabBtn.setBackground(new java.awt.Color(0, 255, 153));
        guardarDiasNoLabBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        guardarDiasNoLabBtn.setText("GUARDAR");

        jLabel167.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel167.setText("Fecha:");

        fechaDiasNoLabBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaDiasNoLabBoxActionPerformed(evt);
            }
        });

        jLabel168.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel168.setText("Estado");

        estadoDiasNoLabComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motivoDiasNoLabBox))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaDiasNoLabBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoDiasNoLabComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel119))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiarDiasNoLabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarDiasNoLabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 358, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel167)
                            .addComponent(fechaDiasNoLabBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168)
                            .addComponent(estadoDiasNoLabComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel131)
                            .addComponent(motivoDiasNoLabBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(limpiarDiasNoLabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarDiasNoLabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DIAS NO LABORABLES ", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));

        jLabel120.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel120.setText("REGISTRO DE ASISTENCIA");

        subirRegistroAsistBtn.setBackground(new java.awt.Color(0, 255, 102));
        subirRegistroAsistBtn.setText("SUBIR REGISTROS ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel120)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(subirRegistroAsistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subirRegistroAsistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REGISTRO DE ASISTENCIA", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel138.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel138.setText("JUSTIFICANTES ");

        jLabel139.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel139.setText("Id Empleado");

        jLabel140.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel140.setText("Nombres ");

        jLabel141.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel141.setText("...");

        jLabel142.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel142.setText("Apellido Paterno");

        jLabel143.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel143.setText("...");

        jLabel144.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel144.setText("...");

        jLabel145.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel145.setText("Apellido Materno");

        jLabel148.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel148.setText("Estatus");

        jLabel149.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel149.setText("...");

        jLabel150.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel150.setText("Seleccione el día de la incidencia ");

        jLabel151.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel151.setText("Seleccione el tipo de incidencia");

        diaJustificantesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tipoJustificantesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel152.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel152.setText("Día de la incidencia");

        jLabel153.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel153.setText(" Tipo de incidencia");

        jLabel154.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel154.setText("Justifique la falta ");

        idempleadoJustificantesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel139)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idempleadoJustificantesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel141)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel143))
                            .addComponent(jLabel138)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel152)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel153))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel151)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tipoJustificantesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel150)
                                    .addGap(26, 26, 26)
                                    .addComponent(diaJustificantesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel145)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel144)
                                    .addGap(141, 141, 141)
                                    .addComponent(jLabel148)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel149)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel154))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descripcionJustificantesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel138)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jLabel140)
                    .addComponent(jLabel141)
                    .addComponent(jLabel142)
                    .addComponent(jLabel143)
                    .addComponent(idempleadoJustificantesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(jLabel144)
                    .addComponent(jLabel148)
                    .addComponent(jLabel149))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(diaJustificantesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(tipoJustificantesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152)
                    .addComponent(jLabel153))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcionJustificantesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("JUSTIFICANTES", jPanel3);

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));

        jLabel155.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel155.setText("Fecha de Inicio ");

        jLabel156.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel156.setText("Fecha de Fin ");

        fechainicioIncidenciasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainicioIncidenciasBoxActionPerformed(evt);
            }
        });

        fechafinIncidenciasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechafinIncidenciasBoxActionPerformed(evt);
            }
        });

        procesarIncidenciasBtn.setBackground(new java.awt.Color(0, 255, 102));
        procesarIncidenciasBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        procesarIncidenciasBtn.setText("PROCESAR INCIDENCIAS ");

        jLabel166.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel166.setText("INCIDENCIAS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel166))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(procesarIncidenciasBtn)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel155)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechainicioIncidenciasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel156)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechafinIncidenciasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel166)
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(fechainicioIncidenciasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel156)
                    .addComponent(fechafinIncidenciasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(procesarIncidenciasBtn)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INCIDENCIAS", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDatosGeneralesBoxActionPerformed

    private void coloniaDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloniaDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaDatosGeneralesBoxActionPerformed

    private void numerointDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerointDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerointDatosGeneralesBoxActionPerformed

    private void numeroextDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroextDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroextDatosGeneralesBoxActionPerformed

    private void calleDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleDatosGeneralesBoxActionPerformed

    private void fechaingresoDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaingresoDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaingresoDatosGeneralesBoxActionPerformed

    private void curpDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curpDatosGeneralesBoxActionPerformed

    private void apellidomaternoDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidomaternoDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidomaternoDatosGeneralesBoxActionPerformed

    private void apellidopaternoDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidopaternoDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidopaternoDatosGeneralesBoxActionPerformed

    private void nombresDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresDatosGeneralesBoxActionPerformed

    private void idempleadoDatosGeneralesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idempleadoDatosGeneralesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idempleadoDatosGeneralesBoxActionPerformed

    private void fechainicioIncidenciasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainicioIncidenciasBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainicioIncidenciasBoxActionPerformed

    private void fechafinIncidenciasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechafinIncidenciasBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechafinIncidenciasBoxActionPerformed

    private void actualizarHorarioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarHorarioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarHorarioBoxActionPerformed

    private void fechaDiasNoLabBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaDiasNoLabBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaDiasNoLabBoxActionPerformed

    private void guardarDatosGeneralesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosGeneralesBtnActionPerformed
        con = null;
        try {
            con = getConnection();
            //ps = con.prepareStatement("INSERT INTO persona (id, nombre, domicilio,telefono,correo_electronico,fecha_Nacimiento,genero) VALUE(?,?,?,?,?,?,?)");
            
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar Persona");
            }
            //limpiarCajas();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar Persona");
            System.err.println(e);
        }
    }//GEN-LAST:event_guardarDatosGeneralesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDatosGeneralesBtn;
    private javax.swing.JButton actualizarHorarioBox;
    private javax.swing.JButton actualizarHorariosBox;
    private javax.swing.JButton actualizarHorariosEmpleadoBtn;
    private javax.swing.JTextField apellidomaternoDatosGeneralesBox;
    private javax.swing.JTextField apellidopaternoDatosGeneralesBox;
    private javax.swing.JTextField calleDatosGeneralesBox;
    private javax.swing.JTextField coloniaDatosGeneralesBox;
    private javax.swing.JTextField cpDatosGeneralesBox;
    private javax.swing.JTextField curpDatosGeneralesBox;
    private javax.swing.JTextField descripcionHorarioBox;
    private javax.swing.JTextField descripcionJustificantesBox;
    private javax.swing.JComboBox<String> diaJustificantesComboBox;
    private javax.swing.JTextField domingoEntradaHorarioBox;
    private javax.swing.JTextField domingoSalidaHorarioBox;
    private javax.swing.JComboBox<String> estadoDatosGeneralesComboBox;
    private javax.swing.JComboBox<String> estadoDiasNoLabComboBox;
    private javax.swing.JComboBox<String> estadoHorarioComboBox;
    private javax.swing.JTextField fechaDiasNoLabBox;
    private javax.swing.JTextField fechafinIncidenciasBox;
    private javax.swing.JTextField fechaingresoDatosGeneralesBox;
    private javax.swing.JTextField fechainicioHorariosEmpleadoBox;
    private javax.swing.JTextField fechainicioIncidenciasBox;
    private javax.swing.JButton guardarDatosGeneralesBtn;
    private javax.swing.JButton guardarDiasNoLabBtn;
    private javax.swing.JButton guardarHorariosEmpleadoBtn;
    private javax.swing.JTextField idHorarioBox;
    private javax.swing.JTextField idempleadoDatosGeneralesBox;
    private javax.swing.JComboBox<String> idempleadoHorariosEmpleadoComboBox;
    private javax.swing.JComboBox<String> idempleadoJustificantesComboBox;
    private javax.swing.JComboBox<String> idhorarioHorariosEmpleadoComboBox;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField juevesEntradaHorarioBox;
    private javax.swing.JTextField juevesSalidaHorarioBox;
    private javax.swing.JButton limpiarDatosGeneralesBtn;
    private javax.swing.JButton limpiarDiasNoLabBtn;
    private javax.swing.JButton limpiarHorarioBox;
    private javax.swing.JButton limpiarHorariosBox;
    private javax.swing.JButton limpiarHorariosEmpleadoBtn;
    private javax.swing.JTextField lunesEntradaHorarioBox;
    private javax.swing.JTextField lunesSalidaHorarioBox;
    private javax.swing.JTextField martesEntradaHorarioBox;
    private javax.swing.JTextField martesSalidaHorarioBox;
    private javax.swing.JTextField miercolesEntradaHorarioBox;
    private javax.swing.JTextField miercolesSalidaHorarioBox;
    private javax.swing.JButton modificarDatosGeneralesBtn;
    private javax.swing.JButton modificarHorariosEmpleadoBtn;
    private javax.swing.JTextField motivoDiasNoLabBox;
    private javax.swing.JComboBox<String> municipioDatosGeneralesComboBox;
    private javax.swing.JTextField nombresDatosGeneralesBox;
    private javax.swing.JTextField numeroextDatosGeneralesBox;
    private javax.swing.JTextField numerointDatosGeneralesBox;
    private javax.swing.JButton procesarIncidenciasBtn;
    private javax.swing.JTextField sabadoEntradaHorarioBox;
    private javax.swing.JTextField sabadoSalidaHorarioBox;
    private javax.swing.JButton subirRegistroAsistBtn;
    private javax.swing.JComboBox<String> tipoJustificantesComboBox;
    private javax.swing.JTextField viernesEntradaHorarioBox;
    private javax.swing.JTextField viernesSalidaHorarioBox;
    // End of variables declaration//GEN-END:variables
}
