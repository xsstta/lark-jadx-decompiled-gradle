package com.ss.android.lark.chat.entity.message.content;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.export.entity.message.content.ContentValue;
import com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageItemAction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010K\u001a\u00020\u001a2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"J\b\u0010O\u001a\u00020#H\u0016J \u0010P\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002J\u001a\u0010Q\u001a\u00020R2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"J\u0010\u0010S\u001a\u00020R2\b\u0010A\u001a\u0004\u0018\u00010\u0005J\u0010\u0010T\u001a\u00020R2\b\u0010B\u001a\u0004\u0018\u00010\u0005J\u0010\u0010U\u001a\u00020R2\b\u0010V\u001a\u0004\u0018\u00010\u0005J\u0010\u0010W\u001a\u00020R2\b\u0010I\u001a\u0004\u0018\u00010\u0005J\u0010\u0010X\u001a\u00020R2\b\u0010J\u001a\u0004\u0018\u00010\u0005R3\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u00058VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00058VX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001bR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010,R,\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001c\u00102\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010\u0015R\u001d\u00105\u001a\u0004\u0018\u00010\u00058VX\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b6\u0010\u000eR\u001d\u00108\u001a\u0004\u0018\u00010\u00058VX\u0002¢\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b9\u0010\u000eR\u001a\u0010;\u001a\u00020<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0010\u0010A\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0010\u0010H\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/SystemContent;", "Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;", "()V", "chatterIds", "Lkotlin/Triple;", "", "getChatterIds", "()Lkotlin/Triple;", "chatterIds$delegate", "Lkotlin/Lazy;", "contents", "Ljava/util/HashMap;", "formattedContent", "getFormattedContent", "()Ljava/lang/String;", "formattedContent$delegate", "fromChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getFromChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "setFromChatter", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "fromChatterId", "getFromChatterId", "fromChatterId$delegate", "isMsgClickable", "", "()Z", "setMsgClickable", "(Z)V", "isRedPackSystemMessage", "isVCSystemMessage", "isVoIPSystemMessage", "itemActions", "", "", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageItemAction;", "getItemActions", "()Ljava/util/Map;", "setItemActions", "(Ljava/util/Map;)V", "messageTemplate", "getMessageTemplate", "setMessageTemplate", "(Ljava/lang/String;)V", "systemContents", "", "Lcom/ss/android/lark/chat/export/entity/message/content/ContentValue;", "getSystemContents", "setSystemContents", "toChatter", "getToChatter", "setToChatter", "toChatterId", "getToChatterId", "toChatterId$delegate", "triggerId", "getTriggerId", "triggerId$delegate", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "getType", "()Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "setType", "(Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;)V", "vcFromId", "vcToId", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "()I", "setVersion", "(I)V", "voIPFromId", "voIPToId", "voIpTriggerId", "equals", "obj", "", "getContents", "hashCode", "parseChatterIds", "setContents", "", "setVcFromId", "setVcToId", "setVoIPFromId", "voipFromId", "setVoIPToId", "setVoIpTriggerId", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SystemContent extends OpenSystemContent {
    public static final Companion Companion = new Companion(null);
    private final Lazy chatterIds$delegate = LazyKt.lazy(new C34014b(this));
    private final HashMap<String, String> contents = new HashMap<>();
    private final Lazy formattedContent$delegate = LazyKt.lazy(new C34015c(this));
    private ChatChatter fromChatter;
    private final Lazy fromChatterId$delegate = LazyKt.lazy(new C34016d(this));
    private boolean isMsgClickable;
    private Map<Integer, ? extends SystemMessageItemAction> itemActions = new HashMap();
    private String messageTemplate;
    private Map<String, ? extends List<? extends ContentValue>> systemContents = new HashMap();
    private ChatChatter toChatter;
    private final Lazy toChatterId$delegate = LazyKt.lazy(new C34017e(this));
    private final Lazy triggerId$delegate = LazyKt.lazy(new C34018f(this));
    private SystemMessageType type = SystemMessageType.UNKNOWN;
    private String vcFromId;
    private String vcToId;
    private int version;
    private String voIPFromId;
    private String voIPToId;
    private String voIpTriggerId;

    public final Triple<String, String, String> getChatterIds() {
        return (Triple) this.chatterIds$delegate.getValue();
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public String getFormattedContent() {
        return (String) this.formattedContent$delegate.getValue();
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public String getFromChatterId() {
        return (String) this.fromChatterId$delegate.getValue();
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public String getToChatterId() {
        return (String) this.toChatterId$delegate.getValue();
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public String getTriggerId() {
        return (String) this.triggerId$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/SystemContent$Companion;", "", "()V", "getReplacement", "", "originStr", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo125657a(String str) {
            String quoteReplacement = Matcher.quoteReplacement(str);
            Intrinsics.checkExpressionValueIsNotNull(quoteReplacement, "Matcher.quoteReplacement(originStr)");
            return quoteReplacement;
        }
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public ChatChatter getFromChatter() {
        return this.fromChatter;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.Integer, ? extends com.ss.android.lark.chat.export.entity.message.content.d>, java.util.Map<java.lang.Integer, com.ss.android.lark.chat.export.entity.message.content.d> */
    public final Map<Integer, SystemMessageItemAction> getItemActions() {
        return this.itemActions;
    }

    public final String getMessageTemplate() {
        return this.messageTemplate;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.android.lark.chat.export.entity.message.content.ContentValue>>, java.util.Map<java.lang.String, java.util.List<com.ss.android.lark.chat.export.entity.message.content.ContentValue>> */
    public final Map<String, List<ContentValue>> getSystemContents() {
        return this.systemContents;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public ChatChatter getToChatter() {
        return this.toChatter;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public SystemMessageType getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isMsgClickable() {
        return this.isMsgClickable;
    }

    public final Map<String, String> getContents() {
        return this.contents;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$b */
    static final class C34014b extends Lambda implements Function0<Triple<? extends String, ? extends String, ? extends String>> {
        final /* synthetic */ SystemContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34014b(SystemContent systemContent) {
            super(0);
            this.this$0 = systemContent;
        }

        /* Return type fixed from 'kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Triple<? extends String, ? extends String, ? extends String> invoke() {
            return this.this$0.parseChatterIds();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$d */
    static final class C34016d extends Lambda implements Function0<String> {
        final /* synthetic */ SystemContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34016d(SystemContent systemContent) {
            super(0);
            this.this$0 = systemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.getChatterIds().getFirst();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$e */
    static final class C34017e extends Lambda implements Function0<String> {
        final /* synthetic */ SystemContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34017e(SystemContent systemContent) {
            super(0);
            this.this$0 = systemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.getChatterIds().getSecond();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$f */
    static final class C34018f extends Lambda implements Function0<String> {
        final /* synthetic */ SystemContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34018f(SystemContent systemContent) {
            super(0);
            this.this$0 = systemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.getChatterIds().getThird();
        }
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public boolean isRedPackSystemMessage() {
        if (getType() == SystemMessageType.GRAB_OTHER_HONGBAO || getType() == SystemMessageType.OTHER_GRAB_MY_HONGBAO || getType() == SystemMessageType.LAST_HONGBAO_IS_GRABBED || getType() == SystemMessageType.SEND_HONGBAO_MESSAGE_FAILED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public boolean isVoIPSystemMessage() {
        if (getType() == SystemMessageType.USER_CALL_E2EE_VOICE_ON_MISSING || getType() == SystemMessageType.USER_CALL_E2EE_VOICE_ON_CANCELL || getType() == SystemMessageType.USER_CALL_E2EE_VOICE_DURATION || getType() == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_REFUSED || getType() == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_OCCUPY) {
            return true;
        }
        return false;
    }

    public final Triple<String, String, String> parseChatterIds() {
        String str;
        String str2;
        String str3 = null;
        if (isVCSystemMessage()) {
            str2 = this.vcFromId;
            str = this.vcToId;
        } else if (isVoIPSystemMessage()) {
            str2 = this.voIPFromId;
            str = this.voIPToId;
            str3 = this.voIpTriggerId;
        } else {
            Map<String, String> contents2 = getContents();
            String str4 = contents2.get("caller_id");
            String str5 = contents2.get("callee_id");
            if (str5 == null) {
                str5 = "";
            }
            str = str5;
            str2 = str4;
        }
        return new Triple<>(str2, str, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.SystemContent$c */
    static final class C34015c extends Lambda implements Function0<String> {
        final /* synthetic */ SystemContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34015c(SystemContent systemContent) {
            super(0);
            this.this$0 = systemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String messageTemplate = this.this$0.getMessageTemplate();
            for (String str : this.this$0.getContents().keySet()) {
                if (messageTemplate == null) {
                    Intrinsics.throwNpe();
                }
                messageTemplate = new Regex("\\{" + str + "\\}").replace(messageTemplate, SystemContent.Companion.mo125657a(this.this$0.getContents().get(str)));
            }
            if (messageTemplate != null) {
                return messageTemplate;
            }
            return "";
        }
    }

    @Override // com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent
    public boolean isVCSystemMessage() {
        if (getType() == SystemMessageType.VC_CALL_DURATION || getType() == SystemMessageType.VC_CALL_FINISH_NOTICE || getType() == SystemMessageType.VC_CALL_HOST_BUSY || getType() == SystemMessageType.VC_CALL_HOST_CANCEL || getType() == SystemMessageType.VC_CALL_PARTI_BUSY || getType() == SystemMessageType.VC_CALL_PARTI_CANCEL || getType() == SystemMessageType.VC_CALL_PARTI_NO_ANSWER || getType() == SystemMessageType.VC_CALL_CONNECT_FAIL || getType() == SystemMessageType.VC_CALL_DISCONNECT) {
            return true;
        }
        return false;
    }

    public void setFromChatter(ChatChatter chatChatter) {
        this.fromChatter = chatChatter;
    }

    public final void setMessageTemplate(String str) {
        this.messageTemplate = str;
    }

    public final void setMsgClickable(boolean z) {
        this.isMsgClickable = z;
    }

    public void setToChatter(ChatChatter chatChatter) {
        this.toChatter = chatChatter;
    }

    public final void setVcFromId(String str) {
        this.vcFromId = str;
    }

    public final void setVcToId(String str) {
        this.vcToId = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVoIPFromId(String str) {
        this.voIPFromId = str;
    }

    public final void setVoIPToId(String str) {
        this.voIPToId = str;
    }

    public final void setVoIpTriggerId(String str) {
        this.voIpTriggerId = str;
    }

    public final void setItemActions(Map<Integer, ? extends SystemMessageItemAction> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.itemActions = map;
    }

    public final void setSystemContents(Map<String, ? extends List<? extends ContentValue>> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.systemContents = map;
    }

    public void setType(SystemMessageType systemMessageType) {
        Intrinsics.checkParameterIsNotNull(systemMessageType, "<set-?>");
        this.type = systemMessageType;
    }

    public final void setContents(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "contents");
        this.contents.clear();
        this.contents.putAll(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemContent)) {
            return false;
        }
        SystemContent systemContent = (SystemContent) obj;
        if (!(!Intrinsics.areEqual(this.messageTemplate, systemContent.messageTemplate)) && getType() == systemContent.getType()) {
            return Intrinsics.areEqual(new HashSet(this.contents.values()), new HashSet(systemContent.contents.values()));
        }
        return false;
    }
}
