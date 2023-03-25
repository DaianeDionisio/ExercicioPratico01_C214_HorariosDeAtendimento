import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

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
    public void buscaNomeDoProfessorDoHorarioDeAtendimentoProfessorChris() {
        String nomeDoProfessor = updateHorariosDeAtendimento.buscaNomeDoProfessorDoHorarioDeAtendimento(1);
        assertEquals("Chris", nomeDoProfessor);
    }

    @Test
    public void buscaPredioDoHorarioDeAtendimentoProfessorChris() {
        String predioDoAtendimento = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(1);
        assertEquals("2", predioDoAtendimento);
    }

    @Test
    public void buscaHorarioDoHorarioDeAtendimentoProfessorRenzo() {
        String predioDoAtendimento = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(1);
        assertEquals("2", predioDoAtendimento);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaPredioDoHorarioDeAtendimentoComIdInvalido() {
        String predioDoAtendimento = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(2);
    }

}
