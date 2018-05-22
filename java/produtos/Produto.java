class Produto{
    String nome;
    String tipo;
    int quantidade;
    int codigo;
    double valor;

    //CONSTRUTORES

    Produto(int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;

    }

    Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    //FUNÇÕES

    void vender(int quantidade){
        if(quantidade > this.quantidade){
            this.quantidade -= quantidade;
            System.out.println("Valor total: " + quantidade * valor);
        }else{
            System.out.println("Não há estoque suficiente");
        }
    }

    void comprar(int quantidade){
        this.quantidade+=quantidade;
    }

    void comprar(int quantidade, double valor){
        this.quantidade+=quantidade;
        this.valor+=valor;
    }

    void consultar(){
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor: " + valor);
        System.out.println();
    }

    void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    boolean igual(Produto p){
        return (this.nome == p.nome && this.tipo == p.tipo) ? true : false;
    }

}
