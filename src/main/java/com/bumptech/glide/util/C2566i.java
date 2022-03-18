package com.bumptech.glide.util;

/* renamed from: com.bumptech.glide.util.i */
public class C2566i {

    /* renamed from: a */
    private Class<?> f8285a;

    /* renamed from: b */
    private Class<?> f8286b;

    /* renamed from: c */
    private Class<?> f8287c;

    public C2566i() {
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f8285a.hashCode() * 31) + this.f8286b.hashCode()) * 31;
        Class<?> cls = this.f8287c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f8285a + ", second=" + this.f8286b + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2566i iVar = (C2566i) obj;
        if (this.f8285a.equals(iVar.f8285a) && this.f8286b.equals(iVar.f8286b) && C2568k.m10912a(this.f8287c, iVar.f8287c)) {
            return true;
        }
        return false;
    }

    public C2566i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo11260a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo11260a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f8285a = cls;
        this.f8286b = cls2;
        this.f8287c = cls3;
    }
}
