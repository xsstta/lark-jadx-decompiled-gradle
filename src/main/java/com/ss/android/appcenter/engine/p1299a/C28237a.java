package com.ss.android.appcenter.engine.p1299a;

import com.ss.android.appcenter.engine.model.Scene;

/* renamed from: com.ss.android.appcenter.engine.a.a */
public class C28237a<T> {

    /* renamed from: a */
    public Scene f70874a;

    /* renamed from: b */
    private int f70875b;

    /* renamed from: c */
    private T f70876c;

    /* renamed from: f */
    public T mo100619f() {
        return this.f70876c;
    }

    public C28237a() {
        this.f70874a = Scene.DEFAULT;
    }

    /* renamed from: a */
    public boolean mo100614a() {
        if (this.f70875b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo100615b() {
        if (this.f70875b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo100616c() {
        if (this.f70875b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo100617d() {
        if (this.f70874a == Scene.NET) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo100618e() {
        if (this.f70874a == Scene.CACHE) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo100620g() {
        int i = this.f70875b;
        if (i == 0) {
            return "Loading";
        }
        if (i == 1) {
            return "Success";
        }
        if (i != 2) {
            return "Default";
        }
        return "Error";
    }

    public String toString() {
        return String.format("DataWrapper{status=%d, data=%s}", Integer.valueOf(this.f70875b), this.f70876c);
    }

    /* renamed from: a */
    public void mo100613a(int i) {
        this.f70875b = i;
    }

    public C28237a(int i, Scene scene) {
        this.f70875b = i;
        this.f70874a = scene;
    }

    public C28237a(int i, T t, Scene scene) {
        this.f70875b = i;
        this.f70876c = t;
        this.f70874a = scene;
    }
}
