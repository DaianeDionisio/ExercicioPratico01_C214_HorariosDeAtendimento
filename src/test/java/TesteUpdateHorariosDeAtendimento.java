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

    //Sucesso
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
        String horario = updateHorariosDeAtendimento.buscaHorarioDoHorarioDeAtendimento(2);
        assertEquals("10:00", horario);
    }

    @Test
    public void buscaPeriodoDoHorarioDeAtendimentoProfessorRenzo() {
        String periodo = updateHorariosDeAtendimento.buscaPeriodoDoHorarioDeAtendimento(2);
        assertEquals("Integral", periodo);
    }

    @Test
    public void buscaSalaDoHorarioDeAtendimentoProfessorMarcelo() {
        String sala = updateHorariosDeAtendimento.buscaSalaDoHorarioDeAtendimento(3);
        assertEquals("18", sala);
    }

    @Test
    public void buscaNomeDoProfessorDoHorarioDeAtendimentoProfessorMarcelo() {
        String nomeDoProfessor = updateHorariosDeAtendimento.buscaNomeDoProfessorDoHorarioDeAtendimento(3);
        assertEquals("Marcelo", nomeDoProfessor);
    }

    @Test
    public void buscaPredioDoHorarioDeAtendimentoProfessorVitor() {
        String predio = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(4);
        assertEquals("1", predio);
    }

    @Test
    public void buscaSalaDoHorarioDeAtendimentoProfessorVitor() {
        String sala = updateHorariosDeAtendimento.buscaSalaDoHorarioDeAtendimento(4);
        assertEquals("3", sala);
    }

    @Test
    public void buscaPeriodoDoHorarioDeAtendimentoProfessorSamuel() {
        String periodo = updateHorariosDeAtendimento.buscaPeriodoDoHorarioDeAtendimento(5);
        assertEquals("Integral", periodo);
    }

    @Test
    public void buscaHorarioDoHorarioDeAtendimentoProfessorSamuel() {
        String horario = updateHorariosDeAtendimento.buscaHorarioDoHorarioDeAtendimento(5);
        assertEquals("08:00", horario);
    }


    //Falha
    @Test(expected = EmptyStackException.class)
    public void buscaPredioDoHorarioDeAtendimentoComIdInvalido() {
        String predioDoAtendimento = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimento(-1);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaSalaDoHorarioDeAtendimentoComIdInvalido() {
        String sala = updateHorariosDeAtendimento.buscaSalaDoHorarioDeAtendimento(0);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaPeriodoDoHorarioDeAtendimentoComIdInvalido() {
        String periodoDoHorarioDeAtendimento = updateHorariosDeAtendimento.buscaPeriodoDoHorarioDeAtendimento(6);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaHorarioDoHorarioDeAtendimentoComIdInvalido() {
        String horario = updateHorariosDeAtendimento.buscaHorarioDoHorarioDeAtendimento(7);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaNomeDoProfessorDoHorarioDeAtendimentoComIdInvalido() {
        String horario = updateHorariosDeAtendimento.buscaNomeDoProfessorDoHorarioDeAtendimento(8);
    }

    @Test(expected = EmptyStackException.class)
    public void buscaPredioDoHorarioDeAtendimentoComNomeInvalido() {
        String predio = updateHorariosDeAtendimento.buscaPredioDoHorarioDeAtendimentoPorNome("João");
    }

    @Test(expected = EmptyStackException.class)
    public void buscaHorarioDoHorarioDeAtendimentoComNomeInvalido() {
        String horario = updateHorariosDeAtendimento.buscaHorarioDoHorarioDeAtendimentoPorNome("Diego");
    }

    @Test(expected = EmptyStackException.class)
    public void buscaPeriodoDoHorarioDeAtendimentoComNomeInvalido() {
        String periodo = updateHorariosDeAtendimento.buscaPeriodoDoHorarioDeAtendimentoPorNome("Laura");
    }

    @Test(expected = EmptyStackException.class)
    public void buscaSalaDoHorarioDeAtendimentoComNomeInvalido() {
        String sala = updateHorariosDeAtendimento.buscaSalaDoHorarioDeAtendimentoPorNome("Daiane");
    }
}
