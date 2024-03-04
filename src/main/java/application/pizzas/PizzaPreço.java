package application.pizzas;

public record PizzaPreço(Double value) {
    public PizzaPreço {
        if (value < 60) {
            throw new RuntimeException("O preço da pizza não deve passar de R$60,00");
        }
    }
}
