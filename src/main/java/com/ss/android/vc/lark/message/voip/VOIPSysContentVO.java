package com.ss.android.vc.lark.message.voip;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u000eH\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\r\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00148FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/lark/message/voip/VOIPSysContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;", "content", "myUserId", "", "(Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;Ljava/lang/String;)V", "formattedContent", "", "getFormattedContent", "()Ljava/lang/CharSequence;", "formattedContent$delegate", "Lkotlin/Lazy;", "isCallFromMe", "", "()Z", "isCallFromMe$delegate", "isTriggerFromMe", "isTriggerFromMe$delegate", "subType", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "getSubType", "()Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "subType$delegate", "targetChatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "getTargetChatter", "()Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "targetChatter$delegate", "canReply", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.a.a */
public final class VOIPSysContentVO extends ContentVO<OpenSystemContent> {

    /* renamed from: a */
    private final Lazy f153004a;

    /* renamed from: b */
    private final Lazy f153005b;

    /* renamed from: c */
    private final Lazy f153006c;

    /* renamed from: d */
    private final Lazy f153007d;

    /* renamed from: e */
    private final Lazy f153008e;

    /* renamed from: a */
    public final SystemMessageType mo211335a() {
        return (SystemMessageType) this.f153004a.getValue();
    }

    /* renamed from: b */
    public final boolean mo211336b() {
        return ((Boolean) this.f153005b.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo211337c() {
        return ((Boolean) this.f153006c.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final OpenChatter mo211338d() {
        return (OpenChatter) this.f153007d.getValue();
    }

    /* renamed from: e */
    public final CharSequence mo211339e() {
        return (CharSequence) this.f153008e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.a.a$a */
    static final class C61089a extends Lambda implements Function0<CharSequence> {
        final /* synthetic */ OpenSystemContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61089a(OpenSystemContent openSystemContent) {
            super(0);
            this.$content = openSystemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return this.$content.getFormattedContent();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.a.a$d */
    static final class C61092d extends Lambda implements Function0<SystemMessageType> {
        final /* synthetic */ OpenSystemContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61092d(OpenSystemContent openSystemContent) {
            super(0);
            this.$content = openSystemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SystemMessageType invoke() {
            return this.$content.getType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.a.a$b */
    static final class C61090b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ OpenSystemContent $content;
        final /* synthetic */ String $myUserId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61090b(OpenSystemContent openSystemContent, String str) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.a.a$c */
    static final class C61091c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ OpenSystemContent $content;
        final /* synthetic */ String $myUserId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61091c(OpenSystemContent openSystemContent, String str) {
            super(0);
            this.$content = openSystemContent;
            this.$myUserId = str;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Intrinsics.areEqual(this.$content.getTriggerId(), this.$myUserId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.message.a.a$e */
    static final class C61093e extends Lambda implements Function0<OpenChatter> {
        final /* synthetic */ OpenSystemContent $content;
        final /* synthetic */ VOIPSysContentVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61093e(VOIPSysContentVO aVar, OpenSystemContent openSystemContent) {
            super(0);
            this.this$0 = aVar;
            this.$content = openSystemContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenChatter invoke() {
            if (this.this$0.mo211336b()) {
                return this.$content.getToChatter();
            }
            return this.$content.getFromChatter();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VOIPSysContentVO(OpenSystemContent openSystemContent, String str) {
        super(openSystemContent);
        Intrinsics.checkParameterIsNotNull(openSystemContent, "content");
        Intrinsics.checkParameterIsNotNull(str, "myUserId");
        this.f153004a = LazyKt.lazy(new C61092d(openSystemContent));
        this.f153005b = LazyKt.lazy(new C61090b(openSystemContent, str));
        this.f153006c = LazyKt.lazy(new C61091c(openSystemContent, str));
        this.f153007d = LazyKt.lazy(new C61093e(this, openSystemContent));
        this.f153008e = LazyKt.lazy(new C61089a(openSystemContent));
    }
}
