package com.lcodecore.tkrefreshlayout.header.progresslayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.lcodecore.tkrefreshlayout.header.progresslayout.a */
public class C26419a extends ImageView {

    /* renamed from: a */
    public int f65253a;

    /* renamed from: b */
    private Animation.AnimationListener f65254b;

    /* renamed from: a */
    private boolean m95724a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f65254b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f65254b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f65254b = animationListener;
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(getContext().getResources().getColor(i));
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m95724a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f65253a * 2), getMeasuredHeight() + (this.f65253a * 2));
        }
    }

    /* renamed from: com.lcodecore.tkrefreshlayout.header.progresslayout.a$a */
    private class C26420a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f65256b;

        /* renamed from: c */
        private Paint f65257c = new Paint();

        /* renamed from: d */
        private int f65258d;

        public void draw(Canvas canvas, Paint paint) {
            float width = (float) (C26419a.this.getWidth() / 2);
            float height = (float) (C26419a.this.getHeight() / 2);
            canvas.drawCircle(width, height, (float) ((this.f65258d / 2) + C26419a.this.f65253a), this.f65257c);
            canvas.drawCircle(width, height, (float) (this.f65258d / 2), paint);
        }

        public C26420a(int i, int i2) {
            C26419a.this.f65253a = i;
            this.f65258d = i2;
            int i3 = this.f65258d;
            RadialGradient radialGradient = new RadialGradient((float) (i3 / 2), (float) (i3 / 2), (float) C26419a.this.f65253a, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f65256b = radialGradient;
            this.f65257c.setShader(radialGradient);
        }
    }

    public C26419a(Context context, int i, float f) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (f * f2 * 2.0f);
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (BitmapDescriptorFactory.HUE_RED * f2);
        this.f65253a = (int) (3.5f * f2);
        if (m95724a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.m4092k(this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C26420a(this.f65253a, i2));
            ViewCompat.m4033a(this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f65253a, (float) i4, (float) i3, 503316480);
            int i5 = this.f65253a;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(i);
        setBackgroundDrawable(shapeDrawable);
    }
}
