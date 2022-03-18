package com.larksuite.component.dybrid.offlineresource;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.dybrid.offlineresource.b */
public class C24253b {

    /* renamed from: c */
    private static C24253b f59909c;

    /* renamed from: a */
    public ConcurrentHashMap<String, C24250a> f59910a;

    /* renamed from: b */
    public ConcurrentHashMap<String, List<String>> f59911b;

    /* renamed from: a */
    public static C24253b m88574a() {
        synchronized (C24253b.class) {
            if (f59909c == null) {
                f59909c = new C24253b();
            }
        }
        return f59909c;
    }

    /* renamed from: a */
    public C24250a mo86873a(String str) {
        if (this.f59910a == null) {
            this.f59910a = new ConcurrentHashMap<>();
        }
        return this.f59910a.get(str);
    }

    /* renamed from: a */
    private void m88575a(String str, String str2) {
        if (this.f59911b == null) {
            this.f59911b = new ConcurrentHashMap<>();
        }
        if (this.f59911b.get(str) == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.f59911b.put(str, arrayList);
        } else if (!this.f59911b.get(str).contains(str2)) {
            this.f59911b.get(str).add(str2);
        }
    }

    /* renamed from: a */
    public List<String> mo86874a(String str, boolean z) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.f59911b;
        if (concurrentHashMap == null || this.f59910a == null) {
            return new ArrayList();
        }
        List<String> list = concurrentHashMap.get(str);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: a */
    public void mo86875a(String str, C24250a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (this.f59910a == null) {
                this.f59910a = new ConcurrentHashMap<>();
            }
            this.f59910a.put(str, aVar);
            m88575a(aVar.f59906a, aVar.f59907b);
        }
    }
}
