package com.huawei.updatesdk.p1029a.p1030a.p1031a;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.huawei.updatesdk.a.a.a.a */
public final class C23828a {

    /* renamed from: b */
    private static final C23828a f59030b = new C23828a();

    /* renamed from: a */
    private final Queue<byte[]> f59031a = new ArrayDeque(0);

    private C23828a() {
    }

    /* renamed from: b */
    public static C23828a m87097b() {
        return f59030b;
    }

    /* renamed from: a */
    public void mo85553a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.f59031a) {
                if (this.f59031a.size() < 32 && !this.f59031a.offer(bArr)) {
                    C23834a.m87116a("ByteArrayPool", "releaseBytes false");
                }
            }
        }
    }

    /* renamed from: a */
    public byte[] mo85554a() {
        byte[] poll;
        synchronized (this.f59031a) {
            poll = this.f59031a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }
}
