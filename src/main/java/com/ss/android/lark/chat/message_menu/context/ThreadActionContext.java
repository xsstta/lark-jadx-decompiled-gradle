package com.ss.android.lark.chat.message_menu.context;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.message_menu.provider.ThreadMutePlayActionProvider;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threadwindow.view.p2767b.p2769b.AbstractC56156a;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B-\u0012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0016J\u0018\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010-H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/ss/android/lark/chat/message_menu/context/ThreadActionContext;", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IToggleAudioTextMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IAddStickerMenuHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/menu/handler/IEditImageMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ICopyMenuHandler;", "Lcom/ss/android/lark/chat/message_menu/provider/ThreadMutePlayActionProvider$MutePlayContext;", "hiveGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "hiveGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "menuHandler", "Lcom/ss/android/lark/threadwindow/view/menu/handler/ThreadWindowMenuHandler;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/threadwindow/view/menu/handler/ThreadWindowMenuHandler;)V", "getChatContext", "()Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "getMenuHandler", "()Lcom/ss/android/lark/threadwindow/view/menu/handler/ThreadWindowMenuHandler;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "onAddSticker", "", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/StickerContentVO;", "onEditClicked", "selectPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isClickTranslated", "", "onToggleAudioTextClick", "callback", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IToggleAudioTextMenuHandler$Callback;", "onTranslate", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler$Callback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a.e */
public abstract class ThreadActionContext extends ActionContext implements ThreadMutePlayActionProvider.MutePlayContext, IEditImageMenuHandler, AbstractC55877b, AbstractC55878c, AbstractC55890m, AbstractC55893n {

    /* renamed from: a */
    private final AbstractC33342d f84903a;

    /* renamed from: b */
    private final AbstractC56156a f84904b;

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: k */
    public Chatter mo106791k() {
        return null;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: d */
    public ActionContext.PageType mo106784d() {
        return ActionContext.PageType.THREAD;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: c */
    public FragmentActivity mo106783c() {
        return this.f84903a.mo122543g();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: e */
    public Chat mo106785e() {
        return this.f84903a.mo122550n();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: b */
    public Context mo106782b() {
        return this.f84903a.mo122543g();
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b
    /* renamed from: a */
    public void mo121952a(AbsMessageVO<StickerContentVO> aVar) {
        this.f84904b.mo121952a(aVar);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
    /* renamed from: a */
    public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
        this.f84904b.mo121953a(aVar);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n
    /* renamed from: a */
    public void mo121954a(AbstractC55893n.AbstractC55894a aVar) {
        this.f84904b.mo121954a(aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhotoItem");
        this.f84904b.mo121937a(photoItem, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar, AbstractC33342d dVar2, AbstractC56156a aVar) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "hiveGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "hiveGroupHolder");
        Intrinsics.checkParameterIsNotNull(dVar2, "chatContext");
        Intrinsics.checkParameterIsNotNull(aVar, "menuHandler");
        this.f84903a = dVar2;
        this.f84904b = aVar;
    }
}
