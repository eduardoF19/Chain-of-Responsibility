package padroescomportamentais.chainofresponsability;

public class SuporteNivel1 extends Atendente {

    public SuporteNivel1(Atendente superior) {
        listaChamados.add(TipoChamadoSenha.getTipoChamadoSenha());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nível 1";
    }
}
