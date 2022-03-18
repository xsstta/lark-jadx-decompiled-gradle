package com.ss.android.lark.calendar.impl.features.messagecard.widget;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.widget.a */
public class View$OnTouchListenerC32214a implements View.OnTouchListener {
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (!(clickableSpanArr == null || clickableSpanArr.length == 0)) {
                    if (action == 1) {
                        clickableSpanArr[0].onClick(textView);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
