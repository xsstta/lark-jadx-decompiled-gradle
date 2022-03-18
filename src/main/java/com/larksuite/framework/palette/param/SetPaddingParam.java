package com.larksuite.framework.palette.param;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÂ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032&\b\u0002\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\r\u0010\u001b\u001a\u00020\tH\u0010¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR,\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/larksuite/framework/palette/param/SetPaddingParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "left", "", "top", "right", "bottom", "superMethod", "Lkotlin/Function4;", "", "(IIIILkotlin/jvm/functions/Function4;)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.u */
public final class SetPaddingParam extends BaseMethodParam {

    /* renamed from: a */
    private final int f64513a;

    /* renamed from: b */
    private final int f64514b;

    /* renamed from: c */
    private final int f64515c;

    /* renamed from: d */
    private final int f64516d;

    /* renamed from: e */
    private final Function4<Integer, Integer, Integer, Integer, Unit> f64517e;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.larksuite.framework.palette.d.u */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ SetPaddingParam m94395a(SetPaddingParam uVar, int i, int i2, int i3, int i4, Function4 pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = uVar.f64513a;
        }
        if ((i5 & 2) != 0) {
            i2 = uVar.f64514b;
        }
        if ((i5 & 4) != 0) {
            i3 = uVar.f64515c;
        }
        if ((i5 & 8) != 0) {
            i4 = uVar.f64516d;
        }
        if ((i5 & 16) != 0) {
            pVar = uVar.f64517e;
        }
        return uVar.mo92732a(i, i2, i3, i4, pVar);
    }

    /* renamed from: a */
    public final SetPaddingParam mo92732a(int i, int i2, int i3, int i4, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "superMethod");
        return new SetPaddingParam(i, i2, i3, i4, pVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetPaddingParam) {
                SetPaddingParam uVar = (SetPaddingParam) obj;
                if (this.f64513a == uVar.f64513a) {
                    if (this.f64514b == uVar.f64514b) {
                        if (this.f64515c == uVar.f64515c) {
                            if (!(this.f64516d == uVar.f64516d) || !Intrinsics.areEqual(this.f64517e, uVar.f64517e)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((((((this.f64513a * 31) + this.f64514b) * 31) + this.f64515c) * 31) + this.f64516d) * 31;
        Function4<Integer, Integer, Integer, Integer, Unit> pVar = this.f64517e;
        return i + (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "SetPaddingParam(left=" + this.f64513a + ", top=" + this.f64514b + ", right=" + this.f64515c + ", bottom=" + this.f64516d + ", superMethod=" + this.f64517e + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64517e.invoke(Integer.valueOf(this.f64513a), Integer.valueOf(this.f64514b), Integer.valueOf(this.f64515c), Integer.valueOf(this.f64516d));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.p<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public SetPaddingParam(int i, int i2, int i3, int i4, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "superMethod");
        this.f64513a = i;
        this.f64514b = i2;
        this.f64515c = i3;
        this.f64516d = i4;
        this.f64517e = pVar;
    }
}
