package com.ss.android.lark.integrator.p2000c;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.platform.godzilla.common.C20323c;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.integrator.c.c */
public class C39132c extends AbstractBaseSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.c.c$b */
    public static class C39135b {

        /* renamed from: a */
        public static C39132c f100441a = new C39132c();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "java_crash_profile";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "CrashProfileSettingHandler";
    }

    /* renamed from: d */
    public static C39132c m154446d() {
        return C39135b.f100441a;
    }

    /* renamed from: com.ss.android.lark.integrator.c.c$a */
    public static class C39134a implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "CrashProfileSettingHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C39132c.m154446d()));
        }
    }

    private C39132c() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.integrator.p2000c.$$Lambda$c$FgIeJWT_7b1bZuc1Lq9jKyQyG0 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C39132c.this.m154445a((String) obj);
            }
        }));
    }

    /* renamed from: e */
    public List<C20323c> mo107775e() {
        int i;
        Log.m165389i("CrashProfileSettingHandler", "get crash profile from sp");
        List<C20323c> jSONArray = C57744a.m224104a().getJSONArray("crash_profile_sp_key", C20323c.class);
        StringBuilder sb = new StringBuilder();
        sb.append("crash profile size:");
        if (CollectionUtils.isEmpty(jSONArray)) {
            i = jSONArray.size();
        } else {
            i = 0;
        }
        sb.append(i);
        Log.m165389i("CrashProfileSettingHandler", sb.toString());
        return jSONArray;
    }

    /* renamed from: a */
    private C20323c m154444a(JSONObject jSONObject) {
        Map<String, Object> innerMap = jSONObject.getInnerMap();
        if (innerMap == null) {
            return null;
        }
        C20323c cVar = new C20323c();
        cVar.f49600a = (String) innerMap.get("processName");
        cVar.f49601b = (String) innerMap.get("className");
        cVar.f49602c = (String) innerMap.get("methodName");
        cVar.f49603d = (String) innerMap.get("threadName");
        cVar.f49604e = (String) innerMap.get("appVersion");
        if (innerMap.get("updateVersion") != null) {
            cVar.f49605f = ((Integer) innerMap.get("updateVersion")).intValue();
        }
        if (innerMap.get("osVersion") != null) {
            cVar.f49608i = ((Integer) innerMap.get("osVersion")).intValue();
        }
        cVar.f49606g = (String) innerMap.get("detailMessage");
        cVar.f49607h = (String) innerMap.get("throwableClassName");
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m154445a(String str) {
        JSONArray jSONArray;
        C20323c a;
        Log.m165389i("CrashProfileSettingHandler", "get crash profile from server");
        try {
            Map<String, Object> innerMap = JSON.parseObject(str).getInnerMap();
            if (innerMap == null || (jSONArray = (JSONArray) innerMap.get("profile")) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && (a = m154444a((JSONObject) next)) != null) {
                    arrayList.add(a);
                }
            }
            Log.m165389i("CrashProfileSettingHandler", "save crash profile to sp,profile size:" + arrayList.size());
            C57744a.m224104a().putJSONArray("crash_profile_sp_key", arrayList);
            return null;
        } catch (Throwable th) {
            Log.m165383e("CrashProfileSettingHandler", th.getMessage());
        }
    }
}
