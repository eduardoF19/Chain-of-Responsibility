package padroescomportamentais.chainofresponsability;

public class TipoChamadoSistema implements TipoChamado {

    private static TipoChamadoSistema tipoChamadoSistema = new TipoChamadoSistema();

    private TipoChamadoSistema() {}

    public static TipoChamadoSistema getTipoChamadoSistema() {
        return tipoChamadoSistema;
    }
}