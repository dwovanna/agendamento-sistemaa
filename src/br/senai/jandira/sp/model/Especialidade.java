package br.senai.jandira.sp.model;

import javax.swing.JOptionPane;

public class Especialidade {
    private Integer codigo;
    private String nome;
    private String descricao;

    // contruindo classe
    //metodos de acesso aos atributos
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " N�o � um nome valido!! \n deve conter pelo menos 3 letras");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;

        } else {
            JOptionPane.showMessageDialog(null, descricao + "  N�o � uma descri��o v�lida! \n deve conter pelo menos 10 caracteres. \n tente novamente, por favor!");
        }

    }

    public String getDescricao() {
        return descricao;
    }
}
