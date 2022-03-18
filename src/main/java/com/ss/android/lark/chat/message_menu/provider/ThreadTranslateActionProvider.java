package com.ss.android.lark.chat.message_menu.provider;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ThreadTranslateActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "fgDependency", "Lcom/ss/android/lark/dependency/IFeatureConfigDependency;", "kotlin.jvm.PlatformType", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "shouldShowActionForAudioMessage", "shouldShowActionForPostMessage", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "TranslateMessageAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.af */
public final class ThreadTranslateActionProvider implements ActionProvider {

    /* renamed from: a */
    private final AbstractC36502p f84925a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ThreadTranslateActionProvider$TranslateMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/chat/message_menu/provider/ThreadTranslateActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "contentVO", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "getContentVO", "()Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "isTranslated", "", "()Z", "setTranslated", "(Z)V", "showTextRes", "", "getShowTextRes", "()I", "setShowTextRes", "(I)V", "topicTabType", "getTopicTabType", "getIconDrawableRes", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.af$a */
    public final class TranslateMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ThreadTranslateActionProvider f84926a;

        /* renamed from: b */
        private final TranslatableContentVO<?> f84927b;

        /* renamed from: c */
        private int f84928c;

        /* renamed from: d */
        private boolean f84929d;

        /* renamed from: e */
        private final int f84930e;

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

        /* renamed from: i */
        public final TranslatableContentVO<?> mo121958i() {
            return this.f84927b;
        }

        /* renamed from: j */
        public final int mo121959j() {
            return this.f84930e;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/message_menu/provider/ThreadTranslateActionProvider$TranslateMessageAction$onClick$callback$1", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler$Callback;", "getAnchorView", "Landroid/view/View;", "getParam", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler$MenuParam;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.c.c.af$a$a */
        public static final class C33012a implements AbstractC55893n.AbstractC55894a {

            /* renamed from: a */
            final /* synthetic */ TranslateMessageAction f84931a;

            /* renamed from: b */
            final /* synthetic */ String f84932b;

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55881f.AbstractC55882a
            /* renamed from: c */
            public View mo121962c() {
                return this.f84931a.mo106825h().mo106786f();
            }

            /* renamed from: b */
            public AbstractC55893n.C55895b mo121960a() {
                AbstractC55893n.C55895b bVar = new AbstractC55893n.C55895b();
                bVar.f138068a = this.f84931a.mo121958i().mo121925t();
                bVar.f138069b = this.f84932b;
                bVar.f138070c = this.f84931a.mo121959j();
                return bVar;
            }

            C33012a(TranslateMessageAction aVar, String str) {
                this.f84931a = aVar;
                this.f84932b = str;
            }
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            String string = UIHelper.getString(this.f84928c);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(showTextRes)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            C33012a aVar = new C33012a(this, mo106825h().mo106788h().mo121681a());
            ActionContext h = mo106825h();
            if (h != null) {
                ((AbstractC55893n) h).mo121954a(aVar);
                if ((this.f84927b instanceof AudioContentVO) && this.f84929d) {
                    TranslateHitPoint.f135913a.mo187768c();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.threaddetail.view.menu.handler.ITranslateMenuHandler");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TranslateMessageAction(ThreadTranslateActionProvider afVar, ActionContext actionContext) {
            super(actionContext);
            int i;
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f84926a = afVar;
            ContentVO g = actionContext.mo106788h().mo121699g();
            if (g != null) {
                TranslatableContentVO<?> oVar = (TranslatableContentVO) g;
                this.f84927b = oVar;
                this.f84928c = C34350p.m133210a(oVar.mo121925t(), oVar.mo121929x());
                this.f84929d = oVar.mo121814i();
                if (actionContext.mo106788h() instanceof ThreadMessageVO) {
                    AbsMessageVO<?> h = actionContext.mo106788h();
                    if (h != null) {
                        i = ((ThreadMessageVO) h).mo121673S();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.ThreadMessageVO<*>");
                    }
                } else {
                    i = 0;
                }
                this.f84930e = i;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO<*>");
        }
    }

    public ThreadTranslateActionProvider() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f84925a = b.af();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.THREAD, ActionContext.PageType.THREAD_DETAIL});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new TranslateMessageAction(this, actionContext);
    }

    /* renamed from: c */
    private final boolean m127334c(ActionContext actionContext) {
        AbstractC36502p pVar = this.f84925a;
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
    private final boolean m127335d(ActionContext actionContext) {
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
        if (type == Message.Type.TEXT || type == Message.Type.POST || type == Message.Type.AUDIO || type == Message.Type.MERGE_FORWARD) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        int i = C33013ag.f84933a[actionContext.mo106788h().mo121710r().ordinal()];
        if (i == 1) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36502p af = b.af();
            Intrinsics.checkExpressionValueIsNotNull(af, "ChatModuleInstanceHolder…).featureConfigDependency");
            return af.mo134683a();
        } else if (i == 2) {
            return m127335d(actionContext);
        } else {
            if (i == 3) {
                return m127334c(actionContext);
            }
            if (i != 4) {
                return false;
            }
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36502p af2 = b2.af();
            Intrinsics.checkExpressionValueIsNotNull(af2, "ChatModuleInstanceHolder…).featureConfigDependency");
            return af2.mo134683a();
        }
    }
}
