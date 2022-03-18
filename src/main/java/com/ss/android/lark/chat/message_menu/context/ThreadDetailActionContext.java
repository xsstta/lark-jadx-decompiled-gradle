package com.ss.android.lark.chat.message_menu.context;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.message_menu.provider.ThreadDetailRecallActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadDetailReplyActionProvider;
import com.ss.android.lark.chat.message_menu.provider.ThreadMutePlayActionProvider;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55886i;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55887j;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000eB-\u0012\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016J\u0018\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0016J\u0012\u00106\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00107\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u00010;H\u0016R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006<"}, d2 = {"Lcom/ss/android/lark/chat/message_menu/context/ThreadDetailActionContext;", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IReplyMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IForwardMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IRecallMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IMultiSelectMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IToggleAudioTextMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IAddStickerMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IAddFavoriteMenuHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/menu/handler/IEditImageMenuHandler;", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ICopyMenuHandler;", "Lcom/ss/android/lark/chat/message_menu/provider/ThreadMutePlayActionProvider$MutePlayContext;", "Lcom/ss/android/lark/chat/message_menu/provider/ThreadDetailRecallActionProvider$RecallContext;", "Lcom/ss/android/lark/chat/message_menu/provider/ThreadDetailReplyActionProvider$ReplyContext;", "hiveGroupCell", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;", "hiveGroupHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;", "threadDetailContext", "Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailContext;", "menuHandler", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "(Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupCell;Lcom/ss/android/lark/widget/recyclerview/hive/HiveGroupHolder;Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailContext;Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;)V", "getMenuHandler", "()Lcom/ss/android/lark/threaddetail/view/menu/handler/ThreadDetailMenuHandler;", "getThreadDetailContext", "()Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailContext;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "onAddSticker", "", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/StickerContentVO;", "onEditClicked", "selectPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isClickTranslated", "", "onForward", "messageId", "", "position", "", "onMultiSelect", "onReply", "onToggleAudioTextClick", "callback", "Lcom/ss/android/lark/threaddetail/view/menu/handler/IToggleAudioTextMenuHandler$Callback;", "onTranslate", "Lcom/ss/android/lark/threaddetail/view/menu/handler/ITranslateMenuHandler$Callback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.c.a.f */
public abstract class ThreadDetailActionContext extends ActionContext implements ThreadDetailReplyActionProvider.ReplyContext, ThreadMutePlayActionProvider.MutePlayContext, ThreadDetailRecallActionProvider.RecallContext, IEditImageMenuHandler, AbstractC55876a, AbstractC55877b, AbstractC55878c, AbstractC55880e, AbstractC55884g, AbstractC55886i, AbstractC55887j, AbstractC55890m, AbstractC55893n {

    /* renamed from: a */
    private final C55934b f84905a;

    /* renamed from: b */
    private final AbstractC55897p f84906b;

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: k */
    public Chatter mo106791k() {
        return null;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: d */
    public ActionContext.PageType mo106784d() {
        return ActionContext.PageType.THREAD_DETAIL;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: e */
    public Chat mo106785e() {
        return this.f84905a.mo122550n();
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: b */
    public Context mo106782b() {
        FragmentActivity g = this.f84905a.mo122543g();
        Intrinsics.checkExpressionValueIsNotNull(g, "threadDetailContext.getContext()");
        return g;
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionContext
    /* renamed from: c */
    public FragmentActivity mo106783c() {
        FragmentActivity g = this.f84905a.mo122543g();
        Intrinsics.checkExpressionValueIsNotNull(g, "threadDetailContext.getContext()");
        return g;
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g
    /* renamed from: a */
    public void mo121950a(int i) {
        this.f84906b.mo121950a(i);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b
    /* renamed from: a */
    public void mo121952a(AbsMessageVO<StickerContentVO> aVar) {
        this.f84906b.mo121952a(aVar);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m
    /* renamed from: a */
    public void mo121953a(AbstractC55890m.AbstractC55891a aVar) {
        this.f84906b.mo121953a(aVar);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n
    /* renamed from: a */
    public void mo121954a(AbstractC55893n.AbstractC55894a aVar) {
        this.f84906b.mo121954a(aVar);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55887j
    /* renamed from: a */
    public void mo121955a(String str) {
        this.f84906b.mo121955a(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhotoItem");
        this.f84906b.mo121937a(photoItem, z);
    }

    @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e
    /* renamed from: a */
    public void mo121951a(String str, int i) {
        this.f84906b.mo121951a(str, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadDetailActionContext(AbstractView$OnClickListenerC59005c<?, ?> cVar, C59008d dVar, C55934b bVar, AbstractC55897p pVar) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "hiveGroupCell");
        Intrinsics.checkParameterIsNotNull(dVar, "hiveGroupHolder");
        Intrinsics.checkParameterIsNotNull(bVar, "threadDetailContext");
        Intrinsics.checkParameterIsNotNull(pVar, "menuHandler");
        this.f84905a = bVar;
        this.f84906b = pVar;
    }
}
