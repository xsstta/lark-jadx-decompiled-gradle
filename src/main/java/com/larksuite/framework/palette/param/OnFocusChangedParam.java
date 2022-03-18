package com.larksuite.framework.palette.param;

import android.graphics.Rect;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J#\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\n0\tHÂ\u0003JM\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\r\u0010\u001b\u001a\u00020\nH\u0010¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/larksuite/framework/palette/param/OnFocusChangedParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "gainFocus", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "superMethod", "Lkotlin/Function3;", "", "(ZILandroid/graphics/Rect;Lkotlin/jvm/functions/Function3;)V", "getDirection", "()I", "getGainFocus", "()Z", "getPreviouslyFocusedRect", "()Landroid/graphics/Rect;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.k */
public final class OnFocusChangedParam extends BaseMethodParam {

    /* renamed from: a */
    private final boolean f64474a;

    /* renamed from: b */
    private final int f64475b;

    /* renamed from: c */
    private final Rect f64476c;

    /* renamed from: d */
    private final Function3<Boolean, Integer, Rect, Unit> f64477d;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.framework.palette.d.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ OnFocusChangedParam m94365a(OnFocusChangedParam kVar, boolean z, int i, Rect rect, Function3 oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = kVar.f64474a;
        }
        if ((i2 & 2) != 0) {
            i = kVar.f64475b;
        }
        if ((i2 & 4) != 0) {
            rect = kVar.f64476c;
        }
        if ((i2 & 8) != 0) {
            oVar = kVar.f64477d;
        }
        return kVar.mo92692a(z, i, rect, oVar);
    }

    /* renamed from: a */
    public final OnFocusChangedParam mo92692a(boolean z, int i, Rect rect, Function3<? super Boolean, ? super Integer, ? super Rect, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        return new OnFocusChangedParam(z, i, rect, oVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnFocusChangedParam) {
                OnFocusChangedParam kVar = (OnFocusChangedParam) obj;
                if (this.f64474a == kVar.f64474a) {
                    if (!(this.f64475b == kVar.f64475b) || !Intrinsics.areEqual(this.f64476c, kVar.f64476c) || !Intrinsics.areEqual(this.f64477d, kVar.f64477d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f64474a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((i * 31) + this.f64475b) * 31;
        Rect rect = this.f64476c;
        int i5 = 0;
        int hashCode = (i4 + (rect != null ? rect.hashCode() : 0)) * 31;
        Function3<Boolean, Integer, Rect, Unit> oVar = this.f64477d;
        if (oVar != null) {
            i5 = oVar.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "OnFocusChangedParam(gainFocus=" + this.f64474a + ", direction=" + this.f64475b + ", previouslyFocusedRect=" + this.f64476c + ", superMethod=" + this.f64477d + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64477d.invoke(Boolean.valueOf(this.f64474a), Integer.valueOf(this.f64475b), this.f64476c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.o<? super java.lang.Boolean, ? super java.lang.Integer, ? super android.graphics.Rect, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public OnFocusChangedParam(boolean z, int i, Rect rect, Function3<? super Boolean, ? super Integer, ? super Rect, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "superMethod");
        this.f64474a = z;
        this.f64475b = i;
        this.f64476c = rect;
        this.f64477d = oVar;
    }
}
