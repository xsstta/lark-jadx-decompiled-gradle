package com.ss.android.appcenter.common.shadow;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.shadow.e */
public class C28151e extends C28150d {

    /* renamed from: a */
    float f70586a = -1.0f;

    @Override // com.ss.android.appcenter.common.shadow.C28150d
    /* renamed from: a */
    public void mo100320a(C28167p pVar, float f, float f2, float f3) {
        pVar.mo100368a(BitmapDescriptorFactory.HUE_RED, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        pVar.mo100373b((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
