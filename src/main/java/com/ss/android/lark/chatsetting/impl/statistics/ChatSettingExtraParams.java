package com.ss.android.lark.chatsetting.impl.statistics;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingExtraParams;", "", "()V", "Click", "Status", "Target", "ValidPeriod", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatSettingExtraParams {

    /* renamed from: a */
    public static final ChatSettingExtraParams f90510a = new ChatSettingExtraParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EDIT_GROUP_INFO", "GROUP_QR", "GROUP_PROFILE", "SEARCH", "MEMBER_AVATAR", "GROUP_MEMBER_ADD", "GROUP_MEMBER_DEL", "GROUP_BOT", "ALIAS", "SHARE_PROFILE", "SHARE_GROUP_CARD", "GROUP_CREATE", "EVENT", "MEETING_DOCS", "ANNOUNCEMENT", "TASK", "PIN", "CAL", "MESSAGE", "DOC", "FILE", "IMAGE", "LINK", "QUICKSWITCHER_SWITCH", "CHAT_BOX_SWITCH", "NOTIFICATION_SWITCH", "AUTO_TRANSLATION_SWITCH", "QUIT_GROUP", "DISMISS_GROUP", "REPORT", "GROUP_AVATAR", "GROUP_NAME", "GROUP_DESCRIPTION", "SAVE", "AVATAR_IMAGE", "CUSTOM_TEXT_AVATAR", "AVATAR_TEXT", "AVATAR_COLOR", "SHARE", "LARK", "GROUP_LINK", "COPY", "TRANSFER_GROUP_OWNER", "CANCEL", "SUBMIT", "APPLY_PERMISSION", "CONFIRM", "APPLY_MEMBER_TOPLIMIT", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IClickParam {
        EDIT_GROUP_INFO("edit_group_info"),
        GROUP_QR("group_QR"),
        GROUP_PROFILE("group_profile"),
        SEARCH("search"),
        MEMBER_AVATAR("member_avatar"),
        GROUP_MEMBER_ADD("group_member_add"),
        GROUP_MEMBER_DEL("group_member_del"),
        GROUP_BOT("group_bot"),
        ALIAS("alias"),
        SHARE_PROFILE("share_profile"),
        SHARE_GROUP_CARD("share_group_card"),
        GROUP_CREATE("group_create"),
        EVENT("event"),
        MEETING_DOCS("meeting_docs"),
        ANNOUNCEMENT("announcement"),
        TASK("task"),
        PIN("pin"),
        CAL("cal"),
        MESSAGE("message"),
        DOC("doc"),
        FILE("file"),
        IMAGE("image"),
        LINK("link"),
        QUICKSWITCHER_SWITCH("quickswitcher_switch"),
        CHAT_BOX_SWITCH("chat_box_switch"),
        NOTIFICATION_SWITCH("notification_switch"),
        AUTO_TRANSLATION_SWITCH("auto_translation_switch"),
        QUIT_GROUP("quit_group"),
        DISMISS_GROUP("dismiss_group"),
        REPORT("report"),
        GROUP_AVATAR("group_avatar"),
        GROUP_NAME("group_name"),
        GROUP_DESCRIPTION("group_description"),
        SAVE("save"),
        AVATAR_IMAGE("avatar_image"),
        CUSTOM_TEXT_AVATAR("custom_text_avatar"),
        AVATAR_TEXT("avatar_text"),
        AVATAR_COLOR("avatar_color"),
        SHARE("share"),
        LARK("lark"),
        GROUP_LINK("group_link"),
        COPY("copy"),
        TRANSFER_GROUP_OWNER("transfer_group_owner"),
        CANCEL("cancel"),
        SUBMIT("submit"),
        APPLY_PERMISSION("apply_permission"),
        CONFIRM("confirm"),
        APPLY_MEMBER_TOPLIMIT("apply_member_toplimit");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingExtraParams$Status;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "CHOOSE_TO_UNCHOOSE", "UNCHOOSE_TO_CHOOSE", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status implements IParam {
        CHOOSE_TO_UNCHOOSE("choose_to_unchoose", null, 2, null),
        UNCHOOSE_TO_CHOOSE("unchoose_to_choose", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private Status(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Status(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? UpdateKey.STATUS : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingExtraParams$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IM_CHAT_PIN_VIEW", "PUBLIC_MULTI_SELECT_SHARE_VIEW", "IM_EDIT_GROUP_INFO_VIEW", "IM_SHARE_GROUP_VIEW", "IM_GROUP_QR_VIEW", "PROFILE_MAIN_VIEW", "IM_GROUP_MEMBER_ADD_VIEW", "IM_GROUP_MEMBER_DEL_VIEW", "IM_EDIT_ALIAS_VIEW", "IM_GROUP_CREATE_VIEW", "CAL_EVENT_DETAIL_VIEW", "IM_CHAT_CAL_VIEW", "IM_GROUP_ANNOUNCEMENT_VIEW", "TODO_IM_CHAT_TODO_LIST_VIEW", "CAL_CALENDAR_CHAT_VIEW", "IM_CHAT_HISTORY_VIEW", "IM_CHAT_HISTORY_MESSAGE_VIEW", "IM_CHAT_HISTORY_DOC_VIEW", "IM_CHAT_HISTORY_FILE_VIEW", "IM_CHAT_HISTORY_IMAGE_VIEW", "IM_CHAT_HISTORY_LINK_VIEW", "IM_CHAT_SETTING_VIEW", "IM_QUIT_GROUP_CONFIRM_VIEW", "IM_DISMISS_GROUP_CONFIRM_VIEW", "IM_EDIT_GROUP_AVATAR_VIEW", "IM_EDIT_GROUP_NAME_VIEW", "IM_EDIT_GROUP_DESCRIPTION_VIEW", "IM_GROUP_QR_SHARE_TO_VIEW", "IM_GROUP_LINK_VIEW", "OPENPLATFORM_GROUPBOT_VISIT_BOTLIST_VIEW", "IM_CHAT_MEMBER_TOPLIMIT_APPLY_VIEW", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Target implements ITargetParam {
        IM_CHAT_PIN_VIEW("im_chat_pin_view"),
        PUBLIC_MULTI_SELECT_SHARE_VIEW("public_multi_select_share_view"),
        IM_EDIT_GROUP_INFO_VIEW("im_edit_group_info_view"),
        IM_SHARE_GROUP_VIEW("im_share_group_view"),
        IM_GROUP_QR_VIEW("im_group_QR_view"),
        PROFILE_MAIN_VIEW("profile_main_view"),
        IM_GROUP_MEMBER_ADD_VIEW("im_group_member_add_view"),
        IM_GROUP_MEMBER_DEL_VIEW("im_group_member_del_view"),
        IM_EDIT_ALIAS_VIEW("im_edit_alias_view"),
        IM_GROUP_CREATE_VIEW("im_group_create_view"),
        CAL_EVENT_DETAIL_VIEW("cal_event_detail_view"),
        IM_CHAT_CAL_VIEW("im_chat_cal_view"),
        IM_GROUP_ANNOUNCEMENT_VIEW("im_group_announcement_view"),
        TODO_IM_CHAT_TODO_LIST_VIEW("todo_im_chat_todo_list_view"),
        CAL_CALENDAR_CHAT_VIEW("cal_calendar_chat_view"),
        IM_CHAT_HISTORY_VIEW("im_chat_history_view"),
        IM_CHAT_HISTORY_MESSAGE_VIEW("im_chat_history_message_view"),
        IM_CHAT_HISTORY_DOC_VIEW("im_chat_history_doc_view"),
        IM_CHAT_HISTORY_FILE_VIEW("im_chat_history_file_view"),
        IM_CHAT_HISTORY_IMAGE_VIEW("im_chat_history_image_view"),
        IM_CHAT_HISTORY_LINK_VIEW("im_chat_history_link_view"),
        IM_CHAT_SETTING_VIEW("im_chat_setting_view"),
        IM_QUIT_GROUP_CONFIRM_VIEW("im_quit_group_confirm_view"),
        IM_DISMISS_GROUP_CONFIRM_VIEW("im_dismiss_group_confirm_view"),
        IM_EDIT_GROUP_AVATAR_VIEW("im_edit_group_avatar_view"),
        IM_EDIT_GROUP_NAME_VIEW("im_edit_group_name_view"),
        IM_EDIT_GROUP_DESCRIPTION_VIEW("im_edit_group_description_view"),
        IM_GROUP_QR_SHARE_TO_VIEW("im_group_QR_share_to_view"),
        IM_GROUP_LINK_VIEW("im_group_link_view"),
        OPENPLATFORM_GROUPBOT_VISIT_BOTLIST_VIEW("openplatform_groupbot_visit_botlist_view"),
        IM_CHAT_MEMBER_TOPLIMIT_APPLY_VIEW("im_chat_member_toplimit_apply_view");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/statistics/ChatSettingExtraParams$ValidPeriod;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "WITHIN_7_DAYS", "WITHIN_1_YEARS", "PERMANENT", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ValidPeriod implements IParam {
        WITHIN_7_DAYS("within_7_days", null, 2, null),
        WITHIN_1_YEARS("within_1_year", null, 2, null),
        PERMANENT("permanent", null, 2, null);
        
        private final String key;
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IParam.C54954a.m213213a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(this, cVar);
        }

        private ValidPeriod(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ ValidPeriod(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "valid_period" : str2);
        }
    }

    private ChatSettingExtraParams() {
    }
}
