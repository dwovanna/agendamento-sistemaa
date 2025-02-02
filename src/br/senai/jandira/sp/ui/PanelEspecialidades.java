package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.EspecialidadeDAO;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        ajustarTabela();
        preencherTabela();

    }

    private int getLinha() {
        linha = tabela.getSelectedRow();
        return linha;
    }

    private void setLinha() {
        linha = tabela.getSelectedRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollEspecialidades = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        buttonexcluir = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 350));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollEspecialidades.setViewportView(tabela);

        buttonexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/trash.png"))); // NOI18N
        buttonexcluir.setText("Cancelar");
        buttonexcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexcluirActionPerformed(evt);
            }
        });

        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png"))); // NOI18N
        buttonEdit.setText("Editar");
        buttonEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png"))); // NOI18N
        buttonAdd.setText("Adicionar");
        buttonAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(buttonexcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 0, 740, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexcluirActionPerformed
        linha = tabela.getSelectedRow();
        if (linha != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this, "Voce precisa selecionar uma linha para excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttonexcluirActionPerformed

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "voce realmente deseja excluir?",
                "ATENÇÃO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        System.out.println(resposta);
        if (resposta == 0) {

            EspecialidadeDAO.excluir(getCodigo());

            preencherTabela();

        }
    }

    private Integer getCodigo() {
        String codigoStr = tabela.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }


    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showConfirmDialog(this,
                    "por favor selecione a linha que voce deseja editar",
                    "especialidades",
                    JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttonEditActionPerformed
    private void editarEspecialidade() {
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog
                = new EspecialidadeDialog(null, true,
                        especialidade, OperacaoEnum.EDITAR);

        especialidadeDialog.setVisible(true);
        
        preencherTabela();
    }

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        EspecialidadeDialog d
                = new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonexcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tabela.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();
    }

    private void ajustarTabela() {
        // impedir que o usuarioas colunas 
        tabela.getTableHeader().setReorderingAllowed(false);

        //bloquear a edçõa das celulas 
        tabela.setDefaultEditor(Object.class, null);

        //definir largura
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(310);

    }

}
