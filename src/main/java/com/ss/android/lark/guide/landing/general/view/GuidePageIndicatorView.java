package com.ss.android.lark.guide.landing.general.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class GuidePageIndicatorView extends View {

    /* renamed from: a */
    private int f99331a;

    /* renamed from: b */
    private int f99332b;

    /* renamed from: c */
    private int f99333c;

    /* renamed from: d */
    private Paint f99334d;

    /* renamed from: e */
    private Paint f99335e;

    /* renamed from: f */
    private float f99336f;

    public GuidePageIndicatorView(Context context) {
        super(context);
        m152503a(context);
    }

    public void setProportion(float f) {
        this.f99336f = f;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < 5; i++) {
            int i2 = this.f99332b;
            int i3 = (this.f99331a + i2) * i;
            canvas.drawRect((float) i3, BitmapDescriptorFactory.HUE_RED, (float) (i3 + i2), (float) this.f99333c, this.f99334d);
        }
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f99332b;
        float f = ((float) (measuredWidth - i4)) * this.f99336f;
        canvas.drawRect(f, BitmapDescriptorFactory.HUE_RED, f + ((float) i4), (float) this.f99333c, this.f99335e);
    }

    /* renamed from: a */
    private void m152503a(Context context) {
        this.f99332b = UIUtils.dp2px(context, 16.0f);
        this.f99331a = UIUtils.dp2px(context, 4.0f);
        this.f99333c = UIUtils.dp2px(context, 3.0f);
        Paint paint = new Paint();
        this.f99334d = paint;
        paint.setColor(ContextCompat.getColor(context, R.color.icon_disable));
        this.f99334d.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f99335e = paint2;
        paint2.setColor(ContextCompat.getColor(context, R.color.icon_n1));
    }

    public GuidePageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m152503a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f99332b;
        setMeasuredDimension((i3 * 5) + (this.f99331a * 4), i3);
    }

    public GuidePageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m152503a(context);
    }
}
