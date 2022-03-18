package com.lynx.tasm.behavior.ui;

import android.graphics.Color;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.b */
public class C26748b {

    /* renamed from: a */
    public int f66312a;

    /* renamed from: b */
    public float f66313b;

    /* renamed from: c */
    public float f66314c;

    /* renamed from: d */
    public float f66315d;

    /* renamed from: e */
    public float f66316e;

    /* renamed from: f */
    public float f66317f;

    /* renamed from: g */
    public int f66318g;

    /* renamed from: a */
    public boolean mo95150a() {
        if (this.f66318g == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((this.f66318g * 31) + this.f66312a) * 31;
        float f = this.f66313b;
        int i6 = 0;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        float f2 = this.f66314c;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        float f3 = this.f66315d;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        float f4 = this.f66316e;
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        float f5 = this.f66317f;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            i6 = Float.floatToIntBits(f5);
        }
        return i10 + i6;
    }

    public String toString() {
        return "ShadowData: Color: red " + Color.red(this.f66312a) + " green: " + Color.green(this.f66312a) + " blue: " + Color.blue(Color.blue(this.f66312a)) + " OffsetX: " + this.f66313b + " offsetY: " + this.f66314c + " blurRadius: " + this.f66315d + " spreadRadius: " + this.f66316e + "option: " + this.f66318g;
    }

    /* renamed from: a */
    public static List<C26748b> m97118a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            C26748b bVar = new C26748b();
            bVar.f66313b = (float) array.getDouble(0);
            bVar.f66314c = (float) array.getDouble(1);
            float f = (float) array.getDouble(2);
            bVar.f66315d = f;
            bVar.f66317f = f * 1.25f;
            bVar.f66316e = (float) array.getDouble(3);
            bVar.f66318g = (int) array.getDouble(4);
            bVar.f66312a = (int) array.getLong(5);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C26748b bVar = (C26748b) obj;
        if (this.f66312a == bVar.f66312a && Float.compare(bVar.f66313b, this.f66313b) == 0 && Float.compare(bVar.f66314c, this.f66314c) == 0 && Float.compare(bVar.f66315d, this.f66315d) == 0 && Float.compare(bVar.f66316e, this.f66316e) == 0 && Float.compare(bVar.f66317f, this.f66317f) == 0 && this.f66318g == bVar.f66318g) {
            return true;
        }
        return false;
    }
}
