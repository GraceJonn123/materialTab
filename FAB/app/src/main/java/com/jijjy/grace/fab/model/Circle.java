package com.jijjy.grace.fab.model;

/**
 * Created by grace on 5/28/16.
 */
public class Circle {
    public float x;
    public float y;
    public float radius;

    public Circle(){
    }

    /*
    * restores to default values*/
    public void restore() {
        x = 0;
        y = 0;
        radius = 0;
    }
}
