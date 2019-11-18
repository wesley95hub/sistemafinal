package VIEW;

import CONTROLLER.MarcaController;
import CONTROLLER.ProdutoController;
import CONTROLLER.TipoController;

import MODEL.Marca;
import MODEL.Produto;
import MODEL.Tipo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PC13
 */
public class TelaCadProduto extends javax.swing.JFrame {

    ProdutoController controller;
    Produto pro;
    ArrayList<Produto> produto;
    MarcaController controllerMarca;
    TipoController controllerTipo;
    Marca marca;
    Tipo tipo;
    ArrayList<Marca> marcas ;
    ArrayList<Tipo> tipos;

    public TelaCadProduto() {
        initComponents();
        controller = new ProdutoController();
        pro = new Produto();
        controllerMarca = new MarcaController();
        controllerTipo = new TipoController();
        marcas = new ArrayList<>();
        tipos = new ArrayList<>();
        
        marcas = controllerMarca.selecionarMarcas();
        JCBMarca.removeAllItems();
        for (Marca mar : marcas) {
            JCBMarca.addItem(mar.getNomeMarca());
        }
        tipos = controllerTipo.selecionarTipos();
        JCBTipo.removeAllItems();
        for (Tipo tip : tipos) {
            JCBTipo.addItem(tip.getNomeTipo());
        }
        
    }

    public Produto criarObjeto() {
        pro.setNomeProduto(JTFNomePro.getText());
        pro.setDescricaoProduto(JTFDescr.getText());
        pro.setPercetualProduto(Double.parseDouble(JTFPercVendas.getText()));
        pro.setDataCadProduto(JTFDataCadastro.getText());
        pro.setCodigoBarrasProduto(Integer.parseInt(JTFCodBarras.getText()));
        pro.setPesoProduto(Double.parseDouble(JTFPeso.getText()));
        pro.setDataVencimentoProduto(JTFDataVenc.getText());
        pro.setUnidCompraProduto(JTFQtdCompra.getText());
        pro.setIdMarcaProduto(controllerMarca.pesquisar(JCBMarca.getSelectedItem().toString()).getIdMarca());
        pro.setIdTipoProduto(controllerTipo.pesquisar(JCBTipo.getSelectedItem().toString()).getIdTipo());
        pro.setModeloProduto(JTFModelo.getText());
        pro.setObsProduto(JTFObs.getText());
        pro.setValorVendaProduto(Double.parseDouble(JTFValorVenda.getText()));
        pro.setUnidVendaProduto(JTFUnidcompra.getText());
        if (JTFcodigo.getText().equals("")) {
        } else {
            pro.setIdProduto(Integer.parseInt(JTFcodigo.getText()));
        }
        return pro;
    }
public void pegarData() {
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        JTFDataCadastro.setText(formatador.format(data));     
    }

    public void habilitarCampus(int btn) {
        switch (btn) {
            case 1://Pesquisar
                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(false);

               JTFNomePro.setEnabled(true);
                JTFDescr.setEnabled(true);
                JTFcodigo.setEnabled(true);
                JTFValorVenda.setEnabled(true);
                JTFDataCadastro.setEnabled(true);
                JCBMarca.setEnabled(true);
                JTFCodBarras.setEnabled(true);
                JCBTipo.setEnabled(true);
                JTFPeso.setEnabled(true);
                JTFModelo.setEnabled(true);
                JTFDataVenc.setEnabled(true);
                 JTFPercVendas.setEnabled(true);
                JTFQtdCompra.setEnabled(true);
                JTFObs.setEnabled(true);         
                JTFUnidcompra.setEnabled(true);
                break;
            case 2://novo

                JBNovo.setEnabled(false);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(true);
                JBSalvar.setEnabled(true);

                JTFNomePro.setEnabled(true);
                JTFDescr.setEnabled(true);
                JTFcodigo.setEnabled(true);
                JTFValorVenda.setEnabled(true);
                JTFDataCadastro.setEnabled(true);
                JCBMarca.setEnabled(true);
                JTFCodBarras.setEnabled(true);
                JCBTipo.setEnabled(true);
                JTFPeso.setEnabled(true);
                JTFModelo.setEnabled(true);
                JTFDataVenc.setEnabled(true);
                 JTFPercVendas.setEnabled(true);
                JTFQtdCompra.setEnabled(true);
                JTFObs.setEnabled(true);         
                
                JTFUnidcompra.setEnabled(true);
                this.pegarData();
                break;
            case 3: //salvar, excluir, alterar
                JBNovo.setEnabled(true);
                JBAlterar.setEnabled(false);
                JBExcluir.setEnabled(false);
                JBCancelar.setEnabled(false);
                JBSalvar.setEnabled(false);

                JTFNomePro.setEnabled(false);
                JTFDescr.setEnabled(false);
                JTFcodigo.setEnabled(false);
                JTFValorVenda.setEnabled(false);
                JTFDataCadastro.setEnabled(false);
                JCBMarca.setEnabled(false);
                JTFCodBarras.setEnabled(false);
                JCBTipo.setEnabled(false);
                JTFPeso.setEnabled(false);
                JTFModelo.setEnabled(false);
                JTFDataVenc.setEnabled(false);
                 JTFPercVendas.setEnabled(false);
                JTFQtdCompra.setEnabled(false);
                JTFObs.setEnabled(false);         
                JTFUnidcompra.setEnabled(false);
                break;
            default:
                break;

        }
    }

    public boolean verificarCampus() {
        boolean preechido = true;
        if (JTFNomePro.getText().isEmpty()) {
            JTFNomePro.setText("O campo Nome não pode ficar vazio");
            JTFNomePro.setBackground(Color.red);
            preechido = false;
        }
        if (JTFValorVenda.getText().isEmpty()) {
            /*JTFValorVenda.setText("O campo  não pode ficar vazio");*/
            JTFValorVenda.setBackground(Color.red);
            preechido = false;
        }
        if (JTFQtdCompra.getText().isEmpty()) {
            JTFQtdCompra.setText("O campo QtdCompra não pode ficar vazio");
            JTFQtdCompra.setBackground(Color.red);
            preechido = false;

        }
        return preechido;
    }

    private void limparCampus() {
        JTFNomePro.setText("");
        JTFDescr.setText("");
        JTFcodigo.setText("");
        JTFDataCadastro.setText("");
        JTFCodBarras.setText("");
        JTFPeso.setText("");
        JTFDataVenc.setText("");
        JTFQtdCompra.setText("");
        JTFValorVenda.setValue(0);
        JCBMarca.setSelectedIndex(0);
        JCBTipo.setSelectedIndex(0);
        JTFModelo.setText("");
        JTFPercVendas.setText("");
        JTFUnidcompra.setText("");
        JTFObs.setText("");
        JTFPesquisar.setText("Digite o código ou nome do produto");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        JTFNomePro = new javax.swing.JTextField();
        JTFDescr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFPesquisar = new javax.swing.JTextField();
        JBPesquisar = new javax.swing.JButton();
        JTFDataCadastro = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JCBMarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JTFPeso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JCBTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        JTFDataVenc = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        JTFCodBarras = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JTFPercVendas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JTFUnidcompra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JTFQtdCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFObs = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        JBNovo = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        JBprimeiro = new javax.swing.JButton();
        JBanterior = new javax.swing.JButton();
        JBproximo = new javax.swing.JButton();
        JBultimo = new javax.swing.JButton();
        JTFModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFValorVenda = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaCadastroProduto");
        setFocusTraversalPolicyProvider(true);

        jLabel1.setText("Nome do Produto:");

        jLabel2.setText("Dados Produto:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Data Cadastro:");

        JTFNomePro.setEnabled(false);

        JTFDescr.setEnabled(false);

        jLabel5.setText("Pesquisar:");

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

        try {
            JTFDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFDataCadastro.setEnabled(false);
        JTFDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataCadastroActionPerformed(evt);
            }
        });

        jLabel7.setText("Marca:");

        jLabel8.setText("Tipo:");

        JCBMarca.setEnabled(false);

        jLabel9.setText("Peso:");

        JTFPeso.setEnabled(false);

        jLabel10.setText("Modelo:");

        JCBTipo.setEnabled(false);

        jLabel11.setText("Data Vencimento:");

        try {
            JTFDataVenc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTFDataVenc.setEnabled(false);
        JTFDataVenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataVencActionPerformed(evt);
            }
        });

        jLabel12.setText("Código Barras:");

        JTFCodBarras.setEnabled(false);

        jLabel13.setText("Código:");

        JTFcodigo.setEnabled(false);
        JTFcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFcodigoActionPerformed(evt);
            }
        });

        jLabel14.setText("Percentual vendas:");

        JTFPercVendas.setEnabled(false);

        jLabel15.setText("Unidade de compra:");

        JTFUnidcompra.setEnabled(false);

        jLabel16.setText("Quantidade compra:");

        JTFQtdCompra.setEnabled(false);

        JTFObs.setColumns(20);
        JTFObs.setRows(5);
        JTFObs.setEnabled(false);
        jScrollPane1.setViewportView(JTFObs);

        jLabel17.setText("Observação:");

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

        JBprimeiro.setEnabled(false);

        JBanterior.setEnabled(false);

        JBproximo.setEnabled(false);

        JBultimo.setEnabled(false);

        JTFModelo.setEnabled(false);

        jLabel6.setText("Preço Produto:");

        JTFValorVenda.setEnabled(false);
        JTFValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(JTFDescr))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JCBMarca, 0, 125, Short.MAX_VALUE)
                                    .addComponent(JTFValorVenda)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFQtdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTFPeso)
                                            .addComponent(JTFDataVenc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTFDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(JTFCodBarras))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCBTipo, 0, 125, Short.MAX_VALUE)
                            .addComponent(JTFPercVendas)
                            .addComponent(JTFUnidcompra)
                            .addComponent(JTFModelo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JTFNomePro))
                    .addComponent(jSeparator3)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(JTFDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JCBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(JTFDataVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFPercVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFUnidcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(JTFQtdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBproximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBanterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
//            this.pesquisar();
        }
    }//GEN-LAST:event_JTFPesquisarKeyPressed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        pesquisar();

    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        limparCampus();
        habilitarCampus(2);
        JTFcodigo.setText(Integer.toString(controller.pegarIdProduto()+1));

    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        if (verificarCampus()) {
            controller.cadastrar(this.criarObjeto());
            this.limparCampus();
            this.habilitarCampus(3);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente atualizar os dados do produto?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        //TODO add your handling code here:
        if (opcao == 0) {
            if (verificarCampus()) {
                controller.alterar(this.criarObjeto());
                limparCampus();
                habilitarCampus(3);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto?", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
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

    private void JTFDataVencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataVencActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataVencActionPerformed

    private void JTFValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFValorVendaActionPerformed

    private void JTFcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcodigoActionPerformed

    private void JTFDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProduto().setVisible(true);

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
    private javax.swing.JButton JBanterior;
    private javax.swing.JButton JBprimeiro;
    private javax.swing.JButton JBproximo;
    private javax.swing.JButton JBultimo;
    private javax.swing.JComboBox<String> JCBMarca;
    private javax.swing.JComboBox<String> JCBTipo;
    private javax.swing.JTextField JTFCodBarras;
    private javax.swing.JFormattedTextField JTFDataCadastro;
    private javax.swing.JFormattedTextField JTFDataVenc;
    private javax.swing.JTextField JTFDescr;
    private javax.swing.JTextField JTFModelo;
    private javax.swing.JTextField JTFNomePro;
    private javax.swing.JTextArea JTFObs;
    private javax.swing.JTextField JTFPercVendas;
    private javax.swing.JTextField JTFPeso;
    private javax.swing.JTextField JTFPesquisar;
    private javax.swing.JTextField JTFQtdCompra;
    private javax.swing.JTextField JTFUnidcompra;
    private javax.swing.JFormattedTextField JTFValorVenda;
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    private void pesquisar() {
        pro = controller.pesquisar(JTFPesquisar.getText());
        if (pro.getIdProduto() == 0) {
            this.habilitarCampus(3);
            JOptionPane.showMessageDialog(null, "Produto não encontrada", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JTFNomePro.setText(pro.getNomeProduto());
            JTFDescr.setText(pro.getDescricaoProduto());
            JTFcodigo.setText(Integer.toString(pro.getIdProduto()));
            JTFDataCadastro.setText(pro.getDataCadProduto());
            JTFCodBarras.setText(Integer.toString(pro.getCodigoBarrasProduto()));
            JTFPeso.setText(Double.toString(pro.getPesoProduto()));
            JTFDataVenc.setText(pro.getDataVencimentoProduto());
            JTFQtdCompra.setText(pro.getUnidCompraProduto());
            JCBMarca.setSelectedItem(controllerMarca.pesquisar(pro.getIdMarcaProduto()));
            JCBTipo.setSelectedItem(controllerTipo.pesquisar(pro.getIdTipoProduto()));
            JTFModelo.setText(pro.getModeloProduto());
            JTFPercVendas.setText(Double.toString(pro.getPercetualProduto()));
            JTFUnidcompra.setText(pro.getUnidVendaProduto());
            JTFModelo.setText(pro.getModeloProduto());
            JTFDataVenc.setText(pro.getDataVencimentoProduto());
            JTFUnidcompra.setText(pro.getUnidCompraProduto());
            JTFObs.setText(pro.getObsProduto());
            JTFValorVenda.setValue(pro.getValorVendaProduto());
            this.habilitarCampus(1);
        }
    }
}
