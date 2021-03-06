
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ABCCarRentals.java
 *
 * Created on 19 Apr, 2020, 4:29:34 PM
 */

/**
 *
 * @author mihir
 */
public class ABCCarRentals extends javax.swing.JFrame {

    /** Creates new form ABCCarRentals */
    public ABCCarRentals() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JFrame();
        deluxeRadio = new javax.swing.JRadioButton();
        semiDeluxeRadio = new javax.swing.JRadioButton();
        ordinaryRadio = new javax.swing.JRadioButton();
        guideCheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        noOfDaysField = new javax.swing.JTextField();
        totalButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        guideField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        ExitButton = new javax.swing.JButton();

        Dashboard.setMinimumSize(new java.awt.Dimension(600, 400));

        buttonGroup1.add(deluxeRadio);
        deluxeRadio.setText("Deluxe");
        deluxeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxeRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(semiDeluxeRadio);
        semiDeluxeRadio.setText("Semi Delux");
        semiDeluxeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semiDeluxeRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(ordinaryRadio);
        ordinaryRadio.setText("Ordinary");

        guideCheckbox.setText("Guide required");
        guideCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideCheckboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter the no. of days:");

        totalButton.setText("Total");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Amount:");

        jLabel6.setText("Guide Charges:");

        guideField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Total :");

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard.getContentPane());
        Dashboard.getContentPane().setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semiDeluxeRadio)
                            .addComponent(ordinaryRadio)
                            .addComponent(deluxeRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guideCheckbox))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(totalButton)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashboardLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalField)
                                    .addComponent(amountField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(guideField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(noOfDaysField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(exitButton)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel3)))
                .addGap(99, 99, 99))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(deluxeRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semiDeluxeRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guideCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordinaryRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(noOfDaysField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(guideField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ABC Car Rentals");

        jLabel2.setText("Password");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(ExitButton))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        String password=new String(pass.getPassword());
        if(password.equals("I am in!"))
        {
            this.dispose();
            Dashboard.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Worng, Password\nTry AGAIN!!!");
        }

}//GEN-LAST:event_okButtonActionPerformed

    private void semiDeluxeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiDeluxeRadioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_semiDeluxeRadioActionPerformed

    private void guideCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideCheckboxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_guideCheckboxActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_ExitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        deluxeRadio.setSelected(false);
        semiDeluxeRadio.setSelected(false);
        ordinaryRadio.setSelected(false);
        guideCheckbox.setSelected(false);
        amountField.setText("");
        guideField.setText("");
        totalField.setText("");
        noOfDaysField.setText("");
}//GEN-LAST:event_clearButtonActionPerformed

    private void guideFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_guideFieldActionPerformed

    private void deluxeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxeRadioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_deluxeRadioActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        // TODO add your handling code here:
        int days=Integer.parseInt(noOfDaysField.getText());
        if(days<0)
        {
            JOptionPane.showMessageDialog(null,"Please Enter the valid data *_* ");
            buttonGroup1.clearSelection();
            deluxeRadio.setSelected(false);
            semiDeluxeRadio.setSelected(false);
            ordinaryRadio.setSelected(false);
            guideCheckbox.setSelected(false);
            amountField.setText("");
            guideField.setText("");
            totalField.setText("");
            noOfDaysField.setText("");
        }
        else
        {
        int amount=0;
        if(deluxeRadio.isSelected())
        {
            amount = days*1000;
        }
        else if(semiDeluxeRadio.isSelected())
        {
            amount=days*800;
        }
        else if(ordinaryRadio.isSelected())
        {
            amount=days*700;
        }

        int guideCharges=0;
        if(guideCheckbox.isSelected())
        {
            guideCharges=days*500;
        }

        int total = amount + guideCharges;
        amountField.setText(amount+"");
        guideField.setText(guideCharges+"");
        totalField.setText(total+"");
        }
}//GEN-LAST:event_totalButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABCCarRentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Dashboard;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField amountField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton deluxeRadio;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox guideCheckbox;
    private javax.swing.JTextField guideField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField noOfDaysField;
    private javax.swing.JButton okButton;
    private javax.swing.JRadioButton ordinaryRadio;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton semiDeluxeRadio;
    private javax.swing.JButton totalButton;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables

}
