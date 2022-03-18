package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop.IKeyboardTopExtendComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J \u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u0004\u0018\u00010\u0010J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u0007H\u0016J\u0018\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00063"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "disabledByOtherComponent", "", "isFirstItemDetected", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mKeyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "mSmartReplyContainer", "Landroid/widget/FrameLayout;", "mSmartReplyController", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyController;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "resumeTimeStamp", "", "getResumeTimeStamp", "()J", "setResumeTimeStamp", "(J)V", "getActivity", "Landroid/app/Activity;", "getFragment", "Landroidx/fragment/app/Fragment;", "getMessageForSmartReply", "", "dataCallback", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface$GetMessageForReplyCallback;", "getMessageInfoById", "id", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getReplyAction", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface$ReplyAction;", "getSmartReplyController", "initSmartReply", "isDisabledByOtherComponent", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "scrollToBottom", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o */
public final class SmartReplyPlugin extends BaseChatPlugin implements ISmartReplyInterface {

    /* renamed from: a */
    public FrameLayout f87139a;

    /* renamed from: b */
    public AbstractC28621d f87140b;

    /* renamed from: c */
    public IMessageListComponent f87141c;

    /* renamed from: d */
    public Chat f87142d;

    /* renamed from: e */
    public boolean f87143e;

    /* renamed from: f */
    public KeyBoard f87144f;

    /* renamed from: g */
    public boolean f87145g;

    /* renamed from: h */
    private IKeyboardComponent f87146h;

    /* renamed from: l */
    private long f87147l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$initSmartReply$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$c */
    public static final class C33821c implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87150a;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$c$a */
        static final class RunnableC33822a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33821c f87151a;

            /* renamed from: b */
            final /* synthetic */ KeyBoard f87152b;

            RunnableC33822a(C33821c cVar, KeyBoard fVar) {
                this.f87151a = cVar;
                this.f87152b = fVar;
            }

            public final void run() {
                SmartReplyPlugin oVar = this.f87151a.f87150a;
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                oVar.f87140b = b.aj().mo134485a(this.f87151a.f87150a.f87142d, this.f87151a.f87150a.f87139a, this.f87152b, this.f87151a.f87150a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33821c(SmartReplyPlugin oVar) {
            this.f87150a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
            this.f87150a.f87144f = fVar;
            UICallbackExecutor.post(new RunnableC33822a(this, fVar));
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: e */
    public boolean mo101865e() {
        return this.f87145g;
    }

    /* renamed from: f */
    public final long mo123846f() {
        return this.f87147l;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28618a
    /* renamed from: b */
    public Fragment mo101868b() {
        return mo122130k();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        AbstractC28621d dVar = this.f87140b;
        if (dVar != null) {
            dVar.mo101816c();
        }
        this.f87140b = null;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28618a
    /* renamed from: a */
    public Activity mo101867a() {
        Context i = mo122128i();
        if (i != null) {
            return (Activity) i;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: c */
    public void mo101863c() {
        IMessageListComponent iMessageListComponent = this.f87141c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123325i().mo122593a(0, false);
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: d */
    public ISmartReplyInterface.ReplyAction mo101864d() {
        KeyBoard fVar = this.f87144f;
        if (fVar == null) {
            return ISmartReplyInterface.ReplyAction.INPUT_DIRECT;
        }
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        if (fVar.mo146835p()) {
            return ISmartReplyInterface.ReplyAction.CHAT_REPLY;
        }
        return ISmartReplyInterface.ReplyAction.INPUT_DIRECT;
    }

    /* renamed from: g */
    public final void mo123847g() {
        IKeyboardComponent cVar = this.f87146h;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        cVar.mo121971a(new C33821c(this));
        IKeyboardComponent cVar2 = this.f87146h;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        cVar2.mo121975a(new C33823d(this));
        IMessageListComponent iMessageListComponent = this.f87141c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123310a(new C33824e(this));
        IMessageListComponent iMessageListComponent2 = this.f87141c;
        if (iMessageListComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent2.mo123313a(new C33825f(this));
        IMessageListComponent iMessageListComponent3 = this.f87141c;
        if (iMessageListComponent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent3.mo123308a(new C33826g(this));
    }

    /* renamed from: a */
    public final void mo123844a(long j) {
        this.f87147l = j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$getMessageForSmartReply$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "messageInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$a */
    public static final class C33819a implements IGetDataCallback<MessageInfo> {

        /* renamed from: a */
        final /* synthetic */ ISmartReplyInterface.AbstractC28617a f87148a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C33819a(ISmartReplyInterface.AbstractC28617a aVar) {
            this.f87148a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            ISmartReplyInterface.AbstractC28617a aVar = this.f87148a;
            if (aVar != null) {
                aVar.onSuccess(false, messageInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$getMessageForSmartReply$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "messageInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$b */
    public static final class C33820b implements IGetDataCallback<MessageInfo> {

        /* renamed from: a */
        final /* synthetic */ ISmartReplyInterface.AbstractC28617a f87149a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C33820b(ISmartReplyInterface.AbstractC28617a aVar) {
            this.f87149a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(MessageInfo messageInfo) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            ISmartReplyInterface.AbstractC28617a aVar = this.f87149a;
            if (aVar != null) {
                aVar.onSuccess(true, messageInfo);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$initSmartReply$2", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$d */
    public static final class C33823d implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87153a;

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33823d(SmartReplyPlugin oVar) {
            this.f87153a = oVar;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            if (System.currentTimeMillis() - this.f87153a.mo123846f() >= 1000) {
                if (z) {
                    AbstractC28621d dVar = this.f87153a.f87140b;
                    if (dVar != null) {
                        dVar.mo101540a(i);
                        return;
                    }
                    return;
                }
                AbstractC28621d dVar2 = this.f87153a.f87140b;
                if (dVar2 != null) {
                    dVar2.mo101542b();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$initSmartReply$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$INewMessageArrivedListener;", "onNewMessageArrived", "", "messageList", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$e */
    public static final class C33824e implements IMessageListComponent.INewMessageArrivedListener {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87154a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33824e(SmartReplyPlugin oVar) {
            this.f87154a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.INewMessageArrivedListener
        /* renamed from: a */
        public void mo122149a(List<? extends MessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "messageList");
            AbstractC28621d dVar = this.f87154a.f87140b;
            if (dVar != null) {
                dVar.mo101809a((MessageInfo) list.get(0));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$initSmartReply$4", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$f */
    public static final class C33825f implements RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87155a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122146a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33825f(SmartReplyPlugin oVar) {
            this.f87155a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122147a(List<? extends ChatMessageVO<?>> list) {
            AbstractC28621d dVar;
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            if (!this.f87155a.f87143e) {
                if (SmartReplyPlugin.m131034a(this.f87155a).mo123323f() && (dVar = this.f87155a.f87140b) != null) {
                    dVar.mo101812a(true);
                }
                this.f87155a.f87143e = true;
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122148a(boolean z, int i, int i2) {
            AbstractC28621d dVar;
            if (!SmartReplyPlugin.m131034a(this.f87155a).mo123323f() && z && (dVar = this.f87155a.f87140b) != null) {
                dVar.mo101812a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$initSmartReply$5", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IKeyboardTipChangeListener;", "visibility", "", "shown", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$g */
    public static final class C33826g implements IMessageListComponent.IKeyboardTipChangeListener {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87156a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33826g(SmartReplyPlugin oVar) {
            this.f87156a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IKeyboardTipChangeListener
        /* renamed from: a */
        public void mo123332a(boolean z) {
            FrameLayout frameLayout;
            this.f87156a.f87145g = z;
            if (z && (frameLayout = this.f87156a.f87139a) != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IActivityResultHandler;", "handleActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$h */
    public static final class C33827h implements IChatWindowApp.IActivityResultHandler {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87157a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33827h(SmartReplyPlugin oVar) {
            this.f87157a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp.IActivityResultHandler
        /* renamed from: a */
        public boolean mo123194a(int i, int i2, Intent intent) {
            if (this.f87157a.f87140b == null) {
                return false;
            }
            AbstractC28621d dVar = this.f87157a.f87140b;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            return dVar.mo101813a(i, i2, intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/SmartReplyPlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp$IShowSmartReplyHandler;", "onForceToShowSmartReply", "", "item", "", "Lcom/ss/android/lark/ai/smartreply/dto/SmartReplyItem;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.o$i */
    public static final class C33828i implements IChatWindowApp.IShowSmartReplyHandler {

        /* renamed from: a */
        final /* synthetic */ SmartReplyPlugin f87158a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33828i(SmartReplyPlugin oVar) {
            this.f87158a = oVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp.IShowSmartReplyHandler
        /* renamed from: a */
        public void mo123197a(List<? extends SmartReplyItem> list) {
            Intrinsics.checkParameterIsNotNull(list, "item");
            AbstractC28621d dVar = this.f87158a.f87140b;
            if (dVar != null) {
                dVar.mo101811a((List<SmartReplyItem>) list);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMessageListComponent m131034a(SmartReplyPlugin oVar) {
        IMessageListComponent iMessageListComponent = oVar.f87141c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: a */
    public void mo101862a(ISmartReplyInterface.AbstractC28617a aVar) {
        IKeyboardComponent cVar = this.f87146h;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        String l = cVar.mo121994l();
        if (TextUtils.isEmpty(l)) {
            IMessageListComponent iMessageListComponent = this.f87141c;
            if (iMessageListComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            List<ChatMessageVO<?>> k = iMessageListComponent.mo123327k();
            if (!k.isEmpty()) {
                mo123845a(((ChatMessageVO) CollectionsKt.last((List) k)).mo121681a(), new C33819a(aVar));
                return;
            }
            return;
        }
        if (l == null) {
            Intrinsics.throwNpe();
        }
        mo123845a(l, new C33820b(aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.larksuite.framework.callback.IGetDataCallback<com.ss.android.lark.chat.entity.message.MessageInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo123845a(String str, IGetDataCallback<MessageInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        IMessageListComponent iMessageListComponent = this.f87141c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        AbstractC34006a t = iMessageListComponent.mo123331t(str);
        if (t == null || !(t instanceof MessageInfo)) {
            if (iGetDataCallback != 0) {
                iGetDataCallback.onError(new ErrorResult("get messageInfo fail: " + str));
            }
        } else if (iGetDataCallback != 0) {
            iGetDataCallback.onSuccess(t);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87141c = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        this.f87146h = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        this.f87142d = bVar.f90956f;
        dVar.mo123125a(new C33827h(this));
        dVar.mo123128a(new C33828i(this));
        IKeyboardTopExtendComponent eVar = (IKeyboardTopExtendComponent) dVar.mo123122a(IKeyboardTopExtendComponent.class);
        eVar.getLifecycle().addObserver(new SmartReplyPlugin$onCreate$3(this, eVar));
    }
}
