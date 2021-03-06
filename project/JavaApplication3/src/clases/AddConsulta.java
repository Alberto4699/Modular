/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author toote
 */
public class AddConsulta extends javax.swing.JFrame {

    /**
     * Creates new form addConsulta
     */
    public AddConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
String fe;
    public boolean  validar_id_paciente(){
       String idpaciente =inputIdPaciente.getText();
       boolean validar_idpaci=Pattern.compile("^[0-9]{1,}$").matcher(idpaciente).matches();
       if(validar_idpaci==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa el id de paciente correctamente");
       }
       return validar_idpaci;
        
}
    public boolean  validar_id_medico(){
       String idmedico =inputIdMedico.getText();
       boolean validar_idmedic=Pattern.compile("^[0-9]{1,}$").matcher(idmedico).matches();
       if(validar_idmedic==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa el id de medico correctamente");
       }
       return validar_idmedic;
        
}
    public boolean  validar_fecha(){
     
       if(FechaAuto.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Error generar fecha de visita correctamente");
           return false;
       }else{
           
           return true;
       }
}
    public boolean  validar_id_consulta(){
       String idconsulta =inputIdConsulta.getText();
       boolean validar_idconsul=Pattern.compile("^[0-9]{1,}$").matcher(idconsulta).matches();
       if(validar_idconsul==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa el id de consulta correctamente");
       } 
       return validar_idconsul;
        
}
    public boolean  validar_pruebas(){
       String pruebas =inputPruebasRealizadas.getText();
       boolean validar_prueb=Pattern.compile("^[a-z|A-Z ,]+").matcher(pruebas).matches();
       if(validar_prueb==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa las pruebas realizadas correctamente");
       }
       return validar_prueb;
        
}
    public boolean  validar_diagnostico(){
       String diagnostico =inputDiagnostico.getText();
       boolean validar_diag=Pattern.compile("^[a-z|A-Z 0-9 ,.]+").matcher(diagnostico).matches();
       if(validar_diag==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa el diagnostico correctamente");
       }
       return validar_diag;
        
}
    public boolean  validar_tratamiento(){
       String tratamiento =inputTratamiento.getText();
       boolean validar_tratamien=Pattern.compile("^[a-z|A-Z 0-9 ,.]+").matcher(tratamiento).matches();
       if(validar_tratamien==false){
           JOptionPane.showMessageDialog(null, "Error Ingresa el tratamiento correctamente");
       }
       return validar_tratamien;
        
}
  public boolean validar_motivo(){
          //String sangre=inputEdad.getSelectedItem().toString();
           String tipo_motivo = null;
           String motivo = inputMotivoConsulta.getSelectedItem().toString();
           if(motivo==" "){
               JOptionPane.showMessageDialog(null, "Error ingresa el motivo correctamente");
               return false;
           }else{
           if("Consulta general".equals(motivo)){
               tipo_motivo = "1";
            }
            
            if("Examenes".equals(motivo)){
                tipo_motivo = "2";
           }
           
           if("Curaciones".equals(motivo)){
                tipo_motivo = "3";
           }
           
           //System.out.print(tipo_motivo);
           return true;
           }
  }
    public boolean validar_datos(){
        if(validar_id_medico()==true&&validar_id_paciente()==true&&validar_motivo()==true&&validar_fecha()==true){
                //System.out.print(fe);
              //JOptionPane.showMessageDialog(null, "Su informacion se ha guardado correctamente");
              return true;
         }else{
              //JOptionPane.showMessageDialog(null, " NO VALIDO");
              return false;
          }
      }
    public boolean validar_datos_2(){
        if( validar_id_consulta()==true&&validar_pruebas()==true&&validar_diagnostico()==true&&validar_tratamiento()==true){
              //JOptionPane.showMessageDialog(null, "Su informacion se ha guardado correctamente");
              return true;
         }else{
              //JOptionPane.showMessageDialog(null, "NO VALIDO");
              return false;
          }
       
      }
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputIdMedico = new javax.swing.JTextField();
        inputIdPaciente = new javax.swing.JTextField();
        inputMotivoConsulta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        generarIdConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        inputIdConsulta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputPruebasRealizadas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputDiagnostico = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputTratamiento = new javax.swing.JTextArea();
        guardarConsulta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FechaAuto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Consulta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID Medico");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID Paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Motivo de consulta");

        inputIdMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputIdMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdMedicoActionPerformed(evt);
            }
        });

        inputIdPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputIdPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPacienteActionPerformed(evt);
            }
        });

        inputMotivoConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputMotivoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Consulta general", "Examenes", "Curaciones" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de visita");

        generarIdConsulta.setBackground(new java.awt.Color(255, 255, 255));
        generarIdConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generarIdConsulta.setText("Generar ID de consulta");
        generarIdConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        generarIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarIdConsultaActionPerformed(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Consulta", "Nombre Doctor", "Apellido Doctor", "Nombre Paciente", "Apellido Paciente", "Fecha de consulta", "Motivo de consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaConsultas);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Ingrese el ID de consulta");

        inputIdConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdConsultaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Pruebas realizadas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Diagnostico");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tratamiento");

        inputPruebasRealizadas.setColumns(20);
        inputPruebasRealizadas.setRows(5);
        jScrollPane2.setViewportView(inputPruebasRealizadas);

        inputDiagnostico.setColumns(20);
        inputDiagnostico.setRows(5);
        jScrollPane3.setViewportView(inputDiagnostico);

        inputTratamiento.setColumns(20);
        inputTratamiento.setRows(5);
        jScrollPane4.setViewportView(inputTratamiento);

        guardarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        guardarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarConsulta.setText("Guardar Consulta");
        guardarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarConsultaActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        FechaAuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputIdMedico)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(inputIdPaciente)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FechaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generarIdConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputMotivoConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputIdMedico)
                    .addComponent(inputIdPaciente)
                    .addComponent(inputMotivoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generarIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(FechaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(guardarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputIdConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jScrollPane5.setViewportView(jPanel1);

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
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdMedicoActionPerformed

    private void inputIdPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdPacienteActionPerformed

    private void inputIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdConsultaActionPerformed

    private void guardarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarConsultaActionPerformed
        // TODO add your handling code here:
        boolean valido=validar_datos_2();
        if (valido == true) {
            String idConsulta = inputIdConsulta.getText();
            String pruebas = inputPruebasRealizadas.getText();
            String diagnostigo = inputDiagnostico.getText();
            String tratamiento = inputTratamiento.getText();
            //hashear contra
            //String bcryptHashString = BCrypt.withDefaults().hashToString(12, contra.toCharArray());
            //compara la contra
            //BCrypt.Result result = BCrypt.verifyer().verify(contra.toCharArray(), bcryptHashString);
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                        "INSERT INTO Consulta(idConsulta_F,pruebasRealizadas,diagnostico,tratamiento) VALUES(?,?,?,?)");
                ps.setString(1, idConsulta);
                ps.setString(2, pruebas);
                ps.setString(3, diagnostigo);
                ps.setString(4, tratamiento);

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar los Datos");
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
        }       
    }//GEN-LAST:event_guardarConsultaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Menu1 a = new Menu1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void generarIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarIdConsultaActionPerformed
        // TODO add your handling code here:
        boolean valido=validar_datos();
        if(valido==true){
            String idPaciente = inputIdPaciente.getText();
            String idMedico = inputIdMedico.getText();
            String fecha = FechaAuto.getText();
            String motivo = inputMotivoConsulta.getSelectedItem().toString();
            String tipo_motivo = null;
            if("Consulta general".equals(motivo)){
                tipo_motivo ="1";
            }
            if("Examenes".equals(motivo)){
                tipo_motivo ="2";
            }
            if("Curaciones".equals(motivo)){
                tipo_motivo ="3";
            }
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                        "INSERT INTO Datos_de_consulta(idMedicos_F,idPaciente_F,fechaVisita,idMotivo_F) VALUES(?,?,?,?)");
                ps.setString(1, idMedico);
                ps.setString(2, idPaciente);
                ps.setDate(3, Date.valueOf(fecha));
                ps.setString(4, tipo_motivo);

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                    ps = con.prepareStatement(
                            "SELECT MAX(Datos_de_Consulta.idConsulta), Medicos.nombreMedico, Medicos.apellidoPMedico, Pacientes.nombrePaciente, Pacientes.apellidoPPaciente, \n"
                            + "Datos_de_Consulta.fechaVisita, Datos_de_Consulta.idMotivo_F FROM Datos_de_Consulta, Medicos, Pacientes WHERE idMedicos_F= ? AND idPaciente_F= ?;");
                    ps.setString(1, idMedico);
                    ps.setString(2, idPaciente);
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                    while(rs.next()){
                        Object[] filas = new Object[cantidadColumnas];
                        for(int i = 0; i<cantidadColumnas; i++){
                            filas[i] = rs.getObject(i+1);
                        }
                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaConsultas.setModel(modelo);
                        modelo.addColumn("ID Consulta");
                        modelo.addColumn("Nombre Doctor");
                        modelo.addColumn("Apellido Doctor");
                        modelo.addColumn("Nombre Paciente");
                        modelo.addColumn("Apellido Paciente");
                        modelo.addColumn("Fecha Consulta");
                        modelo.addColumn("Motivo de Consulta");
                        modelo.addRow(filas);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar los Datos");
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
        }
              
    }//GEN-LAST:event_generarIdConsultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.util.Date ahora = new java.util.Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        String fechita = formateador.format(ahora);
        FechaAuto.setText(fechita);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaAuto;
    private javax.swing.JButton generarIdConsulta;
    private javax.swing.JButton guardarConsulta;
    private javax.swing.JTextArea inputDiagnostico;
    private javax.swing.JTextField inputIdConsulta;
    private javax.swing.JTextField inputIdMedico;
    private javax.swing.JTextField inputIdPaciente;
    private javax.swing.JComboBox<String> inputMotivoConsulta;
    private javax.swing.JTextArea inputPruebasRealizadas;
    private javax.swing.JTextArea inputTratamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JMenuItem regresar;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables

    private static class fe {

        public fe() {
        }
    }
}
