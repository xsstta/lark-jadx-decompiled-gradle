package com.ss.android.ugc.effectmanager.p3042a;

import com.ss.android.ugc.effectmanager.C60629h;
import com.ss.android.ugc.effectmanager.common.C60513e;
import com.ss.android.ugc.effectmanager.common.p3053h.C60538q;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.a.h */
public class C60481h {

    /* renamed from: a */
    private C60513e<String, ModelInfo> f151165a;

    /* renamed from: b */
    private C60629h f151166b;

    /* renamed from: b */
    private void m235010b() {
        HashMap hashMap = new HashMap();
        for (ModelInfo modelInfo : this.f151165a.mo207200b()) {
            String name = modelInfo.getName();
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, modelInfo.getVersion());
            } else if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
            }
        }
    }

    /* renamed from: a */
    public C60629h mo207064a() {
        if (this.f151166b == null) {
            m235010b();
            this.f151166b = new C60629h();
            C60513e<String, C60629h.C60630a> eVar = new C60513e<>();
            for (String str : this.f151165a.mo207198a()) {
                for (ModelInfo modelInfo : this.f151165a.mo207197a(str)) {
                    eVar.mo207199a(str, new C60629h.C60630a(modelInfo));
                }
            }
            this.f151166b.mo208057a(eVar);
        }
        return this.f151166b;
    }

    public C60481h(C60513e<String, ModelInfo> eVar) {
        this.f151165a = (C60513e) C60538q.m235322a(eVar);
    }
}
