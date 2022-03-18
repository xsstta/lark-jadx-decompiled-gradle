package com.bytedance.lynx.webview.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.WebViewFactory;
import android.webkit.WebViewFactoryProvider;
import com.bytedance.lynx.p838a.C19891a;
import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.glue.TTWebProviderWrapper;
import com.bytedance.lynx.webview.p843b.C19925a;
import com.bytedance.lynx.webview.sdkadapt.C20025a;
import com.bytedance.lynx.webview.sdkadapt.Version;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20043d;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20050i;
import com.bytedance.lynx.webview.util.C20051j;
import com.bytedance.lynx.webview.util.MSReceiver;
import com.bytedance.lynx.webview.util.flipped.ModifiedFlipped;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.lynx.webview.internal.i */
public class C19958i {

    /* renamed from: a */
    public static AtomicReference<String> f48754a = new AtomicReference<>("SystemWebView");

    /* renamed from: b */
    public static AtomicReference<String> f48755b = new AtomicReference<>("");

    /* renamed from: c */
    public static AtomicReference<String> f48756c = new AtomicReference<>("0620010001");

    /* renamed from: e */
    private static final HashSet<String> f48757e = new HashSet<String>() {
        /* class com.bytedance.lynx.webview.internal.C19958i.C199591 */

        {
            add("com.bytedance.webview.chromium.WebViewChromiumFactoryProviderWrapper");
            add("com.bytedance.webview.chromium.WebViewChromiumFactoryProvider");
            add("com.bytedance.org.chromium.base.ContextUtils");
            add("com.bytedance.org.chromium.android_webview.AwBrowserProcess");
            add("com.bytedance.webview.chromium.WebViewChromium");
            add("com.bytedance.org.chromium.base.PathUtils");
            add("com.bytedance.org.chromium.base.PathService");
            add("com.bytedance.org.chromium.base.library_loader.LibraryLoader");
            add("com.bytedance.org.chromium.services.device.InterfaceRegistrar");
            add("com.bytedance.org.chromium.services.service_manager.InterfaceRegistry");
            add("com.bytedance.org.chromium.mojo.bindings.RouterImpl");
            add("com.bytedance.org.chromium.mojo.bindings.ExecutorFactory");
            add("com.bytedance.org.chromium.android_webview.AwContents");
            add("com.bytedance.org.chromium.android_webview.AwBrowserContext");
            add("com.bytedance.webview.chromium.WebViewContentsClientAdapter");
            add("com.bytedance.org.chromium.android_webview.AwContentsClient");
            add("com.bytedance.webview.chromium.ContentSettingsAdapter");
            add("com.bytedance.org.chromium.android_webview.AwSettings");
            add("com.bytedance.org.chromium.content_public.browser.NavigationController");
            add("com.bytedance.org.chromium.android_webview.AwContentsStatics");
            add("com.bytedance.webview.chromium.WebViewChromium$InternalAccessAdapter");
            add("com.bytedance.org.chromium.android_webview.AwContents$InternalAccessDelegate");
            add("com.bytedance.org.chromium.content.browser.ContentViewCore$InternalAccessDelegate");
            add("com.bytedance.webview.chromium.WebViewChromium$WebViewNativeDrawGLFunctorFactory");
            add("com.bytedance.org.chromium.android_webview.AwContents$NativeDrawGLFunctorFactory");
        }
    };

    /* renamed from: f */
    private static AtomicReference<Boolean> f48758f = new AtomicReference<>(false);

    /* renamed from: g */
    private static AtomicReference<Boolean> f48759g = new AtomicReference<>(false);

    /* renamed from: h */
    private static AtomicBoolean f48760h = new AtomicBoolean(false);

    /* renamed from: i */
    private static AtomicBoolean f48761i = new AtomicBoolean(false);

    /* renamed from: j */
    private static AtomicBoolean f48762j = new AtomicBoolean();

    /* renamed from: k */
    private static AtomicBoolean f48763k = new AtomicBoolean(false);

    /* renamed from: v */
    private static boolean f48764v = true;

    /* renamed from: d */
    public WebViewFactoryProvider f48765d;

    /* renamed from: l */
    private MappedByteBuffer f48766l;

    /* renamed from: m */
    private RandomAccessFile f48767m;

    /* renamed from: n */
    private FileChannel f48768n;

    /* renamed from: o */
    private FileLock f48769o;

    /* renamed from: p */
    private FileChannel f48770p;

    /* renamed from: q */
    private Handler f48771q;

    /* renamed from: r */
    private WebViewFactoryProvider f48772r;

    /* renamed from: s */
    private TTWebProviderWrapper f48773s;

    /* renamed from: t */
    private String f48774t = "";

    /* renamed from: u */
    private volatile ISdkToGlue f48775u;

    /* renamed from: com.bytedance.lynx.webview.internal.i$a */
    public interface AbstractC19968a {
        /* renamed from: a */
        void mo67795a(String str, String str2, String str3, boolean z);
    }

    /* renamed from: com.bytedance.lynx.webview.internal.i$c */
    public interface AbstractC19970c {
        /* renamed from: a */
        void mo67789a(String str, String str2, String str3);
    }

    /* renamed from: m */
    public static void m72807m() {
        f48764v = false;
    }

    /* renamed from: com.bytedance.lynx.webview.internal.i$b */
    public class C19969b {

        /* renamed from: b */
        private LoadEventType f48796b;

        /* renamed from: a */
        public LoadEventType mo67796a() {
            return this.f48796b;
        }

        /* renamed from: a */
        public void mo67797a(LoadEventType loadEventType) {
            this.f48796b = loadEventType;
        }

        C19969b(LoadEventType loadEventType) {
            this.f48796b = loadEventType;
        }
    }

    /* renamed from: d */
    public String mo67778d() {
        return this.f48774t;
    }

    /* renamed from: e */
    public ISdkToGlue mo67781e() {
        return this.f48775u;
    }

    /* renamed from: a */
    private static boolean m72792a(String[] strArr, String str, Context context) {
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            try {
                int length = strArr.length;
                Object[] objArr = new Object[length];
                int a = m72780a(strArr, str, context, objArr);
                ClassLoader classLoader = context.getClassLoader();
                Object obj = null;
                PathClassLoader pathClassLoader = null;
                int i = 0;
                while (true) {
                    if (classLoader == null) {
                        break;
                    }
                    if (classLoader instanceof PathClassLoader) {
                        pathClassLoader = (PathClassLoader) classLoader;
                        obj = m72782a(m72781a((BaseDexClassLoader) pathClassLoader));
                        i = Array.getLength(m72782a(m72781a((BaseDexClassLoader) pathClassLoader)));
                        if (i > 0) {
                            break;
                        }
                    }
                    classLoader = classLoader.getParent();
                }
                if (i > 0) {
                    if (pathClassLoader != null) {
                        Object newInstance = Array.newInstance(Array.get(obj, 0).getClass(), Array.getLength(obj) + a);
                        int i2 = 0;
                        for (int i3 = 0; i3 < length; i3++) {
                            Object obj2 = objArr[i3];
                            int length2 = Array.getLength(obj2);
                            int i4 = 0;
                            while (i4 < length2) {
                                Array.set(newInstance, i2, Array.get(obj2, i4));
                                i4++;
                                i2++;
                            }
                        }
                        for (int i5 = 0; i5 < Array.getLength(obj); i5++) {
                            Array.set(newInstance, a + i5, Array.get(obj, i5));
                        }
                        Object a2 = m72781a((BaseDexClassLoader) pathClassLoader);
                        Field declaredField = a2.getClass().getDeclaredField("dexElements");
                        declaredField.setAccessible(true);
                        declaredField.set(a2, newInstance);
                        return true;
                    }
                }
                C20048g.m73164d("addClassesToClassLoader can't find right classloader!");
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
                C20048g.m73164d("addClassesToClassLoader error is " + th.toString());
                C19938b.m72701a("addClassesToCLassLoader:" + th.toString());
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo67771a(Context context) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            TTWebProviderWrapper tTWebProviderWrapper = new TTWebProviderWrapper(true);
            Field declaredField = WebViewFactory.class.getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            declaredField.set(null, tTWebProviderWrapper);
            m72813s();
            if (m72804c(true)) {
                String t = m72814t();
                C20048g.m73161a("LibraryLoader", "Read type from shm: " + t);
                m72785a(t, (AbstractC19970c) new AbstractC19970c() {
                    /* class com.bytedance.lynx.webview.internal.C19958i.C199624 */

                    @Override // com.bytedance.lynx.webview.internal.C19958i.AbstractC19970c
                    /* renamed from: a */
                    public void mo67789a(String str, String str2, String str3) {
                        C20025a.m73069a(str2);
                        C19958i.f48755b.set(str3);
                    }
                });
                String str = f48755b.get();
                if (!m72792a(new String[]{C20050i.m73182d(str), C20050i.m73184e(str)}, C20050i.m73186f(str), context)) {
                    C20048g.m73164d("startRendererProcess addClassesToClassLoader error.");
                    C19943g.m72724a(EventType.RENDERER_PROCESS_HOOK_ERROR, (Object) null);
                }
                String a = C20050i.m73174a(str);
                this.f48775u = new C19925a(context);
                this.f48775u.loadLibrary(a);
                C19986s.m72924a().mo67863e();
                C19943g.m72724a(EventType.LOAD_TRACE_EVENT_START_RENDERER, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            C20048g.m73164d("startRendererProcess get md5 failed.");
            C19943g.m72724a(EventType.RENDERER_PROCESS_HOOK_ERROR, (Object) null);
        } catch (Throwable th) {
            C20048g.m73164d("startRendererProcess error:" + th.toString());
            C19943g.m72724a(EventType.RENDERER_PROCESS_HOOK_ERROR, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67773a(String str, String str2, AbstractC19968a aVar) {
        m72784a(C20011y.m72976a().mo67938u(), str, str2, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67772a(Runnable runnable) {
        try {
            Trace.beginSection("LibraryLoader.tryLoadEarly");
            C20048g.m73161a("call TTWebContext start tryLoadEarly => hookProviderWrapper begain");
            boolean b = m72796b(runnable);
            C20048g.m73161a("call TTWebContext start tryLoadEarly => hookProviderWrapper end hookret = " + b);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static boolean m72789a(String str) {
        return new File(C20050i.m73177b(str)).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084 A[Catch:{ all -> 0x00ba }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67775a(final java.lang.String r15, final java.lang.String r16, final java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19958i.mo67775a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2 A[Catch:{ all -> 0x00d5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67774a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19958i.mo67774a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    private boolean m72791a(boolean z) {
        boolean z2 = true;
        try {
            FileLock tryLock = this.f48768n.tryLock(0, 1, z);
            this.f48769o = tryLock;
            if (tryLock == null) {
                z2 = false;
            }
            return z2;
        } catch (IOException e) {
            C20048g.m73164d("LibraryLoader", "Failed to lock file " + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m72790a(String str, String str2) {
        if (!m72789a(str) || TextUtils.isEmpty(str2) || !C20025a.m73074e(str2)) {
            C20026a.m73080a(LoadEventType.ErrorCheck_success);
            return true;
        }
        C19943g.m72724a(EventType.LOAD_ERROR_MD5_AND_VERSION, str);
        return false;
    }

    C19958i() {
    }

    /* renamed from: f */
    public synchronized TTWebProviderWrapper mo67783f() {
        return this.f48773s;
    }

    /* renamed from: a */
    static String m72783a() {
        return f48754a.get();
    }

    /* renamed from: l */
    public static int m72806l() {
        int i;
        if (f48758f.get().booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        return i | f48759g.get().booleanValue();
    }

    /* renamed from: o */
    private boolean m72809o() {
        return C20011y.m72974M().equals(C20011y.m72976a().mo67939v().mo67837h());
    }

    /* renamed from: p */
    private boolean m72810p() {
        if (Build.VERSION.SDK_INT == C20011y.m72976a().mo67939v().mo67835g()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private void m72812r() {
        C20048g.m73161a("preInitFinish");
        C20011y.m72976a().mo67935r();
    }

    /* renamed from: h */
    public WebViewFactoryProvider mo67785h() {
        WebViewFactoryProvider webViewFactoryProvider = this.f48772r;
        if (webViewFactoryProvider != null) {
            return webViewFactoryProvider;
        }
        synchronized (this) {
            WebViewFactoryProvider webViewFactoryProvider2 = this.f48772r;
            if (webViewFactoryProvider2 != null) {
                return webViewFactoryProvider2;
            }
            WebViewFactoryProvider a = C19997u.m72950a();
            this.f48772r = a;
            return a;
        }
    }

    /* renamed from: n */
    private boolean m72808n() {
        synchronized (this) {
            try {
                this.f48765d = null;
                m72812r();
            } catch (Exception e) {
                C20048g.m73164d("LibraryLoader", "Create system provider error: " + e.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m72811q() {
        if (!f48758f.get().booleanValue() || !C20011y.m72976a().mo67939v().mo67823b()) {
            return false;
        }
        C20011y.m72992b(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19958i.RunnableC199646 */

            public void run() {
                C20044e.m73151a((HashSet<String>) null);
                C20011y.m72976a().mo67939v().mo67816a(false);
            }
        });
        C20048g.m73164d("LibraryLoader", "use systemwebview for crash upto limit !");
        return true;
    }

    /* renamed from: t */
    private String m72814t() {
        try {
            byte[] bArr = new byte[1024];
            int i = 0;
            while (true) {
                if (i >= 1024) {
                    break;
                }
                byte b = this.f48766l.get(i);
                if (b == 0) {
                    break;
                }
                bArr[i] = b;
                i++;
            }
            return new String(bArr, 0, i);
        } catch (Exception e) {
            C20048g.m73164d("read shm error:" + e.toString());
            return null;
        }
    }

    /* renamed from: g */
    public WebViewFactoryProvider mo67784g() {
        WebViewFactoryProvider webViewFactoryProvider = this.f48765d;
        if (webViewFactoryProvider != null) {
            return webViewFactoryProvider;
        }
        synchronized (this) {
            WebViewFactoryProvider webViewFactoryProvider2 = this.f48765d;
            if (webViewFactoryProvider2 != null) {
                return webViewFactoryProvider2;
            }
            if (f48754a.get().equals("SystemWebView")) {
                return mo67785h();
            }
            C20048g.m73164d("LibraryLoader", "Glue provider sync error.");
            C19943g.m72724a(EventType.LOAD_GLUE_SYNC_ERROR, (Object) null);
            return null;
        }
    }

    /* renamed from: j */
    public void mo67787j() {
        f48754a.set("SystemWebView");
        m72808n();
        TTWebProviderWrapper f = C20011y.m72976a().mo67902F().mo67783f();
        if (f != null) {
            f.resetGlueProvider(mo67784g());
        }
        C19943g.m72724a(EventType.LOAD_FALLBACK_TO_SYSTEM, (Object) null);
    }

    /* renamed from: b */
    public static void m72795b() {
        if (f48754a.get().equals("SystemWebView") && C20011y.m73008f()) {
            f48760h.compareAndSet(false, true);
            TTWebProviderWrapper f = C20011y.m72976a().mo67902F().mo67783f();
            if (f != null) {
                C20048g.m73161a("LibraryLoader", "ttwebview prepared, start to hot reload.");
                f.ensureFactoryProviderCreated(true);
            }
        }
    }

    /* renamed from: c */
    public static boolean m72801c() {
        if (f48760h.get()) {
            return f48761i.getAndSet(true);
        }
        return true;
    }

    /* renamed from: i */
    public void mo67786i() {
        ClassLoader classLoader = C20011y.m72976a().mo67938u().getClassLoader();
        try {
            Trace.beginSection("LibraryLoader.doPreInit.loadClass");
            if (!this.f48775u.preloadClasses()) {
                Iterator<String> it = f48757e.iterator();
                while (it.hasNext()) {
                    classLoader.loadClass(it.next());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C20048g.m73164d("doPreInit error:" + e.toString());
        } catch (Throwable th) {
            m72812r();
            Trace.endSection();
            throw th;
        }
        m72812r();
        Trace.endSection();
    }

    /* renamed from: k */
    public void mo67788k() {
        try {
            WebViewFactoryProvider g = mo67784g();
            String str = "org.chromium.base.ThreadUtils";
            if (m72783a().equals("TTWebView")) {
                str = "com.bytedance.org.chromium.base.ThreadUtils";
            }
            Field declaredField = Class.forName(str, false, g.getClass().getClassLoader()).getDeclaredField("sWillOverride");
            declaredField.setAccessible(true);
            declaredField.set(null, false);
            Class.forName(str, false, g.getClass().getClassLoader()).getDeclaredMethod("runningOnUiThread", new Class[0]).invoke(null, new Object[0]);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: s */
    private void m72813s() {
        try {
            File file = new File(C20050i.m73175b());
            if (!file.exists()) {
                file.mkdirs();
            }
            if (this.f48767m == null) {
                this.f48767m = new RandomAccessFile(new File(C20050i.m73191i()), "rw");
            }
            if (this.f48766l == null) {
                FileChannel channel = this.f48767m.getChannel();
                this.f48768n = channel;
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);
                this.f48766l = map;
                map.load();
            }
            if (this.f48770p == null) {
                this.f48770p = new RandomAccessFile(new File(C20050i.m73189h()), "rw").getChannel();
            }
        } catch (Exception e) {
            C20048g.m73164d("LibraryLoader", "initialize shm failed." + e.toString());
        }
    }

    /* renamed from: b */
    public static boolean m72797b(String str) {
        return new File(C20050i.m73184e(str)).exists();
    }

    /* renamed from: c */
    public static boolean m72803c(String str) {
        return new File(C20050i.m73180c(str)).exists();
    }

    /* renamed from: d */
    public void mo67779d(final Context context) {
        C20011y.m72986a(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19958i.RunnableC199613 */

            public void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.bytedance.lynx.webview.util.MSACTION");
                C20048g.m73161a("on call initReceiver");
                m72835a(context, new MSReceiver(), intentFilter);
            }

            @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
            /* renamed from: a */
            public static Intent m72835a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e;
                }
            }
        }, 2000);
    }

    /* renamed from: a */
    private static Object m72781a(BaseDexClassLoader baseDexClassLoader) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
        declaredField.setAccessible(true);
        return declaredField.get(baseDexClassLoader);
    }

    /* renamed from: c */
    private TTWebProviderWrapper m72799c(Runnable runnable) {
        return new TTWebProviderWrapper(this.f48771q, runnable, new TTWebProviderWrapper.ProviderCallback() {
            /* class com.bytedance.lynx.webview.internal.C19958i.C199668 */

            @Override // com.bytedance.lynx.webview.glue.TTWebProviderWrapper.ProviderCallback
            public WebViewFactoryProvider getGlueProvider() {
                return C19958i.this.mo67784g();
            }

            @Override // com.bytedance.lynx.webview.glue.TTWebProviderWrapper.ProviderCallback
            public WebViewFactoryProvider getSysProvider() {
                return C19958i.this.mo67785h();
            }
        }, new TTWebProviderWrapper.EventCallback() {
            /* class com.bytedance.lynx.webview.internal.C19958i.C199679 */

            @Override // com.bytedance.lynx.webview.glue.TTWebProviderWrapper.EventCallback
            public void sendEnsureTime(long j) {
                C19943g.m72724a(EventType.LOAD_TRACE_EVENT_ENSURE, Long.valueOf(j));
            }
        });
    }

    /* renamed from: a */
    private static Object m72782a(Object obj) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field declaredField = obj.getClass().getDeclaredField("dexElements");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: b */
    private FileLock m72794b(boolean z) {
        try {
            return this.f48770p.tryLock(0, 1, z);
        } catch (IOException e) {
            C20048g.m73164d("LibraryLoader", "Failed to lock file " + e.toString());
            return null;
        }
    }

    /* renamed from: d */
    public void mo67780d(String str) {
        C20048g.m73161a("LibraryLoader", "onPreloadFinish", str);
        if (!m72789a(str)) {
            C20048g.m73161a("LibraryLoader", "onPreloadFinish but no finish file");
        } else if (!m72803c(str)) {
            C20048g.m73161a("LibraryLoader", "onPreloadFinish but dex not compiled");
        }
    }

    /* renamed from: f */
    private void m72805f(String str) {
        try {
            this.f48767m.setLength(1024);
            byte[] bytes = str.getBytes(Charset.defaultCharset());
            int i = 0;
            while (i < Math.min(bytes.length, 1024)) {
                this.f48766l.put(i, bytes[i]);
                i++;
            }
            while (i < 1024) {
                this.f48766l.put(i, (byte) 0);
                i++;
            }
        } catch (Exception e) {
            C20048g.m73164d("write shm error: ", e.toString());
        }
    }

    /* renamed from: e */
    public void mo67782e(String str) {
        if (f48763k.compareAndSet(false, true)) {
            if (m72802c(C20011y.m72976a().mo67938u(), str)) {
                try {
                    new File(C20050i.m73180c(str)).createNewFile();
                    C19943g.m72724a(EventType.LOAD_PRELOAD_SUCCESS, (Object) null);
                    C20048g.m73161a("LibraryLoader", "dex preload success!");
                } catch (Throwable th) {
                    C20048g.m73164d("Create compile finish file error :" + th.toString());
                    C19943g.m72724a(EventType.LOAD_PRELOAD_ERROR, (Object) null);
                }
            } else {
                C20048g.m73161a("LibraryLoader", "dex preload error!");
                C19943g.m72724a(EventType.LOAD_PRELOAD_ERROR, (Object) null);
            }
            f48763k.set(false);
            return;
        }
        C20048g.m73161a("someone doing dex compile at same time!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m72796b(java.lang.Runnable r9) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19958i.m72796b(java.lang.Runnable):boolean");
    }

    /* renamed from: c */
    private boolean m72804c(boolean z) {
        for (int i = 0; ((long) i) < 200; i++) {
            try {
                FileLock lock = this.f48768n.lock(0, 1, z);
                this.f48769o = lock;
                if (lock != null) {
                    return true;
                }
            } catch (IOException e) {
                if (i == 0) {
                    C20048g.m73164d("LibraryLoader", "Failed to lock file " + e.toString());
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException unused) {
            }
        }
        C20048g.m73164d("Get shared lock failed.");
        return false;
    }

    /* renamed from: c */
    public void mo67777c(Context context) {
        if (C19986s.m72924a().mo67856a("sdk_isolate_ttwebview_resources_enabled")) {
            C20048g.m73164d("LibraryLoader", "Add TTWebView resources to WebViewContextWrapper only.");
            return;
        }
        try {
            SparseArray sparseArray = (SparseArray) AssetManager.class.getMethod("getAssignedPackageIdentifiers", new Class[0]).invoke(context.getResources().getAssets(), new Object[0]);
            for (int i = 0; i < sparseArray.size(); i++) {
                if (sparseArray.valueAt(i).toString().equals("com.bytedance.webview")) {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String d = C20050i.m73182d(f48755b.get());
        if (!new File(d).exists()) {
            C20048g.m73164d("LibraryLoader", "No ttwebview resource for app.");
        } else if (!C20043d.m73139a(context, d)) {
            C20048g.m73164d("LibraryLoader", "add resource error!");
        } else if (!C20043d.m73139a(context.getApplicationContext(), d)) {
            C20048g.m73164d("LibraryLoader", "add resource error!");
        }
    }

    /* renamed from: a */
    private boolean m72787a(C19969b bVar) {
        if (!C20011y.m72976a().mo67898B()) {
            return false;
        }
        bVar.mo67797a(LoadEventType.CheckSwitch_enable_ttwebview);
        if (!C20011y.m72976a().mo67939v().mo67826c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo67776b(Context context) {
        if (C19986s.m72924a().mo67857a(C20051j.m73197c(context), ProcessFeatureIndex.ENABLE_WARMUP.value(), false)) {
            C20011y.m72986a(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19958i.RunnableC199657 */

                public void run() {
                    C20048g.m73161a("TT_WEBVIEW", "doStartWebEngine startWebEngineOnUiThread");
                    Trace.beginSection("LibraryLoader.doStartWebEngine");
                    try {
                        Class.forName("com.bytedance.webview.chromium.WebViewChromiumFactoryProviderWrapper").getMethod("startWebEngineOnUiThread", new Class[0]).invoke(C19958i.this.f48765d, new Object[0]);
                    } catch (Exception e) {
                        C20048g.m73164d("TT_WEBVIEW", "doStartWebEngine error:" + e.toString());
                        e.printStackTrace();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                    Trace.endSection();
                }
            }, 1000);
        }
    }

    /* renamed from: a */
    private void m72785a(String str, AbstractC19970c cVar) {
        if (cVar != null) {
            String[] split = str.split("-", 3);
            if (split.length == 3) {
                cVar.mo67789a(split[0], split[1], split[2]);
            } else {
                C20048g.m73164d("LibraryLoader", "Parse shm string error.");
            }
        }
    }

    /* renamed from: b */
    private WebViewFactoryProvider m72793b(Context context, String str) {
        C19984r v = C20011y.m72976a().mo67939v();
        try {
            if (!m72792a(new String[]{C20050i.m73182d(str), C20050i.m73184e(str)}, C20050i.m73186f(str), context)) {
                C19943g.m72724a(EventType.SDK_LOAD_ERRO_Dexpath, "");
                return null;
            }
            C19891a.m72586a(C20050i.m73174a(str));
            C20026a.m73080a(LoadEventType.InitProvider_addClasses_success);
            long currentTimeMillis = System.currentTimeMillis();
            this.f48775u = new C19925a(context);
            if (!this.f48775u.CheckSdkVersion(Version.f48943d)) {
                C19943g.m72724a(EventType.SDK_LOAD_ERRO_SdkCheck, "");
                return null;
            } else if (!this.f48775u.CheckGlueVersion(f48756c.get())) {
                C19943g.m72724a(EventType.SDK_LOAD_ERRO_GlueCheck, "");
                return null;
            } else if (!this.f48775u.checkSoRuntimeEnvironment(context)) {
                C19943g.m72724a(EventType.SDK_LOAD_ERRO_RuntimeEnvironment, "");
                return null;
            } else if (!this.f48775u.isSupportAndroidX()) {
                C19943g.m72724a(EventType.SDK_LOAD_ERRO_SupportAndroidX, "");
                return null;
            } else {
                C20026a.m73080a(LoadEventType.InitProvider_checkGlueVersion_success);
                WebViewFactoryProvider providerInstance = this.f48775u.getProviderInstance(C20050i.m73174a(str));
                C20048g.m73161a("SDKBRIDGE.getProviderInstance[ttwebview_timing]=" + (System.currentTimeMillis() - currentTimeMillis));
                return providerInstance;
            }
        } catch (Throwable th) {
            C20048g.m73164d("initProvider:" + th.toString());
            C19938b.m72701a("hookProvider:" + th.toString());
            v.mo67811a(EventType.LOAD_CRASHED);
            return null;
        }
    }

    /* renamed from: c */
    private boolean m72802c(Context context, String str) {
        boolean z;
        C19984r v = C20011y.m72976a().mo67939v();
        boolean z2 = true;
        try {
            if (!m72797b(str)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 26) {
                new DexClassLoader(C20050i.m73184e(str), C20050i.m73186f(str), null, context.getClassLoader());
                if (C20025a.m73072c(str)) {
                    new DexClassLoader(C20050i.m73182d(str), C20050i.m73186f(str), null, context.getClassLoader());
                }
                return true;
            } else if (C19986s.m72924a().mo67858a("enable_multi_cl_reg_resolve", true) && Build.VERSION.SDK_INT >= 30) {
                return true;
            } else {
                if (DexFile.loadDex(C20050i.m73184e(str), C20050i.m73188g(str), 0) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C20025a.m73072c(str)) {
                    return z;
                }
                DexFile loadDex = DexFile.loadDex(C20050i.m73182d(str), C20050i.m73188g(str), 0);
                if (!z || loadDex == null) {
                    z2 = false;
                }
                return z2;
            }
        } catch (Throwable th) {
            C20048g.m73164d("preloadProvider:" + th.toString());
            C19938b.m72701a("preloadProvider:" + th.toString());
            v.mo67811a(EventType.LOAD_CRASHED);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m72786a(final Context context, String str) {
        C20026a.m73080a(LoadEventType.DoCreateHookProvider_begin);
        try {
            String p = C20011y.m73018p();
            if (!p.isEmpty()) {
                C20048g.m73161a("tt_webview", "Create data path with suffix : " + p);
                String path = context.getApplicationContext().getDir(p, 0).getPath();
                File file = new File(path + "/data/");
                File file2 = new File(path + "/database/");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
        } catch (Throwable unused) {
            C20048g.m73164d("tt_webview", "Failed to create data suffix path!!!");
        }
        synchronized (this) {
            this.f48774t = C20050i.m73174a(str);
            C19984r v = C20011y.m72976a().mo67939v();
            WebViewFactoryProvider b = m72793b(context, str);
            this.f48765d = b;
            if (b == null) {
                return false;
            }
            C20026a.m73080a(LoadEventType.DoCreateHookProvider_initProvider_success);
            C20048g.m73161a("mProvider construct complete.");
            v.mo67811a(EventType.LOAD_END);
            C19986s.m72924a().mo67863e();
            C20011y.m73005e(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19958i.RunnableC199635 */

                public void run() {
                    C20048g.m73161a("PreInitTask scheduled");
                    if (C20011y.m72976a().mo67906J()) {
                        C20048g.m73161a("PreInitTask scheduled after first webview created");
                        C19943g.m72724a(EventType.LOAD_PRELOAD_FAILED, (Object) null);
                    }
                    C19958i.this.mo67786i();
                    C19958i.this.mo67776b(context);
                    C19958i.this.mo67779d(context);
                }
            });
            return true;
        }
    }

    /* renamed from: a */
    private boolean m72788a(Object obj, Object obj2) {
        Field field;
        synchronized (this) {
            try {
                if (Build.VERSION.SDK_INT < 30 || C20011y.m72976a().mo67938u().getApplicationInfo().targetSdkVersion < 30) {
                    Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                    Object[] objArr = {"sProviderLock"};
                    field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke((Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory"), objArr);
                } else {
                    field = ModifiedFlipped.m73158a("android.webkit.WebViewFactory", "sProviderLock");
                }
                if (field != null) {
                    field.setAccessible(true);
                    synchronized (field.get(null)) {
                        Field declaredField = WebViewFactory.class.getDeclaredField("sProviderInstance");
                        declaredField.setAccessible(true);
                        if (declaredField.get(null) == obj) {
                            declaredField.set(null, obj2);
                            return true;
                        }
                    }
                } else {
                    throw new NullPointerException("reflection fails");
                }
            } catch (Exception e) {
                C20048g.m73164d("LibraryLoader", "safeSetProvider error: " + e.toString());
            }
        }
        return false;
    }

    /* renamed from: c */
    private String m72800c(String str, String str2, String str3) {
        return "" + str + '-' + str3 + '-' + str2;
    }

    /* renamed from: b */
    private boolean m72798b(String str, String str2, String str3) {
        C19969b bVar = new C19969b(LoadEventType.Default_Type);
        boolean z = true;
        if (!C20043d.m73137a()) {
            C20011y.m72976a().mo67939v().mo67811a(EventType.DISABLED_BY_ABI);
            C20048g.m73161a("abi is disable! -> use system webview");
        } else {
            bVar.mo67797a(LoadEventType.LoadPreCheck_abi_enbale);
            if (!m72787a(bVar)) {
                C20048g.m73161a("switch is disable! -> use system webview");
            } else {
                bVar.mo67797a(LoadEventType.LoadPreCheck_switch_enable);
                if (!C20025a.m73070a(str3, bVar)) {
                    C20048g.m73161a("soVersion is unsuited! -> use system webview");
                } else {
                    bVar.mo67797a(LoadEventType.LoadPreCheck_soVersion_suited);
                    if (str.isEmpty()) {
                        C20048g.m73161a("md5 is empty! -> use system webview");
                        if (str2.isEmpty()) {
                            C20048g.m73161a("oldmd5 is empty! -> use system webview");
                        } else {
                            bVar.mo67797a(LoadEventType.LoadPreCheck_oldmd5_not_empty);
                        }
                    } else {
                        bVar.mo67797a(LoadEventType.LoadPreCheck_md5_not_empty);
                        if (!m72789a(str)) {
                            C20048g.m73161a("finish file not exits! -> use system webview");
                            if (TextUtils.equals(str2, str)) {
                                bVar.mo67797a(LoadEventType.LoadPreCheck_not_first_download);
                            } else {
                                bVar.mo67797a(LoadEventType.LoadPreCheck_first_download);
                            }
                            if (C20051j.m73195a(C20011y.m72976a().mo67938u())) {
                                C19943g.m72725a(EventType.DOWNLOAD_RESULT, (String) null, false);
                            }
                        } else {
                            bVar.mo67797a(LoadEventType.LoadPreCheck_so_exits);
                            if (!m72810p()) {
                                C20048g.m73161a("osapi is disable! -> use system webview");
                            } else {
                                bVar.mo67797a(LoadEventType.LoadPreCheck_osapi_enable);
                                if (!m72809o()) {
                                    C20048g.m73161a("hostAbi is disable! -> use system webview");
                                } else {
                                    bVar.mo67797a(LoadEventType.LoadPreCheck_hostabi_enable);
                                    if (!m72803c(str)) {
                                        C20048g.m73161a("Dex Compiled finish file not exits! -> use system webview");
                                        if (C20051j.m73195a(C20011y.m72976a().mo67938u())) {
                                            C19943g.m72725a(EventType.DOWNLOAD_RESULT, (String) null, true);
                                        }
                                    } else {
                                        bVar.mo67797a(LoadEventType.LoadPreCheck_dex_compiled);
                                        C20026a.m73080a(bVar.mo67796a());
                                        return z;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
        C20026a.m73080a(bVar.mo67796a());
        return z;
    }

    /* renamed from: a */
    private static int m72780a(String[] strArr, String str, Context context, Object[] objArr) throws NoSuchFieldException, IllegalAccessException {
        int i;
        if (!C19986s.m72924a().mo67858a("enable_multi_cl_reg_resolve", true) || Build.VERSION.SDK_INT < 30) {
            i = 0;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                objArr[i2] = m72782a(m72781a((BaseDexClassLoader) new DexClassLoader(strArr[i2], str, null, context.getClassLoader())));
                i += Array.getLength(objArr[i2]);
            }
        } else {
            i = 0;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                try {
                    Constructor<?> declaredConstructor = Class.forName("dalvik.system.DexPathList").getDeclaredConstructor(ClassLoader.class, String.class, String.class, File.class);
                    declaredConstructor.setAccessible(true);
                    objArr[i3] = m72782a(declaredConstructor.newInstance(context.getClassLoader(), strArr[i3], null, null));
                    i += Array.getLength(objArr[i3]);
                } catch (Exception e) {
                    C20048g.m73164d("makeDexElements error:" + e.toString());
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m72784a(android.content.Context r19, java.lang.String r20, java.lang.String r21, final com.bytedance.lynx.webview.internal.C19958i.AbstractC19968a r22) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19958i.m72784a(android.content.Context, java.lang.String, java.lang.String, com.bytedance.lynx.webview.internal.i$a):void");
    }
}
