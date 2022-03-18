package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservedScrollView extends ScrollView {

    /* renamed from: a */
    private AbstractC58309a f143427a;

    /* renamed from: com.ss.android.lark.widget.ObservedScrollView$a */
    public interface AbstractC58309a {
        /* renamed from: a */
        void mo197492a(int i, int i2, int i3, int i4);
    }

    public ObservedScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(AbstractC58309a aVar) {
        this.f143427a = aVar;
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
        AbstractC58309a aVar = this.f143427a;
        if (aVar != null) {
            aVar.mo197492a(i, i2, i3, i4);
        }
    }
}
