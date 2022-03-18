package com.google.android.material.shape;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.material.shape.e */
public class C22391e extends C22390d {

    /* renamed from: a */
    float f54913a = -1.0f;

    @Override // com.google.android.material.shape.C22390d
    /* renamed from: a */
    public void mo77997a(C22405n nVar, float f, float f2, float f3) {
        nVar.mo78044a(BitmapDescriptorFactory.HUE_RED, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        nVar.mo78049b((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
