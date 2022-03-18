package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60524b;
import com.ss.android.ugc.effectmanager.common.p3053h.C60529g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60537p;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60595c;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a.a */
public class C60614a extends NormalTask {

    /* renamed from: a */
    private C60483a f151543a;

    /* renamed from: b */
    private C60549e f151544b;

    /* renamed from: c */
    private String f151545c;

    /* renamed from: d */
    private String f151546d;

    /* renamed from: e */
    private String f151547e;

    /* renamed from: f */
    private int f151548f;

    /* renamed from: g */
    private Map<String, String> f151549g;

    /* renamed from: c */
    private boolean m235521c() {
        String str;
        int i = this.f151548f;
        if (i == 1) {
            str = C60529g.m235255a(this.f151545c, this.f151546d);
        } else if (i != 2) {
            str = "effect_version" + this.f151545c;
        } else {
            str = C60529g.m235254a(this.f151545c);
        }
        InputStream a = this.f151544b.mo207335t().mo207129a(str);
        if (a == null) {
            return false;
        }
        CheckUpdateVersionModel checkUpdateVersionModel = null;
        try {
            checkUpdateVersionModel = (CheckUpdateVersionModel) this.f151544b.mo207331p().mo207188a(a, CheckUpdateVersionModel.class);
        } catch (Exception e) {
            EPLog.m235180c("CheckUpdateTask", Log.getStackTraceString(e));
        }
        C60524b.m235232a(a);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.f151547e = checkUpdateVersionModel.getVersion();
        return true;
    }

    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    public void mo207037a() {
        if (m235521c()) {
            C60499b d = m235522d();
            if (mo207225b()) {
                mo207224a(13, new C60595c(false, new C60519c((int) UpdateDialogStatusCode.DISMISS)));
            }
            try {
                EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) this.f151544b.mo207332q().mo207211a(d, this.f151544b.mo207331p(), EffectCheckUpdateResponse.class);
                if (effectCheckUpdateResponse != null) {
                    mo207224a(13, new C60595c(effectCheckUpdateResponse.isUpdated(), null));
                } else {
                    mo207224a(13, new C60595c(false, new C60519c((int) UpdateDialogStatusCode.SHOW)));
                }
            } catch (Exception e) {
                e.printStackTrace();
                mo207224a(13, new C60595c(false, new C60519c(e)));
            }
        } else {
            mo207224a(13, new C60595c(true, null));
        }
    }

    /* renamed from: d */
    private C60499b m235522d() {
        SharedPreferences sharedPreferences = this.f151543a.mo207068c().getSharedPreferences(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, 0);
        boolean z = !sharedPreferences.getString("app_version", "").equals(this.f151544b.mo207320e());
        if (z) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("app_version", this.f151544b.mo207320e());
            edit.commit();
        }
        HashMap<String, String> a = EffectRequestUtil.f151340a.mo207238a(this.f151544b);
        a.put("panel", this.f151545c);
        String str = "/panel/check";
        if (this.f151548f == 1) {
            a.put("category", this.f151546d);
            str = "/category/check";
        }
        if (z) {
            a.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "");
        } else {
            a.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f151547e);
        }
        Map<String, String> map = this.f151549g;
        if (map != null) {
            a.putAll(map);
        }
        String s = this.f151544b.mo207334s();
        if (!TextUtils.isEmpty(s)) {
            a.put("test_status", s);
        }
        return new C60499b("GET", C60537p.m235320a(a, this.f151543a.mo207067b() + this.f151544b.mo207325j() + str));
    }

    public C60614a(C60483a aVar, String str, Handler handler, String str2, String str3, int i, Map<String, String> map) {
        super(handler, str);
        this.f151543a = aVar;
        this.f151544b = aVar.mo207066a();
        this.f151545c = str2;
        this.f151546d = str3;
        this.f151548f = i;
        this.f151549g = map;
    }
}
