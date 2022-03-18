package com.bytedance.ee.bear.debug.fgpreview;

import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/JsonToMapUtil;", "", "()V", "TAG", "", "transJsonObjToMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.fgpreview.c */
public final class JsonToMapUtil {

    /* renamed from: a */
    public static final JsonToMapUtil f15206a = new JsonToMapUtil();

    private JsonToMapUtil() {
    }

    /* renamed from: a */
    public final HashMap<String, String> mo21314a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        Intrinsics.checkExpressionValueIsNotNull(next, "key");
                        hashMap.put(next, optString);
                    }
                }
            } catch (Exception e) {
                C13479a.m54761a("JsonToMapUtil", e);
            }
        }
        return hashMap;
    }
}
