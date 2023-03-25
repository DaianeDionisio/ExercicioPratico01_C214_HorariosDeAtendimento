import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class UpdateHorariosDeAtendimento {
    HorariosDeAtendimentoService horariosDeAtendimentoService;

    public UpdateHorariosDeAtendimento(HorariosDeAtendimentoService service){
        this.horariosDeAtendimentoService = service;
    }

    public void validaNome(String nome) {
        String[] nomes = { "Chris", "Marcelo", "Vitor", "Samuel", "Renzo"};
        boolean encontrou = false;

        for (String i:nomes) {
            if (nome == i) {
                encontrou = true;
            }
        }

        if (!encontrou) throw new EmptyStackException();
    }

    public void validaId(int id) {
        if (id < 1 || id > 5) throw new EmptyStackException();
    }

    public String buscaNomeDoProfessorDoHorarioDeAtendimento(int id) {
        this.validaId(id);
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String nomeDoProfessor = jsonObject.get("nomeDoProfessor").getAsString();

        return nomeDoProfessor;
    }

    public String buscaPredioDoHorarioDeAtendimento(int id) {
        this.validaId(id);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        int sala = Integer.valueOf(jsonObject.get("sala").getAsString());
        String predio = null;

        if (sala >= 1 && sala <= 5) {
            predio = "1";
        } else if (sala >= 6 && sala <= 10){
            predio = "2";
        } else if (sala >= 11 && sala <= 15){
            predio = "3";
        } else if (sala >= 16 && sala <= 20){
            predio = "4";
        } else if (sala >= 21 && sala <= 25){
            predio = "6";
        }

        return predio;
    }

    public String buscaHorarioDoHorarioDeAtendimento(int id) {
        this.validaId(id);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String horario = jsonObject.get("horarioDeAtendimento").getAsString();

        return horario;
    }

    public String buscaPeriodoDoHorarioDeAtendimento(int id) {
        this.validaId(id);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String periodo = jsonObject.get("periodo").getAsString();

        return periodo;
    }

    public String buscaSalaDoHorarioDeAtendimento(int id) {
        this.validaId(id);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String sala = jsonObject.get("sala").getAsString();

        return sala;
    }

    public String buscaPredioDoHorarioDeAtendimentoPorNome(String nome) {
        this.validaNome(nome);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.buscaPorNome(nome);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        int sala = Integer.valueOf(jsonObject.get("sala").getAsString());
        String predio = null;

        if (sala >= 1 && sala <= 5) {
            predio = "1";
        } else if (sala >= 6 && sala <= 10){
            predio = "2";
        } else if (sala >= 11 && sala <= 15){
            predio = "3";
        } else if (sala >= 16 && sala <= 20){
            predio = "4";
        } else if (sala >= 21 && sala <= 25){
            predio = "6";
        }

        return predio;
    }

    public String buscaHorarioDoHorarioDeAtendimentoPorNome(String nome) {
        this.validaNome(nome);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.buscaPorNome(nome);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String horario = jsonObject.get("horarioDeAtendimento").getAsString();

        return horario;
    }

    public String buscaPeriodoDoHorarioDeAtendimentoPorNome(String nome) {
        this.validaNome(nome);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.buscaPorNome(nome);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String periodo = jsonObject.get("periodo").getAsString();

        return periodo;
    }

    public String buscaSalaDoHorarioDeAtendimentoPorNome(String nome) {
        this.validaNome(nome);

        String horarioDeAtendimentoJson = horariosDeAtendimentoService.buscaPorNome(nome);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String sala = jsonObject.get("sala").getAsString();

        return sala;
    }
}
