package com.ss.android.lark.searchcommon.reporter;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.reporter.IReporter;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0006\u0010\u0012\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchTimeReporter;", "Lcom/ss/android/lark/searchcommon/reporter/IReporter;", "sceneType", "", "(Ljava/lang/String;)V", "getSceneType", "()Ljava/lang/String;", "startSearchTimeMs", "", "endSearch", "", "location", "response", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "report", "args", "Lorg/json/JSONObject;", "reset", "startSearch", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.i */
public final class SearchTimeReporter implements IReporter {

    /* renamed from: a */
    public static final Companion f133163a = new Companion(null);

    /* renamed from: b */
    private long f133164b = -1;

    /* renamed from: c */
    private final String f133165c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchTimeReporter$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.d.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public void mo183834b() {
        this.f133164b = -1;
    }

    /* renamed from: a */
    public final void mo183831a() {
        Log.m165379d("LarkSearch.Common.SearchTimeReporter", "startSearch");
        mo183834b();
        this.f133164b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public Object mo183830a(Object obj) {
        return IReporter.C53888a.m208826a(this, obj);
    }

    public SearchTimeReporter(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sceneType");
        this.f133165c = str;
    }

    /* renamed from: a */
    public void mo183833a(JSONObject jSONObject) {
        if (jSONObject != null) {
            SafeReporter.f133151a.mo183813a("asl_search_time_dev", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo183832a(String str, SearchResponse searchResponse) {
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String query;
        Log.m165379d("LarkSearch.Common.SearchTimeReporter", "endSearch, startSearchTimeMs: " + this.f133164b);
        if (this.f133164b == -1) {
            Log.m165383e("LarkSearch.Common.SearchTimeReporter", "startSearchTimeMs invalid!!!");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time", System.currentTimeMillis() - this.f133164b);
        jSONObject.put("search_location", mo183830a(str));
        jSONObject.put("scene_type", this.f133165c);
        String str6 = null;
        if (searchResponse != null) {
            str2 = searchResponse.getRequestId();
        } else {
            str2 = null;
        }
        jSONObject.put("search_id", mo183830a(str2));
        if (searchResponse == null || (query = searchResponse.getQuery()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(query.length());
        }
        jSONObject.put("query_length", mo183830a(num));
        if (searchResponse != null) {
            str3 = searchResponse.getImprId();
        } else {
            str3 = null;
        }
        jSONObject.put("impr_id", mo183830a(str3));
        if (searchResponse != null) {
            str6 = searchResponse.getQuery();
        }
        if (TextUtils.isEmpty(str6)) {
            str4 = "none";
        } else {
            if (searchResponse == null || (str5 = searchResponse.getQuery()) == null) {
                str5 = "";
            }
            str4 = SearchCommonUtils.m209228a(str5);
        }
        jSONObject.put("query_pattern", str4);
        Log.m165379d("LarkSearch.Common.SearchTimeReporter", jSONObject.toString());
        mo183833a(jSONObject);
    }

    @Override // com.ss.android.lark.searchcommon.reporter.IReporter
    /* renamed from: a */
    public void mo183806a(JSONObject jSONObject, String str, String str2) {
        IReporter.C53888a.m208827a(this, jSONObject, str, str2);
    }
}
