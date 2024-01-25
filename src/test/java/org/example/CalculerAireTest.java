package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculerAireTest {

    @Test
    public void testAireWithEmptyList() {
        CalculerAire calculerAire = new CalculerAire();
        List<FormeFacade> formes = new ArrayList<>();
        double result = calculerAire.aire(formes);
        assertEquals(0, result, 0.0001); // Assuming the result should be 0 for an empty list
    }

    @Test
    public void testAireWithNonEmptyList() {
        // Mocking FormeFacade objects for testing
        FormeFacade mockForme1 = mock(FormeFacade.class);
        FormeFacade mockForme2 = mock(FormeFacade.class);

        // Mocking the behavior of aire() method for the mocked objects
        when(mockForme1.aire()).thenReturn(5.0);
        when(mockForme2.aire()).thenReturn(10.0);

        CalculerAire calculerAire = new CalculerAire();
        List<FormeFacade> formes = List.of(mockForme1, mockForme2);

        double result = calculerAire.aire(formes);
        assertEquals(15.0, result, 0.0001); // Adjust the expected value based on your logic
    }

    // New test method specifically for the aire method
    @Test
    public void testAireWithDifferentFormes() {
        FormeFacade mockForme1 = mock(FormeFacade.class);
        FormeFacade mockForme2 = mock(FormeFacade.class);

        // Mocking the behavior of aire() method for the mocked objects
        when(mockForme1.aire()).thenReturn(7.0);
        when(mockForme2.aire()).thenReturn(12.0);

        CalculerAire calculerAire = new CalculerAire();
        List<FormeFacade> formes = List.of(mockForme1, mockForme2);

        double result = calculerAire.aire(formes);
        assertEquals(19.0, result, 0.0001); // Adjust the expected value based on your logic
    }
    @Test
    public void testAireWithSquare() {
        // Créer un mock pour la classe Carre
        Rectangle rectangleMock = mock(Rectangle.class);

        // Définir le comportement du mock pour la méthode aire() du carré
        when(rectangleMock.aire()).thenReturn(4.0);

        // Créer une instance de CalculerAire
        CalculerAire calculerAire = new CalculerAire();

        // Créer une liste de formes avec le carré mock
        List<FormeFacade> formes = List.of(rectangleMock);

        // Appeler la méthode aire() de CalculerAire avec la liste de formes
        double result = calculerAire.aire(formes);

        // Vérifier que l'appel à la méthode aire() du carré a été réalisé
        verify(rectangleMock, times(1)).aire();

        // Vérifier le résultat
        assertEquals(4.0, result, 0.0001); // Adjust the expected value based on your logic
    }
    @Test
    public void testAireWithCarreForm() {
        // Créer un mock pour une forme inconnue (une forme qui n'est pas définie dans votre application)
        FormeFacade carreMock = mock(FormeFacade.class);

        // Définir le comportement du mock pour la méthode aire() de la forme inconnue
        when(carreMock.aire()).thenReturn((Double) Double.valueOf(4)); // Supposons que la forme inconnue a une aire de 4

        // Créer une instance de CalculerAire
        CalculerAire calculerAire = new CalculerAire();

        // Créer une liste de formes avec la forme inconnue mock
        List<FormeFacade> formes = List.of(carreMock);

        // Appeler la méthode aire() de CalculerAire avec la liste de formes
        double result = calculerAire.aire(formes);

        // Vérifier le résultat
        assertEquals((Double) Double.valueOf(4), result, 0.0001); // Adjust the expected value based on your logic
    }
}