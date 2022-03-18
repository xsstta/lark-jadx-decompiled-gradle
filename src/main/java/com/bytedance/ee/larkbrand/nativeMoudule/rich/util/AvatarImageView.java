package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class AvatarImageView extends AppCompatImageView {

    /* renamed from: a */
    private Paint f35112a = new Paint();

    /* renamed from: b */
    private Canvas f35113b;

    /* renamed from: a */
    private void m54017a() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.f35112a.setShader(new BitmapShader(createBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        this.f35113b = new Canvas(createBitmap);
    }

    public AvatarImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            canvas.save();
            int width = getWidth();
            m54018a(drawable);
            float f = (float) (width / 2);
            canvas.drawCircle(f, f, f, this.f35112a);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private void m54018a(Drawable drawable) {
        int saveCount = this.f35113b.getSaveCount();
        this.f35113b.save();
        drawable.setBounds(0, 0, getWidth(), getHeight());
        drawable.draw(this.f35113b);
        this.f35113b.restoreToCount(saveCount);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m54017a();
        }
    }
}
