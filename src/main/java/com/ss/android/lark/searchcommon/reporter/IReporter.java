package com.ss.android.lark.searchcommon.reporter;

import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/IReporter;", "", "packQuery", "", "args", "Lorg/json/JSONObject;", SearchIntents.EXTRA_QUERY, "", "filterStatus", "report", "reset", "safeValue", "value", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.b */
public interface IReporter {
    /* renamed from: a */
    void mo183806a(JSONObject jSONObject, String str, String str2);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.d.b$a */
    public static final class C53888a {
        /* renamed from: a */
        public static Object m208826a(IReporter bVar, Object obj) {
            return obj != null ? obj : "none";
        }

        /* renamed from: a */
        public static void m208827a(IReporter bVar, JSONObject jSONObject, String str, String str2) {
            if (jSONObject != null) {
                if (str == null) {
                    str = "";
                }
                jSONObject.put("query_length", str.length());
                jSONObject.put("query_id", C57859q.m224565a(str));
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("is_filter", "False");
                    return;
                }
                jSONObject.put("is_filter", "True");
                jSONObject.put("filter_status", str2);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m208828a(IReporter bVar, JSONObject jSONObject, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                bVar.mo183806a(jSONObject, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: packQuery");
        }
    }
}
