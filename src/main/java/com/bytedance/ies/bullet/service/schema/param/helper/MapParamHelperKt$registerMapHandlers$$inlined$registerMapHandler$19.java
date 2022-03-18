package com.bytedance.ies.bullet.service.schema.param.helper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "T", "map", "", "<anonymous parameter 1>", "", "invoke", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "com/bytedance/ies/bullet/service/schema/param/helper/MapParamHelperKt$registerMapHandler$3"}, mo238835k = 3, mv = {1, 1, 16})
public final class MapParamHelperKt$registerMapHandlers$$inlined$registerMapHandler$19 extends Lambda implements Function2<Map<?, ?>, String, String> {
    final /* synthetic */ String $specificKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapParamHelperKt$registerMapHandlers$$inlined$registerMapHandler$19(String str) {
        super(2);
        this.$specificKey = str;
    }

    public final String invoke(Map<?, ?> map, String str) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 1>");
        Object obj = map.get(this.$specificKey);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
