package com.bytedance.apm6.p160b.p161a.p164c;

import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.util.C3352c;
import com.bytedance.apm6.util.p195b.C3350b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm6.b.a.c.a */
public class C3176a {

    /* renamed from: a */
    private long f10180a;

    /* renamed from: b */
    private int f10181b;

    /* renamed from: c */
    private int f10182c;

    /* renamed from: d */
    private File f10183d;

    /* renamed from: e */
    private List<C3177b> f10184e;

    /* renamed from: a */
    public long mo13220a() {
        return this.f10180a;
    }

    /* renamed from: b */
    public int mo13221b() {
        return this.f10181b;
    }

    /* renamed from: c */
    public int mo13222c() {
        return this.f10182c;
    }

    /* renamed from: d */
    public List<C3177b> mo13223d() {
        return this.f10184e;
    }

    /* renamed from: e */
    public File mo13224e() {
        return this.f10183d;
    }

    public String toString() {
        return "LogFile{startID=" + this.f10180a + ", totalCount=" + this.f10181b + ", totalBytes=" + this.f10182c + ", source=" + this.f10183d + ", logList=" + this.f10184e + '}';
    }

    /* renamed from: a */
    public static C3176a m13278a(File file) {
        try {
            byte[] a = C3352c.m13945a(file);
            if (a != null) {
                C3176a a2 = m13279a(ByteBuffer.wrap(a));
                if (a2 != null) {
                    a2.f10183d = file;
                } else {
                    C3350b.m13937d(C3159a.f10110a, "fromMemory bytes is null");
                }
                return a2;
            }
            C3350b.m13937d(C3159a.f10110a, "fromFile bytes is null");
            return null;
        } catch (Throwable th) {
            C3350b.m13935b(C3159a.f10110a, "fromFile", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C3176a m13279a(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    return null;
                }
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new C3177b(bArr));
            }
            return new C3176a(j, i, i2, arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3176a(long j, int i, int i2, List<C3177b> list) {
        this.f10180a = j;
        this.f10181b = i;
        this.f10182c = i2;
        this.f10184e = list;
    }
}
