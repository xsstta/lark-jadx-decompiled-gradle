package com.ss.android.lark.moments.impl.privatechat;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.privatechat.SecretChatRequestResult;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.pb.moments.AcceptSecretChatResponse;
import com.ss.android.lark.pb.moments.AskForSecretChatResponse;
import com.ss.android.lark.pb.moments.CheckSecretChatStatusResponse;
import com.ss.android.lark.pb.moments_entities.SecretChatStatus;
import com.ss.android.lark.utils.UIHelper;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J8\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0016J$\u0010\u001c\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J \u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J(\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/MomentsSecretChatHandler;", "Lcom/ss/android/lark/moments/impl/privatechat/IMomentsSecretChatHandler;", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "acceptSecretChat", "", "context", "Landroid/content/Context;", "token", "", "askForCreateSecretChat", "postId", "commentId", "message", "observeRequestResult", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onInputDialogShowListener", "Lkotlin/Function0;", "onInputDialogDismissListener", "requestSecretChat", "anonymousName", "showAlreadySentDialog", "titleId", "", "messageId", "showAskSecretChatDialog", "askData", "Lcom/ss/android/lark/moments/impl/privatechat/AskData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.f.c */
public final class MomentsSecretChatHandler implements IMomentsSecretChatHandler {

    /* renamed from: a */
    public final C1177w<SecretChatRequestResult> f119726a = new C1177w<>();

    /* renamed from: b */
    private final Lazy f119727b = LazyKt.lazy(C47458e.INSTANCE);

    /* renamed from: a */
    private final CoroutineScope m188137a() {
        return (CoroutineScope) this.f119727b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$e */
    static final class C47458e extends Lambda implements Function0<CoroutineScope> {
        public static final C47458e INSTANCE = new C47458e();

        C47458e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-secret-chat");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…(\"lk-moment-secret-chat\")");
            return C69364ai.m266265a(bl.m266382a(newSerialIODensityThreadPool));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/privatechat/MomentsSecretChatHandler$showAskSecretChatDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "onTextChanged", "", "s", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$g */
    public static final class C47460g implements UDInputDialogBuilder.OnTextChangedListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f119733a;

        C47460g(Ref.ObjectRef objectRef) {
            this.f119733a = objectRef;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDInputDialogBuilder.OnTextChangedListener
        /* renamed from: a */
        public void mo89293a(CharSequence charSequence) {
            this.f119733a.element = (T) String.valueOf(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$k */
    public static final class DialogInterface$OnDismissListenerC47464k implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f119741a;

        DialogInterface$OnDismissListenerC47464k(Function0 function0) {
            this.f119741a = function0;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Function0 function0 = this.f119741a;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$j */
    public static final class DialogInterface$OnCancelListenerC47463j implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ AskData f119740a;

        DialogInterface$OnCancelListenerC47463j(AskData aVar) {
            this.f119740a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
            String a = this.f119740a.mo166870a();
            if (a == null) {
                a = "none";
            }
            MomentsHitPointNew.Companion.m188107a(aVar, a, "cancel", null, 4, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler$acceptSecretChat$1", mo239173f = "MomentsSecretChatHandler.kt", mo239174i = {0}, mo239175l = {49}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$a */
    public static final class C47454a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $token;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47454a(String str, Context context, Continuation cVar) {
            super(2, cVar);
            this.$token = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47454a aVar = new C47454a(this.$token, this.$context, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47454a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                String str = this.$token;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167202d(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AcceptSecretChatResponse acceptSecretChatResponse = (AcceptSecretChatResponse) obj;
            if (acceptSecretChatResponse != null) {
                if (Intrinsics.areEqual(acceptSecretChatResponse.mis_expired, C69089a.m265837a(true))) {
                    LKUIToast.show(this.$context, UIHelper.getString(R.string.Lark_Community_SecureChatInvitationLinkExpired_InviteeToast));
                    return Unit.INSTANCE;
                } else if (acceptSecretChatResponse.mchat_id != null) {
                    IChatModuleDependency chatModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency();
                    Context context = this.$context;
                    String str2 = acceptSecretChatResponse.mchat_id;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.mchat_id");
                    chatModuleDependency.mo144698a(context, str2);
                    return Unit.INSTANCE;
                }
            }
            LKUIToast.show(this.$context, UIHelper.getString(R.string.Lark_Community_SomethingWentWrong_Toast));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler$askForCreateSecretChat$1", mo239173f = "MomentsSecretChatHandler.kt", mo239174i = {0}, mo239175l = {166}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$b */
    public static final class C47455b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $commentId;
        final /* synthetic */ String $message;
        final /* synthetic */ String $postId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsSecretChatHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47455b(MomentsSecretChatHandler cVar, String str, String str2, String str3, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$postId = str;
            this.$commentId = str2;
            this.$message = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47455b bVar = new C47455b(this.this$0, this.$postId, this.$commentId, this.$message, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47455b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                String str = this.$postId;
                String str2 = this.$commentId;
                String str3 = this.$message;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167197b(str, str2, str3, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((AskForSecretChatResponse) obj) != null) {
                this.this$0.f119726a.mo5926a(SecretChatRequestResult.ToSendSuccessDialog.f119745a);
                return Unit.INSTANCE;
            }
            this.this$0.f119726a.mo5926a(SecretChatRequestResult.ToastUnknownError.f119748a);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$c */
    public static final class C47456c<T> implements AbstractC1178x<SecretChatRequestResult> {

        /* renamed from: a */
        final /* synthetic */ MomentsSecretChatHandler f119728a;

        /* renamed from: b */
        final /* synthetic */ Context f119729b;

        /* renamed from: c */
        final /* synthetic */ Function0 f119730c;

        /* renamed from: d */
        final /* synthetic */ Function0 f119731d;

        C47456c(MomentsSecretChatHandler cVar, Context context, Function0 function0, Function0 function02) {
            this.f119728a = cVar;
            this.f119729b = context;
            this.f119730c = function0;
            this.f119731d = function02;
        }

        /* renamed from: a */
        public final void onChanged(SecretChatRequestResult eVar) {
            if (eVar instanceof SecretChatRequestResult.ToastNotAllowed) {
                LKUIToast.show(this.f119729b, UIHelper.getString(R.string.Lark_Community_UnableToStartSecureChatBlocked_Toast));
            } else if (eVar instanceof SecretChatRequestResult.ToAskDialog) {
                Function0 function0 = this.f119730c;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
                this.f119728a.mo166877a(this.f119729b, ((SecretChatRequestResult.ToAskDialog) eVar).mo166886a(), this.f119731d);
            } else if (eVar instanceof SecretChatRequestResult.ToWaitDialog) {
                this.f119728a.mo166876a(this.f119729b, R.string.Lark_Community_UnableToStartSecureChatAgain_PopupTitle, R.string.Lark_Community_UnableToStartSecureChatAgain_PopupText);
            } else if (eVar instanceof SecretChatRequestResult.ToSendSuccessDialog) {
                this.f119728a.mo166876a(this.f119729b, R.string.Lark_Community_SecureChatInvitationSent_PopupTitle, R.string.Lark_Community_SecureChatInvitationSent_PopupText);
            } else if (eVar instanceof SecretChatRequestResult.ToSecretChat) {
                MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144698a(this.f119729b, ((SecretChatRequestResult.ToSecretChat) eVar).mo166887a());
            } else {
                LKUIToast.show(this.f119729b, UIHelper.getString(R.string.Lark_Community_SomethingWentWrong_Toast));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.privatechat.MomentsSecretChatHandler$requestSecretChat$1", mo239173f = "MomentsSecretChatHandler.kt", mo239174i = {0}, mo239175l = {66}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$d */
    public static final class C47457d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $anonymousName;
        final /* synthetic */ String $commentId;
        final /* synthetic */ String $postId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsSecretChatHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47457d(MomentsSecretChatHandler cVar, String str, String str2, String str3, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$postId = str;
            this.$commentId = str2;
            this.$anonymousName = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47457d dVar = new C47457d(this.this$0, this.$postId, this.$commentId, this.$anonymousName, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47457d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                String str = this.$postId;
                String str2 = this.$commentId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167193a(str, str2, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CheckSecretChatStatusResponse checkSecretChatStatusResponse = (CheckSecretChatStatusResponse) obj;
            if (checkSecretChatStatusResponse != null) {
                SecretChatStatus secretChatStatus = checkSecretChatStatusResponse.mstatus;
                SecretChatRequestResult.ToastNotAllowed eVar = null;
                if (secretChatStatus != null) {
                    int i2 = C47465d.f119742a[secretChatStatus.ordinal()];
                    if (i2 == 1) {
                        eVar = SecretChatRequestResult.ToastNotAllowed.f119747a;
                    } else if (i2 == 2) {
                        eVar = new SecretChatRequestResult.ToAskDialog(new AskData(this.$postId, this.$commentId, this.$anonymousName));
                    } else if (i2 == 3) {
                        eVar = SecretChatRequestResult.ToWaitDialog.f119746a;
                    } else if (i2 == 4) {
                        String str3 = checkSecretChatStatusResponse.mchat_id;
                        if (str3 != null) {
                            eVar = new SecretChatRequestResult.ToSecretChat(str3);
                        }
                        eVar = eVar;
                    }
                }
                if (eVar != null) {
                    this.this$0.f119726a.mo5926a(eVar);
                    return Unit.INSTANCE;
                }
                this.this$0.f119726a.mo5926a(SecretChatRequestResult.ToastUnknownError.f119748a);
                return Unit.INSTANCE;
            }
            this.this$0.f119726a.mo5926a(SecretChatRequestResult.ToastUnknownError.f119748a);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$f */
    public static final class DialogInterface$OnClickListenerC47459f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC47459f f119732a = new DialogInterface$OnClickListenerC47459f();

        DialogInterface$OnClickListenerC47459f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$i */
    public static final class DialogInterface$OnClickListenerC47462i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f119738a;

        /* renamed from: b */
        final /* synthetic */ AskData f119739b;

        DialogInterface$OnClickListenerC47462i(Context context, AskData aVar) {
            this.f119738a = context;
            this.f119739b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            KeyboardUtils.hideKeyboard(this.f119738a);
            MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
            String a = this.f119739b.mo166870a();
            if (a == null) {
                a = "none";
            }
            MomentsHitPointNew.Companion.m188107a(aVar, a, "cancel", null, 4, null);
        }
    }

    /* renamed from: a */
    public void mo166878a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Job unused = C69553g.m266944a(m188137a(), null, null, new C47454a(str, context, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.c$h */
    public static final class DialogInterface$OnClickListenerC47461h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsSecretChatHandler f119734a;

        /* renamed from: b */
        final /* synthetic */ AskData f119735b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f119736c;

        /* renamed from: d */
        final /* synthetic */ Context f119737d;

        DialogInterface$OnClickListenerC47461h(MomentsSecretChatHandler cVar, AskData aVar, Ref.ObjectRef objectRef, Context context) {
            this.f119734a = cVar;
            this.f119735b = aVar;
            this.f119736c = objectRef;
            this.f119737d = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119734a.mo166879a(this.f119735b.mo166870a(), this.f119735b.mo166871b(), this.f119736c.element);
            KeyboardUtils.hideKeyboard(this.f119737d);
            MomentsHitPointNew.Companion aVar = MomentsHitPointNew.f119721a;
            String a = this.f119735b.mo166870a();
            if (a == null) {
                a = "none";
            }
            MomentsHitPointNew.Companion.m188107a(aVar, a, "confirm", null, 4, null);
        }
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void requestSecretChat(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
        Job unused = C69553g.m266944a(m188137a(), null, null, new C47457d(this, str, str2, str3, null), 3, null);
    }

    /* renamed from: a */
    public final void mo166876a(Context context, int i, int i2) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(i)).message(i2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_UnableToStartSecureChatAgain_GotIt_Button, DialogInterface$OnClickListenerC47459f.f119732a)).show();
    }

    /* renamed from: a */
    public final void mo166879a(String str, String str2, String str3) {
        Job unused = C69553g.m266944a(m188137a(), null, null, new C47455b(this, str, str2, str3, null), 3, null);
    }

    /* renamed from: a */
    public final void mo166877a(Context context, AskData aVar, Function0<Unit> function0) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Community_StartSecureChatWithMember_Text, "Member", aVar.mo166872c());
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "message");
        ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) ((UDInputDialogBuilder) new UDInputDialogBuilder(context).title(R.string.Lark_Community_StartSecureChat_Title)).message(mustacheFormat)).mo90906c(R.string.Lark_Community_LeaveAMessagePlaceholder).mo90900a(new C47460g(objectRef)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_StartSecureChat_Confirm_Button, new DialogInterface$OnClickListenerC47461h(this, aVar, objectRef, context))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_StartSecureChat_Cancel_Button, new DialogInterface$OnClickListenerC47462i(context, aVar))).onCancelListener(new DialogInterface$OnCancelListenerC47463j(aVar))).onDismissListener(new DialogInterface$OnDismissListenerC47464k(function0))).mo90903b(3).show();
        MomentsHitPointNew.Companion aVar2 = MomentsHitPointNew.f119721a;
        String a = aVar.mo166870a();
        if (a == null) {
            a = "none";
        }
        aVar2.mo166867c(a);
    }

    @Override // com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler
    public void observeRequestResult(LifecycleOwner lifecycleOwner, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f119726a.mo5923a(lifecycleOwner, new C47456c(this, context, function0, function02));
    }
}
