package com.ss.android.videoshop.widget.compat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class RelativeLayoutCompat extends RelativeLayout {

    /* renamed from: a */
    private CopyOnWriteArrayList<AbstractC64195a> f162289a;

    public RelativeLayoutCompat(Context context) {
        this(context, null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        super.dispatchWindowFocusChanged(z);
        mo222587a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo222587a(boolean z) {
        CopyOnWriteArrayList<AbstractC64195a> copyOnWriteArrayList = this.f162289a;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<AbstractC64195a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo222589a(z);
            }
        }
    }

    public RelativeLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RelativeLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
