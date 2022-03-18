package com.bytedance.applog.manager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.applog.util.C3469r;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.manager.o */
public class C3443o extends AbstractC3431c {

    /* renamed from: e */
    private final Context f10944e;

    /* renamed from: f */
    private final C3435g f10945f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.manager.AbstractC3431c
    /* renamed from: a */
    public boolean mo13788a(JSONObject jSONObject) throws JSONException {
        int i;
        String packageName = this.f10944e.getPackageName();
        if (TextUtils.isEmpty(this.f10945f.mo13806R())) {
            jSONObject.put("package", packageName);
        } else {
            C3469r.m14666a("has zijie pkg", (Throwable) null);
            jSONObject.put("package", this.f10945f.mo13806R());
            jSONObject.put("real_package_name", packageName);
        }
        try {
            PackageInfo packageInfo = this.f10944e.getPackageManager().getPackageInfo(packageName, 0);
            int i2 = packageInfo.versionCode;
            if (!TextUtils.isEmpty(this.f10945f.mo13803O())) {
                jSONObject.put("app_version", this.f10945f.mo13803O());
            } else {
                jSONObject.put("app_version", packageInfo.versionName);
            }
            if (!TextUtils.isEmpty(this.f10945f.mo13805Q())) {
                jSONObject.put("app_version_minor", this.f10945f.mo13805Q());
            } else {
                jSONObject.put("app_version_minor", "");
            }
            if (this.f10945f.mo13800L() != 0) {
                jSONObject.put("version_code", this.f10945f.mo13800L());
            } else {
                jSONObject.put("version_code", i2);
            }
            if (this.f10945f.mo13801M() != 0) {
                jSONObject.put("update_version_code", this.f10945f.mo13801M());
            } else {
                jSONObject.put("update_version_code", i2);
            }
            if (this.f10945f.mo13802N() != 0) {
                jSONObject.put("manifest_version_code", this.f10945f.mo13802N());
            } else {
                jSONObject.put("manifest_version_code", i2);
            }
            if (!TextUtils.isEmpty(this.f10945f.mo13799K())) {
                jSONObject.put("app_name", this.f10945f.mo13799K());
            }
            if (!TextUtils.isEmpty(this.f10945f.mo13804P())) {
                jSONObject.put("tweaked_channel", this.f10945f.mo13804P());
            }
            if (packageInfo.applicationInfo == null || (i = packageInfo.applicationInfo.labelRes) <= 0) {
                return true;
            }
            try {
                jSONObject.put("display_name", this.f10944e.getString(i));
                return true;
            } catch (Resources.NotFoundException e) {
                e.printStackTrace();
                return true;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C3469r.m14667a(e2);
            return false;
        }
    }

    C3443o(Context context, C3435g gVar) {
        super(false, false);
        this.f10944e = context;
        this.f10945f = gVar;
    }
}
