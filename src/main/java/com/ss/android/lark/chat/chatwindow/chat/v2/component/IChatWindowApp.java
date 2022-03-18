package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.IChatTabPageSpec;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u00040123J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J-\u0010\u000f\u001a\u0002H\u0010\"\u0010\b\u0000\u0010\u0010*\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0014H&¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0001H&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J%\u0010\u001f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0014H&¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H&J.\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u001c\b\u0002\u0010'\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&¨\u00064"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "", "addActivityResultHandler", "", "handle", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "addBackPressHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IBackPressHandler;", "addCloseHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "addShowSmartReplyHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "addTitleStateChangeHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/IChatTabPageSpec$OnTitleStateChangeListener;", "exitChat", "getComponent", "T", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponent;", "getContext", "Landroid/content/Context;", "getExtras", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "getHost", "getHostRootView", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "getMessageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "getViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "(Ljava/lang/Class;)Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IDependencyViewModel;", "handleBack", "", "openNewChat", "chatId", "", "contactsToApply", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/contact/entity/Contact;", "Lkotlin/collections/ArrayList;", "removeActivityResultHandler", "removeBackPressHandler", "removeCloseHandler", "removeShowSmartReplyHandler", "removeTitleStateChangeHandler", "IActivityResultHandler", "IBackPressHandler", "ICloseChatHandler", "IShowSmartReplyHandler", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.d */
public interface IChatWindowApp {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "", "handleActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.d$a */
    public interface IActivityResultHandler {
        /* renamed from: a */
        boolean mo123194a(int i, int i2, Intent intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IBackPressHandler;", "", "handleBack", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.d$b */
    public interface IBackPressHandler {
        /* renamed from: a */
        boolean mo123195a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$ICloseChatHandler;", "", "onCloseChat", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.d$c */
    public interface ICloseChatHandler {
        /* renamed from: a */
        boolean mo123196a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "", "onForceToShowSmartReply", "", "item", "", "Lcom/ss/android/lark/ai/smartreply/dto/SmartReplyItem;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.d$d */
    public interface IShowSmartReplyHandler {
        /* renamed from: a */
        void mo123197a(List<? extends SmartReplyItem> list);
    }

    /* renamed from: a */
    <T extends IComponent<? extends IComponentCallbacks>> T mo123122a(Class<T> cls);

    /* renamed from: a */
    void mo123125a(IActivityResultHandler aVar);

    /* renamed from: a */
    void mo123126a(IBackPressHandler bVar);

    /* renamed from: a */
    void mo123127a(ICloseChatHandler cVar);

    /* renamed from: a */
    void mo123128a(IShowSmartReplyHandler dVar);

    /* renamed from: a */
    void mo123129a(IChatTabPageSpec.OnTitleStateChangeListener dVar);

    /* renamed from: b */
    ChatBundle mo123134b();

    /* renamed from: f */
    Context mo123135f();

    /* renamed from: g */
    IMessageSender mo123136g();

    /* renamed from: i */
    void mo123138i();

    /* renamed from: j */
    boolean mo123139j();

    /* renamed from: k */
    ILKUILayout mo123140k();

    /* renamed from: o */
    Object mo123193o();
}
