package com.bytedance.ee.bear.search.report;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002)*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J}\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u001bJX\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J)\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010!*\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u0001H!H\u0002¢\u0006\u0002\u0010$J<\u0010%\u001a\u00020\b*\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002J\f\u0010(\u001a\u00020\u0004*\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/search/report/SearchReport;", "", "()V", "TAG", "", "encrypt", "s", "report", "", "event", "params", "Lorg/json/JSONObject;", "reportSearchClick", "search_session_id", "seq_id", "", "module", "click", "target", "query_length", "query_id", "is_filter", "", "filter_status", "entity_id", "result_type", "pos", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "reportSearchShow", "is_result", "id_list", "reportSearchView", "putNotNull", "T", "key", "value", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V", "putSearchPublicParams", "file_id", "file_type", "toString2", "EventID", "ParamValue", "search-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.search.d.a */
public final class SearchReport {

    /* renamed from: a */
    public static final SearchReport f29001a = new SearchReport();

    /* renamed from: a */
    private final String m44865a(boolean z) {
        return z ? "True" : "False";
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44868a(String str, int i, String str2, String str3, String str4, int i2, String str5, boolean z, String str6) {
        m44870a(str, i, str2, str3, str4, i2, str5, z, str6, null, null, null, 3584, null);
    }

    private SearchReport() {
    }

    /* renamed from: a */
    private final void m44874a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        m44873a(jSONObject, "scene_type", "doc");
        m44873a(jSONObject, "search_session_id", str);
        m44873a(jSONObject, "request_timestamp", Long.valueOf(System.currentTimeMillis()));
        m44873a(jSONObject, "module", str2);
        m44873a(jSONObject, "file_id", str3);
        m44873a(jSONObject, "file_type", str4);
    }

    /* renamed from: a */
    private final String m44864a(String str) {
        if (str != null) {
            return C13598b.m55197d(str);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44871a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "search_session_id");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        JSONObject jSONObject = new JSONObject();
        SearchReport aVar = f29001a;
        aVar.m44873a(jSONObject, "entry_action", "none");
        aVar.m44873a(jSONObject, "search_bar", "docs");
        aVar.m44873a(jSONObject, "search_location", "docs");
        m44866a(aVar, jSONObject, str, str2, null, null, 12, null);
        aVar.m44872a("asl_search_view", jSONObject);
    }

    /* renamed from: a */
    private final void m44872a(String str, JSONObject jSONObject) {
        AbstractC5233x b = C5234y.m21391b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        b.mo21085b(str, jSONObject);
    }

    /* renamed from: a */
    private final <T> void m44873a(JSONObject jSONObject, String str, T t) {
        if (t != null) {
            jSONObject.put(str, t);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m44866a(SearchReport aVar, JSONObject jSONObject, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        aVar.m44874a(jSONObject, str, str2, str3, str4);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44867a(String str, int i, String str2, int i2, String str3, boolean z, String str4, boolean z2, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "search_session_id");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        Intrinsics.checkParameterIsNotNull(str3, "query_id");
        JSONObject jSONObject = new JSONObject();
        SearchReport aVar = f29001a;
        aVar.m44873a(jSONObject, "search_location", "docs");
        aVar.m44873a(jSONObject, "query_length", Integer.valueOf(i2));
        aVar.m44873a(jSONObject, "query_id", aVar.m44864a(str3));
        aVar.m44873a(jSONObject, "is_filter", aVar.m44865a(z));
        aVar.m44873a(jSONObject, "filter_status", str4);
        aVar.m44873a(jSONObject, "impr_id", str + '_' + i);
        aVar.m44873a(jSONObject, "is_result", aVar.m44865a(z2));
        aVar.m44873a(jSONObject, "id_list", str5);
        m44866a(aVar, jSONObject, str, str2, null, null, 12, null);
        aVar.m44872a("asl_search_show", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44869a(String str, int i, String str2, String str3, String str4, int i2, String str5, boolean z, String str6, String str7, String str8, Integer num) {
        Integer num2;
        Intrinsics.checkParameterIsNotNull(str, "search_session_id");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        Intrinsics.checkParameterIsNotNull(str3, "click");
        Intrinsics.checkParameterIsNotNull(str4, "target");
        Intrinsics.checkParameterIsNotNull(str5, "query_id");
        JSONObject jSONObject = new JSONObject();
        SearchReport aVar = f29001a;
        aVar.m44873a(jSONObject, "click", str3);
        aVar.m44873a(jSONObject, "target", str4);
        aVar.m44873a(jSONObject, "entity_id", aVar.m44864a(str7));
        aVar.m44873a(jSONObject, "result_type", str8);
        if (num != null) {
            num2 = Integer.valueOf(num.intValue() + 1);
        } else {
            num2 = null;
        }
        aVar.m44873a(jSONObject, "pos", num2);
        aVar.m44873a(jSONObject, "result_click_action", "none");
        aVar.m44873a(jSONObject, "search_location", "docs");
        aVar.m44873a(jSONObject, "query_length", Integer.valueOf(i2));
        aVar.m44873a(jSONObject, "query_id", aVar.m44864a(str5));
        aVar.m44873a(jSONObject, "is_filter", aVar.m44865a(z));
        aVar.m44873a(jSONObject, "filter_status", str6);
        aVar.m44873a(jSONObject, "impr_id", str + '_' + i);
        aVar.m44874a(jSONObject, str, str2, aVar.m44864a(str7), str8);
        aVar.m44872a("asl_search_click", jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m44870a(String str, int i, String str2, String str3, String str4, int i2, String str5, boolean z, String str6, String str7, String str8, Integer num, int i3, Object obj) {
        String str9;
        String str10;
        String str11;
        Integer num2;
        if ((i3 & DynamicModule.f58006b) != 0) {
            str9 = null;
        } else {
            str9 = str6;
        }
        if ((i3 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            str10 = null;
        } else {
            str10 = str7;
        }
        if ((i3 & 1024) != 0) {
            str11 = null;
        } else {
            str11 = str8;
        }
        if ((i3 & 2048) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        m44869a(str, i, str2, str3, str4, i2, str5, z, str9, str10, str11, num2);
    }
}
