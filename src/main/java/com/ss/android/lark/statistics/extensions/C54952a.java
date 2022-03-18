package com.ss.android.lark.statistics.extensions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\r\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¨\u0006\u000e"}, d2 = {"plus", "Lcom/ss/android/lark/statistics/extensions/IParam;", "first", "Lcom/ss/android/lark/statistics/extensions/CombinedParams;", "second", "plusWithRealType", "toJsonWithRealType", "Lorg/json/JSONObject;", "param", "target", "", "", "", "toJson", "statistics_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.statistics.extensions.a */
public final class C54952a {
    /* renamed from: a */
    public static final JSONObject m213206a(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        if (cVar instanceof CombinedParams) {
            return new JSONObject((Map) cVar);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(cVar.getKey(), cVar.getValue());
        return jSONObject;
    }

    /* renamed from: a */
    public static final JSONObject m213207a(Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(map, "$this$toJson");
        return new JSONObject(map);
    }

    /* renamed from: a */
    private static final IParam m213200a(CombinedParams combinedParams, CombinedParams combinedParams2) {
        combinedParams.putAll(combinedParams2);
        return combinedParams;
    }

    /* renamed from: a */
    private static final IParam m213201a(CombinedParams combinedParams, IParam cVar) {
        return m213202a(cVar, combinedParams);
    }

    /* renamed from: a */
    private static final IParam m213202a(IParam cVar, CombinedParams combinedParams) {
        combinedParams.put(cVar.getKey(), cVar.getValue());
        return combinedParams;
    }

    /* renamed from: b */
    private static final IParam m213208b(IParam cVar, IParam cVar2) {
        CombinedParams combinedParams = new CombinedParams(null, null, 3, null);
        combinedParams.put(cVar.getKey(), cVar.getValue());
        combinedParams.put(cVar2.getKey(), cVar2.getValue());
        return combinedParams;
    }

    /* renamed from: a */
    public static final IParam m213203a(IParam cVar, IParam cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "first");
        Intrinsics.checkParameterIsNotNull(cVar2, "second");
        boolean z = cVar instanceof CombinedParams;
        if (z && (cVar2 instanceof CombinedParams)) {
            return m213200a((CombinedParams) cVar, (CombinedParams) cVar2);
        }
        if (z) {
            return m213201a((CombinedParams) cVar, cVar2);
        }
        if (cVar2 instanceof CombinedParams) {
            return m213202a(cVar, (CombinedParams) cVar2);
        }
        return m213208b(cVar, cVar2);
    }

    /* renamed from: a */
    public static final IParam m213204a(IParam cVar, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$plus");
        return cVar.plus(new CombinedParams(map));
    }

    /* renamed from: a */
    public static final IParam m213205a(Map<String, ? extends Object> map, IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "target");
        return m213204a(cVar, map);
    }
}
