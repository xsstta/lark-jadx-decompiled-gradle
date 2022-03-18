package com.ss.android.lark.mail.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class CornerImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f111389a;

    /* renamed from: b */
    private float f111390b;

    /* renamed from: c */
    private float f111391c;

    /* renamed from: d */
    private float f111392d;

    /* renamed from: e */
    private Path f111393e;

    /* renamed from: f */
    private float[] f111394f;

    /* renamed from: a */
    private void m174022a() {
        if (this.f111389a > BitmapDescriptorFactory.HUE_RED || this.f111390b > BitmapDescriptorFactory.HUE_RED || this.f111391c > BitmapDescriptorFactory.HUE_RED || this.f111392d > BitmapDescriptorFactory.HUE_RED) {
            this.f111393e = new Path();
            float f = this.f111389a;
            float f2 = this.f111390b;
            float f3 = this.f111392d;
            float f4 = this.f111391c;
            this.f111394f = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            return;
        }
        this.f111393e = null;
        this.f111394f = null;
    }

    public CornerImageView(Context context) {
        super(context);
    }

    public void setCornerRadius(float f) {
        this.f111389a = f;
        this.f111390b = f;
        this.f111391c = f;
        this.f111392d = f;
        m174022a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!(this.f111393e == null || this.f111394f == null)) {
            this.f111393e.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()), this.f111394f, Path.Direction.CW);
            canvas.clipPath(this.f111393e);
        }
        super.onDraw(canvas);
    }

    public CornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
