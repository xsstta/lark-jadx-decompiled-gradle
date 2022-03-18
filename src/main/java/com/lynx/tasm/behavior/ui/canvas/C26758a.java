package com.lynx.tasm.behavior.ui.canvas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import com.C1711a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.he.lynx.Drawable;
import com.he.lynx.Helium;
import com.he.lynx.HeliumApp;
import com.he.lynx.effect.SmashModelDownloader;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.loader.TTAppLoader;
import com.he.lynx.player.IHeliumPlayer;
import com.lynx.tasm.AbstractC26887e;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.utils.C26950g;
import com.lynx.tasm.utils.C26959m;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.a */
public class C26758a extends CanvasProvider implements C26950g.AbstractC26952a {

    /* renamed from: i */
    private static C26758a f66348i = new C26758a();

    /* renamed from: a */
    public HeliumApp f66349a;

    /* renamed from: b */
    public TTAppLoader f66350b;

    /* renamed from: c */
    public volatile boolean f66351c;

    /* renamed from: d */
    public AbstractC26776g f66352d = null;

    /* renamed from: e */
    public boolean f66353e = false;

    /* renamed from: f */
    public ContextWrapper f66354f = null;

    /* renamed from: g */
    public C26769b f66355g = new C26769b();

    /* renamed from: h */
    private C26772d f66356h;

    /* renamed from: j */
    private final HashMap<Long, ArrayList> f66357j = new HashMap<>();

    /* renamed from: k */
    private C26950g f66358k;

    /* renamed from: l */
    private volatile boolean f66359l = false;

    /* renamed from: m */
    private AbstractC26887e f66360m = null;

    /* renamed from: n */
    private AbstractC26771c f66361n = null;

    /* renamed from: o */
    private IHeliumPlayer.HeliumPlayerFactory f66362o = null;

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$c */
    public interface AbstractC26771c {
        /* renamed from: a */
        void mo95226a(C26906i iVar);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$f */
    public interface AbstractC26775f {
    }

    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$g */
    public interface AbstractC26776g {
        /* renamed from: a */
        void mo95227a(String[] strArr, AbstractC26775f fVar);

        /* renamed from: a */
        boolean mo95228a(String[] strArr);
    }

    /* renamed from: a */
    public static C26758a m97172a() {
        return f66348i;
    }

    /* renamed from: a */
    public void mo95201a(boolean z, String str) {
        if (z) {
            LLog.m96429e("LynxHelium", "!!! on helium fatal error " + str);
        } else {
            LLog.m96429e("LynxHelium", "on helium error " + str);
        }
        if (this.f66361n != null) {
            this.f66361n.mo95226a(new C26906i(str, z ? 501 : 502));
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: a */
    public void mo95200a(boolean z) {
        if (!this.f66351c) {
            if (Build.VERSION.SDK_INT <= 18) {
                mo95201a(true, "Helium do not support android version lower than 4.3");
            } else if (this.f66354f == null) {
                mo95201a(true, "LynxHelium init first");
            } else if (!mo95202a("lynx_helium")) {
                mo95201a(true, "Helium load lynx_helium failed.");
            } else {
                Helium.setupEngine();
                if (!nativeInit(z) || this.f66349a.ptr == 0) {
                    mo95201a(true, "Helium setup failed.");
                    return;
                }
                this.f66350b.setup(null);
                this.f66355g.mo95224d();
                m97176e();
                this.f66351c = true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo95202a(String str) {
        try {
            AbstractC26887e eVar = this.f66360m;
            if (eVar != null) {
                eVar.loadLibrary(str);
            } else {
                C1711a.m7628a(str);
            }
            LLog.m96423b("LynxHelium", "Native Library " + str + " load success");
            return true;
        } catch (UnsatisfiedLinkError e) {
            String str2 = "Native Library " + str + " load with error message " + e.getMessage();
            LLog.m96429e("LynxHelium", str2);
            mo95201a(true, str2);
            return false;
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: a */
    public void mo95198a(LynxBaseUI lynxBaseUI) {
        Long d = lynxBaseUI instanceof LynxHeliumCanvas ? ((LynxHeliumCanvas) lynxBaseUI).mo53300d() : null;
        if (d == null) {
            LLog.m96429e("LynxHelium", "onLynxCreateCanvas canvas error");
            return;
        }
        synchronized (this.f66357j) {
            m97174c(d).add(new C26768a((LynxHeliumCanvas) lynxBaseUI));
            LLog.m96423b("LynxHelium", "onLynxCreateCanvas " + d + ", name " + lynxBaseUI.mo94933P());
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: a */
    public void mo95199a(Long l) {
        if (l == null) {
            LLog.m96429e("LynxHelium", "registerLynxRuntimeWithId error");
            return;
        }
        synchronized (this.f66357j) {
            m97174c(l);
        }
    }

    /* renamed from: a */
    public void mo95197a(View view) {
        final Drawable drawable;
        if (view != null) {
            Iterator<Drawable> it = this.f66349a.drawables.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                drawable = it.next();
                if (drawable.view == view) {
                    break;
                }
            }
        }
        drawable = null;
        if (drawable != null) {
            nativeRunOnJSThread(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.canvas.C26758a.RunnableC267602 */

                public void run() {
                    if (C26758a.this.f66349a != null) {
                        C26758a.this.f66349a.removeView(drawable);
                    }
                }
            });
            LLog.m96423b("LynxHelium", "removeCanvasWeakReference from helium ");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean onValidateEffectFromJS() {
        return mo95206b(true);
    }

    /* renamed from: e */
    private void m97176e() {
        IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory;
        HeliumApp heliumApp = this.f66349a;
        if (heliumApp != null && (heliumPlayerFactory = this.f66362o) != null) {
            heliumApp.setHeliumPlayerFactory(heliumPlayerFactory);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$b */
    public class C26769b implements SmashModelDownloader.IUrlHandler {

        /* renamed from: a */
        String f66380a = null;

        /* renamed from: b */
        String f66381b = null;

        /* renamed from: c */
        String f66382c = null;

        /* renamed from: d */
        boolean f66383d = true;

        /* renamed from: e */
        boolean f66384e = true;

        /* renamed from: f */
        boolean f66385f = false;

        /* renamed from: g */
        boolean f66386g = true;

        /* renamed from: h */
        boolean f66387h = false;

        /* renamed from: i */
        boolean f66388i = true;

        /* renamed from: a */
        public static Thread m97192a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo95220a(String str) {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo95224d() {
            if (this.f66385f) {
                Helium.setLiteExternalEffectLibraryPath(mo95222b() + "liblynxeffect-smash.default.ndk21-4.7.0.so");
            }
        }

        @Override // com.he.lynx.effect.SmashModelDownloader.IUrlHandler
        public String smashBaseUrl() {
            if (this.f66384e) {
                String a = mo95220a("SMASH_DOWNLOAD_BASE");
                if (!TextUtils.isEmpty(a)) {
                    return a;
                }
            }
            return this.f66381b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo95219a() {
            if (this.f66383d) {
                String a = mo95220a("EFFECT_LIBRARY_DOWNLOAD_BASE");
                if (!TextUtils.isEmpty(a)) {
                    return a;
                }
            }
            return this.f66380a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo95223c() {
            if (!this.f66387h && !TextUtils.isEmpty(mo95219a())) {
                m97192a(new Thread(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C26769b.RunnableC267701 */

                    public void run() {
                        if (!C26769b.this.f66387h) {
                            LLog.m96423b("LynxHelium", "Start to preload effect library ");
                            C26758a.this.f66355g.mo95221a(true);
                        }
                    }
                })).start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo95222b() {
            if (!TextUtils.isEmpty(this.f66382c)) {
                return this.f66382c + "/";
            } else if (C26758a.this.f66354f == null) {
                return null;
            } else {
                return C26758a.this.f66354f.getCacheDir().getAbsolutePath() + "/com.he.lynx.effect/";
            }
        }

        C26769b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo95221a(boolean z) {
            String str;
            String b = mo95222b();
            if (this.f66386g) {
                LLog.m96423b("LynxHelium", "has effect library " + b);
                return true;
            }
            this.f66387h = true;
            if (z) {
                str = mo95219a();
            } else {
                str = null;
            }
            boolean requestResource = SmashModelDownloader.requestResource("liblynxeffect-smash.default.ndk21-4.7.0.so", b, 3111364, null, str);
            this.f66387h = false;
            if (!requestResource) {
                LLog.m96423b("LynxHelium", "has effect library " + b);
                return false;
            }
            this.f66386g = true;
            if (C26758a.this.f66351c && C26758a.this.f66349a != null) {
                mo95224d();
            }
            return true;
        }
    }

    /* renamed from: d */
    private void m97175d() {
        HeliumApp.setFatalErrorHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C267646 */

            @Override // com.he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                C26758a.this.mo95201a(true, str);
            }
        });
        HeliumApp.setUncaughtExceptionHandler(new HeliumApp.ScriptErrorHandler() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C267657 */

            @Override // com.he.lynx.HeliumApp.ScriptErrorHandler
            public void handle(String str) {
                C26758a.this.mo95201a(false, str);
            }
        });
    }

    /* renamed from: b */
    public void mo95203b() {
        if (this.f66351c) {
            LLog.m96423b("LynxHelium", "Pause");
            C26950g gVar = this.f66358k;
            if (gVar != null) {
                gVar.mo95802c();
            }
            if (this.f66349a != null) {
                nativeRunOnJSThread(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.C26758a.RunnableC267591 */

                    public void run() {
                        if (C26758a.this.f66349a != null) {
                            C26758a.this.f66349a.pause();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public void mo95207c() {
        if (this.f66351c) {
            LLog.m96423b("LynxHelium", "Resume");
            C26950g gVar = this.f66358k;
            if (gVar != null) {
                gVar.mo95803d();
            }
            if (this.f66349a != null) {
                nativeRunOnJSThread(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.C26758a.RunnableC267613 */

                    public void run() {
                        if (C26758a.this.f66349a != null) {
                            C26758a.this.f66349a.resume();
                        }
                    }
                });
            }
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: b */
    public void mo95204b(Context context) {
        mo95195a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$d */
    public class C26772d implements HeliumApp.LynxDelegate {
        C26772d() {
        }

        @Override // com.he.lynx.HeliumApp.LynxDelegate
        public void runOnJsThread(Runnable runnable) {
            C26758a.this.nativeRunOnJSThread(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$e */
    public class C26773e implements MediaLoader {
        C26773e() {
        }

        @Override // com.he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            if (C26758a.this.f66350b != null) {
                return C26758a.this.f66350b.loadMedia(str);
            }
            return null;
        }

        @Override // com.he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, final MediaLoader.Responder responder) {
            String str;
            if (responder != null) {
                if (requestParams == null || (!requestParams.video && !requestParams.audio)) {
                    responder.onResponse(true);
                    return;
                }
                if (requestParams.video && requestParams.effect && !C26758a.this.f66355g.f66386g) {
                    C26758a.this.f66355g.mo95221a(true);
                }
                if (C26758a.this.f66352d == null) {
                    LLog.m96427d("LynxHelium", "WARNING: PermissionHandler not set!!!");
                    responder.onResponse(true);
                    return;
                }
                String[] strArr = new String[1];
                if (requestParams.audio) {
                    str = "android.permission.RECORD_AUDIO";
                } else {
                    str = "android.permission.CAMERA";
                }
                strArr[0] = str;
                if (C26758a.this.f66352d.mo95228a(strArr)) {
                    responder.onResponse(true);
                } else {
                    C26758a.this.f66352d.mo95227a(strArr, new AbstractC26775f() {
                        /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C26773e.C267741 */
                    });
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.provider.CanvasProvider
    public void executeRunnableCalledOnJSThread(Runnable runnable) {
        if (this.f66351c) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.provider.CanvasProvider
    public void onJSException(String str) {
        mo95201a(true, str);
    }

    /* renamed from: c */
    private ArrayList m97174c(Long l) {
        ArrayList arrayList = this.f66357j.get(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f66357j.put(l, arrayList);
        }
        if (!this.f66359l) {
            this.f66359l = true;
        }
        C26950g gVar = this.f66358k;
        if (gVar != null) {
            gVar.mo95800a();
        }
        return arrayList;
    }

    @Override // com.lynx.tasm.utils.C26950g.AbstractC26952a
    /* renamed from: a */
    public void mo95194a(final long j) {
        if (this.f66351c && this.f66359l && this.f66349a != null) {
            nativeRunOnJSThread(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.canvas.C26758a.RunnableC267679 */

                public void run() {
                    if (C26758a.this.f66349a != null) {
                        C26758a.this.f66349a.doFrame(j);
                        JSProxy.m97705a(j / 1000000);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo95206b(boolean z) {
        if (this.f66355g.mo95221a(false)) {
            return true;
        }
        if (z) {
            this.f66355g.mo95223c();
        }
        return false;
    }

    /* renamed from: a */
    private void m97173a(ContextWrapper contextWrapper) {
        if (Build.VERSION.SDK_INT <= 18) {
            mo95201a(true, "Helium do not support android version lower than 4.3");
            return;
        }
        m97175d();
        HeliumApp.setLoadSoInHostCallback(new HeliumApp.LoadSoInHostCallback() {
            /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C267668 */

            @Override // com.he.lynx.HeliumApp.LoadSoInHostCallback
            public void loadSoInHost(String str, HeliumApp.LoadSoCallback loadSoCallback) {
                boolean z;
                String str2;
                try {
                    if (str.endsWith(".so") && str.startsWith("lib")) {
                        str = str.substring(3, str.length() - 3);
                    }
                    z = C26758a.this.mo95202a(str);
                    str2 = "";
                } catch (Throwable th) {
                    str2 = th.getMessage();
                    z = false;
                }
                if (loadSoCallback != null) {
                    loadSoCallback.complete(z, str2);
                }
            }
        });
        this.f66349a = new HeliumApp(contextWrapper, this.f66356h);
        this.f66350b = new TTAppLoader(new C26777b(contextWrapper, null));
        this.f66349a.mediaLoader = new C26773e();
        this.f66351c = false;
        SmashModelDownloader.mUrlHandler = this.f66355g;
        SmashModelDownloader.mUseVersionForEffectRender = this.f66355g.f66388i;
        mo95195a((Context) contextWrapper);
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: b */
    public void mo95205b(Long l) {
        C26950g gVar;
        if (l == null) {
            LLog.m96429e("LynxHelium", "onLynxRuntimeDestroy runtimeId error");
            return;
        }
        LLog.m96423b("LynxHelium", "onLynxRuntimeDestroy " + l);
        final ArrayList arrayList = new ArrayList();
        synchronized (this.f66357j) {
            ArrayList arrayList2 = this.f66357j.get(l);
            boolean z = true;
            if (arrayList2 != null) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    arrayList.add(((C26768a) arrayList2.get(size)).f66378b);
                }
                this.f66357j.remove(l);
            }
            if (this.f66357j.isEmpty()) {
                z = false;
            }
            this.f66359l = z;
            if (!this.f66359l && (gVar = this.f66358k) != null) {
                gVar.mo95801b();
            }
        }
        if (this.f66351c && !arrayList.isEmpty()) {
            nativeRunOnJSThread(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.canvas.C26758a.AnonymousClass10 */

                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C26758a.this.mo95197a((View) it.next());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo95195a(final Context context) {
        if (!C26959m.m97972a()) {
            if (this.f66358k == null) {
                C26959m.m97969a(new Runnable() {
                    /* class com.lynx.tasm.behavior.ui.canvas.C26758a.RunnableC267624 */

                    public void run() {
                        C26758a.this.mo95195a(context);
                    }
                });
            }
        } else if (this.f66358k == null) {
            LLog.m96423b("LynxHelium", "initForFrameCallback");
            this.f66358k = new C26950g(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            m97170a(context, new BroadcastReceiver() {
                /* class com.lynx.tasm.behavior.ui.canvas.C26758a.C267635 */

                public void onReceive(Context context, Intent intent) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        if (!C26758a.this.f66353e) {
                            C26758a.this.mo95207c();
                        }
                    } else if (!"android.intent.action.SCREEN_OFF".equals(action)) {
                        "android.intent.action.USER_PRESENT".equals(action);
                    } else if (!C26758a.this.f66353e) {
                        C26758a.this.mo95203b();
                    }
                }
            }, intentFilter);
            if (this.f66359l) {
                LLog.m96423b("LynxHelium", "initForFrameCallback mFrameRateControl.start()");
                this.f66358k.mo95800a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.canvas.a$a */
    public class C26768a {

        /* renamed from: a */
        public WeakReference<LynxHeliumCanvas> f66377a;

        /* renamed from: b */
        public View f66378b;

        public C26768a(LynxHeliumCanvas lynxHeliumCanvas) {
            if (lynxHeliumCanvas != null) {
                this.f66377a = new WeakReference<>(lynxHeliumCanvas);
                this.f66378b = lynxHeliumCanvas.av();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.provider.CanvasProvider
    public boolean setupHeliumApp(long j, long[] jArr) {
        this.f66349a.ptr = Helium.setupLite(DisplayMetricsHolder.m97898a().density, this.f66349a, j, jArr, this.f66354f.getAssets(), this.f66354f.getCacheDir().getAbsolutePath(), this.f66355g.f66388i, this.f66355g.f66388i);
        if (this.f66349a.ptr != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private LynxHeliumCanvas m97171a(String str, Long l) {
        synchronized (this.f66357j) {
            ArrayList arrayList = this.f66357j.get(l);
            if (arrayList != null && !arrayList.isEmpty()) {
                LynxHeliumCanvas lynxHeliumCanvas = null;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    LynxHeliumCanvas lynxHeliumCanvas2 = ((C26768a) arrayList.get(size)).f66377a.get();
                    if (lynxHeliumCanvas2 != null && str.equals(lynxHeliumCanvas2.mo94933P())) {
                        if (Build.VERSION.SDK_INT < 19 || (lynxHeliumCanvas2.av() != null && ((LynxHeliumCanvasView) lynxHeliumCanvas2.av()).isAttachedToWindow())) {
                            LLog.m96423b("LynxHelium", "findCanvasById " + l + ", name " + str);
                            return lynxHeliumCanvas2;
                        }
                        lynxHeliumCanvas = lynxHeliumCanvas2;
                    }
                }
                if (lynxHeliumCanvas != null) {
                    LLog.m96423b("LynxHelium", "findCanvasById (not showing) " + l + ", name " + str);
                    return lynxHeliumCanvas;
                }
            }
            LLog.m96423b("LynxHelium", "findCanvasById" + l + ", name " + str + ", find null");
            return null;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m97170a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    @Override // com.lynx.tasm.provider.CanvasProvider
    /* renamed from: a */
    public long mo95193a(String str, Long l, boolean z) {
        if (str == null || l == null) {
            LLog.m96429e("LynxHelium", "createCanvas error " + l + ", name " + str);
            return 0;
        }
        LynxHeliumCanvas a = m97171a(str, l);
        if (a == null || a.av() == null) {
            LLog.m96429e("LynxHelium", "findCanvasById result null " + l + ", name " + str);
            return 0;
        }
        mo95200a(z);
        try {
            Drawable addView = this.f66349a.addView((TextureView) a.av());
            if (addView != null) {
                LLog.m96423b("LynxHelium", "createCanvas " + l + ", name " + str);
                return addView.ptr;
            }
            LLog.m96423b("LynxHelium", "createCanvas error addView return null " + l + ", name " + str);
            return 0;
        } catch (RuntimeException e) {
            LLog.m96429e("LynxHelium", "createCanvas error addView exception " + e.toString() + ", " + l + ", name " + str);
        }
    }

    /* renamed from: a */
    public void mo95196a(ContextWrapper contextWrapper, AbstractC26887e eVar, AbstractC26771c cVar, AbstractC26776g gVar) {
        this.f66356h = new C26772d();
        this.f66360m = eVar;
        this.f66361n = cVar;
        this.f66352d = gVar;
        this.f66354f = contextWrapper;
        if (this.f66349a == null) {
            m97173a(contextWrapper);
        }
    }
}
