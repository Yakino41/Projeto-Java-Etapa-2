//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class FormCadProc extends javax.swing.JDialog {

    private Processador proc;
    private BDGerProd gerProc = BDGerProd.gerGerProc();
    
    private static FormCadProc cadProcUnico;
    
    private FormCadProc() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadProc getCadProc(){
        
        if(cadProcUnico == null){
            cadProcUnico = new FormCadProc();
        }
        return cadProcUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtAno = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtSocket = new javax.swing.JLabel();
        rtNucleo = new javax.swing.JLabel();
        rtThreads = new javax.swing.JLabel();
        rtFreqBase = new javax.swing.JLabel();
        rtFreqMax = new javax.swing.JLabel();
        rtGarantia = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxSocket = new javax.swing.JTextField();
        cxNucleo = new javax.swing.JTextField();
        cxThreads = new javax.swing.JTextField();
        cxFreqBase = new javax.swing.JTextField();
        cxFreqMax = new javax.swing.JTextField();
        cxGarantia = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRelProc = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Processadores");
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

        rtSocket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtSocket.setText("Socket");

        rtNucleo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNucleo.setText("Nucleos");

        rtThreads.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtThreads.setText("Threads");

        rtFreqBase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtFreqBase.setText("Frequencia Base");

        rtFreqMax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtFreqMax.setText("Frequencia Máxima");

        rtGarantia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtGarantia.setText("Duração Garantia");

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

        cxSocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSocketActionPerformed(evt);
            }
        });

        cxNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNucleoActionPerformed(evt);
            }
        });

        cxThreads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxThreadsActionPerformed(evt);
            }
        });

        cxFreqBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFreqBaseActionPerformed(evt);
            }
        });

        cxFreqMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFreqMaxActionPerformed(evt);
            }
        });

        cxGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGarantiaActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("Cadastrar Processador");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAlterar.setText("Alterar Processador");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRelProc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRelProc.setText("Exibir Relatorio Geral dos Processadores");
        btRelProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelProcActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btConsultar.setText("Consultar Processador");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setText("Voltar Menu");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRemover.setText("Remover Processador");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtMarca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtSocket)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxSocket))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtAno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtPreco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtThreads)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxThreads))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rtNucleo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtFreqBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFreqBase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtFreqMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFreqMax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtGarantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btRelProc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btVoltarMenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAlterar)
                            .addComponent(btCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(rtSocket)
                            .addComponent(cxSocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtNucleo)
                            .addComponent(cxNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtThreads)
                            .addComponent(cxThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtFreqBase)
                            .addComponent(cxFreqBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtFreqMax)
                            .addComponent(cxFreqMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtGarantia)
                            .addComponent(cxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRelProc)
                    .addComponent(btVoltarMenu)
                    .addComponent(btLimpar))
                .addContainerGap())
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

    private void cxSocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSocketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSocketActionPerformed

    private void cxNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNucleoActionPerformed

    private void cxThreadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxThreadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxThreadsActionPerformed

    private void cxFreqBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFreqBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxFreqBaseActionPerformed

    private void cxFreqMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFreqMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxFreqMaxActionPerformed

    private void cxGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGarantiaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRelProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelProcActionPerformed
        abreRelProc();
    }//GEN-LAST:event_btRelProcActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        excluir();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpa();
    }//GEN-LAST:event_btLimparActionPerformed

    public void abreRelProc(){
        FormRelGerProc.geraFormRelGerProc().setVisible(true);
    }
    
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
        cxSocket.setText("");
        cxNucleo.setText("");
        cxThreads.setText("");
        cxFreqBase.setText("");
        cxFreqMax.setText("");
        cxGarantia.setText("");
        cxMarca.requestFocus();
    }
    
    public void cadastrar(){
    
        proc = new Processador();

        try {
                proc.setMarca(cxMarca.getText());
        }
        
        catch (ProcInvException pie) {
                JOptionPane.showMessageDialog(
                        null,
                        pie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxMarca.setText("");
                cxMarca.requestFocus();
                return;
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
        }
        
        try{
            proc.setModelo(cxModelo.getText());
        }
        catch (ProcModInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    ERROR_MESSAGE
            );
            cxModelo.setText("");
            cxModelo.requestFocus();
            return;
        }
        
        try{
            proc.setAno(Integer.parseInt(cxAno.getText()));
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
                proc.setPreco(Float.parseFloat(cxPreco.getText()));
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
                proc.setSocketCompativel(cxSocket.getText());
        }  

        catch (SocketCompInvException scie) {
                JOptionPane.showMessageDialog(
                        null,
                        scie.getMessage(),
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxSocket.setText("");
                cxSocket.requestFocus();
                return;
        }

        try{
                proc.setNucleo(Integer.parseInt(cxNucleo.getText()));
        }

        catch(NucleoInvException nie){
               JOptionPane.showMessageDialog(
                       null, 
                       nie.getMessage(),
                       "ERRO",
                       ERROR_MESSAGE
               );
                cxNucleo.setText("");
                cxNucleo.requestFocus();
                return;
        }

        catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Por Favor digite um numero inteiro.",
                        "ERRO", 
                        ERROR_MESSAGE
                );
                cxNucleo.setText("");
                cxNucleo.requestFocus();
                return;
        }
        
        try{
                proc.setThreads(Integer.parseInt(cxThreads.getText()));
        }

        catch(ThreadsInvException tie){
                JOptionPane.showMessageDialog(
                        null,
                        tie.getMessage(), 
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxThreads.setText("");
                cxThreads.requestFocus();
                return;
        }

        catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(
                        null,
                        "[ERRO] Por Favor digite um numero inteiro.",
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxThreads.setText("");
                cxThreads.requestFocus();
                return;
        }

        try{
                proc.setFreqBase(Float.parseFloat(cxFreqBase.getText()));
        }
        
        catch(FreqBaseInvException fbie){
               JOptionPane.showMessageDialog(
                       null,
                       fbie.getMessage(), 
                       "ERRO",
                       ERROR_MESSAGE
               );
               cxFreqBase.setText("");
               cxFreqBase.requestFocus();
               return;
        }
        
        try{
                proc.setFreqMax(Float.parseFloat(cxFreqMax.getText()));
        }

        catch(FreqMaxInvException fmie){
                JOptionPane.showMessageDialog(
                        null,
                        fmie.getMessage(), 
                        "ERRO",
                        ERROR_MESSAGE
                );
                cxFreqMax.setText("");
                cxFreqMax.requestFocus();
                return;
        }
        
        proc.setDataGarantia(cxGarantia.getText());
        
        JOptionPane.showMessageDialog(
                null,
                "Processador Cadastrada Com Sucesso!",
                "Cadastro de Processador",
                1
        );
 
        proc = gerProc.cadProc(proc);
        limpa();
    }

    public void alterar() {
    Processador procBusca = new Processador(); 
    
    try { 
        procBusca.setMarca(cxMarca.getText());
        procBusca.setModelo(cxModelo.getText());

        int confirmacao = JOptionPane.showConfirmDialog(
            null, 
            "Tem certeza que deseja alterar este Processador?",
            "Confirmação de Remoção", 
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }
        
        proc = gerProc.alteraProc(procBusca);
 
        if(proc != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Preço e Garantia do Processador atualizados com sucesso!",
                    "Atualização de Processador",1
            );
            limpa();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe Processador com esta Marca e Modelo.",
                    "Processador inexistente",
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
                limpa();
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
        }
    
        catch (ProcModInvException pmie) {
                JOptionPane.showMessageDialog(
                        null,
                        pmie.getMessage(),
                        "ERRO",
                        0
                );
                limpa();
        }

    }

    
    public void consultar(){
        proc = new Processador();

       try{
        proc.setMarca(cxMarca.getText());
        proc.setModelo(cxModelo.getText());
        proc = gerProc.consProc(proc);
        
        if(proc != null){
            cxModelo.setText(proc.getModelo());
            cxMarca.setText(proc.getMarca());
            cxAno.setText(Integer.toString((int) proc.getAno()));
            cxPreco.setText(Float.toString((float) proc.getPreco()));
            cxSocket.setText(proc.getSocketCompativel());
            cxNucleo.setText(Integer.toString((int)proc.getNucleo()));
            cxThreads.setText(Integer.toString((int)proc.getThreads()));
            cxFreqBase.setText(Float.toString((float)proc.getFreqBase()));
            cxFreqMax.setText(Float.toString((float)proc.getFreqMax()));
            cxGarantia.setText(proc.getDataGarantia());
            JOptionPane.showMessageDialog(
                    null,
                    "Verifique As Informaçoes",
                    "Consulta De Processador",
                    QUESTION_MESSAGE
            );
            limpa();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não há um Processador registrado com essa Marca e Modelo",
                    "Processador inexistente",
                    0
            );        
            limpa();
        }   
    }
        catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    0
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }
         catch (PlacaVidInvException pvid) {
            JOptionPane.showMessageDialog(
                    null,
                    pvid.getMessage(),
                    "ERRO",
                    0
            );
        } 

        catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
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
        }
       
       
    } 
    
    public void excluir(){
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
        "Tem certeza que deseja remover este processador?",
        "Confirmação de Remoção", 
        JOptionPane.YES_NO_OPTION
    );

    if (confirmacao != JOptionPane.YES_OPTION) {
        return;
    }

    Processador procParaRemover = new Processador();
        try {
            procParaRemover.setMarca(marca);
        } 
        
        catch (ProcInvException pie) {
            JOptionPane.showMessageDialog(
                    null,
                    pie.getMessage(),
                    "ERRO",
                    0
            );
            cxMarca.setText("");
            cxMarca.requestFocus();
            return;
        }
        
        catch (PlacaVidInvException pvie) {
            JOptionPane.showMessageDialog(
                    null,
                    pvie.getMessage(),
                    "ERRO",
                    0
            );
        }
        catch (PlacaMaeInvException pmie) {
            JOptionPane.showMessageDialog(
                    null,
                    pmie.getMessage(),
                    "ERRO",
                    0
            );
        }
        
        try {
            procParaRemover.setModelo(modelo);
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
    
    proc = gerProc.removeProcPorMarcaModelo(procParaRemover);

    if (proc != null) {
        JOptionPane.showMessageDialog(
                null,
                "Processador removido com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );
        limpa();
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Nenhum processador encontrado com a Marca e Modelo informados.",
                "Processador Inexistente",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelProc;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxFreqBase;
    private javax.swing.JTextField cxFreqMax;
    private javax.swing.JTextField cxGarantia;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxNucleo;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxSocket;
    private javax.swing.JTextField cxThreads;
    private javax.swing.JLabel rtAno;
    private javax.swing.JLabel rtFreqBase;
    private javax.swing.JLabel rtFreqMax;
    private javax.swing.JLabel rtGarantia;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtNucleo;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtSocket;
    private javax.swing.JLabel rtThreads;
    // End of variables declaration//GEN-END:variables
}