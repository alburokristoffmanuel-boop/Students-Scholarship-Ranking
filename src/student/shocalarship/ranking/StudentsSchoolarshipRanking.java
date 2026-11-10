
package student.shocalarship.ranking;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StudentsSchoolarshipRanking extends javax.swing.JFrame {

    private final ApplicantRegistry registry = new ApplicantRegistry();
    private JTextArea rankingArea;
    private JTextField txtSearch;
    private JRadioButton rbAcademic;
    private JRadioButton rbFinancial;

    public StudentsSchoolarshipRanking() {
        initComponents();
        configureApplication();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblStudentsInformation = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAverage = new javax.swing.JLabel();
        lblMonthlyIncome = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblActivityPoints = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        btnClearFields = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtStudentId = new javax.swing.JTextField();
        txtAverage = new javax.swing.JTextField();
        txtMonthlyIncome = new javax.swing.JTextField();
        txtActivityPoints = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        btnDisplayRanking = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblStudentsInformation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentsInformation.setText("Students Information");

        lblStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentName.setText("Students Name");

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel13.setText("Studdents Scholarship Ranking");

        lblStudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentId.setText("Students Id");

        lblAverage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAverage.setText(" General Average");

        lblMonthlyIncome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonthlyIncome.setText("Monthly Family Income");

        lblActivityPoints.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblActivityPoints.setText("Activity Points");

        btnAddStudent.setBackground(new java.awt.Color(204, 255, 255));
        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddStudent.setText("ADD STUDENT");
        btnAddStudent.addActionListener(this::btnAddStudentActionPerformed);

        btnClearFields.setBackground(new java.awt.Color(204, 255, 255));
        btnClearFields.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClearFields.setText("CLEAR FIELDS");
        btnClearFields.addActionListener(this::btnClearFieldsActionPerformed);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("    Rank");

        txtStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudentName.setText("Students Name");
        txtStudentName.addActionListener(this::txtStudentNameActionPerformed);

        txtStudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStudentId.setText("Students Id");

        txtAverage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAverage.setText("Average");

        txtMonthlyIncome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonthlyIncome.setText("Income");

        txtActivityPoints.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtActivityPoints.setText("Activities");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField12.setText("Total Score");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField13.setText("Status");

        btnDisplayRanking.setBackground(new java.awt.Color(204, 255, 255));
        btnDisplayRanking.setText("DISPLAY RANKING");

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("EXIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(284, 284, 284))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStudentsInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addGap(753, 753, 753))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonthlyIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(jLabel12))
                                            .addComponent(jLabel4)
                                            .addComponent(lblActivityPoints)
                                            .addComponent(lblAverage))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField3)
                                                .addComponent(jTextField5)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnClearFields, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMonthlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtActivityPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13)))))
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnDisplayRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudentsInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentId)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonthlyIncome)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel17)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblActivityPoints)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddStudent)
                                    .addComponent(btnClearFields))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMonthlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtActivityPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnDisplayRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1386, 1386, 1386)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        addStudent();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // Column header left over from the form designer. The live list is rankingArea.
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void configureApplication() {
        setTitle("Students Scholarship Ranking");

        rankingArea = new JTextArea();
        rankingArea.setEditable(false);
        rankingArea.setFont(new Font("Consolas", Font.PLAIN, 13));
        rankingArea.setText("Add a student, then press DISPLAY RANKING.\nSearch matches part of a student ID or name.");
        jScrollPane1.setViewportView(rankingArea);
        jScrollPane1.setPreferredSize(new Dimension(860, 220));

        rbAcademic = new JRadioButton("Academic Scholar", true);
        rbFinancial = new JRadioButton("Financial Grantee");
        rbAcademic.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rbFinancial.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        buttonGroup1.add(rbAcademic);
        buttonGroup1.add(rbFinancial);

        txtSearch = new JTextField();
        txtSearch.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtSearch.addActionListener(e -> searchStudent());

        javax.swing.JButton btnSearch = new javax.swing.JButton("SEARCH");
        btnSearch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnSearch.setBackground(new java.awt.Color(204, 255, 255));
        btnSearch.addActionListener(e -> searchStudent());

        btnDisplayRanking.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnDisplayRanking.addActionListener(e -> displayRanking());
        jButton4.addActionListener(e -> exitApplication());

        jLabel13.setText("Students Scholarship Ranking");
        lblStudentsInformation.setText("Student Information");
        lblStudentName.setText("Student Name");
        lblStudentId.setText("Student ID");
        lblAverage.setText("General Average");
        lblMonthlyIncome.setText("Monthly Family Income");
        lblActivityPoints.setText("Activity Points");
        jTextField3.setToolTipText("Enter a general average from 0 to 100");
        jTextField4.setToolTipText("Enter monthly family income from 0 to 10000000");
        jTextField6.setToolTipText("Enter activity points from 0 to 100");

        JPanel typePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 16, 0));
        typePanel.setOpaque(false);
        typePanel.add(rbAcademic);
        typePanel.add(rbFinancial);

        JPanel actionPanel = new JPanel(new GridLayout(1, 2, 12, 0));
        actionPanel.add(btnAddStudent);
        actionPanel.add(btnClearFields);

        JPanel searchPanel = new JPanel(new BorderLayout(8, 0));
        searchPanel.add(txtSearch, BorderLayout.CENTER);
        searchPanel.add(btnSearch, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 24, 0));
        bottomPanel.add(btnDisplayRanking);
        bottomPanel.add(jButton4);

        JLabel lblScholarType = new JLabel("Scholar Type");
        lblScholarType.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JLabel lblSearch = new JLabel("Search");
        lblSearch.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JLabel lblRanking = new JLabel("Ranking");
        lblRanking.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(new EmptyBorder(16, 20, 16, 20));
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(6, 8, 6, 8);
        g.anchor = GridBagConstraints.WEST;
        g.fill = GridBagConstraints.HORIZONTAL;

        addWideRow(form, g, 0, jLabel13);
        addWideRow(form, g, 1, lblStudentsInformation);
        addFieldRow(form, g, 2, lblStudentName, jTextField2);
        addFieldRow(form, g, 3, lblStudentId, jTextField5);
        addFieldRow(form, g, 4, lblAverage, jTextField3);
        addFieldRow(form, g, 5, lblMonthlyIncome, jTextField4);
        addFieldRow(form, g, 6, lblActivityPoints, jTextField6);
        addFieldRow(form, g, 7, lblScholarType, typePanel);
        addWideRow(form, g, 8, actionPanel);
        addFieldRow(form, g, 9, lblSearch, searchPanel);
        addWideRow(form, g, 10, lblRanking);

        g.gridy = 11;
        g.gridx = 0;
        g.gridwidth = 2;
        g.weightx = 1;
        g.weighty = 1;
        g.fill = GridBagConstraints.BOTH;
        form.add(jScrollPane1, g);

        g.gridy = 12;
        g.weighty = 0;
        g.fill = GridBagConstraints.HORIZONTAL;
        form.add(bottomPanel, g);

        getContentPane().removeAll();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(form, BorderLayout.CENTER);
        setMinimumSize(new Dimension(920, 700));
        getContentPane().revalidate();
        pack();
        setLocationRelativeTo(null);
    }

    private void addWideRow(JPanel form, GridBagConstraints g, int row, java.awt.Component child) {
        g.gridy = row;
        g.gridx = 0;
        g.gridwidth = 2;
        g.weightx = 1;
        g.weighty = 0;
        g.fill = GridBagConstraints.HORIZONTAL;
        form.add(child, g);
    }

    private void addFieldRow(JPanel form, GridBagConstraints g, int row, java.awt.Component label, java.awt.Component field) {
        g.gridy = row;
        g.gridwidth = 1;
        g.weighty = 0;
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 0;
        g.weightx = 0;
        form.add(label, g);
        g.gridx = 1;
        g.weightx = 1;
        form.add(field, g);
    }

    private void addStudent() {
        try {
            ScholarshipApplicant applicant = createApplicant(
                    jTextField2.getText(),
                    jTextField5.getText(),
                    readNumber(jTextField3, "General Average", 0, 100),
                    readNumber(jTextField4, "Monthly Family Income", 0, 10000000),
                    readNumber(jTextField6, "Activity Points", 0, 100));
            if (!registry.add(applicant)) {
                throw new IllegalArgumentException(
                        "Student ID " + applicant.getStudentId() + " is already on the list.");
            }
            clearEntryFields();
            showRoster("Saved students in the order they were added. Press DISPLAY RANKING to sort.");
            JOptionPane.showMessageDialog(this,
                    applicant.getStudentName() + " was added as " + applicant.getScholarType()
                            + ".\nTotal score: " + String.format("%.2f", applicant.computeTotalScore())
                            + "\nStatus: " + applicant.determineStatus(),
                    "Student added",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Check the input", JOptionPane.WARNING_MESSAGE);
        }
    }

    private ScholarshipApplicant createApplicant(String name, String id,
            double average, double income, double activities) {
        if (rbFinancial.isSelected()) {
            return new FinancialGrantee(name, id, average, income, activities);
        }
        return new AcademicScholar(name, id, average, income, activities);
    }

    private void clearFields() {
        clearEntryFields();
        txtSearch.setText("");
        rbAcademic.setSelected(true);
        jTextField2.requestFocus();
    }

    private void clearEntryFields() {
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
    }

    private void displayRanking() {
        if (registry.size() == 0) {
            rankingArea.setText("No students to rank yet.");
            JOptionPane.showMessageDialog(this, "Add at least one student first.");
            return;
        }
        registry.rankByScoreDescending();
        showRoster("Students ranked by total score, highest first.");
    }

    private void searchStudent() {
        String keyword = txtSearch.getText().trim();
        if (keyword.length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter a student ID or name to search.",
                    "Search", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (registry.size() == 0) {
            JOptionPane.showMessageDialog(this, "Add at least one student before searching.");
            return;
        }
        ScholarshipApplicant[] matches = new ScholarshipApplicant[registry.size()];
        int found = registry.search(keyword, matches);
        if (found == 0) {
            rankingArea.setText("No student matched \"" + keyword + "\".");
            rankingArea.setCaretPosition(0);
            JOptionPane.showMessageDialog(this, "Student not found.", "Search", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        StringBuilder report = new StringBuilder();
        report.append("Search results for \"").append(keyword).append("\" (")
                .append(found).append(found == 1 ? " match" : " matches").append(").\n\n");
        report.append(renderRows(matches, found));
        rankingArea.setText(report.toString());
        rankingArea.setCaretPosition(0);
    }

    private void exitApplication() {
        int choice = JOptionPane.showConfirmDialog(this,
                "Exit the application?", "Exit", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void showRoster(String heading) {
        ScholarshipApplicant[] rows = new ScholarshipApplicant[registry.size()];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = registry.get(i);
        }
        rankingArea.setText(heading + "\n\n" + renderRows(rows, rows.length));
        rankingArea.setCaretPosition(0);
    }

    private String renderRows(ScholarshipApplicant[] rows, int rowCount) {
        StringBuilder report = new StringBuilder();
        report.append(String.format("%-5s %-22s %-14s %8s %12s %10s %8s %-18s %s%n",
                "Rank", "Student Name", "Student ID", "Average", "Income",
                "Activities", "Score", "Scholar Type", "Status"));
        report.append("----------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < rowCount; i++) {
            ScholarshipApplicant applicant = rows[i];
            report.append(String.format("%-5d %-22s %-14s %8.2f %12.2f %10.2f %8.2f %-18s %s%n",
                    registry.rankOf(applicant),
                    fit(applicant.getStudentName(), 22),
                    fit(applicant.getStudentId(), 14),
                    applicant.getGeneralAverage(),
                    applicant.getMonthlyFamilyIncome(),
                    applicant.getActivityPoints(),
                    applicant.computeTotalScore(),
                    fit(applicant.getScholarType(), 18),
                    applicant.determineStatus()));
        }
        return report.toString();
    }

    private static String fit(String value, int width) {
        if (value.length() <= width) {
            return value;
        }
        return value.substring(0, width - 1) + ".";
    }

    private double readNumber(JTextField field, String label, double min, double max) {
        String text = field.getText().trim();
        if (text.length() == 0) {
            throw new IllegalArgumentException(label + " is required.");
        }
        double value;
        try {
            value = Double.parseDouble(text);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(label + " must be a number.");
        }
        if (Double.isNaN(value) || Double.isInfinite(value) || value < min || value > max) {
            throw new IllegalArgumentException(
                    label + " must be from " + plainNumber(min) + " to " + plainNumber(max) + ".");
        }
        return value;
    }

    private static String plainNumber(double value) {
        if (value == (long) value) {
            return Long.toString((long) value);
        }
        return Double.toString(value);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> new StudentsSchoolarshipRanking().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnDisplayRanking;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblActivityPoints;
    private javax.swing.JLabel lblAverage;
    private javax.swing.JLabel lblMonthlyIncome;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentsInformation;
    private javax.swing.JTextField txtActivityPoints;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtMonthlyIncome;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
