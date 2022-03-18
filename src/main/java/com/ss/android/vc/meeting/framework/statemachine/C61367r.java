package com.ss.android.vc.meeting.framework.statemachine;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.Vibrator;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.meeting.framework.statemachine.C61367r;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.r */
public class C61367r {

    /* renamed from: c */
    private static volatile C61367r f153773c;

    /* renamed from: a */
    private volatile Context f153774a;

    /* renamed from: b */
    private volatile AudioManager f153775b = ((AudioManager) this.f153774a.getSystemService("audio"));

    /* renamed from: d */
    private volatile C61369b f153776d;

    /* renamed from: e */
    private volatile C61368a f153777e;

    /* renamed from: f */
    private volatile C61368a f153778f;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m239125h() {
        m239124g();
        m239122e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.r$b */
    public static class C61369b {

        /* renamed from: a */
        private Context f153782a;

        /* renamed from: b */
        private Vibrator f153783b;

        /* renamed from: b */
        public void mo212400b() {
            Vibrator vibrator = this.f153783b;
            if (vibrator != null) {
                vibrator.cancel();
                this.f153783b = null;
            }
        }

        /* renamed from: a */
        public void mo212399a() {
            this.f153783b.vibrate(new long[]{1000, 500}, 0);
        }

        public C61369b(Context context) {
            this.f153782a = context;
            this.f153783b = (Vibrator) context.getSystemService("vibrator");
        }
    }

    /* renamed from: a */
    public void mo212393a() {
        m239118a(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$IliqjwEG2374MdhgKEQhIF3MxIc */

            public final void run() {
                C61367r.this.m239127j();
            }
        });
    }

    /* renamed from: b */
    public void mo212395b() {
        m239118a(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$LwBczA1R15T3iUuszY0dkucA_Rk */

            public final void run() {
                C61367r.this.m239126i();
            }
        });
    }

    /* renamed from: c */
    public void mo212396c() {
        m239118a(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$A8dKOAz45h4cwM8UF68T9Xz8_s */

            public final void run() {
                C61367r.this.m239125h();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.r$a */
    public static class C61368a {

        /* renamed from: a */
        private Context f153779a;

        /* renamed from: b */
        private MediaPlayer f153780b;

        /* renamed from: c */
        private boolean f153781c;

        /* renamed from: a */
        public void mo212397a() {
            C60700b.m235851b("VideoChatTonePlayer", "[stop]", "stop playing sound");
            MediaPlayer mediaPlayer = this.f153780b;
            if (mediaPlayer != null) {
                mediaPlayer.setOnCompletionListener(null);
                this.f153780b.stop();
                this.f153780b.release();
                this.f153780b = null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m239135c(MediaPlayer mediaPlayer) {
            try {
                if (this.f153781c) {
                    mediaPlayer.seekTo(0);
                } else {
                    mo212397a();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public C61368a(Context context, boolean z) {
            this.f153779a = context;
            this.f153781c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ boolean m239133a(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer mediaPlayer2 = this.f153780b;
            if (mediaPlayer2 == null) {
                return false;
            }
            mediaPlayer2.stop();
            return false;
        }

        /* renamed from: a */
        public void mo212398a(int i, int i2, boolean z) {
            C60700b.m235851b("VideoChatTonePlayer", "[start]", "playing sound() called with: streamType = [" + i2 + "], isVoiceCall = [" + z + "]");
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f153780b = mediaPlayer;
                mediaPlayer.setAudioStreamType(i2);
                this.f153780b.setLooping(false);
                AssetFileDescriptor openRawResourceFd = this.f153779a.getResources().openRawResourceFd(i);
                this.f153780b.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                this.f153780b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$a$l_YVDQxeUsj5VNLdFSNZ9kkb6E */

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        C61367r.C61368a.this.m239135c(mediaPlayer);
                    }
                });
                this.f153780b.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$a$otmAUGUfugmhet2KRs7Ssb4oy8 */

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        return C61367r.C61368a.this.m239133a(mediaPlayer, i, i2);
                    }
                });
                this.f153780b.setOnSeekCompleteListener($$Lambda$r$a$3sg81atxnloquTWdF9MfuH8QPo.INSTANCE);
                this.f153780b.prepareAsync();
                this.f153780b.setOnPreparedListener($$Lambda$r$a$319fV4jZWUnJdvkRpL38T7mkNU.INSTANCE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m239122e() {
        C60700b.m235851b("VideoChatTonePlayer", "[stopVibrate]", "stopVibrate");
        if (this.f153776d != null) {
            this.f153776d.mo212400b();
            this.f153776d = null;
        }
    }

    /* renamed from: f */
    private void m239123f() {
        C60700b.m235851b("VideoChatTonePlayer", "[stopPlayingWaitingSound]", "stopPlayingWaitingSound");
        if (this.f153778f != null) {
            try {
                this.f153778f.mo212397a();
                this.f153778f = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private void m239124g() {
        C60700b.m235851b("VideoChatTonePlayer", "[stopPlayingRingingSound]", "stopPlayingRingingSound");
        if (this.f153777e != null) {
            try {
                this.f153777e.mo212397a();
                this.f153777e = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m239127j() {
        C60700b.m235851b("VideoChatTonePlayer", "[reset]", "reset");
        m239123f();
        m239124g();
        m239122e();
    }

    /* renamed from: d */
    private void m239121d() {
        C60700b.m235851b("VideoChatTonePlayer", "[startVibrate]", "startVibrate");
        if (this.f153776d != null) {
            this.f153776d.mo212400b();
        }
        if (this.f153775b.getRingerMode() != 0) {
            this.f153776d = new C61369b(this.f153774a);
            this.f153776d.mo212399a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m239126i() {
        int i;
        m239124g();
        C60700b.m235851b("VideoChatTonePlayer", "[startPlayingRingingSound]", "startPlayingRingingSound");
        if (this.f153775b.getRingerMode() == 2) {
            this.f153777e = new C61368a(this.f153774a, true);
            if (RomUtils.m94940b()) {
                i = 3;
            } else {
                i = 0;
            }
            this.f153777e.mo212398a(R.raw.dialing, i, false);
        }
        m239121d();
    }

    /* renamed from: a */
    private void m239118a(Runnable runnable) {
        m239119a(runnable, 0);
    }

    private C61367r(Context context) {
        this.f153774a = context;
    }

    /* renamed from: a */
    public static C61367r m239117a(Context context) {
        if (f153773c == null) {
            synchronized (C61367r.class) {
                if (f153773c == null) {
                    f153773c = new C61367r(context);
                }
            }
        }
        return f153773c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239120b(boolean z) {
        int i;
        m239123f();
        C60700b.m235851b("VideoChatTonePlayer", "[startPlayingWaitingSound]", "startPlayingWaitingSound");
        this.f153778f = new C61368a(this.f153774a, true);
        if (RomUtils.m94940b()) {
            i = 3;
        } else {
            i = 0;
        }
        this.f153778f.mo212398a(R.raw.dialing, i, z);
    }

    /* renamed from: a */
    public void mo212394a(boolean z) {
        m239118a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$r$l72AjpcAkBTvuVs1fD2LGsbM5vE */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61367r.this.m239120b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m239119a(Runnable runnable, long j) {
        if (j > 0) {
            C60735ab.m236017e().postDelayed(runnable, j);
            return;
        }
        if (Looper.myLooper() == C60735ab.m236017e().getLooper()) {
            runnable.run();
        } else {
            C60735ab.m236017e().post(runnable);
        }
    }
}
