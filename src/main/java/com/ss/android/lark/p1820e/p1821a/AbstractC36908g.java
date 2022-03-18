package com.ss.android.lark.p1820e.p1821a;

import android.media.AudioManager;

/* renamed from: com.ss.android.lark.e.a.g */
public abstract class AbstractC36908g {

    /* renamed from: b */
    protected volatile int f94887b;

    /* renamed from: c */
    protected AudioManager f94888c;

    /* renamed from: d */
    int f94889d = 65536;

    /* renamed from: e */
    int f94890e = 16384;

    /* renamed from: f */
    int f94891f;

    /* renamed from: g */
    int f94892g = 1;

    /* renamed from: h */
    int f94893h = 2;

    /* renamed from: i */
    int f94894i = 3;

    /* renamed from: j */
    int f94895j = 4;

    /* renamed from: k */
    int f94896k = 1;

    /* renamed from: l */
    int f94897l = 2;

    /* renamed from: m */
    float f94898m;

    /* renamed from: n */
    AbstractC36909a f94899n;

    /* renamed from: com.ss.android.lark.e.a.g$a */
    public interface AbstractC36909a {
        /* renamed from: a */
        void mo136231a(float f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo136232a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo136233a(float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo136236b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo136237c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo136238d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo136239e();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract boolean mo136241g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract boolean mo136242h();

    /* renamed from: i */
    public int mo136276i() {
        return this.f94887b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo136278k() {
        mo136275b(this.f94897l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo136279l() {
        mo136275b(this.f94896k);
    }

    /* renamed from: j */
    public boolean mo136277j() {
        AudioManager audioManager = this.f94888c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* renamed from: a */
    public void mo136273a(int i) {
        this.f94887b = i;
    }

    /* renamed from: a */
    public void mo136274a(AbstractC36909a aVar) {
        this.f94899n = aVar;
    }

    public AbstractC36908g(AudioManager audioManager) {
        this.f94888c = audioManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo136275b(int i) {
        if (i == this.f94897l) {
            this.f94888c.setSpeakerphoneOn(false);
            this.f94888c.setMode(3);
            return;
        }
        this.f94888c.setSpeakerphoneOn(true);
        this.f94888c.setMode(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo136234a(String str, int i) {
        this.f94887b = i;
        return true;
    }
}
