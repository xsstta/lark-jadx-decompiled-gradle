package com.ss.android.vc.lark.message.vc;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\r\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/lark/message/vc/VCSysContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;", "content", "myUserId", "", "(Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;Ljava/lang/String;)V", "formattedContent", "", "getFormattedContent", "()Ljava/lang/CharSequence;", "formattedContent$delegate", "Lkotlin/Lazy;", "isCallFromMe", "", "()Z", "isCallFromMe$delegate", "isNeedActionText", "isNeedActionText$delegate", "targetChatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "getTargetChatter", "()Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "targetChatter$delegate", "canReply", "needActionText", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.vc.d */
public final class VCSysContentVO extends ContentVO<OpenSystemContent> {

    /* renamed from: a */
    private final Lazy f153204a;

    /* renamed from: b */
    private final Lazy f153205b;

    /* renamed from: c */
    private final Lazy f153206c = LazyKt.lazy(new C61153c(this));

    /* renamed from: d */
    private final Lazy f153207d;

    /* renamed from: a */
    public final boolean mo211452a() {
        return ((Boolean) this.f153204a.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final OpenChatter mo211453b() {
        return (OpenChatter) this.f153205b.getValue();
    }

    /* renamed from: c */
    public final boolean mo211454c() {
        return ((Boolean) this.f153206c.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final CharSequence mo211455d() {
        return (CharSequence) this.f153207d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.vc.d$a */
    static final class C61151a extends Lambda implements Function0<CharSequence> {
        final /* synthetic */ OpenSystemContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61151a(OpenSystemContent openSystemContent) {
            super(0);
            this.$content = openSystemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return this.$content.getFormattedContent();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.vc.d$c */
    static final class C61153c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ VCSysContentVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61153c(VCSysContentVO dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.mo211456e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.vc.d$b */
    static final class C61152b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ OpenSystemContent $content;
        final /* synthetic */ String $myUserId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61152b(OpenSystemContent openSystemContent, String str) {
            super(0);
            this.$content = openSystemContent;
            this.$myUserId = str;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Intrinsics.areEqual(this.$content.getFromChatterId(), this.$myUserId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.vc.d$d */
    static final class C61154d extends Lambda implements Function0<OpenChatter> {
        final /* synthetic */ OpenSystemContent $content;
        final /* synthetic */ VCSysContentVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61154d(VCSysContentVO dVar, OpenSystemContent openSystemContent) {
            super(0);
            this.this$0 = dVar;
            this.$content = openSystemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenChatter invoke() {
            if (this.this$0.mo211452a()) {
                return this.$content.getToChatter();
            }
            return this.$content.getFromChatter();
        }
    }

    /* renamed from: e */
    public final boolean mo211456e() {
        if (mo126168z() == null) {
            return false;
        }
        SystemMessageType type = ((OpenSystemContent) mo126168z()).getType();
        if (type == SystemMessageType.VC_CALL_HOST_CANCEL || type == SystemMessageType.VC_CALL_PARTI_CANCEL || type == SystemMessageType.VC_CALL_PARTI_NO_ANSWER || type == SystemMessageType.VC_CALL_PARTI_BUSY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCSysContentVO(OpenSystemContent openSystemContent, String str) {
        super(openSystemContent);
        Intrinsics.checkParameterIsNotNull(openSystemContent, "content");
        Intrinsics.checkParameterIsNotNull(str, "myUserId");
        this.f153204a = LazyKt.lazy(new C61152b(openSystemContent, str));
        this.f153205b = LazyKt.lazy(new C61154d(this, openSystemContent));
        this.f153207d = LazyKt.lazy(new C61151a(openSystemContent));
    }
}
