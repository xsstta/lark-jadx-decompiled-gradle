package com.ss.android.lark.sticker.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/sticker/ui/view/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backgroundPaint", "Landroid/graphics/Paint;", "gradientDrawable", "offset", "", "shimmerAnimator", "Landroid/animation/ValueAnimator;", "createAndStartAnimator", "", "createBackgroundPaint", "createGradientDrawable", "draw", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "isRunning", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "start", "stop", "im_sticker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.sticker.ui.view.b */
public final class ShimmerDrawable extends Drawable implements Animatable {

    /* renamed from: a */
    public float f136319a;

    /* renamed from: b */
    private Drawable f136320b;

    /* renamed from: c */
    private ValueAnimator f136321c;

    /* renamed from: d */
    private Paint f136322d;

    /* renamed from: e */
    private final Context f136323e;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.f136321c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public void start() {
        m214258b();
        m214259c();
        m214257a();
    }

    /* renamed from: a */
    private final void m214257a() {
        Paint paint = new Paint();
        paint.setColor(C25653b.m91894a(this.f136323e, R.color.line_border_card, 0.3f));
        this.f136322d = paint;
    }

    public void stop() {
        this.f136320b = null;
        this.f136322d = null;
        ValueAnimator valueAnimator = this.f136321c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f136321c = null;
    }

    /* renamed from: c */
    private final void m214259c() {
        ValueAnimator valueAnimator = this.f136321c;
        if (!(valueAnimator == null || valueAnimator == null)) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new C55242a(ofFloat, this));
        ofFloat.start();
        this.f136321c = ofFloat;
    }

    /* renamed from: b */
    private final void m214258b() {
        if (this.f136320b == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            int color = UIUtils.getColor(this.f136323e, R.color.line_border_card);
            gradientDrawable.setColors(new int[]{C25653b.m91893a(color, 0.3f), C25653b.m91893a(color, 0.6f), C25653b.m91893a(color, 0.3f)});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            this.f136320b = gradientDrawable;
            invalidateSelf();
        }
    }

    public ShimmerDrawable(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136323e = context;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/sticker/ui/view/ShimmerDrawable$createAndStartAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.sticker.ui.view.b$a */
    public static final class C55242a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f136324a;

        /* renamed from: b */
        final /* synthetic */ ShimmerDrawable f136325b;

        C55242a(ValueAnimator valueAnimator, ShimmerDrawable bVar) {
            this.f136324a = valueAnimator;
            this.f136325b = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable bVar = this.f136325b;
            ValueAnimator valueAnimator2 = this.f136324a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "this");
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                bVar.f136319a = ((Float) animatedValue).floatValue();
                this.f136325b.invalidateSelf();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        int width = getBounds().width();
        float f = (float) (width * 2);
        float f2 = (((float) (width * 3)) * this.f136319a) - f;
        float f3 = f2 + f;
        Drawable drawable = this.f136320b;
        if (drawable != null) {
            drawable.setBounds((int) f2, getBounds().top, (int) f3, getBounds().bottom);
        }
        Drawable drawable2 = this.f136320b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (f2 > ((float) 0)) {
            Paint paint2 = this.f136322d;
            if (paint2 != null) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, (float) getBounds().bottom, paint2);
            }
        } else if (f3 < ((float) width) && (paint = this.f136322d) != null) {
            canvas.drawRect(f3, BitmapDescriptorFactory.HUE_RED, (float) getBounds().right, (float) getBounds().bottom, paint);
        }
    }
}
