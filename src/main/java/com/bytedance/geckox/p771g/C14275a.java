package com.bytedance.geckox.p771g;

import android.util.Log;
import com.bytedance.geckox.p761c.C14217b;

/* renamed from: com.bytedance.geckox.g.a */
class C14275a implements AbstractC14277c {
    C14275a() {
    }

    @Override // com.bytedance.geckox.p771g.AbstractC14277c
    /* renamed from: a */
    public void mo21904a(String str, Object... objArr) {
        if (objArr == null) {
            Log.d(str, "null");
        } else {
            Log.d(str, C14217b.m57431a().mo52132b().toJson(objArr));
        }
    }

    @Override // com.bytedance.geckox.p771g.AbstractC14277c
    /* renamed from: a */
    public void mo21903a(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    @Override // com.bytedance.geckox.p771g.AbstractC14277c
    /* renamed from: b */
    public void mo21905b(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
