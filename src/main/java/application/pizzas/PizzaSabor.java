package application.pizzas;

public record PizzaSabor(String value) {
    public PizzaSabor {
        if (value.length() < 20) {
            throw new RuntimeException("Esse sabor é Inválido");
        }

    }
}
