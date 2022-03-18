package com.larksuite.component.universe_design.drawable;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/universe_design/drawable/UDRoundDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "()V", "mFillColors", "Landroid/content/res/ColorStateList;", "mRadiusAdjustBounds", "", "mStrokeColors", "mStrokeWidth", "", "getStrokeWidth", "isRadiusAdjustBounds", "isStateful", "onBoundsChange", "", "r", "Landroid/graphics/Rect;", "onStateChange", "stateSet", "", "setFillColors", "colors", "setRadiusAdjustBounds", "setStrokeColors", "setStrokeData", "width", "setStrokeWidth", "Companion", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.c.a */
public final class UDRoundDrawable extends GradientDrawable {

    /* renamed from: b */
    public static final Companion f63117b = new Companion(null);

    /* renamed from: a */
    public boolean f63118a;

    /* renamed from: c */
    private ColorStateList f63119c;

    /* renamed from: d */
    private ColorStateList f63120d;

    /* renamed from: e */
    private int f63121e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\bJR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/universe_design/drawable/UDRoundDrawable$Companion;", "", "()V", "generateRoundDrawable", "Lcom/larksuite/component/universe_design/drawable/UDRoundDrawable;", "bgColorStateList", "Landroid/content/res/ColorStateList;", "borderWidth", "", "borderColorStateList", "radius", "radiusTopLeft", "radiusTopRight", "radiusBottomLeft", "radiusBottomRight", "isRadiusAdjustBound", "", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UDRoundDrawable mo90362a(ColorStateList colorStateList, int i, ColorStateList colorStateList2, int i2) {
            return mo90363a(colorStateList, i, colorStateList2, 0, 0, 0, 0, false, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r10 > 0) goto L_0x003e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.larksuite.component.universe_design.drawable.UDRoundDrawable mo90363a(android.content.res.ColorStateList r2, int r3, android.content.res.ColorStateList r4, int r5, int r6, int r7, int r8, boolean r9, int r10) {
            /*
                r1 = this;
                com.larksuite.component.universe_design.c.a r0 = new com.larksuite.component.universe_design.c.a
                r0.<init>()
                r0.mo90355a(r2)
                r0.mo90354a(r3, r4)
                r2 = 0
                if (r5 > 0) goto L_0x001c
                if (r6 > 0) goto L_0x001c
                if (r7 > 0) goto L_0x001c
                if (r8 <= 0) goto L_0x0015
                goto L_0x001c
            L_0x0015:
                float r3 = (float) r10
                r0.setCornerRadius(r3)
                if (r10 <= 0) goto L_0x003f
                goto L_0x003e
            L_0x001c:
                r3 = 8
                float[] r3 = new float[r3]
                float r4 = (float) r5
                r3[r2] = r4
                r5 = 1
                r3[r5] = r4
                r4 = 2
                float r5 = (float) r6
                r3[r4] = r5
                r4 = 3
                r3[r4] = r5
                r4 = 4
                float r5 = (float) r8
                r3[r4] = r5
                r4 = 5
                r3[r4] = r5
                r4 = 6
                float r5 = (float) r7
                r3[r4] = r5
                r4 = 7
                r3[r4] = r5
                r0.setCornerRadii(r3)
            L_0x003e:
                r9 = 0
            L_0x003f:
                r0.f63118a = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.drawable.UDRoundDrawable.Companion.mo90363a(android.content.res.ColorStateList, int, android.content.res.ColorStateList, int, int, int, int, boolean, int):com.larksuite.component.universe_design.c.a");
        }
    }

    /* renamed from: a */
    public final int mo90352a() {
        return this.f63121e;
    }

    /* renamed from: b */
    public final boolean mo90358b() {
        return this.f63118a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.isStateful() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0.isStateful() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f63119c
            if (r0 == 0) goto L_0x000f
            if (r0 != 0) goto L_0x0009
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0009:
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0024
        L_0x000f:
            android.content.res.ColorStateList r0 = r1.f63120d
            if (r0 == 0) goto L_0x001e
            if (r0 != 0) goto L_0x0018
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0018:
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0024
        L_0x001e:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.drawable.UDRoundDrawable.isStateful():boolean");
    }

    /* renamed from: a */
    public final void mo90353a(int i) {
        this.f63121e = i;
        mo90354a(i, this.f63120d);
    }

    /* renamed from: b */
    public final void mo90357b(ColorStateList colorStateList) {
        mo90354a(this.f63121e, colorStateList);
    }

    /* renamed from: a */
    public final void mo90355a(ColorStateList colorStateList) {
        this.f63119c = colorStateList;
        super.setColor(colorStateList);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f63118a && rect != null) {
            setCornerRadius((float) (Math.min(rect.width(), rect.height()) / 2));
        }
    }

    /* renamed from: a */
    public final void mo90356a(boolean z) {
        if (this.f63118a != z) {
            this.f63118a = z;
            if (z) {
                setCornerRadius((float) (Math.min(getBounds().width(), getBounds().height()) / 2));
            }
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f63119c;
        if (colorStateList != null) {
            if (colorStateList == null) {
                Intrinsics.throwNpe();
            }
            setColor(colorStateList.getColorForState(iArr, 0));
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f63120d;
        if (colorStateList2 == null) {
            return onStateChange;
        }
        if (colorStateList2 == null) {
            Intrinsics.throwNpe();
        }
        setStroke(this.f63121e, colorStateList2.getColorForState(iArr, 0));
        return true;
    }

    /* renamed from: a */
    public final void mo90354a(int i, ColorStateList colorStateList) {
        this.f63121e = i;
        this.f63120d = colorStateList;
        super.setStroke(i, colorStateList);
    }
}
