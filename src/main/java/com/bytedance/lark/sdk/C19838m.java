package com.bytedance.lark.sdk;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.C53254m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.lark.sdk.m */
public class C19838m {

    /* renamed from: a */
    private C19840n f48412a;

    /* renamed from: b */
    private CountDownLatch f48413b = new CountDownLatch(1);

    /* renamed from: c */
    private AtomicInteger f48414c = new AtomicInteger(1);

    /* renamed from: d */
    private ReentrantLock f48415d = new ReentrantLock();

    /* renamed from: e */
    private ConcurrentLinkedQueue<C19839a> f48416e = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public void mo67199a() {
        C53241h.m205898b("SdkInitiatorInterceptor", "notifyEndInit");
        if (this.f48414c.compareAndSet(1, 2)) {
            this.f48413b.countDown();
        }
        try {
            this.f48415d.lock();
            if (!this.f48416e.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f48416e.size());
                Iterator<C19839a> it = this.f48416e.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    it.remove();
                }
                this.f48415d.unlock();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19839a aVar = (C19839a) it2.next();
                    this.f48412a.mo67206a(aVar.f48417a, aVar.f48418b, aVar.f48419c, aVar.f48420d, aVar.f48421e, aVar.f48422f);
                    it2.remove();
                }
            }
        } finally {
            this.f48415d.unlock();
        }
    }

    public C19838m(C19840n nVar) {
        this.f48412a = nVar;
    }

    /* renamed from: a */
    private boolean m72365a(Command command) {
        AbstractC53238e d = C53254m.m205928d();
        if (d == null || d.mo102655c() == 0 || this.f48414c.get() == 2 || d.mo102653a(command)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public byte[] mo67202a(Command command, byte[] bArr, String str, C53253l lVar) {
        if (m72365a(command)) {
            try {
                this.f48413b.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this.f48412a.mo67207a(command, bArr, str, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lark.sdk.m$a */
    public static class C19839a {

        /* renamed from: a */
        Command f48417a;

        /* renamed from: b */
        byte[] f48418b;

        /* renamed from: c */
        long f48419c;

        /* renamed from: d */
        String f48420d;

        /* renamed from: e */
        StreamDataSource f48421e;

        /* renamed from: f */
        C53253l f48422f;

        public C19839a(Command command, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
            this.f48417a = command;
            this.f48418b = bArr;
            this.f48419c = j;
            this.f48420d = str;
            this.f48421e = streamDataSource;
            this.f48422f = lVar;
        }
    }

    /* renamed from: a */
    public void mo67200a(int i, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
        if (!m72365a(Command.POST_GATEWAY)) {
            this.f48412a.mo67205a(i, bArr, j, str, streamDataSource, lVar);
        }
    }

    /* renamed from: a */
    public void mo67201a(Command command, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
        if (!m72365a(command)) {
            this.f48412a.mo67206a(command, bArr, j, str, streamDataSource, lVar);
            return;
        }
        try {
            this.f48415d.lock();
            if (m72365a(command)) {
                this.f48416e.add(new C19839a(command, bArr, j, str, streamDataSource, lVar));
                return;
            }
            this.f48415d.unlock();
            this.f48412a.mo67206a(command, bArr, j, str, streamDataSource, lVar);
        } finally {
            this.f48415d.unlock();
        }
    }
}
