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
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class telaCadFuncionario extends javax.swing.JFrame {

    FuncionarioController controller;
    EnderecoController endereco;
    Funcionario fun;
    CidadeController controllerCid;
    Cidade cid;
    ArrayList<Cidade> cidades;
    ArrayList<Cargo> cargos;
    ArrayList<Departamento> departamentos;
    Cargo car;
    CargoController ControllerCargo;
    Endereco end;
    EnderecoController ControllerEndereco;
    Departamento dep;
    DepartamentoController ControllerDepartamento;
    CidadeController controllerCidade;
    int idEndereco=0;
    /**
     * Creates new form telaCadFuncionario
     */
    public telaCadFuncionario() {
        initComponents();
        controller = new FuncionarioController();
        controllerCid = new CidadeController();
        ControllerCargo = new CargoController();
        ControllerEndereco = new EnderecoController();
        ControllerDepartamento = new DepartamentoController();
        departamentos = ControllerDepartamento.selecionarDepartamentos();
        cargos = ControllerCargo.selecionarCargos();
        JCBCargo.removeAllItems();
        JCBCargo.removeAllItems();
        end = new Endereco();
        fun = new Funcionario();
        cid = new Cidade();
        car = new Cargo();
        
        for (Cargo car : cargos) {
            JCBCargo.addItem(car.getNomeCargo());
        }
        // listando departamento

        for (Departamento cid : departamentos) {
            JCBDepartamento.addItem(cid.getNomeDepartamento());
        }
    }

    public Funcionario criarObjeto() {
        ControllerCargo = new CargoController();
        ControllerDepartamento = new DepartamentoController();
        controllerCidade = new CidadeController();

        car = ControllerCargo.pesquisar(JCBCargo.getSelectedItem().toString());
        dep = ControllerDepartamento.pesquisar(JCBDepartamento.getSelectedItem().toString());
        fun.setNome(JTFNome.getText());
        fun.setEmail(JTFEmail.getText());
        fun.setRg(JTFRG.getText());
        fun.setCpf(JTFCPF.getText());
        fun.setTelefone(JTFTelefone.getText());
        fun.setCelular(JTFCelular.getText());
        fun.setDataNasc(JTFDataNascimento.getText());
        fun.setSexo(JCBSexo.getSelectedItem().toString());
        fun.setEstadoCivilFuncionario(JCBEstadoCivil.getSelectedItem().toString());
        fun.setFormacaoEscolarFuncionario(JTFFormacaoEscola.getText());

        fun.setDataAdmissaoFuncionario(JTFDataAdmissao.getText());
        fun.setCargo_idCargo(car.getIdCargo());
        fun.setDepartamento_idDepartamento(dep.getIdDepartmento());
        fun.setRuaEndereco(JTFRua.getText());
        fun.setBairroEndereco(JTFBairro.getText());
        fun.setCepEndereco(JTFCEP.getText());
        fun.setComplementoEndereco(JTFComplemento.getText());
        if (JTFNumero.getText().equals("")) {
            JTFNumero.setText("0");
        }
        fun.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
        fun.setCepEndereco(JTFCEP.getText());
        fun.setCtFuncionario(JTFCT.getText());
        fun.setPisFuncionario(JTFPis.getText());
        if (JTFSalario.getText().equals("")) {
            JTFSalario.setText("0");
        }
        String valor = JTFSalario.getText().replaceAll(",", ".");
        fun.setSalarioFuncionario(Double.parseDouble(valor));
        fun.setRuaEndereco(JTFRua.getText());
        fun.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
        fun.setBairroEndereco(JTFBairro.getText());
        fun.setCepEndereco(JTFCEP.getText());
        fun.setReferenciaEndereco(JTFReferencia.getText());
        fun.setQtdDependentesFuncionario(Integer.parseInt(JTFQtdDePendente.getValue().toString()));
        fun.setIdCidadeEndereco((controllerCidade.pesquisar(JCBCidade.getSelectedItem().toString())).getCodigo());

        if (JTFCodigo.getText().equals("")) {

        } else {
            fun.setIdFuncionario(Integer.parseInt(JTFCodigo.getText()));
        }
        return fun;
    }

    public Endereco criarObjetoEndereco() {
        Endereco end = new Endereco();
        if (idEndereco  != 0){
      end.setIdEndereco(idEndereco);
      }
        end.setIdFuncionarioEndereco(Integer.parseInt(JTFCodigo.getText()));
        end.setRuaEndereco(JTFRua.getText());
        end.setBairroEndereco(JTFBairro.getText());
        end.setIdCidadeEndereco(controllerCid.pesquisar(JCBCidade.getSelectedItem().toString(),JCBEstado.getSelectedItem().toString()).getCodigo());
        end.setCepEndereco(JTFCEP.getText());
        end.setReferenciaEndereco(JTFReferencia.getText());
        end.setNumEndereco(Integer.parseInt(JTFNumero.getText()));
        end.setComplementoEndereco(JTFComplemento.getText());
        return end;
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
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JTFRG = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        JTFCelular = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JCBSexo = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        JCBEstadoCivil = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        JTFDataNascimento = new javax.swing.JFormattedTextField();
        jTextField24 = new javax.swing.JTextField();
        JTFFormacaoEscola = new javax.swing.JTextField();
        JTFCPF = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        JTFRua = new javax.swing.JTextField();
        JTFBairro = new javax.swing.JTextField();
        JTFNumero = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTFReferencia = new javax.swing.JTextArea();
        JCBEstado = new javax.swing.JComboBox<>();
        JCBCidade = new javax.swing.JComboBox<>();
        JTFCEP = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        JTFComplemento = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        JCBCargo = new javax.swing.JComboBox<>();
        JTFPis = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        JTFCT = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        JTFSalario = new javax.swing.JFormattedTextField();
        jLabel51 = new javax.swing.JLabel();
        JCBDepartamento = new javax.swing.JComboBox<>();
        JTFQtdDePendente = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        JTFDataAdmissao = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JBAlterar = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBNovo = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Funcionários");

        jLabel1.setText("Pesquisa:");

        JTFPesquisar.setText("Digite o código ou nome do Funcionário");
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

        jTabbedPane3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane3ComponentShown(evt);
            }
        });

        jPanel2.setToolTipText("");

        jLabel27.setText("Código:");

        JTFCodigo.setEnabled(false);

        jLabel28.setText("Nome:");

        JTFNome.setEnabled(false);
        JTFNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFNomeMouseClicked(evt);
            }
        });

        jLabel29.setText("CPF:");

        jLabel30.setText("RG:");

        JTFRG.setEnabled(false);
        JTFRG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFRGMouseClicked(evt);
            }
        });

        jLabel31.setText("Celular");

        try {
            JTFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCelular.setEnabled(false);
        JTFCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCelularActionPerformed(evt);
            }
        });

        jLabel32.setText("telefone:");

        try {
            JTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFTelefone.setEnabled(false);

        jLabel33.setText("E-mail:");

        JTFEmail.setEnabled(false);
        JTFEmail.setMaximumSize(new java.awt.Dimension(40, 2147483647));
        JTFEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFEmailMouseClicked(evt);
            }
        });

        jLabel34.setText("Sexo:");

        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA", "FE" }));
        JCBSexo.setEnabled(false);

        jLabel35.setText("Data de Nascimento:");

        jLabel36.setText("Estado Civil");

        JCBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTEIRO(A)", "CASADO(A)", "VIUVO(A)" }));
        JCBEstadoCivil.setEnabled(false);
        JCBEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEstadoCivilActionPerformed(evt);
            }
        });

        jLabel37.setText("Formação Escolar:");

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

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        JTFFormacaoEscola.setEnabled(false);

        try {
            JTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCPF.setEnabled(false);
        JTFCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFCPFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel33)
                                .addComponent(jLabel30)
                                .addComponent(jLabel32)
                                .addComponent(jLabel35))
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 137, Short.MAX_VALUE)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFNome)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JCBEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(JTFDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTFFormacaoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3098, 3098, 3098)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(JTFFormacaoEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(JCBEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Dados Pessoais", jPanel2);

        jLabel20.setText("Rua:");

        jLabel21.setText("N°:");

        jLabel22.setText("Bairro:");

        jLabel23.setText("CEP:");

        jLabel24.setText("UF:");

        jLabel25.setText("Cidade:");

        jLabel26.setText("Referência:");

        JTFRua.setEnabled(false);
        JTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFRuaActionPerformed(evt);
            }
        });

        JTFBairro.setEnabled(false);

        JTFNumero.setEnabled(false);

        JTFReferencia.setColumns(20);
        JTFReferencia.setRows(5);
        JTFReferencia.setEnabled(false);
        jScrollPane2.setViewportView(JTFReferencia);

        JCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        JCBEstado.setSelectedIndex(-1);
        JCBEstado.setEnabled(false);
        JCBEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBEstadoItemStateChanged(evt);
            }
        });
        JCBEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCBEstadoMouseClicked(evt);
            }
        });
        JCBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEstadoActionPerformed(evt);
            }
        });

        JCBCidade.setEnabled(false);
        JCBCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCidadeActionPerformed(evt);
            }
        });

        try {
            JTFCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFCEP.setEnabled(false);

        jLabel39.setText("Complemento");

        JTFComplemento.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel20))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(JTFNumero))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(JCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFBairro)))
                            .addComponent(JTFRua)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(71, 71, 71))
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Endereço", jPanel3);

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel43.setText("Data de Admissão");

        jLabel47.setText("Cargo:");

        JCBCargo.setEnabled(false);

        JTFPis.setEnabled(false);

        jLabel48.setText("Pis:");

        JTFCT.setEnabled(false);

        jLabel49.setText("Carteira de Trabalho");

        jLabel50.setText("Salário");

        JTFSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        JTFSalario.setEnabled(false);
        JTFSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFSalarioActionPerformed(evt);
            }
        });

        jLabel51.setText("Departamento:");

        JCBDepartamento.setEnabled(false);

        JTFQtdDePendente.setEnabled(false);

        jLabel52.setText("Quant. Dependentes");
        jLabel52.setToolTipText("Quantidade de Dependentes");

        try {
            JTFDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFDataAdmissao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(18, 18, 18)
                                .addComponent(JTFQtdDePendente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel43))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFCT, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFPis, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel47)
                    .addComponent(JCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48)
                    .addComponent(JTFPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(JTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(JCBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(JTFQtdDePendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Dados Funcionais", jPanel1);

        JBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/alterar.png"))); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.setEnabled(false);
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
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

        JBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/novo.png"))); // NOI18N
        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
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
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBNovo)
                        .addGap(43, 43, 43)
                        .addComponent(JBSalvar)
                        .addGap(43, 43, 43)
                        .addComponent(JBAlterar)
                        .addGap(43, 43, 43)
                        .addComponent(JBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBCancelar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addComponent(JBPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBSalvar)
                        .addComponent(JBCancelar)
                        .addComponent(JBAlterar)
                        .addComponent(JBExcluir))
                    .addComponent(JBNovo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        try {
            pesquisar();        // TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(telaCadFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JTFCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCelularActionPerformed

    private void JCBEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEstadoCivilActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void JTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFRuaActionPerformed

    private void JCBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEstadoActionPerformed

    private void JCBCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCidadeActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar os dados da Funcionários", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
        if (opcao == 0) {
            if (verificarCampus()) {
                controller.alterar(this.criarObjeto());
                ControllerEndereco.alterar(this.criarObjetoEndereco());
                limparCampus();
                habilitarCampus(3);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controller.cadastrar(this.criarObjeto());
            ControllerEndereco.cadastrar(this.criarObjetoEndereco());
            this.limparCampus();
            this.habilitarCampus(3);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        habilitarCampus(2);
        limparCampus();
        JTFCodigo.setText(Integer.toString(controller.pegarIdFuncionario() + 1));

    }//GEN-LAST:event_JBNovoActionPerformed
    public void habilitarCampus(int btn) {
        switch (btn) {
            case 1://Pesquisar
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(false);
                JCBCidade.setEnabled(true);
                JCBEstado.setEnabled(true);
                JTFCodigo.setEnabled(false);
                JTFNome.setEnabled(true);
                JTFEmail.setEnabled(true);
                JTFRG.setEnabled(true);
                JTFCPF.setEnabled(true);
                JTFTelefone.setEnabled(true);
                JTFCelular.setEnabled(true);
                JTFDataNascimento.setEnabled(true);
                JCBSexo.setEnabled(true);
                JCBEstadoCivil.setEnabled(true);
                JTFFormacaoEscola.setEnabled(true);
                //segunda aba
                JTFDataAdmissao.setEnabled(true);
                JCBCargo.setEnabled(true);
                JTFCT.setEnabled(true);
                JTFPis.setEnabled(true);
                JTFSalario.setEnabled(true);
                JCBDepartamento.setEnabled(true);
                JTFQtdDePendente.setEnabled(true);
                JTFCodigo.setEnabled(true);

                JTFRua.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFCEP.setEnabled(true);
                JCBEstado.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JCBCidade.setEnabled(true);
                JTFReferencia.setEnabled(true);

                break;
            case 2://novo

                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(true);
                JCBCidade.setEnabled(true);
                JCBEstado.setEnabled(true);

                JCBCidade.setEnabled(true);
                JCBEstado.setEnabled(true);
                JTFCodigo.setEnabled(false);
                JTFNome.setEnabled(true);
                JTFEmail.setEnabled(true);
                JTFRG.setEnabled(true);
                JTFCPF.setEnabled(true);
                JTFTelefone.setEnabled(true);
                JTFCelular.setEnabled(true);
                JTFCodigo.setEnabled(true);
                JTFDataNascimento.setEnabled(true);
                JCBSexo.setEnabled(true);
                JCBEstadoCivil.setEnabled(true);
                JTFFormacaoEscola.setEnabled(true);
                //segunda aba
                JTFDataAdmissao.setEnabled(true);
                JCBCargo.setEnabled(true);
                JTFCT.setEnabled(true);
                JTFPis.setEnabled(true);
                JTFSalario.setEnabled(true);
                JCBDepartamento.setEnabled(true);
                JTFQtdDePendente.setEnabled(true);

                JTFRua.setEnabled(true);
                JTFNumero.setEnabled(true);
                JTFBairro.setEnabled(true);
                JTFCEP.setEnabled(true);
                JCBEstado.setEnabled(true);
                JTFComplemento.setEnabled(true);
                JCBCidade.setEnabled(true);
                JTFReferencia.setEnabled(true);
                break;
            case 3: //salvar, excluir, alterar
                JBPesquisar.setEnabled(true);
                JTFPesquisar.setEnabled(true);
                JCBCidade.setEnabled(false);
                JCBEstado.setEnabled(false);
                JTFCodigo.setEnabled(false);
                JCBCidade.setEnabled(false);
                JCBEstado.setEnabled(false);
                JTFCodigo.setEnabled(false);
                JTFNome.setEnabled(false);
                JTFEmail.setEnabled(false);
                JTFRG.setEnabled(false);
                JTFCPF.setEnabled(false);
                JTFTelefone.setEnabled(false);
                JTFCelular.setEnabled(false);
                JTFDataNascimento.setEnabled(false);
                JCBSexo.setEnabled(false);
                JCBEstadoCivil.setEnabled(false);
                JTFFormacaoEscola.setEnabled(false);
                //segunda aba
                JTFDataAdmissao.setEnabled(false);
                JCBCargo.setEnabled(false);
                JTFCT.setEnabled(false);
                JTFPis.setEnabled(false);
                JTFSalario.setEnabled(false);
                JCBDepartamento.setEnabled(false);
                JTFQtdDePendente.setEnabled(false);

                JTFRua.setEnabled(false);
                JTFNumero.setEnabled(false);
                JTFBairro.setEnabled(false);
                JTFCEP.setEnabled(false);
                JCBEstado.setEnabled(false);
                JTFComplemento.setEnabled(false);
                JCBCidade.setEnabled(false);
                JTFReferencia.setEnabled(false);
                JBNovo.setEnabled(true);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                JBSalvar.setEnabled(false);

                break;
            default:
                break;

        }
    }
    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a Funcionário?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            ControllerEndereco.deletar(this.criarObjeto());
            controller.deletar(this.criarObjeto());

            this.habilitarCampus(3);
            this.limparCampus();
        }
    }//GEN-LAST:event_JBExcluirActionPerformed
    private void pesquisar() throws ParseException {
        fun = controller.pesquisar(JTFPesquisar.getText());
        if (fun.getIdFuncionario() == 0) {
            this.habilitarCampus(3);
            JOptionPane.showMessageDialog(null, "Funcionário não encontrada ", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JTFCodigo.setText(Integer.toString(fun.getIdFuncionario()));
            end = ControllerEndereco.pesquisarEnderecosFuncionario(fun.getIdFuncionario());
            JTFNome.setText(fun.getNome());
            JTFEmail.setText(fun.getEmail());
            JTFRG.setText(fun.getRg());
            JTFCPF.setText(fun.getCpf());
            JTFTelefone.setText(fun.getTelefone());
            JTFCelular.setText(fun.getCelular());
            JTFDataNascimento.setText(fun.getDataNasc());
            JCBSexo.setSelectedItem(fun.getSexo());
            JCBEstadoCivil.setSelectedItem(fun.getEstadoCivilFuncionario());
            JTFFormacaoEscola.setText(fun.getFormacaoEscolarFuncionario());
            JTFReferencia.setText(end.getReferenciaEndereco());
            JTFDataAdmissao.setText(fun.getDataAdmissaoFuncionario());
            JTFCT.setText(fun.getCtFuncionario());
            JTFPis.setText(fun.getPisFuncionario());
            JTFSalario.setText(String.valueOf(fun.getSalarioFuncionario()).replace(".", ","));
            JTFQtdDePendente.setValue(fun.getQtdDependentesFuncionario());
            JTFReferencia.setText(end.getReferenciaEndereco());
            idEndereco = end.getIdEndereco();
            JTFRua.setText(end.getRuaEndereco());
            JTFNumero.setText(String.valueOf(end.getNumEndereco()));
            fun.setIdEndereco(end.getIdEndereco());
            fun.setRuaEndereco(end.getRuaEndereco());
            fun.setNumEndereco(end.getNumEndereco());
            JTFBairro.setText(end.getBairroEndereco());
            JTFCEP.setText(end.getCepEndereco());
            JTFComplemento.setText(end.getComplementoEndereco());

            cid = controllerCid.pesquisar(end.getIdCidadeEndereco());
            JCBEstado.setSelectedItem(cid.getUf());
            JCBCidade.setSelectedItem(cid.getNome());
            car = ControllerCargo.pesquisar(fun.getCargo_idCargo());
            JCBCargo.setSelectedItem(car.getNomeCargo());
            dep = ControllerDepartamento.pesquisar(fun.getDepartamento_idDepartamento());
            JCBDepartamento.setSelectedItem(dep.getNomeDepartamento());
            this.habilitarCampus(1);

        }
    }

    public static Date TransformaData(Date data) throws ParseException {
        String strData = data.toString();
        Date objDate = (Date) new SimpleDateFormat("yyyy/MM/dd").parse(strData);

        return objDate;
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
        JCBEstadoCivil.setSelectedItem("");
        JTFFormacaoEscola.setText("");
        //segunda aba
        JTFDataAdmissao.setText("");
        JCBCargo.setSelectedItem(0);
        JTFCT.setText("");
        JTFPis.setText("");
        JTFSalario.setText("");
        JCBDepartamento.setSelectedItem(0);
        JTFQtdDePendente.setValue(0);

        JTFRua.setText("");
        JTFNumero.setText("");
        JTFBairro.setText("");
        JTFCEP.setText("");
        JCBEstado.setSelectedItem(0);
        JTFComplemento.setText("");
        JCBCidade.setSelectedItem(0);
        JTFReferencia.setText("");
        JTFPesquisar.setText("Digite o código ou nome da Funcionários");
    }
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.habilitarCampus(3);
        this.limparCampus();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFNomeMouseClicked
        JTFNome.setBackground(Color.white);
        JTFNome.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeMouseClicked

    private void JTFRGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFRGMouseClicked
        JTFRG.setBackground(Color.white);
        JTFRG.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_JTFRGMouseClicked

    private void JTFCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFCPFMouseClicked
        JTFCPF.setBackground(Color.white);
        JTFCPF.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_JTFCPFMouseClicked

    private void JCBEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBEstadoItemStateChanged
        cidades = controllerCid.selcionarCidadesUF((String) JCBEstado.getSelectedItem());
        JCBCidade.removeAllItems();
        for (Cidade cid : cidades) {
            JCBCidade.addItem(cid.getNome());
        }
    }//GEN-LAST:event_JCBEstadoItemStateChanged

    private void JTFSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFSalarioActionPerformed

    private void JTFDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataNascimentoActionPerformed

    private void JTFPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                this.pesquisar();
            } catch (ParseException ex) {
                Logger.getLogger(telaCadFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JTFPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFPesquisarMouseClicked
        JTFPesquisar.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPesquisarMouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void jTabbedPane3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane3ComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // JOptionPane.showMessageDialog(null, "TESTE");            // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void JTFEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFEmailMouseClicked
        JTFEmail.setBackground(Color.white);
        JTFEmail.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEmailMouseClicked

    private void JCBEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCBEstadoMouseClicked
        JCBEstado.setBackground(Color.white);
    }//GEN-LAST:event_JCBEstadoMouseClicked

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
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadFuncionario().setVisible(true);
            }
        });
    }

    public boolean verificarCampus() {
        boolean preechido = true;
        if (JTFNome.getText().isEmpty()) {
            JTFNome.setText("O campo Nome não pode ficar vazio");
            JTFNome.setBackground(Color.red);
            preechido = false;
            jTabbedPane3.setSelectedIndex(0);
        }
        if (JTFRG.getText().isEmpty()) {
            JTFRG.setText("O campo RG não pode ficar vazio");
            JTFRG.setBackground(Color.red);
            preechido = false;
            jTabbedPane3.setSelectedIndex(0);
        }

        if (JTFEmail.getText().isEmpty()) {
            JTFEmail.setText("O campo EMAIL não pode ficar vazio");
            JTFEmail.setBackground(Color.red);
            preechido = false;
            jTabbedPane3.setSelectedIndex(0);
        }

        if (JCBEstado.getSelectedIndex() == -1) {
            JCBEstado.setBackground(Color.red);
            preechido = false;
            jPanel2.setVisible(true);
            jTabbedPane3.setSelectedIndex(1);
        }
        if (JCBCidade.getSelectedItem().equals("")) {
            JCBCidade.setBackground(Color.red);
            preechido = false;
            jPanel2.setVisible(true);
            jTabbedPane3.setSelectedIndex(1);
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
    private javax.swing.JComboBox<String> JCBCargo;
    private javax.swing.JComboBox<String> JCBCidade;
    private javax.swing.JComboBox<String> JCBDepartamento;
    private javax.swing.JComboBox<String> JCBEstado;
    private javax.swing.JComboBox<String> JCBEstadoCivil;
    private javax.swing.JComboBox<String> JCBSexo;
    private javax.swing.JTextField JTFBairro;
    private javax.swing.JFormattedTextField JTFCEP;
    private javax.swing.JFormattedTextField JTFCPF;
    private javax.swing.JTextField JTFCT;
    private javax.swing.JFormattedTextField JTFCelular;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JFormattedTextField JTFComplemento;
    private javax.swing.JFormattedTextField JTFDataAdmissao;
    private javax.swing.JFormattedTextField JTFDataNascimento;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFFormacaoEscola;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFNumero;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFPis;
    private javax.swing.JSpinner JTFQtdDePendente;
    private javax.swing.JTextField JTFRG;
    private javax.swing.JTextArea JTFReferencia;
    private javax.swing.JTextField JTFRua;
    private javax.swing.JFormattedTextField JTFSalario;
    private javax.swing.JFormattedTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField24;
    // End of variables declaration//GEN-END:variables
}
