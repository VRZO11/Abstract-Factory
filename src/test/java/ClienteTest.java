import Interfaces.FabricaAbstrata;
import PessoaFisica.FabricaPessoaFisica;
import PessoaJuridica.FabricaPessoaJuridica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirProcuracaoPessoaFisica() {
        FabricaAbstrata fabrica = FabricaPessoaFisica.getInstance();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração pessoa física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica() {
        FabricaAbstrata fabrica = FabricaPessoaJuridica.getInstance();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração pessoa juridica", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = FabricaPessoaFisica.getInstance();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato pessoa fisica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = FabricaPessoaJuridica.getInstance();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato pessoa juridica", cliente.emitirContrato());
    }
}
