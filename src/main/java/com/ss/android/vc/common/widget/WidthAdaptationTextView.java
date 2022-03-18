package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class WidthAdaptationTextView extends AppCompatTextView {
    public WidthAdaptationTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private float m236414a(Layout layout) {
        int lineCount = layout.getLineCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(layout.getLineWidth(i), f);
        }
        return f;
    }

    public WidthAdaptationTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) Math.ceil((double) m236414a(getLayout())), getMeasuredHeight());
    }

    public WidthAdaptationTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
