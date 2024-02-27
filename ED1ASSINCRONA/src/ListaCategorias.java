public class ListaCategorias {
    private NodePrincipal primeiro;
    private int qtd;
    private NodePrincipal ultimo;

    public void adicionarCategoria(Categoria categoria) {
        NodePrincipal novoNode = new NodePrincipal(categoria);

        if (primeiro == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            NodePrincipal current = primeiro;

            while (current != null && categoria.compareTo(current.getInfo()) > 0) {
                current = current.getProx();
            }

            if (current == primeiro) {
                primeiro = novoNode.getProx();
                novoNode = primeiro.getAnte();
                primeiro = novoNode;
            } else if (current == null) {
                novoNode = ultimo.getProx();
                ultimo = novoNode.getAnte();
                ultimo = novoNode;
            } else {
                current.setAnte(novoNode.getAnte());
                current = novoNode.getProx();
                novoNode = current.getAnte().getProx();
                novoNode = current.getAnte();
            }
        }
        qtd++;
    }

    public void removerCategoria(Categoria categoria) {
        NodePrincipal current = primeiro;

        while (current != null && categoria.compareTo(current.getInfo()) != 0) {
            current = current.getProx();
        }

        if (current != null) {
            if (current == primeiro) {
                primeiro = primeiro.getProx();
                if (primeiro != null) {
                    primeiro.setAnte(null);
                } else {
                    ultimo = null;
                }
            } else if (current == ultimo) {
                ultimo = ultimo.getAnte();
                ultimo.setProx(null);
            } else {
                NodePrincipal ant = current.getAnte();
                NodePrincipal prox = current.getProx();
                ant.setProx(prox);
                prox.setAnte(ant);
            }
            qtd--;
        }
    }

    public Categoria buscarCategoria(String descricao) {
        NodePrincipal current = primeiro;

        while (current != null && !descricao.equals(current.getInfo().getDescricao())) {
            current = current.getProx();
        }

        return current.getInfo();

    }

}
