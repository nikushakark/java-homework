package ge.edutech.testautomation.javaoop.util;

import ge.edutech.testautomation.javaoop.figures.Circle;

public class Util {
    public static String circleToString(Circle circle){
        return "[circle: radius - " + circle.getRadius() + " ]";
    }
}
