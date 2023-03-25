import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UpdateHorariosDeAtendimento {
    HorariosDeAtendimentoService horariosDeAtendimentoService;

    public UpdateHorariosDeAtendimento(HorariosDeAtendimentoService service){
        this.horariosDeAtendimentoService = service;
    }

    public JsonObject buscaHorarioDeAtendimento(int id) {
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        return jsonObject;
    }
}
