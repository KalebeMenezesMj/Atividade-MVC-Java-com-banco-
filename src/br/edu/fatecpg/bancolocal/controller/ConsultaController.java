package br.edu.fatecpg.bancolocal.controller;

import br.edu.fatecpg.bancolocal.model.Banco;
import br.edu.fatecpg.bancolocal.model.Consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultaController {

    public String inserirConsulta(String nomePaciente, String data, String hora) {

        String query = "INSERT INTO tb_consulta(nm_paciente, dt_consulta, hr_consulta) VALUES(?,?,?)";

        try (var conexao = Banco.conectar()) {
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, nomePaciente);
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.execute();
            return "Gravado Com Sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
        public String selecionarConsultas(){

            String query = "SELECT * FROM tb_consulta";
            List<Consulta> consultas = new ArrayList<>();
            try(var conexao = Banco.conectar()){
                PreparedStatement stmt = conexao.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()){
                    consultas.add(new Consulta(rs.getString("nm_paciente"),
                            rs.getString("dt_consulta"),
                            rs.getString("hr_consulta")));

                }
                return consultas.toString();
            }catch (Exception e){
                return e.getMessage();
            }
        }
}