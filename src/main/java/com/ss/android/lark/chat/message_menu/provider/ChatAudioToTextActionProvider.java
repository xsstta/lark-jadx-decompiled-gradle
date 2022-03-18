package com.ss.android.lark.chat.message_menu.provider;

import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatAudioToTextActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "AudioToTextMessageAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.c */
public final class ChatAudioToTextActionProvider implements ActionProvider {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatAudioToTextActionProvider$AudioToTextMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/chat/message_menu/provider/ChatAudioToTextActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "audioContentVO", "Lcom/ss/android/lark/chat/base/view/vo/message/AudioContentVO;", "toShown", "", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.c$a */
    public final class AudioToTextMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ChatAudioToTextActionProvider f84935a;

        /* renamed from: b */
        private final AudioContentVO f84936b;

        /* renamed from: c */
        private final boolean f84937c;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 4;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.chat_operation_item_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            int i;
            if (this.f84937c) {
                i = R.drawable.ud_icon_text_aa_outlined;
            } else {
                i = R.drawable.ud_icon_untext_outlined;
            }
            return Integer.valueOf(i);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            int i;
            if (this.f84937c) {
                i = R.string.Lark_Chat_ConvertToText;
            } else {
                i = R.string.Lark_Chat_HideText;
            }
            String string = UIHelper.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strRes)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            ActionContext h = mo106825h();
            if (!(h instanceof AbstractC33132u)) {
                h = null;
            }
            AbstractC33132u uVar = (AbstractC33132u) h;
            if (uVar != null) {
                uVar.mo121941b(mo106825h().mo106788h().mo121681a(), this.f84937c);
                if (this.f84937c) {
                    MessageHitPoint.f135779d.mo187553f();
                    return;
                }
                MessageHitPoint.f135779d.mo187546b(this.f84936b.mo121813h());
                if (this.f84936b.mo121814i()) {
                    TranslateHitPoint.f135913a.mo187766b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AudioToTextMessageAction(ChatAudioToTextActionProvider cVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f84935a = cVar;
            ContentVO g = actionContext.mo106788h().mo121699g();
            if (g != null) {
                AudioContentVO bVar = (AudioContentVO) g;
                this.f84936b = bVar;
                this.f84937c = !C35247g.m137629a(bVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.AudioContentVO");
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == Message.Type.AUDIO) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new AudioToTextMessageAction(this, actionContext);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36502p af = b.af();
        Intrinsics.checkExpressionValueIsNotNull(af, "ChatModuleInstanceHolder…).featureConfigDependency");
        return af.mo134684b();
    }
}
