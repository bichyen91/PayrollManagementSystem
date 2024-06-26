package PayrollManagementSystem;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PMS extends javax.swing.JFrame {

    private static Payroll payroll = new Payroll();
    private static DefaultTableModel model;
    private static boolean isAdd;

    /**
     * Creates new form PMS
     */
    public PMS() {
        initComponents();
        jbtnPaySlip.setVisible(false);
        jcboStatus.setEnabled(false);
        isAdd = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_function = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlblPosition = new javax.swing.JLabel();
        jlblId = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jlblName = new javax.swing.JLabel();
        jlblFixedAllowance = new javax.swing.JLabel();
        jtxtPayRate = new javax.swing.JTextField();
        jtxtYear = new javax.swing.JTextField();
        jlblPatRate = new javax.swing.JLabel();
        jtxtFixedAllowance = new javax.swing.JTextField();
        jlblDob = new javax.swing.JLabel();
        jtxtPosition = new javax.swing.JTextField();
        jtxtId = new javax.swing.JTextField();
        jlblYearEmployed = new javax.swing.JLabel();
        jlblStatus = new javax.swing.JLabel();
        jcboStatus = new javax.swing.JComboBox<>();
        jcboMonth = new javax.swing.JComboBox<>();
        jtxtDob = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbtnAdd = new javax.swing.JButton();
        jbtnPaySlip = new javax.swing.JButton();
        jbtnRefesh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jlblPosition.setText("Position");
        jlblPosition.setToolTipText("");
        jlblPosition.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblId.setText("ID");
        jlblId.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblName.setText("Name");
        jlblName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblFixedAllowance.setText("Monthly fixed allowance");
        jlblFixedAllowance.setToolTipText("");
        jlblFixedAllowance.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtxtPayRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtPayRate.setToolTipText("Greater than 0.");
        jtxtPayRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPayRateKeyTyped(evt);
            }
        });

        jtxtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtYear.setToolTipText("yyyy");
        jtxtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtYearKeyTyped(evt);
            }
        });

        jlblPatRate.setText("Monthly pay rate");
        jlblPatRate.setToolTipText("");
        jlblPatRate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtxtFixedAllowance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtFixedAllowance.setToolTipText("Greater than 0.");
        jtxtFixedAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFixedAllowanceKeyTyped(evt);
            }
        });

        jlblDob.setText("Date of Birth");
        jlblDob.setToolTipText("");
        jlblDob.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jtxtPosition.setToolTipText("Numbers are not allowed.");
        jtxtPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPositionKeyTyped(evt);
            }
        });

        jlblYearEmployed.setText("Joining Period");
        jlblYearEmployed.setToolTipText("");
        jlblYearEmployed.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblStatus.setText("Status");
        jlblStatus.setToolTipText("");
        jlblStatus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jcboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inavtive" }));

        jcboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jcboMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtDob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        jtxtDob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDob.setToolTipText("mm/dd/yyyy");
        jtxtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDobKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblYearEmployed, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPatRate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtPayRate)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcboMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtId, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jtxtDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblFixedAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFixedAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtxtDob, jtxtId, jtxtPayRate});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlblDob, jlblId, jlblPatRate, jlblYearEmployed});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jcboStatus, jtxtFixedAllowance, jtxtName, jtxtPosition});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlblFixedAllowance, jlblStatus});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcboStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblYearEmployed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtFixedAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblFixedAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPatRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcboMonth, jtxtDob, jtxtId, jtxtPayRate, jtxtYear});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlblDob, jlblId, jlblPatRate, jlblYearEmployed});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcboStatus, jtxtFixedAllowance, jtxtName, jtxtPosition});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlblFixedAllowance, jlblName, jlblPosition, jlblStatus});

        jtxtYear.getAccessibleContext().setAccessibleName("");
        jtxtYear.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAYROLL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_functionLayout = new javax.swing.GroupLayout(jpn_function);
        jpn_function.setLayout(jpn_functionLayout);
        jpn_functionLayout.setHorizontalGroup(
            jpn_functionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_functionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_functionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpn_functionLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpn_functionLayout.setVerticalGroup(
            jpn_functionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_functionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth", "Position", "Period Employed", "Pay rate", "Allowance", "Status", "Leave Remain"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblEmployee.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblEmployee);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 310));

        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnPaySlip.setText("Pay Slip Generator");
        jbtnPaySlip.setToolTipText("");
        jbtnPaySlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPaySlipActionPerformed(evt);
            }
        });

        jbtnRefesh.setText("Refesh");
        jbtnRefesh.setToolTipText("");
        jbtnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnRefesh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnPaySlip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnPaySlip)
                            .addComponent(jbtnRefesh))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPaySlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaySlipActionPerformed
        EmployeePayroll emp = payroll.getEmployee(jtxtId.getText());
        PaySlipGenerator ps = new PaySlipGenerator(emp);
        ps.setVisible(true);
    }//GEN-LAST:event_jbtnPaySlipActionPerformed

    public boolean isDataValid() {
        boolean isValid = false;
        if (jtxtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Employee ID cannot be empty!",
                    "Invalid data", JOptionPane.ERROR_MESSAGE);
            jtxtId.requestFocus();
        } else {
            if (jtxtName.getText().equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Employee Name cannot be empty!",
                        "Invalid data", JOptionPane.ERROR_MESSAGE);
                jtxtName.requestFocus();
            } else {
                if (jtxtDob.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,
                            "DOB cannot be empty and must be in format mm/dd/yyyy!",
                            "Invalid data", JOptionPane.ERROR_MESSAGE);
                    jtxtDob.requestFocus();
                } else {
                    if (jtxtPosition.getText().equals("")) {
                        JOptionPane.showMessageDialog(null,
                                "Position cannot be empty!",
                                "Invalid data", JOptionPane.ERROR_MESSAGE);
                        jtxtPosition.requestFocus();
                    } else {
                        if (jtxtYear.getText().equals("")
                                || jtxtYear.getText().length() != 4) {
                            JOptionPane.showMessageDialog(null,
                                    "Joinning Year cannot be empty and should has 4 digits!",
                                    "Invalid data", JOptionPane.ERROR_MESSAGE);
                            jtxtYear.requestFocus();
                        } else {
                            if (jtxtPayRate.getText().equals("")
                                    || jtxtPayRate.getText().equals("0")) {
                                JOptionPane.showMessageDialog(null,
                                        "Monthly pay rate cannot be empty or 0!",
                                        "Invalid data", JOptionPane.ERROR_MESSAGE);
                                jtxtPayRate.requestFocus();
                            } else {
                                if (jtxtFixedAllowance.getText().equals("")
                                        || jtxtFixedAllowance.getText().equals("0")) {
                                    JOptionPane.showMessageDialog(null,
                                            "Monthly allowance be empty or 0!",
                                            "Invalid data", JOptionPane.ERROR_MESSAGE);
                                    jtxtFixedAllowance.requestFocus();
                                } else {
                                    int birthYear = Integer.parseInt(jtxtDob.getText().substring(6, 10));
                                    int joinedYear = Integer.parseInt(jtxtYear.getText());
                                    if (joinedYear < birthYear) {
                                        JOptionPane.showMessageDialog(null,
                                                "Joining year is before birth year. ",
                                                "Invalid data", JOptionPane.ERROR_MESSAGE);
                                        jtxtYear.requestFocus();
                                    } else {
                                        if (joinedYear - birthYear < 18) {
                                            JOptionPane.showMessageDialog(null,
                                                    "You are under 18.",
                                                    "Invalid data", JOptionPane.ERROR_MESSAGE);
                                            jtxtYear.requestFocus();
                                        } else {
                                            isValid = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return isValid;
    }


    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        if (isDataValid()) {
            EmployeePayroll emp;

            String monthEmployed = Integer.toString(jcboMonth.getSelectedIndex() + 1);
            String yearEmployed = jtxtYear.getText();
            int periodEmployed = Integer.parseInt(monthEmployed + yearEmployed);
            int status = jcboStatus.getSelectedIndex();

            if (isAdd) {
                emp = new EmployeePayroll(jtxtId.getText(), jtxtName.getText(),
                        jtxtDob.getText(), jtxtPosition.getText(), periodEmployed,
                        Double.parseDouble(jtxtPayRate.getText()),
                        Double.parseDouble(jtxtFixedAllowance.getText()));

                boolean result = payroll.addEmployee(emp);
                if (!result) {
                    JOptionPane.showMessageDialog(null,
                            "An error occurred!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                emp = payroll.getEmployee(jtxtId.getText());
                emp.setName(jtxtName.getText());
                emp.setDob(jtxtDob.getText());
                emp.setPosition(jtxtPosition.getText());
                emp.setPeriodEmployed(periodEmployed);
                emp.setMonthlyPayRate(Double.parseDouble(jtxtFixedAllowance.getText()));
                emp.setMonthlyAllowance(Double.parseDouble(jtxtFixedAllowance.getText()));
                emp.setStatus((status == 0));
            }
            loadTable();
            reset();
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jtblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblEmployeeMouseClicked
        model = (DefaultTableModel) jtblEmployee.getModel();
        int selectedRow = jtblEmployee.getSelectedRow();
        jtxtId.setText(model.getValueAt(selectedRow, 0).toString());
        jtxtName.setText(model.getValueAt(selectedRow, 1).toString());
        jtxtDob.setText(model.getValueAt(selectedRow, 2).toString());
        jtxtPosition.setText(model.getValueAt(selectedRow, 3).toString());

        String month = model.getValueAt(selectedRow, 4).toString().length() == 8
                ? model.getValueAt(selectedRow, 4).toString()
                        .substring(0, 1)
                : model.getValueAt(selectedRow, 4).toString()
                        .substring(0, 2);
        jcboMonth.setSelectedIndex(Integer.parseInt(month) - 1);

        String year = model.getValueAt(selectedRow, 4).toString().length() == 8
                ? model.getValueAt(selectedRow, 4).toString()
                        .substring(4, 8)
                : model.getValueAt(selectedRow, 4).toString()
                        .substring(5, 9);
        jtxtYear.setText(year);

        jtxtPayRate.setText(model.getValueAt(selectedRow, 5).toString());
        jtxtFixedAllowance.setText(model.getValueAt(selectedRow, 6).toString());
        jtxtId.setEnabled(false);
        jcboStatus.setEnabled(true);
        jtxtName.requestFocus();
        jbtnAdd.setText("Update");
        jbtnRefesh.setText("Cancel");
        jbtnPaySlip.setVisible(true);
        isAdd = false;
    }//GEN-LAST:event_jtblEmployeeMouseClicked

    private void jtxtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtYearKeyTyped
        char keyType = evt.getKeyChar();
        if (!Character.isDigit(keyType) && keyType != KeyEvent.VK_BACK_SPACE
                && keyType != KeyEvent.VK_DELETE) {
            // If the character is not a digit, backspace, or delete, consume the event
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_jtxtYearKeyTyped

    private void jtxtPayRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPayRateKeyTyped
        char keyType = evt.getKeyChar();
        if (!(Character.isDigit(keyType) || (keyType == KeyEvent.VK_BACK_SPACE)
                || (keyType == KeyEvent.VK_DELETE))) {
            // If the character is not a digit, backspace, or delete, consume the event
            evt.consume();
        }
    }//GEN-LAST:event_jtxtPayRateKeyTyped

    private void jtxtFixedAllowanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFixedAllowanceKeyTyped
        char keyType = evt.getKeyChar();
        if (!(Character.isDigit(keyType) || (keyType == KeyEvent.VK_BACK_SPACE)
                || (keyType == KeyEvent.VK_DELETE))) {
            // If the character is not a digit, backspace, or delete, consume the event
            evt.consume();
        }
    }//GEN-LAST:event_jtxtFixedAllowanceKeyTyped

    private void jbtnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRefeshActionPerformed
        loadTable();
        reset();
        jbtnRefesh.setText("Refresh");
    }//GEN-LAST:event_jbtnRefeshActionPerformed

    private void jtxtPositionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPositionKeyTyped
        char keyType = evt.getKeyChar();
        if (!(Character.isAlphabetic(keyType) || (keyType == KeyEvent.VK_BACK_SPACE)
                || (keyType == KeyEvent.VK_DELETE))) {
            // If the character is not Alphabetic, backspace, or delete, consume the event
            evt.consume();
        }
    }//GEN-LAST:event_jtxtPositionKeyTyped

    private void jtxtDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDobKeyTyped
        char keyType = evt.getKeyChar();
        if (!(Character.isDigit(keyType) || (keyType == KeyEvent.VK_BACK_SPACE)
                || (keyType == KeyEvent.VK_SLASH) || (keyType == KeyEvent.VK_DELETE))) {
            // If the character is not a digit, backspace, or delete, consume the event
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDobKeyTyped

    public void loadTable() {
        model = (DefaultTableModel) jtblEmployee.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        // Iterate over linked list and add data to model
        List<EmployeePayroll> empList = payroll.getEmployeesList();
        for (Employee emp : empList) {
            Object[] row = {emp.getId(), emp.getName(), emp.getDob(), emp.getPosition(),
                displayPeriodEmployed(Integer.toString(emp.getPeriodEmployed())),
                emp.getMonthlyPayRate(), emp.getMonthlyAllowance(),
                emp.getStatus() == true ? "Active" : "Terminated", emp.getLeavesRemain()};
            model.addRow(row);
        }
    }

    public String displayPeriodEmployed(String periodEmployed) {
        String month = periodEmployed.length() == 5
                ? periodEmployed.substring(0, 1)
                : periodEmployed.substring(0, 2);

        String year = periodEmployed.length() == 5
                ? periodEmployed.substring(1, 5)
                : periodEmployed.substring(2, 6);
        return month + " - " + year;
    }

    public void reset() {
        jtxtId.setText("");
        jtxtName.setText("");
        jtxtDob.setText("");
        jtxtPosition.setText("");
        jcboMonth.setSelectedIndex(0);
        jtxtYear.setText("");
        jtxtPayRate.setText("");
        jtxtFixedAllowance.setText("");
        jcboStatus.setEnabled(false);
        jtxtId.setEnabled(true);
        jtxtId.requestFocus();
        isAdd = true;
        jbtnAdd.setText("Add");
        jbtnPaySlip.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(PMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PMS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnPaySlip;
    private javax.swing.JButton jbtnRefesh;
    private javax.swing.JComboBox<String> jcboMonth;
    private javax.swing.JComboBox<String> jcboStatus;
    private javax.swing.JLabel jlblDob;
    private javax.swing.JLabel jlblFixedAllowance;
    private javax.swing.JLabel jlblId;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblPatRate;
    private javax.swing.JLabel jlblPosition;
    private javax.swing.JLabel jlblStatus;
    private javax.swing.JLabel jlblYearEmployed;
    private javax.swing.JPanel jpn_function;
    private javax.swing.JTable jtblEmployee;
    private javax.swing.JFormattedTextField jtxtDob;
    private javax.swing.JTextField jtxtFixedAllowance;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPayRate;
    private javax.swing.JTextField jtxtPosition;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables
}
