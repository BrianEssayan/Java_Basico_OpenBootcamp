package clases;

import interfaces.CocheCRUD;

public class Main {

    static CocheCRUD coche1 = new CocheCRUDImpl();
    public static void main(String[] args) {
        coche1.save(new Coche());
        System.out.println(coche1.findAll());
        coche1.delete(new Coche());
    }
}
