//jtable code
jTable1 = new javax.swing.JTable();

jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
    },
    new String [] {
        "Size", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "Pcs.", "CFT"
    }
) {
    boolean[] canEdit = new boolean [] {
        false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
});

jTable1.setGridColor(new java.awt.Color(204, 204, 204));

jTable1.setRowHeight(20);

jTable1.setSelectionBackground(new java.awt.Color(252, 242, 206));

jTable1.setSelectionForeground(new java.awt.Color(153, 0, 0));



jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyReleased(java.awt.event.KeyEvent evt) {
        jTable1KeyReleased(evt);
    }
});

jScrollPane2.setViewportView(jTable1);





//---jtable key released action listener

private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
        if(evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_I)
        {
            DefaultTableModel dtable = (DefaultTableModel)jTable1.getModel();
            Object obj[] = new Object[]{jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(),"","","","","",
                "","","","","","","","","","","","","","","","","0.00","0.00"};
            dtable.insertRow(jTable1.getSelectedRow(), obj);
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            KeyStroke tab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0);
            KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
            InputMap im = jTable1.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
            im.put(enter, im.get(tab));
        }
    }       
