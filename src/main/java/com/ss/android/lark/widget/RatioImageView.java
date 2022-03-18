package com.ss.android.lark.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RatioImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f143428a;

    public RatioImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m226090a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ratio});
        this.f143428a = obtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.f143428a;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) / f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public RatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226090a(attributeSet);
    }
}
