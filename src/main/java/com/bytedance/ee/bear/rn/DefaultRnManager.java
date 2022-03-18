package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.p281e.AbstractC5167a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0012H\u0016J&\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\u0014\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%0'H\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u001e\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020*2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010.\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/rn/DefaultRnManager;", "Lcom/bytedance/ee/bear/rn/RnManager;", "()V", "isInit", "", "()Z", "isRnConnected", "addRnConnectStatusCallback", "", "iRnConnectStatus", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus;", "addWebViewCallback", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "close", "getRn", "Lcom/bytedance/ee/bear/contract/rn/IRn;", "getRnStatus", "", "init", "isReload", "initDocImpl", "iRn", "registSendDataCallback", "iSendDataCallback", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback;", "registerHandler", "handlerName", "jsHandler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "registerHandlerV2", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "removeRnConnectStatusCallback", "removeWebViewCallback", "sendDocRequest", "message", "sendDocRequestFlowableUntilJSBundleReady", "Lio/reactivex/Flowable;", "apply", "Lkotlin/Function0;", "sendRequest", "sendRequestV2", "Lcom/bytedance/ee/bear/jsbridge/v2/RNMessage;", "Lcom/bytedance/ee/bear/jsbridge/v2/RNCallback;", "setBaseAbsolutePath", "path", "showDevOptionsDialog", "unRegistSendDataCallback", "unregisterHandler", "unregisterHandlerV2", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.a */
public final class DefaultRnManager implements RnManager {
    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: b */
    public void mo40255b() {
        RnSyncManager.m44281h();
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public boolean mo40254a() {
        return RnSyncManager.m44282i();
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: c */
    public void mo40260c() {
        RnSyncManager.f28587a.mo40390e();
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: d */
    public boolean mo40262d() {
        return RnSyncManager.f28587a.mo40391f();
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: e */
    public AbstractC5167a mo40263e() {
        return RnSyncManager.m44273d();
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40253a(boolean z) {
        RnSyncManager.m44270b(z);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public AbstractC68307f<String> mo40246a(Function0<? extends AbstractC68307f<String>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "apply");
        return C10732b.m44451a(function0);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: b */
    public void mo40256b(BinderIRnConnectStatus binderIRnConnectStatus) {
        Intrinsics.checkParameterIsNotNull(binderIRnConnectStatus, "iRnConnectStatus");
        RnSyncManager.f28587a.mo40383b(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: c */
    public void mo40261c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        RnSyncManager.m44275d(str);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40247a(BinderIRnConnectStatus binderIRnConnectStatus) {
        Intrinsics.checkParameterIsNotNull(binderIRnConnectStatus, "iRnConnectStatus");
        RnSyncManager.f28587a.mo40377a(binderIRnConnectStatus);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: b */
    public void mo40257b(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        RnSyncManager.f28587a.mo40384b(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40248a(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        RnSyncManager.f28587a.mo40378a(binderISendDataCallback);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: b */
    public void mo40258b(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        RnSyncManager.f28587a.mo40389d(hVar);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40249a(AbstractC5167a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "iRn");
        RnSyncManager.m44263a(aVar);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: b */
    public void mo40259b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        RnSyncManager.m44272c(str);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40250a(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        RnSyncManager.f28587a.mo40388c(hVar);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40251a(String str) {
        if (str == null) {
            Intrinsics.throwNpe();
        }
        RnSyncManager.m44267a(str);
    }

    @Override // com.bytedance.ee.bear.rn.RnManager
    /* renamed from: a */
    public void mo40252a(String str, AbstractC7945d<?> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        RnSyncManager.f28587a.mo40375a(str, dVar);
    }
}
