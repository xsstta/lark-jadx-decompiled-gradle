package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.larksuite.suite.R;

public class MotionTelltales extends MockView {

    /* renamed from: b */
    MotionLayout f2755b;

    /* renamed from: c */
    float[] f2756c;

    /* renamed from: d */
    Matrix f2757d;

    /* renamed from: e */
    int f2758e;

    /* renamed from: f */
    int f2759f;

    /* renamed from: g */
    float f2760g;

    /* renamed from: h */
    private Paint f2761h;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(CharSequence charSequence) {
        this.f2744a = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context) {
        super(context);
        this.f2761h = new Paint();
        this.f2756c = new float[2];
        this.f2757d = new Matrix();
        this.f2758e = 0;
        this.f2759f = -65281;
        this.f2760g = 0.25f;
        m3330a(context, null);
    }

    @Override // androidx.constraintlayout.utils.widget.MockView
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2757d);
        if (this.f2755b == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2755b = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f2755b.mo3155a(this, f2, f, this.f2756c, this.f2758e);
                this.f2757d.mapVectors(this.f2756c);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f2756c;
                float f5 = fArr2[0];
                float f6 = this.f2760g;
                float f7 = f4 - (fArr2[1] * f6);
                this.f2757d.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f2761h);
            }
        }
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2761h = new Paint();
        this.f2756c = new float[2];
        this.f2757d = new Matrix();
        this.f2758e = 0;
        this.f2759f = -65281;
        this.f2760g = 0.25f;
        m3330a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3330a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.telltales_tailColor, R.attr.telltales_tailScale, R.attr.telltales_velocityMode});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2759f = obtainStyledAttributes.getColor(index, this.f2759f);
                } else if (index == 2) {
                    this.f2758e = obtainStyledAttributes.getInt(index, this.f2758e);
                } else if (index == 1) {
                    this.f2760g = obtainStyledAttributes.getFloat(index, this.f2760g);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2761h.setColor(this.f2759f);
        this.f2761h.setStrokeWidth(5.0f);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2761h = new Paint();
        this.f2756c = new float[2];
        this.f2757d = new Matrix();
        this.f2758e = 0;
        this.f2759f = -65281;
        this.f2760g = 0.25f;
        m3330a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }
}
