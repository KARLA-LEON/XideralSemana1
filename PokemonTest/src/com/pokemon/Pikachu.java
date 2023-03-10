package com.pokemon;
//Aquí decimos que la clase Pikachu hereda de la clase Pokemon e implementa los metodos de la interfaz iElectrico

public class Pikachu extends Pokemon implements iElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ha utilizado placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Pikachu ha utilizado arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ha utilizado mordisco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ha utilizado Impactrueno");

    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Pikachu ha utilizado puño trueno");

    }
}
