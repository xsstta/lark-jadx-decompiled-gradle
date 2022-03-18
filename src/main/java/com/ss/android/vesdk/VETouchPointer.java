package com.ss.android.vesdk;

public class VETouchPointer {

    /* renamed from: a */
    private int f161389a;

    /* renamed from: b */
    private TouchEvent f161390b;

    /* renamed from: c */
    private float f161391c;

    /* renamed from: d */
    private float f161392d;

    /* renamed from: e */
    private float f161393e;

    /* renamed from: f */
    private float f161394f;

    public enum TouchEvent {
        BEGAN,
        MOVED,
        STATIONARY,
        ENDED,
        CANCELED
    }

    /* renamed from: a */
    public int mo220978a() {
        return this.f161389a;
    }

    /* renamed from: b */
    public TouchEvent mo220979b() {
        return this.f161390b;
    }

    /* renamed from: c */
    public float mo220980c() {
        return this.f161391c;
    }

    /* renamed from: d */
    public float mo220981d() {
        return this.f161392d;
    }

    /* renamed from: e */
    public float mo220982e() {
        return this.f161393e;
    }

    /* renamed from: f */
    public float mo220983f() {
        return this.f161394f;
    }

    public String toString() {
        return "pointerId: " + this.f161389a + ", TouchEvent: " + this.f161390b + ", x: " + this.f161391c + ", y: " + this.f161392d + ", force: " + this.f161393e + ", majorRadius: " + this.f161394f;
    }
}
