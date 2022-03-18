package com.tt.miniapp.streamloader.p3330a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.tt.miniapp.streamloader.a.b */
public class C66864b extends OutputStream {

    /* renamed from: a */
    private C66863a f168660a;

    public C66864b() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C66863a aVar = this.f168660a;
        if (aVar != null) {
            aVar.mo232815a();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        C66863a aVar = this.f168660a;
        if (aVar != null) {
            synchronized (aVar) {
                this.f168660a.notifyAll();
            }
        }
    }

    public C66864b(C66863a aVar) throws IOException {
        mo232822a(aVar);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        C66863a aVar = this.f168660a;
        if (aVar != null) {
            aVar.mo232816a(i);
            return;
        }
        throw new IOException("Pipe not connected");
    }

    /* renamed from: a */
    public synchronized void mo232822a(C66863a aVar) throws IOException {
        if (aVar == null) {
            throw new NullPointerException();
        } else if (this.f168660a != null || aVar.f168654c) {
            throw new IOException("Already connected");
        } else {
            this.f168660a = aVar;
            aVar.f168658g = -1;
            aVar.f168659h = 0;
            aVar.f168654c = true;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C66863a aVar = this.f168660a;
        if (aVar != null) {
            Objects.requireNonNull(bArr);
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                aVar.mo232817a(bArr, i, i2);
            }
        } else {
            throw new IOException("Pipe not connected");
        }
    }
}
