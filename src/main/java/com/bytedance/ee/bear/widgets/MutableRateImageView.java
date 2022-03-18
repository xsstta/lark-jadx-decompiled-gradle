package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class MutableRateImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f31780a;

    public MutableRateImageView(Context context) {
        this(context, null);
    }

    public MutableRateImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f31780a != BitmapDescriptorFactory.HUE_RED) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, (int) ((((float) measuredWidth) * 1.0f) / this.f31780a));
        }
    }

    public MutableRateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31780a = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.width_height_rate}).getFloat(0, BitmapDescriptorFactory.HUE_RED);
    }
}
