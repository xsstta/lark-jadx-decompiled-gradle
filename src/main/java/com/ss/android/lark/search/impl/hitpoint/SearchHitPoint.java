package com.ss.android.lark.search.impl.hitpoint;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/SearchHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.c.a */
public final class SearchHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f131886a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m206541a(String str, String str2, int i, String str3, String str4, int i2, String str5) {
        f131886a.mo182015a(str, str2, i, str3, str4, i2, str5);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m206542a(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6) {
        f131886a.mo182016a(str, str2, i, str3, str4, str5, i2, str6);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m206543a(String str, String str2, int i, JSONObject jSONObject, String str3, String str4, Integer num, String str5, int i2) {
        f131886a.mo182017a(str, str2, i, jSONObject, str3, str4, num, str5, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0004J,\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004JJ\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004Jh\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010%\u001a\u00020\tJF\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007JP\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007JX\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u001dH\u0007J_\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/SearchHitPoint$Companion;", "", "()V", "TAG", "", "getIsAdminParam", "admin", "", "sendChatHistorySideMenuClick", "", "chatType", "isAdmin", "chatId", "sendClickChatHistoryResults", "category", "isSearch", "action", "fileId", "fileType", "requestId", "sendOpenPicBrowserEvent", "sendOpenSearchEvent", "searchBar", "sendScrollNextPicBrowserEvent", "sendScrollPrePicBrowserEvent", "sendSearchChatHistory", "page", "sendSearchEvent", "queryLength", "", UpdateKey.STATUS, "location", "session", "filter", "imprId", "filterStatus", "openSearchTabId", "sendSearchHistoryClearEvent", "sendSearchResultClick", "target", "sceneType", "entityId", "absPosition", "business", "Lorg/json/JSONObject;", "position", "(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;I)V", "sendViewInChatInPicBrowserEvent", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.c.a$a */
    public static final class Companion {
        /* renamed from: a */
        private final String m206544a(boolean z) {
            return z ? "y" : C64034n.f161683a;
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo182019a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", str2);
            jSONObject.put("is_search", str3);
            jSONObject.put("action", str4);
            jSONObject.put("chat_type", str);
            if (str5 != null && true == (!StringsKt.isBlank(str5))) {
                jSONObject.put("file_id", str5);
            }
            if (str6 != null && true == (!StringsKt.isBlank(str6))) {
                jSONObject.put("file_type", str6);
            }
            if (str7 != null && true == (!StringsKt.isBlank(str7))) {
                jSONObject.put("search_id", str7);
            }
            Statistics.sendEvent("click_chat_history_results", jSONObject);
        }

        /* renamed from: a */
        public final void mo182020a(String str, boolean z, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("chat_type", str);
            jSONObject.put(ShareHitPoint.f121868c, "sidebar");
            jSONObject.put("is_admin", SearchHitPoint.f131886a.m206544a(z));
            jSONObject.put("chat_id", str2);
            Statistics.sendEvent("chat_history_sidebar", jSONObject);
        }

        /* renamed from: a */
        public final void mo182011a() {
            Statistics.sendEvent("search_clean_history_query", new JSONObject());
        }

        /* renamed from: b */
        public final void mo182021b() {
            Statistics.sendEvent("open_search", new JSONObject());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo182013a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "searchBar");
            Statistics.sendEvent("open_search", new JSONObject().put("searchbar", str));
        }

        /* renamed from: b */
        public final void mo182022b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("picbrowser_view_ChatHistory", new JSONObject().put("chat_type", str));
        }

        /* renamed from: c */
        public final void mo182023c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("picbrowser_previous_ChatHistory", new JSONObject().put("chat_type", str));
        }

        /* renamed from: d */
        public final void mo182024d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("picbrowser_next_ChatHistory", new JSONObject().put("chat_type", str));
        }

        /* renamed from: e */
        public final void mo182025e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            Statistics.sendEvent("picbrowser_view_in_chat", new JSONObject().put("chat_type", str));
        }

        /* renamed from: a */
        public final void mo182014a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "page");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", str);
            if (str2 != null && true == (!StringsKt.isBlank(str2))) {
                jSONObject.put("search_id", str2);
            }
            Statistics.sendEvent("search_chat_history", jSONObject);
        }

        /* renamed from: a */
        public final void mo182018a(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "chatType");
            mo182019a(str, str2, str3, str4, "", "", "");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo182015a(String str, String str2, int i, String str3, String str4, int i2, String str5) {
            String str6;
            Intrinsics.checkParameterIsNotNull(str, "target");
            Intrinsics.checkParameterIsNotNull(str2, "page");
            Companion aVar = this;
            JSONObject jSONObject = new JSONObject();
            if (str4 != null) {
                str6 = str4;
            } else {
                str6 = "";
            }
            aVar.mo182017a(str, str2, i, jSONObject, str3, str6, Integer.valueOf(i2), str5, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo182016a(String str, String str2, int i, String str3, String str4, String str5, int i2, String str6) {
            String str7;
            Intrinsics.checkParameterIsNotNull(str, "target");
            Intrinsics.checkParameterIsNotNull(str2, "page");
            Companion aVar = this;
            JSONObject put = new JSONObject().put("chat_id", str3);
            if (str5 != null) {
                str7 = str5;
            } else {
                str7 = "";
            }
            aVar.mo182017a(str, str2, i, put, str4, str7, Integer.valueOf(i2), str6, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo182012a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            Intrinsics.checkParameterIsNotNull(str, UpdateKey.STATUS);
            Intrinsics.checkParameterIsNotNull(str2, "location");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("query_length", i);
            jSONObject.put("search_result", str);
            jSONObject.put("search_location", str2);
            jSONObject.put("search_id", str3);
            jSONObject.put("search_session_ID", str4);
            jSONObject.put("filter", str5);
            jSONObject.put("impr_id", str6);
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("filter_status", str7);
            jSONObject.put("open_search_tab_id", str8);
            Log.m165379d("LarkSearch.Search.SearchHitPoint", "session: " + str4);
            Statistics.sendEvent("search", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo182017a(String str, String str2, int i, JSONObject jSONObject, String str3, String str4, Integer num, String str5, int i2) {
            int i3;
            Intrinsics.checkParameterIsNotNull(str, "target");
            Intrinsics.checkParameterIsNotNull(str2, "page");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject put = jSONObject.put("local", "search").put("click_target", str).put("result_page", str2).put("result_location", i);
            if (str3 == null) {
                str3 = "";
            }
            JSONObject put2 = put.put("search_session_ID", str3);
            if (str4 == null) {
                str4 = "";
            }
            JSONObject put3 = put2.put("impr_id", str4);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            put3.put("scene_type", i3).put("entity_id", str5).put("position", i2);
            Log.m165379d("LarkSearch.Search.SearchHitPoint", jSONObject.toString());
            Statistics.sendEvent("search_result_click", jSONObject);
        }
    }
}
