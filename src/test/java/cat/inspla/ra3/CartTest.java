package cat.inspla.ra3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @Test
    void TODO_cartNovaTeTotalZero() {
        assertEquals(0.0, cart.getTotal());
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void afegirArticleIncrementaTotal() {
        cart.addItem("Llibre", 10.0);
        assertEquals(10.0, cart.getTotal());
        assertEquals(1, cart.getItemCount());
    }

    @Test
    void clearDeixaCistellaBuida() {
        cart.addItem("Cafè", 2.5);
        cart.addItem("Galetes", 3.0);

        cart.clear();

        assertEquals(0.0, cart.getTotal());
        assertEquals(0, cart.getItemCount());
    }

}
