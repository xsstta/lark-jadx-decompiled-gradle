package com.ss.android.lark.p1820e.p1821a;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.e.a.f */
public class C36907f extends AbstractC36908g {

    /* renamed from: a */
    private int f94881a;

    /* renamed from: o */
    private String f94882o;

    /* renamed from: p */
    private volatile int f94883p;

    /* renamed from: q */
    private AudioTrack f94884q;

    /* renamed from: r */
    private AudioTrack f94885r;

    /* renamed from: s */
    private AudioTrack f94886s;

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136233a(float f) {
        return false;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: c */
    public boolean mo136237c() {
        this.f94883p = this.f94895j;
        return false;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: d */
    public boolean mo136238d() {
        this.f94883p = this.f94892g;
        return false;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: g */
    public boolean mo136241g() {
        if (this.f94883p == this.f94894i || this.f94883p == this.f94891f) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: h */
    public boolean mo136242h() {
        if (this.f94883p == this.f94892g) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: b */
    public boolean mo136236b() {
        if (this.f94886s == null) {
            return false;
        }
        this.f94883p = this.f94892g;
        this.f94884q.play();
        this.f94885r.play();
        mo136272f();
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: e */
    public boolean mo136239e() {
        if (this.f94886s == null) {
            return false;
        }
        this.f94884q.pause();
        this.f94885r.pause();
        if (this.f94899n != null) {
            this.f94899n.mo136231a(BitmapDescriptorFactory.HUE_RED);
        }
        this.f94883p = this.f94893h;
        return true;
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136232a() {
        this.f94886s = null;
        AudioTrack audioTrack = this.f94884q;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f94884q.stop();
            }
            this.f94884q.flush();
            this.f94884q.release();
            this.f94884q = null;
        }
        AudioTrack audioTrack2 = this.f94885r;
        if (audioTrack2 == null) {
            return false;
        }
        if (audioTrack2.getState() == 1) {
            this.f94885r.stop();
        }
        this.f94885r.flush();
        this.f94885r.release();
        this.f94885r = null;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (m145700a(r2, r0) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0094 A[SYNTHETIC, Splitter:B:51:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136272f() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p1820e.p1821a.C36907f.mo136272f():void");
    }

    public C36907f(AudioManager audioManager) {
        super(audioManager);
    }

    /* renamed from: a */
    private boolean m145700a(byte[] bArr, int i) {
        if (i == 0) {
            try {
                Thread.sleep(500);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } else {
            if (this.f94887b == this.f94897l || mo136277j()) {
                mo136278k();
                this.f94886s = this.f94885r;
            } else {
                mo136279l();
                this.f94886s = this.f94884q;
            }
            this.f94886s.write(bArr, 0, i);
            if (this.f94899n != null) {
                if (this.f94898m < 1.0f) {
                    this.f94899n.mo136231a(this.f94898m);
                } else {
                    this.f94899n.mo136231a(1.0f);
                }
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36908g
    /* renamed from: a */
    public boolean mo136234a(String str, int i) {
        int i2;
        try {
            super.mo136234a(str, i);
            int minBufferSize = AudioTrack.getMinBufferSize(16000, 4, 2);
            this.f94881a = minBufferSize;
            if (minBufferSize < this.f94890e) {
                i2 = this.f94881a;
            } else {
                i2 = this.f94890e;
            }
            this.f94881a = i2;
            this.f94885r = new AudioTrack(0, 16000, 4, 2, this.f94881a, 1);
            AudioTrack audioTrack = new AudioTrack(3, 16000, 4, 2, this.f94881a, 1);
            this.f94884q = audioTrack;
            this.f94886s = audioTrack;
            if (this.f94887b == this.f94897l) {
                this.f94886s = this.f94885r;
            }
            this.f94882o = str;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
