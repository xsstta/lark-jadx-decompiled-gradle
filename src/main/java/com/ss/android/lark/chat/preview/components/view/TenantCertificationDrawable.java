package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\fH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\bH\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\bH\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/TenantCertificationDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "iconDrawable", "text", "", "bgColor", "", "textColor", "radiusInDp", "horizontalPaddingInDp", "", "verticalPaddingInDp", "iconSizeInDp", "marginInDp", "iconRightPaddingInDp", "fontSizeInPx", "drawableHeightInDp", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;IIIFFIIIFI)V", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "iconBottom", "iconLeft", "iconRight", "iconTop", "textPaint", "Landroid/graphics/Paint;", "textWidth", "textX", "textY", "dp2px", "dp", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.d */
public final class TenantCertificationDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f88259a;

    /* renamed from: b */
    private final float f88260b;

    /* renamed from: c */
    private final float f88261c;

    /* renamed from: d */
    private final GradientDrawable f88262d;

    /* renamed from: e */
    private final float f88263e;

    /* renamed from: f */
    private final int f88264f;

    /* renamed from: g */
    private final int f88265g;

    /* renamed from: h */
    private final int f88266h;

    /* renamed from: i */
    private final int f88267i;

    /* renamed from: j */
    private final Context f88268j;

    /* renamed from: k */
    private final Drawable f88269k;

    /* renamed from: l */
    private final String f88270l;

    /* renamed from: m */
    private final int f88271m;

    /* renamed from: n */
    private final int f88272n;

    /* renamed from: o */
    private final int f88273o;

    /* renamed from: p */
    private final float f88274p;

    /* renamed from: q */
    private final float f88275q;

    /* renamed from: r */
    private final int f88276r;

    /* renamed from: s */
    private final int f88277s;

    /* renamed from: t */
    private final int f88278t;

    /* renamed from: u */
    private final float f88279u;

    /* renamed from: v */
    private final int f88280v;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f88259a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f88259a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f88262d.setBounds(getBounds());
        this.f88262d.draw(canvas);
        Drawable drawable = this.f88269k;
        if (drawable != null) {
            drawable.setBounds(this.f88264f, this.f88265g, this.f88266h, this.f88267i);
            this.f88269k.draw(canvas);
        }
        canvas.drawText(this.f88270l, (this.f88260b / ((float) 2)) + this.f88263e, getBounds().exactCenterY() + this.f88261c, this.f88259a);
    }

    /* renamed from: a */
    private final float m132459a(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public TenantCertificationDrawable(Context context, Drawable drawable, String str, int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, float f3, int i7) {
        float f4;
        float f5;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f88268j = context;
        this.f88269k = drawable;
        this.f88270l = str;
        this.f88271m = i;
        this.f88272n = i2;
        this.f88273o = i3;
        this.f88274p = f;
        this.f88275q = f2;
        this.f88276r = i4;
        this.f88277s = i5;
        this.f88278t = i6;
        this.f88279u = f3;
        this.f88280v = i7;
        Paint paint = new Paint(1);
        paint.setColor(i2);
        paint.setTextSize(f3);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f88259a = paint;
        float measureText = paint.measureText(str);
        this.f88260b = measureText;
        float f6 = (float) 2;
        this.f88261c = (((paint.getFontMetrics().bottom - paint.getFontMetrics().top) / f6) - paint.getFontMetrics().bottom) - m132459a(context, BitmapDescriptorFactory.HUE_RED);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(m132459a(context, (float) i3));
        this.f88262d = gradientDrawable;
        if (drawable != null) {
            f4 = m132459a(context, ((float) i4) + f + ((float) i6));
        } else {
            f4 = m132459a(context, f);
        }
        this.f88263e = f4 + m132459a(context, (float) i5);
        this.f88264f = (int) m132459a(context, ((float) i5) + f);
        this.f88265g = (int) m132459a(context, f2);
        this.f88266h = (int) m132459a(context, ((float) i4) + f + ((float) i5));
        this.f88267i = (int) m132459a(context, f2 + ((float) i4));
        if (drawable != null) {
            f5 = m132459a(context, ((float) i4) + (f * f6) + ((float) i6));
        } else {
            f5 = m132459a(context, f * f6);
        }
        setBounds(new Rect((int) m132459a(context, (float) i5), 0, ((int) (f5 + measureText)) + ((int) m132459a(context, (float) i5)), (int) m132459a(context, (float) i7)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TenantCertificationDrawable(android.content.Context r18, android.graphics.drawable.Drawable r19, java.lang.String r20, int r21, int r22, int r23, float r24, float r25, int r26, int r27, int r28, float r29, int r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 32
            r2 = 2
            if (r1 == 0) goto L_0x0009
            r9 = 2
            goto L_0x000b
        L_0x0009:
            r9 = r23
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0014
            r1 = 1082130432(0x40800000, float:4.0)
            r10 = 1082130432(0x40800000, float:4.0)
            goto L_0x0016
        L_0x0014:
            r10 = r24
        L_0x0016:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001d
            r1 = 0
            r11 = 0
            goto L_0x001f
        L_0x001d:
            r11 = r25
        L_0x001f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0028
            r1 = 12
            r12 = 12
            goto L_0x002a
        L_0x0028:
            r12 = r26
        L_0x002a:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            r13 = 4
            goto L_0x0033
        L_0x0031:
            r13 = r27
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r14 = 2
            goto L_0x003b
        L_0x0039:
            r14 = r28
        L_0x003b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0044
            r1 = 1101004800(0x41a00000, float:20.0)
            r15 = 1101004800(0x41a00000, float:20.0)
            goto L_0x0046
        L_0x0044:
            r15 = r29
        L_0x0046:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x004f
            r0 = 16
            r16 = 16
            goto L_0x0051
        L_0x004f:
            r16 = r30
        L_0x0051:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.components.view.TenantCertificationDrawable.<init>(android.content.Context, android.graphics.drawable.Drawable, java.lang.String, int, int, int, float, float, int, int, int, float, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
