/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import Proccess.LoaiSP;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 

/**
 *
 * @author Administrator
 */
public final class frmDanhmucLoaiSP extends javax.swing.JFrame {

    private final LoaiSP lsp = new LoaiSP();  
    private boolean cothem=true; 
    
      private final DefaultTableModel tableModel = new DefaultTableModel(); 
    //Ham do du lieu vao tableModel 
    public void ShowData() throws SQLException{         
        ResultSet result=  lsp.ShowLoaiSP();           
        try {             
            while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu 
                String rows[] = new String[2]; 
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng) 
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng                    
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel  
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update  
            } 
        }  
       catch (SQLException e) { 
        }  
    }   
    //Ham xoa du lieu trong tableModel 
    public void ClearData() throws SQLException{ 
         //Lay chi so dong cuoi cung 
         int n=tableModel.getRowCount()-1; 
         for(int i=n;i>=0;i--) 
            tableModel.removeRow(i);//Remove tung dong          
    }  
    //Ham xoa cac TextField 
    private void setNull() 
    { 
        //Xoa trang cac JtextField 
        this.txtMaloai.setText(null); 
        this.txtTenloai.setText(null); 
        this.txtMaloai.requestFocus();       
    } 
    //Ham khoa cac TextField 
    private void setKhoa(boolean a) 
    { 
        //Khoa hoac mo khoa cho Cac JTextField 
        this.txtMaloai. setEnabled (!a); 
        this.txtTenloai. setEnabled (!a); 
    }   
    //Ham khoa cac Button 
    private void setButton(boolean a) 
    { 
        //Vo hieu hoac co hieu luc cho cac JButton 
        this.btThem. setEnabled (a); 
        this.btXoa. setEnabled (a); 
        this.btSua. setEnabled (a); 
        this.btLuu. setEnabled (!a); 
        this.btKLuu. setEnabled (!a); 
        this.btThoat. setEnabled (a); 
    }
    
     public frmDanhmucLoaiSP() throws SQLException{ 
        initComponents(); // Khởi tạo các components trên JFrame                   
        String []colsName = {"Mã Loai", "Tên loai"}; 
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);   
        // kết nối jtable với tableModel   
        jTableLoaiSP.setModel(tableModel);   
        //gọi hàm ShowData để đưa dữ liệu vào tableModel  
        ShowData();  
        //goi Ham xoa trang cac TextField 
        setNull(); 
        //Goi ham Khoa cac TextField 
        setKhoa(true); 
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao  
        setButton(true); 
    } 
//Code tu sinh khi thiet ke giao dien va cac code khac ở đây……. 
    public static void main(String args[]) throws SQLException {       
      
        frmDanhmucLoaiSP f = new frmDanhmucLoaiSP(); 
        f.setVisible(true); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaloai = new javax.swing.JTextField();
        txtTenloai = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btKLuu = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLoaiSP = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DANH MỤC LOẠI SẢN PHẨM");

        jLabel2.setText("Mã loại");

        jLabel3.setText("Tên loại");

        txtMaloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaloaiActionPerformed(evt);
            }
        });

        btThem.setText("Thêm");

        btXoa.setText("Xóa ");

        btSua.setText("Sửa");

        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btKLuu.setText("K.lưu");

        btThoat.setText("Thoát");

        jTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại", "Tên loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableLoaiSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btKLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btThoat))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtMaloai, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaloaiActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLuuActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLoaiSP;
    private javax.swing.JTextField txtMaloai;
    private javax.swing.JTextField txtTenloai;
    // End of variables declaration//GEN-END:variables
}
