package com.is.prototype;

public class TechnologyFactory {
    Technology technology;

    public TechnologyFactory(Technology technology) {
        this.technology = technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    Technology cloneTechnology() {
        return (Technology) technology.copy();
    }
}
