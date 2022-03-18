package com.tt.miniapp.shortcut.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapphost.util.C67590h;

public class MaxWHLayout extends RelativeLayout {

    /* renamed from: a */
    private float f168611a;

    /* renamed from: b */
    private float f168612b;

    /* renamed from: a */
    private void m260783a() {
        int[] a = C67179c.m261841a(getContext(), false);
        if (a != null && a.length == 2) {
            this.f168611a = C67590h.m263065a(getContext(), (float) a[0]);
            this.f168612b = C67590h.m263065a(getContext(), (float) a[1]);
        }
    }

    public MaxWHLayout(Context context) {
        this(context, null);
    }

    public MaxWHLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        float f = this.f168612b;
        if (((float) size) > f) {
            size = (int) f;
        }
        float f2 = this.f168611a;
        if (((float) size2) > f2) {
            size2 = (int) f2;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public MaxWHLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m260783a();
    }
}
