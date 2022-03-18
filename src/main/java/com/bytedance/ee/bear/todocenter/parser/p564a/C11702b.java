package com.bytedance.ee.bear.todocenter.parser.p564a;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: com.bytedance.ee.bear.todocenter.parser.a.b */
public class C11702b extends ClickableSpan {

    /* renamed from: a */
    private int f31488a;

    public void onClick(View view) {
    }

    /* renamed from: a */
    public C11702b mo44835a(int i) {
        this.f31488a = i;
        return this;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.f31488a;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}
