package com.ss.android.appcenter.common.shadow;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.ss.android.appcenter.common.shadow.k */
public final class C28157k implements AbstractC28149c {

    /* renamed from: a */
    private final float f70591a;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f70591a)});
    }

    @Override // com.ss.android.appcenter.common.shadow.AbstractC28149c
    /* renamed from: a */
    public float mo100314a(RectF rectF) {
        return this.f70591a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C28157k) && this.f70591a == ((C28157k) obj).f70591a) {
            return true;
        }
        return false;
    }
}
