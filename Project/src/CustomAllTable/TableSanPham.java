
package CustomAllTable;

import Entities.SanPham;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableSanPham extends AbstractTableModel{
    private final String head[]={"Mã SP","Tên SP","Số lượng","Đơn giá","Thương hiệu"};
    private final Class classes[]={String.class,String.class,Integer.class,Double.class,String.class};
    
    private ArrayList<SanPham> sp;

    public TableSanPham(ArrayList<SanPham> sp) {
        this.sp = sp;
    }
    
            
    @Override
    public int getRowCount() {
        return sp.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return sp.get(rowIndex).getMaSP();
            case 1: return sp.get(rowIndex).getTenSP();
            
            case 4: return sp.get(rowIndex).getThuongHieu();
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
