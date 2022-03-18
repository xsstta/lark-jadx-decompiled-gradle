package com.ss.android.lark.passport.infra.base.router;

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
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.passport.infra.base.router.g */
public class C49094g implements AbstractC49090d {

    /* renamed from: a */
    final ConcurrentHashMap<String, ConcurrentHashMap<Integer, AbstractC49088b>> f123299a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final PassportLog f123300b = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "TotalNormalRouterAction";
    }

    /* renamed from: a */
    private AbstractC49088b m193539a(String str, int i) {
        ConcurrentHashMap<Integer, AbstractC49088b> concurrentHashMap = this.f123299a.get(str);
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

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public boolean mo171381a(String str, int i, UniContext uniContext) {
        String str2;
        AbstractC49088b a = m193539a(str, i);
        if (a != null) {
            str2 = a.mo171383c();
        } else {
            str2 = "null";
        }
        PassportLog passportLog = this.f123300b;
        passportLog.mo171465b("TotalNormalRouterAction", "TotalNormalRouterAction canHandle " + str + " scene= " + RouterScene.getSence(i) + " result= " + str2);
        if (a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m193540a(int i, ConcurrentHashMap<Integer, AbstractC49088b> concurrentHashMap, AbstractC49088b bVar) {
        if (i == RouterScene.ALL.getValue()) {
            Log.m165389i("TotalNormalRouterAction", "handled ALL Sence " + bVar.mo171383c());
            for (Integer num : RouterScene.getSenceList()) {
                concurrentHashMap.put(Integer.valueOf(num.intValue()), bVar);
            }
            return;
        }
        concurrentHashMap.put(Integer.valueOf(i), bVar);
    }

    /* renamed from: a */
    public void mo171388a(String str, AbstractC49088b bVar, int i, int... iArr) {
        String str2;
        if (bVar != null) {
            if (iArr != null) {
                str2 = Arrays.toString(iArr);
            } else {
                str2 = "";
            }
            Log.m165389i("TotalNormalRouterAction", "addRouterAction nextStep: " + str + " name: " + bVar.mo171383c() + " scene: " + RouterScene.getSence(i) + " scenesStr: " + str2);
            ConcurrentHashMap<Integer, AbstractC49088b> concurrentHashMap = this.f123299a.get(str);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            m193540a(i, concurrentHashMap, bVar);
            for (int i2 : iArr) {
                m193540a(i2, concurrentHashMap, bVar);
                if (i2 == RouterScene.ALL.getValue()) {
                    break;
                }
            }
            this.f123299a.put(str, concurrentHashMap);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("step_name", str);
        C49114b b = WatcherHelper.m193667b(uniContext, C40652s.f103161d);
        if (!z || !C49032c.m193132a().mo171195a(str)) {
            AbstractC49088b a = m193539a(str, i);
            if (a == null) {
                PassportLog passportLog = this.f123300b;
                passportLog.mo171471d("TotalNormalRouterAction", "run action but action is null, nextStep: " + str);
                hashMap.put("step_result", "step_unkonwn");
                hashMap.put("tag_name", mo171383c());
                b.addMap(hashMap).flush();
                aVar.onRouterResult(-102, str);
                return;
            }
            PassportLog passportLog2 = this.f123300b;
            passportLog2.mo171465b("TotalNormalRouterAction", "start run action " + a.mo171383c() + ", nextStep: " + str);
            hashMap.put("step_result", "step_succ");
            hashMap.put("tag_name", a.mo171383c());
            b.addMap(hashMap).flush();
            a.mo171380a(context, str, jSONObject, i, z, uniContext, aVar);
            PassportLog passportLog3 = this.f123300b;
            passportLog3.mo171465b("TotalNormalRouterAction", "end run action " + a.mo171383c() + ", nextStep: " + str);
            return;
        }
        PassportLog passportLog4 = this.f123300b;
        passportLog4.mo171465b("TotalNormalRouterAction", "run action but back first, nextStep: " + str);
        hashMap.put("tag_name", mo171383c());
        hashMap.put("step_result", "step_back");
        b.addMap(hashMap).flush();
        aVar.onRouterResult(-101, str);
    }
}
