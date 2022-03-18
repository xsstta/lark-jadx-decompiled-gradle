package com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a;

import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.preloadexecutor.a.a */
public class C6013a implements AbstractC6015c {

    /* renamed from: a */
    private String f16832a;

    /* renamed from: b */
    private String f16833b;

    /* renamed from: c */
    private int f16834c;

    /* renamed from: d */
    private List<SubBlockModel> f16835d;

    /* renamed from: e */
    private Set<String> f16836e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: f */
    private Set<String> f16837f = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // com.bytedance.ee.bear.document.offline.sync.preloadexecutor.p320a.AbstractC6015c
    /* renamed from: g */
    public int mo24306g() {
        return 0;
    }

    /* renamed from: c */
    public String mo24301c() {
        return this.f16832a;
    }

    /* renamed from: d */
    public String mo24302d() {
        return this.f16833b;
    }

    /* renamed from: e */
    public List<SubBlockModel> mo24303e() {
        return this.f16835d;
    }

    /* renamed from: f */
    public int mo24305f() {
        return this.f16834c;
    }

    public int hashCode() {
        return Objects.hash(this.f16832a, this.f16833b);
    }

    /* renamed from: a */
    public boolean mo24298a() {
        List<SubBlockModel> list = this.f16835d;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Set<String> set = this.f16836e;
        if (set == null || this.f16837f == null || set.size() + this.f16837f.size() != this.f16835d.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo24300b() {
        List<SubBlockModel> list = this.f16835d;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Set<String> set = this.f16836e;
        if (set != null && set.size() == this.f16835d.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo24297a(String str) {
        Set<String> set = this.f16836e;
        if (set != null) {
            set.add(str);
        }
    }

    /* renamed from: b */
    public void mo24299b(String str) {
        Set<String> set = this.f16837f;
        if (set != null) {
            set.add(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6013a aVar = (C6013a) obj;
        if (!this.f16832a.equals(aVar.f16832a) || !this.f16833b.equals(aVar.f16833b)) {
            return false;
        }
        return true;
    }

    public C6013a(String str, String str2, List<SubBlockModel> list, int i) {
        this.f16832a = str;
        this.f16833b = str2;
        this.f16835d = list;
        this.f16834c = i;
    }
}
