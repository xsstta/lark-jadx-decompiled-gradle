package p000;

import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"LMedalExtraParams;", "", "()V", "Click", "IsMedalPutOn", "IsValid", "MedalId", "MsgId", "Target", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: MedalExtraParams */
public final class MedalExtraParams {

    /* renamed from: a */
    public static final MedalExtraParams f1a = new MedalExtraParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LMedalExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LARK_HELPER_MEDAL_CARD", "MEDAL_PUT_ON", "BACK", "MEDAL_DETAIL", "MEDAL_PUT_OFF", "CONFIRM", "CHECK_AVATAR", "MEDAL_ICON", "CANCEL", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$Click */
    public enum Click implements IClickParam {
        LARK_HELPER_MEDAL_CARD("lark_helper_medal_card"),
        MEDAL_PUT_ON("medal_put_on"),
        BACK("back"),
        MEDAL_DETAIL("medal_detail"),
        MEDAL_PUT_OFF("medal_put_off"),
        CONFIRM("confirm"),
        CHECK_AVATAR("check_avatar"),
        MEDAL_ICON("medal_icon"),
        CANCEL("cancel");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LMedalExtraParams$IsMedalPutOn;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "TRUE", "FALSE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$IsMedalPutOn */
    public enum IsMedalPutOn implements IParam {
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

        private IsMedalPutOn(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ IsMedalPutOn(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "is_medal_put_on" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LMedalExtraParams$IsValid;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "TRUE", "FALSE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$IsValid */
    public enum IsValid implements IParam {
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

        private IsValid(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ IsValid(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "is_valid" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"LMedalExtraParams$MsgId;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "NONE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$MsgId */
    public enum MsgId implements IParam {
        NONE("none", null, 2, null);
        
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

        private MsgId(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ MsgId(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "msg_id" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LMedalExtraParams$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PROFILE_AVATAR_MEDAL_PUT_ON_CONFIRM_VIEW", "PC", "IM_AVATAR_MAIN_VIEW", "NONE", "PROFILE_AVATAR_MEDAL_WALL_VIEW", "PROFILE_AVATAR_MEDAL_DETAIL_VIEW", "PROFILE_MAIN_VIEW", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$Target */
    public enum Target implements ITargetParam {
        PROFILE_AVATAR_MEDAL_PUT_ON_CONFIRM_VIEW("profile_avatar_medal_put_on_confirm_view"),
        PC("pc"),
        IM_AVATAR_MAIN_VIEW("im_avatar_main_view"),
        NONE("none"),
        PROFILE_AVATAR_MEDAL_WALL_VIEW("profile_avatar_medal_wall_view"),
        PROFILE_AVATAR_MEDAL_DETAIL_VIEW("profile_avatar_medal_detail_view"),
        PROFILE_MAIN_VIEW("profile_main_view");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LMedalExtraParams$MedalId;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: MedalExtraParams$a */
    public static final class MedalId implements IParam {

        /* renamed from: a */
        private final String f2a;

        /* renamed from: b */
        private final String f3b;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return this.f3b;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.f2a;
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

        public MedalId(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "value");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            this.f2a = str;
            this.f3b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MedalId(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "medal_id" : str2);
        }
    }

    private MedalExtraParams() {
    }
}
