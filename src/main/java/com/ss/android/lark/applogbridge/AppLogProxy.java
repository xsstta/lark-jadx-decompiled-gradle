package com.ss.android.lark.applogbridge;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.AbstractC3383b;
import com.bytedance.applog.AbstractC3387c;
import com.bytedance.applog.AbstractC3395d;
import com.bytedance.applog.AbstractC3423i;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.C3424j;
import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.applog.util.C3460i;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.applogbridge.listener.IConfigChangeListener;
import com.ss.android.lark.applogbridge.listener.IDeviceIdListener;
import com.ss.android.lark.applogbridge.model.InitConfig;
import com.ss.android.lark.applogbridge.p1367a.AbstractC29201c;
import com.ss.android.lark.applogbridge.util.InitConfigConverter;
import com.ss.android.lark.applogbridge.util.UriConfigCreator;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004¬\u0001­\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010&\u001a\u00020'\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u0001H(2\"\u0010*\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0\u0005`\u0007H\u0002¢\u0006\u0002\u0010+J\u0012\u0010,\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010-\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010.\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0012H\u0007J\u0012\u0010/\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0007J\"\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u001fH\u0007J\u0012\u00107\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0007J3\u00109\u001a\u00020\u001f\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u0001H(2\u0014\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0\u0005\u0018\u00010;H\u0002¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020'H\u0007J%\u0010>\u001a\u0004\u0018\u0001H(\"\u0004\b\u0000\u0010(2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u0002H(H\u0007¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020\u000fH\u0007J\b\u0010C\u001a\u00020\u000fH\u0007J\b\u0010D\u001a\u00020\u000fH\u0007J\b\u0010E\u001a\u00020\u001fH\u0007J%\u0010F\u001a\u0004\u0018\u0001H(\"\u0004\b\u0000\u0010(2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010G\u001a\u0002H(H\u0007¢\u0006\u0002\u0010AJ\b\u0010H\u001a\u00020\u000fH\u0007J\n\u0010I\u001a\u0004\u0018\u00010JH\u0007J\b\u0010K\u001a\u00020\u000fH\u0007J\n\u0010L\u001a\u0004\u0018\u00010\u000fH\u0007J\n\u0010M\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010N\u001a\u00020\u000fH\u0007J\u001c\u0010O\u001a\u00020'2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0QH\u0007J\b\u0010R\u001a\u00020\u000fH\u0007J\b\u0010S\u001a\u00020\u000fH\u0007J\u0018\u0010T\u001a\u00020'2\u0006\u00103\u001a\u0002042\u0006\u0010U\u001a\u00020\u0019H\u0007J\b\u0010V\u001a\u00020'H\u0007J\b\u0010W\u001a\u00020'H\u0007J\u0012\u0010X\u001a\u00020\u001f2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0010\u0010Y\u001a\u00020\u001f2\u0006\u00103\u001a\u000204H\u0007J\b\u0010Z\u001a\u00020'H\u0007J\u001a\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020\u001f2\b\u0010U\u001a\u0004\u0018\u00010]H\u0002J@\u0010^\u001a\u00020'2\u0006\u0010\\\u001a\u00020\u001f2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u000fH\u0002J \u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u000fH\u0002J\u001a\u0010i\u001a\u00020'2\u0006\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010]H\u0002J\u0010\u0010l\u001a\u00020'2\u0006\u0010m\u001a\u00020\u000fH\u0007J\u0018\u0010l\u001a\u00020'2\u0006\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u000fH\u0007J2\u0010l\u001a\u00020'2\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\u000f2\b\u0010n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020qH\u0007J<\u0010l\u001a\u00020'2\u0006\u0010o\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\u000f2\b\u0010n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010p\u001a\u00020q2\u0006\u0010s\u001a\u00020q2\b\u0010k\u001a\u0004\u0018\u00010]H\u0007J\u001a\u0010t\u001a\u00020'2\u0006\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010uH\u0007J\u001a\u0010t\u001a\u00020'2\u0006\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010]H\u0007J6\u0010v\u001a\u00020'2\u0006\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010u2\b\u0010w\u001a\u0004\u0018\u00010\u000f2\b\u0010x\u001a\u0004\u0018\u00010\u000f2\u0006\u0010y\u001a\u00020\u000fH\u0007J6\u0010v\u001a\u00020'2\u0006\u0010j\u001a\u00020\u000f2\b\u0010k\u001a\u0004\u0018\u00010]2\b\u0010w\u001a\u0004\u0018\u00010\u000f2\b\u0010x\u001a\u0004\u0018\u00010\u000f2\u0006\u0010y\u001a\u00020\u000fH\u0007J\u0018\u0010z\u001a\u00020'2\u0006\u0010{\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020]H\u0007J\u0012\u0010}\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0010\u0010~\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0007J3\u0010\u001a\u00020\u001f\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u0001H(2\u0014\u0010:\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0\u0005\u0018\u00010;H\u0002¢\u0006\u0002\u0010<J\u0013\u0010\u0001\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0007J\u0013\u0010\u0001\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0007J\u0011\u0010\u0001\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0012H\u0007J\u0013\u0010\u0001\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0007J\u0013\u0010\u0001\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0007J\t\u0010\u0001\u001a\u00020\u001fH\u0007J\u0014\u0010\u0001\u001a\u00020'2\t\u0010\u0001\u001a\u0004\u0018\u00010\u000fH\u0007J\u0015\u0010\u0001\u001a\u00020'2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0007J\u001b\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\u000fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0019\u0010\u0001\u001a\u00020'2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u000fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J1\u0010\u0001\u001a\u00020'2&\u0010k\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0015H\u0007J\u0012\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J6\u0010\u0001\u001a\u00020'2+\u0010\u0001\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014j\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0015H\u0007J\u001b\u0010\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u0002042\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J\u0012\u0010 \u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007J \u0010¡\u0001\u001a\u00020'2\u000f\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$H\u0007¢\u0006\u0003\u0010£\u0001J\u0014\u0010¤\u0001\u001a\u00020'2\t\u0010¥\u0001\u001a\u0004\u0018\u00010\"H\u0007J\u0012\u0010¦\u0001\u001a\u00020'2\u0007\u0010§\u0001\u001a\u00020\u000fH\u0007J\u0014\u0010¨\u0001\u001a\u00020'2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u000fH\u0007J\u0013\u0010ª\u0001\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u0012\u0010«\u0001\u001a\u00020'2\u0007\u0010\u0001\u001a\u00020\u001fH\u0007R*\u0010\u0003\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005`\u0007X\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0004j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0011X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0014j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$X\u000e¢\u0006\u0004\n\u0002\u0010%¨\u0006®\u0001"}, d2 = {"Lcom/ss/android/lark/applogbridge/AppLogProxy;", "", "()V", "CONFIG_CHANGE_LISTENERS", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/applogbridge/listener/IConfigChangeListener;", "Lkotlin/collections/ArrayList;", "DEVICEID_LISTENERS", "Lcom/ss/android/lark/applogbridge/listener/IDeviceIdListener;", "SESSION_HOOKLIST", "Lcom/ss/android/lark/applogbridge/AppLogProxy$ISessionHook;", "getSESSION_HOOKLIST$applog_bridge_release", "()Ljava/util/ArrayList;", "TAG", "", "eventListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/ss/android/lark/applogbridge/listener/IEventListener;", "mNetParamsMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sAppLogSessionHook", "Lcom/ss/android/lark/applogbridge/AppLogProxy$SessionHook;", "sConfig", "Lcom/ss/android/lark/applogbridge/model/InitConfig;", "sContext", "Landroid/app/Application;", "sDataObserver", "Lcom/bytedance/applog/IDataObserver;", "sEventReportEnable", "", "Ljava/lang/Boolean;", "sOnUidChanged", "Ljava/lang/Runnable;", "sSendLogUrls", "", "[Ljava/lang/String;", "add", "", "T", "listener", "listeners", "(Ljava/lang/Object;Ljava/util/ArrayList;)V", "addConfigChangeListener", "addDeviceIdListener", "addEventListener", "addEventObserver", "observer", "Lcom/bytedance/applog/IEventObserver;", "addNetCommonParams", "context", "Landroid/content/Context;", "url", "isApi", "addSessionHook", "hook", "contains", "iterator", "", "(Ljava/lang/Object;Ljava/util/Iterator;)Z", "flush", "getAbConfig", "key", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getAid", "getClientUdid", "getDid", "getEncryptAndCompress", "getHeaderValue", "fallbackValue", "getIid", "getNetConfig", "Lcom/bytedance/applog/network/INetworkClient;", "getOpenUdid", "getSDKInnerDid", "getSessionId", "getSsid", "getSsidGroup", "map", "", "getUdid", "getUserUniqueId", "init", "config", "initDataObserver", "initSessionHook", "isDebugPackage", "isNewUserMode", "manualActivate", "notifyConfigChanged", "changed", "Lorg/json/JSONObject;", "notifyDeviceIdChanged", "oldDid", "newDid", "oldIid", "newIid", "oldSsid", "newSsid", "notifyDeviceIdLoaded", "did", "iid", "ssid", "notifyOnEvent", "event", "params", "onEvent", "tag", "label", "category", "value", "", "ext_value", "extValue", "onEventV3", "Landroid/os/Bundle;", "onInternalEventV3", "secondAppId", "secondAppName", "productType", "onMiscEvent", "logType", "obj", "onPause", "onResume", "remove", "removeConfigChangeListener", "removeDeviceIdListener", "removeEventListener", "removeEventObserver", "removeSessionHook", "reportPhoneDetailInfo", "setAbSdkVersion", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "setAccount", "account", "Landroid/accounts/Account;", "setAppLanguageAndRegion", "language", "region", "setAutoABConfig", "isAutoABConfig", "setAutoActiveState", "isAutoActive", "setCustomNetParams", "setETVerifyEnable", "enable", "setEnableLog", "setEncryptAndCompress", "setEventReportEnable", "setExtraParams", "setForbidReportPhoneDetailInfo", "forbidReportPhoneDetailInfo", "setHeaderInfo", "custom", "setNewUserMode", "mContext", "open", "setNewUserModeFast", "setSendLogUrlRuntime", "sendUris", "([Ljava/lang/String;)V", "setUidChangedListener", "runnable", "setUriRuntime", "sdkDomain", "setUserUniqueId", "id", "shallItOpenDebugMode", "silenceInBackground", "ISessionHook", "SessionHook", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AppLogProxy {
    private static final ArrayList<WeakReference<IConfigChangeListener>> CONFIG_CHANGE_LISTENERS = new ArrayList<>();
    private static final ArrayList<WeakReference<IDeviceIdListener>> DEVICEID_LISTENERS = new ArrayList<>();
    public static final AppLogProxy INSTANCE = new AppLogProxy();
    private static final ArrayList<ISessionHook> SESSION_HOOKLIST = new ArrayList<>();
    private static final String TAG = TAG;
    private static final CopyOnWriteArraySet<WeakReference<AbstractC29201c>> eventListeners = new CopyOnWriteArraySet<>();
    private static final HashMap<String, String> mNetParamsMap = new HashMap<>();
    private static SessionHook sAppLogSessionHook = new SessionHook();
    private static InitConfig sConfig;
    private static Application sContext;
    private static final AbstractC3383b sDataObserver = new C29199d();
    private static Boolean sEventReportEnable = true;
    private static Runnable sOnUidChanged;
    private static String[] sSendLogUrls;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/applogbridge/AppLogProxy$ISessionHook;", "", "onSessionBatchEvent", "", "sessionId", "", "app_log", "Lorg/json/JSONObject;", "onSessionStart", "onSessionTerminate", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.AppLogProxy$a */
    public interface ISessionHook {
        /* renamed from: a */
        void mo103489a(String str);

        /* renamed from: a */
        void mo103490a(String str, JSONObject jSONObject);
    }

    @Deprecated(message = "Log相关已替换为Lark Logger实现")
    @JvmStatic
    public static final void setEnableLog(boolean z) {
    }

    @JvmStatic
    public static final void setNewUserModeFast(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/applogbridge/AppLogProxy$SessionHook;", "Lcom/bytedance/applog/ISessionObserver;", "()V", "mSessionId", "", "getSessionId", "onSessionBatchEvent", "", "id", "", "sessionId", "app_log", "Lorg/json/JSONObject;", "onSessionStart", "onSessionTerminate", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.AppLogProxy$b */
    public static final class SessionHook implements AbstractC3423i {

        /* renamed from: a */
        private String f73074a = "";

        /* renamed from: a */
        public final String mo103491a() {
            return this.f73074a;
        }

        @Override // com.bytedance.applog.AbstractC3423i
        /* renamed from: a */
        public void mo13719a(long j, String str) {
            ArrayList arrayList;
            if (this.f73074a == null || str == null) {
                this.f73074a = str;
            }
            if (!TextUtils.equals(this.f73074a, str)) {
                this.f73074a = str;
            }
            synchronized (AppLogProxy.INSTANCE.getSESSION_HOOKLIST$applog_bridge_release()) {
                Object clone = AppLogProxy.INSTANCE.getSESSION_HOOKLIST$applog_bridge_release().clone();
                if (clone != null) {
                    arrayList = (ArrayList) clone;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.applogbridge.AppLogProxy.ISessionHook> /* = java.util.ArrayList<com.ss.android.lark.applogbridge.AppLogProxy.ISessionHook> */");
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ISessionHook) it.next()).mo103489a(str);
            }
        }

        @Override // com.bytedance.applog.AbstractC3423i
        /* renamed from: a */
        public void mo13720a(long j, String str, JSONObject jSONObject) {
            ArrayList arrayList;
            if (!TextUtils.isEmpty(str)) {
                synchronized (AppLogProxy.INSTANCE.getSESSION_HOOKLIST$applog_bridge_release()) {
                    Object clone = AppLogProxy.INSTANCE.getSESSION_HOOKLIST$applog_bridge_release().clone();
                    if (clone != null) {
                        arrayList = (ArrayList) clone;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.applogbridge.AppLogProxy.ISessionHook> /* = java.util.ArrayList<com.ss.android.lark.applogbridge.AppLogProxy.ISessionHook> */");
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ISessionHook) it.next()).mo103490a(str, jSONObject);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J@\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¨\u0006\u0019"}, d2 = {"com/ss/android/lark/applogbridge/AppLogProxy$sDataObserver$1", "Lcom/bytedance/applog/IDataObserver;", "onAbVidsChange", "", "vids", "", "extVids", "onIdLoaded", "did", "iid", "ssid", "onRemoteAbConfigGet", "changed", "", "abConfig", "Lorg/json/JSONObject;", "onRemoteConfigGet", "config", "onRemoteIdGet", "oldDid", "newDid", "oldIid", "newIid", "oldSsid", "newSsid", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.AppLogProxy$d */
    public static final class C29199d implements AbstractC3383b {
        @Override // com.bytedance.applog.AbstractC3383b
        /* renamed from: a */
        public void mo13629a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "vids");
            Intrinsics.checkParameterIsNotNull(str2, "extVids");
        }

        @Override // com.bytedance.applog.AbstractC3383b
        /* renamed from: b */
        public void mo13633b(boolean z, JSONObject jSONObject) {
        }

        C29199d() {
        }

        @Override // com.bytedance.applog.AbstractC3383b
        /* renamed from: a */
        public void mo13632a(boolean z, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "config");
            AppLogProxy.INSTANCE.notifyConfigChanged(z, jSONObject);
        }

        @Override // com.bytedance.applog.AbstractC3383b
        /* renamed from: a */
        public void mo13630a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "did");
            Intrinsics.checkParameterIsNotNull(str2, "iid");
            Intrinsics.checkParameterIsNotNull(str3, "ssid");
            AppLogProxy.INSTANCE.notifyDeviceIdLoaded(str, str2, str3);
        }

        @Override // com.bytedance.applog.AbstractC3383b
        /* renamed from: a */
        public void mo13631a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            Intrinsics.checkParameterIsNotNull(str, "oldDid");
            Intrinsics.checkParameterIsNotNull(str2, "newDid");
            Intrinsics.checkParameterIsNotNull(str3, "oldIid");
            Intrinsics.checkParameterIsNotNull(str4, "newIid");
            Intrinsics.checkParameterIsNotNull(str5, "oldSsid");
            Intrinsics.checkParameterIsNotNull(str6, "newSsid");
            AppLogProxy.INSTANCE.notifyDeviceIdChanged(z, str, str2, str3, str4, str5, str6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/applogbridge/AppLogProxy$setExtraParams$1", "Lcom/bytedance/applog/IExtraParams;", "getExtraParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.AppLogProxy$e */
    public static final class C29200e implements AbstractC3395d {

        /* renamed from: a */
        final /* synthetic */ HashMap f73077a;

        @Override // com.bytedance.applog.AbstractC3395d
        /* renamed from: a */
        public HashMap<String, String> mo13651a() {
            return this.f73077a;
        }

        C29200e(HashMap hashMap) {
            this.f73077a = hashMap;
        }
    }

    private AppLogProxy() {
    }

    @JvmStatic
    public static final void flush() {
        C3368a.m14038c();
    }

    @JvmStatic
    public static final void manualActivate() {
        C3368a.m14044g();
    }

    public final ArrayList<ISessionHook> getSESSION_HOOKLIST$applog_bridge_release() {
        return SESSION_HOOKLIST;
    }

    @JvmStatic
    public static final boolean getEncryptAndCompress() {
        return C3368a.m14043f();
    }

    @JvmStatic
    public static final void initDataObserver() {
        C3368a.m14010a(sDataObserver);
    }

    @JvmStatic
    public static final void initSessionHook() {
        C3368a.m14013a(sAppLogSessionHook);
    }

    @JvmStatic
    public static final boolean reportPhoneDetailInfo() {
        return C3368a.m14045h();
    }

    @JvmStatic
    public static final String getAid() {
        String e = C3368a.m14042e();
        Intrinsics.checkExpressionValueIsNotNull(e, "AppLog.getAid()");
        return e;
    }

    @JvmStatic
    public static final String getClientUdid() {
        String n = C3368a.m14051n();
        Intrinsics.checkExpressionValueIsNotNull(n, "AppLog.getClientUdid()");
        return n;
    }

    @JvmStatic
    public static final String getDid() {
        String i = C3368a.m14046i();
        Intrinsics.checkExpressionValueIsNotNull(i, "AppLog.getDid()");
        return i;
    }

    @JvmStatic
    public static final String getIid() {
        String k = C3368a.m14048k();
        Intrinsics.checkExpressionValueIsNotNull(k, "AppLog.getIid()");
        return k;
    }

    @JvmStatic
    public static final AbstractC3450b getNetConfig() {
        InitConfig aVar = sConfig;
        if (aVar != null) {
            return aVar.mo103497c();
        }
        return null;
    }

    @JvmStatic
    public static final String getOpenUdid() {
        String o = C3368a.m14052o();
        Intrinsics.checkExpressionValueIsNotNull(o, "AppLog.getOpenUdid()");
        return o;
    }

    @JvmStatic
    public static final String getSDKInnerDid() {
        JSONObject q = C3368a.m14054q();
        if (q != null) {
            return q.optString("device_id");
        }
        return null;
    }

    @JvmStatic
    public static final String getSessionId() {
        SessionHook bVar = sAppLogSessionHook;
        if (bVar != null) {
            return bVar.mo103491a();
        }
        return null;
    }

    @JvmStatic
    public static final String getSsid() {
        String l = C3368a.m14049l();
        Intrinsics.checkExpressionValueIsNotNull(l, "AppLog.getSsid()");
        return l;
    }

    @JvmStatic
    public static final String getUdid() {
        String j = C3368a.m14047j();
        Intrinsics.checkExpressionValueIsNotNull(j, "AppLog.getUdid()");
        return j;
    }

    @JvmStatic
    public static final String getUserUniqueId() {
        String m = C3368a.m14050m();
        Intrinsics.checkExpressionValueIsNotNull(m, "AppLog.getUserUniqueID()");
        return m;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.applogbridge.AppLogProxy$c */
    public static final class RunnableC29198c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f73075a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f73076b;

        RunnableC29198c(String str, JSONObject jSONObject) {
            this.f73075a = str;
            this.f73076b = jSONObject;
        }

        public final void run() {
            AppLogProxy appLogProxy = AppLogProxy.INSTANCE;
            CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = AppLogProxy.eventListeners;
            if (!copyOnWriteArraySet.isEmpty()) {
                for (WeakReference weakReference : copyOnWriteArraySet) {
                    AbstractC29201c cVar = (AbstractC29201c) weakReference.get();
                    if (cVar != null) {
                        cVar.mo103494a(this.f73075a, this.f73076b);
                    }
                }
            }
        }
    }

    @JvmStatic
    public static final void setAbSdkVersion(String str) {
        C3368a.m14034b(str);
    }

    @JvmStatic
    public static final void setAccount(Account account) {
        C3368a.m14006a(account);
    }

    @JvmStatic
    public static final void setEncryptAndCompress(boolean z) {
        C3368a.m14027a(z);
    }

    @JvmStatic
    public static final void setForbidReportPhoneDetailInfo(boolean z) {
        C3368a.m14037b(z);
    }

    @JvmStatic
    public static final void setHeaderInfo(HashMap<String, Object> hashMap) {
        C3368a.m14024a(hashMap);
    }

    @JvmStatic
    public static final void addEventObserver(AbstractC3387c cVar) {
        if (cVar != null) {
            C3368a.m14011a(cVar);
        }
    }

    @JvmStatic
    public static final void onPause(Context context) {
        if (context instanceof Activity) {
            C3368a.m14039c(context);
        }
    }

    @JvmStatic
    public static final void removeEventObserver(AbstractC3387c cVar) {
        if (cVar != null) {
            C3368a.m14032b(cVar);
        }
    }

    @JvmStatic
    public static final void setEventReportEnable(boolean z) {
        sEventReportEnable = Boolean.valueOf(z);
    }

    @JvmStatic
    public static final void addEventListener(AbstractC29201c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        eventListeners.add(new WeakReference<>(cVar));
    }

    @JvmStatic
    public static final boolean isNewUserMode(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C3368a.m14028a(context);
    }

    @JvmStatic
    public static final void onResume(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (context instanceof Activity) {
            C3368a.m14031b(context);
        }
    }

    @JvmStatic
    public static final void setAutoABConfig(boolean z) {
        C3424j b = C3368a.m14029b();
        if (b != null) {
            b.mo13748d(z);
        }
    }

    @JvmStatic
    public static final void setAutoActiveState(boolean z) {
        C3424j b = C3368a.m14029b();
        if (b != null) {
            b.mo13747c(z);
        }
    }

    @JvmStatic
    public static final void setUserUniqueId(String str) {
        C3368a.m14015a(str);
        Runnable runnable = sOnUidChanged;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JvmStatic
    public static final void silenceInBackground(boolean z) {
        C3424j b = C3368a.m14029b();
        if (b != null) {
            b.mo13744b(z);
        }
    }

    @JvmStatic
    public static final void addConfigChangeListener(IConfigChangeListener aVar) {
        if (aVar != null) {
            ArrayList<WeakReference<IConfigChangeListener>> arrayList = CONFIG_CHANGE_LISTENERS;
            synchronized (arrayList) {
                INSTANCE.add(aVar, arrayList);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @JvmStatic
    public static final void addDeviceIdListener(IDeviceIdListener bVar) {
        if (bVar != null) {
            ArrayList<WeakReference<IDeviceIdListener>> arrayList = DEVICEID_LISTENERS;
            synchronized (arrayList) {
                INSTANCE.add(bVar, arrayList);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Deprecated(message = "This function is deprecated, use onEventV3 instead", replaceWith = @ReplaceWith(expression = "onEventV3", imports = {}))
    @JvmStatic
    public static final void onEvent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
        } else {
            C3368a.m14040c(str);
        }
    }

    @JvmStatic
    public static final boolean removeConfigChangeListener(IConfigChangeListener aVar) {
        boolean remove;
        if (aVar == null) {
            return false;
        }
        ArrayList<WeakReference<IConfigChangeListener>> arrayList = CONFIG_CHANGE_LISTENERS;
        synchronized (arrayList) {
            remove = INSTANCE.remove(aVar, arrayList.iterator());
        }
        return remove;
    }

    @JvmStatic
    public static final boolean removeDeviceIdListener(IDeviceIdListener bVar) {
        boolean remove;
        if (bVar == null) {
            return false;
        }
        ArrayList<WeakReference<IDeviceIdListener>> arrayList = DEVICEID_LISTENERS;
        synchronized (arrayList) {
            remove = INSTANCE.remove(bVar, arrayList.iterator());
        }
        return remove;
    }

    @JvmStatic
    public static final void setETVerifyEnable(boolean z) {
        if (z) {
            C3460i.m14615a("https://log.snssdk.com");
            C3460i.m14617a(true);
            return;
        }
        C3460i.m14617a(false);
    }

    @JvmStatic
    public static final void setExtraParams(HashMap<String, String> hashMap) {
        boolean z;
        if (hashMap != null) {
            z = hashMap.isEmpty();
        } else {
            z = false;
        }
        if (!z) {
            C3368a.m14012a(new C29200e(hashMap));
        }
    }

    @JvmStatic
    public static final void setUidChangedListener(Runnable runnable) {
        Runnable runnable2;
        sOnUidChanged = runnable;
        if (!TextUtils.isEmpty(C3368a.m14050m()) && (runnable2 = sOnUidChanged) != null) {
            runnable2.run();
        }
    }

    private final void shallItOpenDebugMode(Context context) {
        try {
            if (isDebugPackage(context)) {
                String str = TAG;
                Log.m165389i(str, "Will open AppLog Debugger...");
                setEnableLog(true);
                Log.m165389i(str, "Done open AppLog Debugger...");
            }
        } catch (Throwable unused) {
        }
    }

    @JvmStatic
    public static final void addSessionHook(ISessionHook aVar) {
        if (aVar != null) {
            ArrayList<ISessionHook> arrayList = SESSION_HOOKLIST;
            synchronized (arrayList) {
                if (!arrayList.contains(aVar)) {
                    if (sAppLogSessionHook == null) {
                        SessionHook bVar = new SessionHook();
                        sAppLogSessionHook = bVar;
                        C3368a.m14013a(bVar);
                    }
                    arrayList.add(aVar);
                }
            }
        }
    }

    @JvmStatic
    public static final void getSsidGroup(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        C3368a.m14025a(map);
        if (map.size() != 4) {
            String str = TAG;
            Log.m165383e(str, "getSsidGroup not right, param size is " + map.size());
        }
    }

    private final boolean isDebugPackage(Context context) {
        String packageName;
        boolean z;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return false;
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!StringsKt.contains$default((CharSequence) packageName, (CharSequence) "debug", false, 2, (Object) null) || !z) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final void removeEventListener(AbstractC29201c cVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        Iterator<T> it = eventListeners.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual((AbstractC29201c) t.get(), cVar)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            eventListeners.remove(t2);
        }
    }

    @JvmStatic
    public static final void removeSessionHook(ISessionHook aVar) {
        SessionHook bVar;
        if (aVar != null) {
            ArrayList<ISessionHook> arrayList = SESSION_HOOKLIST;
            synchronized (arrayList) {
                arrayList.remove(aVar);
                if (arrayList.isEmpty() && (bVar = sAppLogSessionHook) != null) {
                    C3368a.m14033b(bVar);
                    sAppLogSessionHook = null;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @JvmStatic
    public static final void setSendLogUrlRuntime(String[] strArr) {
        List<String> list;
        sSendLogUrls = strArr;
        if (sConfig != null) {
            UriConfigCreator bVar = UriConfigCreator.f73091a;
            InitConfig aVar = sConfig;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            String d = aVar.mo103498d();
            if (strArr != null) {
                list = C69043h.m265716a(strArr);
            } else {
                list = null;
            }
            C3368a.m14014a(bVar.mo103502a(d, list));
        }
        String str = TAG;
        Log.m165389i(str, "set setSendLogUrlRuntime " + strArr);
    }

    @JvmStatic
    public static final void setUriRuntime(String str) {
        List<String> list;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "sdkDomain");
        if (sConfig != null) {
            String[] strArr = sSendLogUrls;
            if (strArr != null) {
                if (strArr == null) {
                    Intrinsics.throwNpe();
                }
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String[] strArr2 = sSendLogUrls;
                    if (strArr2 == null) {
                        Intrinsics.throwNpe();
                    }
                    list = C69043h.m265786k(strArr2);
                    C3368a.m14014a(UriConfigCreator.f73091a.mo103502a(str, list));
                }
            }
            InitConfig aVar = sConfig;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            list = aVar.mo103499e();
            C3368a.m14014a(UriConfigCreator.f73091a.mo103502a(str, list));
        }
        String str2 = TAG;
        Log.m165389i(str2, "set applog run env is " + str);
    }

    @JvmStatic
    public static final <T> T getAbConfig(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return (T) C3368a.m14004a(str, (Object) t);
    }

    @JvmStatic
    public static final <T> T getHeaderValue(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return (T) C3368a.m14030b(str, (Object) t);
    }

    @JvmStatic
    public static final void onMiscEvent(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "logType");
        Intrinsics.checkParameterIsNotNull(jSONObject, "obj");
        C3368a.m14036b(str, jSONObject);
    }

    @JvmStatic
    public static final void setAppLanguageAndRegion(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        Intrinsics.checkParameterIsNotNull(str2, "region");
        C3368a.m14019a(str, str2);
    }

    @JvmStatic
    public static final void setNewUserMode(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        C3368a.m14009a(context, z);
    }

    private final <T> void add(T t, ArrayList<WeakReference<T>> arrayList) {
        if (t != null && !contains(t, arrayList.iterator())) {
            arrayList.add(new WeakReference<>(t));
        }
    }

    private final <T> boolean contains(T t, Iterator<? extends WeakReference<T>> it) {
        if (!(t == null || it == null)) {
            while (it.hasNext()) {
                if (t.equals(((WeakReference) it.next()).get())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void notifyOnEvent(String str, JSONObject jSONObject) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC29198c(str, jSONObject));
    }

    @JvmStatic
    public static final void onEventV3(String str, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
        } else {
            C3368a.m14017a(str, bundle);
        }
    }

    @JvmStatic
    public static final void setCustomNetParams(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        HashMap<String, String> hashMap = mNetParamsMap;
        hashMap.put(str, str2);
        setExtraParams(hashMap);
    }

    @JvmStatic
    public static final void init(Context context, InitConfig aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        sContext = (Application) context.getApplicationContext();
        sConfig = aVar;
        C3424j a = InitConfigConverter.f73088a.mo103501a(context, aVar);
        if (a == null) {
            Intrinsics.throwNpe();
        }
        C3368a.m14007a(context, a);
    }

    @Deprecated(message = "This function is deprecated, use onEventV3 instead", replaceWith = @ReplaceWith(expression = "onEventV3", imports = {}))
    @JvmStatic
    public static final void onEvent(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "label");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
        } else {
            C3368a.m14035b(str, str2);
        }
    }

    @JvmStatic
    public static final void onEventV3(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
            return;
        }
        C3368a.m14022a(str, jSONObject);
        INSTANCE.notifyOnEvent(str, jSONObject);
    }

    private final <T> boolean remove(T t, Iterator<? extends WeakReference<T>> it) {
        if (!(t == null || it == null)) {
            while (it.hasNext()) {
                if (t.equals(((WeakReference) it.next()).get())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    public final void notifyConfigChanged(boolean z, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList<WeakReference<IConfigChangeListener>> arrayList2 = CONFIG_CHANGE_LISTENERS;
        synchronized (arrayList2) {
            Object clone = arrayList2.clone();
            if (clone != null) {
                arrayList = (ArrayList) clone;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IConfigChangeListener>> /* = java.util.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IConfigChangeListener>> */");
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "listeners.iterator()");
        while (it.hasNext()) {
            IConfigChangeListener aVar = (IConfigChangeListener) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.mo103493a(z, jSONObject);
            }
        }
    }

    @JvmStatic
    public static final String addNetCommonParams(Context context, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        String a = C3368a.m14005a(context, str, z);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppLog.addNetCommonParams(context, url, isApi)");
        return a;
    }

    public final void notifyDeviceIdLoaded(String str, String str2, String str3) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList<WeakReference<IDeviceIdListener>> arrayList = DEVICEID_LISTENERS;
        synchronized (arrayList) {
            Object clone = arrayList.clone();
            if (clone != null) {
                objectRef.element = (T) ((ArrayList) clone);
                Unit unit = Unit.INSTANCE;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IDeviceIdListener>> /* = java.util.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IDeviceIdListener>> */");
            }
        }
        Iterator it = objectRef.element.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "listeners.iterator()");
        while (it.hasNext()) {
            IDeviceIdListener bVar = (IDeviceIdListener) ((WeakReference) it.next()).get();
            if (bVar == null) {
                it.remove();
            } else {
                bVar.mo101371a(str, str2, str3);
            }
        }
    }

    @JvmStatic
    public static final void onInternalEventV3(String str, Bundle bundle, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Intrinsics.checkParameterIsNotNull(str4, "productType");
        C3368a.m14018a(str, bundle, str2, str3, str4);
    }

    @JvmStatic
    public static final void onInternalEventV3(String str, JSONObject jSONObject, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Intrinsics.checkParameterIsNotNull(str4, "productType");
        C3368a.m14023a(str, jSONObject, str2, str3, str4);
    }

    @Deprecated(message = "This function is deprecated, use onEventV3 instead", replaceWith = @ReplaceWith(expression = "onEventV3", imports = {}))
    @JvmStatic
    public static final void onEvent(String str, String str2, String str3, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "category");
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
        } else {
            C3368a.m14020a(str, str2, str3, j, j2);
        }
    }

    @Deprecated(message = "This function is deprecated, use onEventV3 instead", replaceWith = @ReplaceWith(expression = "onEventV3", imports = {}))
    @JvmStatic
    public static final void onEvent(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "category");
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        Boolean bool = sEventReportEnable;
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        if (!bool.booleanValue()) {
            Log.m165383e(TAG, "event report not enabled!");
        } else {
            C3368a.m14021a(str, str2, str3, j, j2, jSONObject);
        }
    }

    public final void notifyDeviceIdChanged(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList<WeakReference<IDeviceIdListener>> arrayList = DEVICEID_LISTENERS;
        synchronized (arrayList) {
            Object clone = arrayList.clone();
            if (clone != null) {
                objectRef.element = (T) ((ArrayList) clone);
                Unit unit = Unit.INSTANCE;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IDeviceIdListener>> /* = java.util.ArrayList<java.lang.ref.WeakReference<com.ss.android.lark.applogbridge.listener.IDeviceIdListener>> */");
            }
        }
        Iterator it = objectRef.element.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "listeners.iterator()");
        while (it.hasNext()) {
            IDeviceIdListener bVar = (IDeviceIdListener) ((WeakReference) it.next()).get();
            if (bVar == null) {
                it.remove();
            } else {
                bVar.mo101372a(z, str, str2, str3, str4, str5, str6);
            }
        }
    }
}
