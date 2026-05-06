package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    @Test
    void deveSerResolvidoPeloNivel1() {
        Atendente especialista = new Especialista(null);
        Atendente nivel3 = new SuporteNivel3(especialista);
        Atendente nivel2 = new SuporteNivel2(nivel3);
        Atendente nivel1 = new SuporteNivel1(nivel2);

        Chamado chamado = new Chamado(TipoChamadoSenha.getTipoChamadoSenha());
        assertEquals("Suporte Nível 1", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveSerResolvidoPeloNivel2() {
        Atendente especialista = new Especialista(null);
        Atendente nivel3 = new SuporteNivel3(especialista);
        Atendente nivel2 = new SuporteNivel2(nivel3);
        Atendente nivel1 = new SuporteNivel1(nivel2);

        Chamado chamado = new Chamado(TipoChamadoRede.getTipoChamadoRede());
        assertEquals("Suporte Nível 2", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveSerResolvidoPeloNivel3() {
        Atendente especialista = new Especialista(null);
        Atendente nivel3 = new SuporteNivel3(especialista);
        Atendente nivel2 = new SuporteNivel2(nivel3);
        Atendente nivel1 = new SuporteNivel1(nivel2);

        Chamado chamado = new Chamado(TipoChamadoSistema.getTipoChamadoSistema());
        assertEquals("Suporte Nível 3", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveSerResolvidoPeloEspecialista() {
        Atendente especialista = new Especialista(null);
        Atendente nivel3 = new SuporteNivel3(especialista);
        Atendente nivel2 = new SuporteNivel2(nivel3);
        Atendente nivel1 = new SuporteNivel1(nivel2);

        Chamado chamado = new Chamado(TipoChamadoCritico.getTipoChamadoCritico());
        assertEquals("Especialista", nivel1.resolverChamado(chamado));
    }

    @Test
    void deveNaoSerResolvido() {
        Atendente especialista = new Especialista(null);
        Atendente nivel3 = new SuporteNivel3(especialista);
        Atendente nivel2 = new SuporteNivel2(nivel3);
        Atendente nivel1 = new SuporteNivel1(nivel2);

        Chamado chamado = new Chamado(TipoChamadoFinanceiro.getTipoChamadoFinanceiro());
        assertEquals("Chamado não resolvido", nivel1.resolverChamado(chamado));
    }
}