package com.ss.android.vc.meeting.module.livestream.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.location.LocationRequest;

public class KeyboardDetectorConstraintLayout extends ConstraintLayout {

    /* renamed from: a */
    AbstractC62105a f156029a;

    /* renamed from: b */
    private int f156030b;

    /* renamed from: com.ss.android.vc.meeting.module.livestream.widget.KeyboardDetectorConstraintLayout$a */
    public interface AbstractC62105a {
        /* renamed from: a */
        void mo214889a(int i);

        /* renamed from: b */
        void mo214890b(int i);
    }

    public void setSoftKeyBoardListener(AbstractC62105a aVar) {
        this.f156029a = aVar;
    }

    public KeyboardDetectorConstraintLayout(Context context) {
        this(context, null);
    }

    public KeyboardDetectorConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyboardDetectorConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f156030b = LocationRequest.PRIORITY_HD_ACCURACY;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AbstractC62105a aVar;
        int i5;
        int i6;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 && i4 != 0 && (aVar = this.f156029a) != null) {
            if (i3 != 0 && (i6 = i2 - i4) < (-this.f156030b)) {
                aVar.mo214889a(Math.abs(i6));
            }
            if (i3 != 0 && (i5 = i2 - i4) > this.f156030b) {
                this.f156029a.mo214890b(Math.abs(i5));
            }
        }
    }
}
