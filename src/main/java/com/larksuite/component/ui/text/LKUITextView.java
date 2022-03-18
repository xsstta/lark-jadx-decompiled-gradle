package com.larksuite.component.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.p1153e.C25655d;

public class LKUITextView extends AppCompatTextView {

    /* renamed from: a */
    private static final float[][] f63006a = {new float[]{26.0f, 10.0f}, new float[]{20.0f, 8.0f}, new float[]{17.0f, 7.0f}, new float[]{16.0f, 8.0f}, new float[]{14.0f, 8.0f}, new float[]{12.0f, 4.0f}, new float[]{11.0f, 3.0f}};

    /* renamed from: a */
    private void m92354a() {
        if (getLineSpacingExtra() == BitmapDescriptorFactory.HUE_RED && getLineSpacingMultiplier() == 1.0f) {
            int lineHeight = getLineHeight();
            float textSize = getTextSize();
            setLineSpacing(m92353a(textSize) - (((float) lineHeight) - textSize), 1.0f);
        }
    }

    public LKUITextView(Context context) {
        super(context);
        m92354a();
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        m92354a();
    }

    /* renamed from: a */
    private float m92353a(float f) {
        float f2;
        float b = (float) C25655d.m91904b(getContext(), f);
        float[][] fArr = f63006a;
        if (b >= fArr[0][0]) {
            f2 = fArr[0][1];
        } else if (b <= fArr[fArr.length - 1][0]) {
            f2 = fArr[fArr.length - 1][1];
        } else {
            float f3 = BitmapDescriptorFactory.HUE_RED;
            int i = 0;
            while (true) {
                float[][] fArr2 = f63006a;
                if (i >= fArr2.length - 1) {
                    break;
                }
                float[] fArr3 = fArr2[i];
                i++;
                float[] fArr4 = fArr2[i];
                if (fArr3[0] >= b && fArr4[0] <= b) {
                    float f4 = fArr3[1];
                    float f5 = fArr4[1];
                    float f6 = fArr3[0];
                    float f7 = fArr4[0];
                    f3 = (((f4 - f5) / (f6 - f7)) * (b - f7)) + fArr4[1];
                }
            }
            f2 = f3;
        }
        return C25653b.m91892a(getContext(), f2);
    }

    public LKUITextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92354a();
    }

    public LKUITextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92354a();
    }
}
