package com.ss.android.lark.profile.statistics;

import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams;", "", "()V", "AliasLengthParam", "Click", "ContactTypeParam", "IAliasLengthParam", "IContactTypeParam", "ISignatureLengthParam", "IToUserIdParam", "IsReasonApply", "Param", "SignatureLengthParam", "Target", "ToUserIdParam", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserProfileExtraParams {

    /* renamed from: a */
    public static final UserProfileExtraParams f130728a = new UserProfileExtraParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$IContactTypeParam;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "key", "", "getKey", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$a */
    public interface IContactTypeParam extends IParam {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$a$a */
        public static final class C52909a {
            /* renamed from: a */
            public static IParam m204675a(IContactTypeParam aVar, IParam cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "target");
                return IParam.C54954a.m213212a(aVar, cVar);
            }

            /* renamed from: a */
            public static String m204676a(IContactTypeParam aVar) {
                return "contact_type";
            }

            /* renamed from: b */
            public static JSONObject m204677b(IContactTypeParam aVar) {
                return IParam.C54954a.m213213a(aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ISignatureLengthParam;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "key", "", "getKey", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$b */
    public interface ISignatureLengthParam extends IParam {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$b$a */
        public static final class C52910a {
            /* renamed from: a */
            public static IParam m204678a(ISignatureLengthParam bVar, IParam cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "target");
                return IParam.C54954a.m213212a(bVar, cVar);
            }

            /* renamed from: a */
            public static String m204679a(ISignatureLengthParam bVar) {
                return "signature_length";
            }

            /* renamed from: b */
            public static JSONObject m204680b(ISignatureLengthParam bVar) {
                return IParam.C54954a.m213213a(bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$IToUserIdParam;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "key", "", "getKey", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$c */
    public interface IToUserIdParam extends IParam {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$c$a */
        public static final class C52911a {
            /* renamed from: a */
            public static IParam m204681a(IToUserIdParam cVar, IParam cVar2) {
                Intrinsics.checkParameterIsNotNull(cVar2, "target");
                return IParam.C54954a.m213212a(cVar, cVar2);
            }

            /* renamed from: a */
            public static String m204682a(IToUserIdParam cVar) {
                return "to_user_id";
            }

            /* renamed from: b */
            public static JSONObject m204683b(IToUserIdParam cVar) {
                return IParam.C54954a.m213213a(cVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VOICE_CALL", "DELETE", "MORE", "BACKGROUND", "REPORT", "UNBLOCK", "PHONE_CALL", "CONTACT_AGREE", "SAVE", "BLOCK", "VIDEO_CALL", "BASIC_INFORMATION_TAB", "AVATAR", "SEND", "CONTACT_ADD", "ALIAS", "SIGNATURE", "SHARE", "MESSAGE", "MOMENTS_TAB", "CERTIFICATION", "SECRET_MESSAGE", "BASIC_INFORMATION_FIELDS", "MESSAGE_HISTORY", "PERSONAL_STATUS", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IClickParam {
        VOICE_CALL("voice_call"),
        DELETE("delete"),
        MORE("more"),
        BACKGROUND("background"),
        REPORT("report"),
        UNBLOCK("unblock"),
        PHONE_CALL("phone_call"),
        CONTACT_AGREE("contact_agree"),
        SAVE("save"),
        BLOCK("block"),
        VIDEO_CALL("video_call"),
        BASIC_INFORMATION_TAB("basic_information_tab"),
        AVATAR("avatar"),
        SEND("send"),
        CONTACT_ADD("contact_add"),
        ALIAS("alias"),
        SIGNATURE("signature"),
        SHARE("share"),
        MESSAGE("message"),
        MOMENTS_TAB("moments_tab"),
        CERTIFICATION("certification"),
        SECRET_MESSAGE("secret_message"),
        BASIC_INFORMATION_FIELDS("basic_information_fields"),
        MESSAGE_HISTORY("message_history"),
        PERSONAL_STATUS("personal_status");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ContactTypeParam;", "", "Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$IContactTypeParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SELF", "INTERNAL", "EXTERNAL_FRIEND", "EXTERNAL_NOFRIEND", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ContactTypeParam implements IContactTypeParam {
        SELF("self"),
        INTERNAL("internal"),
        EXTERNAL_FRIEND("external_friend"),
        EXTERNAL_NOFRIEND("external_nonfriend");
        
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return IContactTypeParam.C52909a.m204676a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IContactTypeParam.C52909a.m204677b(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IContactTypeParam.C52909a.m204675a(this, cVar);
        }

        private ContactTypeParam(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$IsReasonApply;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "TRUE", "FALSE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum IsReasonApply implements IParam {
        TRUE("true", null, 2, null),
        FALSE("false", null, 2, null);
        
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

        private IsReasonApply(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ IsReasonApply(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "is_reason_apply" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADMIN_FEISHU_CERTIFICATE_H5_DETAIL_VIEW", "VC_MEETING_CALLING_VIEW", "PROFILE_CONTACT_REQUEST_VIEW", "NONE", "MOMENTS_PROFILE_VIEW", "PROFILE_BACKGROUND_MAIN_VIEW", "PUBLIC_MULTI_SELECT_SHARE_VIEW", "PROFILE_MORE_ACTION_VIEW", "PROFILE_SIGNATURE_SETTING_VIEW", "PROFILE_ALIAS_SETTING_VIEW", "PROFILE_VOICE_CALL_SELECT_VIEW", "PROFILE_MAIN_VIEW", "IM_CHAT_MAIN_VIEW", "IM_AVATAR_MAIN_VIEW", "SETTING_PERSONAL_STATUS_VIEW", "PROFILE_AVATAR_ACTION_SHEET_VIEW", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Target implements ITargetParam {
        ADMIN_FEISHU_CERTIFICATE_H5_DETAIL_VIEW("admin_feishu_certificate_h5_detail_view"),
        VC_MEETING_CALLING_VIEW("vc_meeting_calling_view"),
        PROFILE_CONTACT_REQUEST_VIEW("profile_contact_request_view"),
        NONE("none"),
        MOMENTS_PROFILE_VIEW("moments_profile_view"),
        PROFILE_BACKGROUND_MAIN_VIEW("profile_background_main_view"),
        PUBLIC_MULTI_SELECT_SHARE_VIEW("public_multi_select_share_view"),
        PROFILE_MORE_ACTION_VIEW("profile_more_action_view"),
        PROFILE_SIGNATURE_SETTING_VIEW("profile_signature_setting_view"),
        PROFILE_ALIAS_SETTING_VIEW("profile_alias_setting_view"),
        PROFILE_VOICE_CALL_SELECT_VIEW("profile_voice_call_select_view"),
        PROFILE_MAIN_VIEW("profile_main_view"),
        IM_CHAT_MAIN_VIEW("im_chat_main_view"),
        IM_AVATAR_MAIN_VIEW("im_avatar_main_view"),
        SETTING_PERSONAL_STATUS_VIEW("setting_personal_status_view"),
        PROFILE_AVATAR_ACTION_SHEET_VIEW("profile_avatar_action_sheet_view");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$Param;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$d */
    public static final class Param implements IParam {

        /* renamed from: a */
        private final String f130729a;

        /* renamed from: b */
        private final String f130730b;

        public Param() {
            this(null, null, 3, null);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.f130729a;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.f130730b;
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

        public Param(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            this.f130729a = str;
            this.f130730b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Param(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$SignatureLengthParam;", "Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ISignatureLengthParam;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$e */
    public static final class SignatureLengthParam implements ISignatureLengthParam {

        /* renamed from: a */
        private final String f130731a;

        public SignatureLengthParam() {
            this(null, 1, null);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.f130731a;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return ISignatureLengthParam.C52910a.m204679a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return ISignatureLengthParam.C52910a.m204680b(this);
        }

        public SignatureLengthParam(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            this.f130731a = str;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return ISignatureLengthParam.C52910a.m204678a(this, cVar);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SignatureLengthParam(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$ToUserIdParam;", "Lcom/ss/android/lark/profile/statistics/UserProfileExtraParams$IToUserIdParam;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.UserProfileExtraParams$f */
    public static final class ToUserIdParam implements IToUserIdParam {

        /* renamed from: a */
        private final String f130732a;

        public ToUserIdParam() {
            this(null, 1, null);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.f130732a;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return IToUserIdParam.C52911a.m204682a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IToUserIdParam.C52911a.m204683b(this);
        }

        public ToUserIdParam(String str) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            this.f130732a = str;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IToUserIdParam.C52911a.m204681a(this, cVar);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ToUserIdParam(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private UserProfileExtraParams() {
    }
}
