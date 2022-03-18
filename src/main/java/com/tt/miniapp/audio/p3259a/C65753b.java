package com.tt.miniapp.audio.p3259a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.tt.miniapp.audio.a.b */
public class C65753b {

    /* renamed from: a */
    public final char[] f165681a = {'R', 'I', 'F', 'F'};

    /* renamed from: b */
    public int f165682b;

    /* renamed from: c */
    public char[] f165683c = {'W', 'A', 'V', 'E'};

    /* renamed from: d */
    public char[] f165684d = {'f', 'm', 't', ' '};

    /* renamed from: e */
    public int f165685e;

    /* renamed from: f */
    public short f165686f;

    /* renamed from: g */
    public short f165687g;

    /* renamed from: h */
    public int f165688h;

    /* renamed from: i */
    public int f165689i;

    /* renamed from: j */
    public short f165690j;

    /* renamed from: k */
    public short f165691k;

    /* renamed from: l */
    public char[] f165692l = {'d', 'a', 't', 'a'};

    /* renamed from: m */
    public int f165693m;

    /* renamed from: a */
    public byte[] mo230387a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m257764a(byteArrayOutputStream, this.f165681a);
        m257765b(byteArrayOutputStream, this.f165682b);
        m257764a(byteArrayOutputStream, this.f165683c);
        m257764a(byteArrayOutputStream, this.f165684d);
        m257765b(byteArrayOutputStream, this.f165685e);
        m257763a(byteArrayOutputStream, this.f165686f);
        m257763a(byteArrayOutputStream, this.f165687g);
        m257765b(byteArrayOutputStream, this.f165688h);
        m257765b(byteArrayOutputStream, this.f165689i);
        m257763a(byteArrayOutputStream, this.f165690j);
        m257763a(byteArrayOutputStream, this.f165691k);
        m257764a(byteArrayOutputStream, this.f165692l);
        m257765b(byteArrayOutputStream, this.f165693m);
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    /* renamed from: a */
    private void m257764a(ByteArrayOutputStream byteArrayOutputStream, char[] cArr) {
        for (char c : cArr) {
            byteArrayOutputStream.write(c);
        }
    }

    /* renamed from: a */
    private void m257763a(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        byte[] bArr = new byte[2];
        bArr[1] = (byte) ((i << 16) >> 24);
        bArr[0] = (byte) ((i << 24) >> 24);
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: b */
    private void m257765b(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) ((i << 8) >> 24);
        bArr[1] = (byte) ((i << 16) >> 24);
        bArr[0] = (byte) ((i << 24) >> 24);
        byteArrayOutputStream.write(bArr);
    }
}
