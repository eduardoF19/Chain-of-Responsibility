package padroescomportamentais.chainofresponsability;

public class Especialista extends Atendente {

    public Especialista(Atendente superior) {
        listaChamados.add(TipoChamadoCritico.getTipoChamadoCritico());
        setSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Especialista";
    }
}
