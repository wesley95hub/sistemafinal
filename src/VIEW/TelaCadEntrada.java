package VIEW;

import CONTROLLER.MarcaController;
import java.text.SimpleDateFormat;
import java.util.Date;
import CONTROLLER.ProdutoController;
import MODEL.Entrada;
import MODEL.Produto;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadEntrada extends javax.swing.JFrame {

    Date data;
    ProdutoController controllerProduto;
    Produto produto;
    Entrada entrada;
    

    public TelaCadEntrada() {
        initComponents();
        pegardata();
        controllerProduto = new ProdutoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JTFData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        JTFValorCompra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFestoqueatual = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JTFMarca = new javax.swing.JTextField();
        JBSalvar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Pesquisar:");

        JTFPesquisar.setText("Digite o código ou nome do Produto");
        JTFPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFPesquisarMouseClicked(evt);
            }
        });
        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });
        JTFPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFPesquisarKeyPressed(evt);
            }
        });

        JBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Pesquisar.png"))); // NOI18N
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"), "Entrada de Produto"));

        jLabel4.setText("Data");

        JTFData.setEnabled(false);

        jLabel7.setText("Quantidade");

        jLabel8.setText("valor Compra");

        JTFQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFQuantidadeFocusGained(evt);
            }
        });
        JTFQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFQuantidadeMouseClicked(evt);
            }
        });
        JTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFQuantidadeKeyPressed(evt);
            }
        });

        JTFValorCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFValorCompraFocusGained(evt);
            }
        });
        JTFValorCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFValorCompraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(JTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFValorCompra)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto")));

        jLabel1.setText("Código");

        jLabel3.setText("Nome");

        jLabel5.setText("marca:");

        jLabel6.setText("Estoque atual:");

        JTFCodigo.setEnabled(false);

        JTFestoqueatual.setEnabled(false);

        JTFNome.setEnabled(false);

        JTFMarca.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFestoqueatual, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFestoqueatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        JBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/gravar.png"))); // NOI18N
        JBSalvar.setText("Salvar");
        JBSalvar.setEnabled(false);
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/cancelar.png"))); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.setEnabled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFPesquisarMouseClicked
        JTFPesquisar.setText("");
    }//GEN-LAST:event_JTFPesquisarMouseClicked

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed

    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JTFPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPesquisarKeyPressed

    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        produto = controllerProduto.pesquisar(JTFPesquisar.getText());
        if (produto.getIdProduto() == 0) {
            JOptionPane.showMessageDialog(null, "Produto não Encontrado");
        } else {
            JTFCodigo.setText(Integer.toString(produto.getIdProduto()));
            JTFNome.setText(produto.getNomeProduto());
            MarcaController controllerMarca = new MarcaController();
            JTFMarca.setText(controllerMarca.pesquisar(produto.getIdMarcaProduto()).getNomeMarca());
            JTFestoqueatual.setText(Double.toString(controllerProduto.pegarEstoqueAtual(produto.getIdProduto())));
            JTFData.setEnabled(true);
            JTFQuantidade.setEnabled(true);
            JTFValorCompra.setEnabled(true);
            habilitarCampus(1);
        }

    }//GEN-LAST:event_JBPesquisarActionPerformed
public Entrada criarObjeto() {
        entrada = new Entrada();
        entrada.setIdFornecedorEntrada(1);
        entrada.setIdProdutoEntrada(produto.getIdProduto());
        entrada.setIdUsuarioEntrada(1);
        entrada.setQuantEntrada(Integer.parseInt(JTFQuantidade.getText()));
        entrada.setValorCompraEntrada(Double.parseDouble(JTFValorCompra.getText()));
        entrada.setDataEntrada(JTFData.getText());
        if (JTFCodigo.getText().equals("")) {

        } else {
            entrada.setIdProdutoEntrada(Integer.parseInt(JTFCodigo.getText()));
        }
        return entrada;
    }
    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controllerProduto.cadastrar(this.criarObjeto());
           this.limparCampus();
           this.habilitarCampus(2);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampus(2);
           this.limparCampus();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFQuantidadeKeyPressed
    
    }//GEN-LAST:event_JTFQuantidadeKeyPressed

    private void JTFValorCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFValorCompraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFValorCompraKeyPressed

    private void JTFQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFQuantidadeMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeMouseClicked

    private void JTFQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFQuantidadeFocusGained
     JTFQuantidade.setText("");   // TODO add your handling code here:
     JTFQuantidade.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeFocusGained

    private void JTFValorCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFValorCompraFocusGained
      JTFValorCompra.setText("");        // TODO add your handling code here:
      JTFValorCompra.setBackground(Color.white);
    }//GEN-LAST:event_JTFValorCompraFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JFormattedTextField JTFData;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFValorCompra;
    private javax.swing.JTextField JTFestoqueatual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void limparCampus() {
       JTFCodigo.setText("");
       JTFMarca.setText("");
       JTFNome.setText("");
       JTFQuantidade.setText("");
       JTFValorCompra.setText("");
       JTFestoqueatual.setText("");
       pegardata();
       JTFPesquisar.setText("Digite o código ou nome do Produto");
       
    }

    private void habilitarCampus(int i) {
        if (i ==1 ){
            JBCancelar.setEnabled(true);
            JBSalvar.setEnabled(true);
            JTFQuantidade.setEnabled(true);
            JTFValorCompra.setEnabled(true);
        }else if(i==2){
            JBCancelar.setEnabled(false);
            JBSalvar.setEnabled(false);
            JTFQuantidade.setEnabled(false);
            JTFValorCompra.setEnabled(false);
        }
        
    }

    private boolean verificarCampus() {
            boolean preechido = true;
        if (JTFQuantidade.getText().isEmpty()){
            JTFQuantidade.setText("O campo Quantidade não pode ficar vazio");
            JTFQuantidade.setBackground(Color.red);
            preechido = false;
        }
        if (JTFValorCompra.getText().isEmpty()) {
            JTFValorCompra.setText("O campo Valor não pode ficar vazio");
            JTFValorCompra.setBackground(Color.red);
            preechido = false;
            
        }
       
        return preechido;
    }

    private void pegardata() {
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        JTFData.setText(formatador.format(data));
    }
}
