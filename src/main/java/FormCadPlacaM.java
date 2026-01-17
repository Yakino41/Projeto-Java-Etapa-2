//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class FormCadPlacaM extends javax.swing.JDialog {

    private PlacaMae placaM;
    private BDGerProd gerPlacaM = BDGerProd.gerGerPlacaM();
    
    private static FormCadPlacaM cadPlacaMUnico;
    
    private FormCadPlacaM() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadPlacaM getCadPlacaM(){
        
        if(cadPlacaMUnico == null){
            cadPlacaMUnico = new FormCadPlacaM();
        }
        return cadPlacaMUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtNumMemoria = new javax.swing.JLabel();
        rtGerMemRam = new javax.swing.JLabel();
        rtPciCompativel = new javax.swing.JLabel();
        rtTamanho = new javax.swing.JLabel();
        rtGarantia = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxNumMemoria = new javax.swing.JTextField();
        cxGerMemRam = new javax.swing.JTextField();
        cxPciCompativel = new javax.swing.JTextField();
        cxTamanho = new javax.swing.JTextField();
        cxGarantia = new javax.swing.JTextField();
        btCadastrarPlacaM = new javax.swing.JButton();
        btAlterarPlacaM = new javax.swing.JButton();
        btRelPlacaM = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btConsultarPlacaM = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btRemoverPlacaM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Placas Mãe");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        rtMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtMarca.setText("Marca");

        rtModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtModelo.setText("Modelo");

        rtAno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtAno.setText("Ano");

        rtPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtPreco.setText("Preço");

        rtNumMemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNumMemoria.setText("Canais De Memoria");

        rtGerMemRam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGerMemRam.setText("Geração De Slot  De Memoria");

        rtPciCompativel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtPciCompativel.setText("Versão PCI Compativel");

        rtTamanho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtTamanho.setText("Formato Da Placa Mãe");

        rtGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGarantia.setText("Duração da Garantia");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        cxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxModeloActionPerformed(evt);
            }
        });

        cxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnoActionPerformed(evt);
            }
        });

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        cxNumMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumMemoriaActionPerformed(evt);
            }
        });

        cxGerMemRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGerMemRamActionPerformed(evt);
            }
        });

        cxPciCompativel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPciCompativelActionPerformed(evt);
            }
        });

        cxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTamanhoActionPerformed(evt);
            }
        });

        cxGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGarantiaActionPerformed(evt);
            }
        });

        btCadastrarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrarPlacaM.setText("Cadastrar PlacaMãe");
        btCadastrarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPlacaMActionPerformed(evt);
            }
        });

        btAlterarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAlterarPlacaM.setText("Alterar PlacaMãe");
        btAlterarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPlacaMActionPerformed(evt);
            }
        });

        btRelPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRelPlacaM.setText("Exibir Relatorio Geral das Placas Mãe");
        btRelPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelPlacaMActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btConsultarPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btConsultarPlacaM.setText("Consultar PlacaMãe");
        btConsultarPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPlacaMActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btRemoverPlacaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemoverPlacaM.setText("Excluir Placa Mãe");
        btRemoverPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPlacaMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPciCompativel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPciCompativel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGerMemRam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGerMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTamanho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTamanho))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGarantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGarantia))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNumMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNumMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRelPlacaM)
                        .addGap(49, 49, 49)
                        .addComponent(btVoltarMenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrarPlacaM)
                            .addComponent(btAlterarPlacaM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultarPlacaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemoverPlacaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtMarca)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtModelo)
                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtAno)
                            .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPreco)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtNumMemoria)
                            .addComponent(cxNumMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGerMemRam)
                            .addComponent(cxGerMemRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPciCompativel)
                            .addComponent(cxPciCompativel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtTamanho)
                            .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGarantia)
                            .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrarPlacaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterarPlacaM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btConsultarPlacaM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverPlacaM)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVoltarMenu)
                            .addComponent(btRelPlacaM)
                            .addComponent(btLimpar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed

    private void cxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxModeloActionPerformed

    private void cxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAnoActionPerformed

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void cxNumMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumMemoriaActionPerformed

    private void cxGerMemRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGerMemRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGerMemRamActionPerformed

    private void cxPciCompativelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPciCompativelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPciCompativelActionPerformed

    private void cxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTamanhoActionPerformed

    private void cxGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGarantiaActionPerformed

    private void btCadastrarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPlacaMActionPerformed
        cadastrarPlacaM();
    }//GEN-LAST:event_btCadastrarPlacaMActionPerformed

    private void btConsultarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPlacaMActionPerformed
        consultarPlacaM();
    }//GEN-LAST:event_btConsultarPlacaMActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void btAlterarPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPlacaMActionPerformed
        alterarPlacaM();
    }//GEN-LAST:event_btAlterarPlacaMActionPerformed

    private void btRelPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelPlacaMActionPerformed
        FormRelGerPlacaM.geraFormRelGerPlacaM().setVisible(true);
    }//GEN-LAST:event_btRelPlacaMActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpa();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPlacaMActionPerformed
        excluirPlacaM();
    }//GEN-LAST:event_btRemoverPlacaMActionPerformed

  
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja fechar o Cadastro?",
                "Saindo",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpa(){
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxAno.setText("");
        cxNumMemoria.setText("");
        cxGerMemRam.setText("");
        cxPciCompativel.setText("");
        cxTamanho.setText("");
        cxGarantia.setText("");
        cxMarca.requestFocus();
    }
    
    public void cadastrarPlacaM(){
    
        placaM = new PlacaMae();

        try {
            placaM.setMarca(cxMarca.getText());
        }
        
        catch (ProcInvException pie) {
                JOptionPane.showMessageDialog(
                        null,
                        pie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
        } 

        catch (PlacaVidInvException pvid) {
               JOptionPane.showMessageDialog(
                       null,
                       pvid.getMessage(),
                       "ERRO",
                       ERROR_MESSAGE
                );
        } 

        catch (PlacaMaeInvException pmie) {
                JOptionPane.showMessageDialog(
                        null,
                        pmie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxMarca.setText("");
                cxMarca.requestFocus();
                return;
        }
        
        try{
            placaM.setModelo(cxModelo.getText());
        }
        catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
        }
        
        try{
            placaM.setAno(Integer.parseInt(cxAno.getText()));
        }

        catch (AnoInvException aie) {
                JOptionPane.showMessageDialog(
                        null,
                        aie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxAno.setText("");
                cxAno.requestFocus();
                return;
        } 

        catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxAno.setText("");
                cxAno.requestFocus();
                return;
        }

        try{
                placaM.setPreco(Float.parseFloat(cxPreco.getText()));
        }

        catch (PrecoInvException pie) {
                JOptionPane.showMessageDialog(
                        null,
                        pie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxPreco.setText("");
                cxPreco.requestFocus();
                return;
        }
        
        catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxPreco.setText("");
                cxPreco.requestFocus();
                return;
        }
        
        try{
                placaM.setNumMemoria(Integer.parseInt(cxNumMemoria.getText()));
        }  
        
        catch (NumMemoriaException nmie) {
            JOptionPane.showMessageDialog(
                    null,
                    nmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
                cxNumMemoria.setText("");
                cxNumMemoria.requestFocus();
                return;
        }

        catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Por Favor digite um numero inteiro.",
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxNumMemoria.setText("");
                cxNumMemoria.requestFocus();
                return;
        }
        
        try{
                placaM.setGerMemRam(cxGerMemRam.getText());
        }

        catch(GerMemRamException gmre){
               JOptionPane.showMessageDialog(
                       null,
                       gmre.getMessage(),
                       "ERRO",
                       ERROR_MESSAGE
               );
                cxGerMemRam.setText("");
                cxGerMemRam.requestFocus();
                return;
        }
 
        try{
                placaM.setPciCompativel(Float.parseFloat(cxPciCompativel.getText()));
        }
        
        catch(PciCompInvException pcie){
            JOptionPane.showMessageDialog(
                    null,
                    pcie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
                cxPciCompativel.setText("");
                cxPciCompativel.requestFocus();
                return;
        }

        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO]Por Favor Digite um numero Fatorial Exemplo: 5.0", 
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxPciCompativel.setText("");
            cxPciCompativel.requestFocus();
            return;
        }

        try{
            placaM.setTamanho(cxTamanho.getText());
        }
        
        catch(TamanhoInvException tie){
            JOptionPane.showMessageDialog(
                    null,
                    tie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
                cxTamanho.setText("");
                cxTamanho.requestFocus();
                return;
        }
        
        placaM.setDataGarantia(cxGarantia.getText());
        
        JOptionPane.showMessageDialog(
                null,
                "Placa Mãe Cadastrada Com Sucesso!",
                "Cadastro de Placa Mãe",
                1
        );
        
        placaM = gerPlacaM.cadPlacaM(placaM);
        limpa();
    }

    public void alterarPlacaM() {
    PlacaMae placaMBusca = new PlacaMae(); 
    
    try { 
        placaMBusca.setMarca(cxMarca.getText());
        placaMBusca.setModelo(cxModelo.getText());
           
            int confirmacao = JOptionPane.showConfirmDialog(
            null, 
            "Tem certeza que deseja alterar esta PlacaDeVideo?",
            "Confirmação de Remoção", 
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }
        
        placaM = gerPlacaM.alteraPlacaM(placaMBusca);
        
        if(placaM != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Preço e Garantia da Placa Mãe atualizados com sucesso!",
                    "Atualização de Placa Mãe",
                    1
            );
            limpa();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe Placa Mãe com esta Marca e Modelo.",
                    "Placa Mãe inexistente",
                    0
            );        
            limpa();
            }
        }
    
        catch (ProcInvException pie) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].",
                        "ERRO",
                        0
                );
        } 

        catch (PlacaVidInvException pvid) {
               JOptionPane.showMessageDialog(
                       null,
                       "[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]",
                       "ERRO",
                       0
               );
        } 

        catch (PlacaMaeInvException pmie) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]",
                        "ERRO",
                        0
                );
                limpa();
        }
    
        catch (ProcModInvException pmie) {
                JOptionPane.showMessageDialog(
                        null,
                        pmie.getMessage(),
                        "ERRO",
                        0
                );
        }

    }

    
    public void consultarPlacaM(){
        placaM = new PlacaMae();

       try{
        placaM.setMarca(cxMarca.getText());
        placaM.setModelo(cxModelo.getText());
        placaM = gerPlacaM.consPlacaM(placaM);
        
        if(placaM != null){
            cxModelo.setText(placaM.getModelo());
            cxMarca.setText(placaM.getMarca());
            cxAno.setText(Integer.toString((int) placaM.getAno()));
            cxPreco.setText(Float.toString((float) placaM.getPreco()));
            cxNumMemoria.setText(Integer.toString((int)placaM.getNumMemoria()));
            cxGerMemRam.setText(placaM.getGerMemRam());
            cxPciCompativel.setText(Float.toString(placaM.getPciCompativel()));
            cxTamanho.setText(placaM.getTamanho());
            cxGarantia.setText(placaM.getDataGarantia());
            JOptionPane.showMessageDialog(
                    null,
                    "Verifique As Informaçoes",
                    "Consulta De Placa Mãe",
                    QUESTION_MESSAGE
            );
            limpa();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não há um Placa Mãe registrado com essa Marca e Modelo",
                    "PlacaMãe inexistente",
                    0
            );        
            limpa();
        }   
    }
        catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].",
                    "ERRO",
                    0
            );    
        }
         catch (PlacaVidInvException pvid) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]",
                    "ERRO",
                    0
            );
        } 

        catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]",
                    "ERRO",
                    0
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }
       
        catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
        }
       
       
    } 
    
    public void excluirPlacaM(){
    String marca = cxMarca.getText();
    String modelo = cxModelo.getText();

    if (marca.trim().isEmpty() || modelo.trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Para remover, preencha a Marca e o Modelo.",
                "Dados Incompletos",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    int confirmacao = JOptionPane.showConfirmDialog(
        null, 
        "Tem certeza que deseja remover esta Placa Mãe?",
        "Confirmação de Remoção", 
        JOptionPane.YES_NO_OPTION
    );

    if (confirmacao != JOptionPane.YES_OPTION) {
        return;
    }

    PlacaMae placaMParaRemover = new PlacaMae();
        try {
            placaMParaRemover.setMarca(marca);
        } 
        
        catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].",
                    "ERRO",
                    0
            );
        } 
        
        catch (PlacaVidInvException pvie) {
            JOptionPane.showMessageDialog(
                    null,
                    "[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]",
                    "ERRO",
                    0
            );
        } 
        
        catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(null,
                    "[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON]",
                    "ERRO",
                    0
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }
        
        try {
            placaMParaRemover.setModelo(modelo);
        }
        catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
            cxModelo.setText("");
            cxModelo.requestFocus();
            return;
        }
    
    PlacaMae placaMRemovido = gerPlacaM.removePlacaMPorMarcaModelo(placaMParaRemover);

    if (placaMRemovido != null) {
        JOptionPane.showMessageDialog(
                null,
                "Placa Mãe removida com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );
        limpa();
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Nenhuma Placa Mãe encontrado com a Marca e Modelo informados.",
                "Placa Mãe Inexistente",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarPlacaM;
    private javax.swing.JButton btCadastrarPlacaM;
    private javax.swing.JButton btConsultarPlacaM;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelPlacaM;
    private javax.swing.JButton btRemoverPlacaM;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxGarantia;
    private javax.swing.JTextField cxGerMemRam;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNumMemoria;
    private javax.swing.JTextField cxPciCompativel;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtGarantia;
    private javax.swing.JLabel rtGerMemRam;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtNumMemoria;
    private javax.swing.JLabel rtPciCompativel;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtTamanho;
    // End of variables declaration//GEN-END:variables
}