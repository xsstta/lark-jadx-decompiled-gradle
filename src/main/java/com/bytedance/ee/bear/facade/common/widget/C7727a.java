package com.bytedance.ee.bear.facade.common.widget;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.facade.common.widget.a */
public class C7727a extends LinkMovementMethod {

    /* renamed from: b */
    private static C7727a f20891b;

    /* renamed from: a */
    private long f20892a;

    /* renamed from: a */
    public static C7727a m30901a() {
        if (f20891b == null) {
            f20891b = new C7727a();
        }
        return f20891b;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            Object[] objArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (objArr.length != 0) {
                if (action == 1) {
                    if (lineForVertical != textView.getLineCount() - 1 || f <= layout.getLineRight(textView.getLineCount() - 1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C13479a.m54772d("LinkMovementClickMethod", "touch area: " + z);
                    if (System.currentTimeMillis() - this.f20892a < 500 && !z) {
                        objArr[0].onClick(textView);
                    }
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(objArr[0]), spannable.getSpanEnd(objArr[0]));
                    this.f20892a = System.currentTimeMillis();
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
