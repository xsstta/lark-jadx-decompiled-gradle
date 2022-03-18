package com.android.installreferrer.api;

import android.os.Bundle;

/* renamed from: com.android.installreferrer.api.b */
public class C1918b {

    /* renamed from: a */
    private final Bundle f6557a;

    /* renamed from: a */
    public String mo9725a() {
        return this.f6557a.getString("install_referrer");
    }

    /* renamed from: b */
    public long mo9726b() {
        return this.f6557a.getLong("referrer_click_timestamp_seconds");
    }

    /* renamed from: c */
    public long mo9727c() {
        return this.f6557a.getLong("install_begin_timestamp_seconds");
    }

    public C1918b(Bundle bundle) {
        this.f6557a = bundle;
    }
}
