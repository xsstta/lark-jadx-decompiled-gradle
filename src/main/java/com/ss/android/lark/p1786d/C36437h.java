package com.ss.android.lark.p1786d;

import android.content.Context;
import android.content.MutableContextWrapper;

/* renamed from: com.ss.android.lark.d.h */
public class C36437h extends MutableContextWrapper implements AbstractC36435f {
    @Override // com.ss.android.lark.p1786d.AbstractC36435f
    /* renamed from: a */
    public AbstractC36434e mo129674a() {
        if (getBaseContext() instanceof AbstractC36435f) {
            return ((AbstractC36435f) getBaseContext()).mo129674a();
        }
        if (!(getBaseContext() instanceof MutableContextWrapper) || !(((MutableContextWrapper) getBaseContext()).getBaseContext() instanceof AbstractC36435f)) {
            return null;
        }
        return ((AbstractC36435f) ((MutableContextWrapper) getBaseContext()).getBaseContext()).mo129674a();
    }

    public C36437h(Context context) {
        super(context);
    }
}
