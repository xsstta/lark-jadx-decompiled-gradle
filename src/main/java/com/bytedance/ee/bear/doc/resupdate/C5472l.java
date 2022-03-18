package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.doc.resupdate.ConnectHelper;
import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5454a;
import com.bytedance.ee.bear.doc.resupdate.download.C5462b;
import com.bytedance.ee.bear.doc.resupdate.download.C5465e;
import com.bytedance.ee.bear.doc.resupdate.download.v2.DriveDownloader;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13683i;
import com.bytedance.ee.util.p701d.C13618f;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.AbstractC14277c;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14367l;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.l */
public class C5472l implements AbstractC5471k {

    /* renamed from: e */
    public static String f15548e = "docs_dev_fullPackage_download_duration";

    /* renamed from: o */
    private static final byte[] f15549o = new byte[0];

    /* renamed from: a */
    public List<String> f15550a;

    /* renamed from: b */
    public Context f15551b;

    /* renamed from: c */
    public Queue<ResourceCallback> f15552c;

    /* renamed from: d */
    public ConnectHelper f15553d;

    /* renamed from: f */
    private final C68289a f15554f;

    /* renamed from: g */
    private ConcurrentHashMap<String, ResUpdateListener> f15555g;

    /* renamed from: h */
    private Map<String, String> f15556h;

    /* renamed from: i */
    private Map<String, Long> f15557i;

    /* renamed from: j */
    private Map<String, String> f15558j;

    /* renamed from: k */
    private String f15559k;

    /* renamed from: l */
    private String f15560l;

    /* renamed from: m */
    private long f15561m;

    /* renamed from: n */
    private C14205b f15562n;

    /* renamed from: p */
    private AtomicBoolean f15563p;

    /* renamed from: com.bytedance.ee.bear.doc.resupdate.l$a */
    private static class C5482a {

        /* renamed from: a */
        public static final C5472l f15580a = new C5472l();
    }

    /* renamed from: b */
    public static C5472l m22202b() {
        return C5482a.f15580a;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: a */
    public void mo21886a(Context context) {
        if (this.f15563p.get()) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "has init ");
            return;
        }
        this.f15551b = context.getApplicationContext();
        m22207d(context);
        m22206c(context);
        if (!((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21883f()) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "feature switch close");
            return;
        }
        m22208e();
        this.f15563p.set(true);
        C13479a.m54764b("LocalResUpdateServiceImpl", "init(): ");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22199a(String str, JSONObject jSONObject) {
        ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21878a(str, jSONObject);
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: a */
    public void mo21885a() {
        if (m22215j()) {
            this.f15554f.mo237937a(m22214i().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$Fcy5EFbW51FgT3_tzUNf11O5kQ */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5472l.this.m22196a((C5472l) ((Boolean) obj));
                }
            }, $$Lambda$l$SPDQbFIGvHi3PMcuGsFqWMWn3OQ.INSTANCE));
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: a */
    public C5486o mo21884a(String str) {
        if (!this.f15556h.containsKey(str)) {
            C13479a.m54775e("LocalResUpdateServiceImpl", "getResource() null: channel = " + str);
            return new C5486o();
        }
        String str2 = this.f15556h.get(str);
        AbstractC5467g a = C5452c.m22107a(str);
        try {
            File c = C5483n.m22269c(this.f15551b, str2);
            if (c.list().length > 0) {
                C13479a.m54764b("LocalResUpdateServiceImpl", "getResource, use specific");
                return m22191a(c, c.listFiles()[0].getName(), str2, a);
            }
            boolean z = C4211a.m17514a().mo16536a("spacekit.res.use_grayscale_package", false) && !TextUtils.isEmpty(((GrayPackageConfig) C4211a.m17514a().mo16532a("grayscale_package_config", GrayPackageConfig.class, new GrayPackageConfig())).getVersion());
            File b = C5483n.m22265b(this.f15551b, str2);
            if (!z || b.list().length <= 0) {
                String d = C5483n.m22272d(this.f15551b, str2);
                if (TextUtils.isEmpty(d)) {
                    C13479a.m54764b("LocalResUpdateServiceImpl", "getResource, use asset");
                    return m22190a(a);
                }
                C13479a.m54764b("LocalResUpdateServiceImpl", "getResource, use space_res");
                return m22191a(C5483n.m22255a(this.f15551b, str2), d, str2, a);
            }
            C13479a.m54764b("LocalResUpdateServiceImpl", "getResource, use gray");
            return m22191a(b, b.listFiles()[0].getName(), str2, a);
        } catch (IOException e) {
            C13479a.m54759a("LocalResUpdateServiceImpl", "getResourceRootDir: failed return defaultResource", e);
            return m22190a(a);
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: a */
    public void mo21887a(ResourceCallback pVar) {
        if (!(pVar instanceof C5465e)) {
            pVar = new C5465e(pVar);
        }
        final C5465e eVar = (C5465e) pVar;
        C13479a.m54764b("LocalResUpdateServiceImpl", "downloadFullRes, retryCount = " + eVar.mo21854d());
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48477a()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54786 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                String str;
                if (C5472l.this.mo21890c("DOC_CHANNEL")) {
                    C13479a.m54764b("LocalResUpdateServiceImpl", "accept(): already has full res");
                    return;
                }
                final C5487q c = C5483n.m22268c(C5472l.this.f15551b);
                C13479a.m54772d("LocalResUpdateServiceImpl", "accept(): revision = " + c);
                final String d = C5472l.this.mo21897d(c.mo21926e());
                if (((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21882e()) {
                    str = c.mo21924d();
                } else {
                    str = c.mo21922c();
                }
                new C5462b().mo21847a(str, C5483n.m22264b(C5472l.this.f15551b).getAbsolutePath(), d, new AbstractC5454a() {
                    /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54786.C54791 */

                    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5454a, com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
                    /* renamed from: a */
                    public void mo21826a() {
                        super.mo21826a();
                        C13479a.m54764b("LocalResUpdateServiceImpl", "onStart(): ");
                    }

                    /* renamed from: b */
                    private boolean m22246b(Throwable th) {
                        if ((!(th instanceof DriveDownloader.DriveDownloadException) || ((DriveDownloader.DriveDownloadException) th).errorCode != 1007) && C5472l.this.f15553d != null) {
                            return C5472l.this.f15553d.mo21810b().mo21812b();
                        }
                        return false;
                    }

                    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5454a, com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
                    /* renamed from: a */
                    public void mo21828a(Throwable th) {
                        super.mo21828a(th);
                        C13479a.m54759a("LocalResUpdateServiceImpl", "onFail()", th);
                        if (!m22246b(th)) {
                            C5472l.this.f15552c.offer(eVar);
                            return;
                        }
                        C5472l.this.mo21891a(mo21831c(), false, th.getMessage(), eVar.mo21854d());
                        C5472l.this.mo21892a(eVar);
                    }

                    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5454a, com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
                    /* renamed from: a */
                    public void mo21829a(boolean z) {
                        super.mo21829a(z);
                        C13479a.m54764b("LocalResUpdateServiceImpl", "onFinished(): ");
                        try {
                            C5472l.this.mo21893a(c.mo21926e(), new File(C5483n.m22264b(C5472l.this.f15551b).getAbsolutePath(), d), C5483n.m22255a(C5472l.this.f15551b, C5472l.this.f15551b.getString(R.string.config_gecko_channel)));
                            eVar.mo21850a();
                            if (z) {
                                C5472l.this.mo21891a(mo21831c(), true, "success", eVar.mo21854d());
                            }
                            C13479a.m54764b("LocalResUpdateServiceImpl", "transferToSDFromDownloadX onFinished(): ");
                        } catch (Exception e) {
                            C13479a.m54759a("LocalResUpdateServiceImpl", "onFinished(): failed", e);
                            C5472l.this.mo21891a(mo21831c(), false, e.getMessage(), eVar.mo21854d());
                            C5472l.this.mo21892a(eVar);
                        }
                    }
                });
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54807 */

            /* renamed from: a */
            public void accept(Throwable th) {
                C13479a.m54759a("LocalResUpdateServiceImpl", "downloadFullRes(): failed", th);
                C5472l.this.mo21892a(eVar);
            }
        });
    }

    /* renamed from: a */
    public void mo21891a(long j, boolean z, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration_ms", j);
            jSONObject.put("is_success", z);
            jSONObject.put("errorMsg", str);
            jSONObject.put("retry_count", i);
            jSONObject.put("can_retry", String.valueOf(i < 3));
            ConnectHelper connectHelper = this.f15553d;
            if (connectHelper != null) {
                jSONObject.put("doc_network_status", connectHelper.mo21810b().mo21811a());
            }
            C13479a.m54772d("LocalResUpdateServiceImpl", "trackDownloadEvent duration = " + j + ",success = " + z + ",msg = " + str);
        } catch (JSONException e) {
            C13479a.m54759a("LocalResUpdateServiceImpl", "trackDownloadEvent failed", e);
        }
        ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21878a(f15548e, jSONObject);
    }

    /* renamed from: a */
    public void mo21893a(String str, File file, File file2) throws Exception {
        if (file.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            String string = this.f15551b.getString(R.string.config_gecko_channel);
            C13683i.m55567a(zipInputStream, file2.getAbsolutePath(), true);
            C5451b bVar = new C5451b(str, string);
            File file3 = new File(file2 + File.separator + string);
            if (bVar.mo21823a(new File(file3 + File.separator + "eesz").getAbsolutePath())) {
                m22203b(file);
                File file4 = new File(file2, str);
                if (file4.exists()) {
                    m22203b(file3);
                } else if (!file3.renameTo(file4)) {
                    throw new IOException("rename failed!!!");
                }
            } else {
                m22203b(file3);
                throw new IOException("zip is not compelete");
            }
        } else {
            throw new IOException("zip is not exist");
        }
    }

    /* renamed from: a */
    public void mo21892a(C5465e eVar) {
        int d = eVar.mo21854d();
        if (d == 3) {
            eVar.mo21852b();
            return;
        }
        AbstractC68307f.m265098b((long) eVar.mo21853c(), TimeUnit.SECONDS).mo238001b(new Consumer(eVar) {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$3k2kHNeXwXyDapotkEyRZbJheE */
            public final /* synthetic */ C5465e f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5472l.this.m22193a((C5472l) this.f$1, (C5465e) ((Long) obj));
            }
        }, $$Lambda$l$KyDn14gfHU1SNaSLIkHlXGmnVoE.INSTANCE);
        eVar.mo21851a(d + 1);
    }

    /* renamed from: a */
    private void m22201a(List<String> list) {
        C13479a.m54764b("LocalResUpdateServiceImpl", "checkUpdate(): " + list);
        ConnectHelper connectHelper = this.f15553d;
        if (connectHelper != null && !connectHelper.mo21810b().mo21812b()) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "checkUpdate(): channel stop cause isn't connected");
        } else if (this.f15562n == null) {
            C13479a.m54758a("LocalResUpdateServiceImpl", "checkUpdate(): GeckoClient == null");
        } else {
            this.f15562n.mo52091a(m22192a(this.f15560l, list), new AbstractC5466f() {
                /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54818 */

                @Override // com.bytedance.geckox.p769e.AbstractC14267a, com.bytedance.ee.bear.doc.resupdate.AbstractC5466f
                /* renamed from: b */
                public void mo21865b(UpdatePackage updatePackage) {
                    super.mo21865b(updatePackage);
                    C5472l.this.mo21899e(updatePackage.getChannel());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo21894a(String str, String str2) {
        ResUpdateListener mVar = this.f15555g.get(str);
        if (mVar != null) {
            mVar.onResourceUpdate(str2);
        } else {
            C13479a.m54758a("LocalResUpdateServiceImpl", "transferToSD(): cancel cause updateListener is null");
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: a */
    public void mo21888a(String str, ResUpdateListener mVar) {
        if (!m22215j() && this.f15556h.containsKey(str)) {
            this.f15555g.put(this.f15556h.get(str), mVar);
        }
    }

    /* renamed from: h */
    private void m22213h() {
        C14276b.m57601a();
        C14276b.m57602a(new AbstractC14277c() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54764 */

            @Override // com.bytedance.geckox.p771g.AbstractC14277c
            /* renamed from: a */
            public void mo21904a(String str, Object... objArr) {
                C13479a.m54764b(str, Arrays.toString(objArr));
            }

            @Override // com.bytedance.geckox.p771g.AbstractC14277c
            /* renamed from: a */
            public void mo21903a(String str, String str2, Throwable th) {
                C13479a.m54759a(str, str2, th);
            }

            @Override // com.bytedance.geckox.p771g.AbstractC14277c
            /* renamed from: b */
            public void mo21905b(String str, String str2, Throwable th) {
                C13479a.m54759a(str, str2, th);
            }
        });
    }

    /* renamed from: k */
    private String m22216k() {
        return this.f15551b.getString(R.string.config_gecko_channel);
    }

    /* renamed from: l */
    private File m22217l() {
        return GeckoResConfig.f15547a.mo21856b(this.f15551b);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m22218m() {
        this.f15553d.mo21809a().mo5925a(new AbstractC1178x<ConnectHelper.NetworkState>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54731 */

            /* renamed from: a */
            public void onChanged(ConnectHelper.NetworkState networkState) {
                if (networkState != null && networkState.mo21812b()) {
                    C13479a.m54772d("LocalResUpdateServiceImpl", "onChanged net restore connect");
                    C5472l.this.mo21898d();
                }
            }
        });
    }

    /* renamed from: i */
    private AbstractC68307f<Boolean> m22214i() {
        return AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$XZPm4V64k623X4lF1INVAj0CfgQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5472l.this.m22212h((String) obj);
            }
        });
    }

    /* renamed from: j */
    private boolean m22215j() {
        if (C13629i.m55308c()) {
            return false;
        }
        C13479a.m54775e("LocalResUpdateServiceImpl", "notInDocsProcess don`t work");
        return true;
    }

    /* renamed from: c */
    public void mo21896c() {
        if (this.f15562n == null) {
            try {
                m22211g();
                m22209f();
                m22201a(this.f15550a);
            } catch (GeckoInitException e) {
                C13479a.m54759a("LocalResUpdateServiceImpl", "initGecko(): fail", e);
            }
        } else {
            C13479a.m54764b("LocalResUpdateServiceImpl", "initGecko(): mGeckoClient has ready");
        }
    }

    /* renamed from: e */
    private void m22208e() {
        if (!m22215j()) {
            this.f15554f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo238019d(5, TimeUnit.SECONDS).mo238018d(new Consumer<Boolean>() {
                /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54742 */

                /* renamed from: a */
                public void accept(Boolean bool) {
                    C5472l.this.mo21896c();
                }
            }));
        }
    }

    /* renamed from: d */
    public void mo21898d() {
        while (this.f15552c.peek() != null) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "checkPendingCheckTask(): downloadFullRes");
            mo21887a(this.f15552c.poll());
        }
    }

    private C5472l() {
        this.f15554f = new C68289a();
        this.f15555g = new ConcurrentHashMap<>();
        this.f15550a = new ArrayList();
        this.f15556h = new HashMap();
        this.f15557i = new HashMap();
        this.f15558j = new HashMap();
        this.f15561m = 300000;
        this.f15552c = new ConcurrentLinkedQueue();
        this.f15563p = new AtomicBoolean(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed A[Catch:{ IOException -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22209f() {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.resupdate.C5472l.m22209f():void");
    }

    /* renamed from: g */
    private void m22211g() throws GeckoInitException {
        if (this.f15562n == null) {
            String a = ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21877a();
            this.f15559k = a;
            if (TextUtils.isEmpty(a)) {
                throw new GeckoInitException("deviceId is Empty!!!");
            } else if (!TextUtils.isEmpty(((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21880c())) {
                this.f15562n = C14205b.m57334a(new C14218d.C14220a(this.f15551b).mo52165b(this.f15560l).mo52161a(this.f15560l).mo52154a((long) ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21879b()).mo52166c(((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21880c()).mo52158a(C13618f.m55265a(this.f15551b)).mo52163b(this.f15559k).mo52157a(m22217l()).mo52160a(false).mo52156a($$Lambda$l$hW4Ijxh5uOqQh6OTuehYPIj7QKs.INSTANCE).mo52162a());
                m22213h();
                C13479a.m54764b("LocalResUpdateServiceImpl", "initGecko() finish: deviceId = " + this.f15559k);
            } else {
                throw new GeckoInitException("gecko domain is invalid");
            }
        }
    }

    /* renamed from: a */
    private C5486o m22190a(AbstractC5467g gVar) {
        File a = gVar.mo21824a(this.f15551b);
        return new C5486o(a, C5483n.m22257a(a));
    }

    /* renamed from: b */
    private void m22203b(File file) {
        try {
            C13675f.m55527d(file);
        } catch (IOException e) {
            C13479a.m54759a("LocalResUpdateServiceImpl", "deleteFile():failed", e);
        }
    }

    /* renamed from: c */
    private void m22206c(Context context) {
        this.f15553d = new ConnectHelper(context);
        C13748k.m55734b(new Runnable() {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$mg5SoT242gaB6DtiUjXRyZxjCNE */

            public final void run() {
                C5472l.this.m22218m();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m22205b(Throwable th) throws Exception {
        C13479a.m54758a("LocalResUpdateServiceImpl", "checkDeviceIdChanged() error : " + th);
    }

    /* renamed from: d */
    public String mo21897d(String str) {
        return str + "_" + C13629i.m55307c(null) + ".zip";
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: c */
    public boolean mo21890c(String str) {
        return C5483n.m22273e(this.f15551b, m22216k());
    }

    /* renamed from: f */
    public void mo21900f(String str) {
        try {
            C13675f.m55527d(new File(m22217l() + File.separator + this.f15560l + File.separator + str));
        } catch (IOException e) {
            C13479a.m54759a("LocalResUpdateServiceImpl", "clearGeckoRecordByChannel() failed ", e);
        }
    }

    /* renamed from: d */
    private void m22207d(Context context) {
        C13479a.m54764b("LocalResUpdateServiceImpl", "initConfig(): ");
        context.getSharedPreferences("debug_config", 0);
        context.getSharedPreferences("privatizationConfig", 0);
        this.f15560l = GeckoResConfig.f15547a.mo21855a(context);
        this.f15561m = ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21881d();
        String string = this.f15551b.getString(R.string.config_gecko_channel);
        this.f15550a.add(string);
        this.f15558j.put(string, "eesz");
        this.f15556h.put("DOC_CHANNEL", string);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ Boolean m22212h(String str) throws Exception {
        String a = ((AbstractC5470j) KoinJavaComponent.m268610a(AbstractC5470j.class)).mo21877a();
        if (TextUtils.equals(this.f15559k, a)) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "checkDeviceIdChanged(): current deviceId = " + this.f15559k);
            return false;
        }
        C13479a.m54764b("LocalResUpdateServiceImpl", "checkDeviceIdChanged(): old deviceId = " + this.f15559k + ",new deviceId = " + a);
        this.f15559k = a;
        return true;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5471k
    /* renamed from: b */
    public void mo21889b(String str) {
        long j;
        if (!m22215j()) {
            if (!this.f15563p.get()) {
                C13479a.m54775e("LocalResUpdateServiceImpl", "checkUpdate, gecko hasn't init, ignore");
                return;
            }
            String str2 = this.f15556h.get(str);
            if (this.f15557i.get(str2) != null) {
                j = this.f15557i.get(str2).longValue();
            } else {
                j = 0;
            }
            if (SystemClock.uptimeMillis() - j < this.f15561m) {
                C13479a.m54764b("LocalResUpdateServiceImpl", "checkUpdate，check update too frequently, ignore");
                return;
            }
            this.f15557i.put(str2, Long.valueOf(SystemClock.uptimeMillis()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            m22201a(arrayList);
        }
    }

    /* renamed from: e */
    public void mo21899e(String str) {
        if (TextUtils.isEmpty(str) || !this.f15550a.contains(str)) {
            C13479a.m54775e("LocalResUpdateServiceImpl", "applyGeckoResource(): invalid channel");
            return;
        }
        this.f15554f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$FPXAZYV_xw_GUtPhMwyOtJXF4PM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5472l.this.m22197a((C5472l) this.f$1, (String) ((Boolean) obj));
            }
        }, new Consumer(str) {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$2iZxc0vjBOdiOiZHcF0Y8nJLByA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5472l.this.m22198a((C5472l) this.f$1, (String) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    private void m22194a(final File file) {
        this.f15554f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.doc.resupdate.C5472l.C54775 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                C13675f.m55527d(file);
                for (String str : C5472l.this.f15550a) {
                    C5472l.this.mo21900f(str);
                }
                C13479a.m54764b("LocalResUpdateServiceImpl", "accept(): clean space_res dir success");
            }
        }, new Consumer(file) {
            /* class com.bytedance.ee.bear.doc.resupdate.$$Lambda$l$oVTk1mzUeETTf0hU7d3aijmWqVI */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5472l.m22195a(this.f$0, (Throwable) obj);
            }
        }));
    }

    /* renamed from: g */
    private File m22210g(String str) throws IOException {
        if (this.f15558j.containsKey(str)) {
            String b = C14367l.m57846b(m22217l(), this.f15560l, str);
            if (b != null) {
                File file = new File(b);
                if (file.exists()) {
                    File file2 = new File(file, this.f15558j.get(str));
                    C13479a.m54764b("LocalResUpdateServiceImpl", "getGeckoDirResource: " + file2.getPath());
                    if (file2.exists() && file2.isDirectory()) {
                        return file2;
                    }
                    throw new IOException("getGeckoDirResource()... resFolder is not exist or not is directory");
                }
                throw new IOException("getGeckoDirResource()...channel ->" + str + " channelFile not exists()");
            }
            throw new IOException("getGeckoDirResource()...channel ->" + str + " path is null");
        }
        throw new IOException("getGeckoDirResource()...channel ->" + str + "not found template dir");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22196a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C13479a.m54764b("LocalResUpdateServiceImpl", "reInit(): new deviceId " + this.f15559k);
            this.f15562n = null;
            mo21896c();
            return;
        }
        C13479a.m54764b("LocalResUpdateServiceImpl", "reInit(): deviceId not change " + this.f15559k);
    }

    /* renamed from: b */
    public void mo21895b(Context context) {
        if (m22215j()) {
            C5450a aVar = new C5450a();
            String a = C13618f.m55265a(context);
            boolean z = !aVar.mo21822b(a);
            C13479a.m54764b("LocalResUpdateServiceImpl", "cleanResource(): versionName = " + a + ",upgrade = " + z);
            if (z) {
                try {
                    File a2 = C5483n.m22255a(context, (String) null);
                    File file = new File(a2.getAbsolutePath() + "_" + System.currentTimeMillis());
                    if (a2.renameTo(file)) {
                        C13479a.m54772d("LocalResUpdateServiceImpl", "cleanResource root dir " + file);
                        m22194a(file);
                    } else {
                        C13479a.m54775e("LocalResUpdateServiceImpl", "cleanResource: rename res root dir failed ");
                    }
                    aVar.mo21821a(a);
                } catch (IOException e) {
                    C13479a.m54765b("LocalResUpdateServiceImpl", "cleanResource() dir failed ", e);
                }
            } else {
                C5483n.m22256a(context, context.getString(R.string.config_gecko_channel), true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22193a(C5465e eVar, Long l) throws Exception {
        mo21887a((ResourceCallback) eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22195a(File file, Throwable th) throws Exception {
        C13479a.m54759a("LocalResUpdateServiceImpl", "accept(): delete root file failed:" + file, th);
    }

    /* renamed from: a */
    private HashMap<String, List<CheckRequestBodyModel.TargetChannel>> m22192a(String str, List<String> list) {
        HashMap<String, List<CheckRequestBodyModel.TargetChannel>> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            arrayList.add(new CheckRequestBodyModel.TargetChannel(str2));
        }
        hashMap.put(str, arrayList);
        return hashMap;
    }

    /* renamed from: b */
    private void m22204b(String str, String str2) throws Exception {
        File g = m22210g(str);
        File a = C5483n.m22255a(this.f15551b, str);
        File file = new File(a, str2 + "_temp");
        C13479a.m54772d("LocalResUpdateServiceImpl", "transferToSD tempFile = " + file);
        if (file.exists()) {
            C13675f.m55527d(file);
            C13479a.m54764b("LocalResUpdateServiceImpl", "transferToSD(): delete exists tempFile = " + str2);
        }
        if (file.mkdir()) {
            C13675f.m55499a(g, new File(file, this.f15558j.get(str)));
            if (file.renameTo(new File(a, str2))) {
                C13479a.m54764b("LocalResUpdateServiceImpl", "transferToSD(): success");
                mo21894a(str, str2);
                return;
            }
            throw new IOException("transferToSD(): rename folder failed");
        }
        throw new IOException("transferToSD(): tempFile mkdir failed");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22197a(String str, Boolean bool) throws Exception {
        synchronized (f15549o) {
            String a = C5483n.m22257a(m22210g(str));
            String d = C5483n.m22272d(this.f15551b, str);
            int a2 = C5483n.m22252a(d, a);
            C13479a.m54764b("LocalResUpdateServiceImpl", "applyGeckoResource() sdVersion = " + d + ", geckoVersion = " + a + "compare result = " + a2);
            if (a2 == -2) {
                throw new IOException("applyGeckoResource resource version is damage");
            } else if (a2 == -1) {
                m22204b(str, a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22198a(String str, Throwable th) throws Exception {
        mo21900f(str);
        C13479a.m54759a("LocalResUpdateServiceImpl", "applyGeckoResource failed ", th);
    }

    /* renamed from: a */
    private C5486o m22191a(File file, String str, String str2, AbstractC5467g gVar) throws IOException {
        File file2 = new File(file + File.separator + str);
        File file3 = new File(file2, gVar.mo21825a());
        C13479a.m54772d("LocalResUpdateServiceImpl", "getResourceInternal, res = " + file3);
        boolean a = new C5451b(str, str2).mo21823a(file3.getPath());
        C13479a.m54764b("LocalResUpdateServiceImpl", "getResourceInternal, md5 check completion = " + a);
        if (!a) {
            mo21900f(str2);
            C13675f.m55498a(file2);
        }
        if (a) {
            return new C5486o(file3, str);
        }
        return m22190a(gVar);
    }
}
