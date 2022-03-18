package com.lynx.tasm.behavior.ui.utils;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.utils.C26945b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.lynx.tasm.behavior.ui.utils.e */
public class C26832e {

    /* renamed from: a */
    private static final int[] f66638a = {1, 2, 4, 8, 16, 32, 64, SmActions.ACTION_ONTHECALL_EXIT, DynamicModule.f58006b};

    /* renamed from: b */
    private final float[] f66639b;

    /* renamed from: c */
    private int f66640c;

    /* renamed from: d */
    private float f66641d;

    /* renamed from: e */
    private boolean f66642e;

    public C26832e() {
        this(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    private static float[] m97534a() {
        return new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
    }

    /* renamed from: b */
    public float mo95544b(int i) {
        return this.f66639b[i];
    }

    public C26832e(float f) {
        this.f66639b = m97534a();
        this.f66640c = 0;
        this.f66641d = f;
    }

    /* renamed from: a */
    public float mo95542a(int i) {
        float f;
        char c;
        if (i == 4 || i == 5) {
            f = 1.0E21f;
        } else {
            f = this.f66641d;
        }
        int i2 = this.f66640c;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = f66638a;
        if ((iArr[i] & i2) != 0) {
            return this.f66639b[i];
        }
        if (this.f66642e) {
            if (i == 1 || i == 3) {
                c = 7;
            } else {
                c = 6;
            }
            if ((iArr[c] & i2) != 0) {
                return this.f66639b[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.f66639b[8];
            }
        }
        return f;
    }

    /* renamed from: a */
    public boolean mo95543a(int i, float f) {
        boolean z = false;
        if (C26945b.m97908a(this.f66639b[i], f)) {
            return false;
        }
        this.f66639b[i] = f;
        if (C26705f.m96794a(f)) {
            this.f66640c = (~f66638a[i]) & this.f66640c;
        } else {
            this.f66640c = f66638a[i] | this.f66640c;
        }
        int i2 = this.f66640c;
        int[] iArr = f66638a;
        if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
            z = true;
        }
        this.f66642e = z;
        return true;
    }
}
