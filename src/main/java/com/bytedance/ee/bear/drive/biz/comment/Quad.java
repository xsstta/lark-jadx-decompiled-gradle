package com.bytedance.ee.bear.drive.biz.comment;

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

    public Quad() {
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.Quad$a */
    public static class C6363a {

        /* renamed from: a */
        public float f17613a;

        /* renamed from: b */
        public float f17614b;

        public String toString() {
            return "Point{x=" + this.f17613a + ", y=" + this.f17614b + '}';
        }
    }

    public Quad(C6363a aVar, C6363a aVar2, C6363a aVar3, C6363a aVar4) {
        this.x1 = aVar.f17613a;
        this.y1 = aVar.f17614b;
        this.x2 = aVar2.f17613a;
        this.y2 = aVar2.f17614b;
        this.x3 = aVar3.f17613a;
        this.y3 = aVar3.f17614b;
        this.x4 = aVar4.f17613a;
        this.y4 = aVar4.f17614b;
    }
}
