package com.bytedance.ee.bear.appsetting.p243b;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.AbstractC4216b;
import com.bytedance.ee.bear.appsetting.RepositoryPriority;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.appsetting.api.C29219d;

/* renamed from: com.bytedance.ee.bear.appsetting.b.d */
public class C4225d implements AbstractC4216b {

    /* renamed from: a */
    private final C29219d f12739a = C29219d.m107477a();

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public void mo16546a() {
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16548a(String str, boolean z, boolean z2) {
        return z;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: c */
    public void mo16550c() {
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: b */
    public int mo16549b() {
        return RepositoryPriority.SETTING.ordinal();
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16547a(String str, Class<?> cls) {
        if (Boolean.class.equals(cls) || TextUtils.isEmpty(this.f12739a.mo103626a(str, true))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public String mo16545a(String str, String str2) {
        String a = this.f12739a.mo103626a(str, true);
        C13479a.m54764b("SettingRepository", "getString, key = " + str + ", value = " + a);
        return TextUtils.isEmpty(a) ? str2 : a;
    }
}
