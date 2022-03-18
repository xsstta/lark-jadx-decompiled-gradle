package com.bytedance.ies.xbridge.model.collections.defaultimpl;

import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/xbridge/model/collections/defaultimpl/DefaultDynamicImpl;", "Lcom/bytedance/ies/xbridge/XDynamic;", "origin", "", "(Ljava/lang/Object;)V", "asArray", "Lcom/bytedance/ies/xbridge/XReadableArray;", "asBoolean", "", "asDouble", "", "asInt", "", "asMap", "Lcom/bytedance/ies/xbridge/XReadableMap;", "asString", "", "getType", "Lcom/bytedance/ies/xbridge/XReadableType;", "isNull", "recycle", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.a.a.a */
public final class DefaultDynamicImpl implements XDynamic {

    /* renamed from: a */
    private final Object f38022a;

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: b */
    public boolean mo53083b() {
        Object obj = this.f38022a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalArgumentException("Dynamic is not Boolean");
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: d */
    public int mo53085d() {
        Object obj = this.f38022a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalArgumentException("Dynamic is not Int");
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: e */
    public String mo53086e() {
        Object obj = this.f38022a;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Dynamic is not String");
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: f */
    public XReadableArray mo53087f() {
        Object obj = this.f38022a;
        if (obj instanceof JSONArray) {
            return new DefaultXReadableArrayImpl((JSONArray) obj);
        }
        throw new IllegalArgumentException("Dynamic is not JSONArray");
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: g */
    public XReadableMap mo53088g() {
        Object obj = this.f38022a;
        if (obj instanceof JSONObject) {
            return new DefaultXReadableMapImpl((JSONObject) obj);
        }
        throw new IllegalArgumentException("Dynamic is not JSONObject");
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: a */
    public XReadableType mo53082a() {
        Object obj = this.f38022a;
        if (obj instanceof JSONArray) {
            return XReadableType.Array;
        }
        if (obj instanceof Boolean) {
            return XReadableType.Boolean;
        }
        if (obj instanceof JSONObject) {
            return XReadableType.Map;
        }
        if (obj instanceof Number) {
            return XReadableType.Number;
        }
        if (obj instanceof String) {
            return XReadableType.String;
        }
        return XReadableType.Null;
    }

    @Override // com.bytedance.ies.xbridge.XDynamic
    /* renamed from: c */
    public double mo53084c() {
        Object obj = this.f38022a;
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return (double) ((Number) obj).intValue();
        }
        if (obj instanceof Float) {
            return (double) ((Number) obj).floatValue();
        }
        if (obj instanceof Long) {
            return (double) ((Number) obj).longValue();
        }
        throw new IllegalArgumentException("Dynamic is not Double");
    }

    public DefaultDynamicImpl(Object obj) {
        this.f38022a = obj;
    }
}
