package com.ss.android.lark.searchcommon.reporter;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchArgsSetting;
import com.ss.android.lark.statistics.Statistics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchConsistencyReporter;", "", "()V", "SEARCH_CONTEXT_ID", "", "SEARCH_ID_LIST", "TAG", "mCanReport", "", "mContextID", "mIdList", "", "mLimit", "", "mStart", "addOnScreenID", "", "position", "id", "beginReport", "contextID", "start", "idListSize", "report", "reset", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.f */
public final class SearchConsistencyReporter {

    /* renamed from: a */
    public static final SearchConsistencyReporter f133153a = new SearchConsistencyReporter();

    /* renamed from: b */
    private static String f133154b = "";

    /* renamed from: c */
    private static int f133155c;

    /* renamed from: d */
    private static List<String> f133156d = new ArrayList();

    /* renamed from: e */
    private static int f133157e = 5;

    /* renamed from: f */
    private static boolean f133158f;

    private SearchConsistencyReporter() {
    }

    /* renamed from: c */
    private final int m208850c() {
        return f133156d.size();
    }

    static {
        SettingManager.getInstance().get(SearchArgsSetting.class, new IGetDataCallback<SearchArgsSetting>() {
            /* class com.ss.android.lark.searchcommon.reporter.SearchConsistencyReporter.C538891 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("LarkSearch.Common.SearchConsistencyReporter", "mLimit get err! msg: " + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(SearchArgsSetting searchArgsSetting) {
                int i;
                SearchConsistencyReporter fVar = SearchConsistencyReporter.f133153a;
                if (searchArgsSetting != null) {
                    i = searchArgsSetting.f133116b;
                } else {
                    i = 5;
                }
                SearchConsistencyReporter.f133157e = i;
                StringBuilder sb = new StringBuilder();
                sb.append("get top N config: ");
                SearchConsistencyReporter fVar2 = SearchConsistencyReporter.f133153a;
                sb.append(SearchConsistencyReporter.f133157e);
                Log.m165379d("LarkSearch.Common.SearchConsistencyReporter", sb.toString());
            }
        });
    }

    /* renamed from: a */
    private final void m208847a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_id", f133154b);
        JSONArray jSONArray = new JSONArray();
        for (String str : f133156d) {
            jSONArray.put(str);
        }
        jSONObject.put("id_list", jSONArray);
        Log.m165389i("LarkSearch.Common.SearchConsistencyReporter", jSONObject.toString());
        Statistics.sendEvent("search_top_n", jSONObject);
    }

    /* renamed from: b */
    private final void m208849b() {
        Log.m165379d("LarkSearch.Common.SearchConsistencyReporter", "reset " + f133154b);
        f133154b = "";
        f133156d.clear();
    }

    /* renamed from: a */
    public final void mo183819a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (f133158f && i >= f133155c && m208850c() < f133157e) {
            Log.m165379d("LarkSearch.Common.SearchConsistencyReporter", "addOnScreenID, position: " + i + ", id: " + str);
            f133156d.add(str);
            if (m208850c() >= f133157e) {
                m208847a();
                f133158f = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo183820a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "contextID");
        f133158f = true;
        Log.m165379d("LarkSearch.Common.SearchConsistencyReporter", "setContextID " + str + " start " + i);
        m208849b();
        f133154b = str;
        f133155c = i;
    }
}
