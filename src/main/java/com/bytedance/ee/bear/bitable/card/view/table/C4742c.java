package com.bytedance.ee.bear.bitable.card.view.table;

import android.view.View;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.table.c */
public class C4742c implements FixPageTransformerViewPager.AbstractC11860e {
    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11860e
    /* renamed from: a */
    public void mo18484a(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = 0.8f;
        float f3 = 0.95f;
        if (Math.abs(f) < 1.0f) {
            float abs = (Math.abs(1.0f - Math.abs(f)) * 0.050000012f) + 0.95f;
            f2 = 0.8f + (((abs - 0.95f) / 0.050000012f) * 0.19999999f);
            f3 = abs;
        }
        float f4 = 1.0f - f3;
        float f5 = (((float) height) * f4) / 2.0f;
        float f6 = (((float) width) * f4) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            view.setTranslationX(f6 - (f5 / 2.0f));
        } else {
            view.setTranslationX((-f6) + (f5 / 2.0f));
        }
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setAlpha(f2);
    }
}
