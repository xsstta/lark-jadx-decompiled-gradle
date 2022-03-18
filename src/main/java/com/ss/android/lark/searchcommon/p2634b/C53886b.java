package com.ss.android.lark.searchcommon.p2634b;

import com.larksuite.component.metriclogger_constants.domains.search.SearchDomain;
import com.larksuite.component.metriclogger_constants.domains.search.offline.SearchOfflineDomain;
import com.larksuite.component.metriclogger_constants.domains.search.online.SearchOnlineDomain;
import com.larksuite.component.metriclogger_constants.domains.search.p1095a.C24356a;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.searchcommon.b.b */
public class C53886b {
    /* renamed from: a */
    private static HashMap<String, Object> m208798a() {
        String b = C53883a.m208794a().mo183799b();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("search_context", b);
        return hashMap;
    }

    /* renamed from: g */
    private static String m208809g(String str) {
        return SearchCommonUtils.m209228a(str);
    }

    /* renamed from: b */
    public static void m208804b(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, SearchOnlineDomain.f60124m, a);
    }

    /* renamed from: c */
    public static void m208805c(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, SearchOfflineDomain.f60120m, a);
    }

    /* renamed from: d */
    public static void m208806d(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, C24356a.f60114j, a);
    }

    /* renamed from: e */
    public static void m208807e(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, C24356a.f60115k, a);
    }

    /* renamed from: f */
    public static void m208808f(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, C24356a.f60116l, a);
    }

    /* renamed from: a */
    public static void m208801a(String str) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, SearchDomain.f60110f, a);
    }

    /* renamed from: a */
    public static void m208803a(List<Integer> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("local_order_list", list);
        hashMap.put("remote_order_list", list);
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, SearchDomain.f60105a, hashMap);
    }

    /* renamed from: a */
    public static void m208799a(int i, int i2, int i3, List<String> list) {
        HashMap<String, Object> a = m208798a();
        a.put("data_count", Integer.valueOf(i3));
        a.put("scene_type", Integer.valueOf(i));
        a.put("from_type", Integer.valueOf(i2));
        a.put("ids", list);
        SearchCommonModuleDependency.m208732b().mo102900a(false, 0, SearchDomain.f60109e, a);
    }

    /* renamed from: a */
    public static void m208800a(int i, List<String> list, boolean z, long j) {
        HashMap<String, Object> a = m208798a();
        a.put("result_count", Integer.valueOf(i));
        a.put("is_remote", Boolean.valueOf(z));
        a.put("ids", list);
        SearchCommonModuleDependency.m208732b().mo102900a(true, j, SearchDomain.f60111g, a);
    }

    /* renamed from: a */
    public static void m208802a(String str, long j, long j2, String str2) {
        HashMap<String, Object> a = m208798a();
        a.put("key", m208809g(str));
        a.put("error_code", Long.valueOf(j2));
        a.put("error_msg", str2);
        SearchCommonModuleDependency.m208732b().mo102900a(true, j, SearchDomain.f60113i, a);
    }
}
