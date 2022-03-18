package com.bytedance.push.settings.storage;

import android.content.Context;
import android.util.Log;
import com.bytedance.push.settings.AbstractC20521k;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.h */
public class C20536h implements AbstractC20521k {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, AbstractC20537i> f50101a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, AbstractC20537i> f50102b = new ConcurrentHashMap<>();

    @Override // com.bytedance.push.settings.AbstractC20521k
    /* renamed from: a */
    public AbstractC20537i mo69092a(Context context, boolean z, String str) {
        AbstractC20537i iVar;
        if (z) {
            ConcurrentHashMap<String, AbstractC20537i> concurrentHashMap = f50102b;
            AbstractC20537i iVar2 = concurrentHashMap.get(str);
            if (iVar2 != null) {
                return iVar2;
            }
            Log.d("PushProvider", "SharedPreferenceStorageFactory#create");
            if (PushProvider.m74733a(context)) {
                iVar = new C20526c(context, str);
            } else {
                iVar = new C20528d(context, str);
            }
            concurrentHashMap.put(str, iVar);
            return iVar;
        }
        ConcurrentHashMap<String, AbstractC20537i> concurrentHashMap2 = f50101a;
        AbstractC20537i iVar3 = concurrentHashMap2.get(str);
        if (iVar3 != null) {
            return iVar3;
        }
        C20534g gVar = new C20534g(context, str);
        concurrentHashMap2.put(str, gVar);
        return gVar;
    }
}
