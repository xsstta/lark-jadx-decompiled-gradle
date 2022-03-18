package com.larksuite.framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservedScrollView extends ScrollView {

    /* renamed from: a */
    private AbstractC26173a f64645a;

    /* renamed from: com.larksuite.framework.ui.ObservedScrollView$a */
    public interface AbstractC26173a {
        /* renamed from: a */
        void mo93133a(int i, int i2, int i3, int i4);
    }

    public ObservedScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(AbstractC26173a aVar) {
        this.f64645a = aVar;
    }

    public ObservedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC26173a aVar = this.f64645a;
        if (aVar != null) {
            aVar.mo93133a(i, i2, i3, i4);
        }
    }
}
