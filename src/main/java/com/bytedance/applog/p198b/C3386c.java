package com.bytedance.applog.p198b;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.bytedance.applog.b.c */
public class C3386c extends AbstractC3384a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p198b.AbstractC3384a
    /* renamed from: a */
    public boolean mo13634a(String str) {
        return this.f10730a.contains(str);
    }

    public C3386c(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        super(hashSet, hashMap);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p198b.AbstractC3384a
    /* renamed from: a */
    public boolean mo13636a(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }
}
