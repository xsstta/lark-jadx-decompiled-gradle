package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.lark.diskmanage.p1807a.AbstractC36802f;
import com.ss.android.lark.diskmanage.p1807a.C36792e;
import com.ss.android.lark.log.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.c */
public class C36790c extends C36791d {
    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f, com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: b */
    public File mo135519b(String str) throws IOException, DecryptException {
        C36792e.C36798d b;
        if (this.f94527a == null || (b = this.f94527a.mo135511b(str)) == null) {
            return null;
        }
        File a = b.mo135550a().mo135546a(0);
        b.close();
        return C36808a.m145199a(a, false);
    }

    /* renamed from: a */
    private static void m145108a(C36792e.C36795b bVar) throws IOException {
        try {
            C36808a.m145203a(bVar.mo135538a(0));
        } catch (EncryptException e) {
            Log.m165379d("CipherDiskCacheWrapper", "encryptFile fail " + e);
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f, com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: a */
    public void mo135516a(String str, File file) throws IOException {
        if (file == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put file is null");
            mo135526e(str);
            return;
        }
        mo135517a(str, new FileInputStream(file));
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f, com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: a */
    public void mo135515a(String str, AbstractC36802f.AbstractC36803a aVar) throws IOException {
        if (this.f94527a == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put mLruCache is null");
        } else if (aVar == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put mLruCache writer is null");
        } else {
            C36792e.C36795b d = this.f94527a.mo135533d(str);
            if (d != null && aVar.mo10731a(d.mo135538a(0))) {
                m145108a(d);
                d.mo135539a();
            }
        }
    }

    @Override // com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: a */
    public void mo135517a(String str, InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        if (this.f94527a == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put mLruCache is null");
        } else if (inputStream == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put stream is null");
            mo135526e(str);
        } else {
            C36792e.C36795b d = this.f94527a.mo135533d(str);
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
                        m145108a(d);
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

    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f, com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: a */
    public void mo135518a(String str, Serializable serializable) throws IOException {
        Throwable th;
        if (this.f94527a == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put mLruCache is null");
        } else if (serializable == null) {
            Log.m165397w("CipherDiskCacheWrapper", "put object is null");
            mo135526e(str);
        } else {
            ObjectOutputStream objectOutputStream = null;
            try {
                C36792e.C36795b d = this.f94527a.mo135533d(str);
                if (d != null) {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(d.mo135540b(0));
                    try {
                        objectOutputStream2.writeObject(serializable);
                        objectOutputStream2.flush();
                        m145108a(d);
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

    C36790c(File file, int i, long j) {
        super(file, i, j);
        try {
            this.f94527a = C36792e.m145131b(file, i, 1, j);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
