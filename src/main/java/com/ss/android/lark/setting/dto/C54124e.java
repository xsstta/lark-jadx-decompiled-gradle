package com.ss.android.lark.setting.dto;

import com.ss.android.lark.setting.service.impl.C54608b;

/* renamed from: com.ss.android.lark.setting.dto.e */
public class C54124e {

    /* renamed from: a */
    public boolean f134008a;

    /* renamed from: b */
    public boolean f134009b;

    /* renamed from: c */
    public long f134010c;

    public C54124e(long j) {
        boolean z;
        boolean z2 = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f134008a = z;
        if (i == 0) {
            this.f134009b = false;
            this.f134010c = -1;
            return;
        }
        long a = C54608b.m211917b().mo186512a();
        z2 = j <= a ? false : z2;
        this.f134009b = z2;
        if (z2) {
            this.f134010c = j - a;
        } else {
            this.f134010c = -1;
        }
    }
}
