package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import com.bytedance.ee.log.C13479a;
import java.util.Queue;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.a */
public final class C7327a {

    /* renamed from: b */
    private static final C7327a f19609b = new C7327a();

    /* renamed from: a */
    private final Queue<byte[]> f19610a = C7333f.m29295a(0);

    /* renamed from: a */
    public static C7327a m29273a() {
        return f19609b;
    }

    private C7327a() {
    }

    /* renamed from: b */
    public byte[] mo28559b() {
        byte[] poll;
        synchronized (this.f19610a) {
            poll = this.f19610a.poll();
        }
        if (poll != null) {
            return poll;
        }
        byte[] bArr = new byte[65536];
        C13479a.m54772d("ByteArrayPool", "Created temp bytes");
        return bArr;
    }

    /* renamed from: a */
    public boolean mo28558a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f19610a) {
            if (this.f19610a.size() < 32) {
                z = true;
                this.f19610a.offer(bArr);
            }
        }
        return z;
    }
}
