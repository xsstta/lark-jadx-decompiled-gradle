package com.ss.android.ugc.effectmanager.common.p3045a;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3046b.p3047a.C60500a;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.common.a.e */
public class C60498e extends FileICache implements IAllowListRule {

    /* renamed from: b */
    private static String f151242b;

    /* renamed from: d */
    private static List<String> f151243d = Arrays.asList("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");

    /* renamed from: e */
    private static List<String> f151244e = Arrays.asList("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

    /* renamed from: f */
    private static ArrayList<String> f151245f;

    /* renamed from: a */
    private C60500a f151246a;

    /* renamed from: c */
    private C60497c f151247c;

    /* renamed from: g */
    private File f151248g;

    /* renamed from: h */
    private AbstractC60511c f151249h;

    /* renamed from: i */
    private C60549e f151250i;

    /* renamed from: a */
    private synchronized void m235094a() {
        File file;
        File file2;
        C60500a aVar = this.f151246a;
        if ((aVar == null || !aVar.mo207157a()) && (file2 = this.f151248g) != null) {
            try {
                this.f151246a = C60500a.m235119a(file2, 0, 1, 838860800, this);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.f151247c == null && (file = this.f151248g) != null) {
            this.f151247c = new C60497c(file);
        }
    }

    /* renamed from: c */
    public void mo207140c(String str) {
        if (this.f151246a != null) {
            try {
                this.f151246a.mo207166e(C60500a.m235122f(str));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo207137a(Effect effect) {
        m235094a();
        mo207141d(effect.getUnzipPath());
        mo207141d(effect.getZipPath());
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    /* renamed from: b */
    public boolean mo207134b(String str) {
        m235094a();
        if (!this.f151246a.mo207164d(str)) {
            return false;
        }
        if (super.mo207134b(str)) {
            return true;
        }
        try {
            this.f151246a.mo207159b(str);
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    /* renamed from: d */
    public boolean mo207141d(String str) {
        m235094a();
        try {
            this.f151246a.mo207159b(C60500a.m235122f(new File(str).getName()));
        } catch (Exception unused) {
        }
        return super.mo207141d(str);
    }

    /* renamed from: f */
    private boolean m235095f(String str) {
        EPLog.m235179b("OldEffectDiskLruCache", "isCountry:" + str + " now:" + f151242b);
        if (TextUtils.isEmpty(str) || !str.equals(f151242b)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule
    /* renamed from: e */
    public boolean mo207142e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        EPLog.m235176a("OldEffectDiskLruCache", "allowlist：" + str);
        if (m235095f("BR") && f151243d.contains(this.f151247c.mo207135a(str))) {
            EPLog.m235176a("cleaneffect", "allowlist：BR");
            return true;
        } else if (!m235095f("RU") || !f151244e.contains(this.f151247c.mo207135a(str))) {
            ArrayList<String> arrayList = f151245f;
            if (arrayList == null || !arrayList.contains(str)) {
                return false;
            }
            EPLog.m235179b("OldEffectDiskLruCache", "allowlist：draft");
            return true;
        } else {
            EPLog.m235176a("OldEffectDiskLruCache", "allowlist：RU");
            return true;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache, com.ss.android.ugc.effectmanager.common.cachemanager.FileICache
    /* renamed from: a */
    public long mo207128a(String str, String str2) {
        m235094a();
        return super.mo207128a(str, str2);
    }

    /* renamed from: a */
    public void mo207138a(Effect effect, MonitorTrace bVar) throws Exception {
        m235094a();
        EPMonitor.m235192a(bVar, "OldEffectDiskLruCache#unzipEffectToDisk::unzip begin, from " + effect.getZipPath() + " to " + effect.getUnzipPath());
        String unzipPath = effect.getUnzipPath();
        String c = FileUtils.f151342a.mo207256c(effect.getUnzipPath(), "_tmp");
        try {
            FileUtils.f151342a.mo207259d(c);
            FileUtils.f151342a.mo207253b(effect.getZipPath(), c);
            EPMonitor.m235192a(bVar, "OldEffectDiskLruCache#unzipEffectToDisk::unzip to temp dir " + c + " success");
            if (!new File(c, "effect_platform_tag.tag").createNewFile()) {
                EPLog.m235180c("OldEffectDiskLruCache", "create effect platform tag file failed!");
            }
            FileUtils.f151342a.mo207250a(c, unzipPath, true, true);
            EPMonitor.m235192a(bVar, "OldEffectDiskLruCache#unzipEffectToDisk:: rename from " + c + " to " + unzipPath);
            this.f151246a.mo207161c(new File(effect.getUnzipPath()).getName());
            this.f151247c.mo207136a(effect.getId(), effect.getEffectId());
            String[] split = effect.getZipPath().split(File.separator);
            this.f151246a.mo207159b(split[split.length - 1]);
            EPMonitor.m235192a(bVar, "OldEffectDiskLruCache#unzipEffectToDisk::unzip success!!");
            AbstractC60511c cVar = this.f151249h;
            if (cVar != null) {
                cVar.mo207190a("effect_resource_unzip_success_rate", 0, C60532k.m235271a().mo207241a("effect_id", effect.getEffectId()).mo207241a("effect_name", effect.getName()).mo207241a("app_id", this.f151250i.mo207329n()).mo207241a("access_key", this.f151250i.mo207318c()).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
            }
        } catch (Exception e) {
            FileUtils.f151342a.mo207259d(c);
            FileUtils.f151342a.mo207259d(effect.getUnzipPath());
            EPLog.m235177a("OldEffectDiskLruCache", "unzip effect " + effect.getZipPath() + " to " + effect.getUnzipPath() + " failed.", e);
            StringBuilder sb = new StringBuilder();
            sb.append("OldEffectDiskLruCache#unzipEffectToDisk::unzip failed, cause = ");
            sb.append(e.getMessage());
            EPMonitor.m235192a(bVar, sb.toString());
            AbstractC60511c cVar2 = this.f151249h;
            if (cVar2 != null) {
                cVar2.mo207190a("effect_resource_unzip_success_rate", 1, C60532k.m235271a().mo207241a("effect_id", effect.getEffectId()).mo207241a("effect_name", effect.getName()).mo207241a("app_id", this.f151250i.mo207329n()).mo207241a("access_key", this.f151250i.mo207318c()).mo207241a("error_msg", Log.getStackTraceString(e)).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
        r3 = null;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0108, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0129, code lost:
        r10.mo207174c();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0108 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129 A[Catch:{ all -> 0x0132 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo207139a(com.ss.android.ugc.effectmanager.effect.model.Effect r18, java.io.InputStream r19, long r20, com.ss.android.ugc.effectmanager.common.download.DownloadListener r22) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.p3045a.C60498e.mo207139a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.io.InputStream, long, com.ss.android.ugc.effectmanager.common.download.a):void");
    }
}
