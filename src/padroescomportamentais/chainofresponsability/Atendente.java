package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaChamados = new ArrayList();
    private Atendente superior;

    public Atendente getSuperior() {
        return superior;
    }

    public void setSuperior(Atendente superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoNivel();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        } else {
            if (superior != null) {
                return superior.resolverChamado(chamado);
            } else {
                return "Chamado não resolvido";
            }
        }
    }
}