package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H$J\u001a\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0004J\b\u0010\u0011\u001a\u00020\u0007H$J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0004J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/CommonRNPreloadStrategy;", "Lcom/bytedance/ee/bear/document/offline/sync/AbsPreloadStrategy;", "()V", "mCountDownLatch", "Ljava/util/concurrent/CountDownLatch;", "mManualOfflineMap", "", "", "Lcom/bytedance/ee/bear/contract/BinderIPreloadCallback;", "mPreloadToken", "executeRNLoadCompletedData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "executeRNLoadCompletedInstruction", "objToken", "resultCode", "", "getRNLoadCompletedBinderName", "init", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "isResponseSuccessful", "", "mainObj", "Lorg/json/JSONObject;", "notifyRNPreloadData", "paramJson", "preload", "offlineDoc", "Lcom/bytedance/ee/bear/contract/offline/OfflineDoc;", "iPreloadCallback", "preloadSubBlock", "responseStr", "requestClientvar", "Lokhttp3/Response;", "LoadCompletedHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.sync.d */
public abstract class CommonRNPreloadStrategy extends AbstractC5982a {

    /* renamed from: k */
    private CountDownLatch f16777k;

    /* renamed from: l */
    public final Map<String, BinderIPreloadCallback> f16778l = new ConcurrentHashMap();

    /* renamed from: m */
    private String f16779m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo24226a();

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public Response mo24220a(OfflineDoc offlineDoc) {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "responseStr");
        Intrinsics.checkParameterIsNotNull(str2, "objToken");
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public boolean mo24225a(JSONObject jSONObject) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo24227b(String str);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.d$c */
    public static final class C5985c extends Lambda implements Function0 {
        final /* synthetic */ String $paramJson;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5985c(String str) {
            super(0);
            this.$paramJson = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40259b(this.$paramJson);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.d$b */
    static final class C5984b extends Lambda implements Function0 {
        final /* synthetic */ CommonRNPreloadStrategy this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5984b(CommonRNPreloadStrategy dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40252a(this.this$0.mo24226a(), new LoadCompletedHandler());
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.d$d */
    static final class RunnableC5986d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommonRNPreloadStrategy f16781a;

        /* renamed from: b */
        final /* synthetic */ String f16782b;

        RunnableC5986d(CommonRNPreloadStrategy dVar, String str) {
            this.f16781a = dVar;
            this.f16782b = str;
        }

        public final void run() {
            BinderIPreloadCallback binderIPreloadCallback = this.f16781a.f16778l.get(this.f16782b);
            if (binderIPreloadCallback != null) {
                C13479a.m54775e(this.f16781a.f16764a, "preload overtime !");
                binderIPreloadCallback.onPreloadFail(this.f16782b);
                this.f16781a.f16778l.remove(this.f16782b);
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/sync/CommonRNPreloadStrategy$LoadCompletedHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/document/offline/sync/CommonRNPreloadStrategy;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.sync.d$a */
    public final class LoadCompletedHandler implements AbstractC7945d<String> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LoadCompletedHandler() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            if (str == null) {
                C13479a.m54775e(CommonRNPreloadStrategy.this.f16764a, "LoadCompletedHandler()... data is null !");
            } else {
                CommonRNPreloadStrategy.this.mo24227b(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24229d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "paramJson");
        AbstractC68307f<String> a = ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40246a(new C5985c(str));
        if (a != null) {
            a.mo238036k();
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        Intrinsics.checkParameterIsNotNull(account, "account");
        super.mo24217a(account);
        AbstractC68307f<String> a = ((RnManager) KoinJavaComponent.m268613a(RnManager.class, null, null, 6, null)).mo40246a(new C5984b(this));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24228a(String str, int i) {
        BinderIPreloadCallback binderIPreloadCallback;
        CountDownLatch countDownLatch;
        if (TextUtils.equals(str, this.f16779m) && (countDownLatch = this.f16777k) != null) {
            countDownLatch.countDown();
        }
        if ((!this.f16778l.isEmpty()) && (binderIPreloadCallback = this.f16778l.get(str)) != null) {
            if (i == 0) {
                binderIPreloadCallback.onPreloadSuccess(str);
            } else {
                binderIPreloadCallback.onPreloadFail(str);
            }
            Map<String, BinderIPreloadCallback> map = this.f16778l;
            if (map != null) {
                BinderIPreloadCallback binderIPreloadCallback2 = (BinderIPreloadCallback) C69121n.m265993j(map).remove(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        }
        AbstractC5990h hVar = this.f16773j;
        if (hVar != null) {
            hVar.mo24233a(str, System.currentTimeMillis());
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
        Intrinsics.checkParameterIsNotNull(offlineDoc, "offlineDoc");
        String obj_token = offlineDoc.getObj_token();
        String str = this.f16764a;
        C13479a.m54764b(str, "preload()... objToken = " + C13598b.m55197d(obj_token));
        if (!TextUtils.isEmpty(obj_token)) {
            if (binderIPreloadCallback != null) {
                Map<String, BinderIPreloadCallback> map = this.f16778l;
                Intrinsics.checkExpressionValueIsNotNull(obj_token, "objToken");
                map.put(obj_token, binderIPreloadCallback);
                String jSONString = mo24216a(obj_token).toJSONString();
                Intrinsics.checkExpressionValueIsNotNull(jSONString, "getJSONObject(objToken).toJSONString()");
                mo24229d(jSONString);
                C13748k.m55733a(new RunnableC5986d(this, obj_token), C6002l.f16803a.longValue() * ((long) 1000));
                return;
            }
            this.f16779m = obj_token;
            String jSONString2 = mo24216a(obj_token).toJSONString();
            Intrinsics.checkExpressionValueIsNotNull(jSONString2, "getJSONObject(objToken).toJSONString()");
            mo24229d(jSONString2);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f16777k = countDownLatch;
                if (countDownLatch != null) {
                    Long l = C6002l.f16803a;
                    Intrinsics.checkExpressionValueIsNotNull(l, "PreloadManager.TIMEOUT");
                    countDownLatch.await(l.longValue(), TimeUnit.SECONDS);
                }
            } catch (InterruptedException e) {
                C13479a.m54761a(this.f16764a, e);
            }
        }
    }
}
