package com.ss.android.lark.p1820e.p1821a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bef.effectsdk.AudioPlayer;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.C28472a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.C36892a;
import com.ss.android.lark.p1820e.C36910b;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.AbstractC36908g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.lark.e.a.a */
public class C36894a {

    /* renamed from: c */
    private static volatile C36894a f94828c;

    /* renamed from: a */
    public BlockingQueue<RunnableC36897b> f94829a = new LinkedBlockingQueue();

    /* renamed from: b */
    public AudioManager f94830b;

    /* renamed from: d */
    private volatile Thread f94831d;

    /* renamed from: e */
    private volatile RunnableC36897b f94832e;

    /* renamed from: f */
    private volatile int f94833f;

    /* renamed from: g */
    private volatile boolean f94834g;

    /* renamed from: h */
    private boolean f94835h = true;

    /* renamed from: i */
    private C36910b f94836i;

    /* renamed from: j */
    private int f94837j = 1;

    /* renamed from: k */
    private AudioFocusRequest f94838k;

    /* renamed from: l */
    private AudioManager.OnAudioFocusChangeListener f94839l = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.ss.android.lark.p1820e.p1821a.$$Lambda$a$1zMTn0APzARlP7uEQA4opgqeFNc */

        public final void onAudioFocusChange(int i) {
            C36894a.this.m145608a((C36894a) i);
        }
    };

    /* renamed from: com.ss.android.lark.e.a.a$a */
    public interface AbstractC36896a {
        /* renamed from: a */
        void mo122673a();

        /* renamed from: a */
        void mo122674a(float f);

        /* renamed from: b */
        void mo122675b();

        /* renamed from: c */
        void mo122676c();

        /* renamed from: d */
        void mo122677d();

        /* renamed from: e */
        void mo122678e();
    }

    /* renamed from: a */
    public static Thread m145607a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: com.ss.android.lark.e.a.a$b */
    public static class RunnableC36897b implements Runnable {

        /* renamed from: a */
        public AbstractC36908g f94841a;

        /* renamed from: b */
        public String f94842b;

        /* renamed from: c */
        public AbstractC36896a f94843c;

        /* renamed from: d */
        public volatile float f94844d = -1.0f;

        /* renamed from: e */
        private int f94845e;

        /* renamed from: f */
        private C36894a f94846f;

        /* renamed from: f */
        public AbstractC36908g mo136227f() {
            return this.f94841a;
        }

        /* renamed from: g */
        public String mo136228g() {
            return this.f94842b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo136229h() {
            AbstractC36896a aVar = this.f94843c;
            if (aVar != null) {
                aVar.mo122678e();
            }
        }

        /* renamed from: b */
        public void mo136223b() {
            AbstractC36908g gVar = this.f94841a;
            if (gVar != null) {
                gVar.mo136237c();
            }
            AbstractC36896a aVar = this.f94843c;
            if (aVar != null) {
                aVar.mo122675b();
            }
        }

        /* renamed from: c */
        public void mo136224c() {
            AbstractC36908g gVar = this.f94841a;
            if (gVar != null) {
                gVar.mo136238d();
            }
            AbstractC36896a aVar = this.f94843c;
            if (aVar != null) {
                aVar.mo122676c();
            }
        }

        /* renamed from: d */
        public void mo136225d() {
            AbstractC36908g gVar = this.f94841a;
            if (gVar != null && gVar.mo136241g()) {
                this.f94841a.mo136239e();
            }
        }

        /* renamed from: e */
        public boolean mo136226e() {
            AbstractC36908g gVar = this.f94841a;
            if (gVar != null) {
                return gVar.mo136232a();
            }
            return false;
        }

        public void run() {
            AbstractC36896a aVar = this.f94843c;
            if (aVar != null) {
                aVar.mo122673a();
            }
            try {
                if (this.f94844d > BitmapDescriptorFactory.HUE_RED && this.f94844d <= 1.0f) {
                    this.f94841a.mo136233a(this.f94844d);
                }
                this.f94841a.mo136236b();
                AbstractC36896a aVar2 = this.f94843c;
                if (aVar2 != null) {
                    aVar2.mo122677d();
                }
                this.f94846f.mo136214k();
                this.f94846f.mo136216m();
            } catch (Exception e) {
                e.printStackTrace();
                mo136229h();
            }
        }

        /* renamed from: a */
        public boolean mo136222a() {
            if (TextUtils.isEmpty(this.f94842b)) {
                return false;
            }
            if (C36899b.m145652a(this.f94842b)) {
                Log.m165379d("MarcusTest", "run: AudioPlayer");
                this.f94841a = new C36901d(this.f94846f.f94830b, this.f94845e);
            } else {
                Log.m165379d("MarcusTest", "run: PcmPlayer");
                this.f94841a = new C36907f(this.f94846f.f94830b);
            }
            if (!this.f94841a.mo136234a(this.f94842b, this.f94846f.mo136217n())) {
                return false;
            }
            this.f94841a.mo136274a(new AbstractC36908g.AbstractC36909a() {
                /* class com.ss.android.lark.p1820e.p1821a.C36894a.RunnableC36897b.C368981 */

                @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g.AbstractC36909a
                /* renamed from: a */
                public void mo136231a(float f) {
                    RunnableC36897b.this.f94844d = f;
                    if (RunnableC36897b.this.f94843c != null) {
                        RunnableC36897b.this.f94843c.mo122674a(f);
                    }
                }
            });
            return true;
        }

        /* renamed from: a */
        public void mo136221a(float f) {
            AbstractC36908g gVar = this.f94841a;
            if (gVar != null) {
                gVar.mo136233a(f);
            }
        }

        public RunnableC36897b(String str, int i, C36894a aVar, AbstractC36896a aVar2, float f) {
            this.f94845e = i;
            this.f94843c = aVar2;
            this.f94842b = str;
            this.f94846f = aVar;
            this.f94844d = f;
        }
    }

    /* renamed from: n */
    public int mo136217n() {
        return this.f94837j;
    }

    /* renamed from: e */
    public void mo136208e() {
        mo136207d();
        this.f94837j = 1;
    }

    /* renamed from: f */
    public void mo136209f() {
        mo136207d();
        this.f94837j = 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public synchronized RunnableC36897b mo136219p() {
        return this.f94832e;
    }

    /* renamed from: i */
    public boolean mo136212i() {
        AudioManager audioManager = this.f94830b;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* renamed from: a */
    public static C36894a m145605a() {
        if (f94828c == null) {
            synchronized (C36894a.class) {
                if (f94828c == null) {
                    f94828c = new C36894a();
                }
            }
        }
        return f94828c;
    }

    /* renamed from: q */
    private void m145610q() {
        if (this.f94831d == null || !this.f94831d.isAlive()) {
            this.f94831d = m145607a(new Thread("opus_player") {
                /* class com.ss.android.lark.p1820e.p1821a.C36894a.C368951 */

                /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0002 A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 119
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p1820e.p1821a.C36894a.C368951.run():void");
                }
            });
            this.f94831d.start();
        }
    }

    /* renamed from: c */
    public void mo136205c() {
        RunnableC36897b p = mo136219p();
        Log.m165379d(AudioPlayer.f7075a, "pause: " + p);
        if (p != null) {
            p.mo136224c();
        }
    }

    /* renamed from: g */
    public void mo136210g() {
        RunnableC36897b p = mo136219p();
        if (p != null && p.mo136227f() != null) {
            p.mo136227f().mo136273a(2);
        }
    }

    /* renamed from: h */
    public void mo136211h() {
        RunnableC36897b p = mo136219p();
        if (p != null && p.mo136227f() != null) {
            p.mo136227f().mo136273a(1);
        }
    }

    /* renamed from: j */
    public synchronized void mo136213j() {
        this.f94833f = this.f94830b.getMode();
        this.f94834g = this.f94830b.isSpeakerphoneOn();
    }

    /* renamed from: o */
    public int mo136218o() {
        RunnableC36897b p = mo136219p();
        if (p == null || p.mo136227f() == null) {
            return mo136217n();
        }
        return p.mo136227f().mo136276i();
    }

    private C36894a() {
        mo136200a(C28472a.m104336a().mo34074b());
    }

    /* renamed from: r */
    private void m145611r() {
        C36910b bVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f94835h && (bVar = this.f94836i) != null) {
            bVar.mo136281a(new C36892a().mo136193a());
            Log.m165379d(AudioPlayer.f7075a, "registerProximitySensor:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* renamed from: s */
    private void m145612s() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C36910b bVar = this.f94836i;
        if (bVar != null) {
            bVar.mo136280a();
        }
        Log.m165379d(AudioPlayer.f7075a, "unregisterProximitySensor:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* renamed from: k */
    public synchronized void mo136214k() {
        try {
            this.f94830b.setMode(this.f94833f);
            this.f94830b.setSpeakerphoneOn(this.f94834g);
        } catch (SecurityException e) {
            Log.m165383e(AudioPlayer.f7075a, "recoverySystemPlayMode: " + e);
        }
        return;
    }

    /* renamed from: m */
    public void mo136216m() {
        int i;
        if (this.f94830b != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f94838k;
                if (audioFocusRequest != null) {
                    i = this.f94830b.abandonAudioFocusRequest(audioFocusRequest);
                } else {
                    i = -1;
                }
            } else {
                i = this.f94830b.abandonAudioFocus(this.f94839l);
            }
            if (i == 0) {
                Log.m165389i(AudioPlayer.f7075a, "abandonAudioFocus failed");
            } else if (i != 1) {
                Log.m165389i(AudioPlayer.f7075a, "abandonAudioFocus no need");
            } else {
                Log.m165389i(AudioPlayer.f7075a, "abandonAudioFocus granted");
            }
        }
    }

    /* renamed from: b */
    public void mo136204b() {
        RunnableC36897b p = mo136219p();
        Log.m165379d(AudioPlayer.f7075a, "pause: " + p);
        if (p != null) {
            p.mo136223b();
        }
    }

    /* renamed from: d */
    public void mo136207d() {
        mo136216m();
        m145612s();
        while (!this.f94829a.isEmpty()) {
            try {
                RunnableC36897b take = this.f94829a.take();
                if (take != null) {
                    take.mo136225d();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RunnableC36897b p = mo136219p();
        Log.m165379d("MarcusTest", "stop: " + p);
        if (p != null) {
            p.mo136225d();
        }
        mo136201a((RunnableC36897b) null);
    }

    /* renamed from: l */
    public boolean mo136215l() {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setOnAudioFocusChangeListener(this.f94839l).setAcceptsDelayedFocusGain(true).build();
            this.f94838k = build;
            i = this.f94830b.requestAudioFocus(build);
        } else {
            i = this.f94830b.requestAudioFocus(this.f94839l, 3, 2);
        }
        if (i == 0) {
            Log.m165389i(AudioPlayer.f7075a, "requestAudioFocus failed");
        } else if (i == 1) {
            Log.m165389i(AudioPlayer.f7075a, "requestAudioFocus granted");
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m145608a(int i) {
        if (i == -1) {
            mo136207d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo136201a(RunnableC36897b bVar) {
        this.f94832e = bVar;
    }

    /* renamed from: b */
    public float mo136203b(String str) {
        RunnableC36897b p = mo136219p();
        if (p == null || !str.equals(p.f94842b)) {
            return -1.0f;
        }
        return p.f94844d;
    }

    /* renamed from: b */
    private void m145609b(List<RunnableC36897b> list) {
        mo136213j();
        mo136215l();
        m145610q();
        m145611r();
        for (RunnableC36897b bVar : list) {
            try {
                this.f94829a.put(bVar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public boolean mo136206c(String str) {
        RunnableC36897b p;
        if (!TextUtils.isEmpty(str) && (p = mo136219p()) != null && p.f94841a != null && str.equals(p.mo136228g()) && p.f94841a.mo136242h()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private String m145606a(List<RunnableC36897b> list) {
        Log.m165379d("MarcusTest", "toggle: " + list.size());
        if (list == null || list.isEmpty()) {
            Log.m165379d("MarcusTest", "toggle: none");
            return "None";
        } else if (list.get(0) == mo136219p()) {
            mo136207d();
            Log.m165379d("MarcusTest", "toggle: stop");
            return "Stop";
        } else {
            mo136207d();
            Log.m165379d("MarcusTest", "toggle: play");
            m145609b(list);
            return "Start";
        }
    }

    /* renamed from: a */
    public void mo136199a(float f) {
        RunnableC36897b p = mo136219p();
        Log.m165379d(AudioPlayer.f7075a, "seekProgress: " + p);
        if (p != null) {
            p.mo136221a(f);
        }
    }

    /* renamed from: a */
    public void mo136200a(Context context) {
        this.f94830b = (AudioManager) context.getSystemService("audio");
        this.f94836i = new C36910b(context.getApplicationContext());
        m145610q();
    }

    /* renamed from: a */
    public boolean mo136202a(String str) {
        RunnableC36897b p;
        if (!TextUtils.isEmpty(str) && (p = mo136219p()) != null && str.equals(p.mo136228g())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo136198a(C36913c.AbstractC36916a aVar, AbstractC36896a aVar2) {
        if (TextUtils.isEmpty(aVar.mo122664b())) {
            return "None";
        }
        RunnableC36897b p = mo136219p();
        if (p == null || !aVar.equals(p.mo136228g())) {
            p = new RunnableC36897b(aVar.mo122664b(), aVar.mo122665c(), this, aVar2, ((float) aVar.mo122666d()) / 100.0f);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(p);
        return m145606a(arrayList);
    }
}
