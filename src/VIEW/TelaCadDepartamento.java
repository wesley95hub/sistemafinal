/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.DepartamentoController;
import MODEL.Departamento;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class TelaCadDepartamento extends javax.swing.JFrame {

    DepartamentoController controller;
    Departamento departamento;

    public TelaCadDepartamento() {
        initComponents();
        controller = new DepartamentoController();
    }

    public Departamento criarObjeto() {
        departamento = new Departamento();
        departamento.setNomeDepartamento(JTFDepartamento.getText());
        if (JTFCodigo.getText().equals("")) {
        }else{
            departamento.setIdDepartmento(Integer.parseInt(JTFCodigo.getText()));
        }
        return departamento;
    }

    public void habilitarCampus(int btn) {
        switch (btn) {
            case 1://Pesquisar
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(false);
                JTFCodigo.setEnabled(true);
                JTFDepartamento.setEnabled(true);
                break;
            case 2://novo
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(true);
                JTFCodigo.setEnabled(true);
                JTFDepartamento.setEnabled(true);
                JBPesquisar.setEnabled(false);
                JTFPesquisar.setEnabled(false);
                break;
            case 3: //salvar, excluir, alterar
                JBPesquisar.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JTFCodigo.setEnabled(false);
                JTFDepartamento.setEnabled(false);
                JBNovo.setEnabled(true);
                JBSalvar.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                break;
            default:
                break;

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFDepartamento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        JBNovo = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Departamento");

        jLabel2.setText("Pesquisar:");

        JTFPesquisar.setText("Digite o código ou nome do Departamento");
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

        jLabel1.setText("Código:");

        jLabel4.setText("Cargo");

        JTFCodigo.setEnabled(false);
        JTFCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFCodigoMouseClicked(evt);
            }
        });
        JTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFCodigoKeyPressed(evt);
            }
        });

        JTFDepartamento.setEnabled(false);
        JTFDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFDepartamentoMouseClicked(evt);
            }
        });
        JTFDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDepartamentoActionPerformed(evt);
            }
        });
        JTFDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFDepartamentoKeyPressed(evt);
            }
        });

        JBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/novo.png"))); // NOI18N
        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        JBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/gravar.png"))); // NOI18N
        JBSalvar.setText("Salvar");
        JBSalvar.setEnabled(false);
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/alterar.png"))); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.setEnabled(false);
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/excluir.png"))); // NOI18N
        JBExcluir.setText("Excluir");
        JBExcluir.setEnabled(false);
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
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
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPesquisar)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JTFDepartamento)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBNovo)
                        .addGap(18, 18, 18)
                        .addComponent(JBSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(JBAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(JBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(JBCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovo)
                    .addComponent(JBSalvar)
                    .addComponent(JBCancelar)
                    .addComponent(JBAlterar)
                    .addComponent(JBExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFPesquisarMouseClicked
        JTFPesquisar.setText("");
    }//GEN-LAST:event_JTFPesquisarMouseClicked

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JTFPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.pesquisar();
        }
    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        pesquisar();

    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JTFCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFCodigoMouseClicked
        JTFCodigo.setBackground(Color.white);
        JTFCodigo.setText("");
    }//GEN-LAST:event_JTFCodigoMouseClicked

    private void JTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCodigoKeyPressed

    }//GEN-LAST:event_JTFCodigoKeyPressed

    private void JTFDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFDepartamentoMouseClicked
        JTFDepartamento.setBackground(Color.white);
        JTFDepartamento.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_JTFDepartamentoMouseClicked

    private void JTFDepartamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDepartamentoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDepartamentoKeyPressed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        habilitarCampus(2);
        limparCampus();
         JTFCodigo.setText(Integer.toString(controller.pegarIdDepartamento()+1));
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controller.cadastrar(this.criarObjeto());
            this.limparCampus();
            this.habilitarCampus(3);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar os dados do Departamento?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
        if (opcao == 0) {
            if (verificarCampus()) {
                controller.alterar(this.criarObjeto());
                limparCampus();
                habilitarCampus(3);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Departamento?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            controller.deletar(this.criarObjeto());
            this.habilitarCampus(3);
            this.limparCampus();
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampus(3);
        this.limparCampus();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDepartamento;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

     private void limparCampus() {
       JTFCodigo.setText("");
       JTFDepartamento.setText("");      
       JTFPesquisar.setText("Digite o código ou nome do Departamento");
    }
 private void pesquisar() {
        departamento = controller.pesquisar(JTFPesquisar.getText());
        if (departamento.getIdDepartmento()== 0) {
            this.habilitarCampus(3);
            JOptionPane.showMessageDialog(null, "Departamento não encontrada","Mensagem do Sistema",JOptionPane.INFORMATION_MESSAGE);         
        } else {
            JTFCodigo.setText(Integer.toString(departamento.getIdDepartmento()));
            JTFDepartamento.setText(departamento.getNomeDepartamento());
            habilitarCampus(1);
        }
    }
  
    public boolean verificarCampus(){
        boolean preechido = true;
        if (JTFDepartamento.getText().isEmpty()){
            JTFDepartamento.setText("O campo Departamento não pode ficar vazio");
            JTFDepartamento.setBackground(Color.red);
            preechido = false;
        }
        return preechido;
    }
}