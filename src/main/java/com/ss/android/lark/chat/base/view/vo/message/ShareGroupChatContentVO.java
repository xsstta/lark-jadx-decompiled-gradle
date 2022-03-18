package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/ShareGroupChatContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "chat$delegate", "Lkotlin/Lazy;", "expireTime", "", "getExpireTime", "()J", "expireTime$delegate", "joinChatErrState", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "getJoinChatErrState", "()Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "joinChatErrState$delegate", "joinToken", "", "getJoinToken", "()Ljava/lang/String;", "joinToken$delegate", "canReply", "", "convert2Content", "isContentSame", "diffable", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.j */
public final class ShareGroupChatContentVO extends ContentVO<ShareGroupChatContent> {

    /* renamed from: a */
    private final Lazy f84866a;

    /* renamed from: b */
    private final Lazy f84867b;

    /* renamed from: c */
    private final Lazy f84868c;

    /* renamed from: d */
    private final Lazy f84869d;

    /* renamed from: a */
    public final Chat mo121888a() {
        return (Chat) this.f84866a.getValue();
    }

    /* renamed from: b */
    public final long mo121889b() {
        return ((Number) this.f84868c.getValue()).longValue();
    }

    /* renamed from: c */
    public final ShareGroupChatContent.GroupState mo121890c() {
        return (ShareGroupChatContent.GroupState) this.f84869d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.j$a */
    static final class C33000a extends Lambda implements Function0<Chat> {
        final /* synthetic */ ShareGroupChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33000a(ShareGroupChatContent shareGroupChatContent) {
            super(0);
            this.$content = shareGroupChatContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Chat invoke() {
            return this.$content.getChat();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.j$b */
    static final class C33001b extends Lambda implements Function0<Long> {
        final /* synthetic */ ShareGroupChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33001b(ShareGroupChatContent shareGroupChatContent) {
            super(0);
            this.$content = shareGroupChatContent;
        }

        /* Return type fixed from 'long' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$content.getExpireTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/ShareGroupChatContent$GroupState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.j$c */
    static final class C33002c extends Lambda implements Function0<ShareGroupChatContent.GroupState> {
        final /* synthetic */ ShareGroupChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33002c(ShareGroupChatContent shareGroupChatContent) {
            super(0);
            this.$content = shareGroupChatContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShareGroupChatContent.GroupState invoke() {
            return this.$content.getJoinChatErrState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.j$d */
    static final class C33003d extends Lambda implements Function0<String> {
        final /* synthetic */ ShareGroupChatContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33003d(ShareGroupChatContent shareGroupChatContent) {
            super(0);
            this.$content = shareGroupChatContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getJoinToken();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareGroupChatContentVO(ShareGroupChatContent shareGroupChatContent) {
        super(shareGroupChatContent);
        Intrinsics.checkParameterIsNotNull(shareGroupChatContent, "content");
        this.f84866a = LazyKt.lazy(new C33000a(shareGroupChatContent));
        this.f84867b = LazyKt.lazy(new C33003d(shareGroupChatContent));
        this.f84868c = LazyKt.lazy(new C33001b(shareGroupChatContent));
        this.f84869d = LazyKt.lazy(new C33002c(shareGroupChatContent));
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof ShareGroupChatContentVO)) {
            return false;
        }
        ShareGroupChatContentVO jVar = (ShareGroupChatContentVO) aVar;
        if (mo121889b() == jVar.mo121889b() && mo121890c() == jVar.mo121890c()) {
            return true;
        }
        return false;
    }
}
