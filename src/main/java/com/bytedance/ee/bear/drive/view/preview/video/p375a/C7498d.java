package com.bytedance.ee.bear.drive.view.preview.video.p375a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.TextureView;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.d */
public class C7498d implements AbstractC7496b {

    /* renamed from: a */
    private Context f20245a;

    /* renamed from: b */
    private MediaPlayer f20246b;

    /* renamed from: c */
    private boolean f20247c;

    /* renamed from: d */
    private EnumC7500a f20248d = EnumC7500a.MPS_IDLE;

    /* renamed from: e */
    private AbstractC7495a f20249e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.d$a */
    public enum EnumC7500a {
        MPS_IDLE,
        MPS_INITIALIZED,
        MPS_PREPARING,
        MPS_PREPARED,
        MPS_STARTED,
        MPS_STOPPED,
        MPS_PAUSED,
        MPS_PLAYBACK_COMPLETED,
        MPS_ERROR,
        MPS_END
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29291a(int i) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29294a(TextureView textureView) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29296a(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29299b(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: f */
    public long mo29303f() {
        return (long) this.f20246b.getDuration();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: g */
    public long mo29304g() {
        return (long) this.f20246b.getCurrentPosition();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: c */
    public void mo29300c() {
        try {
            this.f20246b.release();
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: d */
    public void mo29301d() {
        try {
            this.f20246b.reset();
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29297b() {
        try {
            this.f20246b.pause();
            m30003a(EnumC7500a.MPS_PAUSED);
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: e */
    public int mo29302e() {
        switch (C74991.f20250a[this.f20248d.ordinal()]) {
            case 1:
            default:
                return 1;
            case 2:
                return 2;
            case 3:
            case 4:
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.a.d$1 */
    public static /* synthetic */ class C74991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20250a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a = r0
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_PREPARING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_PREPARED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_STOPPED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.f20250a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.ee.bear.drive.view.preview.video.a.d$a r1 = com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.EnumC7500a.MPS_STARTED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.video.p375a.C7498d.C74991.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29289a() {
        try {
            this.f20246b.start();
            m30003a(EnumC7500a.MPS_STARTED);
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30002a(MediaPlayer mediaPlayer) {
        m30003a(EnumC7500a.MPS_END);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: b */
    public void mo29298b(AbstractC7495a aVar) {
        if (this.f20249e == aVar) {
            this.f20249e = null;
        }
    }

    /* renamed from: a */
    private void m30003a(EnumC7500a aVar) {
        this.f20248d = aVar;
        AbstractC7495a aVar2 = this.f20249e;
        if (aVar2 != null) {
            aVar2.mo28315a(mo29302e());
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29290a(float f) {
        try {
            this.f20246b.setVolume(f, f);
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29292a(long j) {
        try {
            this.f20246b.seekTo((int) j);
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29293a(Uri uri) {
        try {
            if (!this.f20247c) {
                this.f20247c = true;
                this.f20246b.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
                this.f20246b.setDataSource(this.f20245a, uri);
                m30003a(EnumC7500a.MPS_INITIALIZED);
                this.f20246b.prepareAsync();
                m30003a(EnumC7500a.MPS_PREPARING);
            }
        } catch (Exception e) {
            C13479a.m54761a("SystemAudioPlayer", e);
            this.f20247c = false;
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.p375a.AbstractC7496b
    /* renamed from: a */
    public void mo29295a(AbstractC7495a aVar) {
        this.f20249e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30004a(boolean z, MediaPlayer mediaPlayer) {
        m30003a(EnumC7500a.MPS_PREPARED);
        if (z) {
            mo29289a();
        }
    }

    public C7498d(Context context, boolean z) {
        this.f20245a = context;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f20246b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(z) {
            /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$d$8dDW6plc2WjFtgeWKjdK5hR37Q */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onPrepared(MediaPlayer mediaPlayer) {
                C7498d.this.m30004a(this.f$1, mediaPlayer);
            }
        });
        this.f20246b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$d$W2qLKzx4XVbe06NoFksxJygB9QE */

            public final void onCompletion(MediaPlayer mediaPlayer) {
                C7498d.this.m30002a((C7498d) mediaPlayer);
            }
        });
        this.f20246b.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.p375a.$$Lambda$d$2TsnqP2dkGieYARbO7OT8cbIUg */

            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return C7498d.this.m30005a(mediaPlayer, i, i2);
            }
        });
        m30003a(EnumC7500a.MPS_IDLE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m30005a(MediaPlayer mediaPlayer, int i, int i2) {
        String str = "onError() what=" + i + " extra=" + i2;
        C13479a.m54758a("SystemAudioPlayer", str);
        m30003a(EnumC7500a.MPS_IDLE);
        AbstractC7495a aVar = this.f20249e;
        if (aVar == null) {
            return false;
        }
        aVar.mo28318a(new Exception(str));
        return false;
    }
}
