package com.ss.android.lark.inv.export.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;

public class RoundCornerImageView extends ImageView {

    /* renamed from: a */
    private Path f101915a;

    /* renamed from: b */
    private float[] f101916b;

    public RoundCornerImageView(Context context) {
        super(context, null);
        this.f101915a = new Path();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f101915a.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight()), this.f101916b, Path.Direction.CW);
        canvas.clipPath(this.f101915a);
        super.onDraw(canvas);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f101915a = new Path();
        float dp2px = (float) UIHelper.dp2px(4.0f);
        this.f101916b = new float[]{dp2px, dp2px, dp2px, dp2px, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
