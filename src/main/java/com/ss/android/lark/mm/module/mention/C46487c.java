package com.ss.android.lark.mm.module.mention;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.ss.android.lark.mm.module.mention.c */
public class C46487c extends LinkMovementMethod {

    /* renamed from: a */
    private static C46487c f117049a;

    /* renamed from: b */
    private long f117050b;

    /* renamed from: a */
    public static C46487c m183850a() {
        if (f117049a == null) {
            f117049a = new C46487c();
        }
        return f117049a;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action != 1) {
                    this.f117050b = System.currentTimeMillis();
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                } else if (System.currentTimeMillis() - this.f117050b < 200) {
                    clickableSpan.onClick(textView);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
