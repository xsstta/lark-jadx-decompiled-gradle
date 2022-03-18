package com.chad.library.adapter.base.p934a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.chad.library.adapter.base.a.a */
public class C20919a implements AbstractC20920b {

    /* renamed from: a */
    private final float f51240a;

    public C20919a() {
        this(BitmapDescriptorFactory.HUE_RED);
    }

    public C20919a(float f) {
        this.f51240a = f;
    }

    @Override // com.chad.library.adapter.base.p934a.AbstractC20920b
    /* renamed from: a */
    public Animator[] mo70725a(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.f51240a, 1.0f)};
    }
}
