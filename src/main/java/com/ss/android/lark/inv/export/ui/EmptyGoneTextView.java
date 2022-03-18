package com.ss.android.lark.inv.export.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class EmptyGoneTextView extends TextView {
    public EmptyGoneTextView(Context context) {
        this(context, null);
    }

    public EmptyGoneTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }
}
