package org.learning.pattern.creational.factory;

public class PolygonFactory {

    public Polygon createPolygon(int nSides, int sideLength){
        switch (nSides){
            case 5:
                return new Pentagon(sideLength);
            case 6:
                return new Hexagon(sideLength);
            default:
                throw new UnsupportedPolygonType("Polygon with " + nSides + " ");
        }
    }

    private static class UnsupportedPolygonType extends RuntimeException {
        public UnsupportedPolygonType(String message) {
            super(message);
        }
    }
}
