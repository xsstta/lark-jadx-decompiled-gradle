package com.huawei.hms.framework.network.grs.local.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.hms.framework.network.grs.local.model.c */
public class C23592c {

    /* renamed from: a */
    private String f58172a;

    /* renamed from: b */
    private String f58173b;

    /* renamed from: c */
    private Map<String, C23593d> f58174c = new HashMap(16);

    /* renamed from: d */
    private List<C23591b> f58175d = new ArrayList(16);

    /* renamed from: a */
    public C23593d mo82953a(String str) {
        return this.f58174c.get(str);
    }

    /* renamed from: a */
    public List<C23591b> mo82954a() {
        return this.f58175d;
    }

    /* renamed from: a */
    public void mo82955a(String str, C23593d dVar) {
        this.f58174c.put(str, dVar);
    }

    /* renamed from: a */
    public void mo82956a(List<C23591b> list) {
        this.f58175d = list;
    }

    /* renamed from: b */
    public String mo82957b() {
        return this.f58172a;
    }

    /* renamed from: b */
    public void mo82958b(String str) {
        this.f58172a = str;
    }

    /* renamed from: c */
    public String mo82959c() {
        return this.f58173b;
    }

    /* renamed from: c */
    public void mo82960c(String str) {
        this.f58173b = str;
    }
}
