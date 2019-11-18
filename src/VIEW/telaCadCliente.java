/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.CidadeController;
import CONTROLLER.ClienteController;
import CONTROLLER.EnderecoController;
import MODEL.Cidade;
import MODEL.Cliente;
import MODEL.Endereco;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC13
 */
public class telaCadCliente extends javax.swing.JFrame {

    ClienteController controller;
    Cliente cli;
    ArrayList<Cliente> cliente;
    EnderecoController controllerEnd;
    CidadeController controllerCid;
    Cidade cid;
    ArrayList<Cidade> cidades;
    int idEndereco=0;
    public telaCadCliente() {
        initComponents();
        controllerCid = new CidadeController();
        controller = new ClienteController();
        controllerEnd = new EnderecoController();
         cli = new Cliente();
       
    }

    public Cliente criarObjeto() {
        cli.setNome(JTFNome.getText());
        cli.setEmail(JTFEmail.getText());
        cli.setRg(JTFRG.getText());
        cli.setCpf(JTFCPF.getText());
        cli.setTelefone(JTFTelefone.getText());
        cli.setCelular(JTFCelular.getText());
        cli.setDataNasc(JTFDataNascimento.getText());
        
        cli.setSexo(JCBSexo.getSelectedItem().toString());
        cli.setObsCliente(JTFObs.getText());
        if (JTFCodigo.getText().equals("")) {
        } else {

            cli.setCodigo(Integer.parseInt(JTFCodigo.getText()));
        }
        return cli;
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
                JTFNome.setEnabled(true);
                JTFRG.setEnabled(true);
                JTFCPF.setEnabled(true);
                JTFEmail.setEnabled(true);
                JCBSexo.setEnabled(true);
                JTFDataNascimento.setEnabled(true);
                JTFTelefone.setEnabled(true);
                JTFCelular.setEnabled(true);
                JCBestado.setEnabled(true);

                JTFRua.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFReferencia.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFCEP.setEnabled(true);
                JCBestado.setEnabled(true);
                JTFObs.setEnabled(true);
                JCBCidade.setEnabled(true);


                break;
            case 2://novo

                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(true);

                JTFCodigo.setEnabled(true);
                JTFNome.setEnabled(true);
                JTFRG.setEnabled(true);
                JTFCPF.setEnabled(true);
                JTFEmail.setEnabled(true);
                JCBSexo.setEnabled(true);
                JTFDataNascimento.setEnabled(true);
                JTFTelefone.setEnabled(true);
                JTFCelular.setEnabled(true);
                JCBestado.setEnabled(true);

                JTFRua.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFReferencia.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFCEP.setEnabled(true);
                JCBestado.setEnabled(true);
                JTFObs.setEnabled(true);
                JCBCidade.setEnabled(true);

                break;
            case 3: //salvar, excluir, alterar
                JBNovo.setEnabled(true);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                JBSalvar.setEnabled(false);
                JTFCodigo.setEnabled(false);
                JTFNome.setEnabled(false);
                JTFRG.setEnabled(false);
                JTFCPF.setEnabled(false);
                JTFEmail.setEnabled(false);
                JCBSexo.setEnabled(false);
                JTFDataNascimento.setEnabled(false);
                JTFTelefone.setEnabled(false);
                JTFCelular.setEnabled(false);
                JCBestado.setEnabled(false);
                JTFReferencia.setEnabled(false);
                JTFRua.setEnabled(false);
                JTFBairro.setEnabled(false);
                JTFComplemento.setEnabled(false);
                JTFNumero.setEnabled(false);
                JTFCEP.setEnabled(false);
                JCBestado.setEnabled(false);
                JTFObs.setEnabled(false);
                JCBCidade.setEnabled(false);
                break;
            default:
                break;

        }
    }

    public boolean verificarCampus() {
        boolean preechido = true;
        if (JTFNome.getText().isEmpty()) {
            JTFNome.setText("O campo Nome não pode ficar vazio");
            JTFNome.setBackground(Color.red);
            preechido = false;
        }
        if (JTFRG.getText().isEmpty()) {
            JTFRG.setText("O campo RG não pode ficar vazio");
            JTFRG.setBackground(Color.red);
            preechido = false;
        }
        if (JTFCPF.getText().isEmpty()) {
            JTFCPF.setText("O campo CPF não pode ficar vazio");
            JTFCPF.setBackground(Color.red);
            preechido = false;

        }
        return preechido;
    }

    private void limparCampus() {
        JTFCodigo.setText("");
        JTFNome.setText("");
        JTFEmail.setText("");
        JTFRG.setText("");
        JTFCPF.setText("");
        JTFTelefone.setText("");
        JTFCelular.setText("");
        JTFDataNascimento.setText("");
        JCBSexo.setSelectedItem("");
        JTFRua.setText("");
        JTFNumero.setText("");
        JTFBairro.setText("");
        JTFCEP.setText("");
        JTFReferencia.setText("");
        JCBestado.setSelectedItem(0);
        JTFComplemento.setText("");
        JCBCidade.setSelectedItem(0);
        JTFComplemento.setText("");
        JTFCodigo.setText("");
        JTFObs.setText("");
        JTFPesquisar.setText("Digite o código ou nome do Cliente");
    }

    private void pesquisar() {
        cli = controller.pesquisar(JTFPesquisar.getText());
        if (cli.getCodigo() == 0) {
            this.habilitarCampus(3);
            JOptionPane.showMessageDialog(null, "Cliente não encontrada", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Endereco end =new Endereco();
            end = controllerEnd.pesquisarEnderecosCliente(cli.getCodigo());
            JTFCodigo.setText(Integer.toString(cli.getCodigo()));
            JTFNome.setText(cli.getNome());
            JTFEmail.setText(cli.getEmail());
            JTFRG.setText(cli.getRg());
            JTFCPF.setText(cli.getCpf());
            JTFReferencia.setText(end.getReferenciaEndereco());
            idEndereco = end.getIdEndereco();
            JTFTelefone.setText(cli.getTelefone());
            JTFCelular.setText(cli.getCelular());
            JTFDataNascimento.setText(cli.getDataNasc());
            JCBSexo.setSelectedItem(cli.getSexo());
            JTFRua.setText(end.getRuaEndereco());
            JTFNumero.setText(Integer.toString(end.getNumEndereco()));
            JTFBairro.setText(end.getBairroEndereco());
            JTFCEP.setText(end.getCepEndereco());
            JCBestado.setSelectedItem(controllerCid.pesquisar(end.getIdCidadeEndereco()).getUf());
            JTFComplemento.setText(end.getComplementoEndereco());
            JCBCidade.setSelectedItem(controllerCid.pesquisar(end.getIdCidadeEndereco()).getNome());         
            JTFObs.setText(cli.getObsCliente());
            habilitarCampus(1);
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

        jLabel10 = new javax.swing.JLabel();
        JTFCelular = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTFRua = new javax.swing.JTextField();
        JTFNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTFCEP = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        JCBestado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        JCBCidade = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JBNovo = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFObs = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        JCBSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        JTFBairro = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFComplemento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFDataNascimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JFormattedTextField();
        JTFPesquisar = new javax.swing.JTextField();
        JTFRG = new javax.swing.JTextField();
        JTFReferencia = new javax.swing.JTextField();
        Referencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Celular:");

        try {
            JTFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCelular.setEnabled(false);

        jLabel11.setText("Rua:");

        jLabel12.setText(" Nº:");
        jLabel12.setMaximumSize(new java.awt.Dimension(23, 14));

        JTFRua.setEnabled(false);

        JTFNumero.setEnabled(false);
        JTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroActionPerformed(evt);
            }
        });

        jLabel13.setText("Cep:");

        try {
            JTFCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCEP.setEnabled(false);

        jLabel14.setText("UF:");

        JCBestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        JCBestado.setEnabled(false);
        JCBestado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBestadoItemStateChanged(evt);
            }
        });

        jLabel15.setText("Cidade:");

        JCBCidade.setEnabled(false);
        JCBCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBCidadeItemStateChanged(evt);
            }
        });

        jLabel16.setText("Observação:");

        jLabel17.setText("Dados Cliente:");

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

        JTFObs.setColumns(20);
        JTFObs.setRows(5);
        JTFObs.setEnabled(false);
        jScrollPane1.setViewportView(JTFObs);

        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));
        JCBSexo.setEnabled(false);
        JCBSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBSexoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        jLabel2.setText("Código:");
        jLabel2.setMaximumSize(new java.awt.Dimension(23, 14));

        jLabel18.setText("Bairro:");
        jLabel18.setMaximumSize(new java.awt.Dimension(23, 14));

        JTFBairro.setEnabled(false);

        JBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Pesquisar.png"))); // NOI18N
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        jLabel19.setText("Complemento:");

        jLabel3.setText("Nome:");
        jLabel3.setMaximumSize(new java.awt.Dimension(23, 14));

        JTFComplemento.setEnabled(false);
        JTFComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFComplementoActionPerformed(evt);
            }
        });

        jLabel4.setText("RG:");
        jLabel4.setMaximumSize(new java.awt.Dimension(23, 14));

        jLabel5.setText("Email:");
        jLabel5.setMaximumSize(new java.awt.Dimension(23, 14));

        try {
            JTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCPF.setEnabled(false);

        jLabel6.setText("CPF:");

        JTFNome.setEnabled(false);

        JTFCodigo.setEnabled(false);
        JTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo:");
        jLabel7.setMaximumSize(new java.awt.Dimension(23, 14));

        JTFEmail.setEnabled(false);

        jLabel8.setText("Data Nascimento:");

        try {
            JTFDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFDataNascimento.setEnabled(false);
        JTFDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataNascimentoActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefone:");
        jLabel9.setMaximumSize(new java.awt.Dimension(23, 14));

        try {
            JTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFTelefone.setEnabled(false);
        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });

        JTFRG.setEnabled(false);

        JTFReferencia.setEnabled(false);

        Referencia.setText("Referência");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JBNovo)
                        .addGap(18, 18, 18)
                        .addComponent(JBSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(JBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFNome)
                                    .addComponent(JTFEmail)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFRua)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel8)))
                                            .addComponent(JTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFTelefone)
                                            .addComponent(JTFDataNascimento)))
                                    .addComponent(JTFBairro)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JCBestado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Referencia))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel19))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(JTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTFComplemento)
                                            .addComponent(JTFReferencia)
                                            .addComponent(JCBCidade, 0, 206, Short.MAX_VALUE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JBPesquisar)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(JTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Referencia)
                    .addComponent(JTFReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovo)
                    .addComponent(JBSalvar)
                    .addComponent(JBAlterar)
                    .addComponent(JBExcluir)
                    .addComponent(JBCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JCBestadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBestadoItemStateChanged
        cidades = controllerCid.selcionarCidadesUF((String) JCBestado.getSelectedItem());
        JCBCidade.removeAllItems();
        for (Cidade cid : cidades) {
            JCBCidade.addItem(cid.getNome());
        }
    }//GEN-LAST:event_JCBestadoItemStateChanged
  private Endereco CriarObjetoEndereco(){
      Endereco enderecoCliente = new Endereco();
      if (idEndereco  != 0){
      enderecoCliente.setIdEndereco(idEndereco);
      }
      enderecoCliente.setRuaEndereco(JTFRua.getText());
      enderecoCliente.setCepEndereco(JTFCEP.getText());
      enderecoCliente.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
      enderecoCliente.setBairroEndereco(JTFBairro.getText());
      enderecoCliente.setReferenciaEndereco(JTFReferencia.getText());
      enderecoCliente.setComplementoEndereco(JTFComplemento.getText());
      enderecoCliente.setIdCidadeEndereco(controllerCid.pesquisar(JCBCidade.getSelectedItem().toString(),JCBestado.getSelectedItem().toString()).getCodigo());
      enderecoCliente.setIdClienteEndereco(Integer.parseInt(JTFCodigo.getText()));
      return enderecoCliente;
      
  }
    private void JCBCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBCidadeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCidadeItemStateChanged

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
       
        habilitarCampus(2);
        limparCampus();
         JTFCodigo.setText(Integer.toString(controller.pegarIdCliente()+1));

    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controller.cadastrar(this.criarObjeto());
            controllerEnd.cadastrar(this.CriarObjetoEndereco());
            this.limparCampus();
            this.habilitarCampus(3);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar os dados do Cliente?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
        if (opcao == 0) {
            if (verificarCampus()) {
                controller.alterar(this.criarObjeto());
                controllerEnd.alterar(this.CriarObjetoEndereco());
                limparCampus();
                habilitarCampus(3);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Cliente?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            controller.deletar(this.criarObjeto());
            controllerEnd.deletar(this.CriarObjetoEndereco());
            this.habilitarCampus(3);
            this.limparCampus();
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampus(3);
        this.limparCampus();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JCBSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBSexoActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        pesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JTFDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataNascimentoActionPerformed

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroActionPerformed

    private void JTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCodigoActionPerformed

    private void JTFComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFComplementoActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new telaCadCliente().setVisible(true);
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
    private javax.swing.JComboBox<String> JCBCidade;
    private javax.swing.JComboBox<String> JCBSexo;
    private javax.swing.JComboBox<String> JCBestado;
    private javax.swing.JTextField JTFBairro;
    private javax.swing.JFormattedTextField JTFCEP;
    private javax.swing.JFormattedTextField JTFCPF;
    private javax.swing.JFormattedTextField JTFCelular;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFComplemento;
    private javax.swing.JFormattedTextField JTFDataNascimento;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JTextArea JTFObs;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFRG;
    private javax.swing.JTextField JTFReferencia;
    private javax.swing.JTextField JTFRua;
    private javax.swing.JFormattedTextField JTFTelefone;
    private javax.swing.JLabel Referencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
