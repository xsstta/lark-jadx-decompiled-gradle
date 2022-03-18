package com.lynx.tasm.behavior.ui.utils;

import com.lynx.react.bridge.ReadableArray;

/* renamed from: com.lynx.tasm.behavior.ui.utils.f */
public class C26833f {

    /* renamed from: a */
    public static final C26833f f66643a = new C26833f();

    /* renamed from: b */
    private final float f66644b;

    /* renamed from: c */
    private final int f66645c;

    /* renamed from: d */
    private final float f66646d;

    /* renamed from: e */
    private final int f66647e;

    /* renamed from: g */
    public float mo95551g() {
        return this.f66644b;
    }

    /* renamed from: h */
    public float mo95552h() {
        return this.f66646d;
    }

    /* renamed from: d */
    public boolean mo95548d() {
        if (this.f66645c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo95549e() {
        if (this.f66647e == 1) {
            return true;
        }
        return false;
    }

    private C26833f() {
        this.f66644b = 0.5f;
        this.f66645c = 1;
        this.f66646d = 0.5f;
        this.f66647e = 1;
    }

    /* renamed from: b */
    public boolean mo95546b() {
        if (this.f66644b == 0.5f && this.f66645c == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo95547c() {
        if (this.f66646d == 0.5f && this.f66647e == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo95550f() {
        if (mo95548d() || mo95549e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo95545a() {
        if (mo95546b() || mo95547c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C26833f m97538a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() < 2) {
            return null;
        }
        return new C26833f(readableArray);
    }

    private C26833f(ReadableArray readableArray) {
        this.f66644b = (float) readableArray.getDouble(0);
        this.f66645c = readableArray.getInt(1);
        if (readableArray.size() >= 4) {
            this.f66646d = (float) readableArray.getDouble(2);
            this.f66647e = readableArray.getInt(3);
            return;
        }
        this.f66646d = 0.5f;
        this.f66647e = 1;
    }
}
