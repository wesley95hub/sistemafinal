package VIEW;

import CONTROLLER.CidadeController;
import CONTROLLER.EnderecoController;
import CONTROLLER.FornecedorController;
import MODEL.Cidade;
import MODEL.Endereco;
import MODEL.Fornecedor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC13
 */
public class TelaCadFornecedor extends javax.swing.JInternalFrame {

    FornecedorController controller;
    Fornecedor forn;
    Endereco end;
    EnderecoController controllerEndereco;
    Cidade cid;
    CidadeController controllerCidade;
    ArrayList<Cidade> cidades;
    int  idEndereco= 0;

    public TelaCadFornecedor() {
        initComponents();
        forn = new Fornecedor();
        controller = new FornecedorController();
        end = new Endereco();
        controllerEndereco = new EnderecoController();
        cid = new Cidade();
        controllerCidade = new CidadeController();
        cidades = new ArrayList();
        cidades = controllerCidade.selecionarCidades();
        for (Cidade cidade : cidades) {
            JCBCidade.addItem(cidade.getNome());
        }
    }

    public Fornecedor criarObjeto() {

        controllerCidade = new CidadeController();
        forn.setNome(JTFNomeF.getText());
        forn.setRazaoSocialFornecedor(JTFRazao.getText());
        forn.setTipoFornecedor(JTFTipo.getText());
        forn.setIeFornecedor(JTFIe.getText());
        forn.setContatoFornecedor(JTFContato.getText());
        forn.setCnpjFornecedor(JTFCNPJ.getText());
        forn.setCpf(JTFCPF.getText());
        forn.setTelefone(JFTTelefone.getText());
        forn.setTelefone(JTFEmail.getText());
        forn.setCelular(JTFCelular.getText());
        forn.setRuaEndereco(JTFRua.getText());
        forn.setReferenciaEndereco(JTFReferencia.getText());
        if (JTFNumero.getText().equals("")) {
            forn.setNumEndereco(0);
        } else {
            forn.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
        }
        forn.setBairroEndereco(JTFBairro.getText());
        forn.setCepEndereco(JTFCEP.getText());
        forn.setReferenciaEndereco(JTFReferencia.getText());
        forn.setComplementoEndereco(JTFComplemento.getText());
        forn.setIdCidadeEndereco((controllerCidade.pesquisar(JCBCidade.getSelectedItem().toString())).getCodigo());
        if (JTFCodigo.getText().equals("")) {
        } else {
            forn.setIdFornecedor(Integer.parseInt(JTFCodigo.getText()));
        }
        return forn;
    }

    public Endereco criarObjetoEndereco() {
          Endereco end = new Endereco();
      if (idEndereco  != 0){
      end.setIdEndereco(idEndereco);
      }
      end.setRuaEndereco(JTFRua.getText());
      end.setCepEndereco(JTFCEP.getText());
      end.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
      end.setBairroEndereco(JTFBairro.getText());
      end.setReferenciaEndereco(JTFReferencia.getText());
      end.setComplementoEndereco(JTFComplemento.getText());
      end.setIdCidadeEndereco(controllerCidade.pesquisar(JCBCidade.getSelectedItem().toString(),JCBEstado.getSelectedItem().toString()).getCodigo());
      end.setIdFornecedorEndereco(Integer.parseInt(JTFCodigo.getText()));
      return end;
    }

    public void habilitarCampus(int btn) {
        switch (btn) {
            case 1://Pesquisar
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(false);
                JTFCNPJ.setEnabled(true);
                JTFCodigo.setEnabled(false);
                JTFContato.setEnabled(true);
                JTFEmail.setEnabled(true);
                JTFIe.setEnabled(true);
                JTFNomeF.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JTFRazao.setEnabled(true);
                JTFTipo.setEnabled(true);
                JTFCPF.setEnabled(true);
                JFTTelefone.setEnabled(true);
                JTFCelular.setEnabled(true);
                JTFRua.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFCEP.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JCBEstado.setEnabled(true);
                JCBCidade.setEnabled(true);
                JTFReferencia.setEnabled(true);
                break;
            case 2://novo
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(true);
                JBPesquisar.setEnabled(false);
                JTFPesquisar.setEnabled(false);
                JTFCNPJ.setEnabled(true);
                JTFCodigo.setEnabled(false);
                JTFContato.setEnabled(true);
                JTFEmail.setEnabled(true);
                JTFIe.setEnabled(true);
                JTFCelular.setEnabled(true);
                JTFPesquisar.setEnabled(false);
                JTFNomeF.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JTFRazao.setEnabled(true);
                JTFTipo.setEnabled(true);
                JTFCPF.setEnabled(true);
                JFTTelefone.setEnabled(true);
                JTFRua.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFCEP.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JCBEstado.setEnabled(true);
                JCBCidade.setEnabled(true);
                JTFReferencia.setEnabled(true);
                break;
            case 3: //salvar, excluir, alterar
                JBPesquisar.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JBNovo.setEnabled(true);
                JBSalvar.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                JTFCNPJ.setEnabled(false);
                JTFCodigo.setEnabled(false);
                JTFContato.setEnabled(false);
                JTFEmail.setEnabled(false);
                JTFCelular.setEnabled(false);
                JTFIe.setEnabled(false);
                JTFNomeF.setEnabled(false);
                JTFPesquisar.setEnabled(true);
                JTFRazao.setEnabled(false);
                JTFTipo.setEnabled(false);
                JTFCPF.setEnabled(false);
                JFTTelefone.setEnabled(false);
                JTFRua.setEnabled(false);
                JTFBairro.setEnabled(false);
                JTFNumero.setEnabled(false);
                JTFCEP.setEnabled(false);
                JTFComplemento.setEnabled(false);
                JCBEstado.setEnabled(false);
                JCBCidade.setEnabled(false);
                JTFReferencia.setEnabled(false);
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel2 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        JBNovo = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFNomeF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFCNPJ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFRazao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFCPF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        JTFContato = new javax.swing.JTextField();
        JFTTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFIe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTFTipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTFCelular = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        JTFRua = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JTFNumero = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        JTFBairro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JTFCEP = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        JCBEstado = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        JTFComplemento = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        JCBCidade = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTFReferencia = new javax.swing.JTextArea();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBorder(null);
        setClosable(true);
        setIconifiable(true);

        jLabel2.setText("Pesquisar:");

        JTFPesquisar.setText("Digite o código ou nome do fornecedor");
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

        jLabel5.setText("Código:");

        JTFCodigo.setEnabled(false);

        jLabel1.setText("Nome Fantasia:");

        JTFNomeF.setEnabled(false);
        JTFNomeF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFNomeFMouseClicked(evt);
            }
        });
        JTFNomeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeFActionPerformed(evt);
            }
        });

        jLabel4.setText("CNPJ:");

        JTFCNPJ.setEnabled(false);
        JTFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCNPJActionPerformed(evt);
            }
        });

        jLabel3.setText("Razão Social:");

        JTFRazao.setEnabled(false);
        JTFRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFRazaoActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        try {
            JTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCPF.setEnabled(false);

        jLabel7.setText("E-mail:");

        JTFEmail.setEnabled(false);
        JTFEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFEmailMouseClicked(evt);
            }
        });
        JTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEmailActionPerformed(evt);
            }
        });

        JTFContato.setEnabled(false);

        try {
            JFTTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JFTTelefone.setEnabled(false);
        JFTTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFTTelefoneActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone:");

        jLabel9.setText("Contato:");

        JTFIe.setEnabled(false);
        JTFIe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIeActionPerformed(evt);
            }
        });

        jLabel11.setText("Inscrição Estadual:");

        JTFTipo.setEnabled(false);
        JTFTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFTipoMouseClicked(evt);
            }
        });

        jLabel10.setText("Tipo:");

        jLabel12.setText("Celular");

        try {
            JTFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCelular.setEnabled(false);
        JTFCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(57, 57, 57))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29)))
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10))
                            .addGap(48, 48, 48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JTFIe, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(80, 80, 80)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel6))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(JFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTFCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JTFCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(JTFContato)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTFIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Fornecedor", jPanel1);

        jLabel20.setText("Rua:");

        JTFRua.setEnabled(false);
        JTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFRuaActionPerformed(evt);
            }
        });

        jLabel21.setText("N°:");

        JTFNumero.setEnabled(false);

        jLabel22.setText("Bairro:");

        JTFBairro.setEnabled(false);

        jLabel23.setText("CEP:");

        JTFCEP.setEnabled(false);

        jLabel24.setText("UF:");

        JCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        JCBEstado.setEnabled(false);
        JCBEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBEstadoItemStateChanged(evt);
            }
        });
        JCBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEstadoActionPerformed(evt);
            }
        });

        jLabel39.setText("Complemento");

        JTFComplemento.setEnabled(false);

        jLabel25.setText("Cidade:");

        JCBCidade.setEnabled(false);
        JCBCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCidadeActionPerformed(evt);
            }
        });

        jLabel26.setText("Referência:");

        JTFReferencia.setColumns(20);
        JTFReferencia.setRows(5);
        JTFReferencia.setEnabled(false);
        jScrollPane2.setViewportView(JTFReferencia);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCBCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(JTFNumero))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFBairro)))
                            .addComponent(JTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(JTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(JTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(JTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(JTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(JCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(JBNovo)
                        .addGap(26, 26, 26)
                        .addComponent(JBSalvar)
                        .addGap(26, 26, 26)
                        .addComponent(JBAlterar)
                        .addGap(30, 30, 30)
                        .addComponent(JBExcluir)
                        .addGap(26, 26, 26)
                        .addComponent(JBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBExcluir)
                    .addComponent(JBAlterar)
                    .addComponent(JBSalvar)
                    .addComponent(JBNovo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Endereço");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed

    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        this.pesquisar();
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controller.cadastrar(this.criarObjeto());
            controllerEndereco.cadastrar(this.criarObjetoEndereco());
            this.limparCampus();
            this.habilitarCampus(3);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar os dados do Fornecedor", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            if (verificarCampus()) {
                controller.alterar(this.criarObjeto());
                controllerEndereco.alterar(this.criarObjetoEndereco());
                limparCampus();
                habilitarCampus(3);
            }
        }

    }//GEN-LAST:event_JBAlterarActionPerformed

    private void pesquisar() {
        forn = controller.pesquisar(JTFPesquisar.getText());

        if (forn.getIdFornecedor() == 0) {
            this.habilitarCampus(3);
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JTFCodigo.setText(Integer.toString(forn.getIdFornecedor()));
            end = controllerEndereco.pesquisarEnderecosFornecedor(forn.getIdFornecedor());
            JTFNomeF.setText(forn.getNome());
            JTFEmail.setText(forn.getEmail());
            JTFRazao.setText(forn.getRazaoSocialFornecedor());
            JTFCNPJ.setText(forn.getCnpjFornecedor());
            JTFCPF.setText(forn.getCpf());
            JFTTelefone.setText(forn.getTelefone());
            JTFContato.setText(forn.getContatoFornecedor());
            JTFTipo.setText(forn.getTipoFornecedor());
            JTFIe.setText(forn.getIeFornecedor());
            JTFCelular.setText(forn.getCelular());
            JTFRua.setText(end.getRuaEndereco());
            JTFNumero.setText(String.valueOf(end.getNumEndereco()));
            forn.setIdEndereco(end.getIdEndereco());
             idEndereco = end.getIdEndereco();
            forn.setRuaEndereco(end.getRuaEndereco());
            forn.setNumEndereco(end.getNumEndereco());
            forn.setIdEndereco(end.getIdEndereco());
            JTFBairro.setText(end.getBairroEndereco());
            JTFCEP.setText(end.getCepEndereco());
            JTFComplemento.setText(end.getComplementoEndereco());
            JTFReferencia.setText(end.getReferenciaEndereco());
            JCBEstado.setSelectedItem((controllerCidade.pesquisar(end.getIdCidadeEndereco())).getUf());
            JCBCidade.setSelectedItem((controllerCidade.pesquisar(end.getIdCidadeEndereco())).getNome());
            forn.setIdEndereco(end.getIdEndereco());
            this.habilitarCampus(1);
        }

    }

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse Fornecedor?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            controllerEndereco.deletar(this.criarObjetoEndereco());
            controller.deletar(this.criarObjeto());
            this.habilitarCampus(3);
            this.limparCampus();
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampus(3);
        this.limparCampus();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        this.habilitarCampus(2);
        this.limparCampus();

        JTFCodigo.setText(Integer.toString(controller.pegarIdFornecedor() + 1));
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFRuaActionPerformed

    private void JCBEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBEstadoItemStateChanged
        cidades = controllerCidade.selcionarCidadesUF((String) JCBEstado.getSelectedItem());
        JCBCidade.removeAllItems();
        for (Cidade cid : cidades) {
            JCBCidade.addItem(cid.getNome());
        }
    }//GEN-LAST:event_JCBEstadoItemStateChanged

    private void JCBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEstadoActionPerformed

    private void JCBCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCidadeActionPerformed

    private void JTFPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.pesquisar();
        }
    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JTFPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFPesquisarMouseClicked
        JTFPesquisar.setText("");
    }//GEN-LAST:event_JTFPesquisarMouseClicked

    private void JTFTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFTipoMouseClicked
        JTFTipo.setBackground(Color.white);
        JTFTipo.setText("");
    }//GEN-LAST:event_JTFTipoMouseClicked

    private void JTFIeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIeActionPerformed

    private void JFTTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFTTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFTTelefoneActionPerformed

    private void JTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEmailActionPerformed

    private void JTFEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFEmailMouseClicked
        JTFEmail.setBackground(Color.white);
        JTFEmail.setText("");
    }//GEN-LAST:event_JTFEmailMouseClicked

    private void JTFRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFRazaoActionPerformed

    private void JTFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCNPJActionPerformed

    private void JTFNomeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeFActionPerformed

    private void JTFNomeFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFNomeFMouseClicked
        JTFNomeF.setBackground(Color.white);
        JTFNomeF.setText("");
    }//GEN-LAST:event_JTFNomeFMouseClicked

    private void JTFCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCelularActionPerformed

    private void limparCampus() {
        JTFCNPJ.setText("");
        JTFCodigo.setText("");
        JTFContato.setText("");
        JTFPesquisar.setText("Digite o código ou nome do Fornecedor");
        JTFEmail.setText("");
        JTFIe.setText("");
        JTFNomeF.setText("");
        JTFRazao.setText("");
        JTFTipo.setText("");
        JTFRua.setText("");
        JTFNumero.setText("");
        JTFBairro.setText("");
        JTFCEP.setText("");
        JCBEstado.setSelectedItem(0);
        JTFComplemento.setText("");
        JCBCidade.setSelectedItem(0);
        JTFReferencia.setText("");
        JTFCPF.setText("");
        JFTTelefone.setText("");
    }

    public boolean verificarCampus() {
        boolean preechido = true;
        if (JTFNomeF.getText().isEmpty()) {
            JTFNomeF.setText("O campo Nome Fantasia não pode ficar vazio");
            JTFNomeF.setBackground(Color.red);
            preechido = false;
        }
        if (JTFCNPJ.getText().isEmpty()) {
            JTFCNPJ.setText("O campo CNPJ não pode ficar vazio");
            JTFCNPJ.setBackground(Color.red);
            preechido = false;

        }
        if (JTFCPF.getText().isEmpty()) {
            JTFCPF.setText("O campo CPF não pode ficar vazio");
            JTFCPF.setBackground(Color.red);
            preechido = false;
            jTabbedPane1.transferFocusBackward();

        }
        return preechido;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JComboBox<String> JCBCidade;
    private javax.swing.JComboBox<String> JCBEstado;
    private javax.swing.JFormattedTextField JFTTelefone;
    private javax.swing.JTextField JTFBairro;
    private javax.swing.JFormattedTextField JTFCEP;
    private javax.swing.JTextField JTFCNPJ;
    private javax.swing.JFormattedTextField JTFCPF;
    private javax.swing.JFormattedTextField JTFCelular;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JFormattedTextField JTFComplemento;
    private javax.swing.JTextField JTFContato;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFIe;
    private javax.swing.JTextField JTFNomeF;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFRazao;
    private javax.swing.JTextArea JTFReferencia;
    private javax.swing.JTextField JTFRua;
    private javax.swing.JTextField JTFTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
