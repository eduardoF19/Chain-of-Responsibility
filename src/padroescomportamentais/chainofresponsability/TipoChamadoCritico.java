package padroescomportamentais.chainofresponsability;

public class TipoChamadoCritico implements TipoChamado {

    private static TipoChamadoCritico tipoChamadoCritico = new TipoChamadoCritico();

    private TipoChamadoCritico() {}

    public static TipoChamadoCritico getTipoChamadoCritico() {
        return tipoChamadoCritico;
    }
}