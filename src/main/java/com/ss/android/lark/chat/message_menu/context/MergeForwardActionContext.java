package com.ss.android.lark.chat.message_menu.context;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/context/MergeForwardActionContext;", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "hiveGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "hiveGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "getChatContext", "()Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a.c */
public abstract class MergeForwardActionContext extends ActionContext {

    /* renamed from: a */
    private final AbstractC33342d f84900a;

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: k */
    public Chatter mo106791k() {
        return null;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: d */
    public ActionContext.PageType mo106784d() {
        return ActionContext.PageType.MESSAGE_MERGE_FORWARD;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: c */
    public FragmentActivity mo106783c() {
        return this.f84900a.mo122543g();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: e */
    public Chat mo106785e() {
        return this.f84900a.mo122550n();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: b */
    public Context mo106782b() {
        return this.f84900a.mo122543g();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MergeForwardActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar, AbstractC33342d dVar2) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "hiveGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "hiveGroupHolder");
        Intrinsics.checkParameterIsNotNull(dVar2, "chatContext");
        this.f84900a = dVar2;
    }
}
