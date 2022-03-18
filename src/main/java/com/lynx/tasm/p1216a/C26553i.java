package com.lynx.tasm.p1216a;

import android.graphics.Rect;
import java.util.Arrays;

/* renamed from: com.lynx.tasm.a.i */
public class C26553i extends C26548d {

    /* renamed from: a */
    private C26554a f65662a;

    /* renamed from: b */
    private C26554a f65663b;

    /* renamed from: c */
    private C26554a f65664c;

    /* renamed from: com.lynx.tasm.a.i$a */
    public static class C26554a {

        /* renamed from: a */
        float f65665a;

        /* renamed from: b */
        float f65666b;

        public C26554a() {
        }

        /* renamed from: a */
        public float mo94360a() {
            return this.f65665a;
        }

        /* renamed from: b */
        public float mo94362b() {
            return this.f65666b;
        }

        public int hashCode() {
            return Arrays.hashCode(new float[]{this.f65665a, this.f65666b});
        }

        public String toString() {
            return "Point{x=" + this.f65665a + ", y=" + this.f65666b + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C26554a)) {
                return false;
            }
            C26554a aVar = (C26554a) obj;
            if (Float.compare(aVar.f65665a, this.f65665a) == 0 && Float.compare(aVar.f65666b, this.f65666b) == 0) {
                return true;
            }
            return false;
        }

        public C26554a(float f, float f2) {
            this.f65665a = f;
            this.f65666b = f2;
        }

        /* renamed from: a */
        public C26554a mo94361a(Rect rect, Rect rect2) {
            return new C26554a(((float) (rect.left - rect2.left)) + this.f65665a, ((float) (rect.top - rect2.top)) + this.f65666b);
        }
    }

    /* renamed from: a */
    public C26554a mo94357a() {
        return this.f65662a;
    }

    /* renamed from: b */
    public C26554a mo94358b() {
        return this.f65663b;
    }

    /* renamed from: e */
    public C26554a mo94359e() {
        return this.f65664c;
    }

    public C26553i(int i, String str, C26554a aVar, C26554a aVar2, C26554a aVar3) {
        super(i, str);
        this.f65662a = aVar;
        this.f65663b = aVar2;
        this.f65664c = aVar3;
    }
}
