package com.bytedance.ee.larkbrand.utils;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/JsonUtil;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.q */
public final class JsonUtil {

    /* renamed from: a */
    public static final Companion f35285a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final HashMap<String, Object> m54377a(String str) {
        return f35285a.mo49680a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0003J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/JsonUtil$Companion;", "", "()V", "json2Map", "Ljava/util/HashMap;", "", "jsonObject", "Lcom/alibaba/fastjson/JSONObject;", "strJson2Map", "jsonStr", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.q$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final HashMap<String, Object> mo49680a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jsonStr");
            return mo49679a(JSONObject.parseObject(str));
        }

        @JvmStatic
        /* renamed from: a */
        public final HashMap<String, Object> mo49679a(JSONObject jSONObject) {
            HashMap<String, Object> hashMap = new HashMap<>();
            if (jSONObject != null) {
                Set<Map.Entry<String, Object>> entrySet = jSONObject.entrySet();
                Intrinsics.checkExpressionValueIsNotNull(entrySet, "jsonObject.entries");
                for (Map.Entry<String, Object> entry : entrySet) {
                    String key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "entry.key");
                    Object value = entry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                    hashMap.put(key, value);
                }
            }
            return hashMap;
        }
    }
}
