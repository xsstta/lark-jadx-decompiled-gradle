package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AllowAnonymousPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece;", "()V", "isAnonymousEnable", "", "getCheckedState", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isContentViewVisible", "itemType", "", "loadAnonymousQuota", "", "onChatChanged", "onCheckedChanged", "isChecked", "titleRes", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AllowAnonymousPiece extends ChatSettingSwitchPiece {

    /* renamed from: b */
    public static final Companion f90076b = new Companion(null);

    /* renamed from: g */
    private boolean f90077g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 23;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Groups_MgmtAllowAnonymity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AllowAnonymousPiece$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AllowAnonymousPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AllowAnonymousPiece() {
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f90077g = a.mo127262G();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/AllowAnonymousPiece$loadAnonymousQuota$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Long;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AllowAnonymousPiece$b */
    public static final class C34891b implements IGetDataCallback<Long> {

        /* renamed from: a */
        final /* synthetic */ AllowAnonymousPiece f90078a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34891b(AllowAnonymousPiece allowAnonymousPiece) {
            this.f90078a = allowAnonymousPiece;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f90078a.mo127648a((String) null);
        }

        /* renamed from: a */
        public void onSuccess(Long l) {
            String str;
            if (l == null || l.longValue() <= 0) {
                str = "";
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Groups_MgmtAllowAnonymityDesc, "N", String.valueOf(l.longValue()));
            }
            this.f90078a.mo127648a(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: a */
    public void mo127673a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127673a(chat);
        m135749e(chat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: b */
    public boolean mo127674b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.getAnonymousSetting() == Chat.AnonymousSetting.ALLOWED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: d */
    public void mo127676d(boolean z) {
        String id;
        Chat.AnonymousSetting.Enum r0;
        com.ss.android.lark.chat.entity.chat.Chat n = mo127678n();
        if (n != null && (id = n.getId()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(id, "getChat()?.getId() ?: return");
            if (z) {
                r0 = Chat.AnonymousSetting.Enum.ALLOWED;
            } else {
                r0 = Chat.AnonymousSetting.Enum.NOT_ALLOWED;
            }
            Job unused = C69553g.m266944a(this, null, null, new C34892c(this, id, r0, z, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AllowAnonymousPiece$onCheckedChanged$1", mo239173f = "AllowAnonymousPiece.kt", mo239174i = {0, 0}, mo239175l = {84}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "builder"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AllowAnonymousPiece$c */
    static final class C34892c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ Chat.AnonymousSetting.Enum $pbSetting;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ AllowAnonymousPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34892c(AllowAnonymousPiece allowAnonymousPiece, String str, Chat.AnonymousSetting.Enum r3, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = allowAnonymousPiece;
            this.$chatId = str;
            this.$pbSetting = r3;
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34892c cVar2 = new C34892c(this.this$0, this.$chatId, this.$pbSetting, this.$isChecked, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34892c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UpdateChatRequest.C18137a a2 = new UpdateChatRequest.C18137a().mo62912a(this.$chatId).mo62899a(this.$pbSetting);
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
                RucketJob<com.ss.android.lark.chat.entity.chat.Chat> a3 = bVar.mo127456a(a2);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.label = 1;
                obj = a3.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                UpdateChatRequest.C18137a aVar = (UpdateChatRequest.C18137a) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Lark_Legacy_SaveFail);
                this.this$0.mo127649c(!this.$isChecked);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    private final void m135749e(com.ss.android.lark.chat.entity.chat.Chat chat) {
        if (chat.getAnonymousSetting() == Chat.AnonymousSetting.UNKNOWN || chat.getAnonymousSetting() == Chat.AnonymousSetting.INVISIBLE || !this.f90077g) {
            mo127648a((String) null);
            return;
        }
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C34891b(this));
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127274d().mo127319a((IGetDataCallback) mo177209w().wrapAndAddCallback(uIGetDataCallback));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: c */
    public boolean mo127675c(com.ss.android.lark.chat.entity.chat.Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Chat.AnonymousSetting anonymousSetting = chat.getAnonymousSetting();
        Log.m165389i("AllowAnonymousPiece", "chatID = " + chat.getId() + " , AnonymousSetting = " + anonymousSetting + ", isAnonymousEnable = " + this.f90077g + ", isThread = " + chat.isThread());
        if (!this.f90077g || !chat.isThread() || anonymousSetting == Chat.AnonymousSetting.INVISIBLE || anonymousSetting == Chat.AnonymousSetting.UNKNOWN) {
            return false;
        }
        return true;
    }
}
