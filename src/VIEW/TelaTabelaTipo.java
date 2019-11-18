/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.TipoController;
import MODEL.Tipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC13
 */
public class TelaTabelaTipo extends javax.swing.JInternalFrame {

    TipoController controller;
    Tipo tipo;
    DefaultTableModel TbTipos;
    //TelaCadTipo cadCid;
    ArrayList<Tipo> tipos;

    /**
     * Creates new form TelaTabelaTipo
     */
    public TelaTabelaTipo() {
        initComponents();
        controller = new TipoController();
        TbTipos = (DefaultTableModel) JTTipo.getModel();
        this.listarTipo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTipo = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        JBNovo = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Tipo");
        setToolTipText("");

        jLabel1.setText("Pesquisar");

        JTFPesquisar.setText("Digite o código ou Nome do Tipo");
        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });

        JBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Pesquisar.png"))); // NOI18N
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JTTipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTTipo);

        JBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/novo.png"))); // NOI18N
        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
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
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(JBAlterar)
                        .addGap(28, 28, 28)
                        .addComponent(JBExcluir)
                        .addGap(28, 28, 28)
                        .addComponent(JBCancelar)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovo)
                    .addComponent(JBCancelar)
                    .addComponent(JBExcluir)
                    .addComponent(JBAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
   // telaCadTipo cadCid = new telaCadTipo();
    //cadCid.show();
  

    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
            int opcao = JOptionPane.showConfirmDialog(null,"Deseja realmente artualizar os dados da tipo","Mensagem do sistema",JOptionPane.INFORMATION_MESSAGE);
            if (opcao == 0) {
                controller.alterar(this.criarObjeto());
                limparCampo();
                habilitarCampos(3);
            }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a Tipo?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            controller.deletar(this.criarObjeto());
            TbTipos.removeRow(JTTipo.getSelectedRow());
            this.limparCampo();
        }


    }//GEN-LAST:event_JBExcluirActionPerformed
    public Tipo criarObjeto() {
        tipo = new Tipo();

        tipo.setNomeTipo(String.valueOf(JTTipo.getValueAt(JTTipo.getSelectedRow(), 1)));
        tipo.setIdTipo(Integer.parseInt(JTTipo.getValueAt(JTTipo.getSelectedRow(), 0).toString()));
        return tipo;
    }
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampos(2);
        this.listarTipo();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
    this.pesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTable JTTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void listarTipo() {
        tipos = controller.selecionarTipos();
        this.removerLinha();
        for (Tipo tipo : tipos) {
            TbTipos.addRow(new Object[]{tipo.getIdTipo(), tipo.getNomeTipo()});
        }
    }

    private void removerLinha() {
        int linhas = TbTipos.getRowCount();
        for (int i = linhas - 1; i >= 0; i--) {
            TbTipos.removeRow(i);
        }
    }

    public void pesquisar() {
        tipos = controller.pesquisarTipos(JTFPesquisar.getText());
        if (tipos.isEmpty()) {
            this.limparCampo();
            this.habilitarCampos(3);
            JOptionPane.showMessageDialog(null, "Tipo não encontrada", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.removerLinha();
            for (Tipo tipo : tipos) {
                TbTipos.addRow(new Object[]{tipo.getIdTipo(), tipo.getNomeTipo()});
            }
            this.habilitarCampos(1);
        }
    }

    private void limparCampo() {
        JTFPesquisar.setText("");
    }

    private void habilitarCampos(int i) {
        switch (i) {
            case 1://Pesquisar
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);
                JBCancelar.setEnabled(true);
                break;
            case 2://novo
                JBNovo.setEnabled(true);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                JBPesquisar.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                break;
            case 3: //salvar, excluir, alterar
                JBPesquisar.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JBNovo.setEnabled(true);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                break;
            default:
                break;

        }
    }
}
