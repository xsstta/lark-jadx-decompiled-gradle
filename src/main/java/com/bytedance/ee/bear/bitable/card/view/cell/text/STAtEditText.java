package com.bytedance.ee.bear.bitable.card.view.cell.text;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.C11768b;

public class STAtEditText extends AtEditText {

    /* renamed from: a */
    public C11768b f13809a;

    @Override // com.bytedance.ee.bear.widget.AtEditText
    public C4678a getPresenter() {
        if (this.f13809a == null) {
            this.f13809a = new C4678a(this);
        }
        return (C4678a) this.f13809a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().mo18348f();
    }

    public STAtEditText(Context context) {
        this(context, null);
    }

    public STAtEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public STAtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
