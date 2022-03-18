package com.larksuite.component.ui.badge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.TextDrawableHelper;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J/\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0018J%\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\f\u0010\u001b\u001a\u00020\u000f*\u00020\u0005H\u0002J\f\u0010\u001c\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/ui/badge/BadgeBackgroundProvider;", "", "context", "Landroid/content/Context;", "textDPSize", "", "(Landroid/content/Context;F)V", "defaultHeightPadding", "defaultStrikeWidth", "defaultWidthPadding", "scaleFactor", "textSizePX", "createDrawable", "Landroid/graphics/drawable/Drawable;", "color", "", "helper", "Lcom/larksuite/component/ui/imageview/TextDrawableHelper;", "countType", "hasBorder", "", "createETCDrawable", "etcColor", "getDrawable", "getDrawable$avatar_badge_release", "getETCDrawable", "getETCDrawable$avatar_badge_release", "dp", "dpF", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.a */
public final class BadgeBackgroundProvider {

    /* renamed from: a */
    private final float f62357a = m91441a(5.5f);

    /* renamed from: b */
    private final float f62358b = m91441a(2.0f);

    /* renamed from: c */
    private final float f62359c = m91441a(2.0f);

    /* renamed from: d */
    private float f62360d;

    /* renamed from: e */
    private final float f62361e;

    /* renamed from: f */
    private final Context f62362f;

    /* renamed from: g */
    private final float f62363g;

    /* renamed from: a */
    private final float m91441a(float f) {
        return C25653b.m91892a(this.f62362f, f);
    }

    /* renamed from: b */
    private final int m91442b(float f) {
        return (int) C25653b.m91892a(this.f62362f, f);
    }

    public BadgeBackgroundProvider(Context context, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62362f = context;
        this.f62363g = f;
        this.f62360d = f / 12.0f;
        this.f62361e = C25653b.m91892a(context, f);
    }

    /* renamed from: a */
    public final Drawable mo88908a(int i, int i2, boolean z) {
        return m91443b(i, i2, z);
    }

    /* renamed from: b */
    private final Drawable m91443b(int i, int i2, boolean z) {
        float f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        if (z) {
            f = this.f62359c * this.f62360d;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        gradientDrawable.setStroke((int) f, -1);
        gradientDrawable.setCornerRadius(m91441a(10.0f) * this.f62360d);
        float f2 = this.f62360d;
        float f3 = (float) 2;
        float f4 = f * f3;
        float f5 = this.f62357a;
        gradientDrawable.setSize((int) ((21.0f * f2) + f4 + (f5 * f2 * f3)), (int) ((16.0f * f2) + f4 + (f5 * f2 * f3)));
        Drawable drawable = this.f62362f.getDrawable(R.drawable.badge_etc);
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "context.getDrawable(R.drawable.badge_etc)!!");
        drawable.setTint(i2);
        ScaleDrawable scaleDrawable = new ScaleDrawable(drawable, 17, 1.0f, 1.0f);
        scaleDrawable.setLevel((int) (((float) HwBuildEx.VersionCodes.CUR_DEVELOPMENT) * this.f62360d));
        int intrinsicWidth = (gradientDrawable.getIntrinsicWidth() / 2) - (scaleDrawable.getIntrinsicWidth() / 2);
        int intrinsicHeight = (gradientDrawable.getIntrinsicHeight() / 2) - (scaleDrawable.getIntrinsicHeight() / 2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, scaleDrawable});
        layerDrawable.setLayerInset(1, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight);
        return layerDrawable;
    }

    /* renamed from: a */
    public final Drawable mo88909a(int i, TextDrawableHelper cVar, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        cVar.mo89427a(this.f62361e);
        return m91444b(i, cVar, i2, z);
    }

    /* renamed from: b */
    private final Drawable m91444b(int i, TextDrawableHelper cVar, int i2, boolean z) {
        int i3;
        float f;
        float f2;
        float f3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        if (i2 == 1 || i2 == 3) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        gradientDrawable.setShape(i3);
        if (i3 == 0) {
            gradientDrawable.setCornerRadius(m91441a(10.0f) * this.f62360d);
        }
        if (z) {
            f = this.f62360d * 1.5f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        gradientDrawable.setStroke(m91442b(f), -1);
        if (i2 == 1) {
            this.f62360d *= 0.8f;
            cVar.mo89430a("0");
        }
        float a = cVar.mo89426a();
        float b = cVar.mo89431b();
        if (i3 == 1) {
            float f4 = (float) 2;
            float f5 = this.f62357a;
            float f6 = this.f62360d;
            f2 = Math.max((a / f4) + (f5 * f6) + f, (b / f4) + (this.f62358b * f6) + f) * f4;
            f3 = f2;
        } else {
            float f7 = this.f62357a;
            float f8 = this.f62360d;
            float f9 = (float) 2;
            float f10 = f * f9;
            float f11 = b + (this.f62358b * f8 * f9) + f10;
            f2 = a + (f7 * f8 * f9) + f10;
            f3 = f11;
        }
        gradientDrawable.setSize((int) f2, (int) f3);
        return gradientDrawable;
    }
}
