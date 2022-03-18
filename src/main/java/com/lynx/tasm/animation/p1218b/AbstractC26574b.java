package com.lynx.tasm.animation.p1218b;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: com.lynx.tasm.animation.b.b */
public abstract class AbstractC26574b extends AbstractC26573a {
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo94437b();

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.animation.p1218b.AbstractC26573a
    /* renamed from: a */
    public Animation mo94430a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        View av = lynxUI.av();
        int d = this.f65732a.mo94385d();
        float f6 = 1.0f;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        if (d == 2) {
            if (mo94437b()) {
                f2 = 1.0f;
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (mo94437b()) {
                f6 = BitmapDescriptorFactory.HUE_RED;
            }
            return new ScaleAnimation(f2, f6, 1.0f, 1.0f, 1, 0.5f, 1, BitmapDescriptorFactory.HUE_RED);
        } else if (d == 4) {
            if (mo94437b()) {
                f3 = 1.0f;
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (mo94437b()) {
                f6 = BitmapDescriptorFactory.HUE_RED;
            }
            return new ScaleAnimation(1.0f, 1.0f, f3, f6, 1, BitmapDescriptorFactory.HUE_RED, 1, 0.5f);
        } else if (d != 8) {
            if (mo94437b()) {
                f5 = f;
            } else {
                f5 = BitmapDescriptorFactory.HUE_RED;
            }
            if (!mo94437b()) {
                f7 = f;
            }
            return new C26582h(av, f5, f7);
        } else {
            if (mo94437b()) {
                f4 = 1.0f;
            } else {
                f4 = BitmapDescriptorFactory.HUE_RED;
            }
            if (mo94437b()) {
                f6 = BitmapDescriptorFactory.HUE_RED;
            }
            return new ScaleAnimation(f4, f6, f4, f6, 1, 0.5f, 1, 0.5f);
        }
    }
}
