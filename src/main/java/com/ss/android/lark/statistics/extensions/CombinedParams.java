package com.ss.android.lark.statistics.extensions;

import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005B\u001d\b\u0016\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0019\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/statistics/extensions/CombinedParams;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "map", "", "(Ljava/util/Map;)V", "key", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CombinedParams extends HashMap<String, Object> implements IParam {
    private final String key;
    private final String value;

    public CombinedParams() {
        this(null, null, 3, null);
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public String getKey() {
        return this.key;
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public String getValue() {
        return this.value;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public Set getEntries() {
        return super.entrySet();
    }

    public Set getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public Collection getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<String> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public JSONObject toJson() {
        return IParam.C54954a.m213213a(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<Object> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public IParam plus(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "target");
        return IParam.C54954a.m213212a(this, cVar);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public CombinedParams(Map<String, ? extends Object> map) {
        this(null, null, 3, null);
        if (map != null) {
            putAll(map);
        }
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    @Override // java.util.Map, java.util.HashMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (obj instanceof String) {
            return getOrDefault((String) obj, obj2);
        }
        return obj2;
    }

    public CombinedParams(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || obj2 == null) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombinedParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
