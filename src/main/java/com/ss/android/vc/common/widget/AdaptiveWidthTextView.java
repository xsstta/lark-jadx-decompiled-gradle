package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class AdaptiveWidthTextView extends AppCompatTextView {

    /* renamed from: a */
    private int f152008a;

    /* renamed from: b */
    private int f152009b;

    private int getMaxCharacterWidth() {
        int i = this.f152008a;
        if (i > 0) {
            return i;
        }
        for (int i2 = 0; i2 <= 9; i2++) {
            TextPaint paint = getPaint();
            int measureText = ((int) paint.measureText(i2 + "")) + 1;
            if (measureText > this.f152008a) {
                this.f152008a = measureText;
            }
        }
        int measureText2 = ((int) getPaint().measureText(":")) + 1;
        if (measureText2 > this.f152008a) {
            this.f152008a = measureText2;
        }
        return this.f152008a;
    }

    public AdaptiveWidthTextView(Context context) {
        super(context);
    }

    public void setAdaptiveWidthText(String str) {
        if (str != null) {
            if (!(str.length() == this.f152009b || getPaint() == null || getLayoutParams() == null)) {
                getLayoutParams().width = getMaxCharacterWidth() * str.length();
                this.f152009b = str.length();
            }
            super.setText(str);
        }
    }

    public AdaptiveWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdaptiveWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
