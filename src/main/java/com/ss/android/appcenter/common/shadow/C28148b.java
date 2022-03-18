package com.ss.android.appcenter.common.shadow;

import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: com.ss.android.appcenter.common.shadow.b */
public final class C28148b implements AbstractC28149c {

    /* renamed from: a */
    private final AbstractC28149c f70584a;

    /* renamed from: b */
    private final float f70585b;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70584a, Float.valueOf(this.f70585b)});
    }

    @Override // com.ss.android.appcenter.common.shadow.AbstractC28149c
    /* renamed from: a */
    public float mo100314a(RectF rectF) {
        return Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f70584a.mo100314a(rectF) + this.f70585b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28148b)) {
            return false;
        }
        C28148b bVar = (C28148b) obj;
        if (!this.f70584a.equals(bVar.f70584a) || this.f70585b != bVar.f70585b) {
            return false;
        }
        return true;
    }

    public C28148b(float f, AbstractC28149c cVar) {
        while (cVar instanceof C28148b) {
            cVar = ((C28148b) cVar).f70584a;
            f += ((C28148b) cVar).f70585b;
        }
        this.f70584a = cVar;
        this.f70585b = f;
    }
}
