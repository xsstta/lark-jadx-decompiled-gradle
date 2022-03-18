package com.bytedance.ee.bear.widgets.shape;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class GradientDrawableCreator {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
    }

    /* renamed from: com.bytedance.ee.bear.widgets.shape.GradientDrawableCreator$a */
    public static class C11851a {

        /* renamed from: a */
        private int f32027a;

        /* renamed from: b */
        private float f32028b;

        /* renamed from: c */
        private float[] f32029c;

        /* renamed from: d */
        private int f32030d;

        /* renamed from: e */
        private ColorStateList f32031e;

        /* renamed from: a */
        public GradientDrawable mo45478a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i = this.f32027a;
            if (i != 0) {
                gradientDrawable.setColor(i);
            }
            float f = this.f32028b;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                gradientDrawable.setCornerRadius(f);
            }
            float[] fArr = this.f32029c;
            if (fArr != null) {
                gradientDrawable.setCornerRadii(fArr);
            }
            ColorStateList colorStateList = this.f32031e;
            if (colorStateList != null) {
                gradientDrawable.setColor(colorStateList);
            }
            gradientDrawable.setShape(this.f32030d);
            return gradientDrawable;
        }

        /* renamed from: a */
        public C11851a mo45479a(float f) {
            this.f32028b = f;
            return this;
        }

        /* renamed from: b */
        public C11851a mo45483b(int i) {
            this.f32030d = i;
            return this;
        }

        /* renamed from: a */
        public C11851a mo45480a(int i) {
            this.f32027a = i;
            return this;
        }

        /* renamed from: a */
        public C11851a mo45481a(ColorStateList colorStateList) {
            this.f32031e = colorStateList;
            return this;
        }

        /* renamed from: a */
        public C11851a mo45482a(float[] fArr) {
            this.f32029c = fArr;
            return this;
        }
    }
}
