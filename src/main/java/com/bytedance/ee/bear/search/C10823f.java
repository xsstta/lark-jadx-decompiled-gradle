package com.bytedance.ee.bear.search;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.search.f */
public class C10823f {

    /* renamed from: a */
    private boolean f29004a = (!TextUtils.equals(C4511g.m18594d().mo17367q(), "release"));

    /* renamed from: a */
    public String mo40920a() {
        C4511g.m18594d().mo17344E();
        return "suite";
    }

    /* renamed from: a */
    public void mo40921a(int i) {
        m44878b(i, "click_search_history", "");
    }

    /* renamed from: b */
    public void mo40930b(int i) {
        m44878b(i, "delete_search_history", "");
    }

    /* renamed from: c */
    public void mo40932c(int i, String str) {
        m44878b(i, "client_filter_chat", str);
    }

    /* renamed from: d */
    public void mo40933d(int i, String str) {
        m44878b(i, "client_filter_type", str);
    }

    /* renamed from: e */
    public void mo40934e(int i, String str) {
        m44878b(i, "client_filer_folder", str);
    }

    /* renamed from: f */
    public void mo40935f(int i, String str) {
        m44878b(i, "reset_filter", str);
    }

    /* renamed from: g */
    public void mo40936g(int i, String str) {
        m44878b(i, "confirm_filter", str);
    }

    /* renamed from: b */
    public void mo40931b(int i, String str) {
        m44878b(i, "client_filter_owner", str);
    }

    /* renamed from: a */
    public void mo40924a(int i, String str) {
        m44878b(i, "click_filter", str);
    }

    /* renamed from: a */
    public void mo40929a(String str, SearchResult searchResult) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (searchResult.getCorrections() == null) {
            i = 0;
        } else {
            i = searchResult.getCorrections().size();
        }
        if (searchResult.getSuggestions() == null) {
            i2 = 0;
        } else {
            i2 = searchResult.getSuggestions().size();
        }
        if (searchResult.getCandidates() == null) {
            i3 = 0;
        } else {
            i3 = searchResult.getCandidates().size();
        }
        if (i != 0 || i2 != 0 || i3 != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("request_id", str);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            hashMap.put("has_correction", String.valueOf(z));
            hashMap.put("correction_count", String.valueOf(i));
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            hashMap.put("has_completion", String.valueOf(z2));
            hashMap.put("completion_count", String.valueOf(i2));
            if (i3 != 0) {
                z3 = true;
            }
            hashMap.put("has_people", String.valueOf(z3));
            hashMap.put("people_count", String.valueOf(i3));
            hashMap.put("is_debug", String.valueOf(this.f29004a));
            C5234y.m21391b().mo21079a("search_suggestion", hashMap);
        }
    }

    /* renamed from: a */
    public void mo40922a(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sequence_num", String.valueOf(i2));
        hashMap.put(ShareHitPoint.f121869d, str);
        hashMap.put("is_debug", String.valueOf(this.f29004a));
        C5234y.m21391b().mo21079a("click_suggestion_item", hashMap);
    }

    /* renamed from: b */
    private void m44878b(int i, String str, String str2) {
        String str3;
        C13479a.m54772d("SearchAnalytic", "reportTabClickedAction(), action:" + str + ", tab:" + str2);
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("group", str2);
        hashMap.put("is_debug", String.valueOf(this.f29004a));
        if (i == 1) {
            str3 = "wiki_search_operation";
        } else {
            str3 = "search_operation";
        }
        C5234y.m21391b().mo21079a(str3, hashMap);
    }

    /* renamed from: a */
    public void mo40925a(int i, String str, String str2) {
        String str3;
        C13479a.m54772d("SearchAnalytic", "reportSearchNoResult(), tab:" + str + ", requestId:" + str2);
        HashMap hashMap = new HashMap();
        hashMap.put("group", str);
        hashMap.put("request_id", str2);
        hashMap.put("is_debug", String.valueOf(this.f29004a));
        if (i == 1) {
            str3 = "wiki_search_no_result";
        } else {
            str3 = "search_no_result";
        }
        C5234y.m21391b().mo21079a(str3, hashMap);
    }

    /* renamed from: a */
    public void mo40926a(int i, boolean z, String str) {
        String str2;
        String str3;
        C13479a.m54772d("SearchAnalytic", "reportEnterSearch(), isFromLark:" + z);
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = "lark";
        } else {
            str2 = "doc";
        }
        hashMap.put(ShareHitPoint.f121868c, str2);
        hashMap.put("is_debug", String.valueOf(this.f29004a));
        if (i == 1) {
            str3 = "wiki_click_search";
        } else {
            str3 = "click_search";
        }
        hashMap.put("product", mo40920a());
        hashMap.put("module", str);
        C5234y.m21391b().mo21079a(str3, hashMap);
    }

    /* renamed from: a */
    public void mo40927a(String str, long j, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("location", str);
            jSONObject.put("time", Long.toString(j));
            jSONObject.put("result_type", str2);
            C5234y.m21391b().mo21081a("view_search_result", jSONObject, "");
        } catch (Exception e) {
            C13479a.m54761a("SearchAnalytic", e);
        }
    }

    /* renamed from: a */
    public void mo40928a(String str, long j, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("location", str);
            jSONObject.put("time", Long.toString(j));
            jSONObject.put("result_type", str2);
            jSONObject.put("session_id", str3);
            C5234y.m21391b().mo21081a("search_time", jSONObject, "");
        } catch (Exception e) {
            C13479a.m54761a("SearchAnalytic", e);
        }
    }

    /* renamed from: a */
    public void mo40923a(int i, Document document, String str, int i2, String str2, String str3, String str4) {
        String str5;
        C13479a.m54772d("SearchAnalytic", "reportSearchItemClicked(), \nfile_id:" + C13598b.m55197d(document.mo32472o()) + ", \ngroup:" + str + ", \nsequence_num:" + i2 + ", \nsearch_id:" + str2 + ", \nfile_tenant_id:" + C13598b.m55197d(document.mo32401Q()) + ", \nfile_ic_cross_tenant:" + document.mo32400P() + ", \ntype:" + str3 + ", \nsearch_location:" + str4);
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", C13598b.m55197d(document.mo32472o()));
        hashMap.put("group", str);
        hashMap.put("sequence_num", Integer.valueOf(i2));
        hashMap.put("search_id", str2);
        hashMap.put("file_tenant_id", C13598b.m55197d(document.mo32401Q()));
        hashMap.put("file_is_cross_tenant", String.valueOf(document.mo32400P()));
        hashMap.put(ShareHitPoint.f121869d, str3);
        hashMap.put("is_debug", String.valueOf(this.f29004a));
        hashMap.put("os_source", "android");
        hashMap.put("search_location", str4);
        hashMap.put("product", mo40920a());
        if (i == 1) {
            str5 = "wiki_click_search_item";
        } else {
            str5 = "click_search_item";
        }
        C5234y.m21391b().mo21079a(str5, hashMap);
    }
}
