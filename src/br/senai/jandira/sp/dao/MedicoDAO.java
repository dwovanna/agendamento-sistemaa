package br.senai.jandira.sp.dao;


import br.senai.jandira.sp.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
private final static String URL = "C:\\Users\\22282222\\javadst\\medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282222\\javadst\\medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico m) {
        medico.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }
    
    public static ArrayList<Medico> getMedicos() {
        return medico;
    }
    
    public static Medico getMedico(Integer codigo) {

        for (Medico m : medico) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }

        return null;

    }
    
    public static void atualizar(Medico medicoAtualizado) {
        for (Medico m : medico) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medico.set(medico.indexOf(m), medicoAtualizado);
                break;
            }
        }

        atualizarArquivo();

    }
    
    public static void excluir(Integer codigo) {

        for (Medico m : medico) {
            if (m.getCodigo() == codigo) {
                medico.remove(m);
                break;
            }
        }

        atualizarArquivo();

    }
    
    private static void atualizarArquivo() {
        // PASSO 01 - Criar uma representação dos arquivos que seráo manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo temporario
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário, exceto o registro que
            // não queremos mais
            for (Medico m : medico) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            // Excluir o arquivo atual
            arquivoAtual.delete();

            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");

                Medico m = new Medico(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.parse(vetor[5]),
                        Integer.valueOf(vetor[0]));

                // Guardar a especialidade na lista
                medico.add(m);

                // Ler a próxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo.");
        }

    }
    
    public static DefaultTableModel getTabelaMedico() {

        String[] titulo = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};

        String[][] dados = new String[medico.size()][6];

        for (Medico m : medico) {
            int i = medico.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            dados[i][4] = m.getEmail();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][5] = m.getDataDeNacsimento().format(barra);

        }

        return new DefaultTableModel(dados, titulo);

    }
    
}