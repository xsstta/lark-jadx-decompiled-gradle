package androidx.swiperefreshlayout.widget;

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

/* access modifiers changed from: package-private */
/* renamed from: androidx.swiperefreshlayout.widget.a */
public class C1466a extends ImageView {

    /* renamed from: a */
    int f5157a;

    /* renamed from: b */
    private Animation.AnimationListener f5158b;

    /* renamed from: a */
    private boolean m6693a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5158b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5158b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public void mo7795a(Animation.AnimationListener animationListener) {
        this.f5158b = animationListener;
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    private class C1467a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f5160b;

        /* renamed from: c */
        private Paint f5161c = new Paint();

        /* renamed from: a */
        private void m6695a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1466a.this.f5157a, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f5160b = radialGradient;
            this.f5161c.setShader(radialGradient);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m6695a((int) f);
        }

        C1467a(int i) {
            C1466a.this.f5157a = i;
            m6695a((int) rect().width());
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1466a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1466a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f5161c);
            canvas.drawCircle(f, height, (float) (width - C1466a.this.f5157a), paint);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m6693a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f5157a * 2), getMeasuredHeight() + (this.f5157a * 2));
        }
    }

    C1466a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (BitmapDescriptorFactory.HUE_RED * f);
        this.f5157a = (int) (3.5f * f);
        if (m6693a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.m4092k(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1467a(this.f5157a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f5157a, (float) i3, (float) i2, 503316480);
            int i4 = this.f5157a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.m4039a(this, shapeDrawable);
    }
}
