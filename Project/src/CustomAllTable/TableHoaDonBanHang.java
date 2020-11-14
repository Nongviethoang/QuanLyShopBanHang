
package CustomAllTable;

import Entities.HoaDonBanHang;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableHoaDonBanHang extends AbstractTableModel{
    private final String head[]={"Mã hóa đơn","Mã KH","Mã nhân viên","Ngày lập"};
    private final Class classes[]={String.class,String.class,String.class,String.class};
    
    private ArrayList<HoaDonBanHang> hd;

    public TableHoaDonBanHang(ArrayList<HoaDonBanHang> dh) {
        this.hd = dh;
    }

    @Override
    public int getRowCount() {
        return hd.size();
    }

    @Override
    public int getColumnCount() {
        return classes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return hd.get(rowIndex).getMaHD();
            case 1: return hd.get(rowIndex).getMakhachHang();
            case 2: return hd.get(rowIndex).getNgayLap();
            case 3: return hd.get(rowIndex).getNgayLap();
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
