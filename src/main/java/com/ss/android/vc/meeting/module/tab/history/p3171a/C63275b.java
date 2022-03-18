package com.ss.android.vc.meeting.module.tab.history.p3171a;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.a.b */
public class C63275b {

    /* renamed from: a */
    private int f159610a;

    /* renamed from: b */
    private int f159611b;

    /* renamed from: c */
    private int f159612c;

    /* renamed from: a */
    public boolean mo218970a(float f) {
        return f > 0.1f;
    }

    /* renamed from: a */
    public float mo218968a(int i) {
        int i2;
        int i3 = this.f159611b;
        if (i > i3 || (i2 = this.f159612c) > 0) {
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

    public C63275b(int i, int i2) {
        this.f159611b = i;
        this.f159610a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo218969a(int r4, int r5) {
        /*
            r3 = this;
            int r4 = r4 - r5
            int r0 = r3.f159611b
            r1 = 0
            if (r4 >= r0) goto L_0x000e
            int r5 = r3.f159612c
            int r4 = r4 - r0
            int r5 = r5 + r4
            r3.f159612c = r5
        L_0x000c:
            r4 = r0
            goto L_0x001e
        L_0x000e:
            int r2 = r3.f159610a
            if (r4 <= r2) goto L_0x0016
            r3.f159612c = r1
            r4 = r2
            goto L_0x001e
        L_0x0016:
            int r2 = r3.f159612c
            if (r2 >= 0) goto L_0x001e
            int r2 = r2 - r5
            r3.f159612c = r2
            goto L_0x000c
        L_0x001e:
            int r5 = r3.f159612c
            int r2 = -r0
            if (r5 >= r2) goto L_0x0027
            int r5 = -r0
            r3.f159612c = r5
            goto L_0x002b
        L_0x0027:
            if (r5 <= 0) goto L_0x002b
            r3.f159612c = r1
        L_0x002b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab.history.p3171a.C63275b.mo218969a(int, int):int");
    }
}
