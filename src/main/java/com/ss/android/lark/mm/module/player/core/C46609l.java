package com.ss.android.lark.mm.module.player.core;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.videoshop.p3199e.C64159a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.mm.module.player.core.l */
public final class C46609l implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f117288a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f117289b;

    /* renamed from: c */
    private final AudioManager f117290c;

    /* renamed from: d */
    private final WeakReference<AbstractC46612a> f117291d;

    /* renamed from: e */
    private boolean f117292e = true;

    /* renamed from: f */
    private int f117293f = 1;

    /* renamed from: g */
    private final Runnable f117294g = new Runnable() {
        /* class com.ss.android.lark.mm.module.player.core.C46609l.RunnableC466101 */

        public void run() {
            C46609l.this.mo163767a();
        }
    };

    /* renamed from: com.ss.android.lark.mm.module.player.core.l$a */
    public interface AbstractC46612a {
        /* renamed from: a */
        void mo163775a(boolean z);

        /* renamed from: b */
        void mo163776b(boolean z);
    }

    /* renamed from: a */
    public void mo163767a() {
        mo163771b(this.f117293f);
    }

    /* renamed from: b */
    public void mo163770b() {
        C45855f.m181663b("MmVideoAudioFocusController", "destroy");
        m184392a(this.f117290c, this);
        this.f117288a.removeCallbacksAndMessages(null);
    }

    public void onAudioFocusChange(final int i) {
        C64159a.m252083b("MmVideoAudioFocusController", "change audio:" + i);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f117288a.post(new Runnable() {
                /* class com.ss.android.lark.mm.module.player.core.C46609l.RunnableC466112 */

                public void run() {
                    C46609l.this.mo163768a(i);
                }
            });
        } else {
            mo163768a(i);
        }
    }

    /* renamed from: a */
    public void mo163768a(int i) {
        AbstractC46612a aVar = this.f117291d.get();
        if (aVar == null) {
            mo163770b();
        } else if (i == -2) {
            aVar.mo163775a(true);
        } else if (i == 1) {
            aVar.mo163776b(true);
        } else if (i == -1) {
            aVar.mo163775a(true);
        }
    }

    /* renamed from: b */
    public void mo163771b(int i) {
        C45855f.m181663b("MmVideoAudioFocusController", "start");
        AbstractC46612a aVar = this.f117291d.get();
        if (aVar != null) {
            this.f117293f = i;
            if (m184393a(this.f117290c, this, i) == 1) {
                this.f117292e = true;
                this.f117288a.removeCallbacksAndMessages(this.f117294g);
                aVar.mo163776b(false);
            } else if (this.f117292e) {
                this.f117292e = false;
                this.f117288a.removeCallbacksAndMessages(this.f117294g);
                this.f117288a.postDelayed(this.f117294g, 1000);
            } else {
                aVar.mo163775a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo163769a(boolean z) {
        C45855f.m181663b("MmVideoAudioFocusController", "stop " + z);
        AbstractC46612a aVar = this.f117291d.get();
        if (aVar != null) {
            m184392a(this.f117290c, this);
            if (z) {
                aVar.mo163775a(false);
            }
            this.f117292e = true;
            this.f117288a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    private static int m184392a(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            return audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        } catch (Exception e) {
            C64159a.m252083b("MmVideoAudioFocusController", "returnFocus error");
            e.printStackTrace();
            return 0;
        }
    }

    public C46609l(Context context, AbstractC46612a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f117289b = applicationContext;
        this.f117290c = (AudioManager) applicationContext.getSystemService("audio");
        this.f117291d = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private static int m184393a(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        try {
            return audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i);
        } catch (Exception e) {
            C64159a.m252083b("MmVideoAudioFocusController", "gainFocus error");
            e.printStackTrace();
            return 0;
        }
    }
}
