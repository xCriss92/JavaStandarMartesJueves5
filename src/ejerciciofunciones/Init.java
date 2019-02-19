/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofunciones;

@FunctionalInterface
interface accionable {
    void realizarAccion(String param);
}

class A implements accionable {
    public void realizarAccion(String param) {
        System.out.println("Esta es una accion A: " + param);
    }
    public void metodoOtro() {
    }
}

class B implements accionable {
    public void realizarAccion(String param) {
        System.out.println("Esta es una accion B: " + param);
    }
}


class Lambda implements accionable {
    public void realizarAccion(String p) {
        System.out.println("Esta es una accion Lambda: " + p);
    }
}


public class Init {
    public static void m1(accionable a) {
        a.realizarAccion("hola");
    }
    public static void main(String... params) {
       m1( p -> System.out.println("Esta es una accion Lambda: " + p)); // java 8
       m1(new Lambda()); // java 7
    }
}
