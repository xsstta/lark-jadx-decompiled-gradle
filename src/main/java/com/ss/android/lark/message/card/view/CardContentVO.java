package com.ss.android.lark.message.card.view;

import com.larksuite.framework.flyfish.IComponentTreeProvider;
import com.larksuite.framework.flyfish.core.IComponentTree;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.message.card.view.richtext.NodeParams;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u00100\u001a\u00020\u0013H\u0016J\b\u00101\u001a\u0004\u0018\u000102J\u000e\u00103\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u0004\u0018\u00010!8FX\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u0010+\u001a\u0004\u0018\u00010,8FX\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent;)V", "cardHeader", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "getCardHeader", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "cardHeader$delegate", "Lkotlin/Lazy;", "cardType", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "getCardType", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "cardType$delegate", "componentTreeProvider", "Lcom/larksuite/framework/flyfish/IComponentTreeProvider;", "enableEllipsize", "", "getEnableEllipsize", "()Z", "setEnableEllipsize", "(Z)V", "enableForward", "getEnableForward", "enableForward$delegate", "extraInfo", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "getExtraInfo", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "extraInfo$delegate", "extraType", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "getExtraType", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "extraType$delegate", "nodeParams", "Lcom/ss/android/lark/message/card/view/richtext/NodeParams;", "getNodeParams", "()Lcom/ss/android/lark/message/card/view/richtext/NodeParams;", "setNodeParams", "(Lcom/ss/android/lark/message/card/view/richtext/NodeParams;)V", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "richText$delegate", "canReply", "getComponentTree", "Lcom/larksuite/framework/flyfish/core/IComponentTree;", "setComponentTreeProvider", "", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.view.a */
public final class CardContentVO extends ContentVO<CardContent> {

    /* renamed from: a */
    private final Lazy f114727a;

    /* renamed from: b */
    private final Lazy f114728b;

    /* renamed from: c */
    private final Lazy f114729c;

    /* renamed from: d */
    private final Lazy f114730d;

    /* renamed from: e */
    private final Lazy f114731e;

    /* renamed from: f */
    private final Lazy f114732f;

    /* renamed from: g */
    private NodeParams f114733g;

    /* renamed from: h */
    private boolean f114734h;

    /* renamed from: i */
    private IComponentTreeProvider f114735i;

    /* renamed from: a */
    public final CardContent.Type mo160063a() {
        return (CardContent.Type) this.f114727a.getValue();
    }

    /* renamed from: b */
    public final CardContent.ExtraType mo160065b() {
        return (CardContent.ExtraType) this.f114728b.getValue();
    }

    /* renamed from: c */
    public final RichText mo160066c() {
        return (RichText) this.f114729c.getValue();
    }

    /* renamed from: d */
    public final CardContent.CardHeader mo160067d() {
        return (CardContent.CardHeader) this.f114730d.getValue();
    }

    /* renamed from: e */
    public final CardContent.ExtraInfo mo160068e() {
        return (CardContent.ExtraInfo) this.f114731e.getValue();
    }

    /* renamed from: f */
    public final boolean mo160069f() {
        return ((Boolean) this.f114732f.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final NodeParams mo160070g() {
        return this.f114733g;
    }

    /* renamed from: h */
    public final boolean mo160071h() {
        return this.f114734h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$CardHeader;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$a */
    static final class C45317a extends Lambda implements Function0<CardContent.CardHeader> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45317a(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CardContent.CardHeader invoke() {
            return this.$content.getCardHeader();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$Type;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$b */
    static final class C45318b extends Lambda implements Function0<CardContent.Type> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45318b(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CardContent.Type invoke() {
            return this.$content.getType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$c */
    static final class C45319c extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45319c(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.getEnableForward();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$d */
    static final class C45320d extends Lambda implements Function0<CardContent.ExtraInfo> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45320d(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CardContent.ExtraInfo invoke() {
            return this.$content.getExtraInfo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/message/content/CardContent$ExtraType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$e */
    static final class C45321e extends Lambda implements Function0<CardContent.ExtraType> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45321e(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CardContent.ExtraType invoke() {
            return this.$content.getExtraType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/richtext/RichText;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.a$f */
    static final class C45322f extends Lambda implements Function0<RichText> {
        final /* synthetic */ CardContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45322f(CardContent cardContent) {
            super(0);
            this.$content = cardContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RichText invoke() {
            return this.$content.getRichText();
        }
    }

    /* renamed from: i */
    public final IComponentTree mo160072i() {
        IComponentTreeProvider bVar = this.f114735i;
        if (bVar != null) {
            return bVar.mo92371a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo160064a(NodeParams nodeParams) {
        this.f114733g = nodeParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardContentVO(CardContent cardContent) {
        super(cardContent);
        Intrinsics.checkParameterIsNotNull(cardContent, "content");
        this.f114727a = LazyKt.lazy(new C45318b(cardContent));
        this.f114728b = LazyKt.lazy(new C45321e(cardContent));
        this.f114729c = LazyKt.lazy(new C45322f(cardContent));
        this.f114730d = LazyKt.lazy(new C45317a(cardContent));
        this.f114731e = LazyKt.lazy(new C45320d(cardContent));
        this.f114732f = LazyKt.lazy(new C45319c(cardContent));
    }
}
