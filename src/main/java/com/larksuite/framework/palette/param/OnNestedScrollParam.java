package com.larksuite.framework.palette.param;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012,\u0010\t\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J/\u0010\u0019\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003Jm\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052.\b\u0002\u0010\t\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\r\u0010 \u001a\u00020\u000bH\u0010¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR4\u0010\t\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/larksuite/framework/palette/param/OnNestedScrollParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "target", "Landroid/view/View;", "dxConsumed", "", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "superMethod", "Lkotlin/Function5;", "", "(Landroid/view/View;IIIILkotlin/jvm/functions/Function5;)V", "getDxConsumed", "()I", "getDxUnconsumed", "getDyConsumed", "getDyUnconsumed", "getTarget", "()Landroid/view/View;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.n */
public final class OnNestedScrollParam extends BaseMethodParam {

    /* renamed from: a */
    private final View f64487a;

    /* renamed from: b */
    private final int f64488b;

    /* renamed from: c */
    private final int f64489c;

    /* renamed from: d */
    private final int f64490d;

    /* renamed from: e */
    private final int f64491e;

    /* renamed from: f */
    private final Function5<View, Integer, Integer, Integer, Integer, Unit> f64492f;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.larksuite.framework.palette.d.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ OnNestedScrollParam m94374a(OnNestedScrollParam nVar, View view, int i, int i2, int i3, int i4, Function5 qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            view = nVar.f64487a;
        }
        if ((i5 & 2) != 0) {
            i = nVar.f64488b;
        }
        if ((i5 & 4) != 0) {
            i2 = nVar.f64489c;
        }
        if ((i5 & 8) != 0) {
            i3 = nVar.f64490d;
        }
        if ((i5 & 16) != 0) {
            i4 = nVar.f64491e;
        }
        if ((i5 & 32) != 0) {
            qVar = nVar.f64492f;
        }
        return nVar.mo92704a(view, i, i2, i3, i4, qVar);
    }

    /* renamed from: a */
    public final OnNestedScrollParam mo92704a(View view, int i, int i2, int i3, int i4, Function5<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "superMethod");
        return new OnNestedScrollParam(view, i, i2, i3, i4, qVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnNestedScrollParam) {
                OnNestedScrollParam nVar = (OnNestedScrollParam) obj;
                if (Intrinsics.areEqual(this.f64487a, nVar.f64487a)) {
                    if (this.f64488b == nVar.f64488b) {
                        if (this.f64489c == nVar.f64489c) {
                            if (this.f64490d == nVar.f64490d) {
                                if (!(this.f64491e == nVar.f64491e) || !Intrinsics.areEqual(this.f64492f, nVar.f64492f)) {
                                    return false;
                                }
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
        View view = this.f64487a;
        int i = 0;
        int hashCode = (((((((((view != null ? view.hashCode() : 0) * 31) + this.f64488b) * 31) + this.f64489c) * 31) + this.f64490d) * 31) + this.f64491e) * 31;
        Function5<View, Integer, Integer, Integer, Integer, Unit> qVar = this.f64492f;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OnNestedScrollParam(target=" + this.f64487a + ", dxConsumed=" + this.f64488b + ", dyConsumed=" + this.f64489c + ", dxUnconsumed=" + this.f64490d + ", dyUnconsumed=" + this.f64491e + ", superMethod=" + this.f64492f + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64492f.invoke(this.f64487a, Integer.valueOf(this.f64488b), Integer.valueOf(this.f64489c), Integer.valueOf(this.f64490d), Integer.valueOf(this.f64491e));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.q<? super android.view.View, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public OnNestedScrollParam(View view, int i, int i2, int i3, int i4, Function5<? super View, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "superMethod");
        this.f64487a = view;
        this.f64488b = i;
        this.f64489c = i2;
        this.f64490d = i3;
        this.f64491e = i4;
        this.f64492f = qVar;
    }
}
