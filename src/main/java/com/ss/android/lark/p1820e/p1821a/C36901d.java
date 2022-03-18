package com.ss.android.lark.p1820e.p1821a;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.C28472a;
import com.ss.android.lark.common.util.opus.OpusTools;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.p1820e.p1821a.C36901d;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.e.a.d */
public class C36901d extends AbstractC36908g {

    /* renamed from: a */
    public OpusTools f94849a = new OpusTools();

    /* renamed from: o */
    private int f94850o;

    /* renamed from: p */
    private volatile int f94851p;

    /* renamed from: q */
    private AudioTrack f94852q;

    /* renamed from: r */
    private AudioTrack f94853r;

    /* renamed from: s */
    private AudioTrack f94854s;

    /* renamed from: t */
    private C36902a f94855t;

    /* renamed from: com.ss.android.lark.e.a.d$a */
    public class C36902a {

        /* renamed from: b */
        private int f94857b;

        /* renamed from: c */
        private ScheduledFuture f94858c;

        /* renamed from: d */
        private int f94859d;

        /* renamed from: e */
        private boolean f94860e = true;

        /* renamed from: f */
        private boolean f94861f;

        /* renamed from: g */
        private Runnable f94862g = new Runnable() {
            /* class com.ss.android.lark.p1820e.p1821a.$$Lambda$d$a$gRb11g5Ts6uNtYLvh3GVSAB9QM */

            public final void run() {
                C36901d.C36902a.m270531lambda$gRb11g5Ts6uNtYLvh3GVSAB9QM(C36901d.C36902a.this);
            }
        };

        /* renamed from: a */
        public void mo136243a() {
            this.f94857b = 0;
            this.f94861f = true;
        }

        /* renamed from: d */
        public void mo136246d() {
            ScheduledFuture scheduledFuture;
            if (!this.f94861f && (scheduledFuture = this.f94858c) != null) {
                scheduledFuture.cancel(true);
            }
        }

        /* renamed from: e */
        public void mo136247e() {
            ScheduledFuture scheduledFuture;
            if (!this.f94861f && (scheduledFuture = this.f94858c) != null) {
                scheduledFuture.cancel(true);
            }
        }

        /* access modifiers changed from: public */
        /* renamed from: g */
        private /* synthetic */ void m145666g() {
            ScheduledFuture scheduledFuture = this.f94858c;
            if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
                int min = Math.min(this.f94857b + 1000, this.f94859d);
                this.f94857b = min;
                C36901d.this.f94898m = (((float) min) * 1.0f) / ((float) this.f94859d);
                C36901d dVar = C36901d.this;
                dVar.mo136235b(dVar.f94898m);
            }
        }

        /* renamed from: f */
        public void mo136248f() {
            ScheduledFuture scheduledFuture;
            if (!this.f94861f && (scheduledFuture = this.f94858c) != null) {
                scheduledFuture.cancel(true);
                this.f94858c = C28472a.m104336a().mo34073a().scheduleAtFixedRate(this.f94862g, 0, 1, TimeUnit.SECONDS);
            }
        }

        /* renamed from: b */
        public void mo136244b() {
            if (this.f94861f) {
                long totalPcmDuration = C36901d.this.f94849a.getTotalPcmDuration();
                long pcmOffset = C36901d.this.f94849a.getPcmOffset();
                C36901d.this.f94898m = (((float) pcmOffset) * 1.0f) / ((float) totalPcmDuration);
                Log.m165379d("OpusPlayerImpl", "readAudioData:" + pcmOffset + "/" + totalPcmDuration + "/" + C36901d.this.f94898m);
                C36901d dVar = C36901d.this;
                dVar.mo136235b(dVar.f94898m);
            }
        }

        /* renamed from: c */
        public void mo136245c() {
            ScheduledFuture scheduledFuture;
            if (this.f94861f) {
                try {
                    C36901d.this.mo136235b(1.0f);
                    Thread.sleep(500);
                } catch (Exception e) {
                    Log.m165383e("OpusPlayerImpl", e.toString());
                }
            } else {
                try {
                    Thread.sleep((long) ((this.f94859d - this.f94857b) + 1000));
                    scheduledFuture = this.f94858c;
                    if (scheduledFuture == null) {
                        return;
                    }
                } catch (Exception e2) {
                    Log.m165383e("OpusPlayerImpl", e2.toString());
                    if (this.f94858c != null) {
                        scheduledFuture = this.f94858c;
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    ScheduledFuture scheduledFuture2 = this.f94858c;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                    }
                    throw th;
                }
                scheduledFuture.cancel(true);
            }
        }

        public C36902a(int i) {
            C36901d.this = r1;
            this.f94859d = ((i + ParticipantRepo.f117150c) / 1000) * 1000;
        }
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: g */
    public boolean mo136241g() {
        if (this.f94851p == this.f94894i || this.f94851p == this.f94891f) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: h */
    public boolean mo136242h() {
        if (this.f94851p == this.f94892g) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: c */
    public boolean mo136237c() {
        this.f94851p = this.f94895j;
        if (this.f94854s == null) {
            return true;
        }
        this.f94852q.pause();
        this.f94853r.pause();
        this.f94855t.mo136247e();
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: d */
    public boolean mo136238d() {
        this.f94851p = this.f94892g;
        if (this.f94854s == null) {
            return true;
        }
        this.f94852q.play();
        this.f94853r.play();
        this.f94855t.mo136248f();
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: b */
    public boolean mo136236b() {
        if (this.f94854s == null) {
            return false;
        }
        this.f94851p = this.f94892g;
        this.f94852q.play();
        this.f94853r.play();
        this.f94855t.mo136243a();
        mo136240f();
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: e */
    public boolean mo136239e() {
        if (this.f94854s == null) {
            return false;
        }
        this.f94852q.pause();
        this.f94853r.pause();
        if (this.f94899n != null) {
            this.f94899n.mo136231a(BitmapDescriptorFactory.HUE_RED);
        }
        this.f94855t.mo136246d();
        this.f94851p = this.f94893h;
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136232a() {
        if (this.f94854s != null) {
            this.f94849a.closeOpusFile();
        }
        AudioTrack audioTrack = this.f94852q;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f94852q.stop();
            }
            this.f94852q.flush();
            this.f94852q.release();
            this.f94852q = null;
        }
        AudioTrack audioTrack2 = this.f94853r;
        if (audioTrack2 == null) {
            return false;
        }
        if (audioTrack2.getState() == 1) {
            this.f94853r.stop();
        }
        this.f94853r.flush();
        this.f94853r.release();
        this.f94853r = null;
        return false;
    }

    /* renamed from: f */
    public void mo136240f() {
        boolean z;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f94850o);
        while (true) {
            if (this.f94851p != this.f94892g) {
                if (this.f94851p != this.f94895j) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                this.f94849a.readOpusFile(allocateDirect, this.f94850o);
                if (m145654a(allocateDirect)) {
                    this.f94855t.mo136244b();
                }
                if (this.f94849a.getFinished() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f94855t.mo136245c();
                    break;
                }
            }
        }
        this.f94851p = this.f94894i;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136233a(float f) {
        int seekOpusFile = this.f94849a.seekOpusFile(f);
        Log.m165379d("OpusPlayerImpl", "seekProgress:" + seekOpusFile);
        return true;
    }

    /* renamed from: b */
    public void mo136235b(float f) {
        if (this.f94899n == null) {
            return;
        }
        if (f < 1.0f) {
            this.f94899n.mo136231a(f);
        } else {
            this.f94899n.mo136231a(1.0f);
        }
    }

    /* renamed from: a */
    private boolean m145654a(ByteBuffer byteBuffer) {
        int size = this.f94849a.getSize();
        if (size != 0) {
            byteBuffer.rewind();
            byte[] bArr = new byte[size];
            byteBuffer.get(bArr);
            if (this.f94887b == this.f94897l || mo136277j()) {
                mo136278k();
                this.f94854s = this.f94853r;
            } else {
                mo136279l();
                this.f94854s = this.f94852q;
            }
            this.f94854s.write(bArr, 0, size);
        }
        if (size != 0) {
            return true;
        }
        return false;
    }

    public C36901d(AudioManager audioManager, int i) {
        super(audioManager);
        this.f94855t = new C36902a(i);
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136234a(String str, int i) {
        int i2;
        int i3;
        super.mo136234a(str, i);
        if (this.f94849a.openOpusFile(str) == 0) {
            return false;
        }
        this.f94887b = i;
        try {
            if (this.f94849a.getChannelCount() == 1) {
                i2 = 4;
            } else {
                i2 = 12;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(48000, i2, 2);
            this.f94850o = minBufferSize;
            if (minBufferSize > this.f94889d) {
                i3 = this.f94850o;
            } else {
                i3 = this.f94889d;
            }
            this.f94850o = i3;
            this.f94853r = new AudioTrack(0, 48000, i2, 2, this.f94850o, 1);
            AudioTrack audioTrack = new AudioTrack(3, 48000, i2, 2, this.f94850o, 1);
            this.f94852q = audioTrack;
            this.f94854s = audioTrack;
            if (this.f94887b == this.f94897l) {
                this.f94854s = this.f94853r;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
