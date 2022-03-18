package com.bytedance.ies.xbridge.model.collections.defaultimpl;

import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XKeyIterator;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ies/xbridge/model/collections/defaultimpl/DefaultXReadableMapImpl;", "Lcom/bytedance/ies/xbridge/XReadableMap;", "origin", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "get", "Lcom/bytedance/ies/xbridge/XDynamic;", "name", "", "getArray", "Lcom/bytedance/ies/xbridge/XReadableArray;", "getBoolean", "", "getDouble", "", "getInt", "", "getMap", "getString", "getType", "Lcom/bytedance/ies/xbridge/XReadableType;", "hasKey", "isNull", "keyIterator", "Lcom/bytedance/ies/xbridge/XKeyIterator;", "toMap", "", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.a.a.d */
public final class DefaultXReadableMapImpl implements XReadableMap {

    /* renamed from: a */
    private final JSONObject f38025a;

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: b */
    public Map<String, Object> mo53102b() {
        return DefaultXReadableMapUtils.f38026a.mo53113a(this.f38025a);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: a */
    public XKeyIterator mo53100a() {
        Iterator<String> keys = this.f38025a.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "origin.keys()");
        return new DefaultXKeyIteratorImpl(keys);
    }

    public DefaultXReadableMapImpl(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "origin");
        this.f38025a = jSONObject;
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: a */
    public boolean mo53101a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f38025a.has(str);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: c */
    public boolean mo53104c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f38025a.optBoolean(str);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: d */
    public double mo53105d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f38025a.optDouble(str);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: e */
    public int mo53106e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f38025a.optInt(str);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: b */
    public boolean mo53103b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f38025a.isNull(str);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: f */
    public String mo53107f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        String optString = this.f38025a.optString(str);
        Intrinsics.checkExpressionValueIsNotNull(optString, "origin.optString(name)");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: g */
    public XReadableArray mo53108g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        JSONArray optJSONArray = this.f38025a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new DefaultXReadableArrayImpl(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: h */
    public XReadableMap mo53109h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        JSONObject optJSONObject = this.f38025a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new DefaultXReadableMapImpl(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: i */
    public XDynamic mo53110i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return new DefaultDynamicImpl(this.f38025a.opt(str));
    }

    @Override // com.bytedance.ies.xbridge.XReadableMap
    /* renamed from: j */
    public XReadableType mo53111j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Object opt = this.f38025a.opt(str);
        if (opt instanceof JSONArray) {
            return XReadableType.Array;
        }
        if (opt instanceof Boolean) {
            return XReadableType.Boolean;
        }
        if (opt instanceof JSONObject) {
            return XReadableType.Map;
        }
        if (opt instanceof Integer) {
            return XReadableType.Int;
        }
        if (opt instanceof Number) {
            return XReadableType.Number;
        }
        if (opt instanceof String) {
            return XReadableType.String;
        }
        return XReadableType.Null;
    }
}
