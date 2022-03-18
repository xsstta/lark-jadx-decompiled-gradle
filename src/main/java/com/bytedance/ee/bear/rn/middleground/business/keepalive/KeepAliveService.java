package com.bytedance.ee.bear.rn.middleground.business.keepalive;

import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.rn.RnSyncManager;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/keepalive/KeepAliveService;", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback$Stub;", "mServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "aliveTimeOutRunnable", "Ljava/lang/Runnable;", "keepAliveRunnable", "mIsEnableKeepAlive", "", "mIsFileOpen", "getMServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "onReceiveData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "reset", "restartAliveTask", "statRnState", "isFileOpen", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class KeepAliveService extends BinderISendDataCallback.Stub {
    public static final Companion Companion = new Companion(null);
    public final Runnable aliveTimeOutRunnable = new RunnableC10719b(this);
    private final Runnable keepAliveRunnable = new RunnableC10720c(this);
    private boolean mIsEnableKeepAlive = C4211a.m17514a().mo16536a("spacekit.mobile.enable_keep_rn_alive", false);
    public boolean mIsFileOpen;
    private final C10917c mServiceContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/keepalive/KeepAliveService$Companion;", "", "()V", "ACTION", "", "TAG", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C10917c getMServiceContext() {
        return this.mServiceContext;
    }

    public final void reset() {
        C13479a.m54764b("KeepAliveService", "reset");
        C13748k.m55735c(this.keepAliveRunnable);
        C13748k.m55735c(this.aliveTimeOutRunnable);
    }

    public final void restartAliveTask() {
        if (this.mIsEnableKeepAlive) {
            reset();
            C13748k.m55733a(this.keepAliveRunnable, 60000);
            C13479a.m54764b("KeepAliveService", "restartAliveTask");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService$b */
    static final class RunnableC10719b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeepAliveService f28691a;

        RunnableC10719b(KeepAliveService keepAliveService) {
            this.f28691a = keepAliveService;
        }

        public final void run() {
            if (!this.f28691a.mIsFileOpen) {
                this.f28691a.reset();
                RnSyncManager.f28587a.mo40392g();
            } else {
                this.f28691a.restartAliveTask();
            }
            KeepAliveService keepAliveService = this.f28691a;
            keepAliveService.statRnState(keepAliveService.mIsFileOpen);
            C13479a.m54764b("KeepAliveService", "aliveTimeOutRunnable isFileOpen : " + this.f28691a.mIsFileOpen);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService$c */
    static final class RunnableC10720c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeepAliveService f28692a;

        RunnableC10720c(KeepAliveService keepAliveService) {
            this.f28692a = keepAliveService;
        }

        public final void run() {
            C13748k.m55733a(this.f28692a.aliveTimeOutRunnable, 15000);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((Object) "business", (Object) "base");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((Object) "operation", (Object) "processRunning");
                jSONObject.put((Object) Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONObject2);
                String jSONString = jSONObject.toJSONString();
                Intrinsics.checkExpressionValueIsNotNull(jSONString, "jsonObject.toJSONString()");
                RnSyncManager.m44275d(jSONString);
            } catch (Exception e) {
                C13479a.m54761a("KeepAliveService", e);
            }
            C13479a.m54764b("KeepAliveService", "keepAliveRunnable");
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5094ag.AbstractC5098d
    public void onReceiveData(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            if (Intrinsics.areEqual("confirmProcessRunning", JSONObject.parseObject(str).getString("action"))) {
                C13479a.m54764b("KeepAliveService", "handle()... ");
                restartAliveTask();
            }
        } catch (Exception e) {
            C13479a.m54761a("KeepAliveService", e);
        }
    }

    public final void statRnState(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("webview_open_state", str);
        hashMap.put("scm_version", ((AbstractC6158t) KoinJavaComponent.m268613a(AbstractC6158t.class, null, null, 6, null)).mo20315a());
        C5234y.m21391b().mo21079a("docs_rn_out_of_contact", hashMap);
    }

    public KeepAliveService(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "mServiceContext");
        this.mServiceContext = cVar;
        cVar.mo41508c(am.class).mo238020d(new Function<T, R>(this) {
            /* class com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService.C107131 */

            /* renamed from: a */
            final /* synthetic */ KeepAliveService f28686a;

            {
                this.f28686a = r1;
            }

            @Override // io.reactivex.functions.Function
            public /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(mo40528a((am) obj));
            }

            /* renamed from: a */
            public final boolean mo40528a(am amVar) {
                Intrinsics.checkParameterIsNotNull(amVar, "listDataService");
                amVar.registerChangeCallback(new SimpleListDataChangeCallback(this) {
                    /* class com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService.C107131.BinderC107141 */
                    final /* synthetic */ C107131 this$0;

                    @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
                    public void onFileClose() {
                        super.onFileClose();
                        this.this$0.f28686a.mIsFileOpen = false;
                    }

                    @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
                    public void onFileOpen() {
                        super.onFileOpen();
                        this.this$0.f28686a.mIsFileOpen = true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.this$0 = r1;
                    }
                });
                return true;
            }
        }).mo238001b(C107152.f28687a, C107163.f28688a);
        C13748k.m55732a(new Runnable(this) {
            /* class com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService.RunnableC107174 */

            /* renamed from: a */
            final /* synthetic */ KeepAliveService f28689a;

            {
                this.f28689a = r1;
            }

            public final void run() {
                AbstractC5238z j = C5102ai.m20872j();
                Intrinsics.checkExpressionValueIsNotNull(j, "DocumentSdkVisibleServiceImpl.getInstance()");
                j.mo20215g().mo5925a(new AbstractC1178x<Boolean>(this) {
                    /* class com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService.RunnableC107174.C107181 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC107174 f28690a;

                    {
                        this.f28690a = r1;
                    }

                    /* renamed from: a */
                    public final void onChanged(Boolean bool) {
                        if (bool != null && RnSyncManager.f28587a.mo40391f()) {
                            if (bool.booleanValue()) {
                                this.f28690a.f28689a.restartAliveTask();
                            } else {
                                this.f28690a.f28689a.reset();
                            }
                        }
                        C13479a.m54764b("KeepAliveService", "mForegroundLiveData   : " + bool + "    , isConnect : " + RnSyncManager.f28587a.mo40391f());
                    }
                });
            }
        });
    }
}
