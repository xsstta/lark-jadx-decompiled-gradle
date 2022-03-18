package com.ss.android.lark.magic.service;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.magic.ErrorInfo;
import com.ss.android.lark.biz.core.api.magic.IMagicLifecycleListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.apm.MagicApm;
import com.ss.android.lark.magic.apm.Ticker;
import com.ss.android.lark.magic.manis.IMagicProxy;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.magic.provider.TriggerResponse;
import com.ss.android.lark.magic.settings.UGMagicConfigHolder;
import com.ss.android.lark.utils.C57852m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J(\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u001e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J*\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J&\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0014J0\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002J2\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J\u001e\u0010)\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u001e\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u001e\u0010+\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\tJ4\u00100\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J*\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J \u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0018\u00104\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u00106\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H\u0002J\u0016\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/lark/magic/service/MagicLifecycleService;", "", "()V", "eventMap", "", "", "magicInterceptorMap", "Lcom/ss/android/lark/biz/core/api/IMagicInterceptor;", "magicLifecycleListenerMap", "Lcom/ss/android/lark/biz/core/api/magic/IMagicLifecycleListener;", "timeMap", "Lcom/ss/android/lark/magic/apm/Ticker;", "admitLifecycle", "", "uniqueTag", "event", "onPreCheckTime", "", "onCheckedTime", "canShow", "", "context", "Landroid/content/Context;", "scenarioId", "taskId", "getEvent", "handleSuiteCannotShow", "handleSystemCannotShow", "isInputManagerServiceShowing", "isTimeout", "onCancelOpen", "onChecked", "success", "errorInfo", "Lcom/ss/android/lark/biz/core/api/magic/ErrorInfo;", "onClosed", "submitted", "onIntercept", "reason", "detail", "onOpened", "onOpening", "onPreCheck", "onPreOpen", "registerInterceptor", "interceptor", "registerLifecycle", "lifecycleListener", "sendDidOpenEvent", "sendOpenTotalCost", "sendTriggerEvent", "sendWillOpenEvent", "setupTicker", "tearDownTicker", "tick", "lifeState", "transferToMain", "proxy", "Lcom/ss/android/lark/magic/manis/IMagicProxy;", "triggerResponse", "Lcom/ss/android/lark/magic/provider/TriggerResponse;", "unregisterInterceptor", "unregisterLifecycle", "Companion", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.e.b */
public final class MagicLifecycleService {

    /* renamed from: a */
    public static final MagicLifecycleService f105960a = new MagicLifecycleService();

    /* renamed from: b */
    public static final Companion f105961b = new Companion(null);

    /* renamed from: c */
    private final Map<String, IMagicLifecycleListener> f105962c = new ConcurrentHashMap(16);

    /* renamed from: d */
    private final Map<String, AbstractC29588w> f105963d = new ConcurrentHashMap(16);

    /* renamed from: e */
    private final Map<String, Ticker> f105964e = new ConcurrentHashMap(16);

    /* renamed from: f */
    private final Map<String, String> f105965f = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/magic/service/MagicLifecycleService$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/magic/service/MagicLifecycleService;", "inst", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.e.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final MagicLifecycleService mo150060a() {
            return MagicLifecycleService.f105960a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo150051a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "event");
        Log.m165389i("MagicLifecycle", "onPreCheck: uniqueTag=" + str + ", scenarioId=" + str2);
        m165633b(str, str3);
        m165630a(str, "onPreCheck");
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105687a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo150054a(String str, String str2, boolean z, ErrorInfo aVar) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Log.m165389i("MagicLifecycle", "onChecked: uniqueTag=" + str + ", scenarioId=" + str2 + ", success=" + z + ", errorInfo=" + aVar);
        m165636b(str, str2, z, aVar);
        if (z) {
            m165630a(str, "onChecked");
        } else {
            m165638c(str);
        }
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105691a(str, str2, z, aVar);
        }
    }

    /* renamed from: a */
    public final void mo150053a(String str, String str2, String str3, boolean z, ErrorInfo aVar) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Log.m165389i("MagicLifecycle", "onOpened: uniqueTag=" + str + ", scenarioId=" + str2 + ", taskId=" + str3 + ", success=" + z + ", errorInfo=" + aVar);
        if (z) {
            m165630a(str, "onOpened");
            m165634b(this, str, str2, str3, true, null, 16, null);
        } else {
            m165635b(str, str2, str3, false, aVar);
        }
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105690a(str, str2, str3, false, aVar);
        }
        m165638c(str);
    }

    /* renamed from: a */
    public final void mo150052a(String str, String str2, String str3, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Log.m165389i("MagicLifecycle", "onClosed: uniqueTag=" + str + ", scenarioId=" + str2 + ", taskId=" + str3 + ", submitted=" + z);
        m165630a(str, "onClosed");
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105689a(str, str2, str3, z);
        }
    }

    /* renamed from: a */
    public final boolean mo150055a(Context context, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        if (m165642f(str, str2, str3) || m165637b(context, str, str2, str3) || m165643g(str, str2, str3)) {
            return false;
        }
        AbstractC29588w wVar = this.f105963d.get(str2);
        if (wVar == null || wVar.mo105896a(str, str2, str3)) {
            return true;
        }
        m165631a(str, str2, str3, "custom", "");
        return false;
    }

    /* renamed from: a */
    public final void mo150050a(String str, String str2, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "event");
        Ticker b = m165633b(str, str2);
        b.mo149995a("onPreCheck", j);
        b.mo149995a("onChecked", j2);
    }

    private MagicLifecycleService() {
    }

    /* renamed from: c */
    private final void m165638c(String str) {
        this.f105964e.remove(str);
        this.f105965f.remove(str);
    }

    /* renamed from: d */
    private final String m165640d(String str) {
        String str2 = this.f105965f.get(str);
        if (str2 == null) {
            AbstractC41708a b = C41707a.m165544b();
            Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
            if (C57852m.m224554a(b.mo149998a())) {
                throw new RuntimeException("ERROR: event of tag:" + str + " is null.");
            }
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    /* renamed from: a */
    private final boolean m165632a(Context context) {
        if (context instanceof Activity) {
            return C41717a.m165627a((Activity) context);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo150056b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Log.m165389i("MagicLifecycle", "unregisterInterceptor: scenarioId=" + str);
        this.f105963d.remove(str);
    }

    /* renamed from: a */
    public final void mo150047a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Log.m165389i("MagicLifecycle", "unregisterLifecycle: scenarioId=" + str);
        this.f105962c.remove(str);
    }

    /* renamed from: b */
    private final Ticker m165633b(String str, String str2) {
        this.f105965f.put(str, str2);
        Ticker bVar = new Ticker();
        this.f105964e.put(str, bVar);
        return bVar;
    }

    /* renamed from: c */
    private final void m165639c(String str, String str2) {
        Ticker bVar = this.f105964e.get(str);
        if (bVar != null) {
            MagicApm.f105928a.mo149987a(str2, m165640d(str), bVar.mo149993a("onOpening", "onPreCheck"));
        }
    }

    /* renamed from: a */
    private final void m165630a(String str, String str2) {
        Ticker bVar = this.f105964e.get(str);
        if (bVar != null) {
            bVar.mo149994a(str2);
        }
    }

    /* renamed from: a */
    public final void mo150046a(IMagicProxy iMagicProxy, TriggerResponse eVar) {
        Intrinsics.checkParameterIsNotNull(iMagicProxy, "proxy");
        Intrinsics.checkParameterIsNotNull(eVar, "triggerResponse");
        Ticker bVar = this.f105964e.get(eVar.mo150042d());
        if (bVar != null) {
            iMagicProxy.transferLifecycleToMain(eVar.mo150042d(), eVar.mo150044f(), bVar.mo149996b("onPreCheck"), bVar.mo149996b("onChecked"));
            m165638c(eVar.mo150042d());
            return;
        }
        Log.m165397w("MagicLifecycle", "transferToMain -> ticker:" + eVar.mo150042d() + " should not be null");
    }

    /* renamed from: a */
    public final void mo150048a(String str, IMagicLifecycleListener bVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Log.m165389i("MagicLifecycle", "registerLifecycle: scenarioId=" + str);
        if (bVar != null) {
            this.f105962c.put(str, bVar);
        }
    }

    /* renamed from: a */
    public final void mo150049a(String str, AbstractC29588w wVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Log.m165389i("MagicLifecycle", "registerInterceptor: scenarioId=" + str);
        if (wVar != null) {
            this.f105963d.put(str, wVar);
        }
    }

    /* renamed from: e */
    private final void m165641e(String str, String str2, String str3) {
        MagicApm.f105928a.mo149988a(str2, m165640d(str), str3);
    }

    /* renamed from: f */
    private final boolean m165642f(String str, String str2, String str3) {
        Ticker bVar = this.f105964e.get(str);
        if (bVar == null) {
            return false;
        }
        long a = bVar.mo149993a("onOpening", "onPreCheck");
        if (a <= ((long) UGMagicConfigHolder.f105989a.mo150090b())) {
            return false;
        }
        m165631a(str, str2, str3, "timeout", String.valueOf(a));
        return true;
    }

    /* renamed from: g */
    private final boolean m165643g(String str, String str2, String str3) {
        AbstractC41708a b = C41707a.m165544b();
        if (b.mo150003f()) {
            m165631a(str, str2, str3, "suite", "vc");
            return true;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "dependency");
        if (b.mo150004g()) {
            m165631a(str, str2, str3, "suite", "appRating");
            return true;
        } else if (b.mo150005h()) {
            m165631a(str, str2, str3, "suite", "guide");
            return true;
        } else if (!b.mo150006i()) {
            return false;
        } else {
            m165631a(str, str2, str3, "suite", "drawer");
            return true;
        }
    }

    /* renamed from: c */
    public final void mo150058c(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Log.m165389i("MagicLifecycle", "onOpening: uniqueTag=" + str + ", scenarioId=" + str2 + ", taskId=" + str3);
        m165630a(str, "onOpening");
        m165639c(str, str2);
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105692b(str, str2, str3);
        }
    }

    /* renamed from: d */
    public final void mo150059d(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Log.m165389i("MagicLifecycle", "onCancelOpen: uniqueTag=" + str + ", scenarioId=" + str2 + ", taskId=" + str3);
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105693c(str, str2, str3);
        }
        m165638c(str);
    }

    /* renamed from: b */
    public final void mo150057b(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Log.m165389i("MagicLifecycle", "onPreOpen: uniqueTag=" + str + ", scenarioId=" + str2 + ", taskId=" + str3);
        m165641e(str, str2, str3);
        m165630a(str, "onPreOpen");
        IMagicLifecycleListener bVar = this.f105962c.get(str2);
        if (bVar != null) {
            bVar.mo105688a(str, str2, str3);
        }
    }

    /* renamed from: b */
    private final void m165636b(String str, String str2, boolean z, ErrorInfo aVar) {
        Ticker bVar = this.f105964e.get(str);
        if (bVar != null) {
            MagicApm.f105928a.mo149991a(z, str2, m165640d(str), bVar.mo149997c("onPreCheck"), aVar);
        }
    }

    /* renamed from: b */
    private final boolean m165637b(Context context, String str, String str2, String str3) {
        AbstractC41708a b = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b, "dependency");
        if (!b.mo150002e()) {
            m165631a(str, str2, str3, "system", "appForeground");
            return true;
        } else if (!m165632a(context)) {
            return false;
        } else {
            m165631a(str, str2, str3, "system", "inputMethod");
            return true;
        }
    }

    /* renamed from: b */
    private final void m165635b(String str, String str2, String str3, boolean z, ErrorInfo aVar) {
        Ticker bVar = this.f105964e.get(str);
        if (bVar != null) {
            MagicApm.f105928a.mo149992a(z, str2, m165640d(str), str3, bVar.mo149997c("onPreOpen"), aVar);
        }
    }

    /* renamed from: a */
    private final void m165631a(String str, String str2, String str3, String str4, String str5) {
        Log.m165389i("MagicLifecycle", "canShow: uniqueTag=" + str + ", canShow=false, reason=" + str4 + ':' + str5);
        MagicApm.f105928a.mo149989a(str2, m165640d(str), str3, str4, str5);
    }

    /* renamed from: a */
    public static /* synthetic */ void m165629a(MagicLifecycleService bVar, String str, String str2, boolean z, ErrorInfo aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            aVar = null;
        }
        bVar.mo150054a(str, str2, z, aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m165628a(MagicLifecycleService bVar, String str, String str2, String str3, boolean z, ErrorInfo aVar, int i, Object obj) {
        if ((i & 16) != 0) {
            aVar = null;
        }
        bVar.mo150053a(str, str2, str3, z, aVar);
    }

    /* renamed from: b */
    static /* synthetic */ void m165634b(MagicLifecycleService bVar, String str, String str2, String str3, boolean z, ErrorInfo aVar, int i, Object obj) {
        if ((i & 16) != 0) {
            aVar = null;
        }
        bVar.m165635b(str, str2, str3, z, aVar);
    }
}
