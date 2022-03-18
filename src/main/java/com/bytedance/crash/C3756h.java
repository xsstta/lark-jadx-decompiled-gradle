package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.runtime.p229c.C3848b;
import com.bytedance.crash.upload.C3919m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.h */
public class C3756h {

    /* renamed from: b */
    private static MonitorCrash f11582b;

    /* renamed from: a */
    protected MonitorCrash f11583a;

    /* renamed from: e */
    public boolean mo15283e() {
        return false;
    }

    /* renamed from: a */
    public static MonitorCrash m15534a() {
        return f11582b;
    }

    /* renamed from: c */
    public String mo15281c() {
        return this.f11583a.mConfig.mAid;
    }

    /* renamed from: d */
    public JSONObject mo15282d() {
        return mo15280b();
    }

    /* renamed from: b */
    public JSONObject mo15280b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11583a.mConfig.mPackageName == null) {
                Context j = C3774m.m15609j();
                PackageInfo packageInfo = j.getPackageManager().getPackageInfo(j.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT);
                if (packageInfo != null) {
                    if (this.f11583a.mConfig.mVersionInt == -1) {
                        this.f11583a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f11583a.mConfig.mVersionStr == null) {
                        this.f11583a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f11583a.mConfig.mDeviceId)) {
            this.f11583a.mConfig.mDeviceId = C3774m.m15603d().mo15504a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f11583a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f11583a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f11583a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f11583a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f11583a.mConfig.mChannel);
            jSONObject.put("package", this.f11583a.mConfig.mPackageName);
            jSONObject.put("device_id", this.f11583a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f11583a.mConfig.mUID);
            jSONObject.put("os", "Android");
            int i = 0;
            if (this.f11583a.mConfig.mSoList != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f11583a.mConfig.mSoList) {
                    jSONArray.put(str);
                }
                jSONObject.put("so_list", jSONArray);
            }
            if (mo15283e()) {
                i = 1;
            }
            jSONObject.put("single_upload", i);
        } catch (JSONException e) {
            C3968x.m16534a((Throwable) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m15536a(MonitorCrash monitorCrash) {
        new C3756h(monitorCrash);
    }

    /* renamed from: c */
    private JSONObject m15538c(CrashType crashType) {
        return new JSONObject(this.f11583a.mTagMap);
    }

    /* renamed from: a */
    public boolean mo15279a(Object obj) {
        if (this.f11583a == obj) {
            return true;
        }
        return false;
    }

    private C3756h(MonitorCrash monitorCrash) {
        this.f11583a = monitorCrash;
        C3743c.m15475a(this);
        C3848b.m15952c();
        C3919m.m16220a(0);
    }

    /* renamed from: b */
    private JSONObject m15537b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f11583a.mCustomData == null || (userData = this.f11583a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    /* renamed from: a */
    public JSONObject mo15277a(CrashType crashType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", mo15280b());
            if (crashType != null) {
                jSONObject.put("custom", m15537b(crashType));
                jSONObject.put("filters", m15538c(crashType));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m15535a(Context context, final MonitorCrash monitorCrash) {
        C3756h hVar = new C3756h(monitorCrash);
        f11582b = monitorCrash;
        C3774m.m15596a((Application) context.getApplicationContext(), context, new ICommonParams(hVar) {
            /* class com.bytedance.crash.C3756h.C37571 */

            /* renamed from: a */
            final /* synthetic */ C3756h f11584a;

            @Override // com.bytedance.crash.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public String getDeviceId() {
                return monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.bytedance.crash.ICommonParams
            public long getUserId() {
                return monitorCrash.mConfig.mUID;
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Object> getCommonParams() {
                return C3955q.m16457b(this.f11584a.mo15280b());
            }

            {
                this.f11584a = r1;
            }
        });
    }

    /* renamed from: a */
    public JSONObject mo15278a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", mo15280b());
            if (crashType != null) {
                jSONObject.put("custom", m15537b(crashType));
                jSONObject.put("filters", m15538c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
