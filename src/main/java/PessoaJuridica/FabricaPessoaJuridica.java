package PessoaJuridica;
import Interfaces.FabricaAbstrata;
import Interfaces.Procuracao;
import Interfaces.Contrato;

public class FabricaPessoaJuridica implements FabricaAbstrata {

    private FabricaPessoaJuridica(){}
    private static FabricaPessoaJuridica instance = new FabricaPessoaJuridica();
    public static FabricaPessoaJuridica getInstance(){
        return instance;
    }

    public Procuracao criarProcuracao(){
        return new ProcuracaoPessoaJuridica();
    }

    public Contrato criarContrato(){
        return new ContratoPessoaJuridica();
    }
}

