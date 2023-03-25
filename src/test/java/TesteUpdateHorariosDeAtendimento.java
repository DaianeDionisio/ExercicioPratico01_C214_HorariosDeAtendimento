import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteUpdateHorariosDeAtendimento {
    HorariosDeAtendimentoService service;
    UpdateHorariosDeAtendimento updateHorariosDeAtendimento;

    @Before
    public void setup() {
        service = new MockHorariosDeAtendimentoService();
        updateHorariosDeAtendimento = new UpdateHorariosDeAtendimento(service);
    }

    @Test
    public void buscaProfessorDoHorarioDeAtendimentoProfessorChris() {
        String nomeDoProfessor = updateHorariosDeAtendimento.buscaProfessorDoHorarioDeAtendimento(1);
        assertEquals("Chris", nomeDoProfessor);
    }

    @Test
    public void buscaPredioDoHorarioDeAtendimentoProfessorChris() {
        String predioDoAtendimento = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(1);
        assertEquals("2", predioDoAtendimento);
    }

}
