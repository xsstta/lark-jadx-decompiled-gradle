package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class EventChipEndSplitTextView extends TextView {
    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        getPaint().setColor(getCurrentTextColor());
        String charSequence = getText().toString();
        int breakText = getPaint().breakText(charSequence, 0, charSequence.length(), true, (float) ((getWidth() - getPaddingLeft()) - getPaddingRight()), null);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        canvas.drawText(charSequence, 0, breakText, (float) getPaddingLeft(), (((float) (getHeight() / 2)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.bottom, (Paint) getPaint());
    }

    public EventChipEndSplitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
