package com.larksuite.framework.palette.param;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J9\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0015\u001a\u00020\u0007H\u0010¢\u0006\u0002\b\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/larksuite/framework/palette/param/OnMeasureParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "widthMeasureSpec", "", "heightMeasureSpec", "superMethod", "Lkotlin/Function2;", "", "(IILkotlin/jvm/functions/Function2;)V", "getHeightMeasureSpec", "()I", "getWidthMeasureSpec", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.m */
public final class OnMeasureParam extends BaseMethodParam {

    /* renamed from: a */
    private final int f64484a;

    /* renamed from: b */
    private final int f64485b;

    /* renamed from: c */
    private final Function2<Integer, Integer, Unit> f64486c;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.framework.palette.d.m */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ OnMeasureParam m94371a(OnMeasureParam mVar, int i, int i2, Function2 kVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mVar.f64484a;
        }
        if ((i3 & 2) != 0) {
            i2 = mVar.f64485b;
        }
        if ((i3 & 4) != 0) {
            kVar = mVar.f64486c;
        }
        return mVar.mo92700a(i, i2, kVar);
    }

    /* renamed from: a */
    public final OnMeasureParam mo92700a(int i, int i2, Function2<? super Integer, ? super Integer, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "superMethod");
        return new OnMeasureParam(i, i2, kVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnMeasureParam) {
                OnMeasureParam mVar = (OnMeasureParam) obj;
                if (this.f64484a == mVar.f64484a) {
                    if (!(this.f64485b == mVar.f64485b) || !Intrinsics.areEqual(this.f64486c, mVar.f64486c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.f64484a * 31) + this.f64485b) * 31;
        Function2<Integer, Integer, Unit> kVar = this.f64486c;
        return i + (kVar != null ? kVar.hashCode() : 0);
    }

    public String toString() {
        return "OnMeasureParam(widthMeasureSpec=" + this.f64484a + ", heightMeasureSpec=" + this.f64485b + ", superMethod=" + this.f64486c + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64486c.invoke(Integer.valueOf(this.f64484a), Integer.valueOf(this.f64485b));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.k<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public OnMeasureParam(int i, int i2, Function2<? super Integer, ? super Integer, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "superMethod");
        this.f64484a = i;
        this.f64485b = i2;
        this.f64486c = kVar;
    }
}
