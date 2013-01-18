
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Userframe.java
 *
 * Created on Jan 9, 2013, 9:21:21 PM
 */
/**
 *
 * @author gurjar
 */
public class Userframe extends javax.swing.JFrame {

    Connection conn=null;
   ResultSet rs=null;
   PreparedStatement pst=null;

    /** Creates new form Userframe */
    public Userframe() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
        // Fillcombo();
    }
private void Update_table(){
  //timer.start();

    try{
    String sql ="select Id,boarding,seater,seattype,Availability from cabtable1  ";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   info_table.setModel(DbUtils.resultSetToTableModel(rs));
 
 
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
 
 
    }



}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Tolabel = new javax.swing.JLabel();
        fromfield = new javax.swing.JTextField();
        nonAC = new javax.swing.JRadioButton();
        From_label = new javax.swing.JLabel();
        Tofield = new javax.swing.JTextField();
        seatfield = new javax.swing.JComboBox();
        seat_type = new javax.swing.JLabel();
        taxinolabel = new javax.swing.JLabel();
        seatlabel = new javax.swing.JLabel();
        taxinoField = new javax.swing.JTextField();
        Ac = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        bookbttn = new javax.swing.JButton();
        availablefield = new javax.swing.JTextField();
        availablebttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        clear_bttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info_table.setForeground(new java.awt.Color(51, 51, 255));
        info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        info_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info_tableMouseClicked(evt);
            }
        });
        info_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                info_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(info_table);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setToolTipText("Search by boarding station name");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information of Cab", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        Tolabel.setText("To");

        buttonGroup1.add(nonAC);
        nonAC.setText("NON AC");
        nonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonACActionPerformed(evt);
            }
        });

        From_label.setText("From");

        seatfield.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3 Seater", "4 seater", "5 Seater" }));

        seat_type.setText("Type");

        taxinolabel.setText("Taxi no");

        seatlabel.setText("Seats");

        buttonGroup1.add(Ac);
        Ac.setText("AC");
        Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(From_label)
                            .addGap(18, 18, 18)
                            .addComponent(fromfield))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(taxinolabel)
                                .addComponent(Tolabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(taxinoField)
                                .addComponent(Tofield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatlabel)
                            .addComponent(seat_type))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Ac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nonAC))
                            .addComponent(seatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(From_label)
                    .addComponent(fromfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tolabel)
                    .addComponent(Tofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxinolabel)
                    .addComponent(taxinoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(seatlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seat_type)
                            .addComponent(Ac)
                            .addComponent(nonAC)))
                    .addComponent(seatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Check Availability and Book cab", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        bookbttn.setText("Book Cab Now");

        availablebttn.setText("Check Availability");
        availablebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availablebttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(availablebttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availablefield, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(bookbttn)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availablebttn)
                    .addComponent(bookbttn)
                    .addComponent(availablefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clear_bttn.setText("New Search");
        clear_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear_bttn)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear_bttn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info_tableMouseClicked

        
        int row =info_table.getSelectedRow();
         String Table_click=(info_table.getModel().getValueAt(row, 0).toString());
        
     
        try{
         
         String sql ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where Id='"+Table_click+"' ";
         pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          if(rs.next()){
          
          String add1 =rs.getString("Id");
          taxinoField.setText(add1);
          String add2 =rs.getString("boarding");
          fromfield.setText(add2);
          String add3 =rs.getString("destination");
          Tofield.setText(add3);
          String add4 =rs.getString("seater");
          seatfield.setSelectedItem(add4);
          
          
         // int age= Integer.parseInt(add4);
    String seater=add4;
          
          }
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_info_tableMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased


 try{
                 
              String sql ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where boarding=?" ;
              
           
    pst =conn.prepareStatement(sql);
    pst.setString(1, txt_search.getText());
    rs=pst.executeQuery();
//    pst.execute();
    info_table.setModel(DbUtils.resultSetToTableModel(rs));
       
    String sql6 ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where Id=?" ;
              
           
    pst =conn.prepareStatement(sql6);
    pst.setString(1, txt_search.getText());
    rs=pst.executeQuery();
//    pst.execute();
    info_table.setModel(DbUtils.resultSetToTableModel(rs));
   
              String sql3 ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where boarding =?" ;
              
              pst=conn.prepareStatement(sql3);
               pst.setString(1, txt_search.getText());
               
               rs=pst.executeQuery();
               if(rs.next()){
               String add1=rs.getString("Id");
               taxinoField.setText(add1);
               String add2=rs.getString("boarding");
               fromfield.setText(add2);
               String add3=rs.getString("destination");
               Tofield.setText(add3);
               String add4=rs.getString("seater");
               seatfield.setSelectedItem(add4);
      
               }
               
               
  
   
              String sql2 ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where Id=?" ;
              
              pst=conn.prepareStatement(sql2);
               pst.setString(1, txt_search.getText());
               
               rs=pst.executeQuery();
               if(rs.next()){
               String add1=rs.getString("Id");
               taxinoField.setText(add1);
               String add2=rs.getString("boarding");
               fromfield.setText(add2);
               String add3=rs.getString("destination");
               Tofield.setText(add3);
               String add4=rs.getString("seater");
               seatfield.setSelectedItem(add4);
               
               }
               
               
    
   
              String sql1 ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where destination =?" ;
              
              pst=conn.prepareStatement(sql1);
               pst.setString(1, txt_search.getText());
               
               rs=pst.executeQuery();
               if(rs.next()){
               String add1=rs.getString("Id");
               taxinoField.setText(add1);
               String add2=rs.getString("boarding");
               fromfield.setText(add2);
               String add3=rs.getString("destination");
               Tofield.setText(add3);
               String add4=rs.getString("seater");
               seatfield.setSelectedItem(add4);
               
               }
                             
               
//       String sql8 ="select Id,boarding,destination,seater,seattype,Availability from cabtable where Id =?" ;    
//    pst =conn.prepareStatement(sql8);
//    pst.setString(1, txt_search.getText());
//    rs=pst.executeQuery();
////    pst.execute();
//    info_table.setModel(DbUtils.resultSetToTableModel(rs));
//    
//    
//    
//              String sql6 ="select Id,boarding,destination,seater,seattype,Availability from cabtable where boarding =?" ;
//              
//           
//    pst =conn.prepareStatement(sql6);
//    pst.setString(1, txt_search.getText());
//    rs=pst.executeQuery();
////    pst.execute();
//    info_table.setModel(DbUtils.resultSetToTableModel(rs));
//    
//    
//              String sql7="select Id,boarding,destination,seater,seattype,Availability from cabtable where  destination =?" ;
//              
//           
//    pst =conn.prepareStatement(sql7);
//    pst.setString(1, txt_search.getText());
//    rs=pst.executeQuery();
////    pst.execute();
//    info_table.setModel(DbUtils.resultSetToTableModel(rs));
//    
  
               
               
    }
           catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
        
        


    }//GEN-LAST:event_txt_searchKeyReleased

    private void info_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_info_tableKeyReleased

        
        
        if ((evt.getKeyCode() == KeyEvent.VK_UP) ||(evt.getKeyCode() == KeyEvent.VK_DOWN) )
        
        
       // if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP)
        {
        
        try{
         int row =info_table.getSelectedRow();
         String Table_click=(info_table.getModel().getValueAt(row, 0).toString());
         String sql ="select Id,boarding,destination,seater,seattype,Availability from cabtable1 where Id='"+Table_click+"' ";
         pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          if(rs.next()){
          
         String add1=rs.getString("Id");
               taxinoField.setText(add1);
               String add2=rs.getString("boarding");
               fromfield.setText(add2);
               String add3=rs.getString("destination");
               Tofield.setText(add3);
               String add4=rs.getString("seater");
               seatfield.setSelectedItem(add4);
               
          }
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_info_tableKeyReleased

    private void AcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcActionPerformed
 //seattype="AC";
    }//GEN-LAST:event_AcActionPerformed

    private void nonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonACActionPerformed
    //    seattype="NON-AC";

    }//GEN-LAST:event_nonACActionPerformed

    private void clear_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttnActionPerformed

        taxinoField.setText("");
fromfield.setText("");
Tofield.setText("");
txt_search.setText("");        
Update_table();
        
    }//GEN-LAST:event_clear_bttnActionPerformed

    private void availablebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availablebttnActionPerformed
   String add1=null;
    try{
        
            String value1= taxinoField.getText();
             String value2= fromfield.getText();
              String value3= Tofield.getText();
              // String value4= txt_age.getText();
               
         String value4=seatfield.getSelectedItem().toString();
       
               //String sql ="select * from cabtable1 where Id='"+value1+"',boarding ='"+value2+"',destination ='"+value3+"',seater='"+value4+"' ";
              
               //pst=conn.prepareStatement(sql);
          rs=pst.executeQuery();
          if(rs.next()){
          
        add1 =rs.getString("Availability");
          
               // String sql="update cabtable1 set Id='"+value1+"' ,boarding ='"+value2+"',destination ='"+value3+"',seater='"+value4+"' where Id='"+value1+"' ";
//              
          }
          if("Available".equals(add1)){
          availablefield.setText("Available");
          }else
          {
          availablefield.setText("Not Available");}
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        
        
        }
        Update_table();
    }//GEN-LAST:event_availablebttnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Userframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ac;
    private javax.swing.JLabel From_label;
    private javax.swing.JTextField Tofield;
    private javax.swing.JLabel Tolabel;
    private javax.swing.JButton availablebttn;
    private javax.swing.JTextField availablefield;
    private javax.swing.JButton bookbttn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_bttn;
    private javax.swing.JTextField fromfield;
    private javax.swing.JTable info_table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nonAC;
    private javax.swing.JLabel seat_type;
    private javax.swing.JComboBox seatfield;
    private javax.swing.JLabel seatlabel;
    private javax.swing.JTextField taxinoField;
    private javax.swing.JLabel taxinolabel;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
