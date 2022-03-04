package com.company;

import java.util.Objects;

public class Soldier {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    private String base;
    private int lvl;
    private double health;

    public Soldier(String name, String base, int lvl, double health) {
        System.out.println("Soldier constructor has been called");
        System.out.println("name: " + name + ", base: " + base + ", lvl: " + lvl + ", health: " + health);
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
    }

    public Soldier() {
        this("no name", "no base", 1, 1);
    }


    public void run() {
        System.out.println("I am running");
    }

    public void shoot() {
        System.out.println("I am shooting");
    }

    public void heal() {
        System.out.println("I am healling");
        if (health < 100) {
            health++;
        }
    }

    public void cover() {
        System.out.println("I am covering");
    }

    public void print(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Soldier{" + "name='" + name + '\'' + ", base='" + base + '\'' + ", lvl=" + lvl + ", health=" + health + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return lvl == soldier.lvl && Double.compare(soldier.health, health) == 0 && Objects.equals(name, soldier.name) && Objects.equals(base, soldier.base);
    }

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }
}
