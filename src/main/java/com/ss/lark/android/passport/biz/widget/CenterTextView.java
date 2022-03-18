package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class CenterTextView extends AppCompatTextView {

    /* renamed from: a */
    private StaticLayout f164325a;

    /* renamed from: b */
    private TextPaint f164326b;

    /* renamed from: a */
    private void m256155a() {
        TextPaint textPaint = new TextPaint(1);
        this.f164326b = textPaint;
        textPaint.setTextSize(getTextSize());
        this.f164326b.setColor(getCurrentTextColor());
        this.f164325a = new StaticLayout(getText(), this.f164326b, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f164325a.draw(canvas);
    }

    public CenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m256155a();
    }
}
