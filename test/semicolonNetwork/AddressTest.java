package semicolonNetwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    Address address;

    @BeforeEach
    void setUp() {
        address = new Address("Nigeria", "Lagos", "Oseni Fatona", 30);
    }

    @Test
    void testThatAddressHasCountryName(){
        address.setCountryName();
        assertEquals("Nigeria", address.getCountryName());
    }

    @Test
    void testThatAddressHasCityName(){
        address.setCityName();
        assertEquals("Lagos", address.getCityName());
    }

    @Test
    void testThatAddressHasStreetName(){
        address.setStreetName();
        assertEquals("Oseni Fatona", address.getStreetName());
    }

    @Test
    void testThatAddressHasHouseNumber(){
        address.setHouseNumber();
        assertEquals(30, address.getHouseNumber());
    }
}