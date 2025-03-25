package PessoaJuridica;
import Interfaces.FabricaAbstrata;
import Interfaces.Procuracao;
import Interfaces.Contrato;

public class FabricaPessoaJuridica implements FabricaAbstrata {

    public FabricaPessoaJuridica(){}
    private FabricaPessoaJuridica instance = new FabricaPessoaJuridica();
    public FabricaPessoaJuridica getInstance(){
        return instance;
    }

    public Procuracao criarProcuracao(){
        return new ProcuracaoPessoaJuridica();
    }

    public Contrato criarContrato(){
        return new ContratoPessoaJuridica();
    }
}

