package com.bytedance.ee.bear.basesdk.apiimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.basesdk.C4442b;
import com.bytedance.ee.bear.basesdk.api.AbstractC4377c;
import com.bytedance.ee.bear.basesdk.apiimpl.CacheManagerImpl;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.drive.services.AbstractC7181i;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p701d.C13615c;
import com.ss.android.lark.diskmanage.RemoteConfig;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public final class CacheManagerImpl implements AbstractC4377c {

    /* renamed from: a */
    private C10929e f13002a;

    /* access modifiers changed from: private */
    public static final class CCMCacheConfig implements NonProguard {
        public ConfigItem docsImage;
        public ConfigItem drive;

        /* access modifiers changed from: private */
        public static final class ConfigItem implements NonProguard {
            @JSONField(name = "size_limit")
            public long sizeLimit;
            @JSONField(name = "time_limit")
            public long timeLimit;

            private ConfigItem() {
            }
        }

        private CCMCacheConfig() {
        }

        public static CCMCacheConfig parse(String str) {
            try {
                CCMCacheConfig cCMCacheConfig = (CCMCacheConfig) JSON.parseObject(new JSONObject(str).getString("ccm"), CCMCacheConfig.class);
                if (cCMCacheConfig.drive == null || cCMCacheConfig.docsImage == null) {
                    return null;
                }
                return cCMCacheConfig;
            } catch (Exception e) {
                C13479a.m54759a("CacheManagerImpl", "parse CCMCacheConfig fail. ", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18095a(Boolean bool) throws Exception {
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo17024a() {
        C10929e eVar = this.f13002a;
        if (eVar == null) {
            C13479a.m54758a("CacheManagerImpl", "driveService is null!!!");
            return AbstractC68307f.m265084a((Throwable) new NullPointerException("mServices is null!!!"));
        }
        AbstractC68307f c = eVar.mo41523b(AbstractC7184l.class).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238014c($$Lambda$L0YNC40eIovLG6ZLGh6ds7xhSk4.INSTANCE);
        AbstractC68307f c2 = new C10917c(this.f13002a).mo41508c(AbstractC5094ag.class).mo238014c($$Lambda$CacheManagerImpl$qj_bFXfm2r2vnuHjGcl4YCOjmNs.INSTANCE);
        AbstractC5082ab abVar = (AbstractC5082ab) KoinJavaComponent.m268610a(AbstractC5082ab.class);
        if (abVar == null) {
            C13479a.m54758a("CacheManagerImpl", "cacheService is null!!!");
            return AbstractC68307f.m265084a((Throwable) new NullPointerException("cacheService is null!!!"));
        }
        return AbstractC68307f.m265101b(c, c2, abVar.mo20179b(), C4442b.m18368b(C13615c.f35773a), AbstractC68307f.m265083a((Object) true).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$xpfrNjdNsiv5kAcEyJNWr8ctCTY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CacheManagerImpl.this.m18098b((Boolean) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: c */
    public long mo17026c() {
        long[] jArr = {0};
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            mo17025b().mo237995a(new AbstractC68309a(countDownLatch) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$k_nBC6ymWb5Ep3EhhJSXrOS5YzU */
                public final /* synthetic */ CountDownLatch f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.AbstractC68309a
                public final void run() {
                    this.f$0.countDown();
                }
            }).mo238001b(new Consumer(jArr) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$lbgwztybG50jq5NggAaq0LToB_c */
                public final /* synthetic */ long[] f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CacheManagerImpl.m18097a(this.f$0, (Long) obj);
                }
            }, $$Lambda$CacheManagerImpl$wVziiuf2b_PLanJzNXR0L6OJNpA.INSTANCE);
            countDownLatch.await();
        } catch (Exception e) {
            C13479a.m54759a("CacheManagerImpl", "getManualCacheSize error. ", e);
        }
        return jArr[0];
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: d */
    public long mo17027d() {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            mo17024a().mo237995a(new AbstractC68309a(countDownLatch) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$k_nBC6ymWb5Ep3EhhJSXrOS5YzU */
                public final /* synthetic */ CountDownLatch f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.AbstractC68309a
                public final void run() {
                    this.f$0.countDown();
                }
            }).mo238001b($$Lambda$CacheManagerImpl$3TBQjddnRxQSQt2f0WCtGVTdn6o.INSTANCE, $$Lambda$CacheManagerImpl$GMhCfyxrwkqRONQiJUyByjpG30.INSTANCE);
            countDownLatch.await();
            return 0;
        } catch (Exception e) {
            C13479a.m54759a("CacheManagerImpl", "getManualCacheSize error. ", e);
            return 0;
        }
    }

    /* renamed from: e */
    private void m18101e() throws IOException {
        C13479a.m54764b("CacheManagerImpl", "cleanWebView start");
        File filesDir = C13615c.f35773a.getFilesDir();
        filesDir.getParentFile();
        File[] listFiles = filesDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isDirectory()) {
                    String name = file.getName();
                    if (name.startsWith("app_webview") && name.endsWith(":p0")) {
                        m18094a(new File(file, "Default/IndexedDB"));
                        m18094a(new File(file, "IndexedDB"));
                        m18094a(new File(file, "data/IndexedDB"));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: b */
    public AbstractC68307f<Long> mo17025b() {
        C10929e eVar = this.f13002a;
        if (eVar == null) {
            C13479a.m54758a("CacheManagerImpl", "driveService is null!!!");
            return AbstractC68307f.m265084a((Throwable) new NullPointerException("mServices is null!!!"));
        }
        AbstractC68307f c = eVar.mo41523b(AbstractC7184l.class).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238014c($$Lambda$79mjbNa5_UBPVTumefJjdztdMiU.INSTANCE);
        AbstractC68307f c2 = new C10917c(this.f13002a).mo41508c(AbstractC5094ag.class).mo238014c(new Function(10485760) {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$G92lYXRCMVAs7nf96feNOUisAho */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((AbstractC5094ag) obj).getDocCacheSize(this.f$0);
            }
        });
        AbstractC5082ab abVar = (AbstractC5082ab) KoinJavaComponent.m268610a(AbstractC5082ab.class);
        if (abVar != null) {
            return AbstractC68307f.m265093a(c, c2, abVar.mo20176a());
        }
        C13479a.m54758a("CacheManagerImpl", "cacheService is null!!!");
        return AbstractC68307f.m265084a((Throwable) new NullPointerException("cacheService is null!!!"));
    }

    public CacheManagerImpl(C10929e eVar) {
        this.f13002a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m18098b(Boolean bool) throws Exception {
        System.currentTimeMillis();
        m18101e();
        return true;
    }

    /* renamed from: a */
    private void m18094a(File file) throws IOException {
        if (file.isDirectory() && file.exists()) {
            C13479a.m54764b("CacheManagerImpl", "cleanWebView delete = " + file);
            C13675f.m55543l(file);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4377c
    /* renamed from: a */
    public long mo17023a(RemoteConfig dVar) {
        CCMCacheConfig parse;
        if (dVar == null || (parse = CCMCacheConfig.parse(dVar.mo135641b())) == null) {
            return 0;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long c = currentTimeMillis - (dVar.mo135639a().mo135568c() * 1000);
            this.f13002a.mo41523b(AbstractC5094ag.class).mo238020d(new Function(c) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$oFFTb_v__1XTkQXaeG2gqCfG7o */
                public final /* synthetic */ long f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CacheManagerImpl.m18090a(this.f$0, (AbstractC5094ag) obj);
                }
            }).mo238023d();
            this.f13002a.mo41523b(AbstractC5094ag.class).mo238020d(new Function(currentTimeMillis, parse) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$sepI9LyEPPzbbByN1YjENYeEWA */
                public final /* synthetic */ long f$0;
                public final /* synthetic */ CacheManagerImpl.CCMCacheConfig f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r3;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CacheManagerImpl.m18089a(this.f$0, this.f$1, (AbstractC5094ag) obj);
                }
            }).mo238023d();
            this.f13002a.mo41523b(AbstractC7184l.class).mo238014c(new Function(currentTimeMillis, parse) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$7YZPXM2jNJLqPrDa0CA4Th_yYs */
                public final /* synthetic */ long f$0;
                public final /* synthetic */ CacheManagerImpl.CCMCacheConfig f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r3;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CacheManagerImpl.m18092a(this.f$0, this.f$1, (AbstractC7184l) obj);
                }
            }).mo238023d();
            this.f13002a.mo41523b(AbstractC7181i.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$CacheManagerImpl$RJGKelRppG0ToGJ1bTZfuHl1Gs */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CacheManagerImpl.m18091a(CacheManagerImpl.CCMCacheConfig.this, (AbstractC7181i) obj);
                }
            }).mo238023d();
            C13675f.m55493a(c, new File(CCMStorage.m21714b(C13615c.f35773a, Biz.DOCS), "font"));
            return 0;
        } catch (Exception e) {
            C13479a.m54759a("CacheManagerImpl", "remoteClean error. ", e);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m18090a(long j, AbstractC5094ag agVar) throws Exception {
        return Integer.valueOf(agVar.clearUpTimeMills(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m18091a(CCMCacheConfig cCMCacheConfig, AbstractC7181i iVar) throws Exception {
        return Integer.valueOf(iVar.trimLruCacheToSize(cCMCacheConfig.drive.sizeLimit));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m18097a(long[] jArr, Long l) throws Exception {
        jArr[0] = jArr[0] + l.longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m18089a(long j, CCMCacheConfig cCMCacheConfig, AbstractC5094ag agVar) throws Exception {
        return Integer.valueOf(agVar.clearImageUpTimeMills(j - (cCMCacheConfig.docsImage.timeLimit * 1000), cCMCacheConfig.docsImage.sizeLimit));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m18092a(long j, CCMCacheConfig cCMCacheConfig, AbstractC7184l lVar) throws Exception {
        return lVar.cleanDriveCacheFlowable(j - (cCMCacheConfig.drive.timeLimit * 1000));
    }
}
