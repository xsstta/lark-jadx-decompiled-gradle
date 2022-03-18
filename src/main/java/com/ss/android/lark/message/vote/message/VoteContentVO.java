package com.ss.android.lark.message.vote.message;

import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/message/vote/message/VoteContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent;)V", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "richText$delegate", "Lkotlin/Lazy;", "canReply", "", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.vote.message.a */
public final class VoteContentVO extends ContentVO<CardContent> {

    /* renamed from: a */
    private final Lazy f114990a;

    /* renamed from: a */
    public final RichText mo160258a() {
        return (RichText) this.f114990a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/richtext/RichText;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.vote.message.a$a */
    static final class C45396a extends Lambda implements Function0<RichText> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45396a(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RichText invoke() {
            return this.$content.getRichText();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoteContentVO(CardContent cardContent) {
        super(cardContent);
        Intrinsics.checkParameterIsNotNull(cardContent, "content");
        this.f114990a = LazyKt.lazy(new C45396a(cardContent));
    }
}
