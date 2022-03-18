package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.p3053h.C60525c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3056a.C60560b;
import com.ss.android.ugc.effectmanager.model.C60633c;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.android.ugc.effectmanager.p3042a.C60471c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class DownloadableModelSupportEffectFetcher extends ModelEffectFetcher {
    private String normalizeResourceName(String str) {
        return C60512d.m235165a(str);
    }

    /* access modifiers changed from: package-private */
    public Collection<ModelInfo> collectNeedDownloadModelsListNonBlocking(String[] strArr) {
        C60629h c = getModelConfigArbiter().mo207030c(0);
        if (c == null) {
            return new ArrayList();
        }
        return getModelFetcher().mo207055a(0, strArr, c, (MonitorTrace) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher
    public String[] peekResourceNameArray(C60560b bVar) {
        if (bVar == null || bVar.mo207377a() == null) {
            return null;
        }
        return AlgorithmUtils.m235017b(bVar.mo207377a());
    }

    public List<C60633c> collectLocalModelInfo(String[] strArr) {
        IModelCache modelCache;
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length == 0 || (modelCache = getModelCache()) == null) {
            return arrayList;
        }
        for (String str : strArr) {
            C60633c a = modelCache.mo207017a(normalizeResourceName(str), null);
            if (a != null) {
                arrayList.add(a);
            } else if (modelCache.mo207019a(str)) {
                String b = C60512d.m235167b(str);
                int d = C60512d.m235169d(str);
                C60633c a2 = C60633c.m235628a("asset://model/" + str);
                a2.mo208111c(b);
                a2.mo208107a(d);
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void fetchModels(List<String> list, Map<String, List<String>> map) {
        Effect effect = new Effect();
        effect.setName("Stub");
        effect.setRequirements(list);
        if (!C60525c.m235235a((Map) map)) {
            effect.setModelNames(new JSONObject(map).toString());
        }
        getModelFetcher().mo207059a(peekResourceNameArray(new C60560b(effect, null, null)));
    }

    public DownloadableModelSupportEffectFetcher(DownloadableModelConfig downloadableModelConfig, IModelCache dVar, C60515a aVar, C60471c cVar) {
        super(downloadableModelConfig, cVar, dVar, aVar);
    }
}
