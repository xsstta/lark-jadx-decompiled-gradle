package com.larksuite.framework.palette.param;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J)\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0012\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/larksuite/framework/palette/param/SetGravityParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "gravity", "", "superMethod", "Lkotlin/Function1;", "", "(ILkotlin/jvm/functions/Function1;)V", "getGravity", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.s */
public final class SetGravityParam extends BaseMethodParam {

    /* renamed from: a */
    private final int f64509a;

    /* renamed from: b */
    private final Function1<Integer, Unit> f64510b;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.framework.palette.d.s */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ SetGravityParam m94389a(SetGravityParam sVar, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sVar.f64509a;
        }
        if ((i2 & 2) != 0) {
            function1 = sVar.f64510b;
        }
        return sVar.mo92724a(i, function1);
    }

    /* renamed from: a */
    public final SetGravityParam mo92724a(int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return new SetGravityParam(i, function1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetGravityParam) {
                SetGravityParam sVar = (SetGravityParam) obj;
                if (!(this.f64509a == sVar.f64509a) || !Intrinsics.areEqual(this.f64510b, sVar.f64510b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f64509a * 31;
        Function1<Integer, Unit> function1 = this.f64510b;
        return i + (function1 != null ? function1.hashCode() : 0);
    }

    public String toString() {
        return "SetGravityParam(gravity=" + this.f64509a + ", superMethod=" + this.f64510b + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64510b.invoke(Integer.valueOf(this.f64509a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public SetGravityParam(int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        this.f64509a = i;
        this.f64510b = function1;
    }
}
