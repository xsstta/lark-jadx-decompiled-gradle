package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.lynx.webview.util.C20048g;
import java.util.HashSet;

/* renamed from: com.bytedance.lynx.webview.internal.r */
public class C19984r {

    /* renamed from: a */
    private SharedPreferences f48813a;

    /* renamed from: a */
    public boolean mo67817a() {
        return this.f48813a.edit().commit();
    }

    /* renamed from: a */
    public boolean mo67818a(String str, int i) {
        SharedPreferences sharedPreferences = this.f48813a;
        return sharedPreferences.getBoolean(str + "_downloadSeg" + "_" + i, false);
    }

    /* renamed from: d */
    public long mo67827d() {
        return this.f48813a.getLong("firstCrashTime", System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo67830e() {
        return m72883b("decompressSuccessfulMd5", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo67834f() {
        return m72883b("uptoSoVersioncode", "0620010001");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo67835g() {
        return this.f48813a.getInt("supportOsapi", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo67837h() {
        return this.f48813a.getString("supportHostAbi", "32");
    }

    /* renamed from: i */
    public void mo67839i() {
        mo67821b("clearUrl", mo67849p());
    }

    /* renamed from: j */
    public int mo67841j() {
        return this.f48813a.getInt("start_time", 0);
    }

    /* renamed from: k */
    public int mo67843k() {
        return this.f48813a.getInt("start_time_by_version", 0);
    }

    /* renamed from: l */
    public String mo67845l() {
        return this.f48813a.getString("download_md5", "");
    }

    /* renamed from: m */
    public int mo67846m() {
        return this.f48813a.getInt("enable_ttwebview_status", -1);
    }

    /* renamed from: n */
    public String mo67847n() {
        return this.f48813a.getString("config_url", null);
    }

    /* renamed from: o */
    public String mo67848o() {
        return this.f48813a.getString("download_seg_list", "");
    }

    /* renamed from: p */
    public int mo67849p() {
        return this.f48813a.getInt("download_seg_num", 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.webview.internal.r$1 */
    public static /* synthetic */ class C199851 {

        /* renamed from: a */
        static final /* synthetic */ int[] f48814a;

        static {
            int[] iArr = new int[EventType.values().length];
            f48814a = iArr;
            try {
                iArr[EventType.LOAD_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: c */
    public boolean mo67826c() {
        return this.f48813a.getBoolean("enabled", true);
    }

    /* renamed from: b */
    public boolean mo67823b() {
        return this.f48813a.getBoolean("crashUptoLimit", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67812a(String str) {
        m72881a("decompressSuccessfulMd5", str);
    }

    C19984r(Context context) {
        this.f48813a = context.getSharedPreferences("WebViewBytedancePrefs", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo67820b(String str) {
        m72881a("uptoSoVersioncode", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo67825c(String str) {
        this.f48813a.edit().putString("supportHostAbi", str).apply();
    }

    /* renamed from: c */
    public void mo67824c(int i) {
        if (i == 100000) {
            i = 1;
        }
        this.f48813a.edit().putInt("start_time_by_version", i).apply();
    }

    /* renamed from: d */
    public void mo67828d(int i) {
        this.f48813a.edit().putInt("enable_ttwebview_status", i).apply();
    }

    /* renamed from: e */
    public void mo67831e(int i) {
        this.f48813a.edit().putInt("download_seg_num", i).apply();
    }

    /* renamed from: f */
    public long mo67833f(String str) {
        SharedPreferences sharedPreferences = this.f48813a;
        return sharedPreferences.getLong(str + "_downloadSize", -1);
    }

    /* renamed from: i */
    public void mo67840i(String str) {
        this.f48813a.edit().putString("download_md5", str).apply();
    }

    /* renamed from: j */
    public boolean mo67842j(String str) {
        SharedPreferences sharedPreferences = this.f48813a;
        return sharedPreferences.getBoolean("so_update_status" + str, false);
    }

    /* renamed from: k */
    public void mo67844k(String str) {
        this.f48813a.edit().putString("config_url", str).apply();
    }

    /* renamed from: b */
    public void mo67819b(int i) {
        if (i == 100000) {
            i = 1;
        }
        this.f48813a.edit().putInt("start_time", i).apply();
    }

    /* renamed from: d */
    public boolean mo67829d(String str) {
        boolean z;
        if (!this.f48813a.getString("isAppFirstInstall", "").equals(str)) {
            this.f48813a.edit().putString("isAppFirstInstall", str).apply();
            z = true;
        } else {
            z = false;
        }
        C20048g.m73161a("IsAppFirstInstall ：" + z);
        return z;
    }

    /* renamed from: e */
    public boolean mo67832e(String str) {
        return this.f48813a.getStringSet("downloadUrls", new HashSet()).contains(str);
    }

    /* renamed from: g */
    public void mo67836g(String str) {
        if (C20011y.m72976a().mo67912Q()) {
            this.f48813a.edit().putString("download_eventlist", str).apply();
            return;
        }
        C20048g.m73161a("Download event list is disabled to save to sp.");
        this.f48813a.edit().putString("download_eventlist", "").apply();
    }

    /* renamed from: h */
    public void mo67838h(String str) {
        if (C20011y.m72976a().mo67911P()) {
            this.f48813a.edit().putString("load_eventlist", str).apply();
            return;
        }
        C20048g.m73161a("Load event list is disabled to save to sp.");
        this.f48813a.edit().putString("load_eventlist", "").apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67810a(int i) {
        this.f48813a.edit().putInt("supportOsapi", i).apply();
    }

    /* renamed from: a */
    public void mo67811a(EventType eventType) {
        this.f48813a.edit().putInt("useStatus", eventType.getEventCode()).apply();
        if (C199851.f48814a[eventType.ordinal()] != 1) {
            C19943g.m72724a(eventType, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo67822b(boolean z) {
        this.f48813a.edit().putBoolean("enabled", z).apply();
    }

    /* renamed from: a */
    public void mo67816a(boolean z) {
        this.f48813a.edit().putBoolean("crashUptoLimit", z).apply();
    }

    /* renamed from: b */
    private String m72883b(String str, String str2) {
        return this.f48813a.getString(str, str2);
    }

    /* renamed from: a */
    private void m72881a(String str, String str2) {
        this.f48813a.edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    private SharedPreferences.Editor m72879a(SharedPreferences.Editor editor, String str) {
        HashSet hashSet = new HashSet(this.f48813a.getStringSet("downloadUrls", new HashSet()));
        if (hashSet.remove(str)) {
            return editor.putStringSet("downloadUrls", hashSet);
        }
        return editor;
    }

    /* renamed from: b */
    private SharedPreferences.Editor m72882b(SharedPreferences.Editor editor, String str) {
        return editor.remove(str + "_downloadSize");
    }

    /* renamed from: b */
    public void mo67821b(String str, int i) {
        HashSet hashSet = new HashSet(this.f48813a.getStringSet("downloadUrls", new HashSet()));
        SharedPreferences.Editor edit = this.f48813a.edit();
        for (String str2 : hashSet) {
            SharedPreferences.Editor b = m72882b(m72879a(edit, str2), str2);
            for (int i2 = 0; i2 < i; i2++) {
                b = m72880a(b, str2, i2);
            }
            edit = m72880a(b, str2, 9999);
        }
        hashSet.add(str);
        edit.putStringSet("downloadUrls", hashSet).apply();
    }

    /* renamed from: a */
    public void mo67814a(String str, long j) {
        SharedPreferences.Editor edit = this.f48813a.edit();
        edit.putLong(str + "_downloadSize", j).apply();
    }

    /* renamed from: a */
    public void mo67815a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f48813a.edit();
        edit.putBoolean("so_update_status" + str, z).apply();
    }

    /* renamed from: a */
    private SharedPreferences.Editor m72880a(SharedPreferences.Editor editor, String str, int i) {
        return editor.remove(str + "_downloadSeg" + "_" + i);
    }

    /* renamed from: a */
    public void mo67813a(String str, int i, boolean z) {
        SharedPreferences.Editor edit = this.f48813a.edit();
        edit.putBoolean(str + "_downloadSeg" + "_" + i, z).apply();
    }
}
