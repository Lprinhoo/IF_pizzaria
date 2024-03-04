package application.pizzas;

public record PizzaNome(String value) {
    public PizzaNome {
        if (value.length() < 20) {
            throw new RuntimeException("O nome da pizza deve ter no máximo 20 caracteres");
        }
    }
}
