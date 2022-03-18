package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.updatesdk.p1046b.p1050b.C23878a;
import com.huawei.updatesdk.p1046b.p1055f.C23891b;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.updatesdk.service.otaupdate.h */
public class C23936h {

    /* renamed from: e */
    private static C23936h f59212e = new C23936h();

    /* renamed from: f */
    private static String f59213f;

    /* renamed from: a */
    private String f59214a;

    /* renamed from: b */
    private String f59215b;

    /* renamed from: c */
    private String f59216c = null;

    /* renamed from: d */
    private String f59217d;

    /* renamed from: com.huawei.updatesdk.service.otaupdate.h$b */
    private static class AsyncTaskC23938b extends AsyncTask<Void, Void, String> {
        private AsyncTaskC23938b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0063 A[SYNTHETIC, Splitter:B:14:0x0063] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0088 A[SYNTHETIC, Splitter:B:23:0x0088] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0095 A[SYNTHETIC, Splitter:B:31:0x0095] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r10) {
            /*
            // Method dump skipped, instructions count: 157
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.service.otaupdate.C23936h.AsyncTaskC23938b.doInBackground(java.lang.Void[]):java.lang.String");
        }
    }

    private C23936h() {
    }

    /* renamed from: g */
    public static C23936h m87510g() {
        return f59212e;
    }

    /* renamed from: a */
    public String mo85875a() {
        return !TextUtils.isEmpty(this.f59214a) ? this.f59214a : this.f59215b;
    }

    /* renamed from: a */
    public void mo85876a(Context context, String str) {
        this.f59215b = null;
        if (C23891b.m87365d(context, str)) {
            if (Math.abs(System.currentTimeMillis() - C23878a.m87310c().mo85667b(str)) < 86400000) {
                m87510g().mo85877a(C23878a.m87310c().mo85662a(str));
                return;
            }
            f59213f = String.format(Locale.ROOT, "content://%s.commondata/item/1", str);
            AsyncTaskC23938b bVar = new AsyncTaskC23938b();
            bVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            try {
                bVar.get(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                bVar.cancel(true);
                Log.e("ServiceZoneUtil", "init AccountZone error: " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo85877a(String str) {
        this.f59215b = str;
    }

    /* renamed from: b */
    public String mo85878b() {
        return this.f59214a;
    }

    /* renamed from: b */
    public void mo85879b(String str) {
        this.f59214a = str;
    }

    /* renamed from: c */
    public String mo85880c() {
        return this.f59216c;
    }

    /* renamed from: c */
    public void mo85881c(String str) {
        this.f59217d = str;
    }

    /* renamed from: d */
    public void mo85882d(String str) {
        this.f59216c = str;
    }

    /* renamed from: d */
    public boolean mo85883d() {
        String str = this.f59214a;
        if (str != null) {
            return str.equals(this.f59215b);
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo85884e() {
        return TextUtils.equals(this.f59217d, "AppTouch");
    }
}
