package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.common.C60513e;
import com.ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.h */
public class C60629h {

    /* renamed from: a */
    public C60513e<String, C60630a> f151627a;

    /* renamed from: b */
    Map<String, ModelInfo> f151628b = new HashMap();

    /* renamed from: com.ss.android.ugc.effectmanager.h$a */
    public static class C60630a {

        /* renamed from: a */
        public ModelInfo f151629a;

        /* renamed from: b */
        public ModelInfo mo208059b() {
            return this.f151629a;
        }

        /* renamed from: a */
        public String mo208058a() {
            return this.f151629a.getName();
        }

        /* renamed from: c */
        public ExtendedUrlModel mo208060c() {
            return this.f151629a.getFileUrl();
        }

        public int hashCode() {
            return this.f151629a.hashCode();
        }

        public C60630a(ModelInfo modelInfo) {
            this.f151629a = modelInfo;
            modelInfo.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f151629a.equals(((C60630a) obj).f151629a);
        }
    }

    /* renamed from: a */
    public Map<String, ModelInfo> mo208056a() {
        if (this.f151628b.isEmpty()) {
            for (C60630a aVar : this.f151627a.mo207200b()) {
                this.f151628b.put(aVar.f151629a.getName(), aVar.f151629a);
            }
        }
        return this.f151628b;
    }

    /* renamed from: a */
    public ExtendedUrlModel mo208055a(String str) {
        for (C60630a aVar : this.f151627a.mo207200b()) {
            if (aVar.mo208058a().equals(str)) {
                return aVar.mo208060c();
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }

    /* renamed from: a */
    public void mo208057a(C60513e<String, C60630a> eVar) {
        this.f151627a = eVar;
        this.f151628b.clear();
        for (C60630a aVar : eVar.mo207200b()) {
            this.f151628b.put(aVar.f151629a.getName(), aVar.f151629a);
        }
    }
}
