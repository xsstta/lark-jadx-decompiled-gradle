package com.larksuite.framework.palette.param;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J-\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\r\u0010\u0013\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/larksuite/framework/palette/param/DispatchDrawParam;", "Lcom/larksuite/framework/palette/param/BaseMethodParam;", "canvas", "Landroid/graphics/Canvas;", "superMethod", "Lkotlin/Function1;", "", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "getCanvas", "()Landroid/graphics/Canvas;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "onInvokeSuper", "onInvokeSuper$palette_release", "toString", "", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.d.c */
public final class DispatchDrawParam extends BaseMethodParam {

    /* renamed from: a */
    private final Canvas f64463a;

    /* renamed from: b */
    private final Function1<Canvas, Unit> f64464b;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.framework.palette.d.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ DispatchDrawParam m94341a(DispatchDrawParam cVar, Canvas canvas, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            canvas = cVar.f64463a;
        }
        if ((i & 2) != 0) {
            function1 = cVar.f64464b;
        }
        return cVar.mo92660a(canvas, function1);
    }

    /* renamed from: a */
    public final DispatchDrawParam mo92660a(Canvas canvas, Function1<? super Canvas, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return new DispatchDrawParam(canvas, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchDrawParam)) {
            return false;
        }
        DispatchDrawParam cVar = (DispatchDrawParam) obj;
        return Intrinsics.areEqual(this.f64463a, cVar.f64463a) && Intrinsics.areEqual(this.f64464b, cVar.f64464b);
    }

    public int hashCode() {
        Canvas canvas = this.f64463a;
        int i = 0;
        int hashCode = (canvas != null ? canvas.hashCode() : 0) * 31;
        Function1<Canvas, Unit> function1 = this.f64464b;
        if (function1 != null) {
            i = function1.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DispatchDrawParam(canvas=" + this.f64463a + ", superMethod=" + this.f64464b + ")";
    }

    @Override // com.larksuite.framework.palette.param.BaseMethodParam
    /* renamed from: b */
    public void mo92654b() {
        this.f64464b.invoke(this.f64463a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public DispatchDrawParam(Canvas canvas, Function1<? super Canvas, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        this.f64463a = canvas;
        this.f64464b = function1;
    }
}
