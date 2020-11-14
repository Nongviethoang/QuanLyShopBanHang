/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomAllTable;

import Entities.NhanVien;
import Entities.SanPham;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class TableNhanvien  extends AbstractTableModel{
    private final String head[]={"Mã NV","Tên NV","Địa chỉ","Số điện thoại"};
    private final Class classes[]={String.class,String.class,String.class,String.class};
    
    private ArrayList<NhanVien> nv;

    public TableNhanvien(ArrayList<NhanVien> nv) {
        this.nv = nv;
    }
    
            
    @Override
    public int getRowCount() {
        return nv.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return nv.get(rowIndex).getMaNV();
            case 1: return nv.get(rowIndex).getTenNV();
            case 2: return nv.get(rowIndex).getDiaChi();
            case 3: return nv.get(rowIndex).getsDt();
            default: return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return head[column];
    }
    
}
