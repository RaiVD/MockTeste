
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class TesteMockito {

    @Mock
    private List<Vendedor> listaMock;

    @Test
    public void testVendedorExistente() {
        MinhaLista minhaLista = new MinhaLista(listaMock);

        Vendedor vendedorProcurado = new Vendedor("João");

        when(listaMock.contains(vendedorProcurado)).thenReturn(true);

        boolean vendedorExiste = minhaLista.verificarVendedor(vendedorProcurado);

        assertTrue(vendedorExiste);
    }

    @Test
    public void testVendedorInexistente() {
        MinhaLista minhaLista = new MinhaLista(listaMock);

        Vendedor vendedorProcurado = new Vendedor("João");

        when(listaMock.contains(vendedorProcurado)).thenReturn(false);

        boolean vendedorExiste = minhaLista.verificarVendedor(vendedorProcurado);

        assertFalse(vendedorExiste);
    }
}
