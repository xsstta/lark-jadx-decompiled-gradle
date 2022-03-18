package com.lynx.tasm.behavior;

import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import javax.annotation.Nullable;

/* renamed from: com.lynx.tasm.behavior.s */
public class C26697s {

    /* renamed from: a */
    public final ReadableMap f66083a;

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f66083a.toString() + " }";
    }

    public C26697s(ReadableMap readableMap) {
        this.f66083a = readableMap;
    }

    /* renamed from: a */
    public boolean mo94775a(String str) {
        return this.f66083a.hasKey(str);
    }

    /* renamed from: b */
    public boolean mo94777b(String str) {
        return this.f66083a.isNull(str);
    }

    @Nullable
    /* renamed from: c */
    public String mo94778c(String str) {
        return this.f66083a.getString(str);
    }

    @Nullable
    /* renamed from: d */
    public ReadableArray mo94779d(String str) {
        return this.f66083a.getArray(str);
    }

    @Nullable
    /* renamed from: e */
    public ReadableMap mo94780e(String str) {
        return this.f66083a.getMap(str);
    }

    @Nullable
    /* renamed from: f */
    public AbstractC26517a mo94781f(String str) {
        return this.f66083a.getDynamic(str);
    }

    /* renamed from: a */
    public double mo94772a(String str, double d) {
        if (this.f66083a.isNull(str)) {
            return d;
        }
        return this.f66083a.getDouble(str);
    }

    /* renamed from: a */
    public float mo94773a(String str, float f) {
        if (this.f66083a.isNull(str)) {
            return f;
        }
        return (float) this.f66083a.getDouble(str);
    }

    /* renamed from: a */
    public int mo94774a(String str, int i) {
        if (this.f66083a.isNull(str)) {
            return i;
        }
        return this.f66083a.getInt(str);
    }

    /* renamed from: a */
    public boolean mo94776a(String str, boolean z) {
        if (this.f66083a.isNull(str)) {
            return z;
        }
        return this.f66083a.getBoolean(str);
    }
}
