package com.bytedance.ee.bear.middleground.p438a;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.p438a.AbstractC8888i;
import com.bytedance.ee.log.C13479a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.C28472a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.ee.bear.middleground.a.e */
public class C8872e {

    /* renamed from: d */
    private static volatile C8872e f23901d;

    /* renamed from: a */
    public BlockingQueue<RunnableC8876b> f23902a = new LinkedBlockingQueue();

    /* renamed from: b */
    public AudioManager f23903b;

    /* renamed from: c */
    public AudioManager.OnAudioFocusChangeListener f23904c = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.bytedance.ee.bear.middleground.p438a.C8872e.C88731 */

        public void onAudioFocusChange(int i) {
            if (i == -1) {
                C8872e.this.mo34080b();
            }
        }
    };

    /* renamed from: e */
    private volatile Thread f23905e;

    /* renamed from: f */
    private volatile RunnableC8876b f23906f;

    /* renamed from: g */
    private volatile int f23907g;

    /* renamed from: h */
    private volatile boolean f23908h;

    /* renamed from: i */
    private int f23909i = 1;

    /* renamed from: com.bytedance.ee.bear.middleground.a.e$a */
    public interface AbstractC8875a {
        /* renamed from: a */
        void mo34086a();

        /* renamed from: a */
        void mo34087a(float f);

        /* renamed from: b */
        void mo34088b();

        /* renamed from: c */
        void mo34089c();
    }

    /* renamed from: a */
    public static Thread m37215a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: d */
    public int mo34082d() {
        return this.f23909i;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.a.e$b */
    public static class RunnableC8876b implements Runnable {

        /* renamed from: a */
        public String f23912a;

        /* renamed from: b */
        public AbstractC8875a f23913b;

        /* renamed from: c */
        public volatile float f23914c;

        /* renamed from: d */
        private AbstractC8888i f23915d;

        /* renamed from: e */
        private int f23916e;

        /* renamed from: f */
        private C8872e f23917f;

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34093d() {
            AbstractC8875a aVar = this.f23913b;
            if (aVar != null) {
                aVar.mo34089c();
            }
        }

        /* renamed from: b */
        public void mo34091b() {
            AbstractC8888i iVar = this.f23915d;
            if (iVar != null && iVar.mo34102d()) {
                this.f23915d.mo34101c();
            }
        }

        /* renamed from: c */
        public boolean mo34092c() {
            AbstractC8888i iVar = this.f23915d;
            if (iVar != null) {
                return iVar.mo34096a();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo34090a() {
            if (TextUtils.isEmpty(this.f23912a)) {
                return false;
            }
            C13479a.m54772d("MarcusTest", "run: PcmPlayer");
            C8879g gVar = new C8879g(this.f23917f.f23903b, this.f23916e);
            this.f23915d = gVar;
            if (!gVar.mo34098a(this.f23912a, this.f23917f.mo34082d())) {
                return false;
            }
            this.f23915d.mo34127a(new AbstractC8888i.AbstractC8889a() {
                /* class com.bytedance.ee.bear.middleground.p438a.C8872e.RunnableC8876b.C88771 */

                @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i.AbstractC8889a
                /* renamed from: a */
                public void mo34095a(float f) {
                    RunnableC8876b.this.f23914c = f;
                    if (RunnableC8876b.this.f23913b != null) {
                        RunnableC8876b.this.f23913b.mo34087a(f);
                    }
                }
            });
            return true;
        }

        public void run() {
            AbstractC8875a aVar = this.f23913b;
            if (aVar != null) {
                aVar.mo34086a();
            }
            try {
                if (this.f23914c > BitmapDescriptorFactory.HUE_RED && this.f23914c <= 1.0f) {
                    this.f23915d.mo34097a(this.f23914c);
                }
                this.f23915d.mo34100b();
                AbstractC8875a aVar2 = this.f23913b;
                if (aVar2 != null) {
                    aVar2.mo34088b();
                }
                this.f23917f.mo34081c();
                C8872e eVar = this.f23917f;
                eVar.mo34078a(eVar.f23904c);
            } catch (Exception e) {
                e.printStackTrace();
                mo34093d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public synchronized RunnableC8876b mo34083e() {
        return this.f23906f;
    }

    private C8872e() {
        mo34077a(C28472a.m104336a().mo34074b());
    }

    /* renamed from: a */
    public static C8872e m37214a() {
        if (f23901d == null) {
            synchronized (C8872e.class) {
                if (f23901d == null) {
                    f23901d = new C8872e();
                }
            }
        }
        return f23901d;
    }

    /* renamed from: f */
    private void m37216f() {
        if (this.f23905e == null || !this.f23905e.isAlive()) {
            this.f23905e = m37215a(new Thread("opus_player") {
                /* class com.bytedance.ee.bear.middleground.p438a.C8872e.C88742 */

                /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0002 A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 119
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.p438a.C8872e.C88742.run():void");
                }
            });
            this.f23905e.start();
        }
    }

    /* renamed from: c */
    public synchronized void mo34081c() {
        try {
            if (!this.f23903b.isWiredHeadsetOn()) {
                this.f23903b.setMode(this.f23907g);
                this.f23903b.setSpeakerphoneOn(this.f23908h);
                return;
            }
            return;
        } catch (SecurityException e) {
            C13479a.m54758a("AudioPlayerEx", "recoverySystemPlayMode: " + e);
        }
    }

    /* renamed from: b */
    public void mo34080b() {
        mo34078a(this.f23904c);
        while (!this.f23902a.isEmpty()) {
            try {
                RunnableC8876b take = this.f23902a.take();
                if (take != null) {
                    take.mo34091b();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RunnableC8876b e2 = mo34083e();
        C13479a.m54772d("MarcusTest", "stop: " + e2);
        if (e2 != null) {
            e2.mo34091b();
        }
        mo34079a((RunnableC8876b) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo34079a(RunnableC8876b bVar) {
        this.f23906f = bVar;
    }

    /* renamed from: a */
    public void mo34077a(Context context) {
        this.f23903b = (AudioManager) context.getSystemService("audio");
        m37216f();
    }

    /* renamed from: a */
    public void mo34078a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT > 7 && (audioManager = this.f23903b) != null) {
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }
}
