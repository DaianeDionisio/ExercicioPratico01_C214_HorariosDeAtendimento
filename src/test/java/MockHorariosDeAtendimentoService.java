public class MockHorariosDeAtendimentoService implements HorariosDeAtendimentoService{

    @Override
    public String busca(int id) {
        if (id == 1) {
            return HorariosDeAtendimentoConst.Chris;
        }
        return null;
    }
}
