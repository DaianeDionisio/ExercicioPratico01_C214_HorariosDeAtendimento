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

    public String buscaPredioDoHorarioDeAtendimento(int id) {
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
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String horario = jsonObject.get("horarioDeAtendimento").getAsString();

        return horario;
    }

    public String buscaPeriodoDoHorarioDeAtendimento(int id) {
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String periodo = jsonObject.get("periodo").getAsString();

        return periodo;
    }

    public String buscaSalaDoHorarioDeAtendimento(int id) {
        String horarioDeAtendimentoJson = horariosDeAtendimentoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioDeAtendimentoJson).getAsJsonObject();

        String sala = jsonObject.get("sala").getAsString();

        return sala;
    }


}
