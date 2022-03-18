package com.ss.android.appcenter.common.shadow;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.ss.android.appcenter.common.shadow.a */
public final class C28147a implements AbstractC28149c {

    /* renamed from: a */
    private final float f70583a;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f70583a)});
    }

    @Override // com.ss.android.appcenter.common.shadow.AbstractC28149c
    /* renamed from: a */
    public float mo100314a(RectF rectF) {
        return this.f70583a;
    }

    public C28147a(float f) {
        this.f70583a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C28147a) && this.f70583a == ((C28147a) obj).f70583a) {
            return true;
        }
        return false;
    }
}
