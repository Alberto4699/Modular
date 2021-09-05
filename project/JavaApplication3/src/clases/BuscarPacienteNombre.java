/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carreon
 */
public class BuscarPacienteNombre extends javax.swing.JFrame {

    /**
     * Creates new form BuscarPacienteNombre
     */
    public BuscarPacienteNombre() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputAp = new javax.swing.JTextField();
        buscarNombre = new javax.swing.JButton();
        buscarNombre1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Paciente Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Buscar por nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Buscar por apellido");

        buscarNombre.setBackground(new java.awt.Color(255, 255, 255));
        buscarNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarNombre.setText("Buscar");
        buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });

        buscarNombre1.setBackground(new java.awt.Color(255, 255, 255));
        buscarNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarNombre1.setText("Buscar");
        buscarNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombre1ActionPerformed(evt);
            }
        });

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Sexo", "Peso", "Estatura", "Edad", "Telefono", "Tipo de sangre", "Alergias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputAp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                        .addGap(213, 213, 213))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Regresar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombre1ActionPerformed
        // TODO add your handling code here:
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            String campo=inputNombre.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE pacientes.nombrePaciente = '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT pacientes.idPaciente,nombrePaciente,apellidoPPaciente,apellidoMPaciente,sexoPaciente,pesoPaciente,estaturaPaciente,edadPaciente,telefonoPaciente,tipo_sangre.nombreSangre,pacientes.alergiasPaciente \n" +
"                FROM pacientes inner join tipo_sangre on pacientes.idTipo_sangre_F=tipo_sangre.idTipo_sangre"
                + where );

                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaPacientes.setModel(modelo);                   
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                        modelo.addColumn("ID");                   
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellido paterno");
                        modelo.addColumn("Apellido Materno");
                        modelo.addColumn("Sexo");
                        modelo.addColumn("Peso");
                        modelo.addColumn("Estatura"); 
                        modelo.addColumn("Edad");
                        modelo.addColumn("Telefono");
                        modelo.addColumn("Tipo de sangre");
                        modelo.addColumn("Alergias");;                    
                    while(rs.next()){
                        Object[] filas = new Object[cantidadColumnas];
                        for(int i = 0; i<cantidadColumnas; i++){
                            filas[i] = rs.getObject(i+1);
                        }
                        modelo.addRow(filas);
                    }
            }catch (SQLException ex) {
                Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscarMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarNombre1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BuscarPaciente a = new BuscarPaciente();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreActionPerformed
        // TODO add your handling code here:
        String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            String campo=inputAp.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE pacientes.apellidoPPaciente = '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT pacientes.idPaciente,nombrePaciente,apellidoPPaciente,apellidoMPaciente,sexoPaciente,pesoPaciente,estaturaPaciente,edadPaciente,telefonoPaciente,tipo_sangre.nombreSangre,pacientes.alergiasPaciente \n" +
"                FROM pacientes inner join tipo_sangre on pacientes.idTipo_sangre_F=tipo_sangre.idTipo_sangre"
                + where );

                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaPacientes.setModel(modelo);                   
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                        modelo.addColumn("ID");                   
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellido paterno");
                        modelo.addColumn("Apellido Materno");
                        modelo.addColumn("Sexo");
                        modelo.addColumn("Peso");
                        modelo.addColumn("Estatura"); 
                        modelo.addColumn("Edad");
                        modelo.addColumn("Telefono");
                        modelo.addColumn("Tipo de sangre");
                        modelo.addColumn("Alergias");;                    
                    while(rs.next()){
                        Object[] filas = new Object[cantidadColumnas];
                        for(int i = 0; i<cantidadColumnas; i++){
                            filas[i] = rs.getObject(i+1);
                        }
                        modelo.addRow(filas);
                    }
            }catch (SQLException ex) {
                Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscarMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarNombreActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPacienteNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPacienteNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPacienteNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPacienteNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPacienteNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarNombre;
    private javax.swing.JButton buscarNombre1;
    private javax.swing.JTextField inputAp;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}