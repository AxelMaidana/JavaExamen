### Introducción a la Programación Orientada a Objetos (POO)

La Programación Orientada a Objetos (POO) es un paradigma de programación que se centra en el uso de "objetos" para diseñar aplicaciones y programas. A diferencia de la programación estructurada que se basa en procedimientos o funciones, la POO organiza el código en torno a objetos que agrupan datos y comportamientos.

### Conceptos Básicos de POO

1. **Clases y Objetos**:
    - **Clase**: Es una plantilla o modelo que define las características y comportamientos que tendrán los objetos creados a partir de ella. Por ejemplo, si creas una clase llamada `Coche`, esta puede tener atributos como `color` y `marca`, y métodos como `acelerar` y `frenar`.
    - **Objeto**: Es una instancia concreta de una clase. Siguiendo el ejemplo anterior, un objeto sería un coche específico, como un coche rojo de la marca Toyota. Cada objeto tiene su propio conjunto de valores para los atributos definidos en la clase.
2. **Principios de la POO**:
    - **Abstracción**: Consiste en ocultar los detalles complejos y mostrar solo la información esencial. Es como una receta de cocina que te dice los pasos esenciales sin entrar en los detalles complicados de cada ingrediente.
    - **Encapsulamiento**: Es la práctica de mantener los datos y métodos dentro de una clase privados y accesibles solo a través de métodos públicos. Esto es como una caja fuerte donde solo puedes interactuar con ella a través de una combinación específica.
    - **Herencia**: Permite que una clase (subclase) herede atributos y métodos de otra clase (superclase). Esto es similar a la herencia biológica donde una persona hereda características de sus padres.
    - **Polimorfismo**: Significa que objetos de diferentes clases pueden ser tratados de manera uniforme a través de una interfaz común, pero pueden responder de diferentes formas. Es como tener una misma función de “imprimir” que funciona de manera diferente si se imprime una foto, un documento o una página web.

### Beneficios de la POO

1. **Reusabilidad**: Puedes reutilizar las clases y los objetos en diferentes programas, lo que ahorra tiempo y esfuerzo en la codificación.
2. **Mantenibilidad**: El código es más fácil de mantener y actualizar, ya que las modificaciones en una clase no afectan necesariamente a otras.
3. **Modularidad**: El código está organizado en módulos o clases independientes, lo que facilita la gestión y comprensión.
4. **Escalabilidad**: Permite la ampliación y modificación de aplicaciones grandes de manera más sencilla y estructurada.

### Diferencias con la Programación Estructurada

La programación estructurada se centra en la lógica y las funciones, donde los datos y las funciones están separados. Un ejemplo de lenguaje estructurado es C. En cambio, la POO integra datos y métodos en objetos y se enfoca en la interacción entre estos objetos. Por ejemplo, en Java, los datos y métodos están encapsulados dentro de las clases y objetos.

### **Ejemplos Prácticos del PDF "01 Introducción a la POO"**

### **1. Clase `Persona`**

```java
javaCopiar código
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

```

**Uso de la Clase `Persona`**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        persona1.mostrarInfo();  // Output: Nombre: Ana, Edad: 25
    }
}

```

### **2. Clase `Coche`**

```java
javaCopiar código
public class Coche {
    private String marca;
    private String modelo;
    private int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

```

**Uso de la Clase `Coche`**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        miCoche.mostrarDetalles();  // Output: Marca: Toyota, Modelo: Corolla, Año: 2020
    }
}

```

### **3. Clase `Animal` y `Perro` con Herencia**

```java
javaCopiar código
class Animal {
    public void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public void sonido() {
        System.out.println("El perro ladra");
    }
}

```

**Uso de la Herencia**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();

        miAnimal.sonido();  // Output: El animal hace un sonido
        miPerro.sonido();   // Output: El perro ladra
    }
}

```

### **4. Clase Abstracta `Forma` y Subclases `Circulo` y `Rectangulo`**

```java
javaCopiar código
abstract class Forma {
    abstract void dibujar();
}

class Circulo extends Forma {
    void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class Rectangulo extends Forma {
    void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}

```

**Uso de Clases Abstractas**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Forma miCirculo = new Circulo();
        Forma miRectangulo = new Rectangulo();

        miCirculo.dibujar();    // Output: Dibujando un círculo
        miRectangulo.dibujar(); // Output: Dibujando un rectángulo
    }
}

```

### **5. Sobrecarga de Métodos en la Clase `Calculadora`**

```java
javaCopiar código
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

```

**Uso de la Sobrecarga de Métodos**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.sumar(2, 3);      // Output: 5
        int resultado2 = calc.sumar(2, 3, 4);   // Output: 9

        System.out.println("Suma de 2 y 3: " + resultado1);
        System.out.println("Suma de 2, 3 y 4: " + resultado2);
    }
}

```

### **6. Uso de la Palabra Clave `this`**

```java
javaCopiar código
public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre del estudiante: " + this.nombre);
    }
}

```

**Uso de `this` en Métodos**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos");
        estudiante.mostrarNombre(); // Output: Nombre del estudiante: Carlos
    }
}

```

### **7. Polimorfismo con Interfaces `Vehiculo` y Clases `Coche` y `Bicicleta`**

```java
javaCopiar código
interface Vehiculo {
    void mover();
}

class Coche implements Vehiculo {
    public void mover() {
        System.out.println("El coche se mueve a través de un motor");
    }
}

class Bicicleta implements Vehiculo {
    public void mover() {
        System.out.println("La bicicleta se mueve pedaleando");
    }
}

```

**Uso del Polimorfismo**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo;

        miVehiculo = new Coche();
        miVehiculo.mover();  // Output: El coche se mueve a través de un motor

        miVehiculo = new Bicicleta();
        miVehiculo.mover();  // Output: La bicicleta se mueve pedaleando
    }
}

```

### **8. Encapsulamiento en la Clase `CuentaBancaria`**

```java
javaCopiar código
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        }
    }

    public double obtenerSaldo() {
        return this.saldo;
    }
}

```

**Uso del Encapsulamiento**

```java
javaCopiar código
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);

        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());  // Output: Saldo actual: 1300.0
    }
}

```
    

### Conclusión

La POO es una forma poderosa y efectiva de organizar y estructurar el código, especialmente en proyectos grandes y complejos. Al centrarse en objetos que combinan datos y comportamientos, facilita la reutilización, el mantenimiento y la escalabilidad del software.
