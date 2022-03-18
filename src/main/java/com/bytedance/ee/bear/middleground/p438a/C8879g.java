package com.bytedance.ee.bear.middleground.p438a;

import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import com.bytedance.ee.bear.middleground.p438a.C8879g;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.C28472a;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.middleground.a.g */
public class C8879g extends AbstractC8888i {

    /* renamed from: a */
    public MediaPlayer f23919a;

    /* renamed from: b */
    public int f23920b;

    /* renamed from: p */
    private int f23921p;

    /* renamed from: q */
    private volatile int f23922q;

    /* renamed from: r */
    private C8881a f23923r;

    /* renamed from: s */
    private String f23924s;

    /* renamed from: t */
    private CountDownLatch f23925t = new CountDownLatch(1);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.a.g$a */
    public class C8881a {

        /* renamed from: b */
        private int f23927b;

        /* renamed from: c */
        private ScheduledFuture f23928c;

        /* renamed from: d */
        private int f23929d;

        /* renamed from: e */
        private boolean f23930e = true;

        /* renamed from: f */
        private boolean f23931f;

        /* renamed from: g */
        private Runnable f23932g = new Runnable() {
            /* class com.bytedance.ee.bear.middleground.p438a.$$Lambda$g$a$aBckfZTGHqdVSqDMYAHomFpnI0 */

            public final void run() {
                C8879g.C8881a.this.m37245d();
            }
        };

        /* renamed from: c */
        public void mo34105c() {
            ScheduledFuture scheduledFuture;
            if (!this.f23931f && (scheduledFuture = this.f23928c) != null) {
                scheduledFuture.cancel(true);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ void m37245d() {
            ScheduledFuture scheduledFuture = this.f23928c;
            if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
                int currentPosition = C8879g.this.f23919a.getCurrentPosition();
                this.f23927b = currentPosition;
                C8879g.this.f23971n = (((float) currentPosition) * 1.0f) / ((float) this.f23929d);
                C8879g gVar = C8879g.this;
                gVar.mo34099b(gVar.f23971n);
            }
        }

        /* renamed from: a */
        public void mo34103a() {
            this.f23927b = 0;
            this.f23931f = false;
            C8879g.this.mo34099b(BitmapDescriptorFactory.HUE_RED);
            this.f23929d = C8879g.this.f23920b;
            if (!this.f23931f) {
                try {
                    this.f23928c = C28472a.m104336a().mo34073a().scheduleAtFixedRate(this.f23932g, 1, 1, TimeUnit.SECONDS);
                } catch (RejectedExecutionException unused) {
                    this.f23931f = true;
                    this.f23928c.cancel(true);
                }
            }
        }

        /* renamed from: b */
        public void mo34104b() {
            ScheduledFuture scheduledFuture;
            if (this.f23931f) {
                try {
                    C8879g.this.mo34099b(1.0f);
                    Thread.sleep(500);
                } catch (Exception e) {
                    C13479a.m54758a("MediaPlayerEx", e.toString());
                }
            } else {
                try {
                    Thread.sleep((long) ((this.f23929d - this.f23927b) + 1000));
                    scheduledFuture = this.f23928c;
                    if (scheduledFuture == null) {
                        return;
                    }
                } catch (Exception e2) {
                    C13479a.m54758a("MediaPlayerEx", e2.toString());
                    if (this.f23928c != null) {
                        scheduledFuture = this.f23928c;
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    ScheduledFuture scheduledFuture2 = this.f23928c;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                    }
                    throw th;
                }
                scheduledFuture.cancel(true);
            }
        }

        public C8881a(int i) {
            this.f23929d = ((i + ParticipantRepo.f117150c) / 1000) * 1000;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: d */
    public boolean mo34102d() {
        if (this.f23922q == this.f23967j || this.f23922q == this.f23964g) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: a */
    public boolean mo34096a() {
        try {
            this.f23925t.countDown();
            this.f23919a.release();
            return true;
        } catch (Exception e) {
            C13479a.m54761a("MediaPlayerEx", e);
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: c */
    public boolean mo34101c() {
        try {
            this.f23919a.stop();
        } catch (Exception e) {
            C13479a.m54761a("MediaPlayerEx", e);
        } catch (Throwable th) {
            mo34096a();
            throw th;
        }
        mo34096a();
        mo34099b(BitmapDescriptorFactory.HUE_RED);
        this.f23923r.mo34105c();
        this.f23922q = this.f23966i;
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: b */
    public boolean mo34100b() {
        try {
            this.f23922q = this.f23965h;
            this.f23923r.mo34103a();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f23919a = mediaPlayer;
            try {
                mediaPlayer.setDataSource(this.f23924s);
                this.f23919a.prepare();
                this.f23920b = this.f23919a.getDuration();
                this.f23919a.start();
                C8882b bVar = new C8882b();
                this.f23919a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    /* class com.bytedance.ee.bear.middleground.p438a.$$Lambda$g$_vYXP_oJWL2LfYwar0nnYbQvCIY */

                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        C8879g.this.m37236a((C8879g) mediaPlayer);
                    }
                });
                this.f23919a.setOnErrorListener(new MediaPlayer.OnErrorListener(bVar) {
                    /* class com.bytedance.ee.bear.middleground.p438a.$$Lambda$g$zirSgdUMHYks0svNjkgBxK01arg */
                    public final /* synthetic */ C8879g.C8882b f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        return C8879g.this.m37237a(this.f$1, mediaPlayer, i, i2);
                    }
                });
                this.f23925t.await();
                this.f23922q = this.f23967j;
                return true;
            } catch (Exception e) {
                this.f23919a.release();
                C13479a.m54761a("MediaPlayerEx", e);
                this.f23922q = this.f23967j;
                return false;
            }
        } catch (Exception e2) {
            C13479a.m54761a("MediaPlayerEx", e2);
            mo34096a();
        } catch (Throwable th) {
            this.f23922q = this.f23967j;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.a.g$b */
    public class C8882b {

        /* renamed from: a */
        boolean f23933a;

        private C8882b() {
            this.f23933a = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m37236a(MediaPlayer mediaPlayer) {
        this.f23923r.mo34104b();
        this.f23925t.countDown();
    }

    /* renamed from: b */
    public void mo34099b(float f) {
        if (this.f23972o != null) {
            this.f23972o.mo34095a(f);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: a */
    public boolean mo34097a(float f) {
        try {
            this.f23919a.seekTo((int) (((float) this.f23920b) * f));
        } catch (Exception e) {
            C13479a.m54761a("MediaPlayerEx", e);
            mo34096a();
        }
        C13479a.m54772d("MediaPlayerEx", "seekProgress:" + (((float) this.f23920b) * f) + ", process=" + f);
        return true;
    }

    public C8879g(AudioManager audioManager, int i) {
        super(audioManager);
        this.f23923r = new C8881a(i);
        this.f23920b = i;
    }

    @Override // com.bytedance.ee.bear.middleground.p438a.AbstractC8888i
    /* renamed from: a */
    public boolean mo34098a(String str, int i) {
        int i2;
        super.mo34098a(str, i);
        this.f23924s = str;
        this.f23960c = i;
        try {
            int minBufferSize = AudioTrack.getMinBufferSize(48000, 4, 2);
            this.f23921p = minBufferSize;
            if (minBufferSize > this.f23962e) {
                i2 = this.f23921p;
            } else {
                i2 = this.f23962e;
            }
            this.f23921p = i2;
            return true;
        } catch (Exception e) {
            C13479a.m54761a("MediaPlayerEx", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m37237a(C8882b bVar, MediaPlayer mediaPlayer, int i, int i2) {
        bVar.f23933a = false;
        this.f23925t.countDown();
        C13479a.m54758a("MediaPlayerEx", "OnError: , what=" + i + ", extra" + i2);
        return false;
    }
}
