package com.bytedance.ee.plugin.common.pdftron.wrapper;

import java.io.Serializable;

public class Quad implements Serializable {
    public float x1;
    public float x2;
    public float x3;
    public float x4;
    public float y1;
    public float y2;
    public float y3;
    public float y4;

    public static class Point {

        /* renamed from: x */
        public float f35525x;

        /* renamed from: y */
        public float f35526y;

        public Point() {
        }

        public String toString() {
            return "Point{x=" + this.f35525x + ", y=" + this.f35526y + '}';
        }

        public Point(float f, float f2) {
            this.f35525x = f;
            this.f35526y = f2;
        }
    }

    public Quad() {
    }

    public Quad(Point point, Point point2, Point point3, Point point4) {
        this.x1 = point.f35525x;
        this.y1 = point.f35526y;
        this.x2 = point2.f35525x;
        this.y2 = point2.f35526y;
        this.x3 = point3.f35525x;
        this.y3 = point3.f35526y;
        this.x4 = point4.f35525x;
        this.y4 = point4.f35526y;
    }
}
