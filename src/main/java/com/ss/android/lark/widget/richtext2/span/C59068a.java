package com.ss.android.lark.widget.richtext2.span;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.lark.widget.richtext2.span.p2973a.C59069a;

/* renamed from: com.ss.android.lark.widget.richtext2.span.a */
public class C59068a extends SpannableStringBuilder {

    /* renamed from: a */
    private Context f146427a;

    public C59068a(Context context) {
        super("");
        this.f146427a = context;
    }

    /* renamed from: a */
    public C59068a append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        int length = length();
        return (C59068a) replace(length, length, charSequence, 0, charSequence.length());
    }

    public C59068a(Context context, CharSequence charSequence) {
        super(charSequence, 0, charSequence.length());
        this.f146427a = context;
    }

    /* renamed from: a */
    public C59068a append(CharSequence charSequence, Object obj, int i) {
        if (!(charSequence == null || obj == null)) {
            int length = length();
            append(charSequence);
            setSpan(obj, length, length(), i);
        }
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof C59069a) {
            super.setSpan(obj, i2 - 1, i2, i3);
        } else {
            super.setSpan(obj, i, i2, i3);
        }
    }
}
