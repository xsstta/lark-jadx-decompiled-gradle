package com.ss.android.lark.chatthread.view;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.message_menu.context.ChatThreadActionContext;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.am;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0002J4\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00180\u0010H\u0014J:\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0018\u00010\u0010H\u0016J:\u0010\u001c\u001a\u00020\u001d2\u0010\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0018\u00010\u0010H\u0016J@\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0010\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0018\u00010\u0010R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadCellClickHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "menuHandlerHub", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "dependency", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler$Dependency;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler$Dependency;)V", "filterList", "", "", "getExtraMenuItemFilter", "Lcom/ss/android/lark/chat/base/view/menu/IMenuFilter;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "getMsgMenuContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "hiveCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "item", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "onCellClick", "", "cell", "onCellLongClick", "", "showContextMenu", "anchorView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.view.b */
public final class ChatThreadCellClickHandler extends AbstractC33244i {

    /* renamed from: f */
    public final Set<Integer> f90898f = am.m265689a((Object[]) new Integer[]{7, 12, 21});

    @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i
    /* renamed from: d */
    public boolean mo122580d(AbstractC59004b<?, ?> bVar, AbstractC59010e eVar, ChatMessageVO<? extends ContentVO<?>> cVar) {
        return false;
    }

    /* renamed from: g */
    public void mo123401e(AbstractC59004b<?, ?> bVar, AbstractC59010e eVar, ChatMessageVO<? extends ContentVO<?>> cVar) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadCellClickHandler$getMsgMenuContext$1", "Lcom/ss/android/lark/chat/message_menu/context/ChatThreadActionContext;", "getMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getMessageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "getOnMediaClickListener", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnMediaClickListener;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.b$b */
    public static final class C35195b extends ChatThreadActionContext {

        /* renamed from: a */
        final /* synthetic */ ChatThreadCellClickHandler f90900a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f90901b;

        /* renamed from: c */
        final /* synthetic */ AbstractC59004b f90902c;

        /* renamed from: d */
        final /* synthetic */ AbstractC59010e f90903d;

        /* renamed from: n */
        public ChatMessageVO<?> mo106788h() {
            return this.f90901b;
        }

        @Override // com.ss.android.lark.biz.im.extension.ActionContext
        /* renamed from: j */
        public Message mo106790j() {
            MessageInfo o = mo106789i();
            if (o != null) {
                return o.getMessage();
            }
            return null;
        }

        @Override // com.ss.android.lark.biz.im.extension.ActionContext
        /* renamed from: k */
        public Chatter mo106791k() {
            AbstractC33244i.AbstractC33246a aVar = this.f90900a.f85550d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDependency");
            return aVar.mo122589c();
        }

        /* renamed from: o */
        public MessageInfo mo106789i() {
            return this.f90900a.f85550d.mo122587a(this.f90901b.mo121681a());
        }

        @Override // com.ss.android.lark.chat.message_menu.provider.ChatMutePlayActionProvider.MutePlayContext
        /* renamed from: p */
        public AbstractC33302l mo121963p() {
            AbstractC33244i.AbstractC33246a aVar = this.f90900a.f85550d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDependency");
            AbstractC33302l b = aVar.mo122588b();
            Intrinsics.checkExpressionValueIsNotNull(b, "mDependency.onMediaClickListener");
            return b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35195b(ChatThreadCellClickHandler bVar, ChatMessageVO cVar, AbstractC59004b bVar2, AbstractC59010e eVar, AbstractView$OnClickListenerC59005c cVar2, C59008d dVar, ActionContext.PageType pageType, AbstractC33342d dVar2, AbstractC33120i iVar) {
            super(cVar2, dVar, pageType, dVar2, iVar);
            this.f90900a = bVar;
            this.f90901b = cVar;
            this.f90902c = bVar2;
            this.f90903d = eVar;
        }
    }

    /* renamed from: a */
    private final AbstractC32928b<ChatMessageVO<?>> m137428a() {
        return new C35194a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0016\u0010\u0006\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.b$a */
    public static final class C35194a<T> implements AbstractC32928b<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadCellClickHandler f90899a;

        C35194a(ChatThreadCellClickHandler bVar) {
            this.f90899a = bVar;
        }

        /* renamed from: a */
        public final boolean accept(C34029b<Object> bVar, ChatMessageVO<?> cVar) {
            return !this.f90899a.f90898f.contains(Integer.valueOf(bVar.f87966a));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.widget.recyclerview.hive.b, com.ss.android.lark.widget.recyclerview.hive.e, java.lang.Object] */
    @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i, com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        return mo122580d((AbstractC59004b<?, ?>) bVar, eVar, (ChatMessageVO<? extends ContentVO<?>>) cVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i
    /* renamed from: e */
    public ActionContext mo122582e(AbstractC59004b<?, ?> bVar, AbstractC59010e eVar, ChatMessageVO<? extends ContentVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "hiveCell");
        Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        AbstractC33244i.AbstractC33246a aVar = this.f85550d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mDependency");
        ActionContext.PageType a = aVar.mo122586a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDependency.pageType");
        AbstractC33342d dVar = this.f85548b;
        Intrinsics.checkExpressionValueIsNotNull(dVar, "mChatContext");
        AbstractC33120i iVar = this.f85549c;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mMenuHandlerHub");
        return new C35195b(this, cVar, bVar, eVar, (AbstractView$OnClickListenerC59005c) bVar, (C59008d) eVar, a, dVar, iVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThreadCellClickHandler(RecyclerView recyclerView, AbstractC33342d dVar, AbstractC33120i iVar, AbstractC33244i.AbstractC33246a aVar) {
        super(recyclerView, dVar, iVar, aVar);
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(iVar, "menuHandlerHub");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo129632d(android.view.View r3, com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b<?, ?> r4, com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e r5, com.ss.android.lark.chat.vo.ChatMessageVO<? extends com.ss.android.lark.chat.export.vo.ContentVO<?>> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "anchorView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            boolean r0 = r2.f85551e
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.ss.android.lark.chat.base.view.a.d$a r4 = r2.mo122583f(r4, r5, r6)
            if (r4 == 0) goto L_0x002e
            com.ss.android.lark.chat.base.view.a.d r4 = r4.mo121611a()
            if (r4 == 0) goto L_0x002e
            r4.mo121593a(r3)
            goto L_0x002d
        L_0x001a:
            com.ss.android.lark.chat.base.view.a.b r0 = r2.m137428a()
            com.ss.android.lark.chat.base.view.a.d$a r4 = r2.mo122579b(r4, r5, r6, r0)
            if (r4 == 0) goto L_0x002e
            com.ss.android.lark.chat.base.view.a.d r4 = r4.mo121611a()
            if (r4 == 0) goto L_0x002e
            r4.mo121593a(r3)
        L_0x002d:
            r1 = r4
        L_0x002e:
            if (r1 != 0) goto L_0x0033
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0033:
            boolean r3 = r1.mo121599e()
            if (r3 == 0) goto L_0x0049
            if (r5 != 0) goto L_0x003e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003e:
            android.view.View r3 = r5.f146209n
            java.lang.String r4 = "hiveHolder!!.itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 1
            r3.setSelected(r4)
        L_0x0049:
            boolean r3 = r1.mo121599e()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatthread.view.ChatThreadCellClickHandler.mo129632d(android.view.View, com.ss.android.lark.widget.recyclerview.hive.b, com.ss.android.lark.widget.recyclerview.hive.e, com.ss.android.lark.chat.e.c):boolean");
    }
}
