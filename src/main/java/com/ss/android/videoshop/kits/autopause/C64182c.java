package com.ss.android.videoshop.kits.autopause;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.videoshop.p3199e.C64159a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.videoshop.kits.autopause.c */
public final class C64182c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f162160a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f162161b;

    /* renamed from: c */
    private final AudioManager f162162c;

    /* renamed from: d */
    private final WeakReference<AbstractC64185a> f162163d;

    /* renamed from: e */
    private boolean f162164e = true;

    /* renamed from: f */
    private int f162165f = 1;

    /* renamed from: g */
    private final Runnable f162166g = new Runnable() {
        /* class com.ss.android.videoshop.kits.autopause.C64182c.RunnableC641831 */

        public void run() {
            C64182c.this.mo222342a();
        }
    };

    /* renamed from: com.ss.android.videoshop.kits.autopause.c$a */
    public interface AbstractC64185a {
        void onAudioFocusGain(boolean z);

        void onAudioFocusLoss(boolean z);
    }

    /* renamed from: a */
    public void mo222342a() {
        mo222346b(this.f162165f);
    }

    /* renamed from: b */
    public void mo222345b() {
        m252253a(this.f162162c, this);
        this.f162160a.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public void mo222346b(int i) {
        AbstractC64185a aVar = this.f162163d.get();
        if (aVar != null) {
            this.f162165f = i;
            if (m252254a(this.f162162c, this, i) == 1) {
                this.f162164e = true;
                this.f162160a.removeCallbacksAndMessages(this.f162166g);
                aVar.onAudioFocusGain(false);
            } else if (this.f162164e) {
                this.f162164e = false;
                this.f162160a.removeCallbacksAndMessages(this.f162166g);
                this.f162160a.postDelayed(this.f162166g, 1000);
            } else {
                aVar.onAudioFocusLoss(false);
            }
        }
    }

    public void onAudioFocusChange(final int i) {
        C64159a.m252083b("VideoAudioFocusController", "change audio:" + i);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f162160a.post(new Runnable() {
                /* class com.ss.android.videoshop.kits.autopause.C64182c.RunnableC641842 */

                public void run() {
                    C64182c.this.mo222343a(i);
                }
            });
        } else {
            mo222343a(i);
        }
    }

    /* renamed from: a */
    public void mo222343a(int i) {
        AbstractC64185a aVar = this.f162163d.get();
        if (aVar == null) {
            mo222345b();
        } else if (i == -2) {
            aVar.onAudioFocusLoss(true);
        } else if (i == 1) {
            aVar.onAudioFocusGain(true);
        } else if (i == -1) {
            aVar.onAudioFocusLoss(true);
        }
    }

    /* renamed from: a */
    public void mo222344a(boolean z) {
        AbstractC64185a aVar = this.f162163d.get();
        if (aVar != null) {
            m252253a(this.f162162c, this);
            if (z) {
                aVar.onAudioFocusLoss(false);
            }
            this.f162164e = true;
            this.f162160a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    private static int m252253a(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        try {
            return audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        } catch (Exception e) {
            C64159a.m252083b("VideoAudioFocusController", "returnFocus error");
            e.printStackTrace();
            return 0;
        }
    }

    public C64182c(Context context, AbstractC64185a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f162161b = applicationContext;
        this.f162162c = (AudioManager) applicationContext.getSystemService("audio");
        this.f162163d = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private static int m252254a(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        try {
            return audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i);
        } catch (Exception e) {
            C64159a.m252083b("VideoAudioFocusController", "gainFocus error");
            e.printStackTrace();
            return 0;
        }
    }
}
