package PessoaFisica;
import Interfaces.FabricaAbstrata;
import Interfaces.Procuracao;
import Interfaces.Contrato;

public class FabricaPessoaFisica implements FabricaAbstrata {

    private FabricaPessoaFisica(){}
    private static FabricaPessoaFisica instance = new FabricaPessoaFisica();
    public static FabricaPessoaFisica getInstance(){
        return instance;
    }

    public Procuracao criarProcuracao(){
        return new ProcuracaoPessoaFisica();
    }

    public Contrato criarContrato(){
        return new ContratoPessoaFisica();
    }
}

