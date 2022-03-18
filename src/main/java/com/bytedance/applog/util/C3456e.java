package com.bytedance.applog.util;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p201e.AbstractC3403c;
import com.bytedance.applog.p201e.C3400a;
import com.bytedance.applog.p201e.C3417k;
import java.util.UUID;

/* renamed from: com.bytedance.applog.util.e */
public class C3456e implements AbstractC3463l {

    /* renamed from: d */
    private static String f10971d;

    /* renamed from: e */
    private static String f10972e;

    /* renamed from: f */
    private static volatile String f10973f;

    /* renamed from: a */
    private final Context f10974a;

    /* renamed from: b */
    private AbstractC3403c f10975b;

    /* renamed from: c */
    private final C3400a f10976c;

    /* renamed from: g */
    private final String f10977g;

    /* renamed from: h */
    private final C3435g f10978h;

    /* renamed from: a */
    private static String m14590a(String str, String str2) {
        return str2;
    }

    /* renamed from: b */
    private String m14591b(boolean z) {
        return z ? "_local" : "";
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: b */
    public String mo13905b() {
        if (!TextUtils.isEmpty(f10973f)) {
            return f10973f;
        }
        f10973f = this.f10975b.mo13679d("", "");
        return f10973f;
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    public String mo13899a() {
        if (!TextUtils.isEmpty(f10972e)) {
            return f10972e;
        }
        try {
            SharedPreferences sharedPreferences = this.f10974a.getSharedPreferences("snssdk_openudid", 0);
            String string = sharedPreferences.getString("clientudid", null);
            if (!C3470s.m14677a(string)) {
                string = UUID.randomUUID().toString();
                String c = this.f10976c.mo13678c(m14590a("clientudid.dat", (String) null), string);
                if (C3470s.m14677a(c)) {
                    string = c;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("clientudid", string);
                edit.commit();
            } else {
                this.f10976c.mo13678c(string, null);
            }
            if (!TextUtils.isEmpty(string)) {
                string = string + this.f10977g;
            }
            f10972e = string;
            return string;
        } catch (Exception e) {
            C3469r.m14666a("", e);
            return "";
        }
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    public void mo13901a(Account account) {
        C3400a aVar = this.f10976c;
        if (aVar != null) {
            aVar.mo13654a(account);
        }
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    public void mo13903a(Handler handler) {
        this.f10975b.mo13675a(handler);
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    public void mo13904a(String str) {
        if (C3436h.m14505d(str) && !C3470s.m14678a(str, f10973f)) {
            f10973f = this.f10975b.mo13679d(str, f10973f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo13900a(boolean r9) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3456e.mo13900a(boolean):java.lang.String");
    }

    @Override // com.bytedance.applog.util.AbstractC3463l
    /* renamed from: a */
    public void mo13902a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f10973f = null;
            String str2 = "clear_key_prefix" + str;
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.f10978h.mo13816b().mo13732L(), 0);
            if (!sharedPreferences.getBoolean(str2, false)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(str2, true);
                if (sharedPreferences.contains("device_id")) {
                    edit.remove("device_id");
                }
                if (sharedPreferences.contains("install_id")) {
                    edit.remove("install_id");
                }
                edit.apply();
                this.f10975b.mo13656b("device_id");
                if (C3469r.f10990a) {
                    C3469r.m14665a("clearKey : " + str + " :clear installId and deviceId finish");
                }
            } else if (C3469r.f10990a) {
                C3469r.m14665a("clearKey : " + str + " : is already cleared");
            }
        }
    }

    public C3456e(Context context, C3435g gVar, C3400a aVar) {
        this.f10978h = gVar;
        this.f10977g = m14591b(gVar.mo13824d());
        Context applicationContext = context.getApplicationContext();
        this.f10974a = applicationContext;
        C3454d dVar = new C3454d(applicationContext, gVar.mo13822c());
        this.f10976c = aVar;
        C3417k kVar = new C3417k(applicationContext, gVar.mo13816b().mo13732L());
        this.f10975b = kVar;
        kVar.mo13676a(aVar);
        if (!gVar.mo13822c()) {
            dVar.mo13897a();
        }
        mo13901a(gVar.mo13825e());
    }
}
