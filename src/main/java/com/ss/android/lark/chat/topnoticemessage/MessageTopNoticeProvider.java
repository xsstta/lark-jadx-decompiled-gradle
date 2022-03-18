package com.ss.android.lark.chat.topnoticemessage;

import com.larksuite.suite.R;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTopNoticePlugin;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.topnoticemessage.p1685c.C34321b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin;", "(Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin;)V", "enableTopNoticeMessage", "", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "MessagePinTopAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.c */
public final class MessageTopNoticeProvider implements ActionProvider {

    /* renamed from: a */
    public final MessageTopNoticePlugin f88625a;

    /* renamed from: b */
    private final boolean f88626b;

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\r\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeProvider$MessagePinTopAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "menuInfo", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$InnerMenuInfo;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.c$a */
    private final class MessagePinTopAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticeProvider f88627a;

        /* renamed from: b */
        private final AbsMessageVO<?> f88628b;

        /* renamed from: c */
        private final MessageTopNoticePlugin.InnerMenuInfo f88629c;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 14;
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
        /* renamed from: d */
        public String mo106821d() {
            return this.f88629c.mo122175b();
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            return Integer.valueOf(this.f88629c.mo122176c());
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            this.f88627a.f88625a.mo122162a(this.f88628b, this.f88629c.mo122174a());
            if (this.f88628b instanceof ChatMessageVO) {
                C34321b.m133057a(this.f88627a.f88625a, (ChatMessageVO) this.f88628b, this.f88629c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessagePinTopAction(MessageTopNoticeProvider cVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f88627a = cVar;
            AbsMessageVO<?> h = actionContext.mo106788h();
            this.f88628b = h;
            this.f88629c = cVar.f88625a.mo122160a(h);
        }
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
        return new MessagePinTopAction(this, actionContext);
    }

    public MessageTopNoticeProvider(MessageTopNoticePlugin cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dependency");
        this.f88625a = cVar;
        C29407b a = C29990c.m110929a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getChatModule()");
        this.f88626b = a.mo104184K();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        Chat e = actionContext.mo106785e();
        boolean z = false;
        if (e == null) {
            return false;
        }
        Chatter k = actionContext.mo106791k();
        if (!this.f88626b || ((e.isP2PChat() && k != null && k.isDimission()) || e.isSuper() || e.isSecret())) {
            z = true;
        }
        return !z;
    }
}
