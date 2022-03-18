package com.bytedance.ee.bear.imageviewer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/imageviewer/ImageEnterAnimator;", "", "()V", "animator", "", "targetView", "Landroid/view/View;", "startPos", "Lcom/bytedance/ee/bear/contract/imageviewer/bean/ImageData$Position;", "image-viewer-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.imageviewer.c */
public final class ImageEnterAnimator {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.imageviewer.c$a */
    public static final class C7844a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f21161a;

        /* renamed from: b */
        final /* synthetic */ float f21162b;

        /* renamed from: c */
        final /* synthetic */ float f21163c;

        /* renamed from: d */
        final /* synthetic */ int f21164d;

        /* renamed from: e */
        final /* synthetic */ float f21165e;

        /* renamed from: f */
        final /* synthetic */ int f21166f;

        C7844a(View view, float f, float f2, int i, float f3, int i2) {
            this.f21161a = view;
            this.f21162b = f;
            this.f21163c = f2;
            this.f21164d = i;
            this.f21165e = f3;
            this.f21166f = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f21161a.setPivotX(BitmapDescriptorFactory.HUE_RED);
                this.f21161a.setPivotY(BitmapDescriptorFactory.HUE_RED);
                View view = this.f21161a;
                float f = this.f21162b;
                view.setScaleX(f + ((1.0f - f) * floatValue));
                View view2 = this.f21161a;
                view2.setScaleY(view2.getScaleX());
                float f2 = -(1.0f - floatValue);
                this.f21161a.setTranslationX((this.f21163c - ((float) this.f21164d)) * f2);
                this.f21161a.setTranslationY(f2 * (this.f21165e - ((float) this.f21166f)));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public final void mo30655a(View view, ImageData.Position position) {
        float f;
        float f2;
        float f3;
        Intrinsics.checkParameterIsNotNull(view, "targetView");
        Intrinsics.checkParameterIsNotNull(position, "startPos");
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(350L);
        int a = C13749l.m55737a(position.f14903x);
        int a2 = C13749l.m55737a(position.f14904y);
        int a3 = C13749l.m55737a(position.width);
        int a4 = C13749l.m55737a(position.height);
        float f4 = (float) a4;
        float f5 = (float) a3;
        float f6 = f4 / f5;
        int width = view.getWidth();
        int height = view.getHeight();
        if (f6 <= 1.0f || (a3 < width && a4 < height)) {
            float f7 = (float) width;
            f = (((float) height) - (f6 * f7)) / 2.0f;
            f3 = f5 / f7;
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            float f8 = (float) height;
            f2 = (((float) width) - (f8 / f6)) / 2.0f;
            f3 = f4 / f8;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        ofFloat.addUpdateListener(new C7844a(view, f3, f2, a, f, a2));
        ofFloat.start();
    }
}
