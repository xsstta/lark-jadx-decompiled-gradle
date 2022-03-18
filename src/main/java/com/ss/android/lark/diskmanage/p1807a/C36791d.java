package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.p1807a.AbstractC36802f;
import com.ss.android.lark.diskmanage.p1807a.C36792e;
import com.ss.android.lark.log.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.d */
public class C36791d implements AbstractC36802f {

    /* renamed from: a */
    protected C36792e f94527a;

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public File mo135508a(String str) throws IOException {
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public void mo135520a() throws IOException {
        C36792e eVar = this.f94527a;
        if (eVar != null) {
            eVar.mo135512b();
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: b */
    public File mo135522b() {
        C36792e eVar = this.f94527a;
        if (eVar != null) {
            return eVar.mo135509a();
        }
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: c */
    public long mo135523c() {
        C36792e eVar = this.f94527a;
        if (eVar != null) {
            return eVar.mo135532d();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo135526e(String str) throws IOException {
        C36792e eVar = this.f94527a;
        if (eVar != null) {
            eVar.mo135513c(str);
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public void mo135521a(long j) {
        C36792e eVar = this.f94527a;
        if (eVar != null) {
            eVar.mo135528a(j);
        }
    }

    /* renamed from: a */
    protected static void m145114a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.m165379d("DiskCacheWrapperBase", "closeQuietly" + th);
            }
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: b */
    public File mo135519b(String str) throws IOException, DecryptException {
        C36792e.C36798d b;
        C36792e eVar = this.f94527a;
        if (eVar == null || (b = eVar.mo135511b(str)) == null) {
            return null;
        }
        File a = b.mo135550a().mo135546a(0);
        b.close();
        return a;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: c */
    public InputStream mo135524c(String str) throws IOException, DecryptException {
        File b = mo135519b(str);
        if (b != null) {
            return new FileInputStream(b);
        }
        return null;
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: d */
    public <T extends Serializable> T mo135525d(String str) throws IOException, DecryptException {
        Throwable th;
        Exception e;
        ObjectInputStream objectInputStream;
        InputStream c = mo135524c(str);
        ObjectInputStream objectInputStream2 = null;
        if (c == null) {
            Log.m165397w("DiskCacheWrapperBase", "put mLruCache is null");
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(c);
            try {
                T t = (T) ((Serializable) objectInputStream.readObject());
                m145114a(objectInputStream);
                return t;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    m145114a(objectInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    m145114a(objectInputStream2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            e.printStackTrace();
            m145114a(objectInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m145114a(objectInputStream2);
            throw th;
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public void mo135515a(String str, AbstractC36802f.AbstractC36803a aVar) throws IOException {
        C36792e eVar = this.f94527a;
        if (eVar == null) {
            Log.m165397w("DiskCacheWrapperBase", "put mLruCache is null");
        } else if (aVar == null) {
            Log.m165397w("DiskCacheWrapperBase", "put mLruCache writer is null");
        } else {
            C36792e.C36795b d = eVar.mo135533d(str);
            if (d != null && aVar.mo10731a(d.mo135538a(0))) {
                d.mo135539a();
            }
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public void mo135516a(String str, File file) throws IOException {
        if (file == null) {
            Log.m165397w("DiskCacheWrapperBase", "put file is null");
            mo135526e(str);
            return;
        }
        mo135517a(str, new FileInputStream(file));
    }

    /* renamed from: a */
    public void mo135517a(String str, InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        C36792e eVar = this.f94527a;
        if (eVar == null) {
            Log.m165397w("DiskCacheWrapperBase", "put mLruCache is null");
        } else if (inputStream == null) {
            Log.m165397w("DiskCacheWrapperBase", "put stream is null");
            mo135526e(str);
        } else {
            C36792e.C36795b d = eVar.mo135533d(str);
            BufferedOutputStream bufferedOutputStream2 = null;
            if (d != null) {
                try {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(d.mo135540b(0));
                    } catch (Throwable th2) {
                        th = th2;
                        m145114a(bufferedOutputStream2);
                        m145114a(bufferedInputStream);
                        throw th;
                    }
                    try {
                        byte[] bArr = new byte[1048576];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        d.mo135539a();
                        bufferedOutputStream2 = bufferedOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream2 = bufferedOutputStream;
                        m145114a(bufferedOutputStream2);
                        m145114a(bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = null;
                    m145114a(bufferedOutputStream2);
                    m145114a(bufferedInputStream);
                    throw th;
                }
            } else {
                bufferedInputStream = null;
            }
            m145114a(bufferedOutputStream2);
            m145114a(bufferedInputStream);
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f
    /* renamed from: a */
    public void mo135518a(String str, Serializable serializable) throws IOException {
        Throwable th;
        C36792e eVar = this.f94527a;
        if (eVar == null) {
            Log.m165397w("DiskCacheWrapperBase", "put mLruCache is null");
        } else if (serializable == null) {
            Log.m165397w("DiskCacheWrapperBase", "put object is null");
            mo135526e(str);
        } else {
            ObjectOutputStream objectOutputStream = null;
            try {
                C36792e.C36795b d = eVar.mo135533d(str);
                if (d != null) {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(d.mo135540b(0));
                    try {
                        objectOutputStream2.writeObject(serializable);
                        objectOutputStream2.flush();
                        d.mo135539a();
                        objectOutputStream = objectOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = objectOutputStream2;
                        m145114a(objectOutputStream);
                        throw th;
                    }
                }
                m145114a(objectOutputStream);
            } catch (Throwable th3) {
                th = th3;
                m145114a(objectOutputStream);
                throw th;
            }
        }
    }

    C36791d(File file, int i, long j) {
    }
}
