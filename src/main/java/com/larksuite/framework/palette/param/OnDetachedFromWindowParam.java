package com.larksuite.framework.palette.param;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\r\u0010\u000e\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/framework/palette/param/OnDetachedFromWindowParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "superMethod", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.h */
public final class OnDetachedFromWindowParam extends BaseMethodParam {

    /* renamed from: a */
    private final Function0<Unit> f64470a;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.framework.palette.d.h */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ OnDetachedFromWindowParam m94356a(OnDetachedFromWindowParam hVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = hVar.f64470a;
        }
        return hVar.mo92680a(function0);
    }

    /* renamed from: a */
    public final OnDetachedFromWindowParam mo92680a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "superMethod");
        return new OnDetachedFromWindowParam(function0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnDetachedFromWindowParam) && Intrinsics.areEqual(this.f64470a, ((OnDetachedFromWindowParam) obj).f64470a);
        }
        return true;
    }

    public int hashCode() {
        Function0<Unit> function0 = this.f64470a;
        if (function0 != null) {
            return function0.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "OnDetachedFromWindowParam(superMethod=" + this.f64470a + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64470a.invoke();
    }

    public OnDetachedFromWindowParam(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "superMethod");
        this.f64470a = function0;
    }
}
