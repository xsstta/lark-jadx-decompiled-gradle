package com.bytedance.ies.bullet.service.schema.param.helper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "", "T", "builder", "<anonymous parameter 1>", "", "value", "invoke", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;"}, mo238835k = 3, mv = {1, 1, 16})
public final class MapParamHelperKt$registerMapHandler$4 extends Lambda implements Function3<Map<?, ?>, String, T, Map<Object, Object>> {
    final /* synthetic */ String $specificKey;
    final /* synthetic */ Function1 $valueBuilder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapParamHelperKt$registerMapHandler$4(Function1 function1, String str) {
        super(3);
        this.$valueBuilder = function1;
        this.$specificKey = str;
    }

    public final Map<Object, Object> invoke(Map<?, ?> map, String str, T t) {
        Intrinsics.checkParameterIsNotNull(map, "builder");
        Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 1>");
        Map<Object, Object> j = C69121n.m265993j(map);
        String str2 = (String) this.$valueBuilder.invoke(t);
        if (str2 != null) {
            j.put(this.$specificKey, str2);
        }
        return j;
    }
}
