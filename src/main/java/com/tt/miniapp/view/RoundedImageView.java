package com.tt.miniapp.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RoundedImageView extends ImageView {

    /* renamed from: a */
    private RectF f169293a;

    /* renamed from: b */
    private Paint f169294b;

    /* renamed from: c */
    private Canvas f169295c;

    /* renamed from: d */
    private int f169296d;

    private int getCornerRadius() {
        return this.f169296d;
    }

    /* renamed from: a */
    private void m261746a() {
        this.f169294b = new Paint(5);
    }

    /* renamed from: b */
    private void m261748b() {
        if (getWidth() > 0 && getHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f169294b.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            this.f169293a = new RectF((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            this.f169295c = new Canvas(createBitmap);
        }
    }

    public void setCornerRadius(int i) {
        this.f169296d = i;
    }

    public RoundedImageView(Context context) {
        super(context);
        m261746a();
    }

    /* renamed from: a */
    private void m261747a(Drawable drawable) {
        int saveCount = this.f169295c.getSaveCount();
        this.f169295c.save();
        Matrix imageMatrix = getImageMatrix();
        if (imageMatrix != null) {
            this.f169295c.concat(imageMatrix);
        }
        drawable.draw(this.f169295c);
        this.f169295c.restoreToCount(saveCount);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        Matrix imageMatrix = getImageMatrix();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            if (imageMatrix == null && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                drawable.draw(canvas);
                return;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (getCropToPadding()) {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                canvas.clipRect(getPaddingLeft() + scrollX, getPaddingTop() + scrollY, ((scrollX + getRight()) - getLeft()) - getPaddingRight(), ((scrollY + getBottom()) - getTop()) - getPaddingBottom());
            }
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            m261747a(drawable);
            canvas.drawRoundRect(this.f169293a, (float) getCornerRadius(), (float) getCornerRadius(), this.f169294b);
            canvas.restoreToCount(saveCount);
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m261746a();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m261746a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m261748b();
        }
    }
}
