package application.pizzas;

public class Pizza {

    private PizzaNome nome;
    private PizzaPreço preço;
    private PizzaSabor sabor;
    private PizzaDescrição descrição;

    public Pizza(PizzaNome nome,PizzaPreço preço,PizzaSabor sabor, PizzaDescrição descrição){
        this.nome = nome;
        this.preço = preço;
        this.sabor = sabor;
        this.descrição = descrição;
    }

    public String nome() {
        return nome.value();
    }

    public Double preço() {
        return preço.value();
    }


    public String sabor() {
        return sabor.value();
    }

    public String descrição() {
        return descrição.value();
    }

}
