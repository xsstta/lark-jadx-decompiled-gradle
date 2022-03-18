package com.bytedance.ies.xbridge.utils;

import com.bytedance.ies.xbridge.XKeyIterator;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0005\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/xbridge/utils/XReadableJSONUtils;", "", "()V", "jsonArrayToArray", "", "value", "Lorg/json/JSONArray;", "jsonObjectToMap", "", "", "Lorg/json/JSONObject;", "xReadableArrayToJSONArray", "Lcom/bytedance/ies/xbridge/XReadableArray;", "xReadableMapToJSONObject", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.h.b */
public final class XReadableJSONUtils {

    /* renamed from: a */
    public static final XReadableJSONUtils f38087a = new XReadableJSONUtils();

    private XReadableJSONUtils() {
    }

    /* renamed from: a */
    public final Map<String, Object> mo53179a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "key");
            Object obj = jSONObject.get(next);
            Intrinsics.checkExpressionValueIsNotNull(obj, "value.get(key)");
            linkedHashMap.put(next, obj);
        }
        return MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final JSONObject mo53181a(XReadableMap hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "value");
        JSONObject jSONObject = new JSONObject();
        XKeyIterator a = hVar.mo53100a();
        while (a.mo53089a()) {
            String b = a.mo53090b();
            switch (C14447c.f38089b[hVar.mo53111j(b).ordinal()]) {
                case 1:
                    XReadableArray g = hVar.mo53108g(b);
                    if (g == null) {
                        break;
                    } else {
                        jSONObject.put(b, f38087a.mo53180a(g));
                        break;
                    }
                case 2:
                    XReadableMap h = hVar.mo53109h(b);
                    if (h == null) {
                        break;
                    } else {
                        jSONObject.put(b, f38087a.mo53181a(h));
                        break;
                    }
                case 3:
                    jSONObject.put(b, hVar.mo53107f(b));
                    break;
                case 4:
                    jSONObject.put(b, hVar.mo53104c(b));
                    break;
                case 5:
                    jSONObject.put(b, hVar.mo53106e(b));
                    break;
                case 6:
                    jSONObject.put(b, hVar.mo53105d(b));
                    break;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONArray mo53180a(XReadableArray gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "value");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = gVar.mo53094b().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            switch (C14447c.f38088a[gVar.mo53099g(i).ordinal()]) {
                case 1:
                    XReadableArray e = gVar.mo53097e(i);
                    if (e == null) {
                        break;
                    } else {
                        jSONArray.put(f38087a.mo53180a(e));
                        break;
                    }
                case 2:
                    XReadableMap f = gVar.mo53098f(i);
                    if (f == null) {
                        break;
                    } else {
                        jSONArray.put(f38087a.mo53181a(f));
                        break;
                    }
                case 3:
                    jSONArray.put(gVar.mo53096d(i));
                    break;
                case 4:
                    jSONArray.put(gVar.mo53093b(i));
                    break;
                case 5:
                    jSONArray.put(gVar.mo53095c(i));
                    break;
                case 6:
                    jSONArray.put(gVar.mo53092a(i));
                    break;
            }
            i = i2;
        }
        return jSONArray;
    }
}
