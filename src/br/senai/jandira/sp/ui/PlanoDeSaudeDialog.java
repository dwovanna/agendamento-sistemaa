package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.PlanoDeSaudeDAO;
import br.senai.jandira.sp.model.OperacaoEnum;
import br.senai.jandira.sp.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude plano;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        preencherTitulo();
        
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        plano = p;
        preencherFormulario();
        preencherTitulo();

    }

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void preencherFormulario() {
        jTextFieldCodigo.setText(plano.getCodigo().toString());
        jTextFieldOperadora.setText(plano.getOperadora());
        jTextFieldCategoria.setText(plano.getCategoria());
        jTextField1.setText(plano.getNumero());
        validadeField.setText(plano.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    private void preencherTitulo() {
        jLabel2Add.setText("Planos de Saude  - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png")));

        } else {
            jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png")));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jPaneladd = new javax.swing.JPanel();
        jLabel2Add = new javax.swing.JLabel();
        jLabeloperadora = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jLabelcategoria = new javax.swing.JLabel();
        jLabelnumero = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jTextFieldOperadora = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        validadeField = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setText("Código:");

        jPaneladd.setBackground(new java.awt.Color(204, 204, 255));
        jPaneladd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2Add.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus (1).png"))); // NOI18N
        jLabel2Add.setText("Adicionar - Plano de Saúde");

        javax.swing.GroupLayout jPaneladdLayout = new javax.swing.GroupLayout(jPaneladd);
        jPaneladd.setLayout(jPaneladdLayout);
        jPaneladdLayout.setHorizontalGroup(
            jPaneladdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2Add)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPaneladdLayout.setVerticalGroup(
            jPaneladdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneladdLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2Add)
                .addGap(23, 23, 23))
        );

        jLabeloperadora.setText("Operadora:");

        jLabelValidade.setText("Validade:");

        jLabelcategoria.setText("Categoria:");

        jLabelnumero.setText("Número:");

        jTextFieldCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jTextFieldOperadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOperadoraActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/save.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/error.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        validadeField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        validadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeFieldActionPerformed(evt);
            }
        });
        try {
            validadeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneladd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeloperadora)
                                    .addComponent(jTextFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelValidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelcategoria))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelnumero)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPaneladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeloperadora)
                    .addComponent(jLabelValidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcategoria)
                    .addComponent(jLabelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabelnumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        CharSequence s = " ";
        
        if (jTextFieldOperadora.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A operadora do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextFieldOperadora.requestFocus();
        } else if (jTextFieldCategoria.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A categoria do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextFieldCategoria.requestFocus();
        } else if (jTextField1.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O número do plano é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
        } else if (validadeField.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A validade do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            validadeField.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void validadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeFieldActionPerformed

    private void jTextFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOperadoraActionPerformed
    private void editar() {
        plano.setOperadora(jTextFieldOperadora.getText());
        plano.setCategoria(jTextFieldCategoria.getText());
        plano.setValidade(LocalDate.parse(validadeField.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PlanoDeSaudeDAO.atualizar(plano);
        JOptionPane.showMessageDialog(null, "Plano de Saude atualizada com sucesso!");
        dispose();

    }

    private void adicionar() {
        
            PlanoDeSaude novoPlano = new PlanoDeSaude();
            novoPlano.setOperadora(jTextFieldOperadora.getText());
            novoPlano.setCategoria(jTextFieldCategoria.getText());
            novoPlano.setNumero(jTextField1.getText());
            novoPlano.setValidade(LocalDate.parse(validadeField.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            PlanoDeSaudeDAO.gravar(novoPlano);
            JOptionPane.showMessageDialog(this, "Plano de Saude gravado com sucesso", "Plano de Saude", JOptionPane.INFORMATION_MESSAGE);

            dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2Add;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JLabel jLabelcategoria;
    private javax.swing.JLabel jLabelnumero;
    private javax.swing.JLabel jLabeloperadora;
    private javax.swing.JPanel jPaneladd;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldOperadora;
    private javax.swing.JFormattedTextField validadeField;
    // End of variables declaration//GEN-END:variables
}
