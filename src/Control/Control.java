package Control;

import Model.Musica;
import View.MainGUI;
import static View.MainGUI.EditPane;
import static View.MainGUI.InsertPane;
import static View.MainGUI.ano_insert;
import static View.MainGUI.ano_insert1;
import static View.MainGUI.artista_insert;
import static View.MainGUI.artista_insert1;
import static View.MainGUI.letra_insert;
import static View.MainGUI.letra_insert1;
import static View.MainGUI.musica_insert;
import static View.MainGUI.musica_insert1;
import static View.MainGUI.musica_table;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Victor Nascimento
 */
public class Control {
    private static int fontsize = 13; //tamanho atual da fonte mostrada na interface;
    public static ArrayList<Musica> lista_obj = new ArrayList<>(); // arraylist contendo os objetos musica;
    public static int id = 0; // variavel de auxilio id (usado na hora de criar o objeto musica);
    public static int id_edit = 0; // variavel de auxilo para editar os objetos;

  
    public Control(){
        SetLookAndFeel("Windows"); //Configurar o look and feel.
        MainGUI GUI = new MainGUI(this); // instancia da interface
        
        
        GUI.setVisible(true); // define a interface como visivel
        GUI.setResizable(false); // define a interface como não redimencionavel 
        
        GUI.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE); //define a ação padrão ao fechar a janela (Sair ao fechar)
        GUI.pack(); // Ajusta o tamanho da interface a os componentes internos. Ajuda a manter a interface integra em varias resoluções.
        
        InsertPane.setDefaultCloseOperation(InsertPane.DISPOSE_ON_CLOSE);//define a ação padrão ao fechar a janela (Esconder ao fechar)
        EditPane.setDefaultCloseOperation(InsertPane.DISPOSE_ON_CLOSE);//define a ação padrão ao fechar a janela (Esconder ao fechar)
    }
    
    public static void Att_table(){
        DefaultTableModel dtmMusicList = (DefaultTableModel) musica_table.getModel(); //Configura o modelo padrão da table
        musica_table.setRowSorter(new TableRowSorter(dtmMusicList)); // permite re organizar a tabela
        DAOMusica DAO = new DAOMusica(); // instancia de DAOMusica.
        
        lista_obj = DAO.SelectAll(); // O retorno de SelectAll é um arraylist<Musica> que é armazenado em lista_obj
        
        if(dtmMusicList.getRowCount() > 0){ //Limpa a tabela;(Verifica a quantidade de linhas na tabela)
              dtmMusicList.setRowCount(0); // Define a contagem de linhas da Table para ZERO, se houver elementos na tabela eles serão descartados.
          }
          for (Musica instance : lista_obj) { // Atualiza a tabela. Para cada Musica em lista de musicas(lista_obj) é criado um array de objetos (dados);
             Object[] dados = {instance.getId(),instance.getNome(), instance.getArtista(), instance.getAno()};
            
             dtmMusicList.addRow(dados); // que são adicionados a tabela.
            }
        
    }
    
    public static void About() {//Caixa de mensagem mostrando informações sobre o programa.
        JOptionPane.showMessageDialog(null, "Salve as letras de suas musicas favoritas em seu computador e as acesse quando quiser !\n\nCriado por Victor Nascimento, 2018, como parte do aprendizado sobre programação Java.\nAgradecimento à Josias Coradello, Testador oficial, por assegurar a Qualidade de Software.");
    }

    public static void Exit() {//Sair do programa
        System.exit(0);
    }
    
    public static void showInsertDialog(){ // Singleton para mostrar/esconder a janela para inserir dados.
        if(InsertPane.isVisible()){
            InsertPane.setVisible(!true);
        }else{
            InsertPane.setVisible(true);
        }
    }
    
    public static void showEditDialog(){ //Singleton para mostrar/esconder a janela para editar dados.
        if(EditPane.isVisible()){
            EditPane.setVisible(!true);
        }else{
            EditPane.setVisible(true);
        }
    }
    
    public static void Make_Insert(){ // adquire os dados da interface, monta o objeto musica e o envia para a classe Insert que o envia para o banco de dados.
        Musica  musica_obj;
        DAOMusica musica_bd;
        musica_bd = new DAOMusica();
        
        try {
             musica_obj = new Musica(
                id,
                musica_insert.getText(),
                artista_insert.getText(),
                Integer.parseInt(ano_insert.getText()),
                letra_insert.getText());
             if(musica_obj.getArtista().isEmpty()){
                 musica_obj.setArtista("Desconhecido");
             }
              if(musica_obj.getNome().isEmpty()){
                 musica_obj.setNome("Desconhecido");
             }
              
             if(musica_table.getRowCount() == 0){
                 id = 0;
             } 
             id++;
             musica_bd.Insert(musica_obj); // classe responsavel por enviar os dados para o banco de dados
             Att_table(); // atualiza a tabela da interface.
             
        } catch (HeadlessException | NumberFormatException e) {
           JOptionPane.showMessageDialog(InsertPane, "Preencha os dados corretamente!"); // Trata a possibilidade do usuário preencher os dados de forma inapropriada.
        }
    }
    
    public static void Undo_Remove(){ // Remove uma entrada do banco de dados.
        int index;
        DAOMusica remove = new DAOMusica();
        index = musica_table.getSelectedRow(); // retorna o a linha selecionada pelo usuário, retorna -1 se não houver.
        if(index != -1){
            Musica toPrint = lista_obj.get(index);
            System.out.println("Removendo:" + toPrint.getNome()+"||"+toPrint.getArtista());
            remove.Delete(toPrint.getId());
            Att_table();//Atualiza a lista.
            
        }else{
            JOptionPane.showMessageDialog(musica_table, "Nenhuma musica selecionada !");
        }
    
    }
    
    public static void Make_Update(){ //edita uma entrada do banco de dados
        int index;
        index = musica_table.getSelectedRow();
        if(index != -1){ //Recupera os dados da entrada selecionada. E os coloca na interface de edição, facilitando a edição do mesmo.
            Musica toPrint = lista_obj.get(index);
            id_edit = toPrint.getId();
            artista_insert1.setText(toPrint.getArtista());
            musica_insert1.setText(toPrint.getNome());
            ano_insert1.setText(Integer.toString(toPrint.getAno()));
            letra_insert1.setText(toPrint.getLetra());
            
            EditPane.setVisible(true); //define a interface de edição como visivel para o usuário.
        }else{
            JOptionPane.showMessageDialog(musica_table, "Nenhuma musica selecionada !");
        }
    }
    
    public static void showSelectedIten(){//mostra a letra da musica selecionada na tela do usuário quando o mesmo a seleciona na tabela.
        int index;
        index = musica_table.getSelectedRow();
        if(index != -1){
            Musica toPrint = lista_obj.get(index);
            MainGUI.Caixa_Letra.setText(toPrint.getLetra());
        }
       
    }
    
    public static void Recover_db(){//atualiza a tabela com os dados do banco de dados assim que o programa é executado.
        Att_table();
    }

    public static void Close_clean() {//limpa os campos de texto.
        InsertPane.setVisible(false);
        artista_insert.setText(null);
        musica_insert.setText(null);
        ano_insert.setText(null);
        letra_insert.setText(null);
        EditPane.setVisible(false);
        artista_insert1.setText(null);
        musica_insert1.setText(null);
        ano_insert1.setText(null);
        letra_insert1.setText(null);
    }

    public static void fontSize(boolean b) {//metodo para aumentar ou diminuir o tamanho da fonte na interface grafica
        if(b){
            if(fontsize < 35){
            fontsize = fontsize + 1;
            Font font = new Font("Monospaced", 0, fontsize);
            MainGUI.Caixa_Letra.setFont(font);
            }else{
                Font font = new Font("Monospaced", 0, 35);
                MainGUI.Caixa_Letra.setFont(font);
            }
        }else{
            if(fontsize > 8){
            fontsize = fontsize -1;
            Font font = new Font("Monospaced", 0, fontsize);
            MainGUI.Caixa_Letra.setFont(font);
            }
        }
        
    }

    private void SetLookAndFeel(String feel) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { //procura na lista de looks and feels instalados no sistema a entrada configurada(Windows)
                if (feel.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());//define a o look and feel, se encontrado.
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void Update() {//atualiza uma entrada da base de dados.
         DAOMusica edit_id = new DAOMusica();
         
         Musica edit = new Musica(
                0,
                musica_insert1.getText(),
                artista_insert1.getText(),
                Integer.parseInt(ano_insert1.getText()),
                letra_insert1.getText());
             if(edit.getArtista().isEmpty()){
                 edit.setArtista("Desconhecido");
             }
              if(edit.getNome().isEmpty()){
                 edit.setNome("Desconhecido");
             }
            edit_id.Update(id_edit, edit);
            Att_table();//Atualiza a lista.
            Close_clean();
    }
    
    public static void Help() {//mostra uma caixa de mensagem mostrando como o usuário deve interagir com o sistema
        JOptionPane.showMessageDialog(null,"Adicionar:\nClique em Adicionar para cadastrar uma nova música base de dados.\n\nDeletar:\nClique em deletar para remover uma música da base de dados\n\nEditar:\nClique em editar para alterar alguma informação cadastrada.\n\nInserindo:\nOs campos de 'Ano' e 'Letra' são obrigatórios e devem ser preenchidos. Os campos 'Artista' e 'Nome da música' podem ser deixados em branco.\nNesse caso os mesmos serão automaticamente atribuidos o valor de 'Desconhecido'.\n\nEditando:\nPara editar as informações de uma música, primeiro selecione-a na lista de músicas cadastradas, então clique em 'Editar'.\nSerá exibido uma caixa de dialogo onde você pode alterar os dados cadastrados. Clique em 'OK' para salvar as alterações, ou em 'Cancelar' para cancelar.\n\nExcluindo:\nPara excluir uma música primeiro selecione-a na lista de músicas cadastradas, então clique em 'Deletar'.\nMúsicas uma vez deletadas não podem ser recuperadas.");
        
    }
 
    
}
