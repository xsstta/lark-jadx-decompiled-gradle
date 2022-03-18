package com.bytedance.ee.bear.document.offline.offlinestorage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.util.p701d.C13629i;
import com.larksuite.framework.utils.C26317s;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.i */
public class C5980i {

    /* renamed from: a */
    private final String f16754a;

    /* renamed from: b */
    private final String f16755b;

    /* renamed from: c */
    private C5953b f16756c;

    /* renamed from: d */
    private boolean f16757d;

    /* renamed from: e */
    private boolean f16758e;

    /* renamed from: f */
    private ReadWriteLock f16759f;

    /* renamed from: b */
    private void m24186b() {
        File[] listFiles;
        File file = new File(this.f16755b);
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(".temp")) {
                    m24185a(file2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24186a() {
        File file = new File(this.f16755b);
        try {
            this.f16759f.writeLock().lock();
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            C13479a.m54773d("ResourceDataPackHelper", "clearAllResourceExtraDataFile:", e);
        } catch (Throwable th) {
            this.f16759f.writeLock().unlock();
            throw th;
        }
        this.f16759f.writeLock().unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo24183a(String str) {
        return new File(this.f16755b, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo24181a(Context context) {
        return C13675f.m55531f(new File(CCMStorage.m21714b(context, Biz.DOCS), "offlineDocData"));
    }

    /* renamed from: a */
    private void m24185a(File file) {
        try {
            this.f16759f.writeLock().lock();
            C13675f.m55498a(file);
        } catch (Exception e) {
            C13479a.m54773d("ResourceDataPackHelper", "deleteFile:", e);
        } catch (Throwable th) {
            this.f16759f.writeLock().unlock();
            throw th;
        }
        this.f16759f.writeLock().unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24190c(List<C5952a> list) {
        m24186b();
        if (!C26317s.m95316a(list)) {
            for (C5952a aVar : list) {
                if (aVar != null && !TextUtils.isEmpty(aVar.mo24062a())) {
                    m24185a(new File(aVar.mo24062a()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24191d(List<C5968f> list) {
        m24186b();
        if (!C26317s.m95316a(list)) {
            for (C5968f fVar : list) {
                if (fVar != null && !TextUtils.isEmpty(fVar.mo24157q())) {
                    m24185a(new File(fVar.mo24157q()));
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5968f mo24187b(C5968f fVar) {
        byte[] bArr;
        String str;
        if (fVar == null) {
            return fVar;
        }
        if (!TextUtils.isEmpty(fVar.mo24157q())) {
            File file = new File(fVar.mo24157q());
            try {
                this.f16759f.readLock().lock();
                bArr = C13675f.m55530e(file);
                this.f16759f.readLock().unlock();
            } catch (Exception e) {
                C13479a.m54773d("ResourceDataPackHelper", "unPackResourceData:", e);
                this.f16759f.readLock().unlock();
                bArr = null;
            } catch (Throwable th) {
                this.f16759f.readLock().unlock();
                throw th;
            }
            if (bArr != null) {
                if (this.f16757d) {
                    str = this.f16756c.mo24067a(bArr);
                } else {
                    str = new String(bArr);
                }
                fVar.mo24138d(str);
                return fVar;
            }
            C13479a.m54775e("ResourceDataPackHelper", "fileToByte failed");
            return null;
        } else if (!this.f16757d || !this.f16758e) {
            return fVar;
        } else {
            return this.f16756c.mo24069b(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.bear.document.offline.offlinestorage.C5968f mo24182a(com.bytedance.ee.bear.document.offline.offlinestorage.C5968f r9) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.offline.offlinestorage.C5980i.mo24182a(com.bytedance.ee.bear.document.offline.offlinestorage.f):com.bytedance.ee.bear.document.offline.offlinestorage.f");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C5968f> mo24188b(List<C5968f> list) {
        if (list == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (C5968f fVar : list) {
            C5968f b = mo24187b(fVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C5968f> mo24185a(List<C5968f> list) {
        if (list == null) {
            return list;
        }
        for (C5968f fVar : list) {
            mo24182a(fVar);
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24189b(String str) {
        List<C5968f> h = C5955d.m24025b().mo24105h(str);
        if (!C26317s.m95316a(h)) {
            for (C5968f fVar : h) {
                if (!TextUtils.isEmpty(fVar.mo24157q())) {
                    m24185a(new File(fVar.mo24157q()));
                }
            }
        }
    }

    C5980i(Context context, char[] cArr) {
        this(context, cArr, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo24184a(String str, String str2) {
        return C13602d.m55222a(str + str2) + this.f16754a;
    }

    C5980i(Context context, char[] cArr, boolean z) {
        this.f16759f = new ReentrantReadWriteLock();
        if (C13629i.m55308c()) {
            this.f16754a = "_p0";
        } else {
            this.f16754a = C13629i.m55299a(context, "");
        }
        File file = new File(CCMStorage.m21714b(context, Biz.DOCS), "offlineDocData");
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f16755b = file.getAbsolutePath();
        this.f16756c = new C5953b(cArr);
        this.f16758e = z;
        this.f16757d = ((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("offline_encrypt", Boolean.TRUE)).booleanValue();
    }
}
