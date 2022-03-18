package com.tt.miniapp.ttapkgdecoder.p3334b;

import com.tt.miniapp.ttapkgdecoder.p3333a.AbstractC66978a;
import com.tt.miniapp.ttapkgdecoder.utils.C66987b;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import java.io.IOException;
import okio.AbstractC69699e;
import okio.AbstractC69723u;
import okio.C69705k;

/* renamed from: com.tt.miniapp.ttapkgdecoder.b.e */
public class C66984e extends AbstractC66980a {

    /* renamed from: a */
    protected AbstractC69699e f168911a;

    /* renamed from: b */
    private final String f168912b;

    /* renamed from: c */
    private final AbstractC66978a f168913c;

    /* renamed from: d */
    private C66987b.AbstractC66989a f168914d;

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: c */
    public void mo233017c() {
        AbstractC66978a aVar = this.f168913c;
        if (aVar != null) {
            aVar.mo233009c();
        }
        this.f168911a = null;
    }

    /* renamed from: d */
    public boolean mo233019d() {
        if (this.f168911a == null || !this.f168913c.mo233008b() || !this.f168911a.isOpen()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public long mo233020e() {
        if (this.f168913c == null || !mo233019d()) {
            return 0;
        }
        return this.f168913c.mo233006a();
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: b */
    public void mo233015b() throws DecodeException {
        try {
            AbstractC69723u a = C66987b.m261097a(this.f168913c.mo233007a(this.f168912b), this.f168914d);
            if (a instanceof AbstractC69699e) {
                this.f168911a = (AbstractC69699e) a;
            } else {
                this.f168911a = C69705k.m267590a(a);
            }
        } catch (DecodeException e) {
            mo233017c();
            throw e;
        } catch (Exception e2) {
            mo233017c();
            throw new DecodeException(e2, -4);
        }
    }

    /* renamed from: a */
    public void mo233018a(C66987b.AbstractC66989a aVar) {
        this.f168914d = aVar;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public void mo233014a(byte[] bArr) throws IOException {
        AbstractC69699e eVar = this.f168911a;
        if (eVar != null) {
            eVar.readFully(bArr);
            return;
        }
        throw new IOException("response body is null");
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: b */
    public void mo233016b(long j) throws IOException {
        AbstractC69699e eVar = this.f168911a;
        if (eVar != null) {
            eVar.skip(j);
            return;
        }
        throw new IOException("response body is null");
    }

    public C66984e(String str, AbstractC66978a aVar) {
        this.f168912b = str;
        this.f168913c = aVar;
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c
    /* renamed from: a */
    public int mo233013a(byte[] bArr, int i, int i2) throws IOException {
        AbstractC69699e eVar = this.f168911a;
        if (eVar != null) {
            return eVar.read(bArr, i, i2);
        }
        throw new IOException("response body is null");
    }
}
