package com.bytedance.ee.bear.bitable.card.view.cell.text;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.text.c */
public class C4687c extends LinkMovementMethod {

    /* renamed from: a */
    private AbstractC4686b f13825a;

    /* renamed from: a */
    public void mo18357a(AbstractC4686b bVar) {
        this.f13825a = bVar;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        AbstractC4686b bVar;
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        int scrollY = y + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = (float) scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 0) {
            boolean z = false;
            ClickableSpan clickableSpan = clickableSpanArr[0];
            if (action == 1) {
                if (lineForVertical == textView.getLineCount() - 1 && f > layout.getLineRight(lineForVertical)) {
                    z = true;
                }
                if (!z) {
                    clickableSpan.onClick(textView);
                } else {
                    AbstractC4686b bVar2 = this.f13825a;
                    if (bVar2 != null) {
                        bVar2.mo18356a(textView);
                    }
                }
            }
        } else if (action == 1 && (bVar = this.f13825a) != null) {
            bVar.mo18356a(textView);
        }
        if (Selection.getSelectionStart(spannable) == -1) {
            Selection.setSelection(spannable, spannable.length());
        }
        return true;
    }
}
