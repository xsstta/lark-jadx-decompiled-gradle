package com.ss.android.lark.main.app.widgets.tenant;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetAccountBadgeRequest;
import com.bytedance.lark.pb.basic.v1.GetAccountBadgeResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.IPushAccountBadgeListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ8\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u001eJ2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 J$\u0010!\u001a\u00020\u00142\u001a\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040 \u0018\u00010\u001eH\u0002J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0#J\u0016\u0010$\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\"\u0010%\u001a\u00020\u00142\u001a\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040 \u0018\u00010\u001eJ$\u0010&\u001a\u00020\u00142\u001a\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040 \u0018\u00010\u001eH\u0002J\u0006\u0010'\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\u0014J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010*\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\u0014J\u001e\u0010,\u001a\u00020\u00142\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 H\u0002J$\u0010.\u001a\u00020/2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040 2\u0006\u00100\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0011X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/main/app/widgets/tenant/TenantInfoUtils;", "", "()V", "DEFAULT_BADGE_COUNT", "", "OBJECT", "Ljava/lang/Object;", "getOBJECT", "()Ljava/lang/Object;", "TAG", "", "finalEntranceTenantInfoListener", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ITenantInfoListener;", "pushAccountBadgeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/biz/core/api/IPushAccountBadgeListener;", "tenantInfoListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "userId2Badge", "addPushAccountBadgeListener", "", "listener", "addTenantInfoListener", "fillTenantBadge", "tenantInfos", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "pendingUsers", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo$PendingUser;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "generateTenantInfos", "", "getAccountBadgeCount", "getTenantInfoListeners", "", "printTenantInfoList", "pullTenantsBadge", "registerAccountBadgePush", "registerFinalEntranceTenantInfoListener", "registerPush", "removePushAccountBadgeListener", "removeTenantInfoListener", "unRegisterFinalEntranceTenantInfoListener", "updateBadgeMap", "badgeMap", "userIdInMap", "", "userId", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.widgets.a.b */
public final class TenantInfoUtils {

    /* renamed from: a */
    public static final TenantInfoUtils f112730a = new TenantInfoUtils();

    /* renamed from: b */
    private static final Object f112731b = new Object();

    /* renamed from: c */
    private static final CopyOnWriteArrayList<IPushAccountBadgeListener> f112732c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<AbstractC49405t, Object> f112733d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, Integer> f112734e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final AbstractC49405t f112735f = C44421b.f112739a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/main/app/widgets/tenant/TenantInfoUtils$registerPush$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "map", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$f */
    public static final class C44426f implements IGetDataCallback<Map<String, ? extends Integer>> {
        C44426f() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.widgets.a.b$f$a */
        public static final class RunnableC44427a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Map f112745a;

            RunnableC44427a(Map map) {
                this.f112745a = map;
            }

            public final void run() {
                Log.m165389i("TenantInfoUtils", "push of tenant badge: " + this.f112745a);
                TenantInfoUtils bVar = TenantInfoUtils.f112730a;
                Iterator it = TenantInfoUtils.f112732c.iterator();
                while (it.hasNext()) {
                    ((IPushAccountBadgeListener) it.next()).mo105586a(this.f112745a);
                }
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TenantInfoUtils", "pull account badge failed!");
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Integer> map) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC44427a(map));
        }
    }

    private TenantInfoUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$a */
    public static final class RunnableC44419a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f112736a;

        /* renamed from: b */
        final /* synthetic */ List f112737b;

        RunnableC44419a(IGetDataCallback iGetDataCallback, List list) {
            this.f112736a = iGetDataCallback;
            this.f112737b = list;
        }

        public final void run() {
            TenantInfoUtils.f112730a.mo157789a(new IGetDataCallback<Map<String, ? extends Integer>>(this) {
                /* class com.ss.android.lark.main.app.widgets.tenant.TenantInfoUtils.RunnableC44419a.C444201 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44419a f112738a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f112738a = r1;
                }

                /* renamed from: a */
                public void onSuccess(Map<String, Integer> map) {
                    Intrinsics.checkParameterIsNotNull(map, "userId2Badge");
                    IGetDataCallback iGetDataCallback = this.f112738a.f112736a;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(TenantInfoUtils.f112730a.mo157787a(this.f112738a.f112737b, map));
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165383e("TenantInfoUtils", "pull tenant badge's count failed");
                    IGetDataCallback iGetDataCallback = this.f112738a.f112736a;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public final Set<AbstractC49405t> mo157799d() {
        Set<AbstractC49405t> keySet = f112733d.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "tenantInfoListeners.keys");
        return keySet;
    }

    /* renamed from: a */
    public final void mo157788a() {
        m176297b(new C44426f());
    }

    /* renamed from: b */
    public final void mo157795b() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        a.mo133188H().mo133410b(f112735f);
    }

    /* renamed from: c */
    public final void mo157798c() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        a.mo133188H().mo133403a(f112735f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/main/app/widgets/tenant/TenantInfoUtils$pullTenantsBadge$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$d */
    public static final class C44424d implements IGetDataCallback<Map<String, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f112743a;

        C44424d(IGetDataCallback iGetDataCallback) {
            this.f112743a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f112743a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Integer> map) {
            Log.m165389i("TenantInfoUtils", "pull tenant badge: " + map);
            TenantInfoUtils.f112730a.mo157794a(map);
            IGetDataCallback iGetDataCallback = this.f112743a;
            if (iGetDataCallback != null) {
                TenantInfoUtils bVar = TenantInfoUtils.f112730a;
                iGetDataCallback.onSuccess(TenantInfoUtils.f112734e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/main/app/widgets/tenant/TenantInfoUtils$registerAccountBadgePush$1", "Lcom/ss/android/lark/sdk/PushDispatcher$ISdkPushListener;", "onPush", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$e */
    public static final class C44425e implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f112744a;

        C44425e(IGetDataCallback iGetDataCallback) {
            this.f112744a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            TenantInfoUtils.f112730a.mo157794a(TenantInfoParser.f112729a.mo157786a(bArr));
            IGetDataCallback iGetDataCallback = this.f112744a;
            if (iGetDataCallback != null) {
                TenantInfoUtils bVar = TenantInfoUtils.f112730a;
                iGetDataCallback.onSuccess(TenantInfoUtils.f112734e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aD\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u0001 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$c */
    public static final class C44423c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C44423c f112742a = new C44423c();

        C44423c() {
        }

        /* renamed from: a */
        public final Map<String, Integer> parse(byte[] bArr) {
            GetAccountBadgeResponse decode = GetAccountBadgeResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                return decode.user_badge_map;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void mo157796b(IPushAccountBadgeListener aeVar) {
        Intrinsics.checkParameterIsNotNull(aeVar, "listener");
        f112732c.remove(aeVar);
    }

    /* renamed from: b */
    private final void m176297b(IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        C53248k.m205912a().mo181697a(Command.PUSH_ACCOUNT_BADGE_COUNT, new C44425e(iGetDataCallback));
    }

    /* renamed from: c */
    private final void m176299c(IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ACCOUNT_BADGE_COUNT, new GetAccountBadgeRequest.C14955a(), iGetDataCallback, C44423c.f112742a);
    }

    /* renamed from: a */
    public final void mo157789a(IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        m176299c(new C44424d(iGetDataCallback));
    }

    /* renamed from: b */
    public final void mo157797b(AbstractC49405t tVar) {
        Intrinsics.checkParameterIsNotNull(tVar, "listener");
        ConcurrentHashMap<AbstractC49405t, Object> concurrentHashMap = f112733d;
        if (concurrentHashMap.contains(tVar)) {
            concurrentHashMap.remove(tVar);
        }
    }

    /* renamed from: a */
    public final void mo157790a(IPushAccountBadgeListener aeVar) {
        Intrinsics.checkParameterIsNotNull(aeVar, "listener");
        f112732c.add(aeVar);
    }

    /* renamed from: a */
    public final void mo157791a(AbstractC49405t tVar) {
        Intrinsics.checkParameterIsNotNull(tVar, "listener");
        f112733d.put(tVar, f112731b);
    }

    /* renamed from: a */
    public final void mo157792a(List<? extends TenantInfo> list) {
        StringBuilder sb = new StringBuilder("push of tenant info, [");
        for (T t : list) {
            sb.append("{ tenantId:" + t.getTenantId() + ", badgeCount: " + t.getBadgeCount() + ", avatarKey: " + t.getAvatarUrl() + ", isSessionValid: " + t.isSessionValid() + ", isCurrentUser: " + t.isCurrentUser() + ", isNewUser: " + t.isNewUser() + " }  ");
        }
        sb.append("]");
        Log.m165389i("TenantInfoUtils", sb.toString());
    }

    /* renamed from: a */
    public final void mo157794a(Map<String, Integer> map) {
        if (map != null) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = f112734e;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            concurrentHashMap.putAll(map);
        }
    }

    /* renamed from: a */
    private final boolean m176295a(Map<String, Integer> map, String str) {
        if (!TextUtils.isEmpty(str)) {
            return map.containsKey(str);
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00032*\u0010\u0007\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "tenantInfos", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "kotlin.jvm.PlatformType", "", "pendingUsers", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo$PendingUser;", "onTenantInfoChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.a.b$b */
    static final class C44421b implements AbstractC49405t {

        /* renamed from: a */
        public static final C44421b f112739a = new C44421b();

        C44421b() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t
        public final void onTenantInfoChanged(final List<TenantInfo> list, final List<TenantInfo.PendingUser> list2) {
            TenantInfoUtils bVar = TenantInfoUtils.f112730a;
            Intrinsics.checkExpressionValueIsNotNull(list, "tenantInfos");
            Intrinsics.checkExpressionValueIsNotNull(list2, "pendingUsers");
            bVar.mo157793a(list, list2, new IGetDataCallback<List<? extends TenantInfo>>() {
                /* class com.ss.android.lark.main.app.widgets.tenant.TenantInfoUtils.C44421b.C444221 */

                /* renamed from: a */
                public void onSuccess(List<? extends TenantInfo> list) {
                    Intrinsics.checkParameterIsNotNull(list, "containsBadgeTenantInfos");
                    TenantInfoUtils.f112730a.mo157792a(list);
                    TenantInfoUtils bVar = TenantInfoUtils.f112730a;
                    for (AbstractC49405t tVar : TenantInfoUtils.f112733d.keySet()) {
                        tVar.onTenantInfoChanged(list, list2);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    TenantInfoUtils bVar = TenantInfoUtils.f112730a;
                    for (AbstractC49405t tVar : TenantInfoUtils.f112733d.keySet()) {
                        tVar.onTenantInfoChanged(list, list2);
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.lark.passport.signinsdk_api.account.TenantInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final List<TenantInfo> mo157787a(List<? extends TenantInfo> list, Map<String, Integer> map) {
        Integer num;
        if (list == 0 || map == null) {
            return new ArrayList();
        }
        for (TenantInfo tenantInfo : list) {
            if (tenantInfo != null) {
                TenantInfoUtils bVar = f112730a;
                String userId = tenantInfo.getUserId();
                Intrinsics.checkExpressionValueIsNotNull(userId, "userId");
                boolean a = bVar.m176295a(map, userId);
                int i = 0;
                if (a) {
                    num = map.get(tenantInfo.getUserId());
                } else {
                    num = 0;
                }
                if (num != null) {
                    i = num.intValue();
                }
                tenantInfo.setBadgeCount(i);
            }
        }
        return list;
    }

    /* renamed from: a */
    public final void mo157793a(List<? extends TenantInfo> list, List<? extends TenantInfo.PendingUser> list2, IGetDataCallback<List<TenantInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "tenantInfos");
        Intrinsics.checkParameterIsNotNull(list2, "pendingUsers");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC44419a(iGetDataCallback, list));
    }
}
