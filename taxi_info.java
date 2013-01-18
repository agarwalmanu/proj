/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * taxi_info.java
 *
 * Created on Jan 8, 2013, 12:01:24 AM
 */
/**T
 *
 * @author gurjar
 */
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Random;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class taxi_info extends javax.swing.JFrame {
Connection conn=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
    /** Creates new form taxi_info */
    public taxi_info() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
         Fillcombo();
    }
private void Update_table(){
  //timer.start();

    try{
    String sql ="select boarding,seater,seattype,Availability from cabtable1  ";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   info_table.setModel(DbUtils.resultSetToTableModel(rs));
 
 
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
 
 
    }



}
private void Fillcombo(){
 
 
try{
  String sql="select * from cabtable1";
  pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
 
   while(rs.next()){
   String boarding =rs.getString("boarding");
   ComboBox_name.addItem(boarding);
 
   }

}catch(Exception e){

JOptionPane.showMessageDialog(null, e);

} finally {
try{
  rs.close();
      pst.close();
    // conn.close();
  }
  catch(Exception e) {
                   }
      }





}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_table = new javax.swing.JTable();
        ComboBox_name = new javax.swing.JComboBox();
        txt_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        seatfield = new javax.swing.JComboBox();
        nonAC = new javax.swing.JRadioButton();
        Ac = new javax.swing.JRadioButton();
        From_label = new javax.swing.JLabel();
        seatlabel = new javax.swing.JLabel();
        fromfield = new javax.swing.JTextField();
        seat_type = new javax.swing.JLabel();
        Tolabel = new javax.swing.JLabel();
        Tofield = new javax.swing.JTextField();
        taxinolabel = new javax.swing.JLabel();
        taxinoField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        clear_bttn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        update_bttn = new javax.swing.JButton();
        delete_bttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info_table.setBackground(new java.awt.Color(204, 255, 204));
        info_table.setForeground(new java.awt.Color(0, 0, 153));
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

        ComboBox_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mahesh", "suresh", "ganesh" }));
        ComboBox_name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBox_namePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedule the cab", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 3, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        seatfield.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3 Seater", "4 Seater", "5 Seater" }));

        buttonGroup1.add(nonAC);
        nonAC.setText("NON-AC");
        nonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonACActionPerformed(evt);
            }
        });

        buttonGroup1.add(Ac);
        Ac.setText("AC");
        Ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcActionPerformed(evt);
            }
        });

        From_label.setText("From");

        seatlabel.setText("Seats");

        seat_type.setText("Type:");

        Tolabel.setText("To");

        taxinolabel.setText("Taxi no");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seat_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nonAC)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seatlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(taxinolabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(taxinoField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(From_label)
                                    .addComponent(Tolabel))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tofield, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(fromfield, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(From_label)
                    .addComponent(fromfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Tolabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxinolabel)
                    .addComponent(taxinoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatlabel)
                    .addComponent(seatfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seat_type)
                    .addComponent(Ac)
                    .addComponent(nonAC))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clear_bttn.setText("Clear");
        clear_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bttnActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        update_bttn.setText("Update");
        update_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bttnActionPerformed(evt);
            }
        });

        delete_bttn.setText("Delete");
        delete_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_bttn)
                    .addComponent(savebtn)
                    .addComponent(update_bttn)
                    .addComponent(clear_bttn))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(savebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_bttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_bttn)
                .addGap(11, 11, 11)
                .addComponent(clear_bttn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addComponent(ComboBox_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(ComboBox_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info_tableMouseClicked
        // TODO add your handling code here:
        
        int row =info_table.getSelectedRow();
         String Table_click=(info_table.getModel().getValueAt(row, 0).toString());
        
     
        try{
         
         String sql ="select * from cabtable1 where Id='"+Table_click+"' ";
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

    private void ComboBox_namePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBox_namePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp =(String)ComboBox_name.getSelectedItem();            
            String sql="select * from cabtable1 where boarding=?";
           try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            if(rs.next()){
            String add1 =rs.getString("Id");
            taxinoField.setText(add1);
            String add2 =rs.getString("boarding");
            fromfield.setText(add2);
            String add3 =rs.getString("destination");
            Tofield.setText(add3);
            String add4 =rs.getString("seater");
             ComboBox_name.setSelectedItem(add4);
            
            
            
            
           
            }  
           }
    
           catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
        
    }//GEN-LAST:event_ComboBox_namePopupMenuWillBecomeInvisible

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed

        
        // TODO add your handling code here:
        try{
           
         String sql ="Insert into cabtable1 (Id,boarding,destination,seater,seattype,username,password,availability,allstationX,allstationY) values (?,?,?,?,?,?,?,?,?,?)";
            Random rand =new Random();
            int rand1= rand.nextInt(1000);
         pst=conn.prepareStatement(sql);
         pst.setString(1,Integer.toString(rand1));
         pst.setString(2, fromfield.getText());
         pst.setString(3, Tofield.getText());
       
         String value=seatfield.getSelectedItem().toString();
         pst.setString(4,value);
     //    pst.setBytes(5,person_image);
        pst.setString(5,seattype );
         
         
         
         //  fis = new FileInputStream(image);
       //   pst.setString(1, jTextField4.getText());
       // pst.setBinaryStream(5, (InputStream)fis, (int)(image.length()));
                //  pst.setBytes(5, persons_image);
         pst.execute();
         
          JOptionPane.showMessageDialog(null, "Saved");
            }        
    
           catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
        Update_table();
    }//GEN-LAST:event_savebtnActionPerformed

    private void delete_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bttnActionPerformed

        
        
        String sql="delete from cabtable1 where Id =?";
        try{
        
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, taxinoField.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
        
        }catch(Exception e){
        
         JOptionPane.showMessageDialog(null, e);
        
        }
        Update_table();
    }//GEN-LAST:event_delete_bttnActionPerformed

    private void update_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bttnActionPerformed

        
        
        try{
        
            String value1= taxinoField.getText();
             String value2= fromfield.getText();
              String value3= Tofield.getText();
              // String value4= txt_age.getText();
               
         String value4=seatfield.getSelectedItem().toString();
       
               
               String sql="update cabtable1 set Id='"+value1+"' ,boarding ='"+value2+"',destination ='"+value3+"',seater='"+value4+"' where Id='"+value1+"' ";
              pst=conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Updated");
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        
        
        }
        Update_table();
    }//GEN-LAST:event_update_bttnActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

         try{
                 
//              String sql ="select * from cabtable where name =?" ;
//              
//           
//    pst =conn.prepareStatement(sql);
//    pst.setString(1, txt_search.getText());
//    rs=pst.executeQuery();
////    pst.execute();
//    info_table.setModel(DbUtils.resultSetToTableModel(rs));
//       
   
   
              String sql3 ="select * from cabtable1 where boarding =?" ;
              
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
               
               
  
   
              String sql2 ="select * from cabtable1 where Id=?" ;
              
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
               
               
    
   
              String sql1 ="select * from cabtable1 where destination =?" ;
              
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
                             
               
       String sql8 ="select * from cabtable1 where Id =?" ;    
    pst =conn.prepareStatement(sql8);
    pst.setString(1, txt_search.getText());
    rs=pst.executeQuery();
//    pst.execute();
    info_table.setModel(DbUtils.resultSetToTableModel(rs));
    
    
    
              String sql6 ="select * from cabtable1 where boarding =?" ;
              
           
    pst =conn.prepareStatement(sql6);
    pst.setString(1, txt_search.getText());
    rs=pst.executeQuery();
//    pst.execute();
    info_table.setModel(DbUtils.resultSetToTableModel(rs));
    
    
              String sql7="select * from cabtable1 where  destination =?" ;
              
           
    pst =conn.prepareStatement(sql7);
    pst.setString(1, txt_search.getText());
    rs=pst.executeQuery();
//    pst.execute();
    info_table.setModel(DbUtils.resultSetToTableModel(rs));
    
  
               
               
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
         String sql ="select * from cabtable1 where Id='"+Table_click+"' ";
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
       seattype="AC";
    }//GEN-LAST:event_AcActionPerformed

    private void nonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonACActionPerformed
       
        seattype="NON-AC";
    }//GEN-LAST:event_nonACActionPerformed
/*
    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed
*/
private void clear_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bttnActionPerformed
taxinoField.setText("");
fromfield.setText("");
Tofield.setText("");
txt_search.setText("");        
Update_table();
}//GEN-LAST:event_clear_bttnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new taxi_info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ac;
    private javax.swing.JComboBox ComboBox_name;
    private javax.swing.JLabel From_label;
    private javax.swing.JTextField Tofield;
    private javax.swing.JLabel Tolabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_bttn;
    private javax.swing.JButton delete_bttn;
    private javax.swing.JTextField fromfield;
    public javax.swing.JTable info_table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nonAC;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel seat_type;
    private javax.swing.JComboBox seatfield;
    private javax.swing.JLabel seatlabel;
    private javax.swing.JTextField taxinoField;
    private javax.swing.JLabel taxinolabel;
    private javax.swing.JTextField txt_search;
    private javax.swing.JButton update_bttn;
    // End of variables declaration//GEN-END:variables

private String seattype;
}