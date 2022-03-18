package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class AutoSplitTextView extends AppCompatTextView {

    /* renamed from: a */
    private CharSequence f152015a;

    /* renamed from: b */
    private SpannableStringBuilder f152016b;

    /* renamed from: a */
    private void m236304a() {
        CharSequence text = getText();
        if (!TextUtils.equals(this.f152015a, text)) {
            int min = (Math.min(getMeasuredWidth(), getMaxWidth()) - getPaddingStart()) - getPaddingEnd();
            TextPaint paint = getPaint();
            float f = (float) min;
            if (Layout.getDesiredWidth(text, paint) > f) {
                int length = text.length();
                int i = 0;
                if (this.f152016b.length() > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.f152016b;
                    spannableStringBuilder.delete(0, spannableStringBuilder.length());
                }
                int maxLines = getMaxLines();
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    if (i3 > maxLines + 1) {
                        break;
                    }
                    if (i2 != 0) {
                        this.f152016b.append((CharSequence) "\n");
                    }
                    int breakText = paint.breakText(text, i2, length, true, f, null);
                    int i4 = i2 + breakText;
                    this.f152016b.append(text.subSequence(i2, i4));
                    if (breakText == length - i2) {
                        break;
                    }
                    i2 = i4;
                    i = i3;
                }
                if (!TextUtils.equals(this.f152016b, text)) {
                    SpannableStringBuilder spannableStringBuilder2 = this.f152016b;
                    this.f152015a = spannableStringBuilder2;
                    setText(spannableStringBuilder2);
                }
            }
        }
    }

    public AutoSplitTextView(Context context) {
        this(context, null);
    }

    public AutoSplitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoSplitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152016b = new SpannableStringBuilder();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getMaxLines() > 1) {
            m236304a();
        }
    }
}
