package com.ss.android.ttvecamera;

import java.util.List;

/* renamed from: com.ss.android.ttvecamera.p */
public class C60424p {

    /* renamed from: a */
    public int f151002a;

    /* renamed from: b */
    public int f151003b;

    /* renamed from: c */
    public int f151004c = 1;

    public int hashCode() {
        return (this.f151002a * 65537) + 1 + this.f151003b;
    }

    /* renamed from: a */
    public int[] mo206917a() {
        int i = this.f151002a;
        int i2 = this.f151004c;
        return new int[]{i / i2, this.f151003b / i2};
    }

    public String toString() {
        return "[" + (this.f151002a / this.f151004c) + ":" + (this.f151003b / this.f151004c) + "]";
    }

    /* renamed from: a */
    public static int m234829a(List<int[]> list) {
        if (list.size() > 0 && list.get(0)[1] > 1000) {
            return 1000;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C60424p)) {
            return false;
        }
        C60424p pVar = (C60424p) obj;
        if (this.f151002a == pVar.f151002a && this.f151003b == pVar.f151003b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int[] mo206918a(int i) {
        int i2 = this.f151002a;
        int i3 = this.f151004c;
        return new int[]{(i2 / i3) * i, (this.f151003b / i3) * i};
    }

    public C60424p(int i, int i2) {
        int i3 = 1;
        this.f151002a = i;
        this.f151003b = i2;
        this.f151004c = i2 > 1000 ? 1000 : i3;
    }
}
