package com.bumptech.glide.load.engine.p088b;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import com.bumptech.glide.load.engine.p088b.C2323k;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.p1807a.AbstractC36802f;
import com.ss.android.lark.diskmanage.p1807a.C36804g;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.b.e */
public class C2311e implements AbstractC2302a {

    /* renamed from: a */
    private static C2311e f7673a;

    /* renamed from: b */
    private C2323k.AbstractC2325a f7674b;

    /* renamed from: c */
    private final C2323k f7675c;

    /* renamed from: d */
    private final File f7676d;

    /* renamed from: e */
    private final File f7677e;

    /* renamed from: f */
    private final long f7678f;

    /* renamed from: g */
    private final C2306c f7679g = new C2306c();

    /* renamed from: h */
    private AbstractC36802f f7680h;

    /* renamed from: i */
    private AbstractC36802f f7681i;

    /* renamed from: a */
    private boolean m9863a(AbstractC36802f fVar) {
        if (fVar.mo135522b().getPath().equals(this.f7677e.getPath())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private synchronized AbstractC36802f m9866b(AbstractC2265c cVar) throws IOException {
        C2323k.AbstractC2325a aVar = this.f7674b;
        if (aVar == null || !aVar.mo10755a(cVar)) {
            if (this.f7680h == null) {
                this.f7680h = new C36804g(this.f7676d.getPath(), 1, this.f7678f).mo135556b();
            }
            return this.f7680h;
        }
        if (this.f7681i == null) {
            this.f7681i = new C36804g(this.f7677e.getPath(), 1, this.f7678f).mo135557c();
        }
        return this.f7681i;
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2302a
    /* renamed from: a */
    public File mo10722a(AbstractC2265c cVar) {
        File file;
        String a = this.f7675c.mo10752a(cVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + cVar);
        }
        try {
            AbstractC36802f b = m9866b(cVar);
            if (m9863a(b)) {
                file = b.mo135508a(a);
            } else {
                file = b.mo135519b(a);
            }
            return file;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        } catch (DecryptException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache cipher", e2);
            return null;
        }
    }

    /* renamed from: b */
    public static AbstractC2302a m9865b(File file, long j) {
        return new C2311e(file, j);
    }

    protected C2311e(File file, long j) {
        this.f7676d = file;
        this.f7677e = file;
        this.f7678f = j;
        this.f7675c = new C2323k();
    }

    /* renamed from: a */
    public static synchronized AbstractC2302a m9861a(File file, long j) {
        C2311e eVar;
        synchronized (C2311e.class) {
            if (f7673a == null) {
                f7673a = new C2311e(file, j);
            }
            eVar = f7673a;
        }
        return eVar;
    }

    /* renamed from: a */
    private boolean m9864a(AbstractC36802f fVar, String str) {
        try {
            if (fVar.mo135519b(str) != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return false;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get disk cache", e);
            return false;
        } catch (DecryptException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return false;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get disk cache cipher", e2);
            return false;
        }
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2302a
    /* renamed from: a */
    public void mo10723a(AbstractC2265c cVar, final AbstractC2302a.AbstractC2304b bVar) {
        C2323k.AbstractC2325a aVar;
        String a = this.f7675c.mo10752a(cVar);
        this.f7679g.mo10726a(a);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a + " for for Key: " + cVar);
            }
            try {
                C2323k.AbstractC2325a aVar2 = this.f7674b;
                if ((aVar2 == null || !aVar2.mo10756b(cVar)) && ((aVar = this.f7674b) == null || !aVar.mo10755a(cVar))) {
                    AbstractC36802f b = m9866b(cVar);
                    if (!m9864a(b, a)) {
                        b.mo135515a(a, new AbstractC36802f.AbstractC36803a() {
                            /* class com.bumptech.glide.load.engine.p088b.C2311e.C23121 */

                            @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f.AbstractC36803a
                            /* renamed from: a */
                            public boolean mo10731a(File file) {
                                return bVar.mo10725a(file);
                            }
                        });
                        this.f7679g.mo10727b(a);
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f7679g.mo10727b(a);
        }
    }

    /* renamed from: a */
    public static AbstractC2302a m9862a(File file, File file2, long j, C2323k.AbstractC2325a aVar) {
        return new C2311e(file, file2, j, aVar);
    }

    protected C2311e(File file, File file2, long j, C2323k.AbstractC2325a aVar) {
        this.f7676d = file;
        this.f7677e = file2;
        this.f7678f = j;
        this.f7674b = aVar;
        this.f7675c = new C2323k(aVar);
    }
}
