package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private Integer field;

    public Triangle(String name, Integer field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    @Override
    public Integer getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!name.equals(triangle.name)) return false;
        return field.equals(triangle.field);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }
}
