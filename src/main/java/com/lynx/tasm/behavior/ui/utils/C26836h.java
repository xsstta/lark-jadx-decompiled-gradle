package com.lynx.tasm.behavior.ui.utils;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.utils.h */
public class C26836h {

    /* renamed from: a */
    private final int f66655a;

    /* renamed from: b */
    private final float f66656b;

    /* renamed from: c */
    private final int f66657c;

    /* renamed from: d */
    private final float f66658d;

    /* renamed from: e */
    private final int f66659e;

    /* renamed from: f */
    private final float f66660f;

    /* renamed from: g */
    private final int f66661g;

    /* renamed from: a */
    public int mo95581a() {
        return this.f66655a;
    }

    /* renamed from: b */
    public float mo95582b() {
        return this.f66656b;
    }

    /* renamed from: d */
    public float mo95584d() {
        return this.f66658d;
    }

    /* renamed from: f */
    public float mo95586f() {
        return this.f66660f;
    }

    /* renamed from: c */
    public boolean mo95583c() {
        if (this.f66657c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo95585e() {
        if (this.f66659e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo95587g() {
        if (this.f66661g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo95588h() {
        if (mo95583c() || mo95585e() || mo95587g()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m97578a(List<C26836h> list) {
        if (list != null && !list.isEmpty()) {
            for (C26836h hVar : list) {
                if (hVar.mo95588h()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<C26836h> m97577a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array.size() < 7) {
                LLog.m96418a(new IllegalArgumentException("transform params is error."));
            } else {
                arrayList.add(new C26836h(array.getInt(0), (float) array.getDouble(1), array.getInt(2), (float) array.getDouble(3), array.getInt(4), (float) array.getDouble(5), array.getInt(6)));
            }
        }
        return arrayList;
    }

    private C26836h(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.f66655a = i;
        this.f66656b = f;
        this.f66657c = i2;
        this.f66658d = f2;
        this.f66659e = i3;
        this.f66660f = f3;
        this.f66661g = i4;
    }
}
