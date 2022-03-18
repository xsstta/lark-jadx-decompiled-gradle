package com.ss.android.lark.main.app.fragment;

import androidx.fragment.app.Fragment;

/* renamed from: com.ss.android.lark.main.app.fragment.e */
public class C44273e {

    /* renamed from: a */
    private Fragment f112288a;

    /* renamed from: b */
    private String f112289b;

    /* renamed from: a */
    public Fragment mo157350a() {
        return this.f112288a;
    }

    /* renamed from: b */
    public String mo157351b() {
        return this.f112289b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f112289b.equals(((C44273e) obj).f112289b);
    }

    public C44273e(Fragment fragment, String str) {
        this.f112288a = fragment;
        this.f112289b = str;
    }
}
