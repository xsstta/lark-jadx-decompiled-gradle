package com.ss.android.lark.calendar.impl.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003J\"\u0010\u000f\u001a\u00020\u00002\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014J\b\u0010%\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010&\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0014J,\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003J\"\u0010\u001c\u001a\u00020\u00002\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0003J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0003H\u0016J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/RoundRectDrawable;", "Landroid/graphics/drawable/Drawable;", "color", "", "leftTop", "rightTop", "rightBottom", "leftBottom", "inverse", "", "(IIIIIZ)V", "()V", "fillColor", "fillPath", "Landroid/graphics/Path;", "fillShader", "Landroid/graphics/Shader;", "fillShaderProvider", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "Lcom/ss/android/lark/calendar/impl/utils/ShaderProvider;", "innerRadii", "", "paint", "Landroid/graphics/Paint;", "radii", "ringColor", "ringPath", "ringShader", "ringShaderProvider", "ringSize", "draw", "", "canvas", "Landroid/graphics/Canvas;", C60375c.f150914a, "shaderProvider", "getOpacity", "onBoundsChange", "bounds", "s", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "updateFillPath", "updateRingPath", "updateShader", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.ag */
public class RoundRectDrawable extends Drawable {

    /* renamed from: a */
    private int f83733a;

    /* renamed from: b */
    private Function1<? super Rect, ? extends Shader> f83734b;

    /* renamed from: c */
    private Shader f83735c;

    /* renamed from: d */
    private final float[] f83736d;

    /* renamed from: e */
    private final Path f83737e;

    /* renamed from: f */
    private boolean f83738f;

    /* renamed from: g */
    private int f83739g;

    /* renamed from: h */
    private Function1<? super Rect, ? extends Shader> f83740h;

    /* renamed from: i */
    private Shader f83741i;

    /* renamed from: j */
    private int f83742j;

    /* renamed from: k */
    private final float[] f83743k;

    /* renamed from: l */
    private final Path f83744l;

    /* renamed from: m */
    private final Paint f83745m;

    public int getOpacity() {
        return -3;
    }

    public RoundRectDrawable() {
        float[] fArr = new float[8];
        this.f83736d = fArr;
        this.f83737e = new Path();
        this.f83743k = new float[fArr.length];
        this.f83744l = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f83745m = paint;
    }

    /* renamed from: a */
    private final void m125186a() {
        Path.FillType fillType;
        this.f83737e.rewind();
        Path path = this.f83737e;
        if (this.f83738f) {
            fillType = Path.FillType.INVERSE_WINDING;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
        this.f83737e.addRoundRect(new RectF(getBounds()), this.f83736d, Path.Direction.CW);
    }

    /* renamed from: c */
    private final void m125188c() {
        Shader shader;
        Function1<? super Rect, ? extends Shader> function1 = this.f83734b;
        Shader shader2 = null;
        if (function1 != null) {
            Rect bounds = getBounds();
            Intrinsics.checkExpressionValueIsNotNull(bounds, "bounds");
            shader = (Shader) function1.invoke(bounds);
        } else {
            shader = null;
        }
        this.f83735c = shader;
        Function1<? super Rect, ? extends Shader> function12 = this.f83740h;
        if (function12 != null) {
            Rect bounds2 = getBounds();
            Intrinsics.checkExpressionValueIsNotNull(bounds2, "bounds");
            shader2 = (Shader) function12.invoke(bounds2);
        }
        this.f83741i = shader2;
    }

    /* renamed from: b */
    private final void m125187b() {
        if (this.f83742j > 0) {
            RectF rectF = new RectF(getBounds());
            float hypot = ((float) 1) - (((float) (this.f83742j * 2)) / ((float) Math.hypot((double) rectF.width(), (double) rectF.height())));
            int length = this.f83743k.length;
            for (int i = 0; i < length; i++) {
                this.f83743k[i] = this.f83736d[i] * hypot;
            }
            this.f83744l.rewind();
            this.f83744l.addRoundRect(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f83736d, Path.Direction.CW);
            this.f83744l.addRoundRect(rectF.left + ((float) this.f83742j), rectF.top + ((float) this.f83742j), rectF.right - ((float) this.f83742j), rectF.bottom - ((float) this.f83742j), this.f83743k, Path.Direction.CCW);
        }
    }

    /* renamed from: a */
    public final RoundRectDrawable mo120301a(int i) {
        this.f83733a = i;
        invalidateSelf();
        return this;
    }

    public void setAlpha(int i) {
        this.f83745m.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f83745m.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final RoundRectDrawable mo120304a(boolean z) {
        this.f83738f = z;
        m125186a();
        invalidateSelf();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m125186a();
        m125187b();
        m125188c();
    }

    /* renamed from: a */
    public final RoundRectDrawable mo120303a(Function1<? super Rect, ? extends Shader> function1) {
        if (function1 != null) {
            this.f83733a = (int) 4294967295L;
        } else {
            function1 = null;
        }
        this.f83734b = function1;
        m125188c();
        invalidateSelf();
        return this;
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f83745m.setShader(this.f83735c);
        this.f83745m.setColor(this.f83733a);
        canvas.drawPath(this.f83737e, this.f83745m);
        if (this.f83739g != 0 && this.f83742j > 0) {
            this.f83745m.setShader(this.f83741i);
            this.f83745m.setColor(this.f83739g);
            canvas.drawPath(this.f83744l, this.f83745m);
        }
    }

    /* renamed from: a */
    public final RoundRectDrawable mo120302a(int i, int i2, int i3, int i4) {
        float[] fArr = this.f83736d;
        fArr[0] = (float) i;
        fArr[1] = fArr[0];
        fArr[2] = (float) i2;
        fArr[3] = fArr[2];
        fArr[4] = (float) i3;
        fArr[5] = fArr[4];
        fArr[6] = (float) i4;
        fArr[7] = fArr[6];
        m125186a();
        m125187b();
        invalidateSelf();
        return this;
    }

    public RoundRectDrawable(int i, int i2, int i3, int i4, int i5, boolean z) {
        this();
        mo120301a(i);
        mo120302a(i2, i3, i4, i5);
        mo120304a(z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoundRectDrawable(int r7, int r8, int r9, int r10, int r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = 0
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r2
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r3
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.utils.RoundRectDrawable.<init>(int, int, int, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
