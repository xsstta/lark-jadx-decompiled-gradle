package com.ss.android.lark.moments.impl.mainview.badge;

import android.os.Looper;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.moments.v1.PushBadgeNotification;
import com.bytedance.lark.pb.moments.v1.UserSetting;
import com.huawei.hms.maps.model.CameraPosition;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IConnStateListener;
import com.ss.android.lark.moments.impl.mainview.tab.MomentsTabPageSpec;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsPassThroughService;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.pb.moments.PullMomentsTabNotificationResponse;
import com.ss.android.lark.pb.moments.PushMomentsTabNotificationRequest;
import com.ss.android.lark.pb.moments_entities.NotificationCount;
import com.ss.android.lark.sdk.C53248k;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ,\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0002J,\u0010$\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0002J\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0015J\u001c\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100,J\u0014\u0010(\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100,J\u0014\u0010-\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150,J\u0006\u0010.\u001a\u00020\u0018J\u0006\u0010/\u001a\u00020\u0018J\u0006\u00100\u001a\u00020\u0018J\b\u00101\u001a\u00020\u0018H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020\u0018H\u0002J\u0014\u00104\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100,J\u0014\u00105\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150,J\b\u00106\u001a\u00020\u0018H\u0002J\u001a\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u00020\u0015H\u0002J5\u00109\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010\u00122\b\u0010;\u001a\u0004\u0018\u00010\u00122\b\u00108\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u00102\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0018H\u0002J\f\u0010>\u001a\u00020\u0012*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/badge/MomentsNotificationManager;", "", "()V", "LOG_TAG", "", "connStateListener", "com/ss/android/lark/moments/impl/mainview/badge/MomentsNotificationManager$connStateListener$1", "Lcom/ss/android/lark/moments/impl/mainview/badge/MomentsNotificationManager$connStateListener$1;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "interactionNotification", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "lastPostTime", "", "lastReadTime", "newPostNotification", "", "readTimeReady", "clearAllData", "", "clearMessageCount", "clearNewPostNotification", "clearReactionCount", "getNotificationCountHitpoint", "", "handleNewPostNotificationPush", "request", "", "sid", "fromServerPipe", "offlinePush", "handleNotificationPush", "hasNewPostNotificationHitpoint", "muteNewPostNotificationChanged", "isMute", "observerInteraction", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observerNewPost", "onDestroy", "onReload", "onStart", "refreshNotification", "forceCover", "registerPush", "removeInteractionObserver", "removeNewPostObserver", "resetNotification", "showInteractionNotification", "notificationCount", "showNewPostNotification", "postTime", "readTime", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/pb/moments_entities/NotificationCount;Z)V", "unregisterPush", "toTime", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b */
public final class MomentsNotificationManager {

    /* renamed from: a */
    public static final MomentsNotificationManager f120258a = new MomentsNotificationManager();

    /* renamed from: b */
    private static final C1177w<NotificationCount> f120259b = new C1177w<>();

    /* renamed from: c */
    private static long f120260c;

    /* renamed from: d */
    private static long f120261d;

    /* renamed from: e */
    private static final C1177w<Boolean> f120262e = new C1177w<>();

    /* renamed from: f */
    private static boolean f120263f;

    /* renamed from: g */
    private static final Lazy f120264g = LazyKt.lazy(C47722c.INSTANCE);

    /* renamed from: h */
    private static final C47719b f120265h = new C47719b();

    /* renamed from: j */
    private final ExecutorCoroutineDispatcher m188703j() {
        return (ExecutorCoroutineDispatcher) f120264g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/mainview/badge/MomentsNotificationManager$connStateListener$1", "Lcom/ss/android/lark/moments/dependency/idependency/IConnStateListener;", "onConnStateChanged", "", "isConnected", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$b */
    public static final class C47719b implements IConnStateListener {
        C47719b() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$b$a */
        static final class RunnableC47720a implements Runnable {

            /* renamed from: a */
            public static final RunnableC47720a f120266a = new RunnableC47720a();

            RunnableC47720a() {
            }

            public final void run() {
                Looper.myQueue().addIdleHandler(C477211.f120267a);
            }
        }

        @Override // com.ss.android.lark.moments.dependency.idependency.IConnStateListener
        /* renamed from: a */
        public void mo165895a(boolean z) {
            if (z && MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments")) {
                UICallbackExecutor.execute(RunnableC47720a.f120266a);
            }
        }
    }

    private MomentsNotificationManager() {
    }

    /* renamed from: a */
    public final void mo167383a(boolean z) {
        Log.m165389i("MomentsNotificationManager", "muteNewPostNotificationChanged isMute=" + z);
        if (z) {
            f120262e.mo5926a((Boolean) false);
        } else {
            Job unused = C69553g.m266944a(GlobalScope.f173453a, m188703j(), null, new C47723d(null), 2, null);
        }
    }

    /* renamed from: a */
    public final void mo167382a(Long l, Long l2, NotificationCount notificationCount, boolean z) {
        Job unused = C69553g.m266944a(GlobalScope.f173453a, m188703j(), null, new C47727h(z, l, l2, notificationCount, null), 2, null);
    }

    /* renamed from: a */
    public final void mo167384a(byte[] bArr, String str, boolean z, boolean z2) {
        com.bytedance.lark.pb.moments.v1.NotificationCount notificationCount;
        Log.m165389i("MomentsNotificationManager", "onPushBadgeDataChanged");
        if (bArr != null && (notificationCount = PushBadgeNotification.ADAPTER.decode(bArr).notification_count) != null) {
            Intrinsics.checkExpressionValueIsNotNull(notificationCount, "PushBadgeNotification.AD…ification_count ?: return");
            m188694a(this, new NotificationCount(notificationCount.message_count, notificationCount.reaction_count, notificationCount.message_read_ts, notificationCount.reaction_read_ts), false, 2, null);
        }
    }

    /* renamed from: k */
    private final void m188704k() {
        m188705l();
        m188698b(true);
    }

    /* renamed from: g */
    public final void mo167394g() {
        m188698b(false);
    }

    /* renamed from: b */
    public final void mo167385b() {
        m188704k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$c */
    static final class C47722c extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47722c INSTANCE = new C47722c();

        C47722c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-notification-manager");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…nt-notification-manager\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    /* renamed from: n */
    private final void m188707n() {
        Log.m165389i("MomentsNotificationManager", "unregisterPushBadgeChangedListener");
        C53248k.m205912a().mo181696a(Command.MOMENTS_PUSH_BADGE_NOTIFICATION);
        C53248k.m205912a().mo181699a(com.ss.android.lark.pb.improto.Command.MOMENTS_PUSH_TAB_NOTIFICATION);
    }

    /* renamed from: c */
    public final void mo167388c() {
        m188707n();
        MomentsDependencyHolder.f118998b.mo165899a().wschannelDependency().mo144731b(f120265h);
    }

    /* renamed from: f */
    public final void mo167393f() {
        Job unused = C69553g.m266944a(GlobalScope.f173453a, m188703j(), null, new C47718a(null), 2, null);
    }

    /* renamed from: i */
    public final boolean mo167396i() {
        Boolean b = f120262e.mo5927b();
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    private final void m188705l() {
        C1177w<NotificationCount> wVar = f120259b;
        synchronized (wVar) {
            wVar.mo5926a(new NotificationCount(0, 0, "0", "0"));
            f120260c = 0;
            f120261d = 0;
            f120262e.mo5926a((Boolean) false);
            f120263f = false;
            Log.m165389i("MomentsNotificationManager", "clearAllData");
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: m */
    private final void m188706m() {
        Log.m165389i("MomentsNotificationManager", "registerPushBadgeChangedListener");
        MomentsNotificationManager bVar = this;
        C53248k.m205912a().mo181697a(Command.MOMENTS_PUSH_BADGE_NOTIFICATION, new C47728c(new C47725f(bVar)));
        C53248k.m205912a().mo181700a(com.ss.android.lark.pb.improto.Command.MOMENTS_PUSH_TAB_NOTIFICATION, new C47728c(new C47726g(bVar)));
    }

    /* renamed from: d */
    public final void mo167390d() {
        C1177w<NotificationCount> wVar = f120259b;
        synchronized (wVar) {
            NotificationCount b = wVar.mo5927b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "interactionNotification.…ue ?: return@synchronized");
                wVar.mo5926a(b.newBuilder().mo173759a((Integer) 0).build());
                Log.m165389i("MomentsNotificationManager", "clearMessageCount");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public final void mo167392e() {
        C1177w<NotificationCount> wVar = f120259b;
        synchronized (wVar) {
            NotificationCount b = wVar.mo5927b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "interactionNotification.…ue ?: return@synchronized");
                wVar.mo5926a(b.newBuilder().mo173762b((Integer) 0).build());
                Log.m165389i("MomentsNotificationManager", "clearReactionCount");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: h */
    public final int mo167395h() {
        NotificationCount b = f120259b.mo5927b();
        if (b == null) {
            return 0;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "interactionNotification.value ?: return 0");
        int intValue = b.mmessage_count.intValue();
        Integer num = b.mreaction_count;
        Intrinsics.checkExpressionValueIsNotNull(num, "notification.mreaction_count");
        return intValue + num.intValue();
    }

    /* renamed from: a */
    public final void mo167378a() {
        m188706m();
        m188704k();
        MomentsDependencyHolder.f118998b.mo165899a().wschannelDependency().mo144730a(f120265h);
    }

    /* renamed from: a */
    private final long m188691a(String str) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo167389c(AbstractC1178x<Boolean> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120262e.mo5925a(xVar);
    }

    /* renamed from: d */
    public final void mo167391d(AbstractC1178x<Boolean> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120262e.mo5928b(xVar);
    }

    /* renamed from: b */
    private final void m188698b(boolean z) {
        Job unused = C69553g.m266944a(GlobalScope.f173453a, m188703j(), null, new C47724e(z, null), 2, null);
    }

    /* renamed from: b */
    public final void mo167386b(AbstractC1178x<NotificationCount> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120259b.mo5928b(xVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager$clearNewPostNotification$1", mo239173f = "MomentsNotificationManager.kt", mo239174i = {0}, mo239175l = {CameraPosition.TILT_90}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$a */
    public static final class C47718a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47718a(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47718a aVar = new C47718a(cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47718a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsNotificationManager bVar = MomentsNotificationManager.f120258a;
                MomentsNotificationManager.f120262e.mo5926a(C69089a.m265837a(false));
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167203d(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Long l = (Long) obj;
            if (l != null) {
                long longValue = l.longValue();
                MomentsNotificationManager bVar2 = MomentsNotificationManager.f120258a;
                MomentsNotificationManager.f120263f = true;
                MomentsNotificationManager bVar3 = MomentsNotificationManager.f120258a;
                MomentsNotificationManager bVar4 = MomentsNotificationManager.f120258a;
                MomentsNotificationManager.f120261d = Math.max(longValue, MomentsNotificationManager.f120261d);
            }
            Log.m165389i("MomentsNotificationManager", "clearNewPostNotification");
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager$muteNewPostNotificationChanged$1", mo239173f = "MomentsNotificationManager.kt", mo239174i = {0}, mo239175l = {108}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$d */
    public static final class C47723d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47723d(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47723d dVar = new C47723d(cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47723d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Long l;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (!MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments")) {
                    return Unit.INSTANCE;
                }
                MomentsPassThroughService aVar = MomentsPassThroughService.f120127a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167204e(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PullMomentsTabNotificationResponse pullMomentsTabNotificationResponse = (PullMomentsTabNotificationResponse) obj;
            if (pullMomentsTabNotificationResponse != null) {
                MomentsNotificationManager bVar = MomentsNotificationManager.f120258a;
                MomentsNotificationManager.f120263f = true;
            }
            MomentsNotificationManager bVar2 = MomentsNotificationManager.f120258a;
            Long l2 = null;
            if (pullMomentsTabNotificationResponse != null) {
                l = pullMomentsTabNotificationResponse.mlast_post_timestamp;
            } else {
                l = null;
            }
            if (pullMomentsTabNotificationResponse != null) {
                l2 = pullMomentsTabNotificationResponse.mread_post_timestamp;
            }
            MomentsNotificationManager bVar3 = MomentsNotificationManager.f120258a;
            bVar2.mo167382a(l, l2, (NotificationCount) MomentsNotificationManager.f120259b.mo5927b(), true);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager$refreshNotification$1", mo239173f = "MomentsNotificationManager.kt", mo239174i = {0, 1, 1, 2, 2}, mo239175l = {159, 162, 165}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "notificationCount", "$this$launch", "notificationCount"}, mo239178s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$e */
    public static final class C47724e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $forceCover;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47724e(boolean z, Continuation cVar) {
            super(2, cVar);
            this.$forceCover = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47724e eVar = new C47724e(this.$forceCover, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47724e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 188
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager.C47724e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager$showNewPostNotification$1", mo239173f = "MomentsNotificationManager.kt", mo239174i = {0}, mo239175l = {201}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$h */
    public static final class C47727h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $forceCover;
        final /* synthetic */ NotificationCount $notificationCount;
        final /* synthetic */ Long $postTime;
        final /* synthetic */ Long $readTime;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47727h(boolean z, Long l, Long l2, NotificationCount notificationCount, Continuation cVar) {
            super(2, cVar);
            this.$forceCover = z;
            this.$postTime = l;
            this.$readTime = l2;
            this.$notificationCount = notificationCount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47727h hVar = new C47727h(this.$forceCover, this.$postTime, this.$readTime, this.$notificationCount, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47727h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool;
            NotificationCount notificationCount;
            Integer num;
            Integer num2;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (!MomentsDependencyHolder.f118998b.mo165901b().mo166489a()) {
                    MomentsNotificationManager bVar = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager.f120262e.mo5926a(C69089a.m265837a(false));
                    return Unit.INSTANCE;
                }
                UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167301c(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserSetting userSetting = (UserSetting) obj;
            if (userSetting != null) {
                bool = userSetting.mute_red_dot_notify;
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual(bool, C69089a.m265837a(true))) {
                return Unit.INSTANCE;
            }
            if (this.$forceCover) {
                Long l = this.$postTime;
                if (l != null) {
                    long longValue = l.longValue();
                    MomentsNotificationManager bVar2 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager.f120260c = longValue;
                }
                Long l2 = this.$readTime;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    MomentsNotificationManager bVar3 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager.f120261d = longValue2;
                }
            } else {
                Long l3 = this.$postTime;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    MomentsNotificationManager bVar4 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager bVar5 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager.f120260c = Math.max(longValue3, MomentsNotificationManager.f120260c);
                }
                Long l4 = this.$readTime;
                if (l4 != null) {
                    long longValue4 = l4.longValue();
                    MomentsNotificationManager bVar6 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager bVar7 = MomentsNotificationManager.f120258a;
                    MomentsNotificationManager.f120261d = Math.max(longValue4, MomentsNotificationManager.f120261d);
                }
            }
            if (!MomentsTabPageSpec.f120325e.mo167455a()) {
                MomentsNotificationManager bVar8 = MomentsNotificationManager.f120258a;
                long j = MomentsNotificationManager.f120260c;
                MomentsNotificationManager bVar9 = MomentsNotificationManager.f120258a;
                if (j > MomentsNotificationManager.f120261d && ((notificationCount = this.$notificationCount) == null || ((num = notificationCount.mmessage_count) != null && num.intValue() == 0 && (num2 = this.$notificationCount.mreaction_count) != null && num2.intValue() == 0))) {
                    MomentsNotificationManager bVar10 = MomentsNotificationManager.f120258a;
                    if (MomentsNotificationManager.f120263f) {
                        z = true;
                    }
                }
            }
            MomentsNotificationManager bVar11 = MomentsNotificationManager.f120258a;
            MomentsNotificationManager.f120262e.mo5926a(C69089a.m265837a(z));
            Log.m165389i("MomentsNotificationManager", "showNewPostNotification needShow=" + z);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo167380a(AbstractC1178x<NotificationCount> xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120259b.mo5925a(xVar);
    }

    /* renamed from: a */
    public final void mo167379a(LifecycleOwner lifecycleOwner, AbstractC1178x<NotificationCount> xVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        f120259b.mo5923a(lifecycleOwner, xVar);
    }

    /* renamed from: a */
    public final void mo167381a(NotificationCount notificationCount, boolean z) {
        C1177w<NotificationCount> wVar = f120259b;
        synchronized (wVar) {
            NotificationCount b = wVar.mo5927b();
            if (!z) {
                if (b != null) {
                    NotificationCount.C49988a newBuilder = notificationCount.newBuilder();
                    MomentsNotificationManager bVar = f120258a;
                    String str = notificationCount.mmessage_read_ts;
                    Intrinsics.checkExpressionValueIsNotNull(str, "notificationCount.mmessage_read_ts");
                    long a = bVar.m188691a(str);
                    String str2 = b.mmessage_read_ts;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "lastCount.mmessage_read_ts");
                    if (a < bVar.m188691a(str2)) {
                        newBuilder.mo173759a(b.mmessage_count).mo173760a(b.mmessage_read_ts);
                    }
                    String str3 = notificationCount.mreaction_read_ts;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "notificationCount.mreaction_read_ts");
                    long a2 = bVar.m188691a(str3);
                    String str4 = b.mreaction_read_ts;
                    Intrinsics.checkExpressionValueIsNotNull(str4, "lastCount.mreaction_read_ts");
                    if (a2 < bVar.m188691a(str4)) {
                        newBuilder.mo173762b(b.mreaction_count).mo173763b(b.mreaction_read_ts);
                    }
                    NotificationCount a3 = newBuilder.build();
                    wVar.mo5926a(a3);
                    Log.m165389i("MomentsNotificationManager", "showInteractionNotification count=" + a3);
                    Unit unit = Unit.INSTANCE;
                }
            }
            wVar.mo5926a(notificationCount);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0017\u0010\u0007\u001a\u0013\u0018\u00010\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f2\u0015\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e¢\u0006\u0002\b\u000f"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "request", "p2", "", "sid", "p3", "", "fromServerPipe", "p4", "offlinePush", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$f */
    public static final /* synthetic */ class C47725f extends FunctionReference implements Function4<byte[], String, Boolean, Boolean, Unit> {
        C47725f(MomentsNotificationManager bVar) {
            super(4, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleNotificationPush";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MomentsNotificationManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleNotificationPush([BLjava/lang/String;ZZ)V";
        }

        public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
            ((MomentsNotificationManager) this.receiver).mo167384a(bArr, str, z, z2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
            invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0017\u0010\u0007\u001a\u0013\u0018\u00010\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f2\u0015\u0010\r\u001a\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000e¢\u0006\u0002\b\u000f"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "request", "p2", "", "sid", "p3", "", "fromServerPipe", "p4", "offlinePush", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.badge.b$g */
    public static final /* synthetic */ class C47726g extends FunctionReference implements Function4<byte[], String, Boolean, Boolean, Unit> {
        C47726g(MomentsNotificationManager bVar) {
            super(4, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleNewPostNotificationPush";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MomentsNotificationManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleNewPostNotificationPush([BLjava/lang/String;ZZ)V";
        }

        public final void invoke(byte[] bArr, String str, boolean z, boolean z2) {
            ((MomentsNotificationManager) this.receiver).mo167387b(bArr, str, z, z2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(byte[] bArr, String str, Boolean bool, Boolean bool2) {
            invoke(bArr, str, bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo167387b(byte[] bArr, String str, boolean z, boolean z2) {
        Long l;
        Log.m165389i("MomentsNotificationManager", "onPushNewPostNotification");
        if (bArr != null) {
            PushMomentsTabNotificationRequest decode = PushMomentsTabNotificationRequest.ADAPTER.decode(bArr);
            if (decode != null && ((l = decode.mread_post_timestamp) == null || l.longValue() != 0)) {
                f120263f = true;
            }
            m188695a(this, decode.mlast_post_timestamp, decode.mread_post_timestamp, f120259b.mo5927b(), false, 8, null);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m188694a(MomentsNotificationManager bVar, NotificationCount notificationCount, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bVar.mo167381a(notificationCount, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m188695a(MomentsNotificationManager bVar, Long l, Long l2, NotificationCount notificationCount, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        bVar.mo167382a(l, l2, notificationCount, z);
    }
}
