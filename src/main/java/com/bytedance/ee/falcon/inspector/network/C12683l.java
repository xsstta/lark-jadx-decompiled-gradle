package com.bytedance.ee.falcon.inspector.network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;

/* renamed from: com.bytedance.ee.falcon.inspector.network.l */
public class C12683l {

    /* renamed from: a */
    private final AbstractC12674i f33934a;

    /* renamed from: b */
    private final String f33935b;

    /* renamed from: c */
    private ByteArrayOutputStream f33936c;

    /* renamed from: d */
    private C12667d f33937d;

    /* renamed from: b */
    public boolean mo48068b() {
        if (this.f33936c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m52543d() {
        if (!mo48068b()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }

    /* renamed from: a */
    public byte[] mo48067a() {
        m52543d();
        return this.f33936c.toByteArray();
    }

    /* renamed from: c */
    public void mo48069c() {
        m52543d();
        this.f33934a.mo48058a(this.f33935b, this.f33936c.size(), (int) this.f33937d.mo48039a());
    }

    /* renamed from: a */
    public OutputStream mo48066a(String str) throws IOException {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if ("gzip".equals(str)) {
            outputStream = C12670g.m52483a(byteArrayOutputStream);
        } else if ("deflate".equals(str)) {
            outputStream = new InflaterOutputStream(byteArrayOutputStream);
        } else {
            outputStream = byteArrayOutputStream;
        }
        C12667d dVar = new C12667d(outputStream);
        this.f33937d = dVar;
        this.f33936c = byteArrayOutputStream;
        return dVar;
    }

    public C12683l(AbstractC12674i iVar, String str) {
        this.f33934a = iVar;
        this.f33935b = str;
    }
}
