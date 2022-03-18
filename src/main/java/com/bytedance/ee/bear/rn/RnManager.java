package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.p281e.AbstractC5167a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0007H&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH&J\u001e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0011H&J&\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$2\u0014\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010$0&H&J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0011H&J\u001e\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020)2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H&J\u0012\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0011H&J\b\u0010-\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0011H&J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnManager;", "", "isInit", "", "()Z", "isRnConnected", "addRnConnectStatusCallback", "", "iRnConnectStatus", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus;", "addWebViewCallback", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "close", "getRn", "Lcom/bytedance/ee/bear/contract/rn/IRn;", "getRnStatus", "", "init", "isReload", "initDocImpl", "iRn", "registSendDataCallback", "iSendDataCallback", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback;", "registerHandler", "handlerName", "jsHandler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "registerHandlerV2", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "removeRnConnectStatusCallback", "removeWebViewCallback", "sendDocRequest", "message", "sendDocRequestFlowableUntilJSBundleReady", "Lio/reactivex/Flowable;", "apply", "Lkotlin/Function0;", "sendRequest", "sendRequestV2", "Lcom/bytedance/ee/bear/jsbridge/v2/RNMessage;", "Lcom/bytedance/ee/bear/jsbridge/v2/RNCallback;", "setBaseAbsolutePath", "path", "showDevOptionsDialog", "unRegistSendDataCallback", "unregisterHandler", "unregisterHandlerV2", "rn-bridge-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.f */
public interface RnManager {
    /* renamed from: a */
    AbstractC68307f<String> mo40246a(Function0<? extends AbstractC68307f<String>> function0);

    /* renamed from: a */
    void mo40247a(BinderIRnConnectStatus binderIRnConnectStatus);

    /* renamed from: a */
    void mo40248a(BinderISendDataCallback binderISendDataCallback);

    /* renamed from: a */
    void mo40249a(AbstractC5167a aVar);

    /* renamed from: a */
    void mo40250a(AbstractC7947h hVar);

    /* renamed from: a */
    void mo40251a(String str);

    /* renamed from: a */
    void mo40252a(String str, AbstractC7945d<?> dVar);

    /* renamed from: a */
    void mo40253a(boolean z);

    /* renamed from: a */
    boolean mo40254a();

    /* renamed from: b */
    void mo40255b();

    /* renamed from: b */
    void mo40256b(BinderIRnConnectStatus binderIRnConnectStatus);

    /* renamed from: b */
    void mo40257b(BinderISendDataCallback binderISendDataCallback);

    /* renamed from: b */
    void mo40258b(AbstractC7947h hVar);

    /* renamed from: b */
    void mo40259b(String str);

    /* renamed from: c */
    void mo40260c();

    /* renamed from: c */
    void mo40261c(String str);

    /* renamed from: d */
    boolean mo40262d();

    /* renamed from: e */
    AbstractC5167a mo40263e();
}
