package br.senai.jandira.sp.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/jandira/sp/imagens/notepad.png")));
        initPanels();

    }
    //atributo da classe

    PanelEspecialidades panelEspecialidades;
     PanelPlano panelPlano;
     PanelMedico panelMedico;
//constantes
    private final int POS_X = 10;
    private final int POS_Y = 140;
    private final int LARGURA = 780;
    private final int ALTURA = 370;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanodeSaude = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonMedico = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/notepad.png"))); // NOI18N

        labelSistema.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        labelSistema.setText("SISTEMA PARA AGENDAMENTO DE CONSULTAS");
        labelSistema.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 80);

        buttonHome.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/home (1).png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 90, 40);

        buttonPaciente.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/group.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(210, 100, 90, 40);

        buttonPlanodeSaude.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonPlanodeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/desk.png"))); // NOI18N
        buttonPlanodeSaude.setText(" Plano de Saude");
        buttonPlanodeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlanodeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanodeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanodeSaude);
        buttonPlanodeSaude.setBounds(410, 100, 130, 40);

        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/notebook.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(310, 100, 90, 40);

        buttonEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/pin.png"))); // NOI18N
        buttonEspecialidade.setText("Especialidade");
        buttonEspecialidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(550, 100, 120, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 102, 255))); // NOI18N
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 255));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(20, 70, 160, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(20, 120, 280, 20);

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelHome.add(jPanel2);
        jPanel2.setBounds(0, 143, 750, 3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Suporte Técnico");
        panelHome.add(jLabel3);
        jLabel3.setBounds(620, 160, 110, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("E-mail: suportein@sisacon.com");
        panelHome.add(jLabel4);
        jLabel4.setBounds(550, 190, 190, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefone: (11) 2450-6300");
        panelHome.add(jLabel5);
        jLabel5.setBounds(590, 210, 140, 20);

        jLabel6.setText("www.sicacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(610, 230, 130, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 750, 350);

        buttonMedico.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/user.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(110, 100, 90, 40);

        jButton1.setText("Sair");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton1);
        jButton1.setBounds(690, 90, 60, 20);

        setSize(new java.awt.Dimension(787, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
        panelPlano.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed

    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanodeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanodeSaudeActionPerformed
        panelPlano.setVisible(true);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
         panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonPlanodeSaudeActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed

    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed

        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlano.setVisible(false);
 panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
panelEspecialidades.setVisible(false);
        panelHome.setVisible(false);
        panelPlano.setVisible(false);
        panelMedico.setVisible(true);
    }//GEN-LAST:event_buttonMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanodeSaude;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        panelPlano = new PanelPlano();
        panelPlano.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelPlano);
        panelPlano.setVisible(false);
        
        panelMedico = new PanelMedico();
        panelMedico.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelMedico);
        panelMedico.setVisible(false);
        
    }
    
   
   
}

