package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.location.LocationRequest;

public class KeyboardDetectorConstraintLayout extends ConstraintLayout {

    /* renamed from: a */
    AbstractC65268a f164363a;

    /* renamed from: b */
    private int f164364b;

    /* renamed from: com.ss.lark.android.passport.biz.widget.KeyboardDetectorConstraintLayout$a */
    public interface AbstractC65268a {
        /* renamed from: a */
        void mo224563a(int i);

        /* renamed from: b */
        void mo224564b(int i);
    }

    public void setSoftKeyBoardListener(AbstractC65268a aVar) {
        this.f164363a = aVar;
    }

    public KeyboardDetectorConstraintLayout(Context context) {
        this(context, null);
    }

    public KeyboardDetectorConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyboardDetectorConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164364b = LocationRequest.PRIORITY_HD_ACCURACY;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC65268a aVar;
        int i5;
        int i6;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 && i4 != 0 && (aVar = this.f164363a) != null) {
            if (i3 != 0 && (i6 = i2 - i4) < (-this.f164364b)) {
                aVar.mo224563a(Math.abs(i6));
            }
            if (i3 != 0 && (i5 = i2 - i4) > this.f164364b) {
                this.f164363a.mo224564b(Math.abs(i5));
            }
        }
    }
}
