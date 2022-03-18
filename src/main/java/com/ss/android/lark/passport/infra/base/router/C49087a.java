package com.ss.android.lark.passport.infra.base.router;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.p2069j.p2070a.C40652s;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.base.router.a */
public class C49087a {

    /* renamed from: a */
    protected C49095h f123288a;

    /* renamed from: b */
    protected C49094g f123289b;

    /* renamed from: c */
    private final List<AbstractC49090d> f123290c;

    public C49087a() {
        this.f123290c = new ArrayList();
    }

    /* renamed from: a */
    public String mo171373a(Activity activity) {
        return this.f123288a.mo171390a(activity);
    }

    public C49087a(C49095h hVar, C49094g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f123290c = arrayList;
        this.f123288a = hVar;
        this.f123289b = gVar;
        arrayList.add(hVar);
        arrayList.add(this.f123289b);
    }

    /* renamed from: a */
    public void mo171375a(Class<? extends Activity> cls, int i, int... iArr) {
        this.f123288a.mo171391a(cls, i, iArr);
    }

    /* renamed from: a */
    public boolean mo171378a(String str, int i, UniContext uniContext) {
        for (AbstractC49090d dVar : this.f123290c) {
            if (dVar.mo171381a(str, i, uniContext)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo171376a(Context context, BaseStepData baseStepData, int i, UniContext uniContext, PassportLog passportLog, AbstractC49336a aVar) {
        PassportLog passportLog2;
        if (baseStepData == null) {
            if (passportLog == null) {
                passportLog2 = PassportLog.f123351c.mo171474a();
            } else {
                passportLog2 = passportLog;
            }
            passportLog2.mo171471d("BaseRouter", "router BaseStepData is null");
            return false;
        }
        if (!TextUtils.isEmpty(baseStepData.message)) {
            LKUIToast.show(context, baseStepData.message);
        }
        return m193502a(context, baseStepData.nextStep, baseStepData.stepInfo, i, baseStepData.backFirst, uniContext, passportLog, aVar);
    }

    /* renamed from: a */
    public boolean mo171377a(Context context, String str, JSONObject jSONObject, int i, UniContext uniContext, PassportLog passportLog, AbstractC49336a aVar) {
        return m193502a(context, str, jSONObject, i, false, uniContext, passportLog, aVar);
    }

    /* renamed from: a */
    public void mo171374a(Activity activity, int i, String str, JSONObject jSONObject, int i2, UniContext uniContext, PassportLog passportLog) {
        if (passportLog == null) {
            passportLog = PassportLog.f123351c.mo171474a();
        }
        if (!this.f123288a.mo171381a(str, i2, uniContext)) {
            passportLog.mo171471d("BaseRouter", "startForResult failed: " + str);
            return;
        }
        C49091e a = this.f123288a.mo171389a(str, i2);
        if (a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("step_name", str);
            hashMap.put("tag_name", a.mo171384a());
            hashMap.put("step_result", "step_succ");
            WatcherHelper.m193665a(uniContext, C40652s.f103161d, hashMap);
            a.mo171385a(activity, jSONObject, i, uniContext);
        }
    }

    /* renamed from: a */
    private boolean m193502a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, PassportLog passportLog, AbstractC49336a aVar) {
        PassportLog passportLog2;
        if (passportLog == null) {
            passportLog2 = PassportLog.f123351c.mo171474a();
        } else {
            passportLog2 = passportLog;
        }
        passportLog2.mo171465b("BaseRouter", "start step: " + str);
        if (TextUtils.isEmpty(str)) {
            passportLog2.mo171471d("BaseRouter", "Router.start  nextStep is null !!!");
            return false;
        }
        C49092f.C49093a aVar2 = new C49092f.C49093a(aVar, uniContext, passportLog2);
        for (AbstractC49090d dVar : this.f123290c) {
            if (dVar.mo171381a(str, i, uniContext)) {
                passportLog2.mo171465b("BaseRouter", "start run action: " + dVar.mo171383c());
                dVar.mo171380a(context, str, jSONObject, i, z, uniContext, aVar2);
                passportLog2.mo171465b("BaseRouter", "end run action: " + dVar.mo171383c());
                return true;
            }
        }
        aVar2.onRouterResult(-102, str);
        return false;
    }
}
