package com.larksuite.component.universe_design.ratingbar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.huawei.hms.android.HwBuildEx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0014J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/TileDrawable;", "Lcom/larksuite/component/universe_design/ratingbar/BaseDrawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "starWidth", "", "starPadding", "(Landroid/graphics/drawable/Drawable;II)V", "DEFAULT_SCALE", "", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "isBackground", "", "mTileCount", "scaleStars", "tileCount", "getTileCount", "()I", "setTileCount", "(I)V", "mutate", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "width", "height", "setScaleStars", "scale", "setStarPadding", "setStarWidth", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.ratingbar.d */
public final class TileDrawable extends BaseDrawable {

    /* renamed from: b */
    private int f63561b = -1;

    /* renamed from: c */
    private boolean f63562c;

    /* renamed from: d */
    private float f63563d = 1.0f;

    /* renamed from: e */
    private final float f63564e = 100.0f;

    /* renamed from: f */
    private Drawable f63565f;

    /* renamed from: g */
    private int f63566g;

    /* renamed from: h */
    private int f63567h;

    public Drawable mutate() {
        Drawable mutate = this.f63565f.mutate();
        Intrinsics.checkExpressionValueIsNotNull(mutate, "drawable.mutate()");
        this.f63565f = mutate;
        return this;
    }

    /* renamed from: a */
    public final void mo91185a(int i) {
        mo91186a(i, false);
    }

    /* renamed from: b */
    public final void mo91187b(int i) {
        if (this.f63567h != i) {
            this.f63567h = i;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo91188c(int i) {
        if (this.f63566g != i) {
            this.f63566g = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo91184a(float f) {
        if (this.f63563d != f) {
            this.f63563d = f;
            setAlpha(RangesKt.coerceAtMost((int) (f * 255.0f), 255));
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo91186a(int i, boolean z) {
        this.f63562c = z;
        this.f63561b = i;
        invalidateSelf();
    }

    public TileDrawable(Drawable drawable, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f63565f = drawable;
        this.f63566g = i;
        this.f63567h = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.ratingbar.BaseDrawable
    /* renamed from: a */
    public void mo91157a(Canvas canvas, int i, int i2) {
        int i3;
        this.f63565f.setAlpha(this.f63552a);
        ColorFilter a = mo91156a();
        if (a != null) {
            this.f63565f.setColorFilter(a);
        }
        int intrinsicHeight = this.f63565f.getIntrinsicHeight();
        float f = ((float) i) / (((float) this.f63566g) / ((float) intrinsicHeight));
        if (this.f63562c) {
            i3 = this.f63561b;
        } else {
            i3 = (this.f63561b * getLevel()) / HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        }
        float f2 = this.f63563d;
        int i4 = 0;
        if (i3 < 0) {
            int intrinsicWidth = this.f63565f.getIntrinsicWidth();
            while (((float) i4) < f) {
                Drawable drawable = this.f63565f;
                int i5 = this.f63567h;
                drawable.setBounds((i5 / 2) + i4, i5 / 2, i4 + intrinsicHeight + (i5 / 2), (i5 / 2) + intrinsicHeight);
                if (canvas != null) {
                    this.f63565f.draw(canvas);
                }
                i4 += intrinsicWidth;
            }
            return;
        }
        int i6 = this.f63567h / 2;
        while (i4 < i3) {
            if (this.f63562c && i4 / i3 >= getLevel() / HwBuildEx.VersionCodes.CUR_DEVELOPMENT) {
                f2 = 1.0f;
            }
            int i7 = this.f63566g;
            float f3 = (((float) i7) * f2) / ((float) 2);
            float f4 = ((float) i6) + (((float) i7) / 2.0f);
            float f5 = (((float) i7) / 2.0f) + (((float) this.f63567h) / 2.0f);
            this.f63565f.setBounds(C69029a.m265653a(f4 - f3), C69029a.m265653a(f5 - f3), C69029a.m265653a(f4 + f3), C69029a.m265653a(f5 + f3));
            if (canvas != null) {
                this.f63565f.draw(canvas);
            }
            i6 += this.f63566g + this.f63567h;
            i4++;
        }
    }
}
