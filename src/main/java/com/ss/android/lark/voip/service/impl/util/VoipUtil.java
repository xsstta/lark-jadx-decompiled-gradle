package com.ss.android.lark.voip.service.impl.util;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u000eH\u0007J\b\u0010\u001c\u001a\u00020\u000eH\u0007J\b\u0010\u001d\u001a\u00020\u0014H\u0007J,\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010 \u001a\u00020\u0014H\u0007J\b\u0010!\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/voip/service/impl/util/VoipUtil;", "", "()V", "TIME", "", "callId", "", "caller", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "handler", "Landroid/os/Handler;", "intent", "Landroid/content/Intent;", "intentEnable", "", "mClearIntentRunnable", "Ljava/lang/Runnable;", "musicMuted", "ringingRunnable", "clearIntent", "", "continueMusic", "getCaller", "getIntent", "getLarkAppName", "context", "Landroid/content/Context;", "isIntentEnable", "isScreenOn", "muteMusic", "setIntent", "isInitiativeCall", "setIntentEnable", "wakeUp", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.util.a */
public final class VoipUtil {

    /* renamed from: a */
    public static final VoipUtil f143122a = new VoipUtil();

    /* renamed from: b */
    private static boolean f143123b;

    /* renamed from: c */
    private static Intent f143124c;

    /* renamed from: d */
    private static Handler f143125d;

    /* renamed from: e */
    private static final Runnable f143126e = RunnableC58194a.f143130a;

    /* renamed from: f */
    private static String f143127f;

    /* renamed from: g */
    private static Chatter f143128g;

    /* renamed from: h */
    private static final Runnable f143129h = RunnableC58195b.f143131a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.voip.service.impl.util.a$a */
    static final class RunnableC58194a implements Runnable {

        /* renamed from: a */
        public static final RunnableC58194a f143130a = new RunnableC58194a();

        RunnableC58194a() {
        }

        public final void run() {
            VoipUtil.m225812g();
        }
    }

    private VoipUtil() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m225809d() {
        return f143123b;
    }

    @JvmStatic
    /* renamed from: e */
    public static final Intent m225810e() {
        return f143124c;
    }

    @JvmStatic
    /* renamed from: f */
    public static final Chatter m225811f() {
        return f143128g;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m225808c() {
        f143123b = true;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m225806b() {
        Object systemService = C57977a.m224905c().getContext().getSystemService("power");
        if (systemService != null) {
            return ((PowerManager) systemService).isScreenOn();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.voip.service.impl.util.a$b */
    static final class RunnableC58195b implements Runnable {

        /* renamed from: a */
        public static final RunnableC58195b f143131a = new RunnableC58195b();

        RunnableC58195b() {
        }

        public final void run() {
            VoipUtil aVar = VoipUtil.f143122a;
            if (VoipUtil.f143124c != null) {
                VoipUtil aVar2 = VoipUtil.f143122a;
                if (VoipUtil.f143128g != null) {
                    VoipUtil aVar3 = VoipUtil.f143122a;
                    if (VoipUtil.f143127f != null) {
                        AbstractC57987d c = C57977a.m224905c();
                        Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
                        AbstractC57987d.AbstractC57995f notificationDependency = c.getNotificationDependency();
                        VoipUtil aVar4 = VoipUtil.f143122a;
                        notificationDependency.mo145488a(VoipUtil.f143127f);
                    }
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m225812g() {
        Handler handler = f143125d;
        if (handler != null) {
            handler.removeCallbacks(f143129h);
        }
        AbstractC57987d c = C57977a.m224905c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
        c.getNotificationDependency().mo145491b(f143127f);
        f143123b = false;
        f143124c = null;
        f143127f = null;
        f143128g = null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225803a() {
        Object systemService = C57977a.m224905c().getContext().getSystemService("power");
        if (systemService != null) {
            ((PowerManager) systemService).newWakeLock(268435466, "LARK://VOIP").acquire(30000);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m225802a(Context context) {
        if (context == null) {
            return null;
        }
        AbstractC57987d c = C57977a.m224905c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
        if (c.isGooglePlay()) {
            return context.getString(R.string.View_G_AppNameOverseas);
        }
        return context.getString(R.string.View_G_AppNameDomestic);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225804a(Intent intent, boolean z, String str, Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (f143123b) {
            f143124c = intent;
            if (f143125d == null) {
                f143125d = new Handler(Looper.getMainLooper());
            }
            Handler handler = f143125d;
            if (handler != null) {
                Runnable runnable = f143126e;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 30000);
            }
            if (!z && str != null && chatter != null) {
                f143127f = str;
                f143128g = chatter;
                Handler handler2 = f143125d;
                if (handler2 != null) {
                    handler2.removeCallbacks(f143129h);
                }
                Handler handler3 = f143125d;
                if (handler3 != null) {
                    handler3.postDelayed(f143129h, 1000);
                }
            }
        }
    }
}
