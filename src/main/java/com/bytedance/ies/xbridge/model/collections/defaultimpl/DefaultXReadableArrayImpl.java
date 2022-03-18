package com.bytedance.ies.xbridge.model.collections.defaultimpl;

import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/xbridge/model/collections/defaultimpl/DefaultXReadableArrayImpl;", "Lcom/bytedance/ies/xbridge/XReadableArray;", "origin", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "get", "Lcom/bytedance/ies/xbridge/XDynamic;", "index", "", "getArray", "getBoolean", "", "getDouble", "", "getInt", "getMap", "Lcom/bytedance/ies/xbridge/XReadableMap;", "getString", "", "getType", "Lcom/bytedance/ies/xbridge/XReadableType;", "isNull", "size", "toList", "", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.a.a.c */
public final class DefaultXReadableArrayImpl implements XReadableArray {

    /* renamed from: a */
    private final JSONArray f38024a;

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: a */
    public int mo53091a() {
        return this.f38024a.length();
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: b */
    public List<Object> mo53094b() {
        return DefaultXReadableMapUtils.f38026a.mo53112a(this.f38024a);
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: b */
    public double mo53093b(int i) {
        return this.f38024a.optDouble(i);
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: c */
    public int mo53095c(int i) {
        return this.f38024a.optInt(i);
    }

    public DefaultXReadableArrayImpl(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull(jSONArray, "origin");
        this.f38024a = jSONArray;
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: a */
    public boolean mo53092a(int i) {
        return this.f38024a.optBoolean(i);
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: d */
    public String mo53096d(int i) {
        String optString = this.f38024a.optString(i);
        Intrinsics.checkExpressionValueIsNotNull(optString, "origin.optString(index)");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: e */
    public XReadableArray mo53097e(int i) {
        JSONArray optJSONArray = this.f38024a.optJSONArray(i);
        if (optJSONArray == null) {
            return null;
        }
        return new DefaultXReadableArrayImpl(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: f */
    public XReadableMap mo53098f(int i) {
        JSONObject optJSONObject = this.f38024a.optJSONObject(i);
        if (optJSONObject == null) {
            return null;
        }
        return new DefaultXReadableMapImpl(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.XReadableArray
    /* renamed from: g */
    public XReadableType mo53099g(int i) {
        Object opt = this.f38024a.opt(i);
        if (opt instanceof JSONArray) {
            return XReadableType.Array;
        }
        if (opt instanceof Boolean) {
            return XReadableType.Boolean;
        }
        if (opt instanceof JSONObject) {
            return XReadableType.Map;
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
