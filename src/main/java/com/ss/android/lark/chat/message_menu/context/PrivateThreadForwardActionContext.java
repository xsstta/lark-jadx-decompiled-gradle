package com.ss.android.lark.chat.message_menu.context;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/context/PrivateThreadForwardActionContext;", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IForwardMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IAddFavoriteMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IMultiSelectMenuHandler;", "hiveGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "hiveGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "menuHandler", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;)V", "getChatContext", "()Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "getMenuHandler", "()Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "onForward", "", "messageId", "", "position", "", "onMultiSelect", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a.d */
public abstract class PrivateThreadForwardActionContext extends ActionContext implements AbstractC55876a, AbstractC55880e, AbstractC55884g {

    /* renamed from: a */
    private final AbstractC33342d f84901a;

    /* renamed from: b */
    private final AbstractC55897p f84902b;

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: k */
    public Chatter mo106791k() {
        return null;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: d */
    public ActionContext.PageType mo106784d() {
        return ActionContext.PageType.PRIVATE_THREAD_FORWARD;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: c */
    public FragmentActivity mo106783c() {
        return this.f84901a.mo122543g();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: e */
    public Chat mo106785e() {
        return this.f84901a.mo122550n();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: b */
    public Context mo106782b() {
        return this.f84901a.mo122543g();
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g
    /* renamed from: a */
    public void mo121950a(int i) {
        this.f84902b.mo121950a(i);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e
    /* renamed from: a */
    public void mo121951a(String str, int i) {
        this.f84902b.mo121951a(str, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivateThreadForwardActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar, AbstractC33342d dVar2, AbstractC55897p pVar) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "hiveGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "hiveGroupHolder");
        Intrinsics.checkParameterIsNotNull(dVar2, "chatContext");
        Intrinsics.checkParameterIsNotNull(pVar, "menuHandler");
        this.f84901a = dVar2;
        this.f84902b = pVar;
    }
}
