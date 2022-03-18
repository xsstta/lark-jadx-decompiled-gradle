package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class AlignTextView extends AppCompatTextView {
    /* renamed from: a */
    private boolean m48885a(char c) {
        return (c == 0 || c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= 55295) || ((c >= 57344 && c <= 65533) || (c >= 0 && c <= 65535))) ? false : true;
    }

    public AlignTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            super.onDraw(canvas);
            return;
        }
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        m48884a((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd(), getText(), (int) ((((float) ((int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent)))) * layout.getSpacingMultiplier()) + layout.getSpacingAdd()), canvas);
    }

    public AlignTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlignTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    private CharSequence m48886b(int i, CharSequence charSequence, TextPaint textPaint) {
        float desiredWidth = StaticLayout.getDesiredWidth("...", textPaint);
        CharSequence charSequence2 = null;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            charSequence2 = charSequence.subSequence(0, i2);
            if (StaticLayout.getDesiredWidth(charSequence2, textPaint) + desiredWidth > ((float) i)) {
                return ((Object) charSequence.subSequence(0, i2 - 1)) + "...";
            }
        }
        return charSequence2;
    }

    /* renamed from: a */
    private CharSequence m48883a(int i, CharSequence charSequence, TextPaint textPaint) {
        CharSequence charSequence2 = null;
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            charSequence2 = charSequence.subSequence(0, i2);
            if (StaticLayout.getDesiredWidth(charSequence2, textPaint) > ((float) i)) {
                CharSequence subSequence = charSequence.subSequence(0, i2 - 1);
                if (!m48885a(subSequence.charAt(subSequence.length() - 1)) || !m48885a(charSequence.charAt(subSequence.length()))) {
                    return subSequence;
                }
                return subSequence.subSequence(0, subSequence.length() - 1);
            }
        }
        return charSequence2;
    }

    /* renamed from: a */
    private void m48884a(int i, CharSequence charSequence, int i2, Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        int length = charSequence.length();
        for (int i3 = 1; i3 <= getMaxLines(); i3++) {
            float paddingStart = (float) getPaddingStart();
            float textSize = paint.getTextSize() + (((float) ((i3 - 1) * i2)) * getLineSpacingMultiplier()) + ((float) getPaddingTop());
            if (i3 != getMaxLines()) {
                CharSequence a = m48883a(i, charSequence, paint);
                int length2 = a.length();
                canvas.drawText(a, 0, length2, paddingStart, textSize, paint);
                if (length2 < length) {
                    charSequence = charSequence.subSequence(length2, length);
                    length -= length2;
                } else {
                    return;
                }
            } else {
                CharSequence b = m48886b(i, charSequence, paint);
                canvas.drawText(b, 0, b.length(), paddingStart, textSize, paint);
            }
        }
    }
}
