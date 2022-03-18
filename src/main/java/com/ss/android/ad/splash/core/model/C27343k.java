package com.ss.android.ad.splash.core.model;

import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.core.model.k */
public class C27343k {

    /* renamed from: c */
    protected String f68238c;

    public C27343k() {
    }

    public String aj() {
        return this.f68238c;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(aj())) {
            return super.hashCode();
        }
        return aj().hashCode();
    }

    public C27343k(String str) {
        this.f68238c = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C27343k) && !TextUtils.isEmpty(aj())) {
            C27343k kVar = (C27343k) obj;
            if (!TextUtils.isEmpty(kVar.aj())) {
                return TextUtils.equals(aj(), kVar.aj());
            }
        }
        return false;
    }
}
