package com.huawei.updatesdk.p1046b.p1050b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;

/* renamed from: com.huawei.updatesdk.b.b.a */
public final class C23878a {

    /* renamed from: c */
    private static final Object f59121c = new Object();

    /* renamed from: d */
    private static C23878a f59122d;

    /* renamed from: a */
    private C23879b f59123a;

    /* renamed from: b */
    private String f59124b;

    private C23878a(Context context) {
        this.f59123a = C23879b.m87321a("DeviceSessionUpdateSDK_V1", context);
    }

    /* renamed from: c */
    public static C23878a m87310c() {
        C23878a aVar;
        synchronized (f59121c) {
            if (f59122d == null) {
                f59122d = new C23878a(C23854a.m87210c().mo85582a());
            }
            aVar = f59122d;
        }
        return aVar;
    }

    /* renamed from: a */
    public String mo85661a() {
        return this.f59124b;
    }

    /* renamed from: a */
    public String mo85662a(String str) {
        C23879b bVar = this.f59123a;
        return bVar.mo85672a("updatesdk.lastAccountZone" + str, "");
    }

    /* renamed from: a */
    public void mo85663a(long j) {
        this.f59123a.mo85673b("updatesdk.lastCheckDate", j);
    }

    /* renamed from: a */
    public void mo85664a(String str, long j) {
        C23879b bVar = this.f59123a;
        bVar.mo85673b("updatesdk.lastInitAccountTime" + str, j);
    }

    /* renamed from: a */
    public void mo85665a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f59123a.mo85674b(str, str2);
        }
    }

    /* renamed from: b */
    public long mo85666b() {
        return this.f59123a.mo85671a("updatesdk.lastCheckDate", 0);
    }

    /* renamed from: b */
    public long mo85667b(String str) {
        C23879b bVar = this.f59123a;
        return bVar.mo85671a("updatesdk.lastInitAccountTime" + str, 0);
    }

    /* renamed from: b */
    public void mo85668b(String str, String str2) {
        C23879b bVar = this.f59123a;
        bVar.mo85674b("updatesdk.lastAccountZone" + str, str2);
    }

    /* renamed from: c */
    public String mo85669c(String str) {
        return TextUtils.isEmpty(str) ? "" : this.f59123a.mo85672a(str, "");
    }

    /* renamed from: d */
    public void mo85670d(String str) {
        this.f59124b = str;
    }
}
