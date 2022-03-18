package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public abstract class AsyncMessageView extends AppCompatTextView {
    /* renamed from: a */
    public abstract void mo138842a(int i);

    /* renamed from: a */
    public abstract void mo138843a(String str, int i, boolean z, boolean z2);

    public AsyncMessageView(Context context) {
        super(context);
    }

    public AsyncMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AsyncMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
