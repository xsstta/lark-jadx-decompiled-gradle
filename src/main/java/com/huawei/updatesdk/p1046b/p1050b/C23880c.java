package com.huawei.updatesdk.p1046b.p1050b;

import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23868c;

/* renamed from: com.huawei.updatesdk.b.b.c */
public class C23880c extends C23868c {
    private int isUpdateSdk_ = 1;
    private String locale_ = null;
    private int serviceType_ = 0;
    private String ts_ = null;

    /* renamed from: e */
    private void mo85814e(String str) {
        this.ts_ = str;
    }

    /* renamed from: a */
    public void mo85675a(int i) {
        this.serviceType_ = i;
    }

    /* renamed from: d */
    public void mo85676d(String str) {
        this.locale_ = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23868c
    /* renamed from: e */
    public void mo85634e() {
        mo85814e(String.valueOf(System.currentTimeMillis()));
    }

    public String toString() {
        return getClass().getName() + " {\n\tmethod_: " + mo85630b() + "\n}";
    }
}
