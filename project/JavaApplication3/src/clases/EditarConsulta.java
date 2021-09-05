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
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author toote
 */
public class EditarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form addConsulta
     */
    public EditarConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
String moti,tipo_motivo;
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
     
       if(fechaConsulta.getText().isEmpty()){
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
           //String tipo_motivo = null;
           String motivo = inputMotivoConsulta.getSelectedItem().toString();
           if(motivo==" "){
               moti=String.valueOf(moti);  
            if("Consulta general".equals(moti)){
               tipo_motivo = "1";
            }
            
            if("Examenes".equals(moti)){
                tipo_motivo = "2";
           }
           
           if("Curaciones".equals(moti)){
                tipo_motivo = "3";
           }
               return true;
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
        fechaConsulta = new javax.swing.JLabel();
        editarConsulta = new javax.swing.JButton();
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
        buscarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Consulta");

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

        fechaConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        editarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        editarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editarConsulta.setText("Editar consulta");
        editarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarConsultaActionPerformed(evt);
            }
        });

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

        buscarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        buscarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarConsulta.setText("Buscar consulta");
        buscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarConsultaActionPerformed(evt);
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
                                .addComponent(fechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputMotivoConsulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(buscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputIdConsulta)
                        .addComponent(buscarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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

    private void buscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarConsultaActionPerformed
        // TODO add your handling code here:
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            //ResultSet rs;
            String campo=inputIdConsulta.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE datos_de_consulta.idConsulta = '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT datos_de_consulta.idConsulta,medicos.idMedicos,pacientes.idPaciente,datos_de_consulta.fechaVisita,\n" +
"            motivos_de_consulta.nombreMotivo,consulta.pruebasRealizadas,consulta.diagnostico,consulta.tratamiento FROM datos_de_consulta inner join medicos on medicos.idMedicos=datos_de_consulta.idMedicos_F\n" +
"            inner join pacientes on datos_de_consulta.idPaciente_F=pacientes.idPaciente\n" +
"            inner join motivos_de_consulta on motivos_de_consulta.idMotivos_de_Consulta=datos_de_consulta.idMotivo_F\n" +
"            inner join consulta on datos_de_consulta.idConsulta=consulta.idConsulta_F "
                + where );

                            
                    ResultSet rs = ps.executeQuery();
                               
                    while(rs.next()){
                        inputIdMedico.setText(rs.getString("idMedicos"));
                        System.out.println(inputIdMedico);
                        inputIdPaciente.setText(rs.getString("idPaciente"));
                        fechaConsulta.setText(rs.getString("fechaVisita"));
                        moti=rs.getString("nombreMotivo");
                        System.out.println(moti);
                        inputPruebasRealizadas.setText(rs.getString("pruebasRealizadas"));
                        inputDiagnostico.setText(rs.getString("diagnostico"));
                        inputTratamiento.setText(rs.getString("tratamiento"));
                       //turn = inputTurno.setSelectedItem(rs.getString("idTurnos_F"));
                       //test.setText(rs.getString(6));
                        //turn=rs.getString(6);
                        //System.out.println(turn);

                    }
            }catch (SQLException ex) {
                //Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(null, " Datos no encontrados");
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuscarMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            //ResultSet rs;
            //String campo=InputIdConsulta.getText();
            //String where ="";
            if(!"".equals(campo)){
                where =" WHERE datos_de_consulta.idConsulta = '"+ campo + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT datos_de_consulta.idConsulta,medicos.nombreMedico,medicos.apellidoPMedico,pacientes.nombrePaciente,pacientes.apellidoPPaciente,datos_de_consulta.fechaVisita,\n" +
"            motivos_de_consulta.nombreMotivo,consulta.pruebasRealizadas,consulta.diagnostico,consulta.tratamiento FROM datos_de_consulta inner join medicos on medicos.idMedicos=datos_de_consulta.idMedicos_F\n" +
"            inner join pacientes on datos_de_consulta.idPaciente_F=pacientes.idPaciente\n" +
"            inner join motivos_de_consulta on motivos_de_consulta.idMotivos_de_Consulta=datos_de_consulta.idMotivo_F\n" +
"            inner join consulta on datos_de_consulta.idConsulta=consulta.idConsulta_F "
                + where );

                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaConsultas.setModel(modelo);                   
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                        modelo.addColumn("ID Consulta");                   
                        modelo.addColumn("Nombre medico");
                        modelo.addColumn("Apellido medico");
                        modelo.addColumn("Nombre paciente");
                        modelo.addColumn("Apellido paciente");
                        modelo.addColumn("Fecha de consulta");
                        modelo.addColumn("Motivo de consulta"); 
                        modelo.addColumn("Pruebas realizadas");
                        modelo.addColumn("Diagnostico");
                        modelo.addColumn("Tratamiento");                    
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
    }//GEN-LAST:event_buscarConsultaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Menu2 a = new Menu2();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void editarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarConsultaActionPerformed
        // TODO add your handling code here:
                boolean valido=validar_datos();
                boolean valido2=validar_datos_2();
         if (valido == true&&valido2==true) {
            String idPaciente = inputIdPaciente.getText();
            String idMedico = inputIdMedico.getText();
            String fecha = fechaConsulta.getText();
            String pruebas =inputPruebasRealizadas.getText();
            String diagnostico =inputDiagnostico.getText();
            String tratamiento =inputTratamiento.getText();
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = null;
            PreparedStatement ps;
            PreparedStatement ps2;
            //ResultSet rs;
            String campo=inputIdConsulta.getText();
            String where ="";
            if(!"".equals(campo)){
                where =" WHERE idConsulta = '"+ campo + "'";
            }
            String campo2=inputIdConsulta.getText();
            String where2 ="";
            if(!"".equals(campo2)){
                where2 =" WHERE idConsulta_F = '"+ campo2 + "'";
            }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                        "UPDATE datos_de_consulta SET idMedicos_F = ? , idPaciente_F = ? ,fechaVisita =?  ,idMotivo_F = ? "
                + where);
                ps2 = con.prepareStatement(
                        "UPDATE consulta SET pruebasRealizadas = ? , diagnostico= ? ,tratamiento = ? "
                + where2);
                ps.setString(1, idMedico);
                ps.setString(2, idPaciente);
                ps.setString(3, fecha);
                ps.setString(4, tipo_motivo);
                ps2.setString(1, pruebas);
                ps2.setString(2, diagnostico);
                ps2.setString(3, tratamiento);
                

                int res = ps.executeUpdate();
                int res2 =ps2.executeUpdate();

                if (res > 0 && res2 > 0) {
                    JOptionPane.showMessageDialog(null, "Datos Modificados Correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar los Datos");
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
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                ps = con.prepareStatement(
                            "SELECT datos_de_consulta.idConsulta,medicos.nombreMedico,medicos.apellidoPMedico,pacientes.nombrePaciente,pacientes.apellidoPPaciente,datos_de_consulta.fechaVisita,\n" +
"            motivos_de_consulta.nombreMotivo,consulta.pruebasRealizadas,consulta.diagnostico,consulta.tratamiento FROM datos_de_consulta inner join medicos on medicos.idMedicos=datos_de_consulta.idMedicos_F\n" +
"            inner join pacientes on datos_de_consulta.idPaciente_F=pacientes.idPaciente\n" +
"            inner join motivos_de_consulta on motivos_de_consulta.idMotivos_de_Consulta=datos_de_consulta.idMotivo_F\n" +
"            inner join consulta on datos_de_consulta.idConsulta=consulta.idConsulta_F "
                + where );

                        DefaultTableModel modelo = new DefaultTableModel();
                        tablaConsultas.setModel(modelo);                   
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                        modelo.addColumn("ID Consulta");                   
                        modelo.addColumn("Nombre medico");
                        modelo.addColumn("Apellido medico");
                        modelo.addColumn("Nombre paciente");
                        modelo.addColumn("Apellido paciente");
                        modelo.addColumn("Fecha de consulta");
                        modelo.addColumn("Motivo de consulta"); 
                        modelo.addColumn("Pruebas realizadas");
                        modelo.addColumn("Diagnostico");
                        modelo.addColumn("Tratamiento");                    
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
         }
    }//GEN-LAST:event_editarConsultaActionPerformed

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
                new EditarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarConsulta;
    private javax.swing.JButton editarConsulta;
    private javax.swing.JLabel fechaConsulta;
    private javax.swing.JTextArea inputDiagnostico;
    private javax.swing.JTextField inputIdConsulta;
    private javax.swing.JTextField inputIdMedico;
    private javax.swing.JTextField inputIdPaciente;
    private javax.swing.JComboBox<String> inputMotivoConsulta;
    private javax.swing.JTextArea inputPruebasRealizadas;
    private javax.swing.JTextArea inputTratamiento;
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
}
