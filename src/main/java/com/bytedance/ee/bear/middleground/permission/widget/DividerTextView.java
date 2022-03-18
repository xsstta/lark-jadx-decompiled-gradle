package com.bytedance.ee.bear.middleground.permission.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class DividerTextView extends AppCompatTextView {

    /* renamed from: a */
    private Paint f27315a;

    /* renamed from: b */
    private boolean f27316b;

    /* renamed from: c */
    private boolean f27317c;

    public DividerTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float a = ((float) C13749l.m55737a(0.5f)) / 2.0f;
        if (this.f27316b) {
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, a, (float) getMeasuredWidth(), a, this.f27315a);
        }
        if (this.f27317c) {
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, ((float) getMeasuredHeight()) - a, (float) getMeasuredWidth(), ((float) getMeasuredHeight()) - a, this.f27315a);
        }
    }

    public DividerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m42099a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottomLine, R.attr.topLine});
        this.f27316b = obtainStyledAttributes.getBoolean(1, true);
        this.f27317c = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f27315a = paint;
        paint.setColor(context.getResources().getColor(R.color.line_divider_default));
        this.f27315a.setAntiAlias(true);
        this.f27315a.setStrokeWidth((float) C13749l.m55737a(0.5f));
        this.f27315a.setStyle(Paint.Style.FILL);
        setBackgroundColor(context.getResources().getColor(R.color.bg_base));
    }

    public DividerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42099a(context, attributeSet);
    }
}
