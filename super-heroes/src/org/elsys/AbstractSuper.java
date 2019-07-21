package org.elsys;

public abstract class AbstractSuper implements SpecialPowersCharacter {
    protected boolean isGood;
    protected String name;
    protected Universe universe;

    @Override
    public abstract void act();

    @Override
    public boolean isGood() {
        return this.isGood;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Universe getUniverse() {
        return this.universe;
    }

    @Override
    public void setUniverse(Universe universe) {
        this.universe = universe;
    }
}
