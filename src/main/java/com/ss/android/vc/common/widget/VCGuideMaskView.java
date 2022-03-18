package com.ss.android.vc.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class VCGuideMaskView extends View {

    /* renamed from: a */
    private int f152142a;

    /* renamed from: b */
    private int f152143b;

    /* renamed from: c */
    private int f152144c;

    /* renamed from: d */
    private Rect f152145d = new Rect();

    /* renamed from: e */
    private Paint f152146e = new Paint();

    /* renamed from: f */
    private PorterDuffXfermode f152147f;

    /* renamed from: a */
    private void m236410a() {
        this.f152146e.setColor(C60773o.m236116a((int) R.color.ud_N1000, 0.6f));
        this.f152146e.setAntiAlias(true);
        this.f152147f = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public VCGuideMaskView(Context context) {
        super(context);
        m236410a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        this.f152146e.setXfermode(null);
        this.f152145d.set(0, 0, getRight(), getBottom());
        canvas.drawRect(this.f152145d, this.f152146e);
        this.f152146e.setXfermode(this.f152147f);
        canvas.drawCircle((float) this.f152142a, (float) this.f152143b, (float) this.f152144c, this.f152146e);
        canvas.restoreToCount(saveLayer);
    }

    public VCGuideMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236410a();
    }

    /* renamed from: a */
    public void mo208543a(int i, int i2, int i3) {
        this.f152142a = i;
        this.f152143b = i2;
        this.f152144c = i3;
        invalidate();
    }

    public VCGuideMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236410a();
    }
}
