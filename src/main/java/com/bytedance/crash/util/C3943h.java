package com.bytedance.crash.util;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.bytedance.crash.util.h */
public class C3943h extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f12047a;

    /* renamed from: b */
    private Charset f12048b;

    /* renamed from: c */
    private C3944a f12049c;

    /* renamed from: com.bytedance.crash.util.h$a */
    public static class C3944a {
        /* renamed from: a */
        public boolean mo15191a(String str) {
            return true;
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f12047a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    /* renamed from: a */
    public static String m16371a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return C3930ad.m16300a(instance.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3943h(OutputStream outputStream, MessageDigest messageDigest, C3944a aVar) {
        super(outputStream);
        this.f12047a = messageDigest;
        this.f12049c = aVar;
        if (messageDigest != null) {
            this.f12048b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f12047a;
        if (messageDigest != null) {
            messageDigest.update(this.f12048b.encode(CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f12047a != null) {
            C3944a aVar = this.f12049c;
            if (aVar == null || aVar.mo15191a(str)) {
                this.f12047a.update(this.f12048b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }
}
