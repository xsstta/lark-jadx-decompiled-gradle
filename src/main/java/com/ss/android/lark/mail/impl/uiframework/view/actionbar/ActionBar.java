package com.ss.android.lark.mail.impl.uiframework.view.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActionBar extends LinearLayout {

    /* renamed from: a */
    private AbstractC43709a f110925a;

    public AbstractC43709a getAdapter() {
        return this.f110925a;
    }

    public ActionBar(Context context) {
        super(context);
    }

    public void setAdapter(AbstractC43709a aVar) {
        this.f110925a = aVar;
        aVar.mo155822a(this);
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
