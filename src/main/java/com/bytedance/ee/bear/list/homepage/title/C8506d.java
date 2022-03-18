package com.bytedance.ee.bear.list.homepage.title;

import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.list.homepage.title.d */
public class C8506d {

    /* renamed from: a */
    protected int f22995a;

    /* renamed from: b */
    protected int f22996b;

    /* renamed from: c */
    private int f22997c;

    /* renamed from: d */
    private int f22998d;

    /* renamed from: a */
    public void mo33246a() {
        this.f22997c = 0;
    }

    /* renamed from: a */
    public boolean mo33247a(float f) {
        return f > 0.1f;
    }

    /* renamed from: a */
    public float mo33244a(int i) {
        int i2;
        int i3 = this.f22996b;
        if (i > i3 || (i2 = this.f22997c) > 0) {
            return 1.0f;
        }
        float f = ((float) (i2 + i3)) / ((float) i3);
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.1f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return f;
    }

    /* renamed from: b */
    public boolean mo33248b(int i) {
        int a = mo33245a(this.f22998d, i);
        this.f22998d = a;
        float a2 = mo33244a(a);
        boolean a3 = mo33247a(a2);
        C13479a.m54772d("TitleBarTransformHelper", "onScrollBy, height:" + this.f22998d + ", alpha:" + a2 + ", visible:" + a3);
        return a3;
    }

    public C8506d(int i, int i2) {
        this.f22996b = i;
        this.f22995a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo33245a(int r4, int r5) {
        /*
            r3 = this;
            int r4 = r4 - r5
            int r0 = r3.f22996b
            r1 = 0
            if (r4 >= r0) goto L_0x000e
            int r5 = r3.f22997c
            int r4 = r4 - r0
            int r5 = r5 + r4
            r3.f22997c = r5
        L_0x000c:
            r4 = r0
            goto L_0x001e
        L_0x000e:
            int r2 = r3.f22995a
            if (r4 <= r2) goto L_0x0016
            r3.f22997c = r1
            r4 = r2
            goto L_0x001e
        L_0x0016:
            int r2 = r3.f22997c
            if (r2 >= 0) goto L_0x001e
            int r2 = r2 - r5
            r3.f22997c = r2
            goto L_0x000c
        L_0x001e:
            int r5 = r3.f22997c
            int r2 = -r0
            if (r5 >= r2) goto L_0x0027
            int r5 = -r0
            r3.f22997c = r5
            goto L_0x002b
        L_0x0027:
            if (r5 <= 0) goto L_0x002b
            r3.f22997c = r1
        L_0x002b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.homepage.title.C8506d.mo33245a(int, int):int");
    }

    public C8506d(int i, int i2, int i3) {
        this.f22996b = i;
        this.f22995a = i2;
        this.f22998d = i3;
    }
}
