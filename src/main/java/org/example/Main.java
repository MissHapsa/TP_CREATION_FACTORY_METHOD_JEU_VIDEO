package org.example;

import org.example.Creators.PersonnageCreator;

public class Main {
    public static void main(String[] args) {
        Character mage = PersonnageCreator.createMage("mage");
        Character archer = PersonnageCreator.createArcher("archer");
        Character guerrier = PersonnageCreator.createGuerrier("guerrier");
        Weapon arc = new Arc();
        Weapon epee = new Epee();
        Weapon batonMagique = new BatonMagique();
        mage.attack();
        batonMagique.attack();
        archer.attack();
        arc.attack();
        guerrier.attack();
        epee.attack();


}}