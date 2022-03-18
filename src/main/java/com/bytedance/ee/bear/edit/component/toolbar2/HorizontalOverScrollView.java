package com.bytedance.ee.bear.edit.component.toolbar2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.List;

public class HorizontalOverScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private List<AbstractC7602a> f20627a = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView$a */
    public interface AbstractC7602a {
        void onScrollChanged(int i, int i2);
    }

    /* renamed from: a */
    public void mo29917a(AbstractC7602a aVar) {
        this.f20627a.add(aVar);
    }

    /* renamed from: b */
    public void mo29918b(AbstractC7602a aVar) {
        this.f20627a.remove(aVar);
    }

    public HorizontalOverScrollView(Context context) {
        super(context);
    }

    public HorizontalOverScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f20627a.size() > 0) {
            for (AbstractC7602a aVar : this.f20627a) {
                aVar.onScrollChanged(getScrollX(), getScrollY());
            }
        }
    }
}
