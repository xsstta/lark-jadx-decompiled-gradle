package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;

/* renamed from: com.ss.android.lark.message.card.view.richtext.c */
public class C45347c extends LKUIRoundedImageView2 {

    /* renamed from: a */
    private float f114833a;

    public C45347c(Context context) {
        super(context);
    }

    public void setRadiusPercent(float f) {
        this.f114833a = f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z, i, i2, i3, i4);
        float f2 = this.f114833a;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            float min = Math.min(Math.max((float) BitmapDescriptorFactory.HUE_RED, f2), 0.5f);
            if (getWidth() == getHeight()) {
                f = min * ((float) getWidth());
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (f != BitmapDescriptorFactory.HUE_RED) {
                setRadius(f);
            }
        }
    }
}
