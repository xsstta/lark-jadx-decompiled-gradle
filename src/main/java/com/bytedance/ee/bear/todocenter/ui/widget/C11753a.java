package com.bytedance.ee.bear.todocenter.ui.widget;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.a */
public class C11753a extends LinkMovementMethod {

    /* renamed from: a */
    private ClickableSpan f31597a;

    /* renamed from: a */
    public boolean mo44981a() {
        if (this.f31597a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private ClickableSpan m48720a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y + textView.getScrollY()), (float) scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ClickableSpan a = m48720a(textView, spannable, motionEvent);
            this.f31597a = a;
            if (a != null) {
                Selection.setSelection(spannable, spannable.getSpanStart(a), spannable.getSpanEnd(this.f31597a));
            }
        } else if (motionEvent.getAction() == 2) {
            ClickableSpan a2 = m48720a(textView, spannable, motionEvent);
            ClickableSpan clickableSpan = this.f31597a;
            if (!(clickableSpan == null || a2 == clickableSpan)) {
                this.f31597a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            if (this.f31597a != null) {
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f31597a = null;
            Selection.removeSelection(spannable);
        }
        if (this.f31597a != null) {
            return true;
        }
        return false;
    }
}
