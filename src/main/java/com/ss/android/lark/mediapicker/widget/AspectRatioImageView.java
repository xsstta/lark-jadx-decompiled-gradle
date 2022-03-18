package com.ss.android.lark.mediapicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class AspectRatioImageView extends AppCompatImageView {

    /* renamed from: a */
    private float f113364a = -1.0f;

    public AspectRatioImageView(Context context) {
        super(context);
    }

    public void setAspectRatio(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            this.f113364a = f;
        } else {
            this.f113364a = -1.0f;
        }
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo158478a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            this.f113364a = -1.0f;
        } else {
            this.f113364a = ((float) i) / ((float) i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f113364a > BitmapDescriptorFactory.HUE_RED) {
            setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            if (measuredHeight > 0) {
                int i3 = (int) (((float) measuredHeight) * this.f113364a);
                if (i3 > getMaxWidth()) {
                    i3 = getMaxWidth();
                }
                if (i3 < getMinimumWidth()) {
                    i3 = getMinimumWidth();
                }
                if (i3 > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    i2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                }
            } else if (measuredWidth > 0) {
                if (measuredWidth > getMaxWidth()) {
                    measuredWidth = getMaxWidth();
                }
                if (measuredWidth < getMinimumWidth()) {
                    measuredWidth = getMinimumWidth();
                }
                int i4 = (int) (((float) measuredWidth) / this.f113364a);
                if (i4 > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
