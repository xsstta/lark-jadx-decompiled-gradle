package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class RadiusImageView extends AppCompatImageView {

    /* renamed from: a */
    public static float f20546a = ((float) C13749l.m55738a(4));

    /* renamed from: b */
    private Path f20547b = new Path();

    /* renamed from: c */
    private RectF f20548c = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: d */
    private float f20549d = f20546a;

    public void setRadius(float f) {
        this.f20549d = f;
        invalidate();
    }

    public RadiusImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f20548c.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
        this.f20547b.reset();
        Path path = this.f20547b;
        RectF rectF = this.f20548c;
        float f = this.f20549d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.f20547b);
        super.onDraw(canvas);
    }

    public RadiusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadiusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
