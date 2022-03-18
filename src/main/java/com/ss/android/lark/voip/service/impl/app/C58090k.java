package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Vibrator;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.lark.voip.service.impl.app.k */
public class C58090k {

    /* renamed from: a */
    private static C58090k f142890a;

    /* renamed from: b */
    private C58091a f142891b;

    /* renamed from: c */
    private C58091a f142892c;

    /* renamed from: d */
    private C58093b f142893d;

    /* renamed from: e */
    private Context f142894e;

    /* renamed from: c */
    public void mo196903c() {
    }

    /* renamed from: i */
    public void mo196909i() {
    }

    /* renamed from: b */
    public void mo196902b() {
        C58091a aVar = this.f142892c;
        if (aVar != null) {
            aVar.mo196910a();
            this.f142892c = null;
        }
    }

    /* renamed from: e */
    public void mo196905e() {
        C58091a aVar = this.f142891b;
        if (aVar != null) {
            aVar.mo196913c();
            this.f142891b = null;
        }
    }

    /* renamed from: g */
    public void mo196907g() {
        C58093b bVar = this.f142893d;
        if (bVar != null) {
            bVar.mo196917c();
            this.f142893d = null;
        }
    }

    /* renamed from: h */
    public void mo196908h() {
        C58093b bVar = new C58093b(this.f142894e, "vibrate_100ms");
        this.f142893d = bVar;
        bVar.mo196915a();
    }

    /* renamed from: f */
    public void mo196906f() {
        C58093b bVar = this.f142893d;
        if (bVar != null) {
            bVar.mo196917c();
        }
        if (VoIPAudioManager.m225760a().mo197194i() != 0) {
            C58093b bVar2 = new C58093b(this.f142894e, "loop vibrate");
            this.f142893d = bVar2;
            bVar2.mo196916b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.k$a */
    public static class C58091a {

        /* renamed from: a */
        public String f142895a;

        /* renamed from: b */
        public boolean f142896b;

        /* renamed from: c */
        private Context f142897c;

        /* renamed from: d */
        private MediaPlayer f142898d;

        /* renamed from: e */
        private Ringtone f142899e;

        /* renamed from: b */
        public void mo196912b() {
            Ringtone ringtone = RingtoneManager.getRingtone(this.f142897c, RingtoneManager.getActualDefaultRingtoneUri(this.f142897c, 1));
            this.f142899e = ringtone;
            if (ringtone != null) {
                if (this.f142896b) {
                    m225329a(ringtone);
                }
                try {
                    this.f142899e.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public void mo196910a() {
            C58151d.m225579b("ui", "ui", this.f142895a + " stop", "[VoIPTonePlayer] " + this.f142895a + " stop: enter thread = " + Thread.currentThread().getName());
            MediaPlayer mediaPlayer = this.f142898d;
            if (mediaPlayer != null) {
                mediaPlayer.setOnCompletionListener(null);
                try {
                    this.f142898d.stop();
                    this.f142898d.release();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                    C58151d.m225579b("ui", "ui", this.f142895a + " stop", e.getMessage());
                } catch (Throwable th) {
                    this.f142898d = null;
                    throw th;
                }
                this.f142898d = null;
            }
        }

        /* renamed from: c */
        public void mo196913c() {
            C58151d.m225579b("ui", "ui", this.f142895a + " stop", "[VoIPTonePlayer] " + this.f142895a + " stop: enter thread = " + Thread.currentThread().getName());
            Ringtone ringtone = this.f142899e;
            if (ringtone != null) {
                ringtone.stop();
                this.f142899e = null;
            }
        }

        /* renamed from: a */
        private void m225329a(Ringtone ringtone) {
            if (Build.VERSION.SDK_INT >= 28) {
                ringtone.setLooping(true);
                return;
            }
            try {
                Field declaredField = Ringtone.class.getDeclaredField("mLocalPlayer");
                declaredField.setAccessible(true);
                MediaPlayer mediaPlayer = (MediaPlayer) declaredField.get(ringtone);
                if (mediaPlayer != null) {
                    mediaPlayer.setLooping(true);
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
            }
        }

        public C58091a(Context context, String str, boolean z) {
            this.f142897c = context;
            this.f142895a = str;
            this.f142896b = z;
        }

        /* renamed from: a */
        public void mo196911a(int i, int i2, int i3) {
            C58151d.m225578a("ui", "ui", this.f142895a + " loop = " + this.f142896b, "[VoIPTonePlayer] start from ResId : " + this.f142895a + " loop = " + this.f142896b);
            AssetFileDescriptor openRawResourceFd = this.f142897c.getResources().openRawResourceFd(i);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f142898d = mediaPlayer;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setAudioStreamType(i3);
                    this.f142898d.setLooping(false);
                    this.f142898d.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                    this.f142898d.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        /* class com.ss.android.lark.voip.service.impl.app.C58090k.C58091a.C580921 */

                        public void onCompletion(MediaPlayer mediaPlayer) {
                            C58151d.m225578a("ui", "ui", C58091a.this.f142895a + " completion loop = " + C58091a.this.f142896b, "[VoIPTonePlayer] " + C58091a.this.f142895a + " completion and loop = " + C58091a.this.f142896b);
                            if (C58091a.this.f142896b) {
                                mediaPlayer.seekTo(0);
                                mediaPlayer.start();
                                return;
                            }
                            C58091a.this.mo196910a();
                        }
                    });
                    this.f142898d.prepareAsync();
                    this.f142898d.setOnPreparedListener($$Lambda$k$a$IK4V6faQI3Ynke0bpMGr0QeITh4.INSTANCE);
                } catch (Exception e) {
                    C58151d.m225579b("ui", "ui", this.f142895a + " start fail", e.getMessage());
                }
            } else {
                C58151d.m225579b("ui", "ui", this.f142895a + " start fail", "[VoIPTonePlayer] " + this.f142895a + " start fail: mMediaPlayer is null");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.k$b */
    public static class C58093b {

        /* renamed from: a */
        private Context f142901a;

        /* renamed from: b */
        private String f142902b;

        /* renamed from: c */
        private Vibrator f142903c;

        /* renamed from: a */
        public void mo196915a() {
            String str = this.f142902b;
            C58151d.m225578a("ui", "ui", str, "[VoIPTonePlayer] VoipVibrator  shortVibrate :  " + this.f142902b);
            this.f142903c.vibrate(100);
        }

        /* renamed from: b */
        public void mo196916b() {
            String str = this.f142902b;
            C58151d.m225578a("ui", "ui", str, "[VoIPTonePlayer] VoipVibrator  loopVibrate :  " + this.f142902b);
            this.f142903c.vibrate(new long[]{1000, 500}, 0);
        }

        /* renamed from: c */
        public void mo196917c() {
            String str = this.f142902b;
            C58151d.m225578a("ui", "ui", str, "[VoIPTonePlayer] VoipVibrator  stopVibrate :  " + this.f142902b);
            Vibrator vibrator = this.f142903c;
            if (vibrator != null) {
                vibrator.cancel();
                this.f142903c = null;
            }
        }

        public C58093b(Context context, String str) {
            this.f142901a = context;
            this.f142902b = str;
            this.f142903c = (Vibrator) context.getSystemService("vibrator");
        }
    }

    /* renamed from: a */
    public void mo196901a() {
        int i;
        if (this.f142892c != null) {
            C58151d.m225579b("ui", "ui", "old waiting sound is valid!!!", "[VoIPTonePlayer] startPlayWaitingSound: old waiting sound is valid!!!");
            this.f142892c.mo196910a();
            this.f142892c = null;
        }
        this.f142892c = new C58091a(this.f142894e, "waiting_sound", true);
        if (RomUtils.m94940b() || RomUtils.m94946d()) {
            i = 3;
        } else {
            i = 0;
        }
        this.f142892c.mo196911a(R.raw.ringingup, 3, i);
    }

    /* renamed from: d */
    public void mo196904d() {
        if (this.f142891b != null) {
            C58151d.m225579b("ui", "ui", "old ringing sound is valid!!!", "[VoIPTonePlayer] startRinging: old ringing sound is valid!!!");
            this.f142891b.mo196913c();
            this.f142891b = null;
        }
        if (VoIPAudioManager.m225760a().mo197194i() == 2) {
            C58091a aVar = new C58091a(this.f142894e, "ringing_sound", true);
            this.f142891b = aVar;
            aVar.mo196912b();
        }
    }

    private C58090k(Context context) {
        this.f142894e = context;
    }

    /* renamed from: a */
    public static C58090k m225318a(Context context) {
        if (f142890a == null) {
            synchronized (C58090k.class) {
                if (f142890a == null) {
                    f142890a = new C58090k(context);
                }
            }
        }
        return f142890a;
    }
}
