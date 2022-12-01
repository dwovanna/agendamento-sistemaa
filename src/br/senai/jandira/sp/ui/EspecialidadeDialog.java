package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.EspecialidadeDAO;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        preencherTitulo();

    }

    public EspecialidadeDialog(java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        especialidade = e;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();

    }

    private void preencherFormulario() {
        jTextFieldCodigo.setText(especialidade.getCodigo().toString());
        jTextFieldNomedaEspecialidade.setText(especialidade.getNome());
        jTextFieldDescricao.setText(especialidade.getDescricao());

    }

    private void preencherTitulo() {
        jLabelEspcialidadeAdd.setText("Especialidade - " + operacao);
        if (operacao == OperacaoEnum.EDITAR) {
            jLabelEspcialidadeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png")));

        } else {
            jLabelEspcialidadeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus (1).png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidade = new javax.swing.JPanel();
        jLabelEspcialidadeAdd = new javax.swing.JLabel();
        jPanelDdos = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomedaEspecialidade = new javax.swing.JLabel();
        jTextFieldNomedaEspecialidade = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        panelEspecialidade.setBackground(new java.awt.Color(204, 204, 255));

        jLabelEspcialidadeAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelEspcialidadeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus (1).png"))); // NOI18N
        jLabelEspcialidadeAdd.setText("ESPECIALIDADE - ADICIONAR");

        javax.swing.GroupLayout panelEspecialidadeLayout = new javax.swing.GroupLayout(panelEspecialidade);
        panelEspecialidade.setLayout(panelEspecialidadeLayout);
        panelEspecialidadeLayout.setHorizontalGroup(
            panelEspecialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadeLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabelEspcialidadeAdd)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        panelEspecialidadeLayout.setVerticalGroup(
            panelEspecialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelEspcialidadeAdd)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(panelEspecialidade);
        panelEspecialidade.setBounds(0, 0, 670, 87);

        jPanelDdos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelNomedaEspecialidade.setText("Nome da Especialidade:");

        jTextFieldNomedaEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelDescricao.setText("Descrição da Especialidade:");

        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/error.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setToolTipText("Cancelar");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/save.png"))); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setToolTipText("Salvar");
        jButtonSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDdosLayout = new javax.swing.GroupLayout(jPanelDdos);
        jPanelDdos.setLayout(jPanelDdosLayout);
        jPanelDdosLayout.setHorizontalGroup(
            jPanelDdosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDdosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanelDdosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDdosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomedaEspecialidade)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomedaEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanelDdosLayout.setVerticalGroup(
            jPanelDdosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDdosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelNomedaEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomedaEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanelDdosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanelDdos);
        jPanelDdos.setBounds(10, 100, 650, 450);

        setSize(new java.awt.Dimension(687, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed
    private void editar() {
        especialidade.setNome(jTextFieldNomedaEspecialidade.getText());
        especialidade.setDescricao(jTextFieldDescricao.getText());

        EspecialidadeDAO.atualizar(especialidade);
        JOptionPane.showMessageDialog(null, "Especialidade atualizada com sucesso!");
        dispose();

    }

    private void adicionar() {
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(jTextFieldNomedaEspecialidade.getText());
        novaEspecialidade.setDescricao(jTextFieldDescricao.getText());

        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(null, "Especialidade gravada com sucesso", "Especialidades", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEspcialidadeAdd;
    private javax.swing.JLabel jLabelNomedaEspecialidade;
    private javax.swing.JPanel jPanelDdos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNomedaEspecialidade;
    private javax.swing.JPanel panelEspecialidade;
    // End of variables declaration//GEN-END:variables
}
