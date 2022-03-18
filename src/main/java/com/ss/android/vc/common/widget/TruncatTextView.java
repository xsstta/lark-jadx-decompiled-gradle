package com.ss.android.vc.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

public class TruncatTextView extends AppCompatTextView {

    /* renamed from: a */
    private String f152111a;

    /* renamed from: b */
    private String f152112b;

    /* renamed from: c */
    private int f152113c;

    /* renamed from: e */
    private final List<String> f152114e;

    /* renamed from: f */
    private AbstractC60818a f152115f;

    /* renamed from: com.ss.android.vc.common.widget.TruncatTextView$a */
    public interface AbstractC60818a {
        /* renamed from: a */
        void mo208521a(TruncatTextView truncatTextView);
    }

    public void setOnLayoutChangeObserver(AbstractC60818a aVar) {
        this.f152115f = aVar;
    }

    public TruncatTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (this.f152114e.size() == 1) {
            f = (((fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom) + ((float) (getHeight() / 2));
        } else {
            f = fontMetrics.descent - fontMetrics.ascent;
        }
        float compoundPaddingLeft = (float) getCompoundPaddingLeft();
        float f2 = f;
        for (String str : this.f152114e) {
            if (!TextUtils.isEmpty(str)) {
                canvas.drawText(str, compoundPaddingLeft, f2, paint);
                f2 += fontMetrics.leading + f;
            }
        }
    }

    /* renamed from: a */
    private float m236384a(String str, TextPaint textPaint) {
        return Layout.getDesiredWidth(str, textPaint);
    }

    public TruncatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo208516a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            setText("");
        } else if (i > 0 && i <= str.length()) {
            setText(str);
            this.f152113c = i;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        if (charSequence != null) {
            str = (String) charSequence;
        } else {
            str = "";
        }
        this.f152111a = str;
        this.f152113c = str.length();
        super.setText(charSequence, bufferType);
    }

    /* renamed from: a */
    public void mo208517a(String str, String str2) {
        if (str != null && str2 != null && str.startsWith(str2)) {
            mo208516a(str, str2.length());
        }
    }

    public TruncatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152114e = new ArrayList();
        if (getMaxLines() <= 0) {
            setMaxLines(1);
        }
    }

    /* renamed from: a */
    private void m236385a(String str, TextPaint textPaint, float f) {
        int length = str.length();
        if (m236384a(str, textPaint) < f) {
            this.f152114e.add(str);
            return;
        }
        int i = 0;
        while (i < length) {
            int breakText = textPaint.breakText(str, i, length, true, f, null) + i;
            this.f152114e.add(str.substring(i, breakText));
            i = breakText;
        }
    }

    /* renamed from: a */
    private void m236386a(String str, TextPaint textPaint, int i) {
        String str2;
        float maxLines = (float) (getMaxLines() * i);
        if (m236384a(str, textPaint) > maxLines) {
            if (this.f152113c == str.length()) {
                str2 = "";
            } else {
                str2 = str.substring(this.f152113c);
                maxLines -= m236384a(str2, textPaint);
            }
            if (maxLines > BitmapDescriptorFactory.HUE_RED) {
                String substring = str.substring(0, this.f152113c);
                int breakText = textPaint.breakText(substring, 0, this.f152113c, true, maxLines - m236384a("...", textPaint), null);
                if (breakText > 0) {
                    this.f152112b = substring.substring(0, breakText) + "..." + str2;
                    return;
                }
                this.f152112b = "..." + str2;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC60818a aVar;
        this.f152114e.clear();
        this.f152112b = this.f152111a;
        TextPaint paint = getPaint();
        int min = (Math.min(getMeasuredWidth(), getMaxWidth()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (min > 0) {
            m236386a(this.f152112b, paint, min);
            m236385a(this.f152112b, paint, (float) min);
        }
        if (z && (aVar = this.f152115f) != null) {
            aVar.mo208521a(this);
        }
    }
}
