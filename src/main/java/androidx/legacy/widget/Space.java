package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Space extends View {
    public void draw(Canvas canvas) {
    }

    public Space(Context context) {
        this(context, null);
    }

    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m5281a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m5281a(getSuggestedMinimumWidth(), i), m5281a(getSuggestedMinimumHeight(), i2));
    }

    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }
}
