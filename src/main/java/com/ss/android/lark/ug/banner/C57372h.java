package com.ss.android.lark.ug.banner;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"sendEvent", "", "name", "", "params", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ExtensionFunctionType;", "ug-banner_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.h */
public final class C57372h {
    /* renamed from: a */
    public static final void m222400a(String str, Function1<? super JSONObject, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(function1, "params");
        JSONObject jSONObject = new JSONObject();
        function1.invoke(jSONObject);
        Statistics.sendEvent(str, jSONObject);
    }
}
