package com.bytedance.ee.bear.doc.resupdate;

import android.text.TextUtils;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.a */
public class C5450a {

    /* renamed from: a */
    private PersistenceSharedPreference f15510a = new PersistenceSharedPreference("app_version");

    C5450a() {
    }

    /* renamed from: a */
    private String m22099a() {
        return (String) this.f15510a.mo34038b("app_version_name", "");
    }

    /* renamed from: a */
    public void mo21821a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f15510a.mo34037a("app_version_name", str);
        }
    }

    /* renamed from: b */
    public boolean mo21822b(String str) {
        String a = m22099a();
        C13479a.m54772d("AppVersionHelper", "isSameVersion()... savedVersion = " + a + ", versionName = " + str);
        if (TextUtils.equals(a, str)) {
            return true;
        }
        return false;
    }
}
