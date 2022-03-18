package com.tt.refer.common.pkg;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.streamloader.p3330a.C66867d;
import com.tt.miniapp.ttapkgdecoder.AbstractC66979b;
import com.tt.miniapp.ttapkgdecoder.C66974a;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapp.ttapkgdecoder.p3334b.C66983d;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.download.AbsDownloadListener;
import com.tt.refer.common.download.C67752a;
import com.tt.refer.common.download.IDownloadListener;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.p3418a.C67756a;
import com.tt.refer.common.pkg.AbstractC67828f;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.impl.business.meta.PackageComponent;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.tt.refer.common.pkg.k */
public class C67834k implements IStreamLoader {

    /* renamed from: a */
    public final PackageEntity f170853a;

    /* renamed from: b */
    public final C66867d f170854b;

    /* renamed from: c */
    public final String f170855c;

    /* renamed from: d */
    public final AbstractC66979b f170856d;

    /* renamed from: e */
    public IMonitorCreator f170857e;

    /* renamed from: f */
    public TTAPkgInfo f170858f;

    /* renamed from: g */
    public HashMap<TTAPkgFile, Future<String>> f170859g;

    /* renamed from: h */
    public ConcurrentHashMap<String, String> f170860h;

    /* renamed from: i */
    public volatile boolean f170861i;

    /* renamed from: j */
    public int f170862j;

    /* renamed from: k */
    public int f170863k;

    /* renamed from: l */
    private final File f170864l;

    /* renamed from: m */
    private final String f170865m;

    /* renamed from: n */
    private boolean f170866n;

    /* renamed from: o */
    private ExecutorService f170867o;

    /* renamed from: p */
    private C67752a f170868p;

    /* renamed from: q */
    private AbstractC67722a f170869q;

    /* renamed from: r */
    private String f170870r;

    /* renamed from: s */
    private IAppContext f170871s;

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public int getDownloadType() {
        return 0;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public String getLoadPkgType() {
        return null;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public int getTTApkgVersion() {
        return 0;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public boolean isFirstLaunch() {
        return false;
    }

    /* renamed from: a */
    public PackageEntity getAppInfo() {
        return this.f170853a;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public TTAPkgInfo getTTAPkgInfo() {
        return this.f170858f;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public boolean isReady() {
        return this.f170861i;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public boolean isUseLocalPkg() {
        return this.f170866n;
    }

    /* renamed from: b */
    private String m263925b() {
        if (this.f170862j < 0) {
            this.f170862j = 0;
        }
        if (this.f170853a.getUrls() == null || this.f170853a.getUrls().size() <= this.f170862j) {
            return "";
        }
        List<String> urls = this.f170853a.getUrls();
        int i = this.f170862j;
        this.f170862j = i + 1;
        return urls.get(i);
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public void release() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = "pkgStreamLoader release.... identify:";
        PackageEntity packageEntity = this.f170853a;
        if (packageEntity != null) {
            str = packageEntity.getIdentifier();
        } else {
            str = "";
        }
        objArr[1] = str;
        AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", objArr);
        ExecutorService executorService = this.f170867o;
        if (executorService != null) {
            executorService.shutdown();
        }
        C66867d dVar = this.f170854b;
        if (dVar != null) {
            dVar.mo232831a();
        }
        this.f170861i = false;
    }

    /* renamed from: a */
    public void mo235465a(IMonitorCreator iMonitorCreator) {
        this.f170857e = iMonitorCreator;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public InputStream requestStream(TTAPkgFile tTAPkgFile) {
        return this.f170854b.mo232836b(tTAPkgFile);
    }

    /* renamed from: b */
    private TTAPkgFile m263924b(String str) {
        AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "standardFileFile", str);
        TTAPkgInfo tTAPkgInfo = this.f170858f;
        if (tTAPkgInfo == null || str == null) {
            return null;
        }
        return tTAPkgInfo.findFile(str);
    }

    /* renamed from: com.tt.refer.common.pkg.k$a */
    public static class C67841a implements AbstractC67828f.AbstractC67829a {

        /* renamed from: a */
        public final AbstractC67851p f170892a;

        /* renamed from: b */
        private C67834k f170893b;

        /* renamed from: c */
        private final File f170894c;

        /* renamed from: d */
        private final IAppContext f170895d;

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: a */
        public void mo235451a(TTAPkgInfo tTAPkgInfo) {
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "onDecodeFinish...", ":", this.f170893b.getAppInfo().getIdentifier(), "version:", this.f170893b.getAppInfo().getPackageName());
            this.f170893b.f170861i = true;
            AbstractC67851p pVar = this.f170892a;
            if (pVar != null) {
                pVar.mo235379a(tTAPkgInfo);
            }
        }

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: a */
        public void mo235449a(TTAPkgFile tTAPkgFile, byte[] bArr) {
            this.f170893b.f170854b.mo232832a(tTAPkgFile, bArr);
        }

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: b */
        public void mo235452b(TTAPkgFile tTAPkgFile, byte[] bArr) {
            this.f170893b.f170854b.mo232837b(tTAPkgFile, bArr);
        }

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: a */
        public void mo235448a(int i, String str) {
            C67834k kVar = this.f170893b;
            boolean z = false;
            if (kVar == null) {
                AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "onDecodeFail and mPkgStreamLoader is null");
                return;
            }
            AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "onDecodeFail...", kVar.getAppInfo());
            File file = this.f170894c;
            if (file != null && file.exists()) {
                this.f170894c.delete();
            }
            this.f170893b.f170861i = false;
            if (this.f170893b.isUseLocalPkg()) {
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "use local pkg failed,try get it from net>>", this.f170893b.getAppInfo());
                IAppContext iAppContext = this.f170895d;
                if (iAppContext instanceof AbstractC67433a) {
                    z = ((AbstractC67433a) iAppContext).mo234167g();
                }
                if (z) {
                    this.f170893b.mo235468b(2, new AbstractC67851p() {
                        /* class com.tt.refer.common.pkg.C67834k.C67841a.C678421 */

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235377a() {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235377a();
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235378a(float f) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235378a(f);
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235379a(tTAPkgInfo);
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235380a(String str, String str2) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235380a(str, str2);
                            }
                        }
                    }, this.f170895d);
                } else {
                    this.f170893b.mo235464a(2, new AbstractC67851p() {
                        /* class com.tt.refer.common.pkg.C67834k.C67841a.C678432 */

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235377a() {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235377a();
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235378a(float f) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235378a(f);
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235379a(TTAPkgInfo tTAPkgInfo) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235379a(tTAPkgInfo);
                            }
                        }

                        @Override // com.tt.refer.common.pkg.AbstractC67851p
                        /* renamed from: a */
                        public void mo235380a(String str, String str2) {
                            if (C67841a.this.f170892a != null) {
                                C67841a.this.f170892a.mo235380a(str, str2);
                            }
                        }
                    }, this.f170895d);
                }
            }
        }

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: a */
        public void mo235447a(int i, TTAPkgInfo tTAPkgInfo) throws DecodeException {
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "onLoadHeader and version:", Integer.valueOf(i), "identify:", this.f170893b.getAppInfo().getIdentifier(), "appVersion:", this.f170893b.getAppInfo().getPackageName());
            this.f170893b.f170858f = tTAPkgInfo;
            if (i < 2) {
                File file = this.f170894c;
                if (file != null && file.exists()) {
                    IOUtils.delete(this.f170894c);
                }
                throw new DecodeException(-7);
            } else if (!this.f170893b.f170861i) {
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "pkg stream loader not ready:", this.f170893b.getAppInfo().getIdentifier());
                this.f170893b.f170861i = true;
                this.f170893b.f170854b.mo232834a(tTAPkgInfo);
                this.f170893b.mo235466a(tTAPkgInfo);
                AbstractC67851p pVar = this.f170892a;
                if (pVar != null) {
                    pVar.mo235377a();
                }
            } else {
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "pkg stream loader already is ready:", this.f170893b.getAppInfo().getIdentifier());
            }
        }

        public C67841a(IAppContext iAppContext, AbstractC67851p pVar, File file) {
            boolean z = false;
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "app context appId:", iAppContext.getAppId());
            this.f170892a = pVar;
            this.f170894c = file;
            this.f170895d = iAppContext;
            if (iAppContext instanceof AbstractC67433a ? ((AbstractC67433a) iAppContext).mo234167g() : z) {
                this.f170893b = ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).getCurrentLoadTask();
            } else {
                this.f170893b = ((IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class)).getLoadTask();
            }
        }

        @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a
        /* renamed from: a */
        public void mo235450a(TTAPkgFile tTAPkgFile, byte[] bArr, int i, int i2) {
            this.f170893b.f170854b.mo232833a(tTAPkgFile, bArr, i, i2);
        }
    }

    /* renamed from: a */
    public void mo235466a(final TTAPkgInfo tTAPkgInfo) {
        if (this.f170860h == null) {
            this.f170860h = new ConcurrentHashMap<>();
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.refer.common.pkg.C67834k.C678384 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                for (TTAPkgFile tTAPkgFile : tTAPkgInfo.getFiles()) {
                    if (!TextUtils.isEmpty(C67834k.this.f170855c) && C67834k.this.f170856d != null && C67834k.this.f170856d.mo233005a(tTAPkgFile.getFileName())) {
                        AppBrandLogger.m52828d("app_start_load_pkg_mgr_load_task", "extracting file " + tTAPkgFile.getFileName() + " to " + C67834k.this.f170855c);
                        File file = new File(C67834k.this.f170855c, tTAPkgFile.getFileName());
                        if (!file.exists() || file.length() != ((long) tTAPkgFile.getSize())) {
                            C67834k kVar = C67834k.this;
                            Future<String> a = kVar.mo235463a(kVar.f170855c, tTAPkgFile);
                            if (C67834k.this.f170859g == null) {
                                C67834k.this.f170859g = new HashMap<>();
                            }
                            C67834k.this.f170859g.put(tTAPkgFile, a);
                        } else {
                            C67834k.this.f170860h.put(tTAPkgFile.getFileName(), file.getAbsolutePath());
                        }
                    }
                }
            }
        }, C67554l.m262725b());
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public TTAPkgFile findFile(String str) {
        String d;
        if (TTFileHelper.m264259a("PkgStreamLoader", this.f170871s)) {
            return m263924b(str);
        }
        if (this.f170858f == null || (d = this.f170869q.mo235088d(str)) == null) {
            return null;
        }
        return this.f170858f.findFile(d);
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public byte[] requestBytes(TTAPkgFile tTAPkgFile) {
        if (tTAPkgFile == null) {
            return null;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            AppBrandLogger.eWithThrowable("app_start_load_pkg_mgr_load_task", "DO NOT block MAIN_PROCESS to waiting result of file read: " + tTAPkgFile.getFileName(), new Throwable());
        }
        return this.f170854b.mo232835a(tTAPkgFile);
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public String waitExtractFinish(TTAPkgFile tTAPkgFile) {
        Future<String> future;
        HashMap<TTAPkgFile, Future<String>> hashMap = this.f170859g;
        if (!(hashMap == null || (future = hashMap.get(tTAPkgFile)) == null)) {
            try {
                return future.get();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.f170860h;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(tTAPkgFile.getFileName())) {
            return "";
        }
        return this.f170860h.get(tTAPkgFile.getFileName());
    }

    /* renamed from: a */
    private String m263923a(String str) {
        if (this.f170863k < 0) {
            this.f170863k = 0;
        }
        Map<String, PackageComponent> packageComponents = this.f170853a.getPackageComponents();
        if (packageComponents == null || packageComponents.isEmpty() || packageComponents.get(str) == null || packageComponents.get(str).mo235799d() == null || packageComponents.get(str).mo235799d().size() <= this.f170863k) {
            return "";
        }
        List<String> d = packageComponents.get(str).mo235799d();
        int i = this.f170863k;
        this.f170863k = i + 1;
        return d.get(i);
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public boolean isDirectoryOfPkg(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String d = this.f170869q.mo235088d(str);
        if (d.startsWith("./")) {
            d = d.substring(2);
        } else if (d.startsWith("/")) {
            d = d.substring(1);
        }
        TTAPkgInfo tTAPkgInfo = this.f170858f;
        if (tTAPkgInfo != null) {
            for (String str2 : tTAPkgInfo.getFileNames()) {
                if (str2 != null && (lastIndexOf = str2.lastIndexOf("/")) > 0 && TextUtils.equals(d, str2.substring(0, lastIndexOf))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tt.refer.common.pkg.IStreamLoader
    public String getStringCache(String str, byte[] bArr) {
        return this.f170854b.mo232830a(str, bArr);
    }

    /* renamed from: a */
    public Future<String> mo235463a(final String str, final TTAPkgFile tTAPkgFile) {
        if (this.f170867o == null) {
            this.f170867o = Executors.newCachedThreadPool(new ThreadFactory() {
                /* class com.tt.refer.common.pkg.C67834k.ThreadFactoryC678395 */

                /* renamed from: a */
                public static Thread m263941a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    return m263941a(new Thread(runnable, "pkgFileExtractThread"));
                }
            });
        }
        return this.f170867o.submit(new Callable<String>() {
            /* class com.tt.refer.common.pkg.C67834k.CallableC678406 */

            /* renamed from: a */
            public String call() {
                InputStream requestStream = C67834k.this.requestStream(tTAPkgFile);
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                tTAPkgFile.saveTo(file, requestStream);
                if (C67834k.this.f170859g != null) {
                    C67834k.this.f170859g.remove(tTAPkgFile);
                }
                File file2 = new File(str, tTAPkgFile.getFileName());
                if (!file2.exists()) {
                    return "";
                }
                C67834k.this.f170860h.putIfAbsent(tTAPkgFile.getFileName(), file2.getAbsolutePath());
                return file2.getAbsolutePath();
            }
        });
    }

    /* renamed from: a */
    public void mo235464a(final int i, final AbstractC67851p pVar, final IAppContext iAppContext) {
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpDownloadStart(this.f170857e, this.f170853a.getIdentifier(), 0);
        this.f170866n = false;
        String b = m263925b();
        if (!TextUtils.isEmpty(b)) {
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream, stream load for appId: ", this.f170853a.getAppId(), ", url: ", b);
            File file = new File(this.f170864l, this.f170865m);
            DownloadRequest.C67778a aVar = new DownloadRequest.C67778a(b);
            aVar.mo235237a(new C67844l(iAppContext)).mo235242b(file.getAbsolutePath()).mo235239a(this.f170865m).mo235238a(new C67756a(this.f170853a.getMd5())).mo235235a(i);
            this.f170868p.mo235135a(aVar.mo235240a(), (IDownloadListener<DownloadRequest>) new AbsDownloadListener<DownloadRequest>() {
                /* class com.tt.refer.common.pkg.C67834k.C678351 */

                /* renamed from: c */
                public void onDownloading(DownloadRequest downloadRequest) {
                    pVar.mo235378a(downloadRequest.getDownloadPercent());
                }

                /* renamed from: b */
                public void onComplete(DownloadRequest downloadRequest) {
                    AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onComplete:", downloadRequest);
                    pVar.mo235379a(C67834k.this.f170858f);
                }

                /* renamed from: a */
                public void onReady(DownloadRequest downloadRequest) {
                    AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onReady:", downloadRequest);
                    pVar.mo235377a();
                    LarkInnerEventHelper.mpDownloadResult(C67834k.this.f170857e, C67834k.this.f170853a.getIdentifier(), 0, true, downloadRequest.getDownloadUrl(), TimeMeter.stop(newAndStart), null, null);
                }

                /* renamed from: d */
                public void onError(DownloadRequest downloadRequest) {
                    AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onError:code", downloadRequest.getDownloadError().f170701a, "errorMsg:", downloadRequest.getDownloadError().f170702b, C67834k.this.f170853a.getIdentifier());
                    if (C67834k.this.f170853a.getUrls() == null || C67834k.this.f170853a.getUrls().size() <= C67834k.this.f170862j) {
                        IMonitorCreator iMonitorCreator = C67834k.this.f170857e;
                        String identifier = C67834k.this.f170853a.getIdentifier();
                        String downloadUrl = downloadRequest.getDownloadUrl();
                        long stop = TimeMeter.stop(newAndStart);
                        String str = downloadRequest.getDownloadError().f170701a;
                        LarkInnerEventHelper.mpDownloadResult(iMonitorCreator, identifier, 0, false, downloadUrl, stop, str, downloadRequest.getDownloadError().f170702b + C67834k.this.f170853a.getJsonMeta());
                        AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "download error >>no url to retry");
                        pVar.mo235380a(downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                        return;
                    }
                    AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "download error and has other url >>retry it!");
                    C67834k.this.mo235464a(i, pVar, iAppContext);
                }
            });
            return;
        }
        pVar.mo235380a("-5", "no available download url");
    }

    /* renamed from: b */
    public void mo235468b(final int i, final AbstractC67851p pVar, final IAppContext iAppContext) {
        String str;
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpDownloadStart(this.f170857e, this.f170853a.getIdentifier(), 4);
        this.f170866n = false;
        if (TextUtils.isEmpty(this.f170870r)) {
            this.f170870r = "__APP__";
        }
        Map<String, PackageComponent> packageComponents = this.f170853a.getPackageComponents();
        String str2 = null;
        if (packageComponents == null || packageComponents.isEmpty()) {
            str = null;
        } else {
            str = null;
            for (String str3 : packageComponents.keySet()) {
                if (this.f170870r.startsWith(str3)) {
                    str2 = m263923a(str3);
                    str = this.f170853a.getSubPkgMd5(str3);
                }
            }
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            pVar.mo235380a("-5", "no available download url");
            return;
        }
        AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream, stream load for appId: ", this.f170853a.getAppId(), ", url: ", str2);
        File file = new File(this.f170864l, this.f170865m);
        DownloadRequest.C67778a aVar = new DownloadRequest.C67778a(str2);
        aVar.mo235237a(new C67844l(iAppContext)).mo235242b(file.getAbsolutePath()).mo235239a(this.f170865m).mo235238a(new C67756a(str)).mo235235a(i);
        this.f170868p.mo235135a(aVar.mo235240a(), (IDownloadListener<DownloadRequest>) new AbsDownloadListener<DownloadRequest>() {
            /* class com.tt.refer.common.pkg.C67834k.C678362 */

            /* renamed from: c */
            public void onDownloading(DownloadRequest downloadRequest) {
                pVar.mo235378a(downloadRequest.getDownloadPercent());
            }

            /* renamed from: b */
            public void onComplete(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onComplete:", downloadRequest);
                pVar.mo235379a(C67834k.this.f170858f);
            }

            /* renamed from: a */
            public void onReady(DownloadRequest downloadRequest) {
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onReady:", downloadRequest);
                pVar.mo235377a();
                LarkInnerEventHelper.mpDownloadResult(C67834k.this.f170857e, C67834k.this.f170853a.getIdentifier(), 4, true, downloadRequest.getDownloadUrl(), TimeMeter.stop(newAndStart), null, null);
            }

            /* renamed from: d */
            public void onError(DownloadRequest downloadRequest) {
                AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "loadWithOnlineStream>>onError:code", downloadRequest.getDownloadError().f170701a, "errorMsg:", downloadRequest.getDownloadError().f170702b, C67834k.this.f170853a.getIdentifier());
                int i = C67834k.this.f170863k;
                if (C67834k.this.f170853a.getUrls() == null || C67834k.this.f170853a.getUrls().size() <= i) {
                    IMonitorCreator iMonitorCreator = C67834k.this.f170857e;
                    String identifier = C67834k.this.f170853a.getIdentifier();
                    String downloadUrl = downloadRequest.getDownloadUrl();
                    long stop = TimeMeter.stop(newAndStart);
                    String str = downloadRequest.getDownloadError().f170701a;
                    LarkInnerEventHelper.mpDownloadResult(iMonitorCreator, identifier, 4, false, downloadUrl, stop, str, downloadRequest.getDownloadError().f170702b + C67834k.this.f170853a.getJsonMeta());
                    AppBrandLogger.m52829e("app_start_load_pkg_mgr_load_task", "download error >>no url to retry");
                    pVar.mo235380a(downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b);
                    return;
                }
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "download error and has other url >>retry it!");
                C67834k.this.mo235468b(i, pVar, iAppContext);
            }
        });
    }

    /* renamed from: a */
    public void mo235467a(final File file, final AbstractC67851p pVar, final IAppContext iAppContext) {
        AppBrandLogger.m52830i("app_start_load_pkg_mgr_load_task", "loadWithLocalFile, stream load for appId: ", this.f170853a.getAppId(), ", local file: ", file.getAbsolutePath());
        this.f170866n = true;
        C67554l.m262725b().execute(new Runnable() {
            /* class com.tt.refer.common.pkg.C67834k.RunnableC678373 */

            public void run() {
                C67841a aVar = new C67841a(iAppContext, pVar, file);
                if (file.exists()) {
                    new C67833j().mo235446a(new C66983d(file), aVar);
                    return;
                }
                aVar.mo235448a(-1, "loadWithLocalFile:pkg not found!");
            }
        });
    }

    public C67834k(PackageEntity packageEntity, C67752a aVar, File file, String str, String str2, int i, IAppContext iAppContext) {
        this(packageEntity, aVar, file, str, str2, i, iAppContext, null);
    }

    public C67834k(PackageEntity packageEntity, C67752a aVar, File file, String str, String str2, int i, IAppContext iAppContext, String str3) {
        File file2;
        this.f170862j = -1;
        this.f170863k = -1;
        this.f170853a = packageEntity;
        this.f170870r = str3;
        this.f170864l = file;
        this.f170865m = str;
        this.f170855c = str2;
        this.f170868p = aVar;
        this.f170856d = C66974a.m261057a(C66974a.m261056a(), C66974a.m261058b());
        if (!TextUtils.isEmpty(str)) {
            file2 = new File(file, str);
        } else {
            file2 = null;
        }
        this.f170854b = new C66867d(file2, i, iAppContext);
        this.f170869q = (AbstractC67722a) iAppContext.findServiceByInterface(AbstractC67722a.class);
        this.f170871s = iAppContext;
    }
}
