package com.bytedance.lark.sdk;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.RequestPacket;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.C53254m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import okio.ByteString;

/* renamed from: com.bytedance.lark.sdk.n */
public class C19840n {

    /* renamed from: a */
    public static final Command f48423a = Command.WRAPPER_WITH_PACKET;

    /* renamed from: b */
    public AtomicBoolean f48424b = new AtomicBoolean(true);

    /* renamed from: c */
    public volatile CountDownLatch f48425c = new CountDownLatch(1);

    /* renamed from: d */
    private ReentrantLock f48426d = new ReentrantLock();

    /* renamed from: e */
    private ConcurrentLinkedQueue<C19844a> f48427e = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public byte[] mo67207a(Command command, byte[] bArr, String str, C53253l lVar) {
        boolean a = m72375a(command);
        if (a) {
            this.f48424b.set(false);
        } else if (!this.f48424b.get()) {
            try {
                this.f48425c.await();
            } catch (InterruptedException e) {
                C53241h.m205894a("SdkRequestInterceptor", "block sync req:" + command + " occurs interruptedException:" + e.toString());
            }
            this.f48425c = new CountDownLatch(1);
        }
        RequestPacket b = m72376b(command, bArr, Thread.currentThread().getId(), str, null, lVar);
        Command command2 = f48423a;
        byte[] encode = b.encode();
        m72374a(command, str, false);
        byte[] _invoke = Sdk._invoke(command2.getValue(), encode);
        if (a) {
            this.f48424b.set(true);
            this.f48425c.countDown();
            m72377b();
        }
        return _invoke;
    }

    /* renamed from: a */
    public void mo67206a(Command command, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
        RequestPacket a = m72371a(command, bArr, str, j, streamDataSource, lVar);
        Command command2 = f48423a;
        byte[] encode = a.encode();
        m72374a(command, str, true);
        if (this.f48424b.get()) {
            Sdk.getInstance().invokeAsync(command2.getValue(), encode, j);
            mo67204a();
        } else if (m72375a(command)) {
            Sdk.getInstance().invokeAsync(command2.getValue(), encode, j);
        } else {
            this.f48427e.add(new C19844a(command2, encode, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lark.sdk.n$b */
    public static class C19845b implements AbstractC19831c {

        /* renamed from: a */
        public AbstractC19831c f48434a;

        /* renamed from: b */
        public Runnable f48435b;

        /* renamed from: c */
        private Runnable f48436c;

        @Override // com.bytedance.lark.sdk.AbstractC19831c
        /* renamed from: a */
        public boolean mo67179a() {
            AbstractC19831c cVar = this.f48434a;
            if (cVar != null) {
                return cVar.mo67179a();
            }
            return false;
        }

        @Override // com.bytedance.lark.sdk.AbstractC19831c
        public void AsyncCallback(final boolean z, final byte[] bArr) {
            Runnable runnable = this.f48436c;
            if (runnable != null) {
                runnable.run();
            }
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.bytedance.lark.sdk.C19840n.C19845b.RunnableC198461 */

                public void run() {
                    if (C19845b.this.f48435b != null) {
                        C19845b.this.f48435b.run();
                    }
                    if (C19845b.this.f48434a != null) {
                        C19845b.this.f48434a.AsyncCallback(z, bArr);
                    }
                }
            });
        }

        public C19845b(AbstractC19831c cVar, Runnable runnable, Runnable runnable2) {
            this.f48434a = cVar;
            this.f48436c = runnable;
            this.f48435b = runnable2;
        }
    }

    /* renamed from: b */
    private void m72377b() {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.bytedance.lark.sdk.C19840n.RunnableC198433 */

            public void run() {
                C19840n.this.mo67204a();
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo67204a() {
        if (!this.f48427e.isEmpty()) {
            ArrayList<C19844a> arrayList = new ArrayList();
            try {
                this.f48426d.lock();
                Iterator<C19844a> it = this.f48427e.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    it.remove();
                }
                this.f48426d.unlock();
                for (C19844a aVar : arrayList) {
                    Sdk.getInstance().invokeAsync(aVar.f48431a.getValue(), aVar.f48432b, aVar.f48433c);
                }
                arrayList.clear();
            } catch (Throwable th) {
                this.f48426d.unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private boolean m72375a(Command command) {
        if (command == Command.MAKE_USER_ONLINE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC19831c mo67203a(Command command, AbstractC19831c cVar) {
        if (!m72375a(command)) {
            return cVar;
        }
        this.f48424b.set(false);
        return new C19845b(cVar, new Runnable() {
            /* class com.bytedance.lark.sdk.C19840n.RunnableC198411 */

            public void run() {
                C19840n.this.f48424b.set(true);
                C19840n.this.f48425c.countDown();
            }
        }, new Runnable() {
            /* class com.bytedance.lark.sdk.C19840n.RunnableC198422 */

            public void run() {
                C19840n.this.mo67204a();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lark.sdk.n$a */
    public static class C19844a {

        /* renamed from: a */
        Command f48431a;

        /* renamed from: b */
        byte[] f48432b;

        /* renamed from: c */
        long f48433c;

        public C19844a(Command command, byte[] bArr, long j) {
            this.f48431a = command;
            this.f48432b = bArr;
            this.f48433c = j;
        }
    }

    /* renamed from: a */
    private void m72373a(int i, String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = "asyncInvokePassTrough";
        } else {
            str2 = "invoke";
        }
        sb.append(str2);
        sb.append(" Server command:[");
        sb.append(i);
        sb.append("]");
        sb.append("contextID:");
        sb.append(str);
        C53241h.m205898b("SdkRequestInterceptor", sb.toString());
    }

    /* renamed from: a */
    private void m72374a(Command command, String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = "asyncInvoke";
        } else {
            str2 = "invoke";
        }
        sb.append(str2);
        sb.append(" SDK command:[");
        sb.append(command.getValue());
        sb.append(":");
        sb.append(command.name());
        sb.append("]");
        sb.append("contextID:");
        sb.append(str);
        C53241h.m205898b("SdkRequestInterceptor", sb.toString());
    }

    /* renamed from: a */
    private static RequestPacket m72371a(Command command, byte[] bArr, String str, long j, StreamDataSource streamDataSource, C53253l lVar) {
        boolean z;
        if (streamDataSource != null) {
            z = true;
        } else {
            z = false;
        }
        return m72372a(command, bArr, str, j, z, streamDataSource, 0, lVar);
    }

    /* renamed from: b */
    private static RequestPacket m72376b(Command command, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
        boolean z;
        if (streamDataSource != null) {
            z = true;
        } else {
            z = false;
        }
        return m72372a(command, bArr, str, -1, z, streamDataSource, j, lVar);
    }

    /* renamed from: a */
    public void mo67205a(int i, byte[] bArr, long j, String str, StreamDataSource streamDataSource, C53253l lVar) {
        boolean z;
        if (streamDataSource != null) {
            z = true;
        } else {
            z = false;
        }
        RequestPacket a = m72370a(i, bArr, str, j, z, streamDataSource, 0, lVar);
        Command command = f48423a;
        byte[] encode = a.encode();
        m72373a(i, str, true);
        if (this.f48424b.get()) {
            Sdk.getInstance().invokeAsync(command.getValue(), encode, j);
            mo67204a();
            return;
        }
        this.f48427e.add(new C19844a(command, encode, j));
    }

    /* renamed from: a */
    private static RequestPacket m72370a(int i, byte[] bArr, String str, long j, boolean z, StreamDataSource streamDataSource, long j2, C53253l lVar) {
        String str2;
        AbstractC53238e d = C53254m.m205928d();
        if (d != null) {
            str2 = d.mo102652a();
        } else {
            str2 = null;
        }
        RequestPacket.C15155a b = new RequestPacket.C15155a().mo55236a(Command.POST_GATEWAY).mo55241a(str).mo55242a(ByteString.of(bArr)).mo55238a(new RequestPacket.PassThrough.C15153a().mo55231a(String.valueOf(i)).build()).mo55245b(Long.valueOf(j2));
        if (j != -1) {
            b.mo55240a(Long.valueOf(j));
        }
        if (TextUtils.isEmpty(str2)) {
            C53241h.m205894a("SdkRequestInterceptor", "getPassTroughRequestPacket userId is empty command = " + i + ", userId = " + str2 + ". sdkDependency = " + d);
        } else {
            b.mo55246b(str2);
        }
        if (!z || streamDataSource == null) {
            b.mo55239a((Boolean) false);
        } else {
            b.mo55239a((Boolean) true);
            b.mo55237a(new RequestPacket.BizConfig.C15151a().mo55226a(RequestPacket.BizConfig.DataSource.fromValue(streamDataSource.getNumber())).build());
        }
        if (lVar != null) {
            b.mo55247c(Long.valueOf(lVar.f131605a));
            b.mo55244b(Boolean.valueOf(lVar.f131606b));
        }
        return b.build();
    }

    /* renamed from: a */
    private static RequestPacket m72372a(Command command, byte[] bArr, String str, long j, boolean z, StreamDataSource streamDataSource, long j2, C53253l lVar) {
        String str2;
        AbstractC53238e d = C53254m.m205928d();
        if (d != null) {
            str2 = d.mo102652a();
        } else {
            str2 = null;
        }
        RequestPacket.C15155a b = new RequestPacket.C15155a().mo55236a(command).mo55241a(str).mo55242a(ByteString.of(bArr)).mo55245b(Long.valueOf(j2));
        if (j != -1) {
            b.mo55240a(Long.valueOf(j));
        }
        if (TextUtils.isEmpty(str2)) {
            C53241h.m205894a("SdkRequestInterceptor", "getRequestPacket userId is empty command = " + command.name() + ", userId = " + str2 + ". sdkDependency = " + d);
        } else {
            b.mo55246b(str2);
        }
        if (!z || streamDataSource == null) {
            b.mo55239a((Boolean) false);
        } else {
            b.mo55239a((Boolean) true);
            b.mo55237a(new RequestPacket.BizConfig.C15151a().mo55226a(RequestPacket.BizConfig.DataSource.fromValue(streamDataSource.getNumber())).build());
        }
        if (lVar != null) {
            b.mo55247c(Long.valueOf(lVar.f131605a));
            b.mo55244b(Boolean.valueOf(lVar.f131606b));
        }
        return b.build();
    }
}
