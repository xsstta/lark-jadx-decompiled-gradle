package com.tt.miniapp.falcon.snapshot;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.google.gson.Gson;
import com.larksuite.framework.utils.C26246a;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.settings.configs.SnapshotAppConfig;
import com.tt.miniapp.settings.configs.SnapshotConfig;
import com.tt.miniapp.settings.v2.handler.C66810y;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.List;

/* renamed from: com.tt.miniapp.falcon.snapshot.j */
public class C66084j extends AbstractC66075c {

    /* renamed from: a */
    private static final Gson f166805a = new Gson();

    /* renamed from: b */
    private final IAppContext f166806b;

    /* renamed from: c */
    private final String f166807c;

    /* renamed from: d */
    private final String f166808d;

    /* renamed from: e */
    private final String f166809e;

    /* renamed from: f */
    private final boolean f166810f;

    /* renamed from: g */
    private String f166811g = "reason_null";

    /* renamed from: h */
    private final SharedPreferences f166812h;

    @Override // com.tt.miniapp.falcon.snapshot.AbstractC66075c
    /* renamed from: a */
    public boolean mo231225a() {
        return this.f166810f;
    }

    @Override // com.tt.miniapp.falcon.snapshot.AbstractC66075c
    /* renamed from: b */
    public String mo231226b() {
        return this.f166811g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.tt.miniapp.falcon.snapshot.AbstractC66075c
    /* renamed from: c */
    public void mo231227c() {
        m258801a(this.f166809e, "SNAPSHOT_LOADING_STATE_START");
    }

    /* access modifiers changed from: package-private */
    @Override // com.tt.miniapp.falcon.snapshot.AbstractC66075c
    /* renamed from: d */
    public void mo231228d() {
        m258801a(this.f166809e, "SNAPSHOT_LOADING_STATE_SUCCESSFULLY");
    }

    /* renamed from: f */
    private boolean m258806f() {
        return "SNAPSHOT_LOADING_STATE_SUCCESSFULLY".equals(this.f166812h.getString(this.f166809e, "SNAPSHOT_LOADING_STATE_SUCCESSFULLY"));
    }

    /* renamed from: h */
    private SnapshotConfig m258808h() {
        String b = C66810y.m260694a().mo232718b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            return (SnapshotConfig) f166805a.fromJson(b, SnapshotConfig.class);
        } catch (Exception e) {
            AppBrandLogger.m52829e("SnapshotSettings", e);
            return null;
        }
    }

    /* renamed from: i */
    private SnapshotAppConfig m258809i() {
        List<SnapshotAppConfig> appListV2;
        SnapshotConfig h = m258808h();
        if (h == null || (appListV2 = h.getAppListV2()) == null || appListV2.isEmpty()) {
            return null;
        }
        for (SnapshotAppConfig snapshotAppConfig : appListV2) {
            if (this.f166807c.equals(snapshotAppConfig.getAppId())) {
                return snapshotAppConfig;
            }
        }
        return null;
    }

    /* renamed from: e */
    private boolean m258805e() {
        if (DebugUtil.debug() && C12899a.m53203a(this.f166806b.getApplicationContext(), "about_debug").getBoolean("use_snapshot", false)) {
            AppBrandLogger.m52829e("SnapshotSettings", "enableSnapshot: by about_debug");
            this.f166811g = "force_enable";
            return true;
        } else if ("preview".equals(this.f166808d)) {
            AppBrandLogger.m52829e("SnapshotSettings", "enableSnapshot: is preview version");
            this.f166811g = "preview_disable";
            return false;
        } else if (ProcessUtil.isMainProcess(this.f166806b.getApplicationContext())) {
            AppBrandLogger.m52829e("SnapshotSettings", "enableSnapshot: isMainProcess");
            this.f166811g = "main_disable";
            return false;
        } else if (m258806f()) {
            return m258807g();
        } else {
            AppBrandLogger.m52829e("SnapshotSettings", "SnapshotLoadingStatus is not SUCCESSFULLY, snapshotId is " + this.f166809e);
            this.f166811g = "error_disable";
            return false;
        }
    }

    /* renamed from: g */
    private boolean m258807g() {
        SnapshotAppConfig i = m258809i();
        if (i == null) {
            this.f166811g = "default_disable";
            return false;
        } else if (!i.isEnableSnapshot()) {
            AppBrandLogger.m52830i("SnapshotSettings", "enableSnapshotSettings: disableSnapshot");
            this.f166811g = "settings_disable_by_main_switch";
            return false;
        } else {
            if (!TextUtils.isEmpty(i.tenantId)) {
                if (!i.tenantId.equals(HostDependManager.getInst().getTenantId())) {
                    AppBrandLogger.m52830i("SnapshotSettings", "enableSnapshotSettings currentTenantId not match:");
                    this.f166811g = "settings_disable_by_tenant_id";
                    return false;
                }
            }
            if (!m258802a(i)) {
                AppBrandLogger.m52830i("SnapshotSettings", "verifyClientVersion false: " + i.minClientVersionCode);
                this.f166811g = "settings_disable_by_client_version";
                return false;
            } else if (!m258804b(i)) {
                AppBrandLogger.m52830i("SnapshotSettings", "verifyJsSdkVersion false: " + i.minJsSdkVersionCode);
                this.f166811g = "settings_disable_by_js_sdk_version";
                return false;
            } else if (!m258803a(i, this.f166808d)) {
                AppBrandLogger.m52830i("SnapshotSettings", "verifyMinAppVersion false: " + i.minMiniAppVersionCode);
                this.f166811g = "settings_disable_by_mini_app_version";
                return false;
            } else {
                this.f166811g = "settings_enable";
                return true;
            }
        }
    }

    /* renamed from: a */
    private boolean m258802a(SnapshotAppConfig snapshotAppConfig) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minClientVersionCode)) {
            try {
                if (C26246a.m94978b(this.f166806b.getApplicationContext()) < Integer.parseInt(snapshotAppConfig.minClientVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotSettings", "minClientVersionCode success");
                return true;
            } catch (NumberFormatException unused) {
                AppBrandLogger.m52829e("SnapshotSettings", "error minClientVersionCode:" + snapshotAppConfig.minClientVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotSettings", "minClientVersionCode isEmpty");
            return true;
        }
    }

    /* renamed from: b */
    private boolean m258804b(SnapshotAppConfig snapshotAppConfig) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minJsSdkVersionCode)) {
            try {
                if (AppbrandUtil.convertVersionStrToCode(C66399c.m259608a().mo231922b(this.f166806b.getApplicationContext(), this.f166806b)) < Long.parseLong(snapshotAppConfig.minJsSdkVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotSettings", "minJsSdkVersionCode success");
                return true;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("SnapshotSettings", "error minJsSdkVersionCode:" + snapshotAppConfig.minJsSdkVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotSettings", "minJsSdkVersionCode isEmpty");
            return true;
        }
    }

    /* renamed from: a */
    private void m258801a(String str, String str2) {
        this.f166812h.edit().putString(str, str2).commit();
    }

    /* renamed from: a */
    private boolean m258803a(SnapshotAppConfig snapshotAppConfig, String str) {
        if (!TextUtils.isEmpty(snapshotAppConfig.minMiniAppVersionCode)) {
            try {
                if (AppbrandUtil.convertVersionStrToCode(str) < AppbrandUtil.convertVersionStrToCode(snapshotAppConfig.minMiniAppVersionCode)) {
                    return false;
                }
                AppBrandLogger.m52830i("SnapshotSettings", "minMiniAppVersionCode success");
                return true;
            } catch (Exception unused) {
                AppBrandLogger.m52829e("SnapshotSettings", "error minMiniAppVersionCode:" + snapshotAppConfig.minJsSdkVersionCode);
                return true;
            }
        } else {
            AppBrandLogger.m52830i("SnapshotSettings", "minMiniAppVersionCode isEmpty");
            return true;
        }
    }

    public C66084j(IAppContext iAppContext, String str, String str2, String str3) {
        this.f166806b = iAppContext;
        this.f166807c = str;
        this.f166808d = str2;
        this.f166809e = str3;
        this.f166812h = C12899a.m53203a(iAppContext.getApplicationContext(), "snapshot_loading_state_prefs");
        this.f166810f = m258805e();
    }
}
