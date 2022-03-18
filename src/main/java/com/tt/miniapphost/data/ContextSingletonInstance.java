package com.tt.miniapphost.data;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.WindowManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.AbstractC12889a;
import com.bytedance.ee.lark.infra.storage.C12896b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24819e;
import com.tt.miniapp.address.AsyncTaskC65743a;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.audio.background.C65775b;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.picker.wheel.entity.C65964a;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.entity.C66007a;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66439i;
import com.tt.miniapp.manager.C66452l;
import com.tt.miniapp.manager.C66460m;
import com.tt.miniapp.manager.NetStateManager;
import com.tt.miniapp.manager.SynHistoryManager;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.net.p3309b.C66509a;
import com.tt.miniapp.p3312p.C66567b;
import com.tt.miniapp.p3323q.C66681e;
import com.tt.miniapp.p3337v.C67073a;
import com.tt.miniapp.p3337v.C67076b;
import com.tt.miniapp.p3352w.C67288b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.titlemenu.C66902b;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.C67030d;
import com.tt.miniapp.util.C67033g;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67051o;
import com.tt.miniapp.util.C67064v;
import com.tt.miniapp.util.C67068y;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.video.p3340c.C67090b;
import com.tt.miniapp.view.webcore.C67268f;
import com.tt.miniapp.view.webcore.C67273g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67470c;
import com.tt.miniapphost.C67545g;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3368b.AbstractC67469b;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.p3391l.AbstractC67653e;
import com.tt.option.p3392m.C67657c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ContextSingletonInstance {
    private volatile C67073a accelermeterManager;
    private final Object accelermeterManagerLock;
    private AsyncTaskC65743a.C65744a addressDataInstance;
    private final Object addressDataInstanceLock;
    public C66007a.C66010a appJumpDataInstance;
    private AtomicInteger appTagId;
    private AppbrandContext appbrandContext;
    private final Object appbrandContextLock;
    private final Object appbrandPathManagerLock;
    private C24819e appbrandWifiManager;
    private final Object appbrandWifiManagerLock;
    public AbstractC65746a.C65750d audioDataInstance;
    public AtomicInteger audioId;
    private C66399c baseBundleManager;
    private final Object baseBundleManagerLock;
    private C65764a bgAudioManagerClient;
    private final Object bgAudioManagerClientLock;
    private C65775b bgAudioManagerServiceNative;
    private final Object bgAudioManagerServiceNativeLock;
    private C67030d buildProperties;
    private final Object buildPropertiesLock;
    private AbstractC67469b bundleManager;
    private final Object bundleManagerLock;
    private C67076b compassManager;
    private final Object compassManagerLock;
    public C67033g.C67034a concaveScreenInstance;
    public DebugUtil.C67581a debugInstance;
    private C65983a debugManager;
    private final Object debugManagerLock;
    private C67483a deviceInfo;
    public int fixedKeyboardLandscapeHeight;
    public int fixedKeyboardPortraitHeight;
    public HostDependManager hostDependManager;
    public LinkedList<WeakReference<Activity>> hostProcessActivityWrList;
    private C67490d hostProcessSupport;
    public C67545g.C67546a idCreateInstance;
    public C65844b input;
    private C67566c ipcCallbackManagerProxy;
    private final Object ipcCallbackManagerProxyLock;
    private C67051o jsRuntimeErrorReporter;
    private final Object jsRuntimeErrorReporterLock;
    public int keyboardId;
    public int keyboardLandscapeHeight;
    public int keyboardPortraitHeight;
    public C67268f.C67272a larkWebViewDataInstance;
    private volatile C67479c localeManager;
    private final Object localeManagerLock;
    private LruCache<String, Bitmap> lruCache;
    public WeakReference<C67068y.AbstractC67069a> mWeakActivityInfo;
    public Handler mainHandler;
    private C66567b mediaSupport;
    private final Object mediaSupportLock;
    public AtomicInteger mediaTaskId;
    public C66681e.C66682a memoryDataInstance;
    public C66902b.C66904a menuDialogDataInstance;
    public C65964a multiPickerManager;
    private C66517e.C66518a netBusInstance;
    private final Object netBusInstanceLock;
    private C66509a netDnsResolver;
    private final Object netDnsResolverLock;
    public C67657c.C67658a netRequestDataInstance;
    private volatile NetStateManager netStateManager;
    private final Object netStateManagerLock;
    private C66588h permissionsManager;
    private final Object permissionsManagerLock;
    private volatile C66439i preConnectCDNManager;
    private final Object preConnectCDNManagerLock;
    public C67560a.C67561a processBridgeDataInstance;
    public ProcessUtil.C67582a processInstance;
    private C67494g recentAppsManager;
    public C67064v.C67065a rsaInstance;
    public SparseArray<String> sAACProfiles;
    public SparseArray<String> sAVCLevels;
    public SparseArray<String> sAVCProfiles;
    public SparseArray<String> sColorFormats;
    public C66020b.AbstractC66022b sIFeedback;
    public volatile AbstractC67653e sdkMonitor;
    public C67552k.C67553a sdkParamInstance;
    private C66615b serviceBindManager;
    private final Object serviceBindManagerLock;
    private C67288b serviceProvider;
    private final Object serviceProviderLock;
    public C66452l.C66458a snapshotDataInstance;
    public C66460m.C66463a storageInstance;
    private AbstractC12889a storageManager;
    private final Object storageManagerLock;
    private volatile SynHistoryManager synHistoryManager;
    private final Object synHistoryManagerLock;
    private C67554l tmaScheduler;
    private final Object tmaSchedulerLock;
    public List<ToastManager.C66967a> toastContainer;
    public C67070z.C67072a toolUtilInstance;
    public boolean triggeredHomeOrRecentApp;
    public C67090b videoDataContext;
    public C67273g.C67278a webViewDataInstance;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.data.ContextSingletonInstance$b */
    public static class C67484b {

        /* renamed from: a */
        public static ContextSingletonInstance f170120a = new ContextSingletonInstance();
    }

    public static ContextSingletonInstance getInstance() {
        return C67484b.f170120a;
    }

    public C67483a getDeviceInfo() {
        return this.deviceInfo;
    }

    public C67490d getHostProcessSupport() {
        return this.hostProcessSupport;
    }

    public C67494g getRecentAppsManager() {
        return this.recentAppsManager;
    }

    /* access modifiers changed from: package-private */
    public int getAppTagId() {
        return this.appTagId.incrementAndGet();
    }

    /* renamed from: com.tt.miniapphost.data.ContextSingletonInstance$a */
    public static class C67483a {

        /* renamed from: a */
        private String f170113a;

        /* renamed from: b */
        private int f170114b;

        /* renamed from: c */
        private boolean f170115c;

        /* renamed from: d */
        private boolean f170116d;

        /* renamed from: e */
        private int f170117e;

        /* renamed from: f */
        private int f170118f;

        /* renamed from: g */
        private float f170119g;

        private C67483a() {
            this.f170117e = -1;
            this.f170118f = -1;
            this.f170119g = -1.0f;
        }

        /* renamed from: a */
        public boolean mo234266a() {
            if (!this.f170116d) {
                try {
                    Class.forName("miui.os.Build");
                    this.f170115c = true;
                } catch (Exception e) {
                    AppBrandLogger.m52828d("ContextSingletonInstance", e);
                }
                this.f170116d = true;
            }
            return this.f170115c;
        }

        /* renamed from: c */
        public float mo234268c(Context context) {
            if (this.f170119g < BitmapDescriptorFactory.HUE_RED) {
                this.f170119g = C67043j.m261281e(context);
            }
            return this.f170119g;
        }

        /* renamed from: b */
        public String mo234267b(Context context) {
            if (TextUtils.isEmpty(this.f170113a)) {
                try {
                    this.f170113a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "ContextSingletonInstance", e.getStackTrace());
                }
            }
            return this.f170113a;
        }

        /* renamed from: d */
        public int mo234269d(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                this.f170117e = point.x;
                this.f170118f = point.y;
            }
            return this.f170117e;
        }

        /* renamed from: e */
        public int mo234270e(Context context) {
            WindowManager windowManager;
            if (this.f170118f < 0 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Point point = new Point();
                windowManager.getDefaultDisplay().getSize(point);
                this.f170117e = point.x;
                this.f170118f = point.y;
                if (C67033g.m261255d(context) && HostDependManager.getInst().getFeatureGating("gadget.keyboard.refine")) {
                    this.f170118f += C67043j.m261285g(context);
                }
            }
            return this.f170118f;
        }

        /* renamed from: a */
        public int mo234265a(Context context) {
            int i = this.f170114b;
            if (i > 0) {
                return i;
            }
            if (C67033g.m261253b(context)) {
                int a = (int) C67590h.m263065a(context, 27.0f);
                this.f170114b = a;
                return a;
            } else if (C67033g.m261255d(context)) {
                int e = C67033g.m261256e(context);
                this.f170114b = e;
                return e;
            } else {
                int i2 = 0;
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i2 = context.getResources().getDimensionPixelOffset(identifier);
                }
                if (i2 == 0) {
                    i2 = (int) C67590h.m263065a(context, 25.0f);
                }
                this.f170114b = i2;
                return i2;
            }
        }
    }

    public AsyncTaskC65743a.C65744a getAddressDataInstance() {
        if (this.addressDataInstance == null) {
            synchronized (this.addressDataInstanceLock) {
                if (this.addressDataInstance == null) {
                    this.addressDataInstance = new AsyncTaskC65743a.C65744a();
                }
            }
        }
        return this.addressDataInstance;
    }

    public AppbrandContext getAppbrandContext() {
        if (this.appbrandContext == null) {
            synchronized (this.appbrandContextLock) {
                if (this.appbrandContext == null) {
                    this.appbrandContext = new AppbrandContext();
                }
            }
        }
        return this.appbrandContext;
    }

    public C24819e getAppbrandWifiManager() {
        if (this.appbrandWifiManager == null) {
            synchronized (this.appbrandWifiManagerLock) {
                if (this.appbrandWifiManager == null) {
                    this.appbrandWifiManager = new C24819e();
                }
            }
        }
        return this.appbrandWifiManager;
    }

    public C66399c getBaseBundleManager() {
        if (this.baseBundleManager == null) {
            synchronized (this.baseBundleManagerLock) {
                if (this.baseBundleManager == null) {
                    this.baseBundleManager = new C66399c();
                }
            }
        }
        return this.baseBundleManager;
    }

    public C65764a getBgAudioManagerClient() {
        if (this.bgAudioManagerClient == null) {
            synchronized (this.bgAudioManagerClientLock) {
                if (this.bgAudioManagerClient == null) {
                    this.bgAudioManagerClient = new C65764a();
                }
            }
        }
        return this.bgAudioManagerClient;
    }

    public C65775b getBgAudioManagerServiceNative() {
        if (this.bgAudioManagerServiceNative == null) {
            synchronized (this.bgAudioManagerServiceNativeLock) {
                if (this.bgAudioManagerServiceNative == null) {
                    this.bgAudioManagerServiceNative = new C65775b();
                }
            }
        }
        return this.bgAudioManagerServiceNative;
    }

    public C67030d getBuildProperties() throws IOException {
        if (this.buildProperties == null) {
            synchronized (this.buildPropertiesLock) {
                if (this.buildProperties == null) {
                    this.buildProperties = new C67030d();
                }
            }
        }
        return this.buildProperties;
    }

    public AbstractC67469b getBundleManager() {
        if (this.bundleManager == null) {
            synchronized (this.bundleManagerLock) {
                if (this.bundleManager == null) {
                    this.bundleManager = new C67470c();
                }
            }
        }
        return this.bundleManager;
    }

    public C65983a getDebugManager() {
        if (this.debugManager == null) {
            synchronized (this.debugManagerLock) {
                if (this.debugManager == null) {
                    this.debugManager = new C65983a();
                }
            }
        }
        return this.debugManager;
    }

    public C67566c getIpcCallbackManagerProxy() {
        if (this.ipcCallbackManagerProxy == null) {
            synchronized (this.ipcCallbackManagerProxyLock) {
                if (this.ipcCallbackManagerProxy == null) {
                    this.ipcCallbackManagerProxy = new C67566c();
                }
            }
        }
        return this.ipcCallbackManagerProxy;
    }

    public C67051o getJsRuntimeErrorReporter() {
        if (this.jsRuntimeErrorReporter == null) {
            synchronized (this.jsRuntimeErrorReporterLock) {
                if (this.jsRuntimeErrorReporter == null) {
                    this.jsRuntimeErrorReporter = new C67051o();
                }
            }
        }
        return this.jsRuntimeErrorReporter;
    }

    public C67479c getLocaleManager() {
        if (this.localeManager == null) {
            synchronized (this.localeManagerLock) {
                if (this.localeManager == null) {
                    this.localeManager = new C67479c();
                }
            }
        }
        return this.localeManager;
    }

    public LruCache<String, Bitmap> getLruCache() {
        if (this.lruCache == null) {
            this.lruCache = new LruCache<String, Bitmap>(((int) Runtime.getRuntime().maxMemory()) / 4) {
                /* class com.tt.miniapphost.data.ContextSingletonInstance.C674821 */

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int sizeOf(String str, Bitmap bitmap) {
                    return bitmap.getByteCount();
                }
            };
        }
        return this.lruCache;
    }

    public C66567b getMediaSupport() {
        if (this.mediaSupport == null) {
            synchronized (this.mediaSupportLock) {
                if (this.mediaSupport == null) {
                    this.mediaSupport = new C66567b();
                }
            }
        }
        return this.mediaSupport;
    }

    public C66517e.C66518a getNetBusInstance() {
        if (this.netBusInstance == null) {
            synchronized (this.netBusInstanceLock) {
                if (this.netBusInstance == null) {
                    this.netBusInstance = new C66517e.C66518a();
                }
            }
        }
        return this.netBusInstance;
    }

    public C66509a getNetDnsResolver() {
        if (this.netDnsResolver == null) {
            synchronized (this.netDnsResolverLock) {
                if (this.netDnsResolver == null) {
                    this.netDnsResolver = new C66509a();
                }
            }
        }
        return this.netDnsResolver;
    }

    public NetStateManager getNetStateManager() {
        if (this.netStateManager == null) {
            synchronized (this.netStateManagerLock) {
                if (this.netStateManager == null) {
                    this.netStateManager = new NetStateManager();
                }
            }
        }
        return this.netStateManager;
    }

    public C66588h getPermissionsManager() {
        if (this.permissionsManager == null) {
            synchronized (this.permissionsManagerLock) {
                if (this.permissionsManager == null) {
                    this.permissionsManager = new C66588h();
                }
            }
        }
        return this.permissionsManager;
    }

    public C66439i getPreConnectCDNManager() {
        if (this.preConnectCDNManager == null) {
            synchronized (this.preConnectCDNManagerLock) {
                if (this.preConnectCDNManager == null) {
                    this.preConnectCDNManager = new C66439i();
                }
            }
        }
        return this.preConnectCDNManager;
    }

    public C66615b getServiceBindManager() {
        if (this.serviceBindManager == null) {
            synchronized (this.serviceBindManagerLock) {
                if (this.serviceBindManager == null) {
                    this.serviceBindManager = new C66615b();
                }
            }
        }
        return this.serviceBindManager;
    }

    public C67288b getServiceProvider() {
        if (this.serviceProvider == null) {
            synchronized (this.serviceProviderLock) {
                if (this.serviceProvider == null) {
                    this.serviceProvider = new C67288b();
                }
            }
        }
        return this.serviceProvider;
    }

    public AbstractC12889a getStorageManager() {
        if (this.storageManager == null) {
            synchronized (this.storageManagerLock) {
                if (this.storageManager == null) {
                    this.storageManager = new C12896b();
                }
            }
        }
        return this.storageManager;
    }

    public SynHistoryManager getSynHistoryManager() {
        if (this.synHistoryManager == null) {
            synchronized (this.synHistoryManagerLock) {
                if (this.synHistoryManager == null) {
                    this.synHistoryManager = new SynHistoryManager();
                }
            }
        }
        return this.synHistoryManager;
    }

    public C67554l getTmaScheduler() {
        if (this.tmaScheduler == null) {
            synchronized (this.tmaSchedulerLock) {
                if (this.tmaScheduler == null) {
                    this.tmaScheduler = new C67554l();
                }
            }
        }
        return this.tmaScheduler;
    }

    private ContextSingletonInstance() {
        this.appTagId = new AtomicInteger(0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.sAACProfiles = new SparseArray<>();
        this.sAVCProfiles = new SparseArray<>();
        this.sAVCLevels = new SparseArray<>();
        this.sColorFormats = new SparseArray<>();
        this.hostProcessActivityWrList = new LinkedList<>();
        this.netStateManagerLock = new Object();
        this.synHistoryManagerLock = new Object();
        this.preConnectCDNManagerLock = new Object();
        this.netBusInstanceLock = new Object();
        this.tmaSchedulerLock = new Object();
        this.debugManagerLock = new Object();
        this.mediaSupportLock = new Object();
        this.localeManagerLock = new Object();
        this.addressDataInstanceLock = new Object();
        this.bundleManagerLock = new Object();
        this.baseBundleManagerLock = new Object();
        this.storageManagerLock = new Object();
        this.buildPropertiesLock = new Object();
        this.netDnsResolverLock = new Object();
        this.appbrandPathManagerLock = new Object();
        this.jsRuntimeErrorReporterLock = new Object();
        this.appbrandWifiManagerLock = new Object();
        this.serviceBindManagerLock = new Object();
        this.permissionsManagerLock = new Object();
        this.serviceProviderLock = new Object();
        this.bgAudioManagerServiceNativeLock = new Object();
        this.bgAudioManagerClientLock = new Object();
        this.ipcCallbackManagerProxyLock = new Object();
        this.appbrandContextLock = new Object();
        this.storageInstance = new C66460m.C66463a();
        this.toastContainer = new ArrayList();
        this.sdkParamInstance = new C67552k.C67553a();
        this.idCreateInstance = new C67545g.C67546a();
        this.debugInstance = new DebugUtil.C67581a();
        this.processInstance = new ProcessUtil.C67582a();
        this.concaveScreenInstance = new C67033g.C67034a();
        this.rsaInstance = new C67064v.C67065a();
        this.toolUtilInstance = new C67070z.C67072a();
        this.netRequestDataInstance = new C67657c.C67658a();
        this.memoryDataInstance = new C66681e.C66682a();
        this.hostDependManager = new HostDependManager();
        this.audioDataInstance = new AbstractC65746a.C65750d();
        this.snapshotDataInstance = new C66452l.C66458a();
        this.videoDataContext = new C67090b();
        this.mediaTaskId = new AtomicInteger(0);
        this.menuDialogDataInstance = new C66902b.C66904a();
        this.multiPickerManager = new C65964a();
        this.audioId = new AtomicInteger(0);
        this.processBridgeDataInstance = new C67560a.C67561a();
        this.webViewDataInstance = new C67273g.C67278a();
        this.larkWebViewDataInstance = new C67268f.C67272a();
        this.appJumpDataInstance = new C66007a.C66010a();
        this.compassManagerLock = new Object();
        this.accelermeterManagerLock = new Object();
        this.keyboardId = 0;
        this.deviceInfo = new C67483a();
        this.hostProcessSupport = new C67490d();
        this.recentAppsManager = new C67494g();
    }

    public C67073a getAccelermeterManager(Context context) {
        if (this.accelermeterManager == null) {
            synchronized (this.accelermeterManagerLock) {
                if (this.accelermeterManager == null) {
                    this.accelermeterManager = new C67073a(context);
                }
            }
        }
        return this.accelermeterManager;
    }

    public C67076b getCompassManager(Context context) {
        if (this.compassManager == null) {
            synchronized (this.compassManagerLock) {
                if (this.compassManager == null) {
                    this.compassManager = new C67076b(context);
                }
            }
        }
        return this.compassManager;
    }
}
