import Interfaces.FabricaAbstrata;
import PessoaFisica.FabricaPessoaFisica;
import PessoaJuridica.FabricaPessoaJuridica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração para Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração para Pessoa Jurídica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato para Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato para Pessoa Jurídica", cliente.emitirContrato());
    }
}
