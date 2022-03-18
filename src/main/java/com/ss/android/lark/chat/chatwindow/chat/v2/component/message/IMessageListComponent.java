package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.chat.chatwindow.chat.C33234e;
import com.ss.android.lark.chat.chatwindow.chat.C33247j;
import com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.widget.ILifeCycleEventObserve;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\tcdefghijkJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u001a\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\"\u0010\u001a\u001a\u00020\u00042\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u001cH&J\b\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H&J\u001e\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&H&J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$H&J\b\u0010+\u001a\u00020\u0004H&J\u0012\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001cH&J\u0012\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001cH&J\b\u0010.\u001a\u00020$H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001cH&J\b\u00100\u001a\u00020$H&J\f\u00101\u001a\u0006\u0012\u0002\b\u000302H&J\n\u00103\u001a\u0004\u0018\u000104H&J\n\u00105\u001a\u0004\u0018\u000106H&J\u0012\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u00108\u001a\u00020\u001eH&J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0;H&J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$H&J\n\u0010>\u001a\u0004\u0018\u00010?H&J\u0012\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001cH&J\b\u0010A\u001a\u00020!H&J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u001eH&J\b\u0010D\u001a\u00020\u0004H&J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020$H&J\b\u0010G\u001a\u00020\u0004H&J*\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010LH&J\b\u0010M\u001a\u00020\u0004H&J*\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020!2\b\u0010\u0005\u001a\u0004\u0018\u00010RH&J\u0016\u0010S\u001a\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001cH&J\u0018\u0010T\u001a\u00020\u00042\u0006\u0010I\u001a\u00020$2\u0006\u0010U\u001a\u00020$H&J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020XH&J$\u0010Y\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020!2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010\u0005\u001a\u0004\u0018\u00010]H&J$\u0010^\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001e0`2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001f0bH&¨\u0006l"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "addAudioPlayModeChangeListener", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnAudioPlayerModeListener;", "addKeyboardTipChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IKeyboardTipChangeListener;", "addMessageCallbackHandler", "handler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "addMessageMenuProvider", "menuProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMessageMenuProvider;", "addMessageSelectModeChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IMessageTipChangeListener;", "addNewMessageArrivedListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$INewMessageArrivedListener;", "addOnItemDetectedListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "addOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "addSelectedMessageChangeListener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ISelectedMessageChangeListener;", "batchUpdateMsg", "patchProviderList", "", "Lcom/ss/android/lark/chatbase/BasePageStore$PatchProvider;", "", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "canLoadMore", "", "changeListBottomMargin", "height", "", "callback", "Lkotlin/Function0;", "changeListMode", "mode", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ListMode;", "selectedPosition", "ensureLastPageDataLoaded", "getAllMsg", "getCurrentPageMsg", "getFirstCompletelyVisibleMsgPos", "getFollowingSelectMessageIds", "getLastVisibleMsgPos", "getListScroller", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller;", "getMessageContext", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatWindowContext;", "getMessagesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMsgById", "id", "getMsgListByIds", "ids", "", "getMsgPosByAdapterPos", "adapterPos", "getRootLayout", "Landroid/widget/RelativeLayout;", "getSelectedMsgList", "isLastItemShown", "onAuditedFailed", "msg", "onBannerHide", "onBannerShow", "bannerHeight", "refreshMessageList", "scrollItemToCenter", "position", "smooth", "animStyle", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageListScroller$ScrollCallback;", "scrollToBottomIfNeed", "scrollToPosition", "newPosition", "showAnim", "toBottom", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnLoadMessageStatusListener;", "selectMsgByMsgIds", "selectMsgFromPosition", "limit", "serialExecute", "runnable", "Ljava/lang/Runnable;", "updateKeyboardTip", "shown", "tipContent", "", "Landroid/view/View$OnClickListener;", "updateMsg", "key", "Lcom/ss/android/lark/chatbase/BasePageStore$ItemTwoKey;", "updater", "Lcom/ss/android/lark/chatbase/model/PageStore$IItemPatch;", "IKeyboardTipChangeListener", "IListComponentCallbacks", "IMessageTipChangeListener", "INewMessageArrivedListener", "ISelectedMessageChangeListener", "ListMode", "MessageListComponentDependency", "OnAudioPlayerModeListener", "OnLoadMessageStatusListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface IMessageListComponent extends IComponent<IListComponentCallbacks> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ListMode;", "", "(Ljava/lang/String;I)V", "NORMAL", "BUILD_GROUP", "MULTI_SELECT", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ListMode {
        NORMAL,
        BUILD_GROUP,
        MULTI_SELECT
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$a */
    public static final class C33555a {
        /* renamed from: a */
        public static void m130088a(IMessageListComponent iMessageListComponent, IListComponentCallbacks cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            IComponent.C33505b.m129842a(iMessageListComponent, cVar);
        }

        /* renamed from: a */
        public static boolean m130089a(IMessageListComponent iMessageListComponent) {
            return IComponent.C33505b.m129843a(iMessageListComponent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IKeyboardTipChangeListener;", "", "visibility", "", "shown", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$b */
    public interface IKeyboardTipChangeListener {
        /* renamed from: a */
        void mo123332a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onMessageListReady", "onP2pChatterUpdate", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$c */
    public interface IListComponentCallbacks extends IComponentCallbacks {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$c$a */
        public static final class C33556a {
            /* renamed from: a */
            public static void m130094a(IListComponentCallbacks cVar) {
            }

            /* renamed from: a */
            public static void m130095a(IListComponentCallbacks cVar, Chat chat) {
                Intrinsics.checkParameterIsNotNull(chat, "chat");
            }

            /* renamed from: a */
            public static void m130096a(IListComponentCallbacks cVar, ChatChatter chatChatter) {
                Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            }
        }

        /* renamed from: a */
        void mo122152a();

        /* renamed from: a */
        void mo122153a(Chat chat);

        /* renamed from: a */
        void mo122154a(ChatChatter chatChatter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IMessageTipChangeListener;", "", "onMessageSelectModeChange", "", "isMultiSelect", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$d */
    public interface IMessageTipChangeListener {
        /* renamed from: a */
        void mo122151a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$INewMessageArrivedListener;", "", "onNewMessageArrived", "", "messageList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$e */
    public interface INewMessageArrivedListener {
        /* renamed from: a */
        void mo122149a(List<? extends MessageInfo> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$ISelectedMessageChangeListener;", "", "onSelectedMessageChange", "", "selectedCount", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$f */
    public interface ISelectedMessageChangeListener {
        /* renamed from: a */
        void mo123333a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013H&J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$MessageListComponentDependency;", "", "appendText", "", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "closePage", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "getGuideAnchorView", "Landroid/view/View;", "getKeyboardInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "insertAtInfoInEditor", "", BottomDialog.f17198f, "name", "isOutChat", "onEnterReplyMode", "replyInfo", "isReEdit", "resetOnStart", "toggleKeyboardTipShown", "shown", "triggerEventChanged", "eventName", "Lcom/ss/android/lark/widget/ILifeCycleEventObserve$Event;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$g */
    public interface MessageListComponentDependency {
        /* renamed from: a */
        C35221d mo123147a();

        /* renamed from: a */
        void mo123148a(C35221d dVar, boolean z, boolean z2);

        /* renamed from: a */
        void mo123149a(ILifeCycleEventObserve.Event event);

        /* renamed from: a */
        void mo123150a(RichText richText, String str, RichText richText2);

        /* renamed from: a */
        void mo123151a(boolean z);

        /* renamed from: a */
        boolean mo123152a(String str, String str2, boolean z);

        /* renamed from: b */
        View mo123153b();

        /* renamed from: c */
        IMessageSender mo123154c();

        /* renamed from: d */
        void mo123155d();

        /* renamed from: e */
        Fragment mo123156e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnAudioPlayerModeListener;", "", "onAudioPlayerModeChanged", "", "isSpeakerMode", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$h */
    public interface OnAudioPlayerModeListener {
        /* renamed from: a */
        void mo123159a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$OnLoadMessageStatusListener;", "", "onBeginLoading", "", "onEndLoading", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent$i */
    public interface OnLoadMessageStatusListener {
        /* renamed from: a */
        void mo122144a();

        /* renamed from: b */
        void mo122145b();
    }

    /* renamed from: a */
    List<AbstractC34006a> mo123303a(Collection<String> collection);

    /* renamed from: a */
    void mo123304a(int i, int i2);

    /* renamed from: a */
    void mo123305a(int i, boolean z, boolean z2, OnLoadMessageStatusListener iVar);

    /* renamed from: a */
    void mo123306a(IMessageMenuProvider cVar);

    /* renamed from: a */
    void mo123307a(ListMode listMode, int i);

    /* renamed from: a */
    void mo123308a(IKeyboardTipChangeListener bVar);

    /* renamed from: a */
    void mo123309a(IMessageTipChangeListener dVar);

    /* renamed from: a */
    void mo123310a(INewMessageArrivedListener eVar);

    /* renamed from: a */
    void mo123311a(ISelectedMessageChangeListener fVar);

    /* renamed from: a */
    void mo123312a(MessageCallbackHandler cVar);

    /* renamed from: a */
    void mo123313a(RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> cVar);

    /* renamed from: a */
    void mo123314a(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar);

    /* renamed from: a */
    void mo123315a(Runnable runnable);

    /* renamed from: a */
    void mo123316a(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list);

    /* renamed from: a */
    void mo123317a(boolean z, CharSequence charSequence, View.OnClickListener onClickListener);

    C33234e aq_();

    /* renamed from: b */
    RelativeLayout mo123319b();

    /* renamed from: b */
    void mo123320b(List<String> list);

    /* renamed from: c */
    int mo123321c(int i);

    /* renamed from: c */
    RecyclerView mo123322c();

    /* renamed from: f */
    boolean mo123323f();

    /* renamed from: g */
    boolean mo123324g();

    /* renamed from: i */
    C33247j<?> mo123325i();

    /* renamed from: j */
    List<ChatMessageVO<?>> mo123326j();

    /* renamed from: k */
    List<ChatMessageVO<?>> mo123327k();

    /* renamed from: l */
    List<ChatMessageVO<?>> mo123328l();

    /* renamed from: m */
    List<String> mo123329m();

    /* renamed from: n */
    void mo123330n();

    /* renamed from: t */
    AbstractC34006a mo123331t(String str);
}
