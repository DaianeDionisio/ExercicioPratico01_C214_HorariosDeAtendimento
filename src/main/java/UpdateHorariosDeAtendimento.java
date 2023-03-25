import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UpdateHorariosDeAtendimento {
    HorariosDeAtendimentoService horariosDeAtendimentoService;

    public UpdateHorariosDeAtendimento(HorariosDeAtendimentoService service){
        this.horariosDeAtendimentoService = service;
    }

    public String buscaProfessorDoHorarioDeAtendimento(int id) {
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String nomeDoProfessor = jsonObject.get("nomeDoProfessor").getAsString();

        return nomeDoProfessor;
    }
}
