package com.tt.miniapp.jsbridge;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lynx.webview.TTWebSdk;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.settings.v2.handler.C66757aa;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.remotedebug.C67949a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0016\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/tt/miniapp/jsbridge/V8ShareManager;", "", "()V", "TAG", "", "V8_INIT_RESULT", "V8_INIT_RESULT_FAIL_V8", "", "V8_INIT_RESULT_FAIL_WEBVIEW", "V8_INIT_RESULT_SUCCESS", "abHasInit", "", "abTestSwitch", "disableWhenLaunch", "isSupportV8Share", "()Z", "isSupportV8Share$delegate", "Lkotlin/Lazy;", "isTTWebView", "isTTWebView$delegate", "launchDataInitCalled", "v8ShareFg", "getV8ShareFg", "v8ShareFg$delegate", "v8pipeInterfaces", "", "getV8pipeInterfaces", "()[J", "v8pipeInterfaces$delegate", "initV8PipeInterfaces", "isSnapshotLaunch", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "reportInitResult", "", "result", "updateAbResult", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.jsbridge.i */
public final class V8ShareManager {

    /* renamed from: a */
    public static final V8ShareManager f167231a = new V8ShareManager();

    /* renamed from: b */
    private static boolean f167232b;

    /* renamed from: c */
    private static boolean f167233c;

    /* renamed from: d */
    private static boolean f167234d = true;

    /* renamed from: e */
    private static boolean f167235e;

    /* renamed from: f */
    private static final Lazy f167236f = LazyKt.lazy(C66257c.INSTANCE);

    /* renamed from: g */
    private static final Lazy f167237g = LazyKt.lazy(C66255a.INSTANCE);

    /* renamed from: h */
    private static final Lazy f167238h = LazyKt.lazy(C66256b.INSTANCE);

    /* renamed from: i */
    private static final Lazy f167239i = LazyKt.lazy(C66258d.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.jsbridge.i$a */
    static final class C66255a extends Lambda implements Function0<Boolean> {
        public static final C66255a INSTANCE = new C66255a();

        C66255a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo231625a() {
        return ((Boolean) f167237g.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo231627b() {
        return ((Boolean) f167238h.getValue()).booleanValue();
    }

    private V8ShareManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.jsbridge.i$b */
    static final class C66256b extends Lambda implements Function0<Boolean> {
        public static final C66256b INSTANCE = new C66256b();

        C66256b() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            try {
                return TTWebSdk.isTTWebView();
            } catch (Exception e) {
                AppBrandLogger.m52829e("V8ShareManager", e);
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.jsbridge.i$c */
    static final class C66257c extends Lambda implements Function0<Boolean> {
        public static final C66257c INSTANCE = new C66257c();

        C66257c() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return HostDependManager.getInst().getFeatureGating("openplatform.gadget.v8port");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0016\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.jsbridge.i$d */
    static final class C66258d extends Lambda implements Function0<long[]> {
        public static final C66258d INSTANCE = new C66258d();

        C66258d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final long[] invoke() {
            try {
                if (V8ShareManager.f167231a.mo231627b()) {
                    return TTWebSdk.getV8PipeInterfaces();
                }
                AppBrandLogger.m52829e("V8ShareManager", "not ttWebView");
                return null;
            } catch (Exception e) {
                AppBrandLogger.m52829e("V8ShareManager", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo231626a(IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (f167235e) {
            return f167234d;
        }
        f167235e = true;
        SnapshotServiceImpl snapshotServiceImpl = (SnapshotServiceImpl) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
        if (snapshotServiceImpl != null) {
            AbstractC67538f a = C67432a.m262319a(iAppContext);
            Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
            AppInfoEntity appInfo = a.getAppInfo();
            String str = appInfo.version;
            Intrinsics.checkExpressionValueIsNotNull(appInfo, "appInfo");
            if (snapshotServiceImpl.enableSnapshot(str, appInfo.isPreview())) {
                AppBrandLogger.m52830i("V8ShareManager", "snapshot disable v8port");
                f167234d = true;
                return true;
            }
        }
        if (C24512a.m89385a(iAppContext.getAppId())) {
            AppBrandLogger.m52830i("V8ShareManager", "cache publish when launch disable v8port");
            f167234d = true;
            return true;
        }
        C67949a b = C67949a.m264516b();
        Intrinsics.checkExpressionValueIsNotNull(b, "VscDebugManager.getInstance()");
        if (b.mo235814c()) {
            AppBrandLogger.m52830i("V8ShareManager", "VscDebugManager disable v8port");
            f167234d = true;
            return true;
        }
        Boolean a2 = C66757aa.m260586a().mo232663a(iAppContext.getAppId());
        if (a2 != null) {
            boolean booleanValue = a2.booleanValue();
            AppBrandLogger.m52830i("V8ShareManager", "v8port setting result:" + booleanValue);
            boolean z = booleanValue ^ true;
            f167234d = z;
            return z;
        } else if (!f167232b) {
            AppBrandLogger.m52830i("V8ShareManager", "ab disable v8port");
            f167234d = true;
            return true;
        } else {
            AppBrandLogger.m52830i("V8ShareManager", "enable v8port");
            f167234d = false;
            return false;
        }
    }

    /* renamed from: a */
    public final void mo231624a(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (!f167233c) {
            f167233c = true;
            if (ProcessUtil.isMainProcess(context)) {
                f167232b = false;
            } else {
                f167232b = intent.getBooleanExtra("extra_ab_v8port_result", false);
            }
            AppBrandLogger.m52830i("V8ShareManager", "abResult:" + f167232b);
        }
    }
}
