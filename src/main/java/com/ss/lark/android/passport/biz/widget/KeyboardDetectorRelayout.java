package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.hms.location.LocationRequest;

public class KeyboardDetectorRelayout extends RelativeLayout {

    /* renamed from: a */
    AbstractC65269a f164365a;

    /* renamed from: b */
    private int f164366b;

    /* renamed from: com.ss.lark.android.passport.biz.widget.KeyboardDetectorRelayout$a */
    public interface AbstractC65269a {
        /* renamed from: a */
        void mo224567a(int i);

        /* renamed from: b */
        void mo224568b(int i);
    }

    public void setSoftKeyBoardListener(AbstractC65269a aVar) {
        this.f164365a = aVar;
    }

    public KeyboardDetectorRelayout(Context context) {
        this(context, null);
    }

    public KeyboardDetectorRelayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyboardDetectorRelayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164366b = LocationRequest.PRIORITY_HD_ACCURACY;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC65269a aVar;
        int i5;
        int i6;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 && i4 != 0 && (aVar = this.f164365a) != null) {
            if (i3 != 0 && (i6 = i2 - i4) < (-this.f164366b)) {
                aVar.mo224567a(Math.abs(i6));
            }
            if (i3 != 0 && (i5 = i2 - i4) > this.f164366b) {
                this.f164365a.mo224568b(Math.abs(i5));
            }
        }
    }
}
