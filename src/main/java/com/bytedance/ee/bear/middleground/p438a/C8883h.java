package com.bytedance.ee.bear.middleground.p438a;

import android.media.AudioRecord;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.common.util.opus.OpusTools;
import com.ss.android.lark.p1820e.p1821a.AbstractC36900c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.ee.bear.middleground.a.h */
public class C8883h {

    /* renamed from: c */
    private static volatile C8883h f23935c;

    /* renamed from: a */
    public OpusTools f23936a = new OpusTools();

    /* renamed from: b */
    public final Set<WeakReference<AbstractC36900c>> f23937b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: d */
    private volatile int f23938d;

    /* renamed from: e */
    private RunnableC8886b f23939e;

    /* renamed from: f */
    private RunnableC8886b f23940f;

    /* renamed from: g */
    private BlockingQueue<RunnableC8886b> f23941g = new LinkedBlockingQueue();

    /* renamed from: h */
    private ByteBuffer f23942h = ByteBuffer.allocateDirect(1920);

    /* renamed from: i */
    private Thread f23943i;

    /* renamed from: j */
    private String f23944j = C13615c.f35773a.getFilesDir().getAbsolutePath();

    /* renamed from: k */
    private String f23945k = (this.f23944j + File.separator + "temp.ogg");

    /* renamed from: l */
    private String f23946l = (this.f23944j + File.separator + "temp.pcm");

    /* renamed from: com.bytedance.ee.bear.middleground.a.h$a */
    public interface AbstractC8885a {
        /* renamed from: a */
        void mo34062a();

        /* renamed from: a */
        void mo34063a(int i, C8887c cVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2);

        /* renamed from: b */
        void mo34064b();
    }

    /* renamed from: a */
    public static Thread m37252a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34109a(int i, int i2) {
        return i == i2;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.a.h$b */
    public class RunnableC8886b implements Runnable {

        /* renamed from: a */
        public long f23948a;

        /* renamed from: b */
        public long f23949b;

        /* renamed from: c */
        public String f23950c;

        /* renamed from: d */
        public int f23951d;

        /* renamed from: f */
        private volatile int f23953f;

        /* renamed from: g */
        private int f23954g;

        /* renamed from: h */
        private int f23955h;

        /* renamed from: i */
        private AbstractC8885a f23956i;

        /* renamed from: j */
        private AudioRecord f23957j;

        /* renamed from: d */
        public synchronized int mo34121d() {
            return this.f23953f;
        }

        /* renamed from: e */
        public synchronized int mo34122e() {
            return this.f23954g;
        }

        /* renamed from: f */
        public synchronized AbstractC8885a mo34123f() {
            return this.f23956i;
        }

        /* renamed from: g */
        public synchronized AudioRecord mo34124g() {
            return this.f23957j;
        }

        /* renamed from: b */
        public void mo34118b() {
            AudioRecord audioRecord;
            if (mo34121d() != 2 && (audioRecord = this.f23957j) != null && audioRecord.getState() != 0) {
                this.f23957j.stop();
            }
        }

        /* renamed from: c */
        public boolean mo34120c() {
            AudioRecord audioRecord = this.f23957j;
            if (audioRecord == null || audioRecord.getState() == 0) {
                return false;
            }
            this.f23957j.stop();
            this.f23957j.release();
            this.f23957j = null;
            return true;
        }

        /* renamed from: a */
        public boolean mo34117a() {
            int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
            int round = Math.round(4096.0f);
            this.f23954g = round;
            this.f23955h = Math.max(minBufferSize, round) * 10;
            this.f23957j = new AudioRecord(1, 16000, 16, 2, this.f23955h);
            if (TextUtils.isEmpty(this.f23950c)) {
                return false;
            }
            return true;
        }

        public void run() {
            mo34119b(1);
            this.f23957j.startRecording();
            this.f23949b = System.currentTimeMillis();
            this.f23948a = System.currentTimeMillis();
            AbstractC8885a aVar = this.f23956i;
            if (aVar != null) {
                aVar.mo34062a();
            }
            OpusTools opusTools = C8883h.this.f23936a;
            if (opusTools.startRecording(this.f23950c + ".ogg") != 1) {
                mo34116a(2);
                return;
            }
            C8883h.this.mo34111b(this);
            AbstractC8885a aVar2 = this.f23956i;
            if (aVar2 != null) {
                aVar2.mo34064b();
            }
            C8883h.this.f23936a.stopRecording();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo34116a(int i) {
            for (WeakReference<AbstractC36900c> weakReference : C8883h.this.f23937b) {
                AbstractC36900c cVar = weakReference.get();
                if (cVar != null) {
                    cVar.mo34061a(i);
                }
            }
        }

        /* renamed from: b */
        public synchronized void mo34119b(int i) {
            if (this.f23953f != 2 || i != 1) {
                this.f23953f = i;
            }
        }

        public RunnableC8886b(String str, AbstractC8885a aVar, int i) {
            this.f23950c = str;
            this.f23956i = aVar;
            this.f23951d = i;
        }
    }

    /* renamed from: e */
    public synchronized RunnableC8886b mo34114e() {
        return this.f23939e;
    }

    /* renamed from: c */
    public void mo34112c() {
        RunnableC8886b e = mo34114e();
        if (e != null) {
            e.mo34118b();
            e.mo34119b(2);
        }
    }

    /* renamed from: a */
    public static C8883h m37251a() {
        if (f23935c == null) {
            synchronized (C8883h.class) {
                if (f23935c == null) {
                    f23935c = new C8883h();
                }
            }
        }
        return f23935c;
    }

    /* renamed from: g */
    private static boolean m37254g() {
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo34113d() {
        mo34112c();
        new File(this.f23945k).delete();
        new File(this.f23946l).delete();
    }

    /* renamed from: com.bytedance.ee.bear.middleground.a.h$c */
    public static class C8887c {

        /* renamed from: a */
        public double f23958a;

        /* renamed from: b */
        public double f23959b;

        public String toString() {
            return "[amplitude=" + this.f23958a + ", decibel=" + this.f23959b + "]";
        }
    }

    /* renamed from: f */
    private void m37253f() {
        Thread thread = this.f23943i;
        if (thread == null || !thread.isAlive()) {
            Thread a = m37252a(new Thread("opus_recorder") {
                /* class com.bytedance.ee.bear.middleground.p438a.C8883h.C88841 */

                public void run() {
                    while (true) {
                        C8883h.this.mo34110b();
                    }
                }
            });
            this.f23943i = a;
            a.setPriority(10);
            this.f23943i.start();
        }
    }

    private C8883h() {
        m37253f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34110b() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.p438a.C8883h.mo34110b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo34106a(RunnableC8886b bVar) {
        RunnableC8886b bVar2 = this.f23939e;
        if (bVar2 != null && bVar == null) {
            this.f23940f = bVar2;
        } else if (bVar2 == null && bVar != null) {
            this.f23940f = bVar;
        }
        this.f23939e = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0128 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34111b(com.bytedance.ee.bear.middleground.p438a.C8883h.RunnableC8886b r26) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.p438a.C8883h.mo34111b(com.bytedance.ee.bear.middleground.a.h$b):void");
    }

    /* renamed from: a */
    public void mo34108a(WeakReference<AbstractC36900c> weakReference) {
        Iterator<WeakReference<AbstractC36900c>> it = this.f23937b.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC36900c> next = it.next();
            if (next != null && next.get() == null) {
                it.remove();
            }
        }
        this.f23937b.add(weakReference);
    }

    /* renamed from: a */
    private C8887c m37250a(ByteBuffer byteBuffer, int i) {
        C8887c cVar = new C8887c();
        if (!(byteBuffer == null || i == 0)) {
            byteBuffer.limit(i);
            byteBuffer.position(0);
            double d = 0.0d;
            double d2 = 0.0d;
            while (byteBuffer.remaining() >= 16) {
                short s = byteBuffer.getShort();
                if (s > 2500) {
                    d2 += (double) (s * s);
                }
            }
            double log10 = Math.log10(d2 / ((double) i)) * 10.0d;
            if (log10 > 0.0d) {
                d = log10;
            }
            cVar.f23959b = d;
            C13479a.m54772d("OpusRecorderEx", "calculateVolume:" + cVar + "/" + i);
            byteBuffer.limit(i);
            byteBuffer.position(0);
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo34107a(String str, AbstractC8885a aVar) {
        this.f23938d++;
        if (mo34114e() != null) {
            mo34112c();
        }
        C8872e.m37214a().mo34080b();
        m37253f();
        try {
            this.f23941g.put(new RunnableC8886b(str, aVar, this.f23938d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private long m37249a(RunnableC8886b bVar, ByteBuffer byteBuffer, int i) {
        int i2;
        C13479a.m54772d("OpusRecorderEx", "remaining= " + byteBuffer.remaining() + ", size=" + i);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.put(byteBuffer.array(), 0, i);
        allocateDirect.rewind();
        long j = 0;
        while (bVar.mo34121d() == 1 && allocateDirect.hasRemaining()) {
            if (allocateDirect.remaining() > this.f23942h.remaining()) {
                i2 = allocateDirect.limit();
                allocateDirect.limit(this.f23942h.remaining() + allocateDirect.position());
            } else {
                i2 = -1;
            }
            this.f23942h.put(allocateDirect);
            if (this.f23942h.position() == this.f23942h.limit()) {
                j = this.f23936a.writeFrame(this.f23942h, this.f23942h.limit());
                if (j != 0) {
                    this.f23942h.rewind();
                }
            }
            if (i2 != -1) {
                allocateDirect.limit(i2);
            }
        }
        return j;
    }
}
