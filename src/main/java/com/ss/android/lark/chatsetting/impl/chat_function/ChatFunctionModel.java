package com.ss.android.lark.chatsetting.impl.chat_function;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.AbstractC34498e;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0006\u0010\u001b\u001a\u00020\u0017J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "mDelegate", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mCurrChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "(Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "mDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency;", "kotlin.jvm.PlatformType", "mOpenAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "mPushAppFeedListener", "Lcom/ss/android/lark/chat/entity/push/IPushAppFeedListener;", "mPushPinReadStateListener", "Lcom/ss/android/lark/chatsetting/dto/IPushPinReadStateListener;", "getMPushPinReadStateListener", "()Lcom/ss/android/lark/chatsetting/dto/IPushPinReadStateListener;", "mPushPinReadStateListener$delegate", "Lkotlin/Lazy;", "create", "", "createPushAppFeedListener", "createPushPinReadStateListener", "destroy", "getOpenAppFeed", "getOpenAppFeedId", "", "getPinReadState", "getTodoListReadState", "onPushPinReadState", "hasUnreadPin", "", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.d */
public final class ChatFunctionModel extends BaseModel {

    /* renamed from: a */
    public final Delegate f89093a;

    /* renamed from: b */
    public final Chat f89094b;

    /* renamed from: c */
    private final AbstractC34461c f89095c = ChatSettingModule.m133639a();

    /* renamed from: d */
    private final Lazy f89096d = LazyKt.lazy(new C34522e(this));

    /* renamed from: e */
    private AbstractC33991a f89097e;

    /* renamed from: f */
    private C34019a f89098f;

    /* renamed from: g */
    private final Chatter f89099g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "", "onPinReadStateChanged", "", "hasUnreadPin", "", "onTodoListReadStateChanged", "isTodoUnClick", "onUpdateOpenAppFeed", "openAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.d$a */
    public interface Delegate {
        /* renamed from: a */
        void mo127569a(boolean z);

        /* renamed from: b */
        void mo127570b(boolean z);
    }

    /* renamed from: f */
    private final AbstractC34498e m134058f() {
        return (AbstractC34498e) this.f89096d.getValue();
    }

    /* renamed from: c */
    public final void mo127589c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/dto/IPushPinReadStateListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.d$e */
    static final class C34522e extends Lambda implements Function0<AbstractC34498e> {
        final /* synthetic */ ChatFunctionModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34522e(ChatFunctionModel dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC34498e invoke() {
            return this.this$0.mo127591e();
        }
    }

    /* renamed from: e */
    public final AbstractC34498e mo127591e() {
        return new C34519b(this);
    }

    /* renamed from: d */
    public final String mo127590d() {
        C34019a aVar = this.f89098f;
        if (aVar != null) {
            return aVar.mo125672a();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo127588b() {
        if (!this.f89094b.isSecret() && !this.f89094b.isSuper()) {
            AbstractC34461c cVar = this.f89095c;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
            cVar.mo127291u().mo127451a(this.f89094b.getId(), getCallbackManager().wrapAndAddGetDataCallback(new C34521d(this)));
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC34461c cVar;
        AbstractC34461c.AbstractC34466e d;
        super.create();
        AbstractC34461c cVar2 = this.f89095c;
        Intrinsics.checkExpressionValueIsNotNull(cVar2, "mDependency");
        if (!cVar2.mo127284n().mo127297a("leanMode") && (cVar = this.f89095c) != null && (d = cVar.mo127274d()) != null) {
            d.mo127323a(m134058f());
        }
    }

    /* renamed from: a */
    public final void mo127586a() {
        AbstractC34461c cVar = this.f89095c;
        Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
        if (cVar.mo127290t().mo127421a(this.f89094b, (Message) null)) {
            AbstractC34461c cVar2 = this.f89095c;
            Intrinsics.checkExpressionValueIsNotNull(cVar2, "mDependency");
            if (!cVar2.mo127284n().mo127297a("leanMode")) {
                AbstractC34461c cVar3 = this.f89095c;
                Intrinsics.checkExpressionValueIsNotNull(cVar3, "mDependency");
                cVar3.mo127290t().mo127418a(this.f89094b.getId(), getCallbackManager().wrapAndAddGetDataCallback(new C34520c(this)));
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C34019a aVar;
        AbstractC34461c.AbstractC34466e d;
        super.destroy();
        AbstractC34461c cVar = this.f89095c;
        Intrinsics.checkExpressionValueIsNotNull(cVar, "mDependency");
        if (!cVar.mo127284n().mo127297a("leanMode")) {
            AbstractC34461c cVar2 = this.f89095c;
            if (!(cVar2 == null || (d = cVar2.mo127274d()) == null)) {
                d.mo127354b(m134058f());
            }
            AbstractC33991a aVar2 = this.f89097e;
            if (aVar2 != null && (aVar = this.f89098f) != null) {
                AbstractC34461c cVar3 = this.f89095c;
                Intrinsics.checkExpressionValueIsNotNull(cVar3, "mDependency");
                cVar3.mo127289s().mo127411a(aVar.mo125672a(), aVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$getPinReadState$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.d$c */
    public static final class C34520c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionModel f89101a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34520c(ChatFunctionModel dVar) {
            this.f89101a = dVar;
        }

        /* renamed from: a */
        public void mo127592a(boolean z) {
            this.f89101a.f89093a.mo127569a(z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo127592a(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$getTodoListReadState$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isUnClick", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.d$d */
    public static final class C34521d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionModel f89102a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34521d(ChatFunctionModel dVar) {
            this.f89102a = dVar;
        }

        /* renamed from: a */
        public void mo127593a(boolean z) {
            this.f89102a.f89093a.mo127570b(z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo127593a(bool.booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo127587a(boolean z) {
        this.f89093a.mo127569a(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "chatId", "", "kotlin.jvm.PlatformType", "isRead", "", "onPushPinReadState"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.d$b */
    public static final class C34519b implements AbstractC34498e {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionModel f89100a;

        C34519b(ChatFunctionModel dVar) {
            this.f89100a = dVar;
        }

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34498e
        /* renamed from: a */
        public final void mo127528a(String str, boolean z) {
            if (Intrinsics.areEqual(this.f89100a.f89094b.getId(), str)) {
                this.f89100a.mo127587a(!z);
            }
        }
    }

    public ChatFunctionModel(Delegate aVar, Chat chat, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(aVar, "mDelegate");
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        this.f89093a = aVar;
        this.f89094b = chat;
        this.f89099g = chatter;
    }
}
