package com.ss.android.lark.statistics.chat;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams;", "", "()V", "Click", "HavePinToTop", "InsertType", "IsFullScreen", "IsPinToTopOwner", "Status", "Target", "TextType", "Type", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatHitPointExtraParams {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INPUT_BOX_MSG_SEND", "PIN_TO_TOP", "PIN_TO_TOP_OWNER", "CLICK_PIN_TO_TOP", "PIN_TO_TOP_RESTRICTION", "CONFIRM", "CLOSE_PIN_TO_TOP", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IClickParam {
        INPUT_BOX_MSG_SEND("input_box_msg_send"),
        PIN_TO_TOP("pin_to_top"),
        PIN_TO_TOP_OWNER("pin_to_top_owner"),
        CLICK_PIN_TO_TOP("click_pin_to_top"),
        PIN_TO_TOP_RESTRICTION("pin_to_top_restriction"),
        CONFIRM("confirm"),
        CLOSE_PIN_TO_TOP("close_pin_to_top");
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$HavePinToTop;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "TRUE", "FALSE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum HavePinToTop implements IParam {
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

        private HavePinToTop(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ HavePinToTop(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "have_pin_to_top" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$InsertType;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "MEDIA", "IMAGE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum InsertType implements IParam {
        MEDIA("media", null, 2, null),
        IMAGE("image", null, 2, null);
        
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

        private InsertType(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ InsertType(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "insert_type" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$IsFullScreen;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "TRUE", "FALSE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum IsFullScreen implements IParam {
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

        private IsFullScreen(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ IsFullScreen(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "is_full_screen" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$IsPinToTopOwner;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "FALSE", "TRUE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum IsPinToTopOwner implements IParam {
        FALSE("false", null, 2, null),
        TRUE("true", null, 2, null);
        
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

        private IsPinToTopOwner(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ IsPinToTopOwner(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "is_pin_to_top_owner" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$Status;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "ALL", "PIN_TO_TOP", "UNPIN_TO_TOP", "ONLY_GROUP_OWNER_AND_ADMIN", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Status implements IParam {
        ALL("all", null, 2, null),
        PIN_TO_TOP("pin_to_top", null, 2, null),
        UNPIN_TO_TOP("unpin_to_top", null, 2, null),
        ONLY_GROUP_OWNER_AND_ADMIN("only_group_owner_and_admin", null, 2, null);
        
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IM_CHAT_MAIN_VIEW", "PROFILE_MAIN_VIEW", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Target implements ITargetParam {
        IM_CHAT_MAIN_VIEW("im_chat_main_view"),
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$TextType;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "MEMBER_JOIN", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TextType implements IParam {
        MEMBER_JOIN("member_join", null, 2, null);
        
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

        private TextType(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ TextType(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "text_type" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/statistics/chat/ChatHitPointExtraParams$Type;", "", "Lcom/ss/android/lark/statistics/extensions/IParam;", "value", "", "key", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "BUTTON_SEND", "HOTKEY_SEND", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type implements IParam {
        BUTTON_SEND("button_send", null, 2, null),
        HOTKEY_SEND("hotkey_send", null, 2, null);
        
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

        private Type(String str, String str2) {
            this.value = str;
            this.key = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Type(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ShareHitPoint.f121869d : str2);
        }
    }
}
