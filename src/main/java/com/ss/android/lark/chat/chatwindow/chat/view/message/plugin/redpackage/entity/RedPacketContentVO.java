package com.ss.android.lark.chat.chatwindow.chat.view.message.plugin.redpackage.entity;

import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\f\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/view/message/plugin/redpackage/entity/RedPacketContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent;)V", "isClicked", "", "()Z", "isClicked$delegate", "Lkotlin/Lazy;", "isExpired", "isExpired$delegate", "isGrabbed", "isGrabbed$delegate", "isGrabbedFinish", "isGrabbedFinish$delegate", "redPacketId", "", "getRedPacketId", "()Ljava/lang/String;", "redPacketId$delegate", "subject", "getSubject", "subject$delegate", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "getType", "()Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "type$delegate", "canReply", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a */
public final class RedPacketContentVO extends ContentVO<RedPacketContent> {

    /* renamed from: a */
    private final Lazy f87367a;

    /* renamed from: b */
    private final Lazy f87368b;

    /* renamed from: c */
    private final Lazy f87369c;

    /* renamed from: d */
    private final Lazy f87370d;

    /* renamed from: e */
    private final Lazy f87371e;

    /* renamed from: f */
    private final Lazy f87372f;

    /* renamed from: g */
    private final Lazy f87373g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$a */
    static final class C33896a extends Lambda implements Function0<Boolean> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33896a(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isClicked();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$b */
    static final class C33897b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33897b(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isExpired();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$c */
    static final class C33898c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33898c(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isGrabbed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$d */
    static final class C33899d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33899d(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isGrabbedFinish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/RedPacketContent$Type;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$g */
    static final class C33902g extends Lambda implements Function0<RedPacketContent.Type> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33902g(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RedPacketContent.Type invoke() {
            return this.$content.getType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$e */
    static final class C33900e extends Lambda implements Function0<String> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33900e(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getRedPacketId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.view.message.c.a.a.a$f */
    static final class C33901f extends Lambda implements Function0<String> {
        final /* synthetic */ RedPacketContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33901f(RedPacketContent redPacketContent) {
            super(0);
            this.$content = redPacketContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getSubject();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketContentVO(RedPacketContent redPacketContent) {
        super(redPacketContent);
        Intrinsics.checkParameterIsNotNull(redPacketContent, "content");
        this.f87367a = LazyKt.lazy(new C33900e(redPacketContent));
        this.f87368b = LazyKt.lazy(new C33901f(redPacketContent));
        this.f87369c = LazyKt.lazy(new C33896a(redPacketContent));
        this.f87370d = LazyKt.lazy(new C33897b(redPacketContent));
        this.f87371e = LazyKt.lazy(new C33898c(redPacketContent));
        this.f87372f = LazyKt.lazy(new C33899d(redPacketContent));
        this.f87373g = LazyKt.lazy(new C33902g(redPacketContent));
    }
}
