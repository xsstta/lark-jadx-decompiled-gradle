package com.bytedance.ee.bear.appsetting.p243b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.AbstractC4216b;
import com.bytedance.ee.bear.appsetting.RepositoryPriority;

/* renamed from: com.bytedance.ee.bear.appsetting.b.c */
public class C4224c implements AbstractC4216b {

    /* renamed from: a */
    private final SharedPreferences f12738a;

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public String mo16545a(String str, String str2) {
        return str2;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public void mo16546a() {
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: c */
    public void mo16550c() {
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: b */
    public int mo16549b() {
        return RepositoryPriority.MOCK_FG.ordinal();
    }

    public C4224c(Context context) {
        this.f12738a = context.getSharedPreferences("mock_fg", 0);
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16547a(String str, Class<?> cls) {
        if (Boolean.class.equals(cls)) {
            return this.f12738a.contains(str);
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16548a(String str, boolean z, boolean z2) {
        String string = this.f12738a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }
}
