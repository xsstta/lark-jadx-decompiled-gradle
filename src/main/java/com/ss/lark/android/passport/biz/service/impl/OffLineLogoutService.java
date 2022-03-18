package com.ss.lark.android.passport.biz.service.impl;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.p2069j.p2070a.C40655v;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/OffLineLogoutService;", "", "()V", "MAX_RETRY_COUNT", "", "NEXT_TRY_DELAY_MS", "", "isInOfflineTask", "Ljava/util/concurrent/atomic/AtomicBoolean;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "mFuture", "Ljava/util/concurrent/ScheduledFuture;", "retryCounts", "Ljava/util/concurrent/atomic/AtomicInteger;", "appendLogoutTokens", "", "tokenList", "", "", "doInvokeOfflineTask", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getAllLogoutTokens", "loopOfflineLogoutTask", "runOfflineLogoutTaskReally", "stopTask", "updateLogoutTokens", "toBeRemovedTokens", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.service.impl.d */
public final class OffLineLogoutService {

    /* renamed from: a */
    public static final OffLineLogoutService f164281a = new OffLineLogoutService();

    /* renamed from: b */
    private static final AtomicBoolean f164282b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicInteger f164283c = new AtomicInteger(0);

    /* renamed from: d */
    private static volatile ScheduledFuture<?> f164284d;

    /* renamed from: e */
    private static final PassportLog f164285e = PassportLog.f123351c.mo171474a();

    private OffLineLogoutService() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.d$a */
    public static final class RunnableC65236a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UniContext f164286a;

        RunnableC65236a(UniContext uniContext) {
            this.f164286a = uniContext;
        }

        public final void run() {
            OffLineLogoutService.f164281a.mo224475b(this.f164286a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/OffLineLogoutService$runOfflineLogoutTaskReally$2", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.d$c */
    public static final class C65238c implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ List f164287a;

        /* renamed from: b */
        final /* synthetic */ UniContext f164288b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return BaseStepData.class;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.service.impl.d$c$a */
        static final class C65239a extends Lambda implements Function1<String, String> {
            public static final C65239a INSTANCE = new C65239a();

            C65239a() {
                super(1);
            }

            public final String invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                return MonitorUtil.m193717b(str);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            OffLineLogoutService dVar = OffLineLogoutService.f164281a;
            PassportLog passportLog = OffLineLogoutService.f164285e;
            StringBuilder sb = new StringBuilder();
            sb.append("retryCounts = ");
            OffLineLogoutService dVar2 = OffLineLogoutService.f164281a;
            sb.append(OffLineLogoutService.f164283c.get());
            passportLog.mo171471d("n_action_logout_offline_request_fail", sb.toString());
            OffLineLogoutService dVar3 = OffLineLogoutService.f164281a;
            if (OffLineLogoutService.f164283c.incrementAndGet() >= 10) {
                OffLineLogoutService dVar4 = OffLineLogoutService.f164281a;
                OffLineLogoutService.f164285e.mo171471d("n_action_logout_offline_fail", "retryCounts >= 10");
                OffLineLogoutService.f164281a.mo224471a();
                UniContext uniContext = this.f164288b;
                C40655v vVar = C40655v.f103212i;
                Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…OUT_OFFLINE_TASK_END_FAIL");
                WatcherHelper.m193666a(uniContext, vVar, null, 4, null);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            List<String> b = OffLineLogoutService.f164281a.mo224474b(this.f164287a);
            OffLineLogoutService dVar = OffLineLogoutService.f164281a;
            PassportLog passportLog = OffLineLogoutService.f164285e;
            StringBuilder sb = new StringBuilder();
            sb.append("token remainList.size = ");
            sb.append(b.size());
            sb.append(",retryCounts = ");
            OffLineLogoutService dVar2 = OffLineLogoutService.f164281a;
            sb.append(OffLineLogoutService.f164283c.get());
            passportLog.mo171465b("n_action_logout_offline_request_succ", sb.toString());
            OffLineLogoutService dVar3 = OffLineLogoutService.f164281a;
            PassportLog passportLog2 = OffLineLogoutService.f164285e;
            passportLog2.mo171465b("n_action_logout_offline_request_succ", "token remainList=" + CollectionsKt.joinToString$default(b, ",", "[", "]", 0, null, C65239a.INSTANCE, 24, null));
            List<String> list = b;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                OffLineLogoutService dVar4 = OffLineLogoutService.f164281a;
                OffLineLogoutService.f164285e.mo171460a("n_action_logout_offline_succ");
                OffLineLogoutService.f164281a.mo224471a();
                UniContext uniContext = this.f164288b;
                C40655v vVar = C40655v.f103211h;
                Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…OUT_OFFLINE_TASK_END_SUCC");
                WatcherHelper.m193666a(uniContext, vVar, null, 4, null);
                return;
            }
            OffLineLogoutService dVar5 = OffLineLogoutService.f164281a;
            if (OffLineLogoutService.f164283c.incrementAndGet() >= 10) {
                OffLineLogoutService dVar6 = OffLineLogoutService.f164281a;
                OffLineLogoutService.f164285e.mo171471d("n_action_logout_offline_fail", "retryCounts >= 10");
                OffLineLogoutService.f164281a.mo224471a();
                UniContext uniContext2 = this.f164288b;
                C40655v vVar2 = C40655v.f103212i;
                Intrinsics.checkExpressionValueIsNotNull(vVar2, "EPMClientPassportMonitor…OUT_OFFLINE_TASK_END_FAIL");
                WatcherHelper.m193666a(uniContext2, vVar2, null, 4, null);
            }
        }

        C65238c(List list, UniContext uniContext) {
            this.f164287a = list;
            this.f164288b = uniContext;
        }
    }

    /* renamed from: b */
    private final List<String> m256092b() {
        return (List) C49067a.m193335a(IsolateStorage.f123105c).mo171260d(UserGlobalKeys.f162501c, new ArrayList());
    }

    /* renamed from: a */
    public final synchronized void mo224471a() {
        try {
            ScheduledFuture<?> scheduledFuture = f164284d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            f164284d = null;
            f164282b.set(false);
            f164283c.set(0);
        } catch (Exception e) {
            PassportLog passportLog = f164285e;
            StringBuilder sb = new StringBuilder();
            sb.append("task stop exception: ");
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            sb.append(message);
            passportLog.mo171471d("n_action_logout_offline_fail", sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.d$b */
    public static final class C65237b extends Lambda implements Function1<String, String> {
        public static final C65237b INSTANCE = new C65237b();

        C65237b() {
            super(1);
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return MonitorUtil.m193717b(str);
        }
    }

    /* renamed from: a */
    public final void mo224472a(UniContext uniContext) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        List<String> b = m256092b();
        if (b == null || b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f164285e.mo171465b("n_action_logout_offline_start", "task return for tokenList empty");
        }
        if (f164282b.get()) {
            f164285e.mo171465b("n_action_logout_offline_start", "task return for task is running");
        } else {
            m256094c(uniContext);
        }
    }

    /* renamed from: c */
    private final synchronized void m256094c(UniContext uniContext) {
        if (f164284d != null) {
            f164285e.mo171465b("n_action_logout_offline_start", "task return for task is not null");
            return;
        }
        f164282b.set(true);
        f164283c.set(0);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        f164284d = coreThreadPool.getScheduleThreadPool().scheduleAtFixedRate(new RunnableC65236a(uniContext), 0, 30000, TimeUnit.MILLISECONDS);
        f164285e.mo171465b("n_action_logout_offline_start", "task start");
    }

    /* renamed from: b */
    public final synchronized List<String> mo224474b(List<String> list) {
        ArrayList arrayList;
        List<String> b = m256092b();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t)) {
                arrayList2.add(t);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : b) {
            if (!set.contains(t2)) {
                arrayList3.add(t2);
            }
        }
        arrayList = arrayList3;
        C49067a.m193335a(IsolateStorage.f123105c).mo171253b(UserGlobalKeys.f162501c, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo224473a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "tokenList");
        List<String> b = m256092b();
        if (b != null) {
            List f = C69121n.m265989f(b);
            f.addAll(list);
            C49067a.m193335a(IsolateStorage.f123105c).mo171253b(UserGlobalKeys.f162501c, f);
            PassportLog passportLog = f164285e;
            passportLog.mo171465b("n_action_logout_offline_append", "new appended tokenList size is  = " + list.size() + ", and all tokenList size is = " + f.size());
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ Exception -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ Exception -> 0x005c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo224475b(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r15) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.service.impl.OffLineLogoutService.mo224475b(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext):void");
    }
}
