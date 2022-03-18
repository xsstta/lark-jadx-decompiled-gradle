package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020\fH\u0016J\u0016\u0010$\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00108FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00108FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\u0012R\u001b\u0010 \u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\b¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/StickerContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/StickerContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/StickerContent;)V", "height", "", "getHeight", "()I", "height$delegate", "Lkotlin/Lazy;", "isAdded", "", "()Z", "isAdded$delegate", "key", "", "getKey", "()Ljava/lang/String;", "key$delegate", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "setMessage", "(Lcom/ss/android/lark/chat/entity/message/Message;)V", "stickerId", "getStickerId", "stickerId$delegate", "stickerSetId", "getStickerSetId", "stickerSetId$delegate", "width", "getWidth", "width$delegate", "canReply", "isContentSame", "diffable", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.k */
public final class StickerContentVO extends ContentVO<StickerContent> {

    /* renamed from: a */
    private final Lazy f84870a;

    /* renamed from: b */
    private final Lazy f84871b;

    /* renamed from: c */
    private final Lazy f84872c;

    /* renamed from: d */
    private final Lazy f84873d;

    /* renamed from: e */
    private final Lazy f84874e;

    /* renamed from: f */
    private final Lazy f84875f;

    /* renamed from: g */
    private Message f84876g;

    /* renamed from: a */
    public final String mo121891a() {
        return (String) this.f84870a.getValue();
    }

    /* renamed from: b */
    public final int mo121893b() {
        return ((Number) this.f84871b.getValue()).intValue();
    }

    /* renamed from: c */
    public final int mo121894c() {
        return ((Number) this.f84872c.getValue()).intValue();
    }

    /* renamed from: d */
    public final boolean mo121895d() {
        return ((Boolean) this.f84873d.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final String mo121896e() {
        return (String) this.f84875f.getValue();
    }

    /* renamed from: f */
    public final Message mo121897f() {
        return this.f84876g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$a */
    static final class C33004a extends Lambda implements Function0<Integer> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33004a(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getHeight();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$b */
    static final class C33005b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33005b(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isAdded();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$f */
    static final class C33009f extends Lambda implements Function0<Integer> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33009f(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getWidth();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$c */
    static final class C33006c extends Lambda implements Function0<String> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33006c(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$d */
    static final class C33007d extends Lambda implements Function0<String> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33007d(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getStickerId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.k$e */
    static final class C33008e extends Lambda implements Function0<String> {
        final /* synthetic */ StickerContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33008e(StickerContent stickerContent) {
            super(0);
            this.$content = stickerContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getStickerSetId();
        }
    }

    /* renamed from: a */
    public final void mo121892a(Message message) {
        this.f84876g = message;
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof StickerContentVO)) {
            return false;
        }
        StickerContentVO kVar = (StickerContentVO) aVar;
        if (mo121893b() == kVar.mo121893b() && mo121894c() == kVar.mo121894c() && mo121895d() == kVar.mo121895d()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerContentVO(StickerContent stickerContent) {
        super(stickerContent);
        Intrinsics.checkParameterIsNotNull(stickerContent, "content");
        this.f84870a = LazyKt.lazy(new C33006c(stickerContent));
        this.f84871b = LazyKt.lazy(new C33009f(stickerContent));
        this.f84872c = LazyKt.lazy(new C33004a(stickerContent));
        this.f84873d = LazyKt.lazy(new C33005b(stickerContent));
        this.f84874e = LazyKt.lazy(new C33007d(stickerContent));
        this.f84875f = LazyKt.lazy(new C33008e(stickerContent));
    }
}
