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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author toote
 */
public class EliminarCita extends javax.swing.JFrame {

    /**
     * Creates new form AddCita
     */
    public EliminarCita() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
String fe;
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
        inputA = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputM = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        inputD = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        inputH = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        inputMin = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        eliminarCita = new javax.swing.JButton();
        InputIdCita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCita = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        inputIdPaciente = new javax.swing.JTextField();
        buscarCita = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID del paciente");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fecha de cita");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Eliminar Citas");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        inputA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2021", "2022", "2023", "2024", "2025" }));
        inputA.setPreferredSize(new java.awt.Dimension(50, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Año");

        inputM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "-Enero-", "-Febrero-", "-Marzo-", "-Abril-", "-Mayo-", "-Junio-", "-Julio-", "-Agosto-", "-Septiembre-", "-Octubre-", "-Noviembre-", "-Diciembre-" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mes");

        inputD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        inputD.setPreferredSize(new java.awt.Dimension(44, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Día");

        inputH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "00:", "01:", "02:", "03:", "04:", "05:", "06:", "07:", "08:", "09:", "10:", "11:", "12:", "13:", "14:", "15:", "16:", "17:", "18:", "19:", "20:", "21:", "22:", "23:", "24:" }));
        inputH.setPreferredSize(new java.awt.Dimension(44, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Hora");

        inputMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        inputMin.setPreferredSize(new java.awt.Dimension(44, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Minutos");

        eliminarCita.setBackground(new java.awt.Color(255, 255, 255));
        eliminarCita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminarCita.setText("Eliminar Cita");
        eliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCitaActionPerformed(evt);
            }
        });

        InputIdCita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InputIdCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIdCitaActionPerformed(evt);
            }
        });

        tablaCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cita", "ID Paciente", "Nombre", "Apellido Paterno", "Apellido Materno", "Fecha de cita"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCita);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID de Cita");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));

        inputIdPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buscarCita.setBackground(new java.awt.Color(255, 255, 255));
        buscarCita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarCita.setText("Buscar Cita");
        buscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCitaActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 464, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buscarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(eliminarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputH, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addComponent(inputIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputD, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(InputIdCita)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputM, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(inputD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(buscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jMenu1.setText("Menu");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jMenu1.add(regresar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Menu2 a = new Menu2();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void eliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaActionPerformed
        // TODO add your handling code here:
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            String campo=InputIdCita.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE idCita = ?'"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                        "DELETE FROM cita where idCita=?");
                ps.setInt(1,Integer.parseInt(InputIdCita.getText()));
                //ps.setString(2, fe);
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Eliminados Correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar los Datos");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_eliminarCitaActionPerformed

    private void InputIdCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIdCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputIdCitaActionPerformed

    private void buscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCitaActionPerformed
        // TODO add your handling code here:
        String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            String campo=InputIdCita.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE pacientes.idPaciente=cita.idPaciente_F  AND cita.idCita = '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT cita.idCita, pacientes.idPaciente, cita.fechaCita \n" +
"            FROM cita,  pacientes"+ where );
                ResultSet rs = ps.executeQuery();
                       while(rs.next()){
                        inputIdPaciente.setText(rs.getString("idPaciente"));;
                        fe=rs.getString(3);
                        System.out.println("sql "+fe);

                    }
            }catch (SQLException ex) {
                //Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(null, " Datos no encontrados");
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscarMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
             if(!"".equals(campo)){
                where =" WHERE pacientes.idPaciente=cita.idPaciente_F  AND cita.idCita= '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT cita.idCita, pacientes.idPaciente, pacientes.nombrePaciente, pacientes.apellidoPPaciente, pacientes.apellidoMPaciente, cita.fechaCita \n" +
"            FROM cita,  pacientes"   + where );

                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaCita.setModel(modelo);                   
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                        modelo.addColumn("ID Cita");
                        modelo.addColumn("ID Paciente");
                        modelo.addColumn("Nombre");
                        modelo.addColumn("Apellido Paterno");
                        modelo.addColumn("Apellido Materno");
                        modelo.addColumn("Fecha de cita");
                                          
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

    }//GEN-LAST:event_buscarCitaActionPerformed

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
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputIdCita;
    private javax.swing.JButton buscarCita;
    private javax.swing.JButton eliminarCita;
    private javax.swing.JLabel fecha;
    private javax.swing.JComboBox<String> inputA;
    private javax.swing.JComboBox<String> inputD;
    private javax.swing.JComboBox<String> inputH;
    private javax.swing.JTextField inputIdPaciente;
    private javax.swing.JComboBox<String> inputM;
    private javax.swing.JComboBox<String> inputMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem regresar;
    private javax.swing.JTable tablaCita;
    // End of variables declaration//GEN-END:variables
}