package com.ss.android.appcenter.business.net;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.net.templatedata.C27763f;
import com.ss.android.appcenter.business.p1265a.C27579g;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.business.p1265a.C27581i;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.net.a */
public class C27711a extends C27714b {

    /* renamed from: a */
    public static boolean f69275a;

    /* renamed from: b */
    public static String f69276b;

    /* renamed from: c */
    public static boolean f69277c;

    /* renamed from: d */
    public static String f69278d;

    /* renamed from: a */
    public static void m101334a(List<C27763f> list, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        jsonObject.add("moduleReqList", C27579g.f68797a.toJsonTree(list));
        String jsonObject2 = jsonObject.toString();
        String l = C27724c.m101393l();
        if (f69277c && !TextUtils.isEmpty(f69278d)) {
            l = f69278d;
        }
        m101358a(m101360c().mo55528a(l).mo55533c(jsonObject2), l, aVar);
        C28184h.m103250d("ApiTemplateDataService", C27580h.m100662a(l, jsonObject2));
    }

    /* renamed from: a */
    public static void m101336a(boolean z, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        jsonObject.addProperty("needWidget", (Boolean) true);
        jsonObject.addProperty("needBlock", Boolean.valueOf(z));
        String jsonObject2 = jsonObject.toString();
        String n = C27724c.m101395n();
        m101358a(m101360c().mo55528a(n).mo55533c(jsonObject2), n, aVar);
        C28184h.m103250d("GetWorkplaceHome", C27580h.m100662a(n, jsonObject2));
    }

    /* renamed from: a */
    public static void m101335a(boolean z, int i, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        jsonObject.addProperty("needWidget", (Boolean) true);
        jsonObject.addProperty("needBlock", Boolean.valueOf(z));
        jsonObject.addProperty("subTagId", Integer.valueOf(i));
        String jsonObject2 = jsonObject.toString();
        String x = C27724c.m101405x();
        m101358a(m101360c().mo55528a(x).mo55533c(jsonObject2), x, aVar);
        C28184h.m103250d("GetWorkplaceSubTagItemInfo", C27580h.m100662a(x, jsonObject2));
    }

    /* renamed from: b */
    public static void m101337b(C27714b.AbstractC27716a aVar) {
        String o = C27724c.m101396o();
        m101358a(m101360c().mo55528a(o).mo55533c(null), o, aVar);
        C28184h.m103250d("GetWorkplaceSetting", C27580h.m100662a(o, ""));
    }

    /* renamed from: c */
    public static void m101340c(C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        String jsonObject2 = jsonObject.toString();
        String z = C27724c.m101407z();
        m101358a(m101360c().mo55528a(z).mo55533c(jsonObject2), z, aVar);
        C28184h.m103250d("getBizPopupsData", C27580h.m100662a(z, jsonObject2));
    }

    /* renamed from: a */
    public static void m101328a(C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        String jsonObject2 = jsonObject.toString();
        String m = C27724c.m101394m();
        if (f69275a && !TextUtils.isEmpty(f69276b)) {
            m = f69276b;
        }
        m101358a(m101360c().mo55528a(m).mo55533c(jsonObject2), m, aVar);
        C28184h.m103250d("WorkplaceTemplateService#Api", C27580h.m100662a(m, jsonObject2));
    }

    /* renamed from: a */
    public static void m101329a(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("itemId", str);
        String jsonObject2 = jsonObject.toString();
        String y = C27724c.m101406y();
        m101358a(m101360c().mo55528a(y).mo55533c(jsonObject2), y, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.net.C27711a.C277121 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103247a("AfterClickItemProcess", "click New app error:", errorResult);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C28184h.m103250d("AfterClickItemProcess", "click New app response:" + sendHttpResponse);
            }
        });
        C28184h.m103250d("AfterClickItemProcess", C27580h.m100662a(y, jsonObject2));
    }

    /* renamed from: d */
    public static void m101343d(String str, C27714b.AbstractC27716a aVar) {
        m101331a(str, (String) null, aVar);
    }

    /* renamed from: e */
    public static void m101345e(String str, C27714b.AbstractC27716a aVar) {
        m101331a((String) null, str, aVar);
    }

    /* renamed from: a */
    public static void m101330a(String str, C27714b.AbstractC27716a aVar) {
        m101358a(new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.GET).mo55528a(str), str, aVar);
        C28184h.m103250d("WorkplaceTemplateService#Api", C27580h.m100662a(str, ""));
    }

    /* renamed from: b */
    public static void m101338b(String str, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(str);
        jsonObject.add("itemIds", jsonArray);
        String jsonObject2 = jsonObject.toString();
        String v = C27724c.m101403v();
        m101358a(m101360c().mo55528a(v).mo55533c(jsonObject2), v, aVar);
        C28184h.m103250d("AddCommonItem", C27580h.m100662a(v, jsonObject2));
    }

    /* renamed from: d */
    public static void m101344d(boolean z, C27714b.AbstractC27716a aVar) {
        JsonObject b = m101359b();
        b.addProperty("isOnboarding", Boolean.valueOf(z));
        String jsonObject = b.toString();
        String C = C27724c.m101378C();
        m101358a(m101360c().mo55528a(C).mo55533c(jsonObject), C, aVar);
        C28184h.m103250d("GetOperationalConfig", C27580h.m100662a(C, jsonObject));
    }

    /* renamed from: f */
    public static void m101346f(String str, C27714b.AbstractC27716a aVar) {
        StringBuilder sb = new StringBuilder(C27724c.m101402u());
        sb.append("?page_size=");
        sb.append(50);
        if (str != null) {
            sb.append("&page_token=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        m101358a(m101360c().mo55528a(sb2).mo55526a(SendHttpRequest.Method.GET), sb2, aVar);
        C28184h.m103250d("GetAppBadgeSettings", C27580h.m100662a(sb2, (String) null));
    }

    /* renamed from: g */
    public static void m101347g(String str, C27714b.AbstractC27716a aVar) {
        String str2 = C13047a.C13049b.m53532a() + "/SyncClientAuth";
        m101358a(m101360c().mo55528a(str2).mo55533c(str).mo55526a(SendHttpRequest.Method.POST), str2, aVar);
        C28184h.m103250d("syncAppBadgeSetting", C27580h.m100662a(str2, str));
    }

    /* renamed from: b */
    public static void m101339b(boolean z, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        jsonObject.addProperty("needWidget", (Boolean) true);
        jsonObject.addProperty("needBlock", Boolean.valueOf(z));
        String jsonObject2 = jsonObject.toString();
        String p = C27724c.m101397p();
        m101358a(m101360c().mo55528a(p).mo55533c(jsonObject2), p, aVar);
        C28184h.m103250d("GetUserItems", C27580h.m100662a(p, jsonObject2));
    }

    /* renamed from: c */
    public static void m101341c(String str, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("itemId", str);
        String jsonObject2 = jsonObject.toString();
        String w = C27724c.m101404w();
        m101358a(m101360c().mo55528a(w).mo55533c(jsonObject2), w, aVar);
        C28184h.m103250d("DeleteCommonItem", C27580h.m100662a(w, jsonObject2));
    }

    /* renamed from: h */
    public static void m101348h(String str, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("notificationId", str);
        jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        String jsonObject2 = jsonObject.toString();
        String A = C27724c.m101376A();
        m101358a(m101360c().mo55528a(A).mo55533c(jsonObject2), A, aVar);
        C28184h.m103250d("ackBizPopupsData", C27580h.m100662a(A, jsonObject2));
    }

    /* renamed from: c */
    public static void m101342c(boolean z, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        jsonObject.addProperty("needBlock", Boolean.valueOf(z));
        String jsonObject2 = jsonObject.toString();
        String t = C27724c.m101401t();
        m101358a(m101360c().mo55528a(t).mo55533c(jsonObject2), t, aVar);
        C28184h.m103250d("GetTagsAndRecent", C27580h.m100662a(t, jsonObject2));
    }

    /* renamed from: a */
    private static void m101331a(String str, String str2, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("locale", C28183g.m103240a());
        String s = C27724c.m101400s();
        jsonObject.addProperty("needBlock", Boolean.valueOf(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.block.display")));
        if (!TextUtils.isEmpty(str)) {
            jsonObject.addProperty(SearchIntents.EXTRA_QUERY, str);
        } else {
            jsonObject.addProperty("tagId", str2);
        }
        String jsonObject2 = jsonObject.toString();
        m101358a(m101360c().mo55528a(s).mo55533c(jsonObject2), s, aVar);
        if (!TextUtils.isEmpty(str)) {
            C28184h.m103250d("SearchItemByQuery", C27580h.m100662a(s, jsonObject2));
        } else {
            C28184h.m103250d("SearchItemByTag", C27580h.m100662a(s, jsonObject2));
        }
    }

    /* renamed from: a */
    public static void m101333a(List<OnboardingAppInfo> list, int i, C27714b.AbstractC27716a aVar) {
        JsonArray jsonArray = new JsonArray();
        for (OnboardingAppInfo onboardingAppInfo : list) {
            jsonArray.add(onboardingAppInfo.getAppId());
        }
        JsonObject b = m101359b();
        b.add("apps", jsonArray);
        b.addProperty("timeOffset", Integer.valueOf(i));
        String jsonObject = b.toString();
        String D = C27724c.m101379D();
        m101358a(m101360c().mo55528a(D).mo55533c(jsonObject), D, aVar);
        C28184h.m103250d("AsyncInstallApps", C27580h.m100662a(D, jsonObject));
    }

    /* renamed from: a */
    public static void m101327a(JsonArray jsonArray, JsonArray jsonArray2, JsonArray jsonArray3, JsonArray jsonArray4, C27714b.AbstractC27716a aVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("newCommonWidgetItemList", jsonArray);
        jsonObject.add("originCommonWidgetItemList", jsonArray2);
        jsonObject.add("newCommonIconItemList", jsonArray3);
        jsonObject.add("originCommonIconItemList", jsonArray4);
        String jsonObject2 = jsonObject.toString();
        String q = C27724c.m101398q();
        m101358a(m101360c().mo55528a(q).mo55533c(jsonObject2), q, aVar);
        C28184h.m103250d("UpdateCommonItem", C27580h.m100662a(q, jsonObject2));
    }

    /* renamed from: a */
    public static void m101332a(String str, boolean z, String str2, SendHttpRequest.Method method, C27714b.AbstractC27716a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C27581i.m100670a());
        hashMap.put("locale", C28183g.m103240a());
        hashMap.put("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        if (z) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        SendHttpRequest.C15253a a = new SendHttpRequest.C15253a().mo55529a(hashMap).mo55526a(method).mo55528a(str).mo55527a((Integer) 30);
        if (!TextUtils.isEmpty(str2)) {
            a.mo55533c(str2);
        }
        m101358a(a, str, aVar);
        C28184h.m103250d("ApiTemplateDataService", C27580h.m100662a(str, ""));
    }
}
