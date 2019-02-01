package application;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void calcuStackTester() {
        Calculator calculadora = new ImpCalculadora(); // MyClass is tested
        Stack<String> vector = new StackImp();
        // assert statements
        //Aqu� se ejecutara nuestro test.
        
        assertEquals(0, vector.size(), "Se debe verificar que el vector inicie vac�o.");
        assertEquals(true, vector.empty(), "Se debe verificar que el vector inicie vac�o.");
        assertEquals(true, vector.empty(), "Se debe verificar que el vector inicie vac�o.");
        assertEquals(true, vector.empty(), "Se debe verificar que el vector inicie vac�o.");
        vector.push("10");
        vector.push("5");
        int num2=Integer.parseInt(vector.pop());
        int num1= Integer.parseInt(vector.pop());
        int suma=calculadora.Calculate(num1,num2 , "+");
        int resta=calculadora.Calculate(num1,num2 , "-");
        int division=calculadora.Calculate(num1,num2 , "/");
        int multiplicacion=calculadora.Calculate(num1,num2 , "*");
        assertEquals(15, suma, "Se debe verificar que el resultado de la suma sea 15 y que funcione");
        assertEquals(-5, resta, "Se debe verificar que el resultado de la resta sea 5 y que funcione");
        assertEquals(2, division, "Se debe verificar que el resultado de la division sea 2 y que funcione");
        assertEquals(50, multiplicacion, "Se debe verificar que el resultado de la multiplicacion sea 50 y que funcione");
    }
}