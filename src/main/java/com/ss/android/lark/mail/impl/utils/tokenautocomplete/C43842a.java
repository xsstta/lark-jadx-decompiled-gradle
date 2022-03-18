package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.Locale;

/* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.a */
public class C43842a extends ReplacementSpan {

    /* renamed from: a */
    private String f111264a = "";

    /* renamed from: b */
    private final AppCompatTextView f111265b;

    /* renamed from: c */
    private boolean f111266c = true;

    /* renamed from: a */
    public String mo156208a() {
        return this.f111264a;
    }

    /* renamed from: b */
    private void m173812b() {
        this.f111265b.setText(this.f111264a);
        if (this.f111266c) {
            this.f111266c = false;
            this.f111265b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(UIHelper.getDimens(R.dimen.mail_compose_recipient_tag_height), 1073741824));
            AppCompatTextView appCompatTextView = this.f111265b;
            appCompatTextView.layout(0, 0, appCompatTextView.getMeasuredWidth(), this.f111265b.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public float mo156207a(TextPaint textPaint) {
        String str = this.f111264a;
        return Layout.getDesiredWidth(str, 0, str.length(), textPaint) + ((float) UIHelper.dp2px(16.0f));
    }

    C43842a(Context context) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) LayoutInflater.from(context).inflate(R.layout.mail_recipient_token_hint_more, (ViewGroup) null, false);
        this.f111265b = appCompatTextView;
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    /* renamed from: b */
    public static float m173811b(TextPaint textPaint) {
        String format = String.format(Locale.getDefault(), " +%d", 99);
        return Layout.getDesiredWidth(format, 0, format.length(), textPaint) + ((float) UIHelper.dp2px(16.0f));
    }

    /* renamed from: a */
    public void mo156209a(int i) {
        if (i > 0) {
            this.f111264a = String.format(Locale.getDefault(), " +%d", Integer.valueOf(i));
        } else {
            this.f111264a = "";
        }
        this.f111266c = true;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m173812b();
        if (fontMetricsInt != null) {
            int measuredHeight = this.f111265b.getMeasuredHeight();
            int baseline = this.f111265b.getBaseline();
            if (baseline == -1) {
                baseline = measuredHeight;
            }
            int i3 = -baseline;
            fontMetricsInt.top = i3;
            fontMetricsInt.ascent = i3;
            int i4 = measuredHeight - baseline;
            fontMetricsInt.bottom = i4;
            fontMetricsInt.descent = i4;
        }
        return this.f111265b.getRight();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m173812b();
        canvas.save();
        canvas.translate(f, (float) i3);
        this.f111265b.draw(canvas);
        canvas.restore();
    }
}
