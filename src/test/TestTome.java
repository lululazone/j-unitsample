import org.junit.jupiter.api.Test;

import main.OnlineLibrary;



public class TestTome {
    /*
     * Test the amountTome method
     */
    @Test
    public void testAmountSeriesAllEqual() {
        // Étant donné : création d'une instance de OnlineLibrary
        OnlineLibrary onlineLibrary = new OnlineLibrary();
        
        // Lorsque : appel de amountSeries() avec des valeurs égales
        int result = onlineLibrary.amountSeries(5, 5, 5, 5, 5);
        
        // Alors : vérification que le résultat est 25
        assertEquals(25, result, "La somme des éléments devrait être 25");
    }

}
