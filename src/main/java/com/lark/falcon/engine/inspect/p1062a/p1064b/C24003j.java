package com.lark.falcon.engine.inspect.p1062a.p1064b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.lark.falcon.engine.inspect.a.b.j */
public class C24003j implements AbstractC24000g {

    /* renamed from: a */
    public final AbstractC23999f f59365a;

    /* renamed from: b */
    public volatile boolean f59366b;

    /* renamed from: c */
    private final C23998e f59367c;

    /* renamed from: d */
    private final C24007l f59368d;

    /* renamed from: e */
    private AtomicBoolean f59369e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AbstractC23997d f59370f = new AbstractC23997d() {
        /* class com.lark.falcon.engine.inspect.p1062a.p1064b.C24003j.C240041 */

        /* renamed from: c */
        private void m87758c(byte[] bArr, int i) {
        }

        /* renamed from: b */
        private void m87757b(byte[] bArr, int i) {
            C24003j.this.mo86166a(C23995b.m87730a(bArr, i));
        }

        /* renamed from: d */
        private void m87759d(byte[] bArr, int i) {
            C24003j.this.f59365a.mo86123a(C24003j.this, new String(bArr, 0, i));
        }

        /* renamed from: e */
        private void m87760e(byte[] bArr, int i) {
            C24003j.this.f59365a.mo86125a(C24003j.this, bArr, i);
        }

        /* renamed from: a */
        private void m87756a(byte[] bArr, int i) {
            String str;
            int i2;
            if (i >= 2) {
                i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                if (i > 2) {
                    str = new String(bArr, 2, i - 2);
                } else {
                    str = null;
                }
            } else {
                i2 = 1006;
                str = "Unparseable close frame";
            }
            if (!C24003j.this.f59366b) {
                C24003j.this.mo86165a(1000, "Received close frame");
            }
            C24003j.this.mo86169b(i2, str);
        }

        @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23997d
        /* renamed from: a */
        public void mo86161a(byte b, byte[] bArr, int i) {
            if (b == 1) {
                m87759d(bArr, i);
            } else if (b != 2) {
                switch (b) {
                    case 8:
                        m87756a(bArr, i);
                        return;
                    case 9:
                        m87757b(bArr, i);
                        return;
                    case 10:
                        m87758c(bArr, i);
                        return;
                    default:
                        C24003j jVar = C24003j.this;
                        jVar.mo86167a(new IOException("Unsupported frame opcode=" + ((int) b)));
                        return;
                }
            } else {
                m87760e(bArr, i);
            }
        }
    };

    /* renamed from: g */
    private final AbstractC24006k f59371g = new AbstractC24006k() {
        /* class com.lark.falcon.engine.inspect.p1062a.p1064b.C24003j.C240052 */

        @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24006k
        /* renamed from: a */
        public void mo86172a() {
        }

        @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24006k
        /* renamed from: a */
        public void mo86173a(IOException iOException) {
            C24003j.this.mo86167a(iOException);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo86168b() {
        this.f59366b = true;
    }

    /* renamed from: d */
    public boolean mo86171d() {
        return this.f59369e.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo86170c() {
        if (!this.f59369e.getAndSet(true)) {
            this.f59365a.mo86121a(this);
        }
    }

    /* renamed from: e */
    private boolean m87746e() {
        if (mo86171d()) {
            return false;
        }
        mo86167a(new IOException("Session is closed"));
        return true;
    }

    /* renamed from: a */
    public void mo86164a() throws IOException {
        mo86170c();
        try {
            this.f59367c.mo86162a(this.f59370f);
        } catch (EOFException unused) {
            mo86169b(1011, "EOF while reading");
        } catch (IOException e) {
            mo86169b(1006, null);
            throw e;
        }
    }

    /* renamed from: a */
    public void mo86167a(IOException iOException) {
        this.f59365a.mo86124a(this, iOException);
    }

    /* renamed from: a */
    public void mo86166a(C23994a aVar) {
        if (!m87746e()) {
            this.f59368d.mo86174a(aVar, this.f59371g);
        }
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g
    /* renamed from: a */
    public void mo86163a(String str) {
        mo86166a(C23995b.m87729a(str));
    }

    /* renamed from: a */
    public void mo86165a(int i, String str) {
        mo86166a(C23995b.m87728a(i, str));
        mo86168b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo86169b(int i, String str) {
        if (this.f59369e.getAndSet(false)) {
            this.f59365a.mo86122a(this, i, str);
        }
    }

    public C24003j(InputStream inputStream, OutputStream outputStream, AbstractC23999f fVar) {
        this.f59367c = new C23998e(inputStream, fVar);
        this.f59368d = new C24007l(outputStream);
        this.f59365a = fVar;
    }
}
