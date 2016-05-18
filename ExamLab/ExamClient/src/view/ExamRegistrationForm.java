/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import connector.ServerConnector;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Student;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDevice;
import com.github.sarxos.webcam.WebcamPanel;
import controller.StudentController;
import java.awt.Color;
import java.awt.Dimension;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import observer.StudentObserverImpl;
import org.jdesktop.swingx.JXBusyLabel;
import org.jdesktop.swingx.SwingXUtilities;

/**
 *
 * @author Supun
 */
public class ExamRegistrationForm extends javax.swing.JDialog {

    Date date;
    String newDate;
    StudentObserverImpl observerbleImpl;
    private Webcam webcam;

    String path;
//    Webcam webcam = Webcam.getDefault();
    //Webcam.
    // webcam.

                //setSize(500,500);
    // [176x144] [320x240] [640x480]
    //Dimension dimension=new Dimension(176,144);
    //        WebcamDevice device = webcam.getDevice();
    //webcam.
    //        Dimension dimension=new Dimension(176,144);
    //webcam.setViewSize(dimension);
    //        WebcamPanel webcamPanel=new WebcamPanel(webcam);
    // webcamPanel.setFillArea(true);
                //webcamPanel.setMirrored(true);
    //setSize(176,144);
    /**
     * Creates new form ExamRegistrationForm
     */
    public ExamRegistrationForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            
            
            
            createButton.setEnabled(false);
            nameTextField.setEditable(false);

            //jXBusyLabel1.setVisible(false);
            //nameTextField.setEnabled(false);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            date = new Date();
            System.out.println(dateFormat.format(date));
            newDate = dateFormat.format(date);
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
            UIManager.setLookAndFeel(new GraphiteLookAndFeel());

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jLabel4 = new javax.swing.JLabel();
        nicTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        address1TextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        retypePasswordTextField = new javax.swing.JPasswordField();
        panel = new org.jdesktop.swingx.JXPanel();
        jLabel10 = new javax.swing.JLabel();
        psearchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/f2747aa8f47a8041486e155be3b44246.jpg"))); // NOI18N
        jLabel2.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 51)));

        jLabel1.setFont(new java.awt.Font("PMingLiU", 1, 30)); // NOI18N
        jLabel1.setText("Create  Your  Oracle  Account");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setText("Your Oracle Account gives you access in this OCPJP exam exam simulator. Please give the correct detail for your registration.");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setText("Already have an Oracle Account?");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setText("Your full name must important to create the exam certificate and OCPJP ID. ");

        jXHyperlink1.setText("Sign In");
        jXHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel4.setText("                          Full Name");

        nicTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nicTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicTextFieldActionPerformed(evt);
            }
        });
        nicTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicTextFieldKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel7.setText("                     Email Address");

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel8.setText("                           Password");

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel9.setText("                  Retype Password");

        jLabel11.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel11.setText("                        Work Phone");

        phoneTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });
        phoneTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneTextFieldKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel12.setText("                             Address");

        address1TextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address1TextFieldActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(255, 0, 51));
        createButton.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create Account");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Shruti", 0, 14)); // NOI18N
        jLabel14.setText("                                  NIC");

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        retypePasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retypePasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypePasswordTextFieldActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/image/default_profile.jpg"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(address1TextField))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nameTextField))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(emailTextField))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(passwordTextField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(retypePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(psearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jXHyperlink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(psearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retypePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            Student student = new Student(nicTextField.getText(), nameTextField.getText(), emailTextField.getText(), passwordTextField.getText(), phoneTextField.getText(), address1TextField.getText(), newDate);
            boolean regStudent = ServerConnector.getServerConnector().getStudentController().addStudent(student);
            if (regStudent) {
                JOptionPane.showMessageDialog(ExamRegistrationForm.this, "Student Registered successfully !!");
                this.dispose();
                new LogIn(null, true).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(ExamRegistrationForm.this, "Student Registered failed !!");
            }
        } catch (NotBoundException | MalformedURLException | RemoteException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
        this.dispose();
        new LogIn(null, true).setVisible(true);

    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        emailTextField.requestFocus();
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        passwordTextField.requestFocus();
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
       String password = new String(passwordTextField.getPassword());
        int length = password.length();
        if (length <= 5) {
            psearchLabel.setForeground(Color.red);
            psearchLabel.setText("Strength: Weak");
        } else if (length > 5 & length < 10) {
            psearchLabel.setForeground(Color.pink);
            psearchLabel.setText("Strength: Medium");
        } else if (length >= 10) {
            psearchLabel.setForeground(Color.orange);
            psearchLabel.setText("Strength: Strong");
            retypePasswordTextField.requestFocus();
        }
        
        
        
        
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void retypePasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypePasswordTextFieldActionPerformed
        if (passwordTextField.getText().equals(retypePasswordTextField.getText())) {
            address1TextField.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect");
        }
    }//GEN-LAST:event_retypePasswordTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
       // address1TextField.requestFocus();
        String txt = phoneTextField.getText();
        int caretPosition = phoneTextField.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            phoneTextField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            phoneTextField.setCaretPosition(caretPosition - 1);
            phoneTextField.setBackground(Color.WHITE);
               if (rootPaneCheckingEnabled) {
            createButton.setEnabled(true);
            createButton.doClick();
        } else {
            createButton.setEnabled(false);
        }
        }
        if (txt.matches("^[0][1-9]{2}[0-9]{7}$")) {
            phoneTextField.setBackground(Color.WHITE);
               if (rootPaneCheckingEnabled) {
            createButton.setEnabled(true);
            createButton.doClick();
        } else {
            createButton.setEnabled(false);
        }
        } else {
            phoneTextField.setBackground(Color.RED);
        }
     
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void nicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicTextFieldActionPerformed

        try {

            String nic = nicTextField.getText();
            if (!nicTextField.getText().isEmpty()) {
            
            int caretPosition = nicTextField.getCaretPosition();
            if (nic.matches("[0-9]{0,9}[vV]?")) {
                nameTextField.setEditable(true);
                nameTextField.requestFocus();

            } else{
                nameTextField.setEditable(true);
            }
        }

            StudentController studentController = ServerConnector.getServerConnector().getStudentController();
            Student student = studentController.checkNic(nic);
            if (student != null) {
                JOptionPane.showMessageDialog(rootPane, "ERROR");
            }
//            else{
//                String nic1 = nicTextField.getText();
//                int caretPosition = nicTextField.getCaretPosition();
//                    if (!nic1.matches("[0-9]{0,9}[vV]?")) {
//                nicTextField.setText(nic.substring(0, caretPosition - 1) + nic.substring(caretPosition));
//                nicTextField.setCaretPosition(caretPosition - 1);
//                
//            }
//            nameTextField.requestFocus();

        //    }
            //            if (regStudent) {
            //                JOptionPane.showMessageDialog(ExamRegistrationForm.this, "Student Registered successfully !!");
            //
            //            } else {
            //                JOptionPane.showMessageDialog(ExamRegistrationForm.this, "Student Registered failed !!");
            //            }
        } catch (NotBoundException | MalformedURLException | RemoteException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_nicTextFieldActionPerformed

    private void nicTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTextFieldKeyReleased
        if (!nicTextField.getText().isEmpty()) {
            String nic = nicTextField.getText();
            int caretPosition = nicTextField.getCaretPosition();
            if (!nic.matches("[0-9]{0,9}[vV]?")) {
                nicTextField.setText(nic.substring(0, caretPosition - 1) + nic.substring(caretPosition));
                nicTextField.setCaretPosition(caretPosition - 1);

            } 
//            else {
//                nameTextField.setEnabled(true);
//            }
        }
    }//GEN-LAST:event_nicTextFieldKeyReleased

    private void address1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address1TextFieldActionPerformed
        if (!(nicTextField.getText().isEmpty() && passwordTextField.getText().isEmpty() && retypePasswordTextField.getText().isEmpty() && nameTextField.getText().isEmpty() && emailTextField.getText().isEmpty() && phoneTextField.getText().isEmpty() && address1TextField.getText().isEmpty())) {
            phoneTextField.requestFocus();
        } else {
            createButton.setEnabled(false);
        }
    }//GEN-LAST:event_address1TextFieldActionPerformed

    private void phoneTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTextFieldKeyReleased
        String txt = phoneTextField.getText();
        int caretPosition = phoneTextField.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            phoneTextField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            phoneTextField.setCaretPosition(caretPosition - 1);
            phoneTextField.setBackground(Color.WHITE);
//               if (rootPaneCheckingEnabled) {
//            createButton.setEnabled(true);
//            createButton.doClick();
//        } else {
//            createButton.setEnabled(false);
//        }
        }
        if (txt.matches("^[0][1-9]{2}[0-9]{7}$")) {
            phoneTextField.setBackground(Color.WHITE);
//               if (rootPaneCheckingEnabled) {
//            createButton.setEnabled(true);
//            createButton.doClick();
//        } else {
//            createButton.setEnabled(false);
//        }
        } else {
            phoneTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_phoneTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExamRegistrationForm dialog = new ExamRegistrationForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1TextField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nicTextField;
    private org.jdesktop.swingx.JXPanel panel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel psearchLabel;
    private javax.swing.JPasswordField retypePasswordTextField;
    // End of variables declaration//GEN-END:variables

    public void refresh() {
        nicTextField.setText("");
        nameTextField.setText("");
        emailTextField.setText("");
        passwordTextField.setText("");
        retypePasswordTextField.setText("");
        phoneTextField.setText("");
        address1TextField.setText("");
        //address2TextField.setText("");
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

//try {
//            Webcam webcam = Webcam.getDefault();
//            //Webcam.
//           // webcam.
//            
//                //setSize(500,500);
//           // [176x144] [320x240] [640x480]
//                //Dimension dimension=new Dimension(176,144);
//                WebcamDevice device = webcam.getDevice();
//        //webcam.
//                Dimension dimension=new Dimension(176,144);
//                webcam.setViewSize(dimension);
//                WebcamPanel webcamPanel=new WebcamPanel(webcam);
//               // webcamPanel.setFillArea(true);
//
//
//                //webcamPanel.setMirrored(true);
//                
//                panel.setSize(176,144);
//            webcam = Webcam.getDefault();
//            BufferedImage image = webcam.getImage();
//            String path="C://New folder//"+"aaaa"+".jpg";
//            System.out.println("PathEEE"+path);
//            boolean write = ImageIO.write(image, "JPG", new File(path));
//            ImageIcon imageIcon1=new ImageIcon(path);
//            JLabel jLabel=new JLabel();
//            jLabel.setSize(panel.getSize());
//            //photoPath=path;
//            panel.removeAll();
//            panel.add(jLabel);
//            jLabel.setIcon(imageIcon1);
//            webcam.close();
//            webcamPanel.setSize(panel.getSize());
//            panel.add(webcamPanel);
//        } catch (IOException ex) {
//            Logger.getLogger(ExamRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
}
