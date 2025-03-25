import Interfaces.Contrato;
import Interfaces.FabricaAbstrata;
import Interfaces.Procuracao;

public class Cliente {
    private Procuracao procuracao = null;
    private Contrato contrato = null;

    public Cliente(FabricaAbstrata fabrica) {
        this.procuracao = fabrica.criarProcuracao();
        this.contrato = fabrica.criarContrato();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }
}
