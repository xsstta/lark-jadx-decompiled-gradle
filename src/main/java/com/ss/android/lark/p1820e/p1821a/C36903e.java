package com.ss.android.lark.p1820e.p1821a;

import android.media.AudioRecord;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.common.util.opus.OpusTools;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.lark.e.a.e */
public class C36903e {

    /* renamed from: c */
    private static volatile C36903e f94863c;

    /* renamed from: a */
    public final Set<WeakReference<AbstractC36900c>> f94864a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public OpusTools f94865b = new OpusTools();

    /* renamed from: d */
    private volatile int f94866d;

    /* renamed from: e */
    private RunnableC36906b f94867e;

    /* renamed from: f */
    private BlockingQueue<RunnableC36906b> f94868f = new LinkedBlockingQueue();

    /* renamed from: g */
    private ByteBuffer f94869g = ByteBuffer.allocateDirect(1920);

    /* renamed from: h */
    private Thread f94870h;

    /* renamed from: com.ss.android.lark.e.a.e$a */
    public interface AbstractC36905a {
        /* renamed from: a */
        void mo136259a();

        /* renamed from: a */
        void mo136260a(int i, double d, ByteBuffer byteBuffer);

        /* renamed from: b */
        void mo136261b();
    }

    /* renamed from: a */
    public static Thread m145676a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo136252a(int i, int i2) {
        return i == i2;
    }

    /* renamed from: com.ss.android.lark.e.a.e$b */
    public class RunnableC36906b implements Runnable {

        /* renamed from: a */
        public long f94872a;

        /* renamed from: b */
        public long f94873b;

        /* renamed from: c */
        public int f94874c;

        /* renamed from: e */
        private volatile int f94876e;

        /* renamed from: f */
        private int f94877f;

        /* renamed from: g */
        private AbstractC36905a f94878g;

        /* renamed from: h */
        private AudioRecord f94879h;

        /* renamed from: i */
        private String f94880i;

        /* renamed from: d */
        public synchronized int mo136267d() {
            return this.f94876e;
        }

        /* renamed from: e */
        public synchronized int mo136268e() {
            return this.f94877f;
        }

        /* renamed from: f */
        public synchronized AbstractC36905a mo136269f() {
            return this.f94878g;
        }

        /* renamed from: g */
        public synchronized AudioRecord mo136270g() {
            return this.f94879h;
        }

        /* renamed from: b */
        public void mo136264b() {
            AudioRecord audioRecord;
            if (mo136267d() != 2 && (audioRecord = this.f94879h) != null && audioRecord.getState() != 0) {
                this.f94879h.stop();
            }
        }

        /* renamed from: c */
        public boolean mo136266c() {
            AudioRecord audioRecord = this.f94879h;
            if (audioRecord == null || audioRecord.getState() == 0) {
                return false;
            }
            this.f94879h.stop();
            this.f94879h.release();
            this.f94879h = null;
            return true;
        }

        public void run() {
            mo136265b(1);
            this.f94879h.startRecording();
            this.f94873b = System.currentTimeMillis();
            this.f94872a = System.currentTimeMillis();
            AbstractC36905a aVar = this.f94878g;
            if (aVar != null) {
                aVar.mo136259a();
            }
            int startRecording = C36903e.this.f94865b.startRecording(this.f94880i);
            if (startRecording != 1) {
                mo136262a(startRecording);
                return;
            }
            C36903e.this.mo136255b(this);
            AbstractC36905a aVar2 = this.f94878g;
            if (aVar2 != null) {
                aVar2.mo136261b();
            }
            C36903e.this.f94865b.stopRecording();
        }

        /* renamed from: a */
        public boolean mo136263a() {
            this.f94877f = ((AudioRecord.getMinBufferSize(16000, 16, 2) / 1920) + 1) * 1920;
            this.f94879h = new AudioRecord(1, 16000, 16, 2, this.f94877f);
            if (TextUtils.isEmpty(this.f94880i)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo136262a(int i) {
            for (WeakReference<AbstractC36900c> weakReference : C36903e.this.f94864a) {
                AbstractC36900c cVar = weakReference.get();
                if (cVar != null) {
                    cVar.mo34061a(i);
                }
            }
        }

        /* renamed from: b */
        public synchronized void mo136265b(int i) {
            if (this.f94876e != 2 || i != 1) {
                this.f94876e = i;
            }
        }

        public RunnableC36906b(String str, AbstractC36905a aVar, int i) {
            this.f94880i = str;
            this.f94878g = aVar;
            this.f94874c = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public synchronized RunnableC36906b mo136257d() {
        return this.f94867e;
    }

    /* renamed from: c */
    public void mo136256c() {
        RunnableC36906b d = mo136257d();
        if (d != null) {
            d.mo136264b();
            d.mo136265b(2);
        }
    }

    /* renamed from: a */
    public static C36903e m145675a() {
        if (f94863c == null) {
            synchronized (C36903e.class) {
                if (f94863c == null) {
                    f94863c = new C36903e();
                }
            }
        }
        return f94863c;
    }

    /* renamed from: e */
    private static boolean m145677e() {
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m145678f() {
        Thread thread = this.f94870h;
        if (thread == null || !thread.isAlive()) {
            Thread a = m145676a(new Thread("opus_recorder") {
                /* class com.ss.android.lark.p1820e.p1821a.C36903e.C369041 */

                public void run() {
                    while (true) {
                        C36903e.this.mo136254b();
                    }
                }
            });
            this.f94870h = a;
            a.start();
        }
    }

    private C36903e() {
        m145678f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136254b() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p1820e.p1821a.C36903e.mo136254b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo136249a(RunnableC36906b bVar) {
        this.f94867e = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136255b(com.ss.android.lark.p1820e.p1821a.C36903e.RunnableC36906b r19) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p1820e.p1821a.C36903e.mo136255b(com.ss.android.lark.e.a.e$b):void");
    }

    /* renamed from: a */
    public void mo136251a(WeakReference<AbstractC36900c> weakReference) {
        Iterator<WeakReference<AbstractC36900c>> it = this.f94864a.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC36900c> next = it.next();
            if (next != null && next.get() == null) {
                it.remove();
            }
        }
        this.f94864a.add(weakReference);
    }

    /* renamed from: a */
    public byte[] mo136253a(String str) {
        byte[] bArr;
        OpusTools opusTools = this.f94865b;
        if (opusTools != null) {
            bArr = opusTools.getWaveform(str);
        } else {
            bArr = null;
        }
        if (bArr == null || bArr.length <= 0) {
            return new byte[64];
        }
        return bArr;
    }

    /* renamed from: a */
    private double m145673a(ByteBuffer byteBuffer, long j) {
        double d = 0.0d;
        if (byteBuffer == null || j == 0) {
            return 0.0d;
        }
        byteBuffer.limit((int) j);
        byteBuffer.position(0);
        while (byteBuffer.remaining() >= 2) {
            short s = byteBuffer.getShort();
            d += (double) (s * s);
        }
        double sqrt = Math.sqrt((d / ((double) j)) / 2.0d);
        Log.m165379d("OpusRecorder", "calculateVolume:" + sqrt + "/" + j);
        byteBuffer.position(0);
        return sqrt;
    }

    /* renamed from: a */
    public void mo136250a(String str, AbstractC36905a aVar) {
        this.f94866d++;
        if (mo136257d() != null) {
            mo136256c();
        }
        C36894a.m145605a().mo136207d();
        m145678f();
        try {
            this.f94868f.put(new RunnableC36906b(str, aVar, this.f94866d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private long m145674a(RunnableC36906b bVar, ByteBuffer byteBuffer, int i) {
        int i2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.put(byteBuffer);
        allocateDirect.rewind();
        long j = 0;
        while (bVar.mo136267d() == 1 && allocateDirect.hasRemaining()) {
            if (allocateDirect.remaining() > this.f94869g.remaining()) {
                i2 = allocateDirect.limit();
                allocateDirect.limit(this.f94869g.remaining() + allocateDirect.position());
            } else {
                i2 = -1;
            }
            this.f94869g.put(allocateDirect);
            if (this.f94869g.position() == this.f94869g.limit()) {
                j = this.f94865b.writeFrame(this.f94869g, this.f94869g.limit());
                if (j != 0) {
                    this.f94869g.rewind();
                }
            }
            if (i2 != -1) {
                allocateDirect.limit(i2);
            }
        }
        return j;
    }
}
