package com.ss.ugc.effectplatform.util;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/util/NetworkUtils;", "", "()V", "buildRequestUrl", "", "params", "", "host", "toJson", "T", "list", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.p */
public final class NetworkUtils {

    /* renamed from: a */
    public static final NetworkUtils f165130a = new NetworkUtils();

    private NetworkUtils() {
    }

    /* renamed from: a */
    public final String mo228352a(Map<String, String> map, String str) {
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(str, "host");
        StringBuilder sb = new StringBuilder(str);
        if (!map.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.f165135a.mo228357a(key) && !TextUtils.f165135a.mo228357a(value)) {
                    if (i == 0) {
                        sb.append(key);
                        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb.append(value);
                    } else {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                        sb.append(key);
                        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb.append(value);
                    }
                }
                i++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "urlBuilder.toString()");
        return sb2;
    }
}
