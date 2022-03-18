package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.C22402m;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class ShapeableImageView extends AppCompatImageView implements AbstractC22413o {

    /* renamed from: d */
    private static final int f54614d = 2131887390;

    /* renamed from: a */
    public final RectF f54615a;

    /* renamed from: b */
    public C22398l f54616b;

    /* renamed from: c */
    public final MaterialShapeDrawable f54617c;

    /* renamed from: e */
    private final C22402m f54618e;

    /* renamed from: f */
    private final RectF f54619f;

    /* renamed from: g */
    private final Paint f54620g;

    /* renamed from: h */
    private final Paint f54621h;

    /* renamed from: i */
    private final Path f54622i;

    /* renamed from: j */
    private ColorStateList f54623j;

    /* renamed from: k */
    private float f54624k;

    /* renamed from: l */
    private Path f54625l;

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return this.f54616b;
    }

    public ColorStateList getStrokeColor() {
        return this.f54623j;
    }

    public float getStrokeWidth() {
        return this.f54624k;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f54623j = colorStateList;
        invalidate();
    }

    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    class C22319a extends ViewOutlineProvider {

        /* renamed from: b */
        private final Rect f54627b = new Rect();

        C22319a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f54616b != null) {
                ShapeableImageView.this.f54615a.round(this.f54627b);
                ShapeableImageView.this.f54617c.setBounds(this.f54627b);
                ShapeableImageView.this.f54617c.getOutline(outline);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f54625l, this.f54621h);
        m80815a(canvas);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C0215a.m652a(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f54624k != f) {
            this.f54624k = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        this.f54616b = lVar;
        this.f54617c.setShapeAppearanceModel(lVar);
        m80814a(getWidth(), getHeight());
        invalidate();
    }

    /* renamed from: a */
    private void m80815a(Canvas canvas) {
        if (this.f54623j != null) {
            this.f54620g.setStrokeWidth(this.f54624k);
            int colorForState = this.f54623j.getColorForState(getDrawableState(), this.f54623j.getDefaultColor());
            if (this.f54624k > BitmapDescriptorFactory.HUE_RED && colorForState != 0) {
                this.f54620g.setColor(colorForState);
                canvas.drawPath(this.f54622i, this.f54620g);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m80814a(int i, int i2) {
        this.f54615a.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f54618e.mo78040a(this.f54616b, 1.0f, this.f54615a, this.f54622i);
        this.f54625l.rewind();
        this.f54625l.addPath(this.f54622i);
        this.f54619f.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        this.f54625l.addRect(this.f54619f, Path.Direction.CCW);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m80814a(i, i2);
    }
}
