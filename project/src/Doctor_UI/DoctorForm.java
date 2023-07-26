package Doctor_UI;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trant
 */
public class DoctorForm extends javax.swing.JFrame {

    /**
     * Creates new form DoctorForm
     */
    public DoctorForm() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        model.setRowCount(0);
        loadData();
    }

    private boolean isValidate() {
        int count = 0;
        if (txtName.getText().isEmpty()) {
            lbNameErr.setText("Name must not empty !");
            lbNameErr.setForeground(Color.red);
            count++;
        } else {
            if (txtName.getText().length() < 8) {
                lbNameErr.setText("name require at least 8 charecter");
                lbNameErr.setForeground(Color.red);
                count++;
            } else {
                lbNameErr.setText("");
            }

        }
        if (txtId.getText().isEmpty()) {
            lbIdErr.setText("ID must not empty !");
            lbIdErr.setForeground(Color.red);
            count++;
        } else {
            if (txtId.getText().length() <= 8) {
                lbIdErr.setText("ID require at least 8 charecter");
                lbIdErr.setForeground(Color.red);
                count++;
            } else {
                lbIdErr.setText("");
            }

        }
        if (txtAge.getText().isEmpty()) {
            lbAgeErr.setText("Age must not empty !");
            lbAgeErr.setForeground(Color.red);
            count++;
        } else {
            if (Integer.parseInt(txtAge.getText()) < 0 && Integer.parseInt(txtAge.getText()) > 100) {
                lbAgeErr.setText("age is invalid !");
                lbAgeErr.setForeground(Color.red);
                count++;
            } else {
                lbAgeErr.setText("");
            }
        }
        if (txtDate.getText().isEmpty()) {
            lbDateErr.setText("Date must not empty !");
            lbDateErr.setForeground(Color.red);
            count++;
        } else {
            lbDateErr.setText("");
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    private void updateData() {
        if (isValidate()) {
            String id = txtId.getText();
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String gender;
            if (rdMale.isSelected()) {
                gender = "Male";
            } else if (rdFemale.isSelected()) {
                gender = "Female";
            } else {
                gender = "Unkown";
            }
            String occupation = cbxOccupation.getSelectedItem() + "";
            String doctor = cbxOccupation.getSelectedItem() + "";
            String date = txtDate.getText();
            int clinic = rdClinic1.isSelected() ? 1 : 2;
            String note = txtNote.getText();
            new AppointmentRepo().updateData(id, name, age, gender, occupation, doctor, date, clinic, note);
            JOptionPane.showMessageDialog(this, "Update Successfully !");
        }
    }

    private void addData() {
        if (isValidate()) {
            String id = txtId.getText();
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String gender;
            if (rdMale.isSelected()) {
                gender = "Male";
            } else if (rdFemale.isSelected()) {
                gender = "Female";
            } else {
                gender = "Unkown";
            }
            String occupation = cbxOccupation.getSelectedItem() + "";
            String doctor = cbxOccupation.getSelectedItem() + "";
            String date = txtDate.getText();
            int clinic = rdClinic1.isSelected() ? 1 : 2;
            String note = txtNote.getText();
            new AppointmentRepo().saveData(id, name, age, gender, occupation, doctor, date, clinic, note);
            JOptionPane.showMessageDialog(this, "Add Successfully !");
        }
    }

    private void loadData() {
        List<Appointment> list = new AppointmentRepo().getList();
        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        model.setRowCount(0);
        for (Appointment appointment : list) {
            model.addRow(new Object[]{appointment.getID(), appointment.getPatientname(), appointment.getAge(),
                appointment.getGender(), appointment.getOccupation(), appointment.getDoctor(), appointment.getDate(),
                appointment.getClinic(), appointment.getNote()});
        }
    }

    private void deleteData() {
        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        String idDelete = model.getValueAt(tblList.getSelectedRow(), 0) + "";
        new AppointmentRepo().deleteData(idDelete);
        JOptionPane.showMessageDialog(this, "Delete Successfully !");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cbxOccupation = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxDoctor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdClinic1 = new javax.swing.JRadioButton();
        rdClinic2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnMedicine = new javax.swing.JButton();
        btnSearchById = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSalary = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        txtIdSearch = new javax.swing.JTextField();
        lbIdErr = new javax.swing.JLabel();
        lbNameErr = new javax.swing.JLabel();
        lbAgeErr = new javax.swing.JLabel();
        lbDateErr = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doctor Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(84, 84, 84))); // NOI18N

        jLabel1.setText("PatientName:");

        jLabel2.setText("age");

        jLabel3.setText("Gender");

        buttonGroup1.add(rdMale);
        rdMale.setSelected(true);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        jLabel4.setText("Ocupation");

        cbxOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Worker" }));
        cbxOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOccupationActionPerformed(evt);
            }
        });

        jLabel5.setText("Doctor:");

        cbxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor Strange", "Doctor Octopus" }));

        jLabel6.setText("Date:");

        jLabel7.setText("Clinic:");

        buttonGroup2.add(rdClinic1);
        rdClinic1.setSelected(true);
        rdClinic1.setText("1");

        buttonGroup2.add(rdClinic2);
        rdClinic2.setText("2");

        jLabel8.setText("Note:");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnMedicine.setText("Medicine");

        btnSearchById.setText("Search by ID");
        btnSearchById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByIdActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSalary.setText("Salary");

        jLabel9.setText("Medical ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PatientName", "Age", "Gender", "Occupation", "Doctor", "Date", "Clinic", "Note"
            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblList);

        lbIdErr.setText(".");

        lbNameErr.setText(".");

        lbAgeErr.setText(" ");

        lbDateErr.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSave)
                        .addGap(28, 28, 28)
                        .addComponent(btnUpdate)
                        .addGap(28, 28, 28)
                        .addComponent(btnDelete)
                        .addGap(28, 28, 28)
                        .addComponent(btnMedicine)
                        .addGap(41, 41, 41)
                        .addComponent(btnSalary)
                        .addGap(48, 48, 48)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(lbAgeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(39, 39, 39)
                                        .addComponent(cbxOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbIdErr, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdClinic1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdClinic2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(txtIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchById)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDateErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdErr)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNameErr)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAgeErr)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMale)
                    .addComponent(jLabel3)
                    .addComponent(rdFemale))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchById))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbxOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDateErr)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdClinic1)
                    .addComponent(rdClinic2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnMedicine)
                            .addComponent(btnSalary)
                            .addComponent(btnExit)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("hihi");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu3.setText("hehe");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("alo");
        jMenu3.add(jCheckBoxMenuItem1);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnSearchByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByIdActionPerformed
       String IdSearch = txtIdSearch.getText();
       List<Appointment> list = new AppointmentRepo().getList();
       DefaultTableModel model = (DefaultTableModel) tblList.getModel();
       model.setRowCount(0);
        for (Appointment appointment : list) {
            if (appointment.getID().equalsIgnoreCase(IdSearch)) {
                model.addRow(new Object[]{appointment.getID(), appointment.getPatientname(), appointment.getAge(),
                appointment.getGender(), appointment.getOccupation(), appointment.getDoctor(), appointment.getDate(),
                appointment.getClinic(), appointment.getNote()});
            }
        }
        JOptionPane.showMessageDialog(this, "search complete !");
    }//GEN-LAST:event_btnSearchByIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        addData();
        loadData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbxOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOccupationActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
        loadData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateData();
        loadData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int isExit = JOptionPane.showConfirmDialog(this, "do you want to exit ?", "confirm exit",
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
        if (isExit == 0) {
            System.exit(isExit);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        List<Appointment> list = new AppointmentRepo().getList();
        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        int indexSelected = tblList.getSelectedRow();
//        System.out.println(indexSelected);
        txtId.setText(model.getValueAt(indexSelected, 0) + "");
        txtName.setText(model.getValueAt(indexSelected, 1) + "");
        txtAge.setText(model.getValueAt(indexSelected, 2) + "");
        String gender = tblList.getValueAt(indexSelected, 3) + "";
        if (gender.equalsIgnoreCase("male")) {
            rdMale.setSelected(true);
        } else {
            rdFemale.setSelected(true);
        }
        cbxOccupation.setSelectedItem(tblList.getValueAt(indexSelected, 4));
        cbxDoctor.setSelectedItem(tblList.getValueAt(indexSelected, 5));
        txtDate.setText(model.getValueAt(indexSelected, 6) + "");
        int clinic = Integer.parseInt(tblList.getValueAt(indexSelected, 7) + "");
        if (clinic == 1) {
            rdClinic1.setSelected(true);
            rdClinic2.setSelected(false);

        } else {
            rdClinic2.setSelected(true);
            rdClinic1.setSelected(false);

        }
        txtNote.setText(model.getValueAt(indexSelected, 8) + "");

    }//GEN-LAST:event_tblListMouseClicked

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
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMedicine;
    private javax.swing.JButton btnSalary;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchById;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxDoctor;
    private javax.swing.JComboBox<String> cbxOccupation;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAgeErr;
    private javax.swing.JLabel lbDateErr;
    private javax.swing.JLabel lbIdErr;
    private javax.swing.JLabel lbNameErr;
    private javax.swing.JRadioButton rdClinic1;
    private javax.swing.JRadioButton rdClinic2;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSearch;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    // End of variables declaration//GEN-END:variables
}
