package com.bytedance.ee.bear.rn;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.p281e.AbstractC5167a;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.jsbridge.C7950l;
import com.bytedance.ee.bear.jsbridge.Message;
import com.bytedance.ee.bear.jsbridge.v2.RNBridgeV2;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.rn.handler.RNSyncWebService;
import com.bytedance.ee.bear.rn.handler.SendDataToNativeHandler;
import com.bytedance.ee.bear.rn.handler.SendMessageToWebviewHandler;
import com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSDocObserver;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseProtocol;
import com.bytedance.ee.bear.rn.middleground.business.base.BaseSDK;
import com.bytedance.ee.bear.rn.middleground.business.keepalive.KeepAliveService;
import com.bytedance.ee.bear.rn.middleground.common.C10732b;
import com.bytedance.ee.bear.rn.p528a.AbstractC10625a;
import com.bytedance.ee.bear.rn.p528a.p529a.C10626c;
import com.bytedance.ee.bear.rn.p528a.p529a.C10628f;
import com.bytedance.ee.bear.rn.p528a.p530b.AbstractC10631a;
import com.bytedance.ee.bear.rn.p528a.p530b.C10632b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.common.ReflectUtils;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p705h.C13667b;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010E\u001a\u00020FH\u0002J\u000e\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u000209J\u000e\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u00020FH\u0007J\b\u0010M\u001a\u00020FH\u0002J\b\u0010N\u001a\u00020FH\u0016J\b\u0010O\u001a\u00020FH\u0016J\b\u0010P\u001a\u00020\u0004H\u0002J\n\u0010Q\u001a\u0004\u0018\u00010+H\u0007J\u0006\u0010R\u001a\u00020\u0004J\u0010\u0010S\u001a\u00020F2\u0006\u0010T\u001a\u00020\u0013H\u0007J\u0010\u0010U\u001a\u00020F2\u0006\u0010V\u001a\u00020+H\u0007J\b\u0010\u001c\u001a\u00020\u0013H\u0007J\u0006\u0010\u001d\u001a\u00020\u0013J\b\u0010W\u001a\u00020FH\u0002J\b\u0010X\u001a\u00020\u0013H\u0002J\u000e\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020[J+\u0010\\\u001a\u0004\u0018\u0001H]\"\u0004\b\u0000\u0010]2\u0006\u0010^\u001a\u00020\u00042\u000e\u0010_\u001a\n\u0012\u0004\u0012\u0002H]\u0018\u00010`¢\u0006\u0002\u0010aJ\u001c\u0010b\u001a\u00020F2\u0006\u0010c\u001a\u00020\u00042\f\u0010d\u001a\b\u0012\u0002\b\u0003\u0018\u00010`J\u000e\u0010e\u001a\u00020F2\u0006\u0010f\u001a\u000200J\u0006\u0010g\u001a\u00020FJ\u000e\u0010h\u001a\u00020F2\u0006\u0010H\u001a\u000209J\u000e\u0010i\u001a\u00020F2\u0006\u0010J\u001a\u00020KJ \u0010j\u001a\u00020F2\u0006\u0010k\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0004H\u0007J\u000e\u0010n\u001a\u00020F2\u0006\u0010o\u001a\u00020pJ\u0012\u0010q\u001a\u00020F2\b\u0010o\u001a\u0004\u0018\u00010pH\u0002J\u0006\u0010r\u001a\u00020FJ\u0010\u0010s\u001a\u00020F2\u0006\u0010m\u001a\u00020\u0004H\u0007J\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010u2\u0006\u0010m\u001a\u00020\u00042\u0006\u0010v\u001a\u00020wJ\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010u2\u0006\u0010m\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u0004J\u0010\u0010y\u001a\u00020F2\u0006\u0010m\u001a\u00020\u0004H\u0002J\b\u0010z\u001a\u00020FH\u0002J\u0010\u0010{\u001a\u00020F2\u0006\u0010m\u001a\u00020\u0004H\u0007J\u000e\u0010|\u001a\u00020F2\u0006\u0010m\u001a\u00020\u0004J\u001c\u0010}\u001a\u00020F2\u0006\u0010m\u001a\u00020~2\f\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010J\t\u0010\u0001\u001a\u00020FH\u0002J\t\u0010\u0001\u001a\u00020FH\u0002J\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010J\u001a\u00020KJ\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010J\u001a\u00020KJ\u0007\u0010\u0001\u001a\u00020FJ\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010Z\u001a\u00020[J\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010^\u001a\u00020\u0004J\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010c\u001a\u00020\u0004J\u000f\u0010\u0001\u001a\u00020F2\u0006\u0010f\u001a\u000200R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X.¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090/X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X.¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/rn/RnSyncManager;", "Lcom/bytedance/ee/bear/rn/jsmodel/service/JSModelObserver;", "()V", "BASE_PATH", "", "BASE_RES_NAME", "COMMENT_RES_NAME", "COMMON_RES_NAME", "DOCS_RES_NAME", "PERMISSION_RES_NAME", "TAG", "VERSION_RES_NAME", "baseAbsolutePath", "baseAbsolutePath$annotations", "getBaseAbsolutePath", "()Ljava/lang/String;", "setBaseAbsolutePath", "(Ljava/lang/String;)V", "commentResExist", "", "docsResExist", "hasReload_flag_for_debug", "getHasReload_flag_for_debug", "()Z", "setHasReload_flag_for_debug", "(Z)V", "isClose", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInit", "isRnConnected", "mAccount", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "mApplication", "Landroid/app/Application;", "mBridge", "Lcom/bytedance/ee/bear/jsbridge/RNBridge;", "mBridgeV2", "Lcom/bytedance/ee/bear/jsbridge/v2/RNBridgeV2;", "mCloseDisposable", "Lio/reactivex/disposables/Disposable;", "mCommentSendMessageToWebviewHandler", "Lcom/bytedance/ee/bear/rn/handler/SendMessageToWebviewHandler;", "mDocRnImpl", "Lcom/bytedance/ee/bear/contract/rn/IRn;", "mInfoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "mJSDocObservers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mJsModelService", "Lcom/bytedance/ee/bear/rn/jsmodel/service/JSModelService;", "mKeepAliveService", "Lcom/bytedance/ee/bear/rn/middleground/business/keepalive/KeepAliveService;", "mLatestToken", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "mRnConnectStatusCallback", "Lcom/bytedance/ee/bear/contract/BinderIRnConnectStatus;", "mSendDataToNativeHandler", "Lcom/bytedance/ee/bear/rn/handler/SendDataToNativeHandler;", "mSendMessageToWebviewHandler", "mServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "permissionResExist", "persistenceSharedPreference", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "getPersistenceSharedPreference", "()Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "versionResExist", "addMultibundler", "", "addRnConnectStatusCallback", "iRnConnectStatus", "addWebViewCallback", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "close", "closeSession", "connected", "disconnect", "getBaseBundlePath", "getRn", "getRnStatus", "init", "isReload", "initDocImpl", "docRn", "notifyRNProcessStatus", "openSession", "registSendDataCallback", "iSendDataCallback", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback;", "registerHandler", "T", "handlerName", "handler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;)Ljava/lang/Object;", "registerHandlerV2", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "jsHandler", "registerJSDocObserver", "observer", "reload", "removeRnConnectStatusCallback", "removeWebViewCallback", "reportRnAnalytic", "event", "code", "message", "rnActivityDestroy", "activity", "Landroid/app/Activity;", "rnActivityResume", "sendAppInfo", "sendDocRequest", "sendDocRequestFlowable", "Lio/reactivex/Flowable;", "connectTimeout", "", "requestId", "sendDocRequestSync", "sendHeadInfo", "sendRequest", "sendRequestSync", "sendRequestV2", "Lcom/bytedance/ee/bear/jsbridge/v2/RNMessage;", "Lcom/bytedance/ee/bear/jsbridge/v2/RNCallback;", "sendUserInfo", "sendWhiteListOperation", "setCommentWebviewCallback", "setWebViewCallback", "showDevOptionsDialog", "unRegistSendDataCallback", "unregisterHandler", "unregisterHandlerV2", "unregisterJSDocObserver", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.i */
public final class RnSyncManager implements AbstractC10631a {

    /* renamed from: A */
    private static boolean f28585A;

    /* renamed from: B */
    private static boolean f28586B;

    /* renamed from: a */
    public static final RnSyncManager f28587a = new RnSyncManager();

    /* renamed from: b */
    private static final PersistenceSharedPreference f28588b = new PersistenceSharedPreference("debug_config");

    /* renamed from: c */
    private static boolean f28589c;

    /* renamed from: d */
    private static String f28590d = "";

    /* renamed from: e */
    private static AtomicBoolean f28591e = new AtomicBoolean(false);

    /* renamed from: f */
    private static AtomicBoolean f28592f = new AtomicBoolean(false);

    /* renamed from: g */
    private static Application f28593g;

    /* renamed from: h */
    private static C10917c f28594h;

    /* renamed from: i */
    private static AccountService.Account f28595i;

    /* renamed from: j */
    private static C10632b f28596j;

    /* renamed from: k */
    private static C7950l f28597k;

    /* renamed from: l */
    private static RNBridgeV2 f28598l;

    /* renamed from: m */
    private static SendMessageToWebviewHandler f28599m;

    /* renamed from: n */
    private static SendMessageToWebviewHandler f28600n;

    /* renamed from: o */
    private static SendDataToNativeHandler f28601o;

    /* renamed from: p */
    private static al f28602p;

    /* renamed from: q */
    private static NetService f28603q;

    /* renamed from: r */
    private static KeepAliveService f28604r;

    /* renamed from: s */
    private static String f28605s;

    /* renamed from: t */
    private static CopyOnWriteArrayList<JSDocObserver> f28606t = new CopyOnWriteArrayList<>();

    /* renamed from: u */
    private static AbstractC5167a f28607u;

    /* renamed from: v */
    private static final CopyOnWriteArrayList<BinderIRnConnectStatus> f28608v = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    private static boolean f28609w;

    /* renamed from: x */
    private static Disposable f28610x;

    /* renamed from: y */
    private static boolean f28611y;

    /* renamed from: z */
    private static boolean f28612z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/rn/RnSyncManager$connected$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$c */
    public static final class C10657c implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        C10657c() {
        }

        public void onActivityResumed(Activity activity) {
            RnSyncManager.f28587a.mo40376a(activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/rn/RnSyncManager$openSession$1", "Lcom/bytedance/ee/bear/rn/jsmodel/ReceiveDataCallback;", "receiveDocData", "", "jsDocResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocResponse;", "receiveNativeData", "jsNativeResponse", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSNativeResponse;", "receiveNewBridgeData", "message", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$h */
    public static final class C10666h implements AbstractC10625a {
        C10666h() {
        }

        @Override // com.bytedance.ee.bear.rn.p528a.AbstractC10625a
        /* renamed from: a */
        public void mo40266a(String str) {
            RnSyncManager iVar = RnSyncManager.f28587a;
            RNBridgeV2 aVar = RnSyncManager.f28598l;
            if (aVar != null) {
                aVar.mo30856a(str);
            }
        }

        @Override // com.bytedance.ee.bear.rn.p528a.AbstractC10625a
        /* renamed from: a */
        public void mo40265a(C10628f fVar) {
            String str;
            RnSyncManager iVar = RnSyncManager.f28587a;
            C7950l lVar = RnSyncManager.f28597k;
            if (lVar != null) {
                if (fVar != null) {
                    str = fVar.mo40279c();
                } else {
                    str = null;
                }
                lVar.mo30846a(str);
            }
        }

        @Override // com.bytedance.ee.bear.rn.p528a.AbstractC10625a
        /* renamed from: a */
        public void mo40264a(C10626c cVar) {
            if (!(cVar == null || cVar.mo40279c() == null)) {
                JSONObject parseObject = JSONObject.parseObject(cVar.mo40279c());
                Intrinsics.checkExpressionValueIsNotNull(parseObject, "JSONObject.parseObject(jsDocResponse.message)");
                if (!Intrinsics.areEqual("base", parseObject.getString("business")) || !Intrinsics.areEqual(parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("operation"), "log")) {
                    RnSyncManager iVar = RnSyncManager.f28587a;
                    for (JSDocObserver aVar : RnSyncManager.f28606t) {
                        aVar.mo40267a(cVar, parseObject);
                    }
                    return;
                }
                C13479a.m54764b("RnSyncManager", "js_rn_log: " + parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").get("message"));
            }
        }
    }

    private RnSyncManager() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final AbstractC5167a m44273d() {
        return f28607u;
    }

    /* renamed from: a */
    public final void mo40381a(boolean z) {
        f28589c = z;
    }

    /* renamed from: a */
    public final void mo40376a(Activity activity) {
        C13479a.m54772d("RnSyncManager", " rnActivityResume=============activity: " + activity);
        if (activity != null) {
            C10632b bVar = f28596j;
            if (bVar != null) {
                bVar.mo40286a(activity);
                return;
            }
            return;
        }
        C10632b bVar2 = f28596j;
        if (bVar2 != null) {
            bVar2.mo40286a(new Activity());
        }
    }

    /* renamed from: a */
    public final void mo40380a(JSDocObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (!f28606t.contains(aVar)) {
            f28606t.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo40379a(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        SendMessageToWebviewHandler iVar = f28599m;
        if (iVar != null) {
            iVar.mo40369a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo40378a(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        AbstractC68307f<String> a = C10732b.m44451a(new C10667i(binderISendDataCallback));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: a */
    public final void mo40377a(BinderIRnConnectStatus binderIRnConnectStatus) {
        Intrinsics.checkParameterIsNotNull(binderIRnConnectStatus, "iRnConnectStatus");
        f28608v.add(binderIRnConnectStatus);
    }

    @JvmStatic
    /* renamed from: i */
    public static final boolean m44282i() {
        return f28591e.get();
    }

    /* renamed from: r */
    private final void m44286r() {
        C13748k.m55732a(RunnableC10661g.f28618a);
    }

    /* renamed from: e */
    public final void mo40390e() {
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40295c();
        }
    }

    /* renamed from: f */
    public final boolean mo40391f() {
        return f28609w;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$i */
    public static final class C10667i extends Lambda implements Function0 {
        final /* synthetic */ BinderISendDataCallback $iSendDataCallback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10667i(BinderISendDataCallback binderISendDataCallback) {
            super(0);
            this.$iSendDataCallback = binderISendDataCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager iVar = RnSyncManager.f28587a;
            SendDataToNativeHandler gVar = RnSyncManager.f28601o;
            if (gVar == null) {
                return null;
            }
            gVar.mo40362a(this.$iSendDataCallback);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$k */
    static final class RunnableC10669k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28623a;

        /* renamed from: b */
        final /* synthetic */ Map f28624b;

        RunnableC10669k(String str, Map map) {
            this.f28623a = str;
            this.f28624b = map;
        }

        public final void run() {
            AbstractC5233x b = C5234y.m21391b();
            if (b != null) {
                b.mo21079a(this.f28623a, this.f28624b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$l */
    static final class C10670l extends Lambda implements Function0 {
        final /* synthetic */ BinderISendDataCallback $iSendDataCallback;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10670l(BinderISendDataCallback binderISendDataCallback) {
            super(0);
            this.$iSendDataCallback = binderISendDataCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            RnSyncManager iVar = RnSyncManager.f28587a;
            SendDataToNativeHandler gVar = RnSyncManager.f28601o;
            if (gVar == null) {
                return null;
            }
            gVar.mo40364b(this.$iSendDataCallback);
            return null;
        }
    }

    /* renamed from: g */
    public final void mo40392g() {
        C13479a.m54764b("RnSyncManager", " reload=============");
        C13479a.m54764b("RN FE", "rn reload=============");
        if (f28591e.get()) {
            mo40397n();
            m44283o();
        }
    }

    /* renamed from: n */
    public final void mo40397n() {
        C13479a.m54764b("RnSyncManager", "closeSession");
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40293b(this);
        }
        C10632b bVar2 = f28596j;
        if (bVar2 != null) {
            bVar2.mo40292b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$d */
    static final class RunnableC10658d implements Runnable {

        /* renamed from: a */
        public static final RunnableC10658d f28615a = new RunnableC10658d();

        RunnableC10658d() {
        }

        public final void run() {
            RnSyncManager.f28587a.mo40381a(true);
            RnSyncManager.m44262a(RnSyncManager.f28587a).sendBroadcast(new Intent(RnSyncManager.m44262a(RnSyncManager.f28587a).getPackageName() + ".RELOAD_APP_ACTION"));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$g */
    public static final class RunnableC10661g implements Runnable {

        /* renamed from: a */
        public static final RunnableC10661g f28618a = new RunnableC10661g();

        RunnableC10661g() {
        }

        public final void run() {
            AbstractC5238z j = C5102ai.m20872j();
            Intrinsics.checkExpressionValueIsNotNull(j, "DocumentSdkVisibleServiceImpl.getInstance()");
            j.mo20208a().mo5925a(C106621.f28619a);
            AbstractC5238z j2 = C5102ai.m20872j();
            Intrinsics.checkExpressionValueIsNotNull(j2, "DocumentSdkVisibleServiceImpl.getInstance()");
            j2.mo20213e().mo5925a(C106642.f28620a);
            C5084ad.m20847d().mo20037a().mo5925a(C106653.f28621a);
        }
    }

    /* renamed from: p */
    private final String m44284p() {
        String str = f28590d + "/rn" + "/base_0_61_2.android.jsbundle";
        if (!new File(str).exists()) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ee.bear.rn.p528a.p530b.AbstractC10631a
    /* renamed from: c */
    public void mo40282c() {
        C13479a.m54764b("RnSyncManager", "connect status=============disconnect");
        f28609w = false;
        Iterator<BinderIRnConnectStatus> it = f28608v.iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
    }

    /* renamed from: l */
    public final void mo40395l() {
        BaseProtocol.OperationWhiteList dVar = new BaseProtocol.OperationWhiteList();
        al alVar = f28602p;
        if (alVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoProvideService");
        }
        String[] u = alVar.mo17371u();
        Intrinsics.checkExpressionValueIsNotNull(u, "mInfoProvideService.pushWhiteListOperation");
        dVar.mo40559a(new BaseProtocol.Body.OperationWhiteList(u));
        String a = dVar.mo40447a();
        m44277e(a);
        C13479a.m54764b("RnSyncManager", "sendWhiteListOperation, sendDocRequestSync=" + a);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m44281h() {
        Disposable disposable;
        f28592f.set(true);
        C13479a.m54764b("RnSyncManager", "close=============== is init:" + f28591e.get());
        if (f28591e.get()) {
            AbstractC68307f<String> b = new BaseSDK().mo40457b(2);
            if (b != null) {
                disposable = b.mo238001b(C10655a.f28613a, C10656b.f28614a);
            } else {
                disposable = null;
            }
            f28610x = disposable;
        }
    }

    /* renamed from: o */
    private final boolean m44283o() {
        boolean z;
        String p = m44284p();
        if (TextUtils.isEmpty(p)) {
            z = false;
        } else {
            z = new File(p).exists();
        }
        C13479a.m54764b("RnSyncManager", "openSession: path " + p + " exist=" + z);
        if (!z) {
            return false;
        }
        AbstractC5233x b = C5234y.m21391b();
        Application application = f28593g;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplication");
        }
        C10632b bVar = new C10632b(application, b, p, new C10666h());
        f28596j = bVar;
        if (bVar != null) {
            bVar.mo40289a(this);
        }
        C10632b bVar2 = f28596j;
        if (bVar2 == null) {
            return true;
        }
        bVar2.mo40285a();
        return true;
    }

    /* renamed from: b */
    public final String mo40382b() {
        boolean z;
        String p = m44284p();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isInit", (Object) Boolean.valueOf(f28591e.get()));
        jSONObject.put("isDestroy", (Object) Boolean.valueOf(f28592f.get()));
        jSONObject.put("isConnect", (Object) Boolean.valueOf(f28609w));
        jSONObject.put("jsBundlePath", (Object) p);
        if (TextUtils.isEmpty(p)) {
            z = false;
        } else {
            z = new File(p).exists();
        }
        jSONObject.put("isBundleExist", (Object) Boolean.valueOf(z));
        jSONObject.put("extra", (Object) "");
        jSONObject.put("docsResExist", (Object) Boolean.valueOf(f28611y));
        jSONObject.put("commentResExist", (Object) Boolean.valueOf(f28612z));
        jSONObject.put("permissionResExist", (Object) Boolean.valueOf(f28585A));
        jSONObject.put("versionResExist", (Object) Boolean.valueOf(f28586B));
        String jSONString = jSONObject.toJSONString();
        C13479a.m54758a("RnSyncManager", jSONString);
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "jsonObject.toJSONString(… Log.e(TAG, it)\n        }");
        return jSONString;
    }

    /* renamed from: k */
    public final void mo40394k() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C13479a.m54764b("RnSyncManager", "sendUserInfo");
        AccountService.Account account = f28595i;
        if (account != null) {
            if (account == null) {
                Intrinsics.throwNpe();
            }
            if (account.mo19677a()) {
                C13479a.m54764b("RnSyncManager", "sendUserInfo account != null");
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((Object) "operation", (Object) "userInfo");
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject3;
                AccountService.Account account2 = f28595i;
                String str6 = null;
                if (account2 != null) {
                    str = account2.f14584a;
                } else {
                    str = null;
                }
                jSONObject4.put((Object) "id", (Object) str);
                AccountService.Account account3 = f28595i;
                if (account3 != null) {
                    str2 = account3.f14584a;
                } else {
                    str2 = null;
                }
                jSONObject4.put((Object) "suid", (Object) str2);
                AccountService.Account account4 = f28595i;
                if (account4 != null) {
                    str3 = account4.f14592i;
                } else {
                    str3 = null;
                }
                jSONObject4.put((Object) "tenantId", (Object) str3);
                AccountService.Account account5 = f28595i;
                if (account5 != null) {
                    str4 = account5.f14589f;
                } else {
                    str4 = null;
                }
                jSONObject4.put((Object) "avatarUrl", (Object) str4);
                AccountService.Account account6 = f28595i;
                if (account6 != null) {
                    str6 = account6.f14585b;
                }
                jSONObject4.put((Object) "userName", (Object) str6);
                NetService netService = f28603q;
                if (netService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNetService");
                }
                if (netService.mo20123c()) {
                    str5 = "staging";
                } else {
                    str5 = "publish";
                }
                jSONObject4.put((Object) "host", (Object) str5);
                jSONObject2.put((Object) "body", (Object) jSONObject3);
                String jSONString = jSONObject.toJSONString();
                Intrinsics.checkExpressionValueIsNotNull(jSONString, "jsonObject.toJSONString()");
                mo40387b(jSONString);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r4.mo20121b() == 5) goto L_0x00a9;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40396m() {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.rn.RnSyncManager.mo40396m():void");
    }

    /* renamed from: q */
    private final void m44285q() {
        C10632b bVar;
        String str = f28590d + "/rn/doc.android.jsbundle";
        boolean exists = new File(str).exists();
        C13479a.m54764b("RnSyncManager", "addMultibundler path： " + str + "   exists： " + exists);
        if (exists) {
            C10632b bVar2 = f28596j;
            if (bVar2 != null) {
                bVar2.mo40291a(str);
            }
            f28611y = true;
        } else {
            f28596j = null;
            f28611y = false;
        }
        String str2 = f28590d + "/rn/comment.android.jsbundle";
        boolean exists2 = new File(str2).exists();
        C13479a.m54764b("RnSyncManager", "addMultibundler path： " + str2 + "   exists： " + exists2);
        if (exists2) {
            C10632b bVar3 = f28596j;
            if (bVar3 != null) {
                bVar3.mo40291a(str2);
            }
            f28612z = true;
        } else {
            f28612z = false;
        }
        String str3 = f28590d + "/rn/permission.android.jsbundle";
        boolean exists3 = new File(str3).exists();
        C13479a.m54764b("RnSyncManager", "addMultibundler path： " + str3 + "   exists： " + exists3);
        if (exists3) {
            C10632b bVar4 = f28596j;
            if (bVar4 != null) {
                bVar4.mo40291a(str3);
            }
            f28585A = true;
        } else {
            f28585A = false;
        }
        String str4 = f28590d + "/rn/version.android.jsbundle";
        boolean exists4 = new File(str4).exists();
        C13479a.m54764b("RnSyncManager", "add version Multibundler path： " + str4 + "   exists： " + exists4);
        if (exists4) {
            f28586B = true;
            C10632b bVar5 = f28596j;
            if (bVar5 != null) {
                bVar5.mo40291a(str4);
            }
        } else {
            f28586B = false;
        }
        String str5 = f28590d + "/rn/common.android.jsbundle";
        boolean exists5 = new File(str5).exists();
        C13479a.m54764b("RnSyncManager", "add version Multibundler path： " + str5 + "   exists： " + exists5);
        if (exists5 && (bVar = f28596j) != null) {
            bVar.mo40291a(str5);
        }
    }

    /* renamed from: j */
    public final void mo40393j() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "operation", (Object) "appInfo");
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((Object) "scm", (Object) ((AbstractC6158t) KoinJavaComponent.m268613a(AbstractC6158t.class, null, null, 6, null)).mo20315a());
        al alVar = f28602p;
        if (alVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoProvideService");
        }
        jSONObject4.put((Object) "sdk", (Object) alVar.mo17349J());
        al d = C4511g.m18594d();
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(C6313i.f17510b);
        sb.append('/');
        C6313i a = C6313i.m25327a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SpaceKitUrlHelper.getInstance()");
        sb.append(a.mo25387b());
        jSONObject4.put((Object) "apiPrefix", (Object) sb.toString());
        ao b = C4484g.m18494b();
        Locale d2 = b.mo17253d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "localService.provideLocale()");
        String a2 = C13667b.m55444a(d2.getCountry(), b.mo17252c());
        Intrinsics.checkExpressionValueIsNotNull(d, "infoProvideService");
        String x = d.mo17374x();
        List<String> y = d.mo17375y();
        jSONObject4.put((Object) "persistentConnectionURL", (Object) x);
        jSONObject4.put((Object) "persistentConnectionURLList", (Object) y);
        al d3 = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "InfoProvideServiceImp.getInstance()");
        jSONObject4.put((Object) "persistentConnectionKey", (Object) d3.mo17376z());
        jSONObject4.put((Object) "language", (Object) a2);
        String str = C6306d.f17467a;
        Intrinsics.checkExpressionValueIsNotNull(str, "DomainCharacteristicCons…ON_CONFIG_PREFERENCE_NAME");
        PersistenceSharedPreference aVar = new PersistenceSharedPreference(str);
        String str2 = C6306d.f17468b;
        Intrinsics.checkExpressionValueIsNotNull(str2, "DomainCharacteristicCons…AIN_CHARACTERISTIC_CONFIG");
        String str3 = (String) aVar.mo34038b(str2, "{}");
        jSONObject4.put((Object) "domainCharacteristicConfig", (Object) str3);
        jSONObject4.put((Object) "isOversea", (Object) Integer.valueOf(d.mo17345F() ? 1 : 0));
        al alVar2 = f28602p;
        if (alVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoProvideService");
        }
        jSONObject4.put((Object) "doc-biz", (Object) alVar2.mo17350K());
        al alVar3 = f28602p;
        if (alVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoProvideService");
        }
        jSONObject4.put((Object) "ua", (Object) alVar3.mo17352M());
        jSONObject2.put((Object) "body", (Object) jSONObject3);
        C13479a.m54772d("RnSyncManager", jSONObject3.toString());
        C13479a.m54764b("RnSyncManager", "sendAppInfo:lan = " + a2 + ", mainPersistentConnectionDomain = " + x + ", domainCharacteristicConfig = " + str3);
        if (y != null) {
            C13479a.m54764b("RnSyncManager", "sendAppInfo: allAvailableConnectionDomain size = " + y.size());
            Iterator<T> it = y.iterator();
            while (it.hasNext()) {
                C13479a.m54772d("RnSyncManager", "sendAppInfo: allAvailableConnectionDomain = " + ((String) it.next()));
            }
        }
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "jsonObject.toJSONString()");
        mo40387b(jSONString);
    }

    @Override // com.bytedance.ee.bear.rn.p528a.p530b.AbstractC10631a
    /* renamed from: a */
    public void mo40281a() {
        Disposable disposable;
        C13479a.m54764b("RnSyncManager", "connect status============= connected");
        Disposable disposable2 = f28610x;
        if (!(disposable2 == null || disposable2.isDisposed() || (disposable = f28610x) == null)) {
            disposable.dispose();
        }
        m44285q();
        mo40396m();
        mo40394k();
        mo40393j();
        mo40395l();
        BaseSDK aVar = new BaseSDK();
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
        aVar.mo40458c(b.mo20040a());
        Object b2 = f28588b.mo34038b("rn_debug", false);
        if (b2 == null) {
            Intrinsics.throwNpe();
        }
        if (((Boolean) b2).booleanValue()) {
            Application application = f28593g;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplication");
            }
            application.registerActivityLifecycleCallbacks(new C10657c());
            if (!f28589c) {
                C13748k.m55732a(RunnableC10658d.f28615a);
            }
        } else {
            mo40376a(new Activity());
        }
        f28609w = true;
        Iterator<BinderIRnConnectStatus> it = f28608v.iterator();
        while (it.hasNext()) {
            it.next().connected();
        }
        KeepAliveService keepAliveService = f28604r;
        if (keepAliveService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeepAliveService");
        }
        if (keepAliveService != null) {
            keepAliveService.restartAliveTask();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$b */
    static final class C10656b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C10656b f28614a = new C10656b();

        C10656b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("RnSyncManager", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "sendToJS"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$e */
    static final class C10659e implements C7939a.AbstractC7942a {

        /* renamed from: a */
        public static final C10659e f28616a = new C10659e();

        C10659e() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.C7939a.AbstractC7942a
        /* renamed from: a */
        public final void mo30839a(String str) {
            RnSyncManager iVar = RnSyncManager.f28587a;
            C10632b bVar = RnSyncManager.f28596j;
            if (bVar != null) {
                bVar.mo40296c(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "sendToJS"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$f */
    static final class C10660f implements C7939a.AbstractC7942a {

        /* renamed from: a */
        public static final C10660f f28617a = new C10660f();

        C10660f() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.C7939a.AbstractC7942a
        /* renamed from: a */
        public final void mo30839a(String str) {
            RnSyncManager iVar = RnSyncManager.f28587a;
            C10632b bVar = RnSyncManager.f28596j;
            if (bVar != null) {
                bVar.mo40300e(str);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Application m44262a(RnSyncManager iVar) {
        Application application = f28593g;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplication");
        }
        return application;
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m44275d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40300e(str);
        }
    }

    /* renamed from: e */
    private final void m44277e(String str) {
        new Message().mo30822b(str);
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40298d(str);
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ KeepAliveService m44280h(RnSyncManager iVar) {
        KeepAliveService keepAliveService = f28604r;
        if (keepAliveService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeepAliveService");
        }
        return keepAliveService;
    }

    /* renamed from: b */
    public final void mo40383b(BinderIRnConnectStatus binderIRnConnectStatus) {
        Intrinsics.checkParameterIsNotNull(binderIRnConnectStatus, "iRnConnectStatus");
        f28608v.remove(binderIRnConnectStatus);
    }

    /* renamed from: c */
    public final void mo40388c(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        SendMessageToWebviewHandler iVar = f28599m;
        if (iVar != null) {
            iVar.mo40371b(hVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$a */
    static final class C10655a<T> implements Consumer<String> {

        /* renamed from: a */
        public static final C10655a f28613a = new C10655a();

        C10655a() {
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54764b("RnSyncManager", "native close session");
            RnSyncManager iVar = RnSyncManager.f28587a;
            RnSyncManager.f28609w = false;
            RnSyncManager.m44280h(RnSyncManager.f28587a).reset();
            RnSyncManager.f28587a.mo40397n();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44263a(AbstractC5167a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "docRn");
        C13479a.m54764b("RnSyncManager", " initDocImpl========docRn: " + aVar);
        f28607u = aVar;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m44272c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Message message = new Message();
        message.mo30822b(str);
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40296c(message.mo30829f());
        }
    }

    /* renamed from: b */
    public final void mo40384b(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        AbstractC68307f<String> a = C10732b.m44451a(new C10670l(binderISendDataCallback));
        if (a != null) {
            a.mo238036k();
        }
    }

    /* renamed from: d */
    public final void mo40389d(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        SendMessageToWebviewHandler iVar = f28599m;
        if (iVar != null) {
            iVar.mo40372c(hVar);
        }
    }

    /* renamed from: b */
    public final void mo40385b(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        SendMessageToWebviewHandler iVar = f28600n;
        if (iVar != null) {
            iVar.mo40369a(hVar);
        }
    }

    /* renamed from: a */
    public static final void m44267a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f28590d = str;
    }

    /* renamed from: b */
    public final void mo40386b(JSDocObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        f28606t.remove(aVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized void m44270b(boolean z) {
        synchronized (RnSyncManager.class) {
            if (C13615c.f35773a == null) {
                C13479a.m54764b("RnSyncManager", " init=============ContextUtils.baseApplication = null");
            } else if (z) {
                C13479a.m54764b("RnSyncManager", " init=============isReload: " + z);
                f28587a.mo40392g();
            } else if (!f28591e.get()) {
                C13479a.m54764b("RnSyncManager", " init=============start");
                Application application = C13615c.f35773a;
                Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
                f28593g = application;
                f28594h = new C10917c(new C10929e());
                al d = C4511g.m18594d();
                Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
                f28602p = d;
                f28603q = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
                ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16399a(new RnSyncManager$init$1());
                f28597k = new C7950l(C10659e.f28616a);
                f28598l = new RNBridgeV2(C10660f.f28617a);
                f28599m = new SendMessageToWebviewHandler();
                f28600n = new SendMessageToWebviewHandler();
                f28601o = new SendDataToNativeHandler();
                RnSyncManager iVar = f28587a;
                iVar.mo40375a("biz.util.sendMessageToWebview", f28599m);
                iVar.mo40375a(RNSyncWebService.f28563c, f28600n);
                iVar.mo40375a("biz.util.sendDataToNative", f28601o);
                AbstractC5167a aVar = f28607u;
                if (aVar != null) {
                    Application application2 = f28593g;
                    if (application2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mApplication");
                    }
                    C10917c cVar = f28594h;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mServiceContext");
                    }
                    aVar.mo20634a(application2, cVar);
                }
                if (iVar.m44283o()) {
                    f28591e.set(true);
                    f28592f.set(false);
                    C10917c cVar2 = f28594h;
                    if (cVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mServiceContext");
                    }
                    KeepAliveService keepAliveService = new KeepAliveService(cVar2);
                    f28604r = keepAliveService;
                    if (keepAliveService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mKeepAliveService");
                    }
                    iVar.mo40378a(keepAliveService);
                    iVar.mo40378a(new RnSyncManager$init$4());
                    iVar.m44286r();
                }
                C13479a.m54764b("RnSyncManager", " init=============end");
            }
        }
    }

    /* renamed from: b */
    public final void mo40387b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Message message = new Message();
        message.mo30822b(str);
        C10632b bVar = f28596j;
        if (bVar != null) {
            bVar.mo40294b(message.mo30829f());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "function", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handler"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.i$j */
    public static final class C10668j implements AbstractC7943b {

        /* renamed from: a */
        final /* synthetic */ AbstractC7945d f28622a;

        C10668j(AbstractC7945d dVar) {
            this.f28622a = dVar;
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7943b
        public final void handler(String str, AbstractC7947h hVar) {
            Class b = ReflectUtils.m55228b(this.f28622a);
            Object obj = null;
            if (b == null) {
                this.f28622a.handle(null, hVar);
                return;
            }
            try {
                obj = JSON.parseObject(str, b);
            } catch (Throwable th) {
                C13479a.m54761a("registerHandler", th);
            }
            this.f28622a.handle(obj, hVar);
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<String> mo40373a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        C10632b bVar = f28596j;
        if (bVar != null) {
            return bVar.mo40283a(str, j);
        }
        return null;
    }

    /* renamed from: a */
    public final AbstractC68307f<String> mo40374a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(str2, "requestId");
        C10632b bVar = f28596j;
        if (bVar != null) {
            return bVar.mo40284a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> T mo40375a(String str, AbstractC7945d<T> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        if (!TextUtils.isEmpty(str) && dVar != null) {
            C10668j jVar = new C10668j(dVar);
            C7950l lVar = f28597k;
            if (lVar != null) {
                lVar.mo30847a(str, jVar);
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44268a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Intrinsics.checkParameterIsNotNull(str2, "code");
        Intrinsics.checkParameterIsNotNull(str3, "message");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rn_error_code", str2);
        linkedHashMap.put("rn_error_message", str3);
        C13608f.m55249a(new RunnableC10669k(str, linkedHashMap));
    }
}
