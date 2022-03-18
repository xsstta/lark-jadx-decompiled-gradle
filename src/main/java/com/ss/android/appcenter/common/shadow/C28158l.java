package com.ss.android.appcenter.common.shadow;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.shadow.l */
public class C28158l extends C28150d {

    /* renamed from: a */
    float f70592a = -1.0f;

    @Override // com.ss.android.appcenter.common.shadow.C28150d
    /* renamed from: a */
    public void mo100320a(C28167p pVar, float f, float f2, float f3) {
        pVar.mo100368a(BitmapDescriptorFactory.HUE_RED, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        pVar.mo100369a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f4, 180.0f, f);
    }
}
