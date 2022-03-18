package com.ss.android.lark.chat.message_menu.provider;

import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33101ac;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33140z;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatCopyActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "CopyMessageAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.c.d */
public class ChatCopyActionProvider implements ActionProvider {
    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/provider/ChatCopyActionProvider$CopyMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/chat/message_menu/provider/ChatCopyActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "", "onClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.c.c.d$a */
    public final class CopyMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ChatCopyActionProvider f84938a;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 8;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            return Integer.valueOf((int) R.drawable.ud_icon_copy_outlined);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.chat_operation_item_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            String string = UIHelper.getString(R.string.Lark_Legacy_Copy);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Copy)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            int i = C33014e.f84939a[mo106825h().mo106788h().mo121710r().ordinal()];
            if (i == 1) {
                AbsMessageVO<?> h = mo106825h().mo106788h();
                if (h != null) {
                    new C33140z(mo106825h().mo106782b()).mo122270a(h);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.vo.AbsMessageVO<com.ss.android.lark.chat.base.view.vo.message.PostContentVO>");
            } else if (i == 2) {
                AbsMessageVO<?> h2 = mo106825h().mo106788h();
                if (h2 != null) {
                    new C33101ac(mo106825h().mo106782b()).mo122270a(h2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.vo.AbsMessageVO<com.ss.android.lark.chat.base.view.vo.message.TextContentVO>");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CopyMessageAction(ChatCopyActionProvider dVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f84938a = dVar;
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.SECRET_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.SECRET_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD, ActionContext.PageType.MESSAGE_MERGE_FORWARD, ActionContext.PageType.PRIVATE_THREAD_FORWARD});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new CopyMessageAction(this, actionContext);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (type == Message.Type.POST || type == Message.Type.TEXT) {
            return true;
        }
        return false;
    }
}
