package com.is.prototype;

public class ClientClass {
    public static void main(String[] args) {
        Technology technology = new Technology("Spring", "Super helper", "FrameWork");
        System.out.println(technology);

        TechnologyFactory technologyFactory = new TechnologyFactory(technology);
        Technology cloneTechnology = technologyFactory.cloneTechnology();
        System.out.println(cloneTechnology);
    }
}
