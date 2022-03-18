package com.ss.lark.android.passport.biz.compat.tenant;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.p2421a.AbstractC49005b;
import com.ss.android.lark.passport.infra.service.AbstractC49129o;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.AbstractC49372a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.lark.android.passport.biz.utils.UserListFetcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@ClaymoreImpl(AbstractC49129o.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J0\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#H\u0002J\b\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0$H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\b\u0010,\u001a\u00020\u0010H\u0002J\u001c\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0002J\b\u00103\u001a\u00020\u0004H\u0002J.\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u00010/2\b\u00106\u001a\u0004\u0018\u00010/2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010#H\u0016J\u0012\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\u0012\u0010:\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010;\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/tenant/TenantManageServiceCompat;", "Lcom/ss/android/lark/passport/infra/service/ITenantManageServiceCompat;", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "listeners", "", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ITenantInfoListener;", "onPushMineChangedListener", "Lcom/ss/android/lark/passport/infra/callbacks/IPushMineChangedListener;", "getOnPushMineChangedListener", "()Lcom/ss/android/lark/passport/infra/callbacks/IPushMineChangedListener;", "onPushMineChangedListener$delegate", "Lkotlin/Lazy;", "onPushUserListChangeListener", "Lkotlin/Function0;", "", "getOnPushUserListChangeListener", "()Lkotlin/jvm/functions/Function0;", "onPushUserListChangeListener$delegate", "onUserListChangeListener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "getOnUserListChangeListener", "()Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "onUserListChangeListener$delegate", "tenants", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "dispatchTenantInfoChanged", "fetchUserList", ShareHitPoint.f121868c, "Lcom/ss/android/lark/passport/infra/service/IUserListService$UserLoginSource;", "handleToast", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getLocalAccountUserCount", "", "getPendingUsers", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo$PendingUser;", "getTenantData", "init", "initExecutorIfNeeded", "loge", "msg", "", "throwable", "", "logi", "newExecutor", "refreshTenantData", "contextId", "userId", "registerTenantInfoListener", "listener", "unInit", "unRegisterTenantInfoListener", "updateTenantInfo", "tenantInfo", "users", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TenantManageServiceCompat implements AbstractC49129o {
    public static final Companion Companion = new Companion(null);
    private ExecutorService executor = newExecutor();
    public final Set<AbstractC49405t> listeners = new LinkedHashSet();
    private final Lazy onPushMineChangedListener$delegate = LazyKt.lazy(new C64464c(this));
    private final Lazy onPushUserListChangeListener$delegate = LazyKt.lazy(new C64466d(this));
    private final Lazy onUserListChangeListener$delegate = LazyKt.lazy(new C64468e(this));
    public final CopyOnWriteArrayList<TenantInfo> tenants = new CopyOnWriteArrayList<>();

    private final AbstractC49005b getOnPushMineChangedListener() {
        return (AbstractC49005b) this.onPushMineChangedListener$delegate.getValue();
    }

    private final Function0<Unit> getOnPushUserListChangeListener() {
        return (Function0) this.onPushUserListChangeListener$delegate.getValue();
    }

    private final AbstractC49372a getOnUserListChangeListener() {
        return (AbstractC49372a) this.onUserListChangeListener$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/tenant/TenantManageServiceCompat$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/callbacks/IPushMineChangedListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$c */
    static final class C64464c extends Lambda implements Function0<AbstractC49005b> {
        final /* synthetic */ TenantManageServiceCompat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64464c(TenantManageServiceCompat tenantManageServiceCompat) {
            super(0);
            this.this$0 = tenantManageServiceCompat;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC49005b invoke() {
            return new AbstractC49005b(this) {
                /* class com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat.C64464c.C644651 */

                /* renamed from: a */
                final /* synthetic */ C64464c f162783a;

                {
                    this.f162783a = r1;
                }

                @Override // com.ss.android.lark.passport.infra.p2421a.AbstractC49005b
                /* renamed from: a */
                public final void mo171105a(TenantInfo tenantInfo) {
                    this.f162783a.this$0.logi("receive mine changed push, fetch");
                    TenantManageServiceCompat.fetchUserList$default(this.f162783a.this$0, IUserListService.UserLoginSource.ByOnPushFetch, false, null, 4, null);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$e */
    static final class C64468e extends Lambda implements Function0<AbstractC49372a> {
        final /* synthetic */ TenantManageServiceCompat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64468e(TenantManageServiceCompat tenantManageServiceCompat) {
            super(0);
            this.this$0 = tenantManageServiceCompat;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC49372a invoke() {
            return new AbstractC49372a(this) {
                /* class com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat.C64468e.C644691 */

                /* renamed from: a */
                final /* synthetic */ C64468e f162784a;

                {
                    this.f162784a = r1;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.AbstractC49372a
                /* renamed from: a */
                public final void mo171426a(List<? extends User> list) {
                    Intrinsics.checkParameterIsNotNull(list, "it");
                    this.f162784a.this$0.updateTenantInfo(list);
                }
            };
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public List<TenantInfo.PendingUser> getPendingUsers() {
        return CollectionsKt.emptyList();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$d */
    public static final class C64466d extends Lambda implements Function0<Function0<? extends Unit>> {
        final /* synthetic */ TenantManageServiceCompat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64466d(TenantManageServiceCompat tenantManageServiceCompat) {
            super(0);
            this.this$0 = tenantManageServiceCompat;
        }

        /* Return type fixed from 'kotlin.jvm.functions.Function0<kotlin.Unit>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Function0<? extends Unit> invoke() {
            return new Function0<Unit>(this) {
                /* class com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat.C64466d.C644671 */
                final /* synthetic */ C64466d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.logi("receive user list changed push, fetch");
                    TenantManageServiceCompat.fetchUserList$default(this.this$0.this$0, IUserListService.UserLoginSource.ByOnPushFetch, false, null, 4, null);
                }
            };
        }
    }

    private final void initExecutorIfNeeded() {
        if (this.executor.isShutdown()) {
            this.executor = newExecutor();
        }
    }

    private final ExecutorService newExecutor() {
        ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("TenantChangeDispatcher");
        Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…\"TenantChangeDispatcher\")");
        return newSerialIODensityThreadPool;
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public int getLocalAccountUserCount() {
        return ServiceFinder.m193744a().getAllValidUserList().size();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public List<TenantInfo> getTenantData() {
        List<TenantInfo> mutableList;
        synchronized (this) {
            mutableList = CollectionsKt.toMutableList((Collection) this.tenants);
        }
        return mutableList;
    }

    private final void dispatchTenantInfoChanged() {
        if (!this.executor.isShutdown()) {
            this.executor.submit(new RunnableC64463b(this));
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public void unInit() {
        logi("manager uninit");
        this.executor.shutdownNow();
        ServiceFinder.m193747b().unregisterUserListChangeListener(getOnUserListChangeListener());
        TenantPush.m253346b(getOnPushUserListChangeListener());
        ServiceFinder.m193752g().unRegisterMineChangedListener(getOnPushMineChangedListener());
        synchronized (this) {
            this.tenants.clear();
            this.listeners.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public void init() {
        logi("manager init");
        initExecutorIfNeeded();
        ServiceFinder.m193747b().registerUserListChangeListener(getOnUserListChangeListener());
        TenantPush.m253345a(getOnPushUserListChangeListener());
        ServiceFinder.m193752g().registerMineChangedListener(getOnPushMineChangedListener());
        synchronized (this) {
            this.listeners.clear();
            List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
            Intrinsics.checkExpressionValueIsNotNull(allUserList, "ServiceFinder.userListService.allUserList");
            updateTenantInfo(allUserList);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$b */
    public static final class RunnableC64463b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TenantManageServiceCompat f162782a;

        RunnableC64463b(TenantManageServiceCompat tenantManageServiceCompat) {
            this.f162782a = tenantManageServiceCompat;
        }

        public final void run() {
            Object obj;
            ArrayList<AbstractC49405t> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            synchronized (this.f162782a) {
                arrayList.addAll(this.f162782a.listeners);
                arrayList2.addAll(this.f162782a.tenants);
            }
            TenantManageServiceCompat tenantManageServiceCompat = this.f162782a;
            StringBuilder sb = new StringBuilder();
            sb.append("begin dispatch change event, tenantIds: ");
            ArrayList<TenantInfo> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (TenantInfo tenantInfo : arrayList3) {
                arrayList4.add(tenantInfo.getTenantId());
            }
            sb.append(arrayList4);
            sb.append(", listeners: ");
            sb.append(arrayList.size());
            tenantManageServiceCompat.logi(sb.toString());
            for (AbstractC49405t tVar : arrayList) {
                try {
                    Result.Companion aVar = Result.Companion;
                    tVar.onTenantInfoChanged(arrayList2, CollectionsKt.emptyList());
                    obj = Result.m271569constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                Throwable r2 = Result.m271572exceptionOrNullimpl(obj);
                if (r2 != null) {
                    this.f162782a.loge("dispatch failed", r2);
                }
            }
            this.f162782a.logi("dispatch change event end");
        }
    }

    public final void logi(String str) {
        PassportLog.f123351c.mo171474a().mo171465b("TenantManageServiceCompat", str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/lark/android/passport/biz/compat/tenant/TenantManageServiceCompat$refreshTenantData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat$f */
    public static final class C64470f implements IGetDataCallback<List<? extends User>> {

        /* renamed from: a */
        final /* synthetic */ TenantManageServiceCompat f162785a;

        /* renamed from: b */
        final /* synthetic */ String f162786b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f162787c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            TenantManageServiceCompat tenantManageServiceCompat = this.f162785a;
            tenantManageServiceCompat.loge("fetch user list error, " + errorResult, errorResult);
            IGetDataCallback iGetDataCallback = this.f162787c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(List<? extends User> list) {
            boolean z;
            T t;
            T t2;
            String str = this.f162786b;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            TenantInfo tenantInfo = null;
            if (z) {
                this.f162785a.logi("user id not provided");
            } else {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (Intrinsics.areEqual(t2.userId, this.f162786b)) {
                            break;
                        }
                    }
                    t = t2;
                } else {
                    t = null;
                }
                if (t != null) {
                    IUserListService a = ServiceFinder.m193744a();
                    tenantInfo = TenantInfo.fromUser(t, Intrinsics.areEqual(a.getForegroundUser(), t), a.isUserHasValidSession(t.userId));
                } else {
                    TenantManageServiceCompat.loge$default(this.f162785a, "user: " + this.f162786b + " not found", null, 2, null);
                }
            }
            this.f162785a.logi("refresh tenant: " + tenantInfo);
            IGetDataCallback iGetDataCallback = this.f162787c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(tenantInfo);
            }
        }

        C64470f(TenantManageServiceCompat tenantManageServiceCompat, String str, IGetDataCallback iGetDataCallback) {
            this.f162785a = tenantManageServiceCompat;
            this.f162786b = str;
            this.f162787c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public void registerTenantInfoListener(AbstractC49405t tVar) {
        if (tVar != null) {
            synchronized (this) {
                this.listeners.add(tVar);
                logi("after registerTenantInfoListener, size: " + this.listeners.size());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public void unRegisterTenantInfoListener(AbstractC49405t tVar) {
        if (tVar != null) {
            synchronized (this) {
                this.listeners.remove(tVar);
                logi("after unregisterTenantInfoListener, size: " + this.listeners.size());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public void updateTenantInfo(TenantInfo tenantInfo) {
        T t;
        if (tenantInfo != null) {
            synchronized (this) {
                Iterator<T> it = this.tenants.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    if (Intrinsics.areEqual(t2.getUserId(), tenantInfo.getUserId())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t3.setConfigEnv(tenantInfo.getConfigEnv());
                    t3.setUserUnit(tenantInfo.getUserUnit());
                    t3.setTenantTag(tenantInfo.getTenantTag());
                    t3.setAccountSecurityConfig(tenantInfo.getAccountSecurityConfig());
                } else {
                    loge$default(this, "update single tenant info, user not found, userId: " + tenantInfo.getUserId(), null, 2, null);
                }
                dispatchTenantInfoChanged();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void updateTenantInfo(List<? extends User> list) {
        String str;
        synchronized (this) {
            User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
            if (foregroundUser != null) {
                str = foregroundUser.userId;
            } else {
                str = null;
            }
            this.tenants.clear();
            CopyOnWriteArrayList<TenantInfo> copyOnWriteArrayList = this.tenants;
            List<? extends User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                arrayList.add(TenantInfo.fromUser(t, Intrinsics.areEqual(t.userId, str), ServiceFinder.m193744a().isUserHasValidSession(t.userId)));
            }
            copyOnWriteArrayList.addAll(arrayList);
            logi("tenants updated, tenants: " + this.tenants);
            dispatchTenantInfoChanged();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void loge(String str, Throwable th) {
        if (th != null) {
            PassportLog.f123351c.mo171474a().mo171462a("TenantManageServiceCompat", str, th);
        } else {
            PassportLog.f123351c.mo171474a().mo171471d("TenantManageServiceCompat", str);
        }
    }

    private final void fetchUserList(IUserListService.UserLoginSource userLoginSource, boolean z, IGetDataCallback<List<User>> iGetDataCallback) {
        UserListFetcher.m256144a(userLoginSource, z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49129o
    public void refreshTenantData(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback) {
        logi("refresh tenant: contextId: " + str + ", userId: " + str2);
        fetchUserList(IUserListService.UserLoginSource.ByPull, true, new C64470f(this, str2, iGetDataCallback));
    }

    static /* synthetic */ void loge$default(TenantManageServiceCompat tenantManageServiceCompat, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        tenantManageServiceCompat.loge(str, th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.lark.android.passport.biz.compat.tenant.TenantManageServiceCompat */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void fetchUserList$default(TenantManageServiceCompat tenantManageServiceCompat, IUserListService.UserLoginSource userLoginSource, boolean z, IGetDataCallback iGetDataCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            iGetDataCallback = null;
        }
        tenantManageServiceCompat.fetchUserList(userLoginSource, z, iGetDataCallback);
    }
}
