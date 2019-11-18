/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.CargoController;
import CONTROLLER.CidadeController;
import CONTROLLER.DepartamentoController;
import CONTROLLER.EnderecoController;
import CONTROLLER.FuncionarioController;
import MODEL.Cargo;
import MODEL.Cidade;
import MODEL.Departamento;
import MODEL.Endereco;
import MODEL.Funcionario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC13
 */
public class TelaTabelaFuncionario extends javax.swing.JInternalFrame {

    FuncionarioController controller;
    DefaultTableModel TbFuncionarios;
    DepartamentoController controllerDepartamento;
    CidadeController controllerCidade;
    EnderecoController controllerEndereco;
    CargoController controllerCargo;
    Funcionario fun;
    Endereco end;
    Departamento dep;
    Cidade cid;
    Cargo car;
    ArrayList<Funcionario> funcionarios;
    telaCadFuncionario cadFun;

    /**
     * Creates new form TelaTabelaFuncionario
     */
    public TelaTabelaFuncionario() {
        initComponents();
        controller = new FuncionarioController();
        controllerCidade = new CidadeController();
        controllerEndereco = new EnderecoController();
        controllerCidade = new CidadeController();
        controllerDepartamento = new DepartamentoController();
        controllerCargo = new CargoController();
        TbFuncionarios = (DefaultTableModel) JTFuncionario.getModel();
        dep = new Departamento();
        fun = new Funcionario();
        cid = new Cidade();
        car = new Cargo();
        end = new Endereco();
        this.listarFuncionario();
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
        JTFuncionario = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        JBNovo = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Funcionários");

        jLabel1.setText("Pesquisar");

        JTFPesquisar.setText("Digite o código ou Nome do funcionário");
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

        JTFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "RG", "CPF", "E-mail", "Data Nascimento", "Telefone", "Celular", "Salario", "Data Admissão", "Cargo", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTFuncionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTFuncionario.setColumnSelectionAllowed(true);
        JTFuncionario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                JTFuncionarioCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JTFuncionarioInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JTFuncionario);
        JTFuncionario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JTFuncionario.getAccessibleContext().setAccessibleDescription("");

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
                        .addGap(139, 139, 139)
                        .addComponent(JBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBExcluir)
                        .addGap(139, 139, 139)
                        .addComponent(JBCancelar)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBExcluir)
                    .addComponent(JBAlterar)
                    .addComponent(JBNovo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        telaCadFuncionario cadFun = new telaCadFuncionario();
        cadFun.show();


    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente artualizar os dados da funade", "Mensagem do sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            controller.alterar(this.criarObjeto());
            limparCampo();
            habilitarCampos(3);
            listarFuncionario();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a Funcionário?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            this.criarObjeto();
            end = controllerEndereco.pesquisarEnderecosFuncionario(fun.getIdFuncionario());
            controllerEndereco.deletar(end);
            controller.deletar(fun);
            TbFuncionarios.removeRow(JTFuncionario.getSelectedRow());
            this.listarFuncionario();
        }
        this.habilitarCampos(3);

    }//GEN-LAST:event_JBExcluirActionPerformed
    public Funcionario criarObjeto() {
        fun = controller.pesquisar(Integer.parseInt(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 0).toString()));
        fun.setNome(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 1)));
        fun.setRg(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 2)));
        fun.setCpf(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 3)));
        fun.setEmail(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 4)));
        fun.setDataNasc(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 5)));
        fun.setTelefone(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 6)));
        fun.setCelular(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 7)));
        fun.setSalarioFuncionario(Double.parseDouble(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 8))));
        fun.setDataAdmissaoFuncionario(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 9)));
        fun.setCargo_idCargo(controllerCargo.pesquisar(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 10))).getIdCargo());
        fun.setDepartamento_idDepartamento(controllerDepartamento.pesquisar(String.valueOf(JTFuncionario.getValueAt(JTFuncionario.getSelectedRow(), 11))).getIdDepartmento());
        end.setIdCidadeEndereco(controllerCidade.pesquisar(fun.getIdEndereco()).getCodigo());
        return fun;
    }
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampos(2);
        this.listarFuncionario();
    }//GEN-LAST:event_JBCancelarActionPerformed


    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        this.pesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JTFPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.pesquisar();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JTFPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFPesquisarMouseClicked
        JTFPesquisar.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarMouseClicked

    private void JTFuncionarioCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JTFuncionarioCaretPositionChanged

    }//GEN-LAST:event_JTFuncionarioCaretPositionChanged

    private void JTFuncionarioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JTFuncionarioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFuncionarioInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTable JTFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void listarFuncionario() {
        funcionarios = controller.selecionarFuncionarios();
        this.removerLinha();
        for (Funcionario fun : funcionarios) {
            end = controllerEndereco.pesquisarEnderecosFuncionario(fun.getIdFuncionario());
            cid = controllerCidade.pesquisar(end.getIdCidadeEndereco());
            car = controllerCargo.pesquisar(fun.getCargo_idCargo());
            dep = controllerDepartamento.pesquisar(fun.getDepartamento_idDepartamento());

            TbFuncionarios.addRow(new Object[]{
                fun.getIdFuncionario(),
                fun.getNome(),
                fun.getRg(),
                fun.getCpf(),
                fun.getEmail(),
                fun.getDataNasc(),
                fun.getTelefone(),
                fun.getCelular(),
                fun.getSalarioFuncionario(),
                fun.getDataAdmissaoFuncionario(),
                car.getNomeCargo(),
                dep.getNomeDepartamento()
            });
        }
    }

    private void removerLinha() {
        int linhas = TbFuncionarios.getRowCount();
        for (int i = linhas - 1; i >= 0; i--) {
            TbFuncionarios.removeRow(i);
        }
    }

    public void pesquisar() {
        funcionarios = controller.pesquisarFuncionarios(JTFPesquisar.getText());
        Cidade cid = new Cidade();

        if (funcionarios.isEmpty()) {
            this.limparCampo();
            this.habilitarCampos(3);
            JOptionPane.showMessageDialog(null, "Funcionário não encontrada", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.removerLinha();
            Cargo car = new Cargo();
            CargoController controllerCargo = new CargoController();
            for (Funcionario fun : funcionarios) {
                end = controllerEndereco.pesquisarEnderecosFuncionario(fun.getIdFuncionario());
                cid = controllerCidade.pesquisar(end.getIdCidadeEndereco());
                car = controllerCargo.pesquisar(fun.getCargo_idCargo());
                dep = controllerDepartamento.pesquisar(fun.getDepartamento_idDepartamento());
                TbFuncionarios.addRow(new Object[]{
                    fun.getIdFuncionario(),
                    fun.getNome(),
                    fun.getRg(),
                    fun.getCpf(),
                    fun.getEmail(),
                    fun.getDataNasc(),
                    fun.getTelefone(),
                    fun.getCelular(),
                    fun.getSalarioFuncionario(),
                    fun.getDataAdmissaoFuncionario(),
                    car.getNomeCargo(),
                    dep.getNomeDepartamento()
                });
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
