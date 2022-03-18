package com.ss.ugc.effectplatform.util;

import bytekn.foundation.logger.Logger;
import bytekn.foundation.utils.CollectionUtil;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J'\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0007JA\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/ugc/effectplatform/util/AlgorithmUtils;", "", "()V", "getModelNamesOfEffect", "", "", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "getRequirementsOfEffect", "", "getResourceNameArrayOfEffect", "", "(Lcom/ss/ugc/effectplatform/model/Effect;Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;)[Ljava/lang/String;", "isRequirementsInvalid", "", "mergeRequirementsAndModelNames", "requirements", "modelNamesMap", "([Ljava/lang/String;Ljava/util/Map;)[Ljava/lang/String;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.a */
public final class AlgorithmUtils {

    /* renamed from: a */
    public static final AlgorithmUtils f165092a = new AlgorithmUtils();

    private AlgorithmUtils() {
    }

    /* renamed from: b */
    private final List<String> m257042b(Effect effect) {
        return CollectionsKt.toMutableList((Collection) effect.getRequirements());
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m257040a(Effect effect) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        List<String> requirements_sec = effect.getRequirements_sec();
        if (requirements_sec == null || requirements_sec.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        List<String> requirements = effect.getRequirements();
        if (!(requirements instanceof Collection) || !requirements.isEmpty()) {
            Iterator<T> it = requirements.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((!StringsKt.isBlank(it.next())) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i = 0;
        }
        List<String> requirements_sec2 = effect.getRequirements_sec();
        if (requirements_sec2 != null) {
            List<String> list = requirements_sec2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if ((!StringsKt.isBlank(it2.next())) && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                if (i2 != 0 || i2 == i) {
                    return false;
                }
                return true;
            }
        }
        i2 = 0;
        if (i2 != 0) {
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, List<String>> m257039a(Effect effect, IJsonConverter bVar) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        String model_names = effect.getModel_names();
        Logger bVar2 = Logger.f5760a;
        bVar2.mo8662a("effect_platform", "EffectUtils#getModelNamesOfEffect->effectId = " + effect.getEffect_id() + ", modelNames = " + model_names);
        if (TextUtils.f165135a.mo228357a(model_names) || bVar == null) {
            return null;
        }
        if (model_names == null) {
            try {
                Intrinsics.throwNpe();
            } catch (Exception e) {
                Logger.f5760a.mo8663a("effect_platform", "EffectUtils#getModelNamesOfEffect", e);
                return null;
            }
        }
        return (Map) bVar.mo227739a().mo207364a(model_names, Map.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    @kotlin.jvm.JvmStatic
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] m257043b(com.ss.ugc.effectplatform.model.Effect r10, com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter r11) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.AlgorithmUtils.m257043b(com.ss.ugc.effectplatform.model.Effect, com.ss.ugc.effectplatform.bridge.b.b):java.lang.String[]");
    }

    /* renamed from: a */
    private final String[] m257041a(String[] strArr, Map<String, ? extends List<String>> map) {
        if (CollectionUtil.f5763a.mo8669a(map)) {
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
