package com.ss.android.lark.widget.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/widget/drawable/TenantCertificationDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "iconDrawable", "text", "", "bgColor", "", "textColor", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "iconBottom", "iconLeft", "iconRight", "iconTop", "textPaint", "Landroid/graphics/Paint;", "textWidth", "", "textX", "textY", "dp2px", "dp", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.b.a */
public final class TenantCertificationDrawable extends Drawable {

    /* renamed from: a */
    public static final Companion f143483a = new Companion(null);

    /* renamed from: b */
    private final Paint f143484b;

    /* renamed from: c */
    private final float f143485c;

    /* renamed from: d */
    private final float f143486d;

    /* renamed from: e */
    private final GradientDrawable f143487e;

    /* renamed from: f */
    private final float f143488f;

    /* renamed from: g */
    private final int f143489g;

    /* renamed from: h */
    private final int f143490h;

    /* renamed from: i */
    private final int f143491i;

    /* renamed from: j */
    private final int f143492j;

    /* renamed from: k */
    private final Context f143493k;

    /* renamed from: l */
    private final Drawable f143494l;

    /* renamed from: m */
    private final String f143495m;

    /* renamed from: n */
    private final int f143496n;

    /* renamed from: o */
    private final int f143497o;

    public int getOpacity() {
        return -3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/widget/drawable/TenantCertificationDrawable$Companion;", "", "()V", "DRAWABLE_HEIGHT_IN_DP", "", "FONT_SIZE_IN_DP", "HORIZONTAL_PADDING_IN_DP", "ICON_BOUND_BOTTOM_IN_DP", "ICON_BOUND_RIGHT_IN_DP", "ICON_RIGHT_PADDING_IN_DP", "ICON_SIZE_IN_DP", "MARGIN_IN_DP", "RADIUS_IN_DP", "VERTICAL_PADDING_IN_DP", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void setAlpha(int i) {
        this.f143484b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f143484b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f143487e.setBounds(getBounds());
        this.f143487e.draw(canvas);
        Drawable drawable = this.f143494l;
        if (drawable != null) {
            drawable.setBounds(this.f143489g, this.f143490h, this.f143491i, this.f143492j);
            this.f143494l.draw(canvas);
        }
        canvas.drawText(this.f143495m, (this.f143485c / ((float) 2)) + this.f143488f, getBounds().exactCenterY() + this.f143486d, this.f143484b);
    }

    /* renamed from: a */
    private final float m226145a(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public TenantCertificationDrawable(Context context, Drawable drawable, String str, int i, int i2) {
        float f;
        float f2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f143493k = context;
        this.f143494l = drawable;
        this.f143495m = str;
        this.f143496n = i;
        this.f143497o = i2;
        Paint paint = new Paint(1);
        paint.setColor(i2);
        paint.setTextSize(m226145a(context, (float) 12));
        paint.setTextAlign(Paint.Align.CENTER);
        this.f143484b = paint;
        float measureText = paint.measureText(str);
        this.f143485c = measureText;
        this.f143486d = (((paint.getFontMetrics().bottom - paint.getFontMetrics().top) / ((float) 2)) - paint.getFontMetrics().bottom) - m226145a(context, 1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        float f3 = (float) 4;
        gradientDrawable.setCornerRadius(m226145a(context, f3));
        this.f143487e = gradientDrawable;
        if (drawable != null) {
            f = m226145a(context, (float) 18);
        } else {
            f = m226145a(context, f3);
        }
        this.f143488f = f + m226145a(context, f3);
        this.f143489g = (int) m226145a(context, (float) 8);
        this.f143490h = (int) m226145a(context, (float) 3);
        this.f143491i = (int) m226145a(context, (float) 20);
        this.f143492j = (int) m226145a(context, (float) 15);
        if (drawable != null) {
            f2 = m226145a(context, (float) 22);
        } else {
            f2 = m226145a(context, 8.0f);
        }
        setBounds(new Rect((int) m226145a(context, f3), 0, ((int) (f2 + measureText)) + ((int) m226145a(context, f3)), (int) m226145a(context, (float) 18)));
    }
}
