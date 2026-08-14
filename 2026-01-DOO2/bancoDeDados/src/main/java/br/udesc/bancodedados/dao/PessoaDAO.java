/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.bancodedados.dao;

import br.udesc.bancodedados.connections.Conexao;
import br.udesc.bancodedados.model.Pessoa;
import br.udesc.bancodedados.repository.IPessoaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class PessoaDAO implements IPessoaDao{
    private void createTable(){
        Connection connection = Conexao.conectar();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS PESSOA"
                + " (id         INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"  cpf        VARCHAR(14) UNIQUE, "
                +"  nome    VARCHAR(255))";
        
        Statement stmt = null;
        try{
            stmt = connection.createStatement();
            stmt.execute(sqlCreate);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
           // Conexao.desconectar();
        }
    }

    @Override
    public boolean gravar(Pessoa p) {
        String sql=
                "INSERT INTO pessoa (nome, cpf)"
                +" VALUES(?,?)";
        try{
            Connection con=
                    Conexao.conectar();
            PreparedStatement stmt =
                    con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCPF());
            stmt.executeUpdate();
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Pessoa buscar(String CPF) {
        String sql=
                "SELECT * FROM pessoa WHERE cpf = ?";
        try{
            Connection con = Conexao.conectar();
            PreparedStatement stmt=
                    con.prepareStatement(sql);
            stmt.setString(1, CPF);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                Pessoa p=new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCPF(rs.getString("cpf"));
                return p;
             }
         } catch(Exception e){ 
             e.printStackTrace();
         }
        return null;
    }

    @Override
    public boolean apagar(Pessoa p) {
        String sql= 
                "DELETE FROM pessoa WHERE cpf = ?"; 
        try{ 
            Connection con = Conexao.conectar(); 
            PreparedStatement stmt= 
                    con.prepareStatement(sql); 
            stmt.setString(1, p.getCPF()); 
            stmt.executeUpdate(); 
            return true; 
        } 
        catch(Exception e){ 
            e.printStackTrace(); 
            return false; 
        }    
    }

    @Override
    public List<Pessoa> buscarTodas() {
        List<Pessoa>pessoas= 
                new ArrayList<>();
        String sql="SELECT * FROM pessoa"; 
        try{ 
            Connection con =Conexao.conectar(); 
            Statement stmt = 
                    con.createStatement(); 
            ResultSet rs= 
                    stmt.executeQuery(sql); 
            while(rs.next()){ 
                Pessoa p=new Pessoa(); 
                p.setId(rs.getInt("id")); 
                p.setNome(rs.getString("nome")); 
                p.setCPF(rs.getString("cpf")); 
                pessoas.add(p); 
            } 
        } catch(Exception e){ 
            e.printStackTrace();
            return null;
        }    
        return pessoas;
    }
}
