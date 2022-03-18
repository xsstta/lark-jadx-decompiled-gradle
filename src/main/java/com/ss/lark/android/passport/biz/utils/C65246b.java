package com.ss.lark.android.passport.biz.utils;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.google.android.gms.auth.api.signin.C21579c;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.lark.android.passport.biz.feature.google_login.GoogleLoginActivity;

/* renamed from: com.ss.lark.android.passport.biz.utils.b */
public class C65246b {

    /* renamed from: a */
    private static C65246b f164311a;

    /* renamed from: a */
    public static C65246b m256133a() {
        if (f164311a == null) {
            synchronized (C65246b.class) {
                if (f164311a == null) {
                    f164311a = new C65246b();
                }
            }
        }
        return f164311a;
    }

    /* renamed from: a */
    private boolean m256134a(Context context, PassportLog passportLog) {
        int isGooglePlayServicesAvailable = C21608a.m78228a().isGooglePlayServicesAvailable(context);
        passportLog.mo171465b("GoogleLogin", "check google login state " + isGooglePlayServicesAvailable);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo224500a(Activity activity, C21579c cVar, final PassportLog passportLog) {
        if (cVar != null) {
            cVar.mo73065b().addOnCompleteListener(activity, new OnCompleteListener<Void>() {
                /* class com.ss.lark.android.passport.biz.utils.C65246b.C652471 */

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Void> task) {
                    passportLog.mo171465b("GoogleLogin", "check google login out complete ");
                }
            });
        }
    }

    /* renamed from: a */
    public void mo224501a(Context context, JSONObject jSONObject, String str, PassportLog passportLog, boolean z) {
        if (m256134a(context, passportLog)) {
            passportLog.mo171465b("GoogleLogin", "loginGoogle by sdk ");
            GoogleLoginActivity.m254382a(context, str, z);
            return;
        }
        passportLog.mo171465b("GoogleLogin", "loginGoogle by url, google service not supported");
        if (jSONObject == null) {
            passportLog.mo171471d("GoogleLogin", "loginGoogle step is null");
        } else {
            ServiceFinder.m193763r().getKaIdp().mo171890a(context, jSONObject);
        }
    }
}
