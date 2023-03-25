import java.util.EmptyStackException;

public class MockHorariosDeAtendimentoService implements HorariosDeAtendimentoService{

    @Override
    public String busca(int id) {
        switch (id) {
            case 1:
                return HorariosDeAtendimentoConst.Chris;
            case 2:
                return HorariosDeAtendimentoConst.Renzo;
            case 3:
                return HorariosDeAtendimentoConst.Marcelo;
            case 4:
                return HorariosDeAtendimentoConst.Vitor;
            case 5:
                return HorariosDeAtendimentoConst.Samuel;
            default:
                return "";
        }
    }
}
