package com.ss.android.lark.chat.message_menu.provider;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatTranslateActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "fgDependency", "Lcom/ss/android/lark/dependency/IFeatureConfigDependency;", "kotlin.jvm.PlatformType", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "shouldShowActionForAudioMessage", "shouldShowActionForImageMessage", "shouldShowActionForPostMessage", "shouldShowActionForTextMessage", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "TranslateContext", "TranslateMessageAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.l */
public final class ChatTranslateActionProvider implements ActionProvider {

    /* renamed from: a */
    private final AbstractC36502p f84946a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u0003\"\f\b\u0000\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatTranslateActionProvider$TranslateContext;", "", "onTranslate", "", "T", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "itemView", "Landroid/view/View;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "translatableMessageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.l$a */
    public interface TranslateContext {
        /* renamed from: a */
        <T extends TranslatableContentVO<?>> void mo121936a(View view, AbstractC59010e eVar, AbsMessageVO<T> aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\fJ\r\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatTranslateActionProvider$TranslateMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/chat/message_menu/provider/ChatTranslateActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "hasTranslated", "", "showTextRes", "", "translatableContentVO", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "getIconDrawableRes", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.l$b */
    public final class TranslateMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ChatTranslateActionProvider f84947a;

        /* renamed from: b */
        private final TranslatableContentVO<?> f84948b;

        /* renamed from: c */
        private final boolean f84949c;

        /* renamed from: d */
        private final int f84950d;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 16;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            return Integer.valueOf((int) R.drawable.ud_icon_translate_outlined);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.chat_operation_item_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            String string = UIHelper.getString(this.f84950d);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(showTextRes)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            ActionContext h = mo106825h();
            if (h != null) {
                TranslateContext aVar = (TranslateContext) h;
                View f = mo106825h().mo106786f();
                AbstractC59010e a = mo106825h().mo106781a();
                AbsMessageVO<?> h2 = mo106825h().mo106788h();
                if (h2 != null) {
                    aVar.mo121936a(f, a, h2);
                    int i = C33015m.f84951a[mo106825h().mo106788h().mo121710r().ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            if (this.f84949c) {
                                Statistics.sendEvent("untranslate_image");
                            } else {
                                Statistics.sendEvent("translate_image");
                            }
                        }
                    } else if (this.f84949c) {
                        TranslateHitPoint.f135913a.mo187768c();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.vo.AbsMessageVO<com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO<*>>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.message_menu.provider.ChatTranslateActionProvider.TranslateContext");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TranslateMessageAction(ChatTranslateActionProvider lVar, ActionContext actionContext) {
            super(actionContext);
            int i;
            boolean z;
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f84947a = lVar;
            ContentVO g = actionContext.mo106788h().mo121699g();
            if (g != null) {
                TranslatableContentVO<?> oVar = (TranslatableContentVO) g;
                this.f84948b = oVar;
                boolean z2 = false;
                if (!(oVar instanceof ImageContentVO)) {
                    String t = oVar.mo121925t();
                    if (t == null || StringsKt.isBlank(t)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = true;
                    }
                } else if (oVar != null) {
                    z2 = ((ImageContentVO) oVar).mo121814i();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.ImageContentVO");
                }
                this.f84949c = z2;
                if (!z2) {
                    i = R.string.Lark_Legacy_TranslateChat;
                } else {
                    int x = oVar.mo121929x();
                    if (x == 2) {
                        i = R.string.Lark_Chat_ViewOriginalMessage;
                    } else if (x != 3) {
                        i = R.string.Lark_Legacy_ChatViewOriginalInfo;
                    } else {
                        i = R.string.Lark_Chat_HideTranslation;
                    }
                }
                this.f84950d = i;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO<*>");
        }
    }

    public ChatTranslateActionProvider() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f84946a = b.af();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new TranslateMessageAction(this, actionContext);
    }

    /* renamed from: e */
    private final boolean m127445e(ActionContext actionContext) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36502p af = b.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "ChatModuleInstanceHolder…).featureConfigDependency");
        return af.mo134683a();
    }

    /* renamed from: c */
    private final boolean m127443c(ActionContext actionContext) {
        AbstractC36502p pVar = this.f84946a;
        Intrinsics.checkExpressionValueIsNotNull(pVar, "fgDependency");
        if (!pVar.mo134684b()) {
            return false;
        }
        ContentVO g = actionContext.mo106788h().mo121699g();
        if (g != null) {
            AudioContentVO bVar = (AudioContentVO) g;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!b.mo134586n().mo134685a("translate.asr-message.android") || !C35247g.m137629a(bVar)) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.AudioContentVO");
    }

    /* renamed from: d */
    private final boolean m127444d(ActionContext actionContext) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (!b.mo134586n().mo134685a("translate.image.chat.menu.enable")) {
            return false;
        }
        ContentVO g = actionContext.mo106788h().mo121699g();
        if (g != null) {
            return Intrinsics.areEqual((Object) ((ImageContentVO) g).mo121849g().getCanTranslate(), (Object) true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.ImageContentVO");
    }

    /* renamed from: f */
    private final boolean m127446f(ActionContext actionContext) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36502p af = b.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "ChatModuleInstanceHolder…).featureConfigDependency");
        if (!af.mo134683a()) {
            return false;
        }
        ContentVO g = actionContext.mo106788h().mo121699g();
        if (g != null) {
            return !C35247g.m137631a((PostContent) ((PostContentVO) g).mo126168z());
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.PostContentVO");
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == Message.Type.TEXT || type == Message.Type.POST || type == Message.Type.AUDIO || type == Message.Type.IMAGE || type == Message.Type.MERGE_FORWARD) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        int i = C33016n.f84952a[actionContext.mo106788h().mo121710r().ordinal()];
        if (i == 1) {
            return m127445e(actionContext);
        }
        if (i == 2) {
            return m127446f(actionContext);
        }
        if (i == 3) {
            return m127443c(actionContext);
        }
        if (i == 4) {
            return m127444d(actionContext);
        }
        if (i != 5) {
            return false;
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36502p af = b.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "ChatModuleInstanceHolder…).featureConfigDependency");
        return af.mo134683a();
    }
}
