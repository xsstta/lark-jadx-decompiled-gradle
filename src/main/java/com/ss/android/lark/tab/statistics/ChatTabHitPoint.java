package com.ss.android.lark.tab.statistics;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/tab/statistics/ChatTabHitPoint;", "", "()V", "IS_TITLE_ADDED", "", "sendChatTabAddClickEvent", "", "extraParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendChatTabAddViewEvent", "sendChatTabManagerClickEvent", "sendChatTabManagerDeleteConfirmClickEvent", "sendChatTabManagerDeleteConfirmViewEvent", "sendChatTabManagerViewEvent", "sendChatTabModifyClickEvent", "fileId", "isTitleAdd", "", "sendChatTabModifyViewEvent", "sendChatTabSpaceListClickEvent", "sendChatTabSpaceListViewEvent", "ChatTabExtraParam", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatTabHitPoint {

    /* renamed from: a */
    public static final ChatTabHitPoint f136619a = new ChatTabHitPoint();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/statistics/ChatTabHitPoint$ChatTabExtraParam;", "", "()V", "Click", "Target", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ChatTabExtraParam {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/tab/statistics/ChatTabHitPoint$ChatTabExtraParam$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADD_DOC_PAGE_TOP_SIDEBAR", "DOC_PAGE_MANAGE", "DOC_PAGE_TAB", "DOC_LIST_TAB", "SAVE_DOC_PAGE", "SELECT_DOC_PC", "SELECT_DOC_MOBILE", "SEARCH_DOC", "DELETE_DOC", "SAVE_DOC_PAGE_MANAGE", "DRAG_DOC", "CONFIRM", "DOC", "JUMP_TO_CHAT", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        public enum Click implements IClickParam {
            ADD_DOC_PAGE_TOP_SIDEBAR("add_doc_page_top_sidebar"),
            DOC_PAGE_MANAGE("doc_page_manage"),
            DOC_PAGE_TAB("doc_page_tab"),
            DOC_LIST_TAB("doc_list_tab"),
            SAVE_DOC_PAGE("save_doc_page"),
            SELECT_DOC_PC("select_doc_pc"),
            SELECT_DOC_MOBILE("select_doc_mobile"),
            SEARCH_DOC("search_doc"),
            DELETE_DOC("delete_doc"),
            SAVE_DOC_PAGE_MANAGE("save_doc_page_manage"),
            DRAG_DOC("drag_doc"),
            CONFIRM("confirm"),
            DOC("doc"),
            JUMP_TO_CHAT("jump_to_chat");
            
            private final String value;

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public String getValue() {
                return this.value;
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public String getKey() {
                return IClickParam.C54953a.m213210a(this);
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public JSONObject toJson() {
                return IClickParam.C54953a.m213211b(this);
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public IParam plus(IParam cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "target");
                return IClickParam.C54953a.m213209a(this, cVar);
            }

            private Click(String str) {
                this.value = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/tab/statistics/ChatTabHitPoint$ChatTabExtraParam$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IM_CHAT_DOC_PAGE_ADD_VIEW", "IM_CHAT_DOC_PAGE_MANAGE_VIEW", "CCM_DOCS_PAGE_VIEW", "IM_CHAT_DOC_LIST_VIEW", "TRUE", "FALSE", "NONE", "IM_CHAT_DOC_PAGE_NAME_SETTING_VIEW", "IM_CHAT_DOC_DELETE_CONFIRM_VIEW", "IM_CHAT_MAIN_VIEW", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        public enum Target implements ITargetParam {
            IM_CHAT_DOC_PAGE_ADD_VIEW("im_chat_doc_page_add_view"),
            IM_CHAT_DOC_PAGE_MANAGE_VIEW("im_chat_doc_page_manage_view"),
            CCM_DOCS_PAGE_VIEW("ccm_docs_page_view"),
            IM_CHAT_DOC_LIST_VIEW("im_chat_doc_list_view"),
            TRUE("true"),
            FALSE("false"),
            NONE("none"),
            IM_CHAT_DOC_PAGE_NAME_SETTING_VIEW("im_chat_doc_page_name_setting_view"),
            IM_CHAT_DOC_DELETE_CONFIRM_VIEW("im_chat_doc_delete_confirm_view"),
            IM_CHAT_MAIN_VIEW("im_chat_main_view");
            
            private final String value;

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public String getValue() {
                return this.value;
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public String getKey() {
                return ITargetParam.C54955a.m213215a(this);
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public JSONObject toJson() {
                return ITargetParam.C54955a.m213216b(this);
            }

            @Override // com.ss.android.lark.statistics.extensions.IParam
            public IParam plus(IParam cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "target");
                return ITargetParam.C54955a.m213214a(this, cVar);
            }

            private Target(String str) {
                this.value = str;
            }
        }
    }

    private ChatTabHitPoint() {
    }

    /* renamed from: a */
    public final void mo188720a() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_doc_page_add_view", jSONObject);
    }

    /* renamed from: b */
    public final void mo188724b() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_doc_page_name_setting_view", jSONObject);
    }

    /* renamed from: c */
    public final void mo188726c() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_doc_page_manage_view", jSONObject);
    }

    /* renamed from: d */
    public final void mo188727d() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_doc_delete_confirm_view", jSONObject);
    }

    /* renamed from: e */
    public final void mo188728e() {
        JSONObject jSONObject;
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            jSONObject = C54952a.m213207a(b);
        } else {
            jSONObject = null;
        }
        Statistics.sendEvent("im_chat_doc_list_view", jSONObject);
    }

    /* renamed from: a */
    public final void mo188721a(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_doc_page_add_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
    }

    /* renamed from: b */
    public final void mo188725b(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Statistics.sendEvent("im_chat_doc_page_manage_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson());
    }

    /* renamed from: a */
    public final void mo188722a(IParam cVar, String str) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Statistics.sendEvent("im_chat_doc_list_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson().put("file_id", str));
    }

    /* renamed from: a */
    public final void mo188723a(IParam cVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(cVar, "extraParam");
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Statistics.sendEvent("im_chat_doc_page_name_setting_click", C54952a.m213204a(cVar, ChatParamUtils.m133148b()).toJson().put("file_id", str).put("is_title_added", z));
    }
}
