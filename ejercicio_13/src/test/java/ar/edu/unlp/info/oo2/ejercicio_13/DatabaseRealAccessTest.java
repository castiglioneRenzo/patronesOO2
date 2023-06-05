package ar.edu.unlp.info.oo2.ejercicio_13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new ProxyDB();
    }

    @DisplayName("Not logged GetSearchResults")
    @Test
    void testGetSearchResults() {
        assertEquals(null, this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.database.getSearchResults("select * from comics where id=10"));
    }

    @DisplayName("Not logged InsertRow")
    @Test
    void testInsertNewRow() {
        assertEquals(0, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @DisplayName("Logged GetSearchResults")
    @Test
    void testGetSearchResultsLogged() {
    	ProxyDB db = (ProxyDB) database;
    	db.authenticate("pepito");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @DisplayName("Logged InsertRow")
    @Test
    void testInsertNewRowLogged() {
    	ProxyDB db = (ProxyDB) database;
    	db.authenticate("pepito");
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
}