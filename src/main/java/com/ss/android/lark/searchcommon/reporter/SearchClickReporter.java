package com.ss.android.lark.searchcommon.reporter;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.reporter.IReporter;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import com.ss.android.lark.utils.C57859q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016JX\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J0\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tJS\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"JA\u0010#\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0004H\u0016¨\u0006'"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/SearchClickReporter;", "Lcom/ss/android/lark/searchcommon/reporter/IReporter;", "()V", "report", "", "args", "Lorg/json/JSONObject;", "reportChangeTab", "oldTabName", "", "oldTabSlashId", "newTabName", "newTabSlashId", "sceneType", SearchIntents.EXTRA_QUERY, "filterStatus", "imprId", "reportClickProfile", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "reportFeedbackClick", "entrance", "result", "reportQuickSearch", "searchType", "reportSearchRequest", "slashId", "location", "requestTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "reportSearchResultClick", "position", "", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "reportSearchResultClickInChat", "tagForRpt", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "reset", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.e */
public final class SearchClickReporter implements IReporter {

    /* renamed from: a */
    public static final SearchClickReporter f133152a = new SearchClickReporter();

    @JvmStatic
    /* renamed from: b */
    public static final void m208839b(SearchBaseInfo searchBaseInfo, String str, String str2, Integer num) {
        m208835a(searchBaseInfo, str, str2, num, (String) null, 16, (Object) null);
    }

    private SearchClickReporter() {
    }

    /* renamed from: a */
    public final void mo183816a(SearchBaseInfo searchBaseInfo, String str, String str2, Integer num) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "result_click");
        if (searchBaseInfo != null) {
            if (!(searchBaseInfo instanceof SearchOpenAppInfo) || ((SearchOpenAppInfo) searchBaseInfo).isAvailable()) {
                str3 = searchBaseInfo instanceof SearchSpaceInfo ? "ccm_docs_page_view" : "none";
            } else {
                str3 = "openplatform_ecosystem_application_detail_view";
            }
            jSONObject.put("target", str3);
            if (!(searchBaseInfo instanceof SearchCardInfo)) {
                jSONObject.put("entity_id", C57859q.m224565a(searchBaseInfo.getId()));
                jSONObject.put("result_type", searchBaseInfo.getResultTypeForReport());
            } else if (((SearchCardInfo) searchBaseInfo).getExpand()) {
                jSONObject.put("result_type", "unfold");
            } else {
                jSONObject.put("result_type", "fold");
            }
            jSONObject.put("tag", searchBaseInfo.getTagForReport());
            if (num != null) {
                jSONObject.put("pos", num.intValue());
            }
            jSONObject.put("result_click_action", "none");
            if (searchBaseInfo instanceof SearchOpenSearchInfo) {
                jSONObject.put("slash_id", ((SearchOpenSearchInfo) searchBaseInfo).getSlashId());
            }
            if (str2 != null) {
                jSONObject.put("search_location", str2);
            }
            SearchClickReporter eVar = f133152a;
            eVar.mo183806a(jSONObject, searchBaseInfo.getQuery(), searchBaseInfo.getFilterStatus());
            jSONObject.put("impr_id", searchBaseInfo.getImprId());
            jSONObject.put("scene_type", eVar.mo183814a(str));
            jSONObject.put("search_session_id", searchBaseInfo.getSession());
            jSONObject.put("request_timestamp", System.currentTimeMillis());
            Map<String, Object> extraParams = searchBaseInfo.getExtraParams();
            if (extraParams != null) {
                for (Map.Entry<String, Object> entry : extraParams.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            SafeReporter.f133151a.mo183813a("asl_search_click", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo183817a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "quick_search");
        jSONObject.put("target", "none");
        jSONObject.put("entry_action", "none");
        SearchClickReporter eVar = f133152a;
        jSONObject.put("search_type", eVar.mo183814a(str));
        jSONObject.put("search_location", "quick_search");
        jSONObject.put("impr_id", SessionManager.m209245a() + '_' + SessionManager.m209246b());
        eVar.mo183806a(jSONObject, str2, "");
        jSONObject.put("scene_type", "main");
        eVar.mo183818a(jSONObject);
    }

    /* renamed from: a */
    public void mo183818a(JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.put("search_session_id", SessionManager.m209245a());
            jSONObject.put("request_timestamp", System.currentTimeMillis());
            if (ChatInSideContext.f133144a.mo183805d()) {
                if (!TextUtils.isEmpty(ChatInSideContext.m208818a()) && (!StringsKt.isBlank(ChatInSideContext.m208818a()))) {
                    jSONObject.put("chat_id", ChatInSideContext.m208818a());
                }
                if (!TextUtils.isEmpty(ChatInSideContext.m208820b()) && (!StringsKt.isBlank(ChatInSideContext.m208820b()))) {
                    jSONObject.put("chat_type", ChatInSideContext.m208820b());
                }
            }
            SafeReporter.f133151a.mo183813a("asl_search_click", jSONObject);
        }
    }

    /* renamed from: a */
    public Object mo183814a(Object obj) {
        return IReporter.C53888a.m208826a(this, obj);
    }

    /* renamed from: a */
    public final void mo183815a(SearchBaseInfo searchBaseInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject jSONObject = new JSONObject();
        if (searchBaseInfo instanceof SearchChatterInfo) {
            jSONObject.put("result_type", "contacts");
        } else if (searchBaseInfo instanceof SearchChatInfo) {
            jSONObject.put("result_type", "groups");
        } else {
            return;
        }
        jSONObject.put("click", "profile");
        jSONObject.put("target", "none");
        jSONObject.put("entity_id", C57859q.m224565a(searchBaseInfo.getId()));
        jSONObject.put("search_location", searchBaseInfo.getSearchLocation());
        SearchClickReporter eVar = f133152a;
        eVar.mo183806a(jSONObject, searchBaseInfo.getQuery(), searchBaseInfo.getFilterStatus());
        jSONObject.put("impr_id", searchBaseInfo.getImprId());
        if (searchBaseInfo.isPickerShow()) {
            str = "component";
        } else {
            str = "main";
        }
        jSONObject.put("scene_type", str);
        eVar.mo183818a(jSONObject);
    }

    @Override // com.ss.android.lark.searchcommon.reporter.IReporter
    /* renamed from: a */
    public void mo183806a(JSONObject jSONObject, String str, String str2) {
        IReporter.C53888a.m208827a(this, jSONObject, str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208836a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "feedback");
        SearchClickReporter eVar = f133152a;
        jSONObject.put("entrance", eVar.mo183814a(str));
        jSONObject.put("result", eVar.mo183814a(str2));
        jSONObject.put("search_location", "quick_search");
        IReporter.C53888a.m208828a(eVar, jSONObject, str3, null, 4, null);
        jSONObject.put("impr_id", eVar.mo183814a(str4));
        jSONObject.put("scene_type", "main");
        eVar.mo183818a(jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m208833a(SearchClickReporter eVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        eVar.mo183817a(str, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208834a(SearchBaseInfo searchBaseInfo, String str, String str2, Integer num, String str3) {
        String str4;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "result_click");
        if (searchBaseInfo != null) {
            if ((searchBaseInfo instanceof SearchOpenAppInfo) && !((SearchOpenAppInfo) searchBaseInfo).isAvailable()) {
                str4 = "openplatform_ecosystem_application_detail_view";
            } else if (searchBaseInfo instanceof SearchSpaceInfo) {
                str4 = "ccm_docs_page_view";
            } else {
                str4 = "none";
            }
            jSONObject.put("target", str4);
            jSONObject.put("entity_id", C57859q.m224565a(searchBaseInfo.getId()));
            jSONObject.put("result_type", searchBaseInfo.getResultTypeForReport());
            if (str3 != null) {
                jSONObject.put("tag", str3);
            }
            if (num != null) {
                jSONObject.put("pos", num.intValue());
            }
            jSONObject.put("result_click_action", "none");
            if (searchBaseInfo instanceof SearchOpenSearchInfo) {
                jSONObject.put("slash_id", ((SearchOpenSearchInfo) searchBaseInfo).getSlashId());
            }
            if (str2 != null) {
                jSONObject.put("search_location", str2);
            }
            SearchClickReporter eVar = f133152a;
            eVar.mo183806a(jSONObject, searchBaseInfo.getQuery(), searchBaseInfo.getFilterStatus());
            jSONObject.put("impr_id", searchBaseInfo.getImprId());
            jSONObject.put("scene_type", eVar.mo183814a(str));
            eVar.mo183818a(jSONObject);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m208835a(SearchBaseInfo searchBaseInfo, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        m208834a(searchBaseInfo, str, str2, num, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208837a(String str, String str2, String str3, String str4, String str5, String str6, Long l) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "search_request");
        jSONObject.put("target", "none");
        if (str != null) {
            jSONObject.put("slash_id", str);
        }
        SearchClickReporter eVar = f133152a;
        jSONObject.put("search_location", eVar.mo183814a(str2));
        eVar.mo183806a(jSONObject, str3, str4);
        jSONObject.put("impr_id", eVar.mo183814a(str5));
        jSONObject.put("scene_type", eVar.mo183814a(str6));
        jSONObject.put("search_session_id", SessionManager.m209245a());
        jSONObject.put("request_timestamp", eVar.mo183814a(l));
        eVar.mo183818a(jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208838a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "tab");
        jSONObject.put("target", "none");
        SearchClickReporter eVar = f133152a;
        jSONObject.put("tab_name", eVar.mo183814a(str3));
        jSONObject.put("search_location", eVar.mo183814a(str));
        String str10 = str2;
        if (!TextUtils.isEmpty(str10) || !TextUtils.isEmpty(str4)) {
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(str10)) {
                str9 = "";
            } else {
                str9 = str2 + ',';
            }
            sb.append(str9);
            sb.append(str4);
            jSONObject.put("slash_id", sb.toString());
        }
        eVar.mo183806a(jSONObject, str6, str7);
        jSONObject.put("impr_id", eVar.mo183814a(str8));
        jSONObject.put("scene_type", eVar.mo183814a(str5));
        eVar.mo183818a(jSONObject);
    }
}
