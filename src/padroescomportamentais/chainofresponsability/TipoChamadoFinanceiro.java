package padroescomportamentais.chainofresponsability;

public class TipoChamadoFinanceiro implements TipoChamado {

    private static TipoChamadoFinanceiro tipoChamadoFinanceiro = new TipoChamadoFinanceiro();

    private TipoChamadoFinanceiro() {}

    public static TipoChamadoFinanceiro getTipoChamadoFinanceiro() {
        return tipoChamadoFinanceiro;
    }
}