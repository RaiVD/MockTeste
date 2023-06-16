import java.util.List;

public class MinhaLista {
    private List<Vendedor> lista;

    public MinhaLista(List<Vendedor> lista) {
        this.lista = lista;
    }

    public boolean verificarVendedor(Vendedor vendedor) {
        Vendedor vendedor1 = new Vendedor("Ana Clara");
        Vendedor vendedor2 = new Vendedor("Ana Tome");
        Vendedor vendedor3 = new Vendedor("Raissa");
        lista.add(vendedor1);
        lista.add(vendedor2);
        lista.add(vendedor3);
        return lista.contains(vendedor);
    }
}