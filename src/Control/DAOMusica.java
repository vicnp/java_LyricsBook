package Control;

import Model.Musica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Nascimento
 */
public class DAOMusica {
    
    public void Insert(Musica musica){//insere uma entrada na base de dados
        String SQL = "INSERT INTO musica values(?,?,?,?,?)"; //SQL para ser executada pelo banco
        Connection com =  ConnectionFactory.getConnection(); //cria a conexão com o banco de dados
        PreparedStatement stmt = null;
        
        try{
            stmt = com.prepareStatement(SQL); // prepara a linha sql para ser enviada
            stmt.setInt(1, 0);//define o parametro 1(?) como 0
            stmt.setString(2, musica.getNome()); //define o parametro 2?) como musica.getNome(Nome da musica)
            stmt.setString(3, musica.getArtista());
            stmt.setInt   (4, musica.getAno());
            stmt.setString(5, musica.getLetra());
            stmt.executeUpdate();//executa o comando sql
            
        }catch(SQLException e){
            System.err.println("Inser Error+"+e);
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir o item selecionado da base de dados.");
            
        }finally{
            ConnectionFactory.closeConnection(com, stmt);//fecha a cone
        }
    }
    
    public void Delete(int id){
            System.out.println("ID:"+id);
            String sql = "DELETE FROM musica WHERE id = ?";
            Connection com =  ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            try{
                stmt = com.prepareStatement(sql);
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possivel remover o item selecionado da base de dados.");
            }finally{
                ConnectionFactory.closeConnection(com, stmt);
            }
    }
    
    public void Update(int id, Musica m){
     String SQL = "UPDATE musica SET nome_musica = ?, artista = ?, ano = ?, lyric = ? where id = ?";
        Connection com =  ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try{
            stmt = com.prepareStatement(SQL);
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getArtista());
            stmt.setInt   (3, m.getAno());
            stmt.setString(4, m.getLetra());
            stmt.setInt   (5, id);
            stmt.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi atualizar o item selecionado na base de dados.");
        }finally{
            ConnectionFactory.closeConnection(com, stmt);
        }
    
    }
    
    public ArrayList<Musica> SelectAll(){//recupera todas as linhas da tabela do bancos de dados, as acumula em uma lista e as retorna.
        String SQL = "SELECT * FROM musica";
        Connection com =  ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Musica> musica = new ArrayList<>();
        
        try {
            stmt = com.prepareStatement(SQL);
            rs = stmt.executeQuery();
            musica.clear();
            while(rs.next()){
                Musica p = new Musica(
                        rs.getInt("id"),
                        rs.getString("nome_musica"),
                        rs.getString("artista"),
                        rs.getInt("ano"),
                        rs.getString("lyric")
                        );
                        musica.add(p);
            }   
            }catch(SQLException e){
        
            }finally{
               ConnectionFactory.closeConnection(com, stmt, rs);
            }
        return musica;
    }
}