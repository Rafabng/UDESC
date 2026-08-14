package br.udesc.doo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void geraRetangulo(){
        retangulo = new Retangulo(2, 3);
    }

    @Test
    void testGetBase(Retangulo retangulo) {
        assertEquals(2, retangulo.getBase());
    }

    @Test
    void testGetAltura(Retangulo retangulo) {
        assertEquals(3, retangulo.getAltura());
    }

    @Test
    void testGetArea(Retangulo retangulo) {
        assertEquals(6, retangulo.getArea());
    }

}
