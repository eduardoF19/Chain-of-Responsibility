package padroescomportamentais.chainofresponsability;

public class SuporteNivel2 extends Atendente {

    public SuporteNivel2(Atendente superior) {
        listaChamados.add(TipoChamadoRede.getTipoChamadoRede());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Suporte Nível 2";
    }
}