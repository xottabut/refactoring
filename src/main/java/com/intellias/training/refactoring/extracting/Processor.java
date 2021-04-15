package com.intellias.training.refactoring.extracting;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;

public class Processor {

    public static final GeometryFactory GEOMETRY_FACTORY = new GeometryFactory();

    public static LineString enlarged(LineString line) {
        Coordinate start = line.getCoordinate();
        Coordinate end = line.getCoordinateN(line.getNumPoints() - 1);
        double extensionX = end.x - start.x;
        double extensionY = end.y - start.y;
        return GEOMETRY_FACTORY.createLineString(new Coordinate[]{
                new Coordinate(end.x + extensionX, end.y + extensionY),
                new Coordinate(start.x - extensionX, start.y - extensionY)
        });
    }

    public static LineString enlarged(LineString line, double extendLength) {
        Coordinate start = line.getCoordinate();
        Coordinate end = line.getCoordinateN(line.getNumPoints() - 1);
        double fullX = end.x - start.x;
        double fullY = end.y - start.y;
        double currentLength = Math.sqrt(fullX * fullX + fullY * fullY);
        double unitX = fullX / currentLength * extendLength;
        double unitY = fullY / currentLength * extendLength;
        return GEOMETRY_FACTORY.createLineString(new Coordinate[]{
                new Coordinate(end.x + unitX, end.y + unitY),
                new Coordinate(start.x - unitX, start.y - unitY)
        });
    }

}
