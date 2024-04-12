package org.example.Creators;

import org.example.Archer;
import org.example.Guerrier;
import org.example.Mage;

public class PersonnageCreator {
    public static Archer createArcher(String type) {
        type.equals("archer");
        return new Archer();
    }

    public static Guerrier createGuerrier(String type) {
        type.equals("guerrier");
        return new Guerrier();
    }

    public static Mage createMage(String type) {
        type.equals("mage");
        return new Mage();
    }
}
