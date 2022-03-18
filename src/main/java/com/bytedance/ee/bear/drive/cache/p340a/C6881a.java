package com.bytedance.ee.bear.drive.cache.p340a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.cache.AbstractC6882b;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.C6890b;
import com.bytedance.ee.bear.drive.common.C6895h;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.config.fg.DriveCacheConfig;
import com.bytedance.ee.bear.drive.dao.AbstractC6954a;
import com.bytedance.ee.bear.drive.dao.AbstractC6972d;
import com.bytedance.ee.bear.drive.dao.C6965c;
import com.bytedance.ee.bear.drive.dao.p351a.C6955a;
import com.bytedance.ee.bear.drive.dao.p351a.C6956b;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.CipherException;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.cache.a.a */
public class C6881a implements AbstractC6882b {

    /* renamed from: c */
    private Context f18654c = C13615c.f35773a;

    /* renamed from: d */
    private long f18655d = 1073741824;

    /* renamed from: e */
    private volatile long f18656e = -1;

    /* renamed from: f */
    private C10917c f18657f;

    /* renamed from: g */
    private PersistenceSharedPreference f18658g;

    public static /* synthetic */ Boolean lambda$8IgN6YwAHNHrdFpBIJysKSXFlVU(C6881a aVar, Integer num) {
        return aVar.m27152d(num);
    }

    /* renamed from: lambda$Dp1-RdAoGYxYboPNAhdQAXf-Rwg  reason: not valid java name */
    public static /* synthetic */ Boolean m269417lambda$Dp1RdAoGYxYboPNAhdQAXfRwg(C6881a aVar, Integer num) {
        return aVar.m27142a(num);
    }

    public static /* synthetic */ Boolean lambda$NuqLpjq4EoiFliTAbUb2I8ZJazc(Integer num) {
        return m27149c(num);
    }

    public static /* synthetic */ Boolean lambda$iup1BBdIGNpHM8IG3fChLOlGPlA(Integer num) {
        return m27145b(num);
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27106a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2) {
        int i3;
        m27155g();
        C6955a aVar = new C6955a();
        File file = new File(str2 == null ? "" : str2);
        boolean exists = file.exists();
        boolean z3 = true;
        if (exists) {
            File a = C6890b.m27226a(i2);
            if (!a.exists()) {
                boolean mkdirs = a.mkdirs();
                C13479a.m54764b("DRIVE_CACHE_FLOW", "cache dir not exists, create it, " + mkdirs);
            }
            File a2 = m27141a(file);
            if (a2.length() < this.f18655d || i2 != 0) {
                i3 = i2;
            } else {
                C13479a.m54775e("DriveDbCacheImpl", "put() file Size lager than total cache size, put it to temp cache! fileSize=" + a2.length() + " cacheMaxSize=" + this.f18655d);
                i3 = 1;
            }
            aVar.mo27419a(a2.length());
            aVar.mo27435f(a2.getAbsolutePath());
        } else if (z || z2) {
            i3 = i2;
        } else {
            C13479a.m54758a("DRIVE_CACHE_FLOW", "put cache but file not exists.");
            return false;
        }
        aVar.mo27423b(i);
        aVar.mo27420a(str);
        aVar.mo27439h(str3);
        aVar.mo27418a(i3);
        aVar.mo27425b(str4);
        aVar.mo27429c(str5);
        aVar.mo27433e(str6);
        aVar.mo27431d(str7);
        aVar.mo27451n(str11);
        aVar.mo27424b(System.currentTimeMillis());
        aVar.mo27428c(aVar.mo27440i());
        aVar.mo27437g(str8);
        aVar.mo27441i(str9);
        aVar.mo27443j(str10);
        aVar.mo27447l(str12);
        aVar.mo27449m(str13);
        aVar.mo27453o(str14);
        int i4 = z ? 1 : 0;
        if (z2) {
            i4 |= 2;
        }
        aVar.mo27427c(i4);
        if (m27153e().mo27405a(aVar) <= 0) {
            z3 = false;
        }
        if (!z2 || exists) {
            if (z3) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31509b(arrayList).mo238020d(new Function() {
                        /* class com.bytedance.ee.bear.drive.cache.p340a.$$Lambda$a$8IgN6YwAHNHrdFpBIJysKSXFlVU */

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return C6881a.lambda$8IgN6YwAHNHrdFpBIJysKSXFlVU(C6881a.this, (Integer) obj);
                        }
                    }).mo238023d();
                } catch (Exception e) {
                    this.f18658g.mo34037a("sync_status_doc_finished", false);
                    C13479a.m54759a("DRIVE_CACHE_FLOW", "saveCachedStatus error ", e);
                }
                if (i3 == 0) {
                    m27147b(aVar.mo27436g());
                    m27156h();
                }
            } else {
                C13479a.m54758a("DRIVE_CACHE_FLOW", "add cache record to db failed");
                try {
                    if (!TextUtils.isEmpty(aVar.mo27434f())) {
                        C6895h.m27261a(new File(aVar.mo27434f()));
                    }
                } catch (Exception e2) {
                    C13479a.m54761a("DRIVE_CACHE_FLOW", e2);
                }
            }
            return z3;
        }
        C13479a.m54764b("DriveDbCacheImpl", "addDriveCache done, current is weboffice, ignore check. result=" + z3);
        return z3;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized List<DriveCache> mo27102a() {
        ArrayList arrayList;
        m27155g();
        arrayList = new ArrayList();
        List<C6955a> a = m27153e().mo27407a();
        if (a != null) {
            for (C6955a aVar : a) {
                DriveCache a2 = m27140a(aVar);
                if (m27144a(a2, aVar)) {
                    m27148b(aVar);
                } else {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27107a(String str) {
        m27155g();
        return m27148b(m27153e().mo27406a(str));
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27108a(String str, int i, int i2) {
        m27155g();
        C13479a.m54764b("DRIVE_CACHE_FLOW", "convertCacheType() st=" + i + " tt=" + i2);
        if (i == i2) {
            return true;
        }
        File file = new File(C6890b.m27226a(i), str);
        File file2 = new File(C6890b.m27226a(i2), str);
        if (!file.exists()) {
            C13479a.m54775e("DRIVE_CACHE_FLOW", "convertCacheType, but source file not exists");
        }
        try {
            if (!file.getParent().equals(file2.getParent())) {
                C13675f.m55514b(file, file2);
                C13675f.m55498a(file);
            }
            if (m27153e().mo27402a(str, i2, file2.getAbsolutePath()) > 0) {
                if (i == 0) {
                    m27150c(file2.length());
                } else if (i2 == 0) {
                    m27147b(file2.length());
                    m27156h();
                }
                C13479a.m54764b("DRIVE_CACHE_FLOW", "convertCacheType() done");
                return true;
            }
        } catch (Exception e) {
            try {
                C13675f.m55498a(file2);
            } catch (Exception unused) {
                C13479a.m54759a("DRIVE_CACHE_FLOW", "convertCacheType() delete target file", e);
            }
            C13479a.m54761a("DRIVE_CACHE_FLOW", e);
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27110a(List<String> list) {
        m27155g();
        List<C6955a> a = m27153e().mo27411a(list);
        if (C13657b.m55421a(a)) {
            return false;
        }
        boolean z = true;
        for (C6955a aVar : a) {
            z &= m27148b(aVar);
        }
        return z;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized List<DriveCache> mo27103a(int i, int i2) {
        m27155g();
        ArrayList arrayList = new ArrayList();
        List<C6955a> a = m27153e().mo27409a(i, i2);
        if (C13657b.m55421a(a)) {
            return arrayList;
        }
        for (C6955a aVar : a) {
            DriveCache a2 = m27140a(aVar);
            if (a2.mo20325b().exists() || aVar.mo27458t()) {
                arrayList.add(a2);
            } else {
                m27148b(aVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized List<DriveCache> mo27104a(int i, int i2, long j, String str, String str2) {
        m27155g();
        ArrayList arrayList = new ArrayList();
        List<C6955a> a = m27153e().mo27410a(i2, j, str, str2);
        if (C13657b.m55421a(a)) {
            return arrayList;
        }
        for (C6955a aVar : a) {
            DriveCache a2 = m27140a(aVar);
            if (a2.mo20325b().exists() || aVar.mo27458t()) {
                arrayList.add(a2);
            } else {
                m27148b(aVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27109a(String str, String str2) {
        m27155g();
        return m27153e().mo27404a(str, str2) > 0;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized boolean mo27105a(int i) {
        m27155g();
        List<C6955a> a = m27153e().mo27408a(i);
        if (a == null) {
            return true;
        }
        for (C6955a aVar : a) {
            m27148b(aVar);
        }
        C13479a.m54764b("DRIVE_CACHE_FLOW", "removeAll, type=" + i + " size=" + a.size());
        return false;
    }

    /* renamed from: h */
    private void m27156h() {
        m27151d(this.f18655d);
    }

    /* renamed from: e */
    private AbstractC6954a m27153e() {
        return C6965c.m27719a().mo27478b();
    }

    /* renamed from: f */
    private AbstractC6972d m27154f() {
        return C6965c.m27719a().mo27479c();
    }

    /* renamed from: g */
    private void m27155g() {
        if (this.f18656e < 0) {
            synchronized (this) {
                if (this.f18656e < 0) {
                    this.f18656e = m27153e().mo27414b(0);
                    C13479a.m54772d("DRIVE_CACHE_FLOW", "init offline cache size= " + this.f18656e);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: c */
    public synchronized long mo27113c() {
        m27155g();
        C13479a.m54764b("DriveDbCacheImpl", "DriveDbCacheImpl.getCleanableCacheSize. ");
        return m27153e().mo27416c(2) + C6895h.m27262b(C6880a.m27109f(this.f18654c)) + C6895h.m27262b(C6880a.m27068a(this.f18654c));
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: d */
    public synchronized int mo27114d() {
        m27155g();
        C13479a.m54764b("DriveDbCacheImpl", "DriveDbCacheImpl.removeCleanableCache. ");
        mo27105a(0);
        mo27105a(1);
        mo27105a(-1);
        try {
            C6895h.m27260a(C6880a.m27111g(this.f18654c).getAbsolutePath());
            C6895h.m27260a(C6880a.m27102d(this.f18654c).getAbsolutePath());
            C6895h.m27260a(C6880a.m27109f(this.f18654c).getAbsolutePath());
        } catch (Exception e) {
            C13479a.m54765b("DriveDbCacheImpl", "DriveDbCacheImpl.removeCleanableCache fail. ", e);
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: b */
    public synchronized boolean mo27112b() {
        m27155g();
        try {
            C13479a.m54764b("DRIVE_CACHE_FLOW", "removeAll start");
            C6895h.m27260a(C6890b.m27226a(0).getAbsolutePath());
            C6895h.m27260a(C6890b.m27226a(2).getAbsolutePath());
            List<DriveCache> a = mo27102a();
            ArrayList arrayList = new ArrayList();
            for (DriveCache driveCache : a) {
                arrayList.add(driveCache.mo20337g());
            }
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31516c(arrayList).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.drive.cache.p340a.$$Lambda$a$Dp1RdAoGYxYboPNAhdQAXfRwg */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C6881a.m269417lambda$Dp1RdAoGYxYboPNAhdQAXfRwg(C6881a.this, (Integer) obj);
                }
            }).mo238023d();
        } catch (Exception e) {
            C13479a.m54761a("DRIVE_CACHE_FLOW", e);
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public int mo27098a(long j) {
        return m27151d(j);
    }

    /* renamed from: b */
    private static /* synthetic */ Boolean m27145b(Integer num) throws Exception {
        C13479a.m54764b("DRIVE_CACHE_FLOW", "trimLruCacheToSize sync to status_doc done");
        return true;
    }

    /* renamed from: c */
    private void m27150c(long j) {
        synchronized (this) {
            this.f18656e -= j;
        }
    }

    /* renamed from: b */
    private void m27147b(long j) {
        synchronized (this) {
            this.f18656e += j;
        }
    }

    public C6881a(C10917c cVar) {
        this.f18657f = cVar;
        this.f18658g = new PersistenceSharedPreference("drive_cache_sp");
        m27143a(C6920b.m27342f().mo27168c());
    }

    /* renamed from: a */
    private /* synthetic */ Boolean m27142a(Integer num) throws Exception {
        if (num.intValue() > 0) {
            int b = m27153e().mo27412b();
            this.f18656e = 0;
            C13479a.m54764b("DRIVE_CACHE_FLOW", "removeAll finish, delete count=" + b);
        } else {
            C13479a.m54764b("DRIVE_CACHE_FLOW", "removeAll finish failed, delete list status failed");
        }
        return true;
    }

    /* renamed from: c */
    private static /* synthetic */ Boolean m27149c(Integer num) throws Exception {
        if (num.intValue() <= 0) {
            C13479a.m54764b("DRIVE_CACHE_FLOW", "delCachedStatus error, return ret = " + num);
        }
        C13479a.m54764b("DRIVE_CACHE_FLOW", "remove sync to status_doc done");
        return true;
    }

    /* renamed from: d */
    private /* synthetic */ Boolean m27152d(Integer num) throws Exception {
        if (num.intValue() <= 0) {
            this.f18658g.mo34037a("sync_status_doc_finished", false);
            C13479a.m54758a("DRIVE_CACHE_FLOW", "saveCachedStatus error, return ret: " + num);
        }
        C13479a.m54764b("DRIVE_CACHE_FLOW", "put sync to status_doc done");
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: b */
    public synchronized long mo27111b(int i) {
        m27155g();
        return m27153e().mo27414b(i);
    }

    /* renamed from: a */
    private void m27143a(C6923a aVar) {
        DriveCacheConfig k = aVar.mo27229k();
        File filesDir = this.f18654c.getFilesDir();
        if (filesDir == null) {
            C13479a.m54758a("DriveDbCacheImpl", "init() internalFile null");
            return;
        }
        long totalSpace = filesDir.getTotalSpace();
        long totalCacheSizePercent = (long) (((float) totalSpace) * k.getTotalCacheSizePercent());
        if (totalCacheSizePercent < 1073741824) {
            totalCacheSizePercent = 1073741824;
        } else if (totalCacheSizePercent > k.getMaxTotalCacheSize()) {
            totalCacheSizePercent = k.getMaxTotalCacheSize();
        }
        this.f18655d = totalCacheSizePercent;
        C13479a.m54764b("DriveDbCacheImpl", "init() formatDeviceTotalSpace=" + C13672c.m55478a(totalSpace) + " configPercent=" + k.getTotalCacheSizePercent() + " configMaxSize=" + k.getMaxTotalCacheSize() + " formatResultSize=" + C13672c.m55478a(this.f18655d));
    }

    /* renamed from: b */
    private static String m27146b(String str) {
        File file = new File(str);
        if (TextUtils.isEmpty(str) || !file.exists()) {
            C13479a.m54772d("DriveDbCacheImpl", "tryDecryptFile... invalid filepath : " + str);
            return str;
        }
        try {
            File a = C36808a.m145199a(file, false);
            if (a == null || TextUtils.isEmpty(a.getAbsolutePath()) || !a.exists()) {
                return str;
            }
            C13479a.m54772d("DriveDbCacheImpl", "tryDecryptFile... decrypt file suc : " + a.getAbsolutePath());
            return a.getAbsolutePath();
        } catch (DecryptException e) {
            C13479a.m54759a("DriveDbCacheImpl", "tryDecryptFile... err happens : ", e);
            return str;
        }
    }

    /* renamed from: a */
    private DriveCache m27140a(C6955a aVar) {
        String str;
        DriveCache driveCache = new DriveCache();
        driveCache.mo20329c(aVar.mo27430d());
        driveCache.mo20327b(aVar.mo27426c());
        driveCache.mo20323a(aVar.mo27417a());
        driveCache.mo20331d(aVar.mo27432e());
        driveCache.mo20334e(aVar.mo27422b());
        if (aVar.mo27434f().length() > 1) {
            str = aVar.mo27434f();
        } else {
            str = "";
        }
        driveCache.mo20322a(new File(str));
        driveCache.mo20336f(aVar.mo27444k());
        driveCache.mo20338g(aVar.mo27446l());
        driveCache.mo20320a(aVar.mo27438h());
        driveCache.mo20321a(aVar.mo27442j());
        driveCache.mo20342i(aVar.mo27461v());
        driveCache.mo20326b(aVar.mo27454p());
        driveCache.mo20340h(aVar.mo27456r());
        driveCache.mo20343j(aVar.mo27455q());
        driveCache.mo20345k(aVar.mo27463x());
        driveCache.mo20324a(aVar.mo27460u());
        return driveCache;
    }

    /* renamed from: b */
    private boolean m27148b(C6955a aVar) {
        if (aVar == null) {
            return false;
        }
        try {
            C6895h.m27261a(new File(aVar.mo27434f()));
            m27153e().mo27413b(aVar.mo27417a());
            List<C6956b> a = m27154f().mo27482a(aVar.mo27455q(), aVar.mo27446l(), aVar.mo27430d());
            if (a != null && a.size() > 0) {
                for (C6956b bVar : a) {
                    C6895h.m27261a(new File(bVar.mo27470d()));
                }
                m27154f().mo27483b(aVar.mo27455q(), aVar.mo27446l(), aVar.mo27430d());
            }
            if (aVar.mo27438h() == 0) {
                m27150c(aVar.mo27436g());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar.mo27446l());
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31516c(arrayList).mo238020d($$Lambda$a$NuqLpjq4EoiFliTAbUb2I8ZJazc.INSTANCE).mo238023d();
            return true;
        } catch (Exception e) {
            C13479a.m54759a("DRIVE_CACHE_FLOW", "remove cache -> delete file failed, ", e);
            return false;
        }
    }

    /* renamed from: d */
    private int m27151d(long j) {
        int i;
        if (this.f18656e <= j) {
            return 0;
        }
        synchronized (this) {
            C13479a.m54764b("DRIVE_CACHE_FLOW", "start trim size to max");
            i = 0;
            while (true) {
                if (this.f18656e <= j || i > 100) {
                    break;
                }
                i++;
                List<C6955a> b = m27153e().mo27415b(0, 16);
                if (C13657b.m55421a(b)) {
                    C13479a.m54764b("DRIVE_CACHE_FLOW", "trim file loop get cache is empty, stop trim");
                    break;
                }
                C13479a.m54764b("DriveDbCacheImpl", "cacheModels szie=" + b.size());
                for (C6955a aVar : b) {
                    if (this.f18656e <= j) {
                        break;
                    }
                    try {
                        C6895h.m27261a(new File(aVar.mo27434f()));
                        if (m27153e().mo27413b(aVar.mo27417a()) > 0) {
                            m27150c(aVar.mo27436g());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar.mo27446l());
                            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31516c(arrayList).mo238020d($$Lambda$a$iup1BBdIGNpHM8IG3fChLOlGPlA.INSTANCE).mo238023d();
                        } else {
                            C13479a.m54775e("DRIVE_CACHE_FLOW", "trim size deleted file failed");
                        }
                    } catch (Exception e) {
                        C13479a.m54761a("DRIVE_CACHE_FLOW", e);
                    }
                }
            }
            C13479a.m54764b("DRIVE_CACHE_FLOW", "trim cache finish, deleted file count = " + i + ", current offline cache size = " + this.f18656e);
        }
        return i;
    }

    /* renamed from: a */
    private static File m27141a(File file) {
        if (C36808a.m145211c() == 1 && file != null && file.exists()) {
            C13479a.m54764b("DriveDbCacheImpl", "tryEncryptFile... need encrypt file when it goes to cache");
            C13479a.m54772d("DriveDbCacheImpl", "tryEncryptFile... need encrypt file path : " + file.getAbsolutePath());
            try {
                String a = C36808a.m145200a(file.getAbsolutePath());
                C13479a.m54772d("DriveDbCacheImpl", "tryEncryptFile... after reverse, the file path is : " + a);
                File file2 = new File(a);
                if (!TextUtils.isEmpty(a) && file2.exists()) {
                    C13479a.m54772d("DriveDbCacheImpl", "tryEncryptFile... we are clear to return the original file ");
                    return file2;
                }
            } catch (CipherException e) {
                C13479a.m54764b("DriveDbCacheImpl", "tryEncryptFile... can not find original file : " + e.getErrorCode());
            }
            try {
                C36808a.m145203a(file);
                C13479a.m54764b("DriveDbCacheImpl", "tryEncryptFile... suc encrypt target file ");
            } catch (EncryptException e2) {
                C13479a.m54764b("DriveDbCacheImpl", "tryEncryptFile... can not encrypt target file : " + e2.getErrorCode());
            }
        }
        return file;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized int mo27100a(Long l) {
        m27155g();
        List<C6955a> a = m27153e().mo27407a();
        int i = 0;
        if (a == null) {
            return 0;
        }
        for (C6955a aVar : a) {
            if (aVar.mo27440i() <= l.longValue()) {
                m27148b(aVar);
                i++;
            }
        }
        C13479a.m54764b("DRIVE_CACHE_FLOW", "removeAll, beforeTimeInMills=" + l + " totalSize=" + a.size() + " removed size=" + i);
        return i;
    }

    /* renamed from: a */
    private boolean m27144a(DriveCache driveCache, C6955a aVar) {
        if (driveCache.mo20325b().exists() || aVar.mo27458t() || aVar.mo27460u()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized int mo27099a(long j, long j2) {
        m27155g();
        return mo27100a(Long.valueOf(j)) + m27151d(j2);
    }

    @Override // com.bytedance.ee.bear.drive.cache.AbstractC6882b
    /* renamed from: a */
    public synchronized DriveCache mo27101a(String str, boolean z) {
        m27155g();
        C6955a a = m27153e().mo27406a(str);
        if (a == null) {
            return null;
        }
        a.mo27435f(m27146b(a.mo27434f()));
        DriveCache a2 = m27140a(a);
        if (m27144a(a2, a)) {
            C13479a.m54775e("DRIVE_CACHE_FLOW", "get drive cache from db success, but file not exists, remove it");
            m27148b(a);
            return null;
        }
        if (z) {
            m27153e().mo27403a(str, System.currentTimeMillis());
        }
        return a2;
    }
}
