package application.pizzas;

public record PizzaDescrição(String value) {
    public PizzaDescrição {
        if (value.length() < 60) {
            throw new RuntimeException("A descrição deve ter no mínimo 60 caracteres");
        }
    }
}
