package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class DrawableCenterTextView extends TextView {
    public DrawableCenterTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables != null && compoundDrawables.length == 4) {
            Drawable drawable = compoundDrawables[0];
            Drawable drawable2 = compoundDrawables[2];
            if (!(drawable == null && drawable2 == null)) {
                float measureText = getPaint().measureText(getText().toString());
                int compoundDrawablePadding = getCompoundDrawablePadding();
                if (drawable != null) {
                    i = drawable.getIntrinsicWidth();
                } else {
                    i = drawable2.getIntrinsicWidth();
                }
                float f = measureText + ((float) i) + ((float) compoundDrawablePadding);
                if (drawable != null) {
                    setGravity(19);
                    canvas.translate((((float) getWidth()) - f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
                } else {
                    setGravity(21);
                    canvas.translate((f - ((float) getWidth())) / 2.0f, BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
        super.onDraw(canvas);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawableCenterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
