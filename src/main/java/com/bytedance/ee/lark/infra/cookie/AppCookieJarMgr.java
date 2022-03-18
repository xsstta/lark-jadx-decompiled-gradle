package com.bytedance.ee.lark.infra.cookie;

import android.content.Context;
import android.webkit.CookieManager;
import com.bytedance.ee.lark.infra.cookie.p617b.C12758a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12763a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import okhttp3.CookieJar;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/bytedance/ee/lark/infra/cookie/AppCookieJarMgr;", "", "()V", "TAG", "", "hasSyncCookieToCookieManager", "", "getHasSyncCookieToCookieManager", "()Z", "setHasSyncCookieToCookieManager", "(Z)V", "map", "", "Lokhttp3/CookieJar;", "getMap", "()Ljava/util/Map;", "requestCookie", "Ljava/lang/ThreadLocal;", "requestCookie$annotations", "getRequestCookie", "()Ljava/lang/ThreadLocal;", "setRequestCookie", "(Ljava/lang/ThreadLocal;)V", "clearAllCookieHandler", "", "getCookieHandler", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "monitorCreator", "Lcom/bytedance/ee/lark/infra/foundation/utils/IMonitorCreator;", "syncCookieToCookieManager", "context", "Landroid/content/Context;", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.cookie.a */
public final class AppCookieJarMgr {

    /* renamed from: a */
    public static final AppCookieJarMgr f34120a = new AppCookieJarMgr();

    /* renamed from: b */
    private static final Map<String, CookieJar> f34121b = new LinkedHashMap();

    /* renamed from: c */
    private static boolean f34122c;

    /* renamed from: d */
    private static ThreadLocal<String> f34123d = new ThreadLocal<>();

    private AppCookieJarMgr() {
    }

    /* renamed from: b */
    public static final ThreadLocal<String> m52758b() {
        return f34123d;
    }

    /* renamed from: a */
    public final synchronized void mo48264a() {
        AppBrandLogger.m52830i("AppCookieJarMgr", "clearAllCookieHandler....");
        f34121b.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.lark.infra.cookie.a$a */
    static final class RunnableC12753a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IAppContext f34124a;

        /* renamed from: b */
        final /* synthetic */ Context f34125b;

        RunnableC12753a(IAppContext iAppContext, Context context) {
            this.f34124a = iAppContext;
            this.f34125b = context;
        }

        public final void run() {
            AppBrandLogger.m52830i("AppCookieJarMgr", "start sync cookie to cookie manager,appid:", this.f34124a.getAppId());
            AppCookiePersistentWrapper bVar = new AppCookiePersistentWrapper(this.f34124a);
            CommonCookiePersistentWrapper cVar = new CommonCookiePersistentWrapper(this.f34125b);
            List<Cookie> a = bVar.mo48275a();
            List<Cookie> a2 = cVar.mo48275a();
            LinkedHashSet<Cookie> linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(bVar.mo48282c(a));
            if (bVar.mo48279b()) {
                linkedHashSet.addAll(cVar.mo48282c(a2));
            }
            CookieManager instance = CookieManager.getInstance();
            if (!linkedHashSet.isEmpty()) {
                for (Cookie cookie : linkedHashSet) {
                    if (C12768c.m52791a().mo48293b(cookie.domain()) || C12768c.m52791a().mo48291a(cookie.domain())) {
                        instance.setCookie(cookie.domain(), cookie.toString());
                    }
                }
            }
            CookieManager.getInstance().flush();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized CookieJar m52756a(IAppContext iAppContext, IMonitorCreator iMonitorCreator) {
        synchronized (AppCookieJarMgr.class) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            String appId = iAppContext.getAppId();
            if (appId != null) {
                Map<String, CookieJar> map = f34121b;
                C12758a aVar = map.get(appId);
                if (aVar == null) {
                    aVar = new C12758a(iAppContext, iMonitorCreator);
                    Intrinsics.checkExpressionValueIsNotNull(appId, "it");
                    map.put(appId, aVar);
                }
                return aVar;
            }
            AppBrandLogger.m52829e("AppCookieJarMgr", "getCookieHandler");
            return null;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m52757a(Context context, IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (!C12763a.m52780a()) {
            AppBrandLogger.m52830i("AppCookieJarMgr", "fg is close,dot't sync to cookie manager");
        } else if (!f34122c) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().submit(new RunnableC12753a(iAppContext, context));
            f34122c = true;
        }
    }
}
