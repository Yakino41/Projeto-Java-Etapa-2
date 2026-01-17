//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormRelGerPlacaV extends javax.swing.JFrame {

    private BDGerProd gplacaV = BDGerProd.gerGerPlacaV();
    
    private static FormRelGerPlacaV formRelGerPlacaVUnic;
    
    private FormRelGerPlacaV() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormRelGerPlacaV geraFormRelGerPlacaV(){
        
        if(formRelGerPlacaVUnic == null){
            formRelGerPlacaVUnic = new FormRelGerPlacaV();      
        }
        return formRelGerPlacaVUnic;
    }
    
    public void selectTabPlacaV(){
        
        String valLinTab = "";
        
        int posLin = tabelaPlacaV2.getSelectedRow();
        
        for(int col = 0; col < tabelaPlacaV2.getColumnCount(); col++){
            valLinTab += tabelaPlacaV2.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 <tabelaPlacaV2.getColumnCount()){
                  valLinTab += " - ";          
            }

        }
         
        JOptionPane.showMessageDialog(
                null,
                "Linha Consultada "+posLin+"Informações: "+valLinTab,
                "Consulta de Tabela",
                1
        );
    
    }
    
    public void listarTab(){

        DefaultTableModel modelo = (DefaultTableModel) tabelaPlacaV2.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
       
        for(PlacaDeVideo placaV : gplacaV.getBdPlacaV()){
            posLin++;
            if (placaV != null) {
                modelo.addRow(new Object []{placaV.getMarca(), placaV.getModelo(), placaV.getAno(),
                    placaV.getPreco(), placaV.getDataGarantia()});
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlacaV2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral Das PlacasDeVideo");
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabelaPlacaV2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "ANO", "PREÇO", "GARANTIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPlacaV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPlacaV2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPlacaV2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPlacaV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPlacaV2MouseClicked
        selectTabPlacaV();
    }//GEN-LAST:event_tabelaPlacaV2MouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPlacaV2;
    // End of variables declaration//GEN-END:variables
}
