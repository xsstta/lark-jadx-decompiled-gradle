package com.ss.android.vesdk.runtime;

import android.text.TextUtils;
import com.ss.android.vesdk.runtime.p3193a.C64057a;

/* renamed from: com.ss.android.vesdk.runtime.d */
public class C64062d {

    /* renamed from: a */
    private String f161763a;

    /* renamed from: b */
    private String f161764b;

    /* renamed from: a */
    public String mo221802a() {
        return this.f161763a;
    }

    /* renamed from: b */
    public String mo221804b() {
        if (TextUtils.isEmpty(this.f161764b)) {
            this.f161764b = (String) C64057a.m251415a().mo221798b("vesdk_models_dir_sp_key", "");
        }
        return this.f161764b;
    }

    /* renamed from: a */
    public void mo221803a(String str) {
        this.f161763a = str;
    }
}
