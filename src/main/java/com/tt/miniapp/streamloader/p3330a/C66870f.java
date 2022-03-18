package com.tt.miniapp.streamloader.p3330a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.streamloader.a.f */
public class C66870f {

    /* renamed from: a */
    private ConcurrentHashMap<String, C66871a> f168684a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private HandlerThread f168685b;

    /* renamed from: c */
    private Handler f168686c;

    /* renamed from: a */
    public static HandlerThread m260839a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.streamloader.a.f$a */
    public class C66871a {

        /* renamed from: a */
        String f168687a;

        /* renamed from: b */
        C66863a f168688b;

        /* renamed from: c */
        C66864b f168689c;

        /* renamed from: d */
        boolean f168690d;

        /* renamed from: e */
        boolean f168691e;

        /* renamed from: f */
        byte[] f168692f;

        /* renamed from: g */
        volatile int f168693g;

        /* renamed from: h */
        volatile int f168694h;

        /* renamed from: c */
        private void m260846c() {
            C66870f.this.mo232840a().post(new Runnable() {
                /* class com.tt.miniapp.streamloader.p3330a.C66870f.C66871a.RunnableC668732 */

                public void run() {
                    if (C66871a.this.f168694h < C66871a.this.f168693g) {
                        try {
                            int i = C66871a.this.f168693g;
                            C66871a.this.f168689c.write(C66871a.this.f168692f, C66871a.this.f168694h, i - C66871a.this.f168694h);
                            C66871a.this.f168694h = i;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo232849b() {
            if (!this.f168691e) {
                this.f168691e = true;
                if (this.f168689c != null) {
                    C66870f.this.mo232840a().post(new Runnable() {
                        /* class com.tt.miniapp.streamloader.p3330a.C66870f.C66871a.RunnableC668721 */

                        public void run() {
                            IOUtils.close(C66871a.this.f168689c);
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo232848a() {
            if (!this.f168691e) {
                if (!this.f168690d) {
                    this.f168690d = true;
                    m260846c();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo232846a(byte[] bArr) throws IOException {
            if (this.f168689c == null) {
                this.f168688b = new C66863a();
                this.f168689c = new C66864b(this.f168688b);
            }
        }

        C66871a(String str) {
            this.f168687a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo232847a(byte[] bArr, int i, int i2) {
            if (!this.f168691e) {
                this.f168692f = bArr;
                this.f168693g = i + i2;
                if (this.f168690d) {
                    m260846c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo232844b() {
        HandlerThread handlerThread = this.f168685b;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f168685b.quitSafely();
        }
    }

    public C66870f() {
        HandlerThread a = m260839a("StreamCache");
        this.f168685b = a;
        a.start();
    }

    /* renamed from: a */
    public Handler mo232840a() {
        if (this.f168686c == null) {
            this.f168686c = new Handler(this.f168685b.getLooper());
        }
        return this.f168686c;
    }

    /* renamed from: b */
    public void mo232845b(TTAPkgFile tTAPkgFile) {
        String fileName = tTAPkgFile.getFileName();
        C66871a aVar = this.f168684a.get(fileName);
        if (aVar == null) {
            C66871a aVar2 = new C66871a(fileName);
            aVar2.mo232848a();
            aVar = this.f168684a.putIfAbsent(fileName, aVar2);
        }
        if (aVar != null) {
            aVar.mo232849b();
        }
    }

    /* renamed from: a */
    public InputStream mo232842a(TTAPkgFile tTAPkgFile) {
        C66871a aVar = this.f168684a.get(tTAPkgFile.getFileName());
        if (aVar == null) {
            aVar = mo232841a(tTAPkgFile, null);
        }
        if (aVar != null && aVar.mo232848a()) {
            return aVar.f168688b;
        }
        return null;
    }

    /* renamed from: a */
    public C66871a mo232841a(TTAPkgFile tTAPkgFile, byte[] bArr) {
        try {
            String fileName = tTAPkgFile.getFileName();
            C66871a aVar = this.f168684a.get(fileName);
            if (aVar == null) {
                C66871a aVar2 = new C66871a(fileName);
                C66871a putIfAbsent = this.f168684a.putIfAbsent(fileName, aVar2);
                if (putIfAbsent != null) {
                    putIfAbsent.mo232846a(bArr);
                    return putIfAbsent;
                }
                aVar2.mo232846a(bArr);
                return aVar2;
            }
            aVar.mo232846a(bArr);
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo232843a(TTAPkgFile tTAPkgFile, byte[] bArr, int i, int i2) {
        C66871a aVar = this.f168684a.get(tTAPkgFile.getFileName());
        if (aVar != null) {
            aVar.mo232847a(bArr, i, i2);
        }
    }
}
