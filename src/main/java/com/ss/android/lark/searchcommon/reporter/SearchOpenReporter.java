package com.ss.android.lark.searchcommon.reporter;

import com.ss.android.lark.searchcommon.reporter.IReporter;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchOpenReporter;", "Lcom/ss/android/lark/searchcommon/reporter/IReporter;", "()V", "report", "", "args", "Lorg/json/JSONObject;", "reportChatInSideSearch", "location", "", "chatId", "chatType", "reportGlobalSearch", "searchBar", "reset", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.h */
public final class SearchOpenReporter implements IReporter {

    /* renamed from: a */
    public static final SearchOpenReporter f133162a = new SearchOpenReporter();

    private SearchOpenReporter() {
    }

    /* renamed from: a */
    public Object mo183828a(Object obj) {
        return IReporter.C53888a.m208826a(this, obj);
    }

    /* renamed from: a */
    public void mo183829a(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("search_session_id", SessionManager.m209245a());
            jSONObject.put("request_timestamp", System.currentTimeMillis());
            SafeReporter.f133151a.mo183813a("asl_search_view", jSONObject);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208863a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entry_action", "none");
        SearchOpenReporter hVar = f133162a;
        jSONObject.put("search_bar", hVar.mo183828a((Object) str));
        jSONObject.put("search_location", "quick_search");
        jSONObject.put("scene_type", "main");
        hVar.mo183829a(jSONObject);
    }

    @Override // com.ss.android.lark.searchcommon.reporter.IReporter
    /* renamed from: a */
    public void mo183806a(JSONObject jSONObject, String str, String str2) {
        IReporter.C53888a.m208827a(this, jSONObject, str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208864a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("entry_action", "none");
        SearchOpenReporter hVar = f133162a;
        jSONObject.put("search_location", hVar.mo183828a((Object) str));
        jSONObject.put("scene_type", "chat");
        jSONObject.put("chat_id", hVar.mo183828a((Object) str2));
        jSONObject.put("chat_type", hVar.mo183828a((Object) str3));
        hVar.mo183829a(jSONObject);
    }
}
