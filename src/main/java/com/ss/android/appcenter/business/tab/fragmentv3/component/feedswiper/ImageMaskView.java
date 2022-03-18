package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ImageMaskView extends View {

    /* renamed from: a */
    public float f70269a;

    public ImageMaskView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f70269a > BitmapDescriptorFactory.HUE_RED) {
            Path path = new Path();
            RectF rectF = new RectF(new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight()));
            float f = this.f70269a;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            path.setFillType(Path.FillType.INVERSE_WINDING);
            canvas.clipPath(path);
            canvas.drawColor(ContextCompat.getColor(getContext(), R.color.bg_float));
        }
        canvas.save();
        super.onDraw(canvas);
        canvas.restore();
    }

    public ImageMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
