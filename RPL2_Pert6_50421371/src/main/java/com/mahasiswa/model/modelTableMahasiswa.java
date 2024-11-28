package com.mahasiswa.model;

import javax.swing.table.AbstractTableModel; // Correct import for AbstractTableModel
import java.util.List; // Correct import for List

public class modelTableMahasiswa extends AbstractTableModel {

    private List<modelMahasiswa> mahasiswaList; // List of ModelMahasiswa objects
    private String[] columnNames = {"ID", "NPM", "Nama", "Semester", "IPK"}; // Column headers

    // Constructor
    public modelTableMahasiswa(List<modelMahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    @Override
    public int getRowCount() {
        return mahasiswaList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelMahasiswa mahasiswa = mahasiswaList.get(rowIndex); // Get the object at the current row
        switch (columnIndex) {
            case 0:
                return mahasiswa.getId(); // ID
            case 1:
                return mahasiswa.getNpm(); // NPM
            case 2:
                return mahasiswa.getNama(); // Nama
            case 3:
                return mahasiswa.getSemester(); // Semester
            case 4:
                return mahasiswa.getIpk(); // IPK
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Return the column name
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Make cells non-editable
    }

    // Refresh the table data
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); // Notify listeners that data has changed
    }
}

