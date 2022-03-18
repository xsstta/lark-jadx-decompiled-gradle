package com.bytedance.ee.bear.lynx.impl.xbridge;

import com.bytedance.ies.xbridge.XReadableMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"getNumber", "", "intParser", "Lkotlin/Function0;", "", "doubleParser", "", "Lcom/bytedance/ies/xbridge/XReadableMap;", "key", "", "lynx-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.a */
public final class C8846a {
    /* renamed from: a */
    public static final Number m37088a(XReadableMap hVar, String str) {
        Object obj;
        int i;
        Object obj2;
        double d;
        Intrinsics.checkParameterIsNotNull(hVar, "$this$getNumber");
        Intrinsics.checkParameterIsNotNull(str, "key");
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl(Integer.valueOf(hVar.mo53106e(str)));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Double d2 = null;
        if (Result.m271575isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        try {
            Result.Companion aVar3 = Result.Companion;
            obj2 = Result.m271569constructorimpl(Double.valueOf(hVar.mo53105d(str)));
        } catch (Throwable th2) {
            Result.Companion aVar4 = Result.Companion;
            obj2 = Result.m271569constructorimpl(C69097g.m265890a(th2));
        }
        if (!Result.m271575isFailureimpl(obj2)) {
            d2 = obj2;
        }
        Double d3 = d2;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = 0.0d;
        }
        if (Double.compare((double) i, d) == 0) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (Double.compare(d, (double) j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }
}
