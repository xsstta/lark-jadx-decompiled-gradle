package com.ss.android.lark.chatthread.view;

import android.content.Context;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33086b;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.AudioDraftMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell;
import com.ss.android.lark.chat.chatwindow.chat.message.DesktopFileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.FileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.RecallOrBurnedMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.RedPacketSystemMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.UnKnownMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33329a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33331c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33332d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33333e;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33335f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33336g;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33337h;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33338i;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33339j;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33340k;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33341l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33343a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33346c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33355d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33357f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33359i;
import com.ss.android.lark.chat.chatwindow.chat.message.style.bubble.PostChatThreadBubbleStyleProvider;
import com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.view.message.menu.FolderContextMenuHandler;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatthread.messagebubble.ChatThreadMessageBubbleCell;
import com.ss.android.lark.chatthread.view.callback.ChatThreadMessageCallbackHub;
import com.ss.android.lark.dependency.AbstractC36458af;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000RÃ\u0001\u0010\u000b\u001a¶\u0001\u0012T\u0012R\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010 \u0011*+\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\r¨\u0006\u00010\r¨\u0006\u0001 \u0011*Z\u0012T\u0012R\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010 \u0011*+\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\r¨\u0006\u00010\r¨\u0006\u0001\u0018\u00010\u00120\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadMessageCellFactory;", "", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "clickHandler", "Lcom/ss/android/lark/chatthread/view/ChatThreadCellClickHandler;", "menuHandlerHub", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "messageCallbackHub", "Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chatthread/view/ChatThreadCellClickHandler;Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;)V", "openFactory", "", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCellFactory;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "kotlin.jvm.PlatformType", "", "apply", "", "adapter", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.view.d */
public final class ChatThreadMessageCellFactory {

    /* renamed from: a */
    public static final Companion f90904a = new Companion(null);

    /* renamed from: b */
    private final List<IOpenMessageCellFactory<ContentVO<?>, IOpenMsgVOConverter<?>, IOpenMessageCell<?>>> f90905b;

    /* renamed from: c */
    private final AbstractC33342d f90906c;

    /* renamed from: d */
    private final ChatThreadCellClickHandler f90907d;

    /* renamed from: e */
    private final AbstractC33120i f90908e;

    /* renamed from: f */
    private final ChatThreadMessageCallbackHub f90909f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadMessageCellFactory$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatthread/messagebubble/ChatThreadMessageBubbleCell;", "it", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "kotlin.jvm.PlatformType", "mapToCell"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$f */
    public static final class C35200f<Value> implements AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO<ContentVO<?>>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90915a;

        C35200f(ChatThreadMessageBubbleCell aVar) {
            this.f90915a = aVar;
        }

        /* renamed from: a */
        public final ChatThreadMessageBubbleCell mapToCell(ChatMessageVO<ContentVO<?>> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            return this.f90915a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "itemValue", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "typeOf"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$b */
    public static final class C35196b<Value> implements AbstractView$OnClickListenerC58999a.AbstractC59002b<ChatMessageVO<ContentVO<?>>> {

        /* renamed from: a */
        public static final C35196b f90910a = new C35196b();

        C35196b() {
        }

        /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends com.ss.android.lark.chat.export.vo.a<?>> */
        /* renamed from: a */
        public final Class<? extends ContentVO<?>> typeOf(ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "itemValue");
            return cVar.mo121699g().getClass();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "itemValue", "mapToCell"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$c */
    public static final class C35197c<Value> implements AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO<ContentVO<?>>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90911a;

        C35197c(ChatThreadMessageBubbleCell aVar) {
            this.f90911a = aVar;
        }

        /* renamed from: a */
        public final AbstractC59004b<ChatMessageVO<?>, ?> mapToCell(ChatMessageVO<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "itemValue");
            AbstractC59004b<ChatMessageVO<?>, ?> bVar = null;
            if (cVar.mo121698f() || cVar.mo124251X() || cVar.mo121713u()) {
                return this.f90911a;
            }
            return bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "it", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "kotlin.jvm.PlatformType", "mapToCell"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$e */
    public static final class C35199e<Value> implements AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO<ContentVO<?>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC59004b f90914a;

        C35199e(AbstractC59004b bVar) {
            this.f90914a = bVar;
        }

        /* renamed from: a */
        public final AbstractC59004b<?, ?> mapToCell(ChatMessageVO<ContentVO<?>> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            Content z = cVar.mo121699g().mo126168z();
            if ((z instanceof SystemContent) && ((SystemContent) z).isRedPackSystemMessage()) {
                return this.f90914a;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0002\b\u0003\u0018\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveCell;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "it", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "kotlin.jvm.PlatformType", "mapToCell"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.d$d */
    public static final class C35198d<Value> implements AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO<ContentVO<?>>> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadMessageBubbleCell f90912a;

        /* renamed from: b */
        final /* synthetic */ ChatThreadMessageBubbleCell f90913b;

        C35198d(ChatThreadMessageBubbleCell aVar, ChatThreadMessageBubbleCell aVar2) {
            this.f90912a = aVar;
            this.f90913b = aVar2;
        }

        /* renamed from: a */
        public final AbstractC59004b<ChatMessageVO<?>, ?> mapToCell(ChatMessageVO<ContentVO<?>> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            ContentVO<?> g = cVar.mo121699g();
            if (!(g instanceof AudioContentVO) || ((AudioContentVO) g).mo121815j() != AudioContent.AudioState.RECORDING) {
                return this.f90913b;
            }
            return this.f90912a;
        }
    }

    /* renamed from: a */
    public final void mo129637a(C33086b bVar) {
        FileMessageCell fileMessageCell;
        Intrinsics.checkParameterIsNotNull(bVar, "adapter");
        List<IOpenMessageCellFactory<ContentVO<?>, IOpenMsgVOConverter<?>, IOpenMessageCell<?>>> list = this.f90905b;
        Intrinsics.checkExpressionValueIsNotNull(list, "openFactory");
        List<IOpenMessageCellFactory<ContentVO<?>, IOpenMsgVOConverter<?>, IOpenMessageCell<?>>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            C33346c cVar = new C33346c(this.f90909f);
            IOpenMessageCell b = it.next().mo120404b(this.f90906c, cVar);
            arrayList.add(new ChatThreadMessageBubbleCell.Builder().mo129345a(new C33343a(this.f90906c, b, cVar)).mo129346a(this.f90906c).mo129350a(this.f90907d).mo129348a(new C33357f(b)).mo129349a(this.f90909f).mo129347a(new C33337h(this.f90906c, b)).mo129351a());
        }
        ArrayList<ChatThreadMessageBubbleCell> arrayList2 = arrayList;
        ChatThreadMessageBubbleCell.Builder a = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new TextMessageCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f);
        AbstractC33342d dVar = this.f90906c;
        AbstractC33120i iVar = this.f90908e;
        ChatThreadMessageBubbleCell a2 = a.mo129347a(new C33340k(dVar, iVar, iVar, iVar)).mo129351a();
        AbstractC33342d dVar2 = this.f90906c;
        ChatThreadMessageCallbackHub aVar = this.f90909f;
        ChatThreadMessageBubbleCell.Builder a3 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new PostMessageCell(dVar2, aVar, aVar)).mo129350a(this.f90907d).mo129348a(new PostChatThreadBubbleStyleProvider()).mo129349a(this.f90909f);
        AbstractC33342d dVar3 = this.f90906c;
        AbstractC33120i iVar2 = this.f90908e;
        ChatThreadMessageBubbleCell a4 = a3.mo129347a(new C33338i(dVar3, iVar2, iVar2, iVar2)).mo129351a();
        ChatThreadMessageBubbleCell a5 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new ImageMessageCell(this.f90906c, 10.0f, 1.0f, true, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33333e(this.f90906c, this.f90908e)).mo129351a();
        ChatThreadMessageBubbleCell a6 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new StickerMessageCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33339j(this.f90906c, this.f90908e)).mo129351a();
        ChatThreadMessageBubbleCell a7 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new MediaMessageCell(this.f90906c, 10.0f, 1.0f, true, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33335f(this.f90906c, this.f90909f)).mo129351a();
        ChatThreadMessageBubbleCell a8 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new AudioDraftMessageCell(this.f90906c)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129351a();
        ChatThreadMessageBubbleCell.Builder a9 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new AudioMessageNewCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f);
        AbstractC33342d dVar4 = this.f90906c;
        AbstractC33120i iVar3 = this.f90908e;
        ChatThreadMessageBubbleCell a10 = a9.mo129347a(new C33329a(dVar4, iVar3, iVar3)).mo129351a();
        if (!DesktopUtil.m144301a((Context) this.f90906c.mo122543g()) || this.f90906c.mo122549m()) {
            fileMessageCell = new FileMessageCell(this.f90906c, this.f90909f);
        } else {
            fileMessageCell = new DesktopFileMessageCell(this.f90906c, this.f90909f);
        }
        ChatThreadMessageBubbleCell a11 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(fileMessageCell).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33331c(this.f90906c)).mo129351a();
        ChatThreadMessageBubbleCell a12 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new FolderMessageCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new FolderContextMenuHandler(this.f90906c)).mo129351a();
        ChatThreadMessageBubbleCell a13 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new GroupMessageCell(this.f90906c, UIHelper.dp2px(0.5f), R.drawable.thread_item_white_bg)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129348a(new C33355d()).mo129347a(new C33332d(this.f90906c)).mo129351a();
        ChatThreadMessageBubbleCell.Builder a14 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c);
        AbstractC33342d dVar5 = this.f90906c;
        ChatThreadMessageBubbleCell a15 = a14.mo129345a(new MergeForwardMessageCell(dVar5, (int) C25653b.m91892a((Context) dVar5.mo122543g(), 16.0f), R.drawable.thread_item_white_bg)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33336g(this.f90906c, this.f90908e)).mo129351a();
        ChatThreadMessageBubbleCell a16 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new ThreadMergeForwardMessageCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129348a(new C33359i(this.f90906c)).mo129349a(this.f90909f).mo129347a(new C33341l(this.f90906c, this.f90908e)).mo129351a();
        ChatThreadMessageBubbleCell a17 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new RecallOrBurnedMessageCell(this.f90906c, this.f90909f)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33330b(this.f90906c, true)).mo129351a();
        ChatThreadMessageBubbleCell a18 = new ChatThreadMessageBubbleCell.Builder().mo129346a(this.f90906c).mo129345a(new UnKnownMessageCell(this.f90906c)).mo129350a(this.f90907d).mo129349a(this.f90909f).mo129347a(new C33330b(this.f90906c, true)).mo129351a();
        bVar.mo200122a(C35196b.f90910a);
        bVar.mo200121a(new C35197c(a17));
        bVar.mo200126a(AudioContentVO.class, new C35198d(a8, a10));
        bVar.mo200126a(SystemContentVO.class, new C35199e(new RedPacketSystemMessageCell(this.f90906c)));
        for (ChatThreadMessageBubbleCell aVar2 : arrayList2) {
            bVar.mo200123a(aVar2);
        }
        bVar.mo200123a(a2);
        bVar.mo200123a(a4);
        bVar.mo200123a(a5);
        bVar.mo200123a(a6);
        bVar.mo200123a(a7);
        bVar.mo200123a(a11);
        bVar.mo200123a(a13);
        bVar.mo200123a(a15);
        bVar.mo200123a(a16);
        bVar.mo200123a(a12);
        bVar.mo200121a(new C35200f(a18));
    }

    public ChatThreadMessageCellFactory(AbstractC33342d dVar, ChatThreadCellClickHandler bVar, AbstractC33120i iVar, ChatThreadMessageCallbackHub aVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(bVar, "clickHandler");
        Intrinsics.checkParameterIsNotNull(iVar, "menuHandlerHub");
        Intrinsics.checkParameterIsNotNull(aVar, "messageCallbackHub");
        this.f90906c = dVar;
        this.f90907d = bVar;
        this.f90908e = iVar;
        this.f90909f = aVar;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36458af F = b.mo134507F();
        Intrinsics.checkExpressionValueIsNotNull(F, "ChatModuleInstanceHolder…pendency().openDependency");
        this.f90905b = F.mo134428a();
    }
}
