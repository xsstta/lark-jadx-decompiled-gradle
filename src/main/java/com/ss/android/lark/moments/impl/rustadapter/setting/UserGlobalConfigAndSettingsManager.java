package com.ss.android.lark.moments.impl.rustadapter.setting;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsResponse;
import com.bytedance.lark.pb.moments.v1.ManageMode;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.PushUserGlobalConfigAndSettingsLocalNotification;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.bytedance.lark.pb.moments.v1.UserCircleConfig;
import com.bytedance.lark.pb.moments.v1.UserSetting;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0004J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015J\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0011H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001fH@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010 \u001a\u0004\u0018\u00010!J)\u0010\"\u001a\u0004\u0018\u0001H#\"\u0004\b\u0000\u0010#2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H#0%H@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0011\u0010'\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0013\u0010(\u001a\u0004\u0018\u00010\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0011\u0010)\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0006\u0010*\u001a\u00020\u0017J\b\u0010+\u001a\u0004\u0018\u00010\u001fJ(\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0018\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f01J(\u00102\u001a\u00020-2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0002J\u001b\u00108\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010:H@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020-J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/ss/android/lark/moments/impl/rustadapter/setting/UserGlobalConfigAndSettingsManager;", "", "()V", "TAG", "", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "tabTitleChanges", "Landroidx/lifecycle/MutableLiveData;", "", "userCircleConfig", "Lcom/bytedance/lark/pb/moments/v1/UserCircleConfig;", "userSetting", "Lcom/bytedance/lark/pb/moments/v1/UserSetting;", "anonymityPolicy", "Lcom/bytedance/lark/pb/moments/v1/AnonymityPolicy;", "disableFollowing", "", "enableAskSecretChat", "getAnonymityPolicy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnonymousAvatarKey", "getAnonymousPolicy", "getCircleConfig", "getManagerMode", "Lcom/bytedance/lark/pb/moments/v1/ManageMode;", "getNicknameUser", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "getSafeData", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserGlobalConfigAndSettings", "getUserSetting", "isDisableFollowing", "isMuteRedDotNotify", "managerMode", "observeTabTitleChanges", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "onPushConfigChanged", "request", "", "sid", "isFromPipe", "offlinePush", "refreshNicknameUser", "momentUser", "Lcom/ss/android/lark/pb/moments_entities/MomentUser;", "(Lcom/ss/android/lark/pb/moments_entities/MomentUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshUserGlobalConfigAndSettings", "registerConfigPush", "unregisterConfigPush", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.g.c.a */
public final class UserGlobalConfigAndSettingsManager {

    /* renamed from: a */
    public static final UserGlobalConfigAndSettingsManager f120180a;

    /* renamed from: b */
    private static UserCircleConfig f120181b;

    /* renamed from: c */
    private static UserSetting f120182c;

    /* renamed from: d */
    private static final C1177w<Map<String, String>> f120183d = new C1177w<>();

    /* renamed from: e */
    private static final Lazy f120184e = LazyKt.lazy(C47662a.INSTANCE);

    /* renamed from: f */
    private static final CoroutineScope f120185f;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"isDisableFollowing", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {0}, mo239175l = {136}, mo239176m = "isDisableFollowing", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$f */
    public static final class C47667f extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UserGlobalConfigAndSettingsManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47667f(UserGlobalConfigAndSettingsManager aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo167307f(this);
        }
    }

    /* renamed from: j */
    private final ExecutorCoroutineDispatcher m188599j() {
        return (ExecutorCoroutineDispatcher) f120184e.getValue();
    }

    private UserGlobalConfigAndSettingsManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/AnonymityPolicy;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$b */
    static final /* synthetic */ class C47663b extends FunctionReference implements Function0<AnonymityPolicy> {
        C47663b(UserGlobalConfigAndSettingsManager aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "anonymityPolicy";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "anonymityPolicy()Lcom/bytedance/lark/pb/moments/v1/AnonymityPolicy;";
        }

        @Override // kotlin.jvm.functions.Function0
        public final AnonymityPolicy invoke() {
            return ((UserGlobalConfigAndSettingsManager) this.receiver).mo167309g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/moments/v1/ManageMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$c */
    public static final /* synthetic */ class C47664c extends FunctionReference implements Function0<ManageMode> {
        C47664c(UserGlobalConfigAndSettingsManager aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "managerMode";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "managerMode()Lcom/bytedance/lark/pb/moments/v1/ManageMode;";
        }

        @Override // kotlin.jvm.functions.Function0
        public final ManageMode invoke() {
            return ((UserGlobalConfigAndSettingsManager) this.receiver).mo167310h();
        }
    }

    /* renamed from: b */
    public final AnonymityPolicy mo167299b() {
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig != null) {
            return userCircleConfig.anonymity_policy;
        }
        return null;
    }

    /* renamed from: d */
    public final MomentUser mo167303d() {
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig != null) {
            return userCircleConfig.nickname_user;
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo167308f() {
        Boolean bool;
        UserSetting userSetting = f120182c;
        if (userSetting == null || (bool = userSetting.mute_red_dot_notify) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: g */
    public final AnonymityPolicy mo167309g() {
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig != null) {
            return userCircleConfig.anonymity_policy;
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$a */
    static final class C47662a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47662a INSTANCE = new C47662a();

        C47662a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-settings-config");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…-moment-settings-config\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$g */
    public static final /* synthetic */ class C47668g extends FunctionReference implements Function0<Boolean> {
        C47668g(UserGlobalConfigAndSettingsManager aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "disableFollowing";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "disableFollowing()Z";
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return ((UserGlobalConfigAndSettingsManager) this.receiver).mo167311i();
        }
    }

    /* renamed from: k */
    private final void m188600k() {
        C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_USER_GLOBAL_CONFIG_AND_SETTINGS_LOCAL_NOTIFICATION, new C47675d(new C47672k(this)));
    }

    /* renamed from: c */
    public final String mo167302c() {
        String str;
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig == null || (str = userCircleConfig.anonymous_avatar_key) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public final boolean mo167306e() {
        Boolean bool;
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig == null || (bool = userCircleConfig.can_ask_secret_chat) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: h */
    public final ManageMode mo167310h() {
        if (!MomentsDependencyHolder.f118998b.mo165901b().mo166493e()) {
            return ManageMode.BASIC;
        }
        UserCircleConfig userCircleConfig = f120181b;
        if (userCircleConfig != null) {
            return userCircleConfig.manage_mode;
        }
        return null;
    }

    /* renamed from: i */
    public final boolean mo167311i() {
        UserCircleConfig userCircleConfig;
        Boolean bool;
        if (!MomentsDependencyHolder.f118998b.mo165901b().mo166494f() || (userCircleConfig = f120181b) == null || (bool = userCircleConfig.disable_following) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    static {
        UserGlobalConfigAndSettingsManager aVar = new UserGlobalConfigAndSettingsManager();
        f120180a = aVar;
        f120185f = C69364ai.m266265a(cr.m266795a(null, 1, null).plus(aVar.m188599j()));
        aVar.m188600k();
    }

    /* renamed from: a */
    public final void mo167296a() {
        Job unused = C69553g.m266944a(f120185f, null, null, new C47671j(null), 3, null);
    }

    /* renamed from: c */
    public final Object mo167301c(Continuation<? super UserSetting> cVar) {
        return mo167295a(new C47674c(this), cVar);
    }

    /* renamed from: e */
    public final Object mo167305e(Continuation<? super ManageMode> cVar) {
        return mo167295a(new C47664c(this), cVar);
    }

    /* renamed from: a */
    public final Object mo167294a(Continuation<? super Boolean> cVar) {
        return C69388e.m266829a(m188599j(), new C47666e(null), cVar);
    }

    /* renamed from: b */
    public final Object mo167300b(Continuation<? super UserCircleConfig> cVar) {
        return mo167295a(new C47673b(this), cVar);
    }

    /* renamed from: d */
    public final Object mo167304d(Continuation<? super AnonymityPolicy> cVar) {
        return mo167295a(new C47663b(this), cVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager$getSafeData$2", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {0}, mo239175l = {146}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$d */
    public static final class C47665d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function0 $block;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47665d(Function0 function0, Continuation cVar) {
            super(2, cVar);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47665d dVar = new C47665d(this.$block, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Object obj) {
            return ((C47665d) create(ahVar, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.$block.invoke() == null) {
                    UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                    this.L$0 = ahVar;
                    this.label = 1;
                    if (aVar.mo167294a(this) == a) {
                        return a;
                    }
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.$block.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager$refreshUserGlobalConfigAndSettings$1", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {0}, mo239175l = {44}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$j */
    public static final class C47671j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47671j(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47671j jVar = new C47671j(cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47671j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                this.L$0 = ahVar;
                this.label = 1;
                if (aVar.mo167294a(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager$getUserGlobalConfigAndSettings$2", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {0}, mo239175l = {49}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$e */
    public static final class C47666e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47666e(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47666e eVar = new C47666e(cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Boolean> cVar) {
            return ((C47666e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167247c(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GetUserGlobalConfigAndSettingsResponse getUserGlobalConfigAndSettingsResponse = (GetUserGlobalConfigAndSettingsResponse) obj;
            if (getUserGlobalConfigAndSettingsResponse == null) {
                return C69089a.m265837a(false);
            }
            UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
            UserCircleConfig userCircleConfig = getUserGlobalConfigAndSettingsResponse.user_circle_config;
            if (userCircleConfig == null) {
                return C69089a.m265837a(false);
            }
            UserGlobalConfigAndSettingsManager.f120181b = userCircleConfig;
            UserGlobalConfigAndSettingsManager aVar2 = UserGlobalConfigAndSettingsManager.f120180a;
            UserGlobalConfigAndSettingsManager.f120182c = getUserGlobalConfigAndSettingsResponse.user_setting;
            return C69089a.m265837a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager$refreshNicknameUser$2", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$i */
    static final class C47670i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.ss.android.lark.pb.moments_entities.MomentUser $momentUser;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47670i(com.ss.android.lark.pb.moments_entities.MomentUser momentUser, Continuation cVar) {
            super(2, cVar);
            this.$momentUser = momentUser;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47670i iVar = new C47670i(this.$momentUser, cVar);
            iVar.p$ = (CoroutineScope) obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47670i) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UserCircleConfig.C18560a aVar;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                MomentUser a = new MomentUser.C18466a().mo63790a(MomentUser.Type.NICKNAME).mo63792a(this.$momentUser.muser_id).mo63794b(this.$momentUser.mname).mo63795c(this.$momentUser.mavatar_key).build();
                UserGlobalConfigAndSettingsManager aVar2 = UserGlobalConfigAndSettingsManager.f120180a;
                UserCircleConfig userCircleConfig = UserGlobalConfigAndSettingsManager.f120181b;
                if (userCircleConfig == null || (aVar = userCircleConfig.newBuilder()) == null) {
                    aVar = new UserCircleConfig.C18560a();
                }
                UserGlobalConfigAndSettingsManager aVar3 = UserGlobalConfigAndSettingsManager.f120180a;
                UserGlobalConfigAndSettingsManager.f120181b = aVar.mo64008a(a).build();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo167307f(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager.C47667f
            if (r0 == 0) goto L_0x0014
            r0 = r5
            com.ss.android.lark.moments.impl.g.c.a$f r0 = (com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager.C47667f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.moments.impl.g.c.a$f r0 = new com.ss.android.lark.moments.impl.g.c.a$f
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            com.ss.android.lark.moments.impl.g.c.a r0 = (com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager) r0
            kotlin.C69097g.m265891a(r5)
            goto L_0x004e
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0036:
            kotlin.C69097g.m265891a(r5)
            com.ss.android.lark.moments.impl.g.c.a$g r5 = new com.ss.android.lark.moments.impl.g.c.a$g
            r2 = r4
            com.ss.android.lark.moments.impl.g.c.a r2 = (com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager) r2
            r5.<init>(r2)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mo167295a(r5, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0057
            boolean r5 = r5.booleanValue()
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C69089a.m265837a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager.mo167307f(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager$onPushConfigChanged$1", mo239173f = "UserGlobalConfigAndSettingsManager.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$h */
    public static final class C47669h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $request;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47669h(byte[] bArr, Continuation cVar) {
            super(2, cVar);
            this.$request = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47669h hVar = new C47669h(this.$request, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47669h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            List<Tab> list;
            List<Tab> list2;
            Boolean bool;
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                PushUserGlobalConfigAndSettingsLocalNotification decode = PushUserGlobalConfigAndSettingsLocalNotification.ADAPTER.decode(this.$request);
                UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                UserGlobalConfigAndSettingsManager.f120182c = decode.user_setting;
                MomentsNotificationManager bVar = MomentsNotificationManager.f120258a;
                UserGlobalConfigAndSettingsManager aVar2 = UserGlobalConfigAndSettingsManager.f120180a;
                UserSetting userSetting = UserGlobalConfigAndSettingsManager.f120182c;
                if (userSetting == null || (bool = userSetting.mute_red_dot_notify) == null) {
                    z = true;
                } else {
                    z = bool.booleanValue();
                }
                bVar.mo167383a(z);
                Integer num = null;
                UserCircleConfig userCircleConfig = decode != null ? decode.user_circle_config : null;
                StringBuilder sb = new StringBuilder();
                sb.append("onPushConfigChanged tabs_size=");
                if (!(userCircleConfig == null || (list2 = userCircleConfig.tabs) == null)) {
                    num = C69089a.m265839a(list2.size());
                }
                sb.append(num);
                Log.m165389i("UserGlobalConfigAndSettingsManager", sb.toString());
                if (userCircleConfig == null) {
                    return Unit.INSTANCE;
                }
                HashMap hashMap = new HashMap();
                UserGlobalConfigAndSettingsManager aVar3 = UserGlobalConfigAndSettingsManager.f120180a;
                UserCircleConfig userCircleConfig2 = UserGlobalConfigAndSettingsManager.f120181b;
                if (!(userCircleConfig2 == null || (list = userCircleConfig2.tabs) == null)) {
                    for (T t : list) {
                        String str = t.id;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
                        String str2 = t.name;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "it.name");
                        hashMap.put(str, str2);
                        Log.m165389i("UserGlobalConfigAndSettingsManager", "origin onPushConfigChanged " + t.id + '-' + t.name);
                    }
                }
                UserGlobalConfigAndSettingsManager aVar4 = UserGlobalConfigAndSettingsManager.f120180a;
                UserGlobalConfigAndSettingsManager.f120181b = userCircleConfig;
                List<Tab> list3 = userCircleConfig.tabs;
                if (list3 == null) {
                    return Unit.INSTANCE;
                }
                HashMap hashMap2 = new HashMap();
                for (T t2 : list3) {
                    Log.m165389i("UserGlobalConfigAndSettingsManager", "new onPushConfigChanged " + t2.id + '-' + t2.name);
                    if (!Intrinsics.areEqual((String) hashMap.get(t2.id), t2.name)) {
                        String str3 = t2.id;
                        Intrinsics.checkExpressionValueIsNotNull(str3, "it.id");
                        String str4 = t2.name;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "it.name");
                        hashMap2.put(str3, str4);
                    }
                }
                if (!hashMap2.isEmpty()) {
                    UserGlobalConfigAndSettingsManager aVar5 = UserGlobalConfigAndSettingsManager.f120180a;
                    UserGlobalConfigAndSettingsManager.f120183d.mo5926a(hashMap2);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final Object mo167293a(com.ss.android.lark.pb.moments_entities.MomentUser momentUser, Continuation<? super Unit> cVar) {
        if (momentUser != null) {
            Object a = C69388e.m266829a(m188599j(), new C47670i(momentUser, null), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        } else if (momentUser == C69086a.m265828a()) {
            return momentUser;
        } else {
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ <T> Object mo167295a(Function0<? extends T> function0, Continuation<? super T> cVar) {
        return C69388e.m266829a(m188599j(), new C47665d(function0, null), cVar);
    }

    /* renamed from: a */
    public final void mo167297a(LifecycleOwner lifecycleOwner, AbstractC1178x<Map<String, String>> xVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120183d.mo5923a(lifecycleOwner, xVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f2\u0015\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e¢\u0006\u0002\b\u000f"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "request", "p2", "", "sid", "p3", "", "isFromPipe", "p4", "offlinePush", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.g.c.a$k */
    public static final /* synthetic */ class C47672k extends FunctionReference implements Function4<byte[], String, Boolean, Boolean, Unit> {
        C47672k(UserGlobalConfigAndSettingsManager aVar) {
            super(4, aVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onPushConfigChanged";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(UserGlobalConfigAndSettingsManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onPushConfigChanged([BLjava/lang/String;ZZ)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
            invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(bArr, "p1");
            Intrinsics.checkParameterIsNotNull(str, "p2");
            ((UserGlobalConfigAndSettingsManager) this.receiver).mo167298a(bArr, str, z, z2);
        }
    }

    /* renamed from: a */
    public final void mo167298a(byte[] bArr, String str, boolean z, boolean z2) {
        Job unused = C69553g.m266944a(f120185f, m188599j(), null, new C47669h(bArr, null), 2, null);
    }
}
