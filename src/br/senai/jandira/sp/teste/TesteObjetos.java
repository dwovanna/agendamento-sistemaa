package br.senai.jandira.sp.teste;

import br.senai.jandira.sp.AgendaApp;
import br.senai.jandira.sp.dao.EspecialidadeDAO;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.PlanoDeSaude;
import java.util.ArrayList;

public class TesteObjetos {

    public static void main(String[] args) {
        int[] a = {6,9,87,35,96};
        int [] b = new int[4];
        b[0] = 55;
        b[1] = 55;
        b[2] = 11;
        b[3] = 99;

       int[][] c = {{4,6,5}, {1,13,3},{5,5,8}};
        System.out.println(c[1][1]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               

        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque");

        Especialidade e2 = new Especialidade("Gastroenterologia");
        e2.setDescricao("Deixa ter dor de barriga");

        Especialidade e3 = new Especialidade();
        e3.setNome("Otorrino");
        e3.setDescricao("Cuida do ouvido");

        Especialidade e4 = new Especialidade("Qualquer coisa!");
        e4.setDescricao("Qualquer coisa só que na descrição");
        
        Especialidade e5 = new Especialidade("Especialidade5!");
        
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        
        
        System.out.println("TAMANHO ---->" + EspecialidadeDAO.getEspecialidades().size()); 
        
        System.out.println(EspecialidadeDAO.getEspecialidade(100).getNome());
        
        EspecialidadeDAO.excluir(101);
        
        System.out.println(EspecialidadeDAO.getEspecialidades().size());

        
        // Exibir a quantidade de especialidades criadas até agora
        System.out.println("TOTAL DE ESPECIALIDADES ---->" + e1.getContador());
        System.out.println(e1.getCodigo() + "-" + e1.getNome());
        System.out.println(e2.getCodigo() + "-" + e2.getNome());
        System.out.println(e3.getCodigo() + "-" + e3.getNome());
        System.out.println(e4.getCodigo() + "-" + e4.getNome());
        System.out.println(e5.getCodigo() + "-" + e5.getNome());
        

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        especialidades.add(e5);
        System.out.println(especialidades.size());

        // Imprimir no console o nome das especialidades
        // que estão sendo armazenadas no arraylist
        int i = 0;

        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        System.out.println("-------------------FOR----------------");

        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        System.out.println("-------------------FOR EACH----------------");

        // FOR EACH -> para cada
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // Criar 3 planos de saude, armazenar em um arraylist
        // e exibir o nome da operadora de cada um deles
        // usando for each
        System.out.println("-------------------Planos De Saúde----------------");

        PlanoDeSaude p1 = new PlanoDeSaude("Amil Médicas");

        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco Intermédicas");

        PlanoDeSaude p3 = new PlanoDeSaude("NotreDame");

        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);

        for (PlanoDeSaude p : planos) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }

        System.out.println("--------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("--------" + PlanoDeSaude.getQuantidade());

    }

}
