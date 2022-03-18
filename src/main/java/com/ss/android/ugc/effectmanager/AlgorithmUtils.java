package com.ss.android.ugc.effectmanager;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3053h.C60525c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60535n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0002J$\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001d\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0011JA\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/effectmanager/AlgorithmUtils;", "", "()V", "TAG", "", "convertMap", "", "", "modelNamesMap", "", "getModelNamesOfEffect", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getRequirementsOfEffect", "", "getResourceNameArrayOfEffect", "", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)[Ljava/lang/String;", "mergeRequirementsAndModelNames", "requirements", "([Ljava/lang/String;Ljava/util/Map;)[Ljava/lang/String;", "algorithmmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.b */
public final class AlgorithmUtils {

    /* renamed from: a */
    public static final AlgorithmUtils f151168a = new AlgorithmUtils();

    private AlgorithmUtils() {
    }

    /* renamed from: c */
    private final List<String> m235018c(Effect effect) {
        return CollectionsKt.toMutableList((Collection) effect.getRequirements());
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, List<String>> m235014a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        String modelNames = effect.getModelNames();
        EPLog.m235179b("AlgorithmUtils", "getModelNamesOfEffect->effectId = " + effect.getEffectId() + ", modelNames = " + modelNames);
        if (TextUtils.isEmpty(modelNames)) {
            return null;
        }
        try {
            return f151168a.m235015a(C60535n.m235317a(new JSONObject(modelNames)));
        } catch (Exception e) {
            EPLog.m235177a("AlgorithmUtils", "getModelNamesOfEffect", e);
            return null;
        }
    }

    /* renamed from: a */
    private final Map<String, List<String>> m235015a(Map<String, ? extends Object> map) {
        if (C60525c.m235235a((Map) map)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (C60525c.m235237b(value)) {
                List<String> b = C60525c.m235236b(C60525c.m235233a(value));
                if (!C60525c.m235234a((List) b)) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "resultValueList");
                    hashMap.put(key, b);
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    @kotlin.jvm.JvmStatic
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] m235017b(com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.AlgorithmUtils.m235017b(com.ss.android.ugc.effectmanager.effect.model.Effect):java.lang.String[]");
    }

    /* renamed from: a */
    private final String[] m235016a(String[] strArr, Map<String, ? extends List<String>> map) {
        if (C60525c.m235235a((Map) map)) {
            return strArr;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            arrayList.addAll((List) entry.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr != null) {
            arrayList2.addAll(C69043h.m265786k(strArr));
        }
        arrayList2.addAll(arrayList);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
