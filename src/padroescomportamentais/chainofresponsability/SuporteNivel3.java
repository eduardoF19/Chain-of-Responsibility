package padroescomportamentais.chainofresponsability;

public class SuporteNivel3 extends Atendente {

    public SuporteNivel3(Atendente superior) {
        listaChamados.add(TipoChamadoSistema.getTipoChamadoSistema());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nível 3";
    }
}