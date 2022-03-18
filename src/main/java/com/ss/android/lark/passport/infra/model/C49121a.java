package com.ss.android.lark.passport.infra.model;

import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.entity.C49367b;
import com.ss.android.lark.passport.signinsdk_api.entity.C49368c;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.passport.infra.model.a */
public class C49121a {

    /* renamed from: a */
    private HashMap<Integer, C49368c> f123379a;

    /* renamed from: b */
    private HashMap<Integer, Boolean> f123380b;

    /* renamed from: c */
    private HashMap<Integer, String> f123381c;

    /* renamed from: d */
    private C49367b f123382d;

    /* renamed from: e */
    private int f123383e;

    /* renamed from: f */
    private int f123384f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.infra.model.a$a */
    public static class C49123a {

        /* renamed from: a */
        public static final C49121a f123385a = new C49121a();
    }

    /* renamed from: a */
    public static C49121a m193727a() {
        return C49123a.f123385a;
    }

    /* renamed from: b */
    public int mo171506b() {
        return this.f123383e;
    }

    /* renamed from: c */
    public int mo171508c() {
        return this.f123384f;
    }

    private C49121a() {
        this.f123379a = new HashMap<>();
        this.f123380b = new HashMap<>();
        this.f123381c = new HashMap<>();
        this.f123383e = 1;
        mo171505a(2, false);
        mo171505a(3, false);
        mo171505a(4, false);
        mo171505a(7, false);
        mo171505a(8, false);
        this.f123382d = new C49367b("passport_account_recovery", "161471", "0");
    }

    /* renamed from: d */
    public CountryBean mo171510d() {
        String str;
        ICommonService c = ServiceFinder.m193748c();
        if (c == null || !c.isLarkPackage()) {
            str = "{\n      \"code\": \"+86\",\n      \"name\": \"China\",\n      \"head_index\": \"C\",\n      \"pattern\": \"(\\\\d{3})(\\\\d{4})(\\\\d{4})\"\n    }";
        } else {
            str = "{\n      \"code\": \"+1\",\n      \"name\": \"United States of America\",\n      \"head_index\": \"U\",\n      \"pattern\": \"(\\\\d{3})(\\\\d{3})(\\\\d{4})\"\n    }";
        }
        CountryBean countryBean = (CountryBean) C38760a.m153056a(str, CountryBean.class);
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("PassportParams", "getDefaultCountryBean " + C38760a.m153057a(countryBean));
        return countryBean;
    }

    /* renamed from: a */
    public void mo171503a(int i) {
        this.f123384f = i;
    }

    /* renamed from: b */
    public C49368c mo171507b(int i) {
        HashMap<Integer, C49368c> hashMap = this.f123379a;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo171509c(int i) {
        if (this.f123380b == null) {
            this.f123380b = new HashMap<>();
        }
        if (!this.f123380b.containsKey(Integer.valueOf(i))) {
            return false;
        }
        return this.f123380b.get(Integer.valueOf(i)).booleanValue();
    }

    /* renamed from: d */
    public String mo171511d(int i) {
        if (this.f123381c == null) {
            this.f123381c = new HashMap<>();
        }
        if (!this.f123381c.containsKey(Integer.valueOf(i))) {
            return "";
        }
        return this.f123381c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo171504a(int i, C49368c cVar) {
        if (this.f123379a == null) {
            this.f123379a = new HashMap<>();
        }
        this.f123379a.put(Integer.valueOf(i), cVar);
    }

    /* renamed from: a */
    public void mo171505a(int i, boolean z) {
        if (this.f123380b == null) {
            this.f123380b = new HashMap<>();
        }
        this.f123380b.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
