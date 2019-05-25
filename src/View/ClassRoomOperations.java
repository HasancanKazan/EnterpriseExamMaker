/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Presenter.ClassRoomOperationsPresenter;
import javax.swing.JButton;

/**
 *
 * @author Hasancan
 */
public class ClassRoomOperations extends javax.swing.JInternalFrame implements IClassRoomOperations{

    /**
     * Creates new form ClassRoomOperations
     */
    
    private static ClassRoomOperations instance = new ClassRoomOperations();
    private ClassRoomOperationsPresenter presenter;
    
    public ClassRoomOperations() {
        initComponents();        
        this.setVisible(true);        
        presenter = new ClassRoomOperationsPresenter(this);
    }

    public static ClassRoomOperations getFrame(){
        return instance;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuildingName = new javax.swing.JTextField();
        txtHallNo = new javax.swing.JTextField();
        txtCapacity = new javax.swing.JTextField();
        btnAddClassroom = new javax.swing.JButton();

        setTitle("ClassRoom Operations");

        jLabel1.setText("Building Name :");

        jLabel2.setText("Hall No :");

        jLabel3.setText("Capacity :");

        txtBuildingName.setToolTipText("Bina Adı");

        txtHallNo.setToolTipText("Salon No");

        txtCapacity.setToolTipText("Salon Kapasitesi");

        btnAddClassroom.setText("Add Classroom");
        btnAddClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassroomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddClassroom)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuildingName)
                            .addComponent(txtHallNo)
                            .addComponent(txtCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuildingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHallNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddClassroom)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassroomActionPerformed
        // TODO add your handling code here:
        presenter.btnAddClassroom();
    }//GEN-LAST:event_btnAddClassroomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClassroom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBuildingName;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtHallNo;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getTxtBuildingName() {
        return txtBuildingName.getText();
    }

    @Override
    public String getTxtHallNo() {
        return txtHallNo.getText();
    }

    @Override
    public int getTxtCapacity() {
        return Integer.valueOf(txtCapacity.getText());
    }

    @Override
    public JButton btnAddClassroom() {
        return btnAddClassroom;
    }
}
