package com.ss.android.lark.chatwindow;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.chatwindow.i */
public abstract class AbstractC35250i extends ClickableSpan {

    /* renamed from: a */
    private int f91024a = R.color.text_link_normal;

    /* renamed from: j */
    Context f91025j;

    /* renamed from: a */
    public void mo129710a(int i) {
        this.f91024a = i;
    }

    public AbstractC35250i(Context context) {
        this.f91025j = context;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(UIUtils.getColor(this.f91025j, this.f91024a));
    }

    public AbstractC35250i(Context context, int i) {
        this.f91025j = context;
        this.f91024a = i;
    }
}
