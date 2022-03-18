package com.bytedance.ies.bullet.service.schema.param.helper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", "", "T", "builder", "key", "", "value", "invoke", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;", "com/bytedance/ies/bullet/service/schema/param/helper/MapParamHelperKt$registerMapHandler$2"}, mo238835k = 3, mv = {1, 1, 16})
public final class MapParamHelperKt$registerMapHandlers$$inlined$registerMapHandler$4 extends Lambda implements Function3<Map<?, ?>, String, Integer, Map<Object, Object>> {
    public MapParamHelperKt$registerMapHandlers$$inlined$registerMapHandler$4() {
        super(3);
    }

    public final Map<Object, Object> invoke(Map<?, ?> map, String str, Integer num) {
        Intrinsics.checkParameterIsNotNull(map, "builder");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Map<Object, Object> j = C69121n.m265993j(map);
        String valueOf = String.valueOf(num.intValue());
        if (valueOf != null) {
            j.put(str, valueOf);
        }
        return j;
    }
}
