package com.ss.android.lark.passport.infra.base.router;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40652s;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.p2438d.C49114b;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.passport.infra.base.router.h */
public class C49095h extends AbstractC49088b {

    /* renamed from: b */
    final ConcurrentHashMap<String, ConcurrentHashMap<Integer, C49091e>> f123301b = new ConcurrentHashMap<>();

    /* renamed from: c */
    protected final Map<String, String> f123302c = new HashMap();

    /* renamed from: d */
    private PassportLog f123303d = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "PageRouterAction";
    }

    /* renamed from: a */
    public String mo171390a(Activity activity) {
        Class<?> cls = activity.getClass();
        RouterAnno routerAnno = (RouterAnno) cls.getAnnotation(RouterAnno.class);
        if (routerAnno != null) {
            return routerAnno.name();
        }
        return this.f123302c.get(cls.getName());
    }

    /* renamed from: a */
    public C49091e mo171389a(String str, int i) {
        ConcurrentHashMap<Integer, C49091e> concurrentHashMap = this.f123301b.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        if (i == RouterScene.ALL.value) {
            for (Integer num : RouterScene.getSenceList()) {
                int intValue = num.intValue();
                if (concurrentHashMap.get(Integer.valueOf(intValue)) != null) {
                    return concurrentHashMap.get(Integer.valueOf(intValue));
                }
            }
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo171391a(Class<? extends Activity> cls, int i, int... iArr) {
        RouterAnno routerAnno = (RouterAnno) cls.getAnnotation(RouterAnno.class);
        if (routerAnno == null) {
            return false;
        }
        m193546a(routerAnno.name(), new C49091e(cls), i, iArr);
        return true;
    }

    /* renamed from: a */
    private void m193545a(int i, ConcurrentHashMap<Integer, C49091e> concurrentHashMap, C49091e eVar) {
        String str;
        if (i == RouterScene.ALL.getValue()) {
            if (eVar != null) {
                str = eVar.mo171384a();
            } else {
                str = "";
            }
            Log.m165389i("PageRouterAction", "handle ALL scene, activityName: " + str);
            for (Integer num : RouterScene.getSenceList()) {
                concurrentHashMap.put(Integer.valueOf(num.intValue()), eVar);
            }
            return;
        }
        concurrentHashMap.put(Integer.valueOf(i), eVar);
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public boolean mo171381a(String str, int i, UniContext uniContext) {
        String str2;
        C49091e a = mo171389a(str, i);
        if (a == null) {
            str2 = "false";
        } else {
            str2 = a.mo171384a();
        }
        PassportLog passportLog = this.f123303d;
        passportLog.mo171465b("PageRouterAction", "TotalPageRouterAction canHandle " + str + " scene= " + RouterScene.getSence(i) + " result= " + str2);
        if (a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m193546a(String str, C49091e eVar, int i, int... iArr) {
        String str2;
        if (eVar != null) {
            if (iArr != null) {
                str2 = Arrays.toString(iArr);
            } else {
                str2 = "";
            }
            Log.m165389i("PageRouterAction", "addPageJump nextStep: " + str + " ActivityName: " + eVar.mo171384a() + " routerScene: " + RouterScene.getSence(i) + " scenesStr: " + str2);
            ConcurrentHashMap<Integer, C49091e> concurrentHashMap = this.f123301b.get(str);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            m193545a(i, concurrentHashMap, eVar);
            for (int i2 : iArr) {
                m193545a(i2, concurrentHashMap, eVar);
                if (i2 == RouterScene.ALL.getValue()) {
                    break;
                }
            }
            this.f123301b.put(str, concurrentHashMap);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("step_name", str);
        C49114b b = WatcherHelper.m193667b(uniContext, C40652s.f103161d);
        if (!z || !C49032c.m193132a().mo171195a(str)) {
            C49091e a = mo171389a(str, i);
            if (a == null) {
                PassportLog passportLog = this.f123303d;
                passportLog.mo171471d("PageRouterAction", "run action but jump is null, nextStep: " + str);
                hashMap.put("tag_name", mo171383c());
                hashMap.put("step_result", "step_unkonwn");
                b.addMap(hashMap).flush();
                aVar.onRouterResult(-102, str);
            } else if (a.mo171386a(context, jSONObject, uniContext)) {
                PassportLog passportLog2 = this.f123303d;
                passportLog2.mo171465b("PageRouterAction", "run action success, step: " + str);
                hashMap.put("tag_name", a.mo171384a());
                hashMap.put("step_result", "step_succ");
                b.addMap(hashMap).flush();
                aVar.onRouterResult(-100, str);
            } else {
                PassportLog passportLog3 = this.f123303d;
                passportLog3.mo171471d("PageRouterAction", "run action but jump.routerJump return false, nextStep: " + str);
                hashMap.put("tag_name", a.mo171384a());
                hashMap.put("step_result", "step_unkonwn");
                b.addMap(hashMap).flush();
                aVar.onRouterResult(-102, str);
            }
        } else {
            PassportLog passportLog4 = this.f123303d;
            passportLog4.mo171465b("PageRouterAction", "run action but back first, nextStep: " + str);
            hashMap.put("tag_name", mo171383c());
            hashMap.put("step_result", "step_back");
            b.addMap(hashMap).flush();
            aVar.onRouterResult(-101, str);
        }
    }
}
