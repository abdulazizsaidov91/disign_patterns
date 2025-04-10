package com.is.prototype;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Technology implements Copyable {
    String name;
    String description;
    String type;

    public Technology(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    @Override
    public Object copy() {
        return new Technology(this.name, this.description, this.type);
    }

}
