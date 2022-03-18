package com.bytedance.lynx.webview.p839a.p841b;

import com.bytedance.lynx.webview.p839a.p840a.C19916a;
import com.bytedance.lynx.webview.p839a.p842c.C19922a;
import com.bytedance.lynx.webview.p839a.p842c.C19923b;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;

/* renamed from: com.bytedance.lynx.webview.a.b.b */
public class C19918b {

    /* renamed from: a */
    C19916a f48648a = new C19916a();

    /* renamed from: b */
    C19923b f48649b = new C19923b();

    /* renamed from: c */
    short[] f48650c = new short[192];

    /* renamed from: d */
    short[] f48651d = new short[12];

    /* renamed from: e */
    short[] f48652e = new short[12];

    /* renamed from: f */
    short[] f48653f = new short[12];

    /* renamed from: g */
    short[] f48654g = new short[12];

    /* renamed from: h */
    short[] f48655h = new short[192];

    /* renamed from: i */
    C19922a[] f48656i = new C19922a[4];

    /* renamed from: j */
    short[] f48657j = new short[SmEvents.EVENT_TO];

    /* renamed from: k */
    C19922a f48658k = new C19922a(4);

    /* renamed from: l */
    C19919a f48659l = new C19919a();

    /* renamed from: m */
    C19919a f48660m = new C19919a();

    /* renamed from: n */
    C19920b f48661n = new C19920b();

    /* renamed from: o */
    int f48662o = -1;

    /* renamed from: p */
    int f48663p = -1;

    /* renamed from: q */
    int f48664q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.webview.a.b.b$b */
    public class C19920b {

        /* renamed from: a */
        C19921a[] f48671a;

        /* renamed from: b */
        int f48672b;

        /* renamed from: c */
        int f48673c;

        /* renamed from: d */
        int f48674d;

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.lynx.webview.a.b.b$b$a */
        public class C19921a {

            /* renamed from: a */
            short[] f48676a = new short[768];

            /* renamed from: a */
            public void mo67474a() {
                C19923b.m72686a(this.f48676a);
            }

            C19921a() {
            }

            /* renamed from: a */
            public byte mo67472a(C19923b bVar) throws IOException {
                int i = 1;
                do {
                    i = bVar.mo67479a(this.f48676a, i) | (i << 1);
                } while (i < 256);
                return (byte) i;
            }

            /* renamed from: a */
            public byte mo67473a(C19923b bVar, byte b) throws IOException {
                int i = 1;
                while (true) {
                    int i2 = (b >> 7) & 1;
                    b = (byte) (b << 1);
                    int a = bVar.mo67479a(this.f48676a, ((i2 + 1) << 8) + i);
                    i = (i << 1) | a;
                    if (i2 == a) {
                        if (i >= 256) {
                            break;
                        }
                    } else {
                        while (i < 256) {
                            i = (i << 1) | bVar.mo67479a(this.f48676a, i);
                        }
                    }
                }
                return (byte) i;
            }
        }

        /* renamed from: a */
        public void mo67470a() {
            int i = 1 << (this.f48672b + this.f48673c);
            for (int i2 = 0; i2 < i; i2++) {
                this.f48671a[i2].mo67474a();
            }
        }

        C19920b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C19921a mo67469a(int i, byte b) {
            C19921a[] aVarArr = this.f48671a;
            int i2 = i & this.f48674d;
            int i3 = this.f48672b;
            return aVarArr[(i2 << i3) + ((b & 255) >>> (8 - i3))];
        }

        /* renamed from: a */
        public void mo67471a(int i, int i2) {
            if (!(this.f48671a != null && this.f48672b == i2 && this.f48673c == i)) {
                this.f48673c = i;
                this.f48674d = (1 << i) - 1;
                this.f48672b = i2;
                int i3 = 1 << (i2 + i);
                this.f48671a = new C19921a[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f48671a[i4] = new C19921a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.webview.a.b.b$a */
    public class C19919a {

        /* renamed from: a */
        short[] f48665a = new short[2];

        /* renamed from: b */
        C19922a[] f48666b = new C19922a[16];

        /* renamed from: c */
        C19922a[] f48667c = new C19922a[16];

        /* renamed from: d */
        C19922a f48668d = new C19922a(8);

        /* renamed from: e */
        int f48669e = 0;

        /* renamed from: a */
        public void mo67467a() {
            C19923b.m72686a(this.f48665a);
            for (int i = 0; i < this.f48669e; i++) {
                this.f48666b[i].mo67476a();
                this.f48667c[i].mo67476a();
            }
            this.f48668d.mo67476a();
        }

        C19919a() {
        }

        /* renamed from: a */
        public void mo67468a(int i) {
            while (true) {
                int i2 = this.f48669e;
                if (i2 < i) {
                    this.f48666b[i2] = new C19922a(3);
                    this.f48667c[this.f48669e] = new C19922a(3);
                    this.f48669e++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public int mo67466a(C19923b bVar, int i) throws IOException {
            int i2;
            if (bVar.mo67479a(this.f48665a, 0) == 0) {
                return this.f48666b[i].mo67475a(bVar);
            }
            if (bVar.mo67479a(this.f48665a, 1) == 0) {
                i2 = this.f48667c[i].mo67475a(bVar);
            } else {
                i2 = this.f48668d.mo67475a(bVar) + 8;
            }
            return i2 + 8;
        }
    }

    public C19918b() {
        for (int i = 0; i < 4; i++) {
            this.f48656i[i] = new C19922a(6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67461a() throws IOException {
        this.f48648a.mo67458a(false);
        C19923b.m72686a(this.f48650c);
        C19923b.m72686a(this.f48655h);
        C19923b.m72686a(this.f48651d);
        C19923b.m72686a(this.f48652e);
        C19923b.m72686a(this.f48653f);
        C19923b.m72686a(this.f48654g);
        C19923b.m72686a(this.f48657j);
        this.f48661n.mo67470a();
        for (int i = 0; i < 4; i++) {
            this.f48656i[i].mo67476a();
        }
        this.f48659l.mo67467a();
        this.f48660m.mo67467a();
        this.f48658k.mo67476a();
        this.f48649b.mo67482b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo67462a(int i) {
        if (i < 0) {
            return false;
        }
        if (this.f48662o != i) {
            this.f48662o = i;
            int max = Math.max(i, 1);
            this.f48663p = max;
            this.f48648a.mo67455a(Math.max(max, 4096));
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo67465a(byte[] bArr) {
        if (bArr.length < 5) {
            return false;
        }
        int i = bArr[0] & 255;
        int i2 = i % 9;
        int i3 = i / 9;
        int i4 = i3 % 5;
        int i5 = i3 / 5;
        int i6 = 0;
        int i7 = 0;
        while (i6 < 4) {
            int i8 = i6 + 1;
            i7 += (bArr[i8] & 255) << (i6 * 8);
            i6 = i8;
        }
        if (!mo67463a(i2, i4, i5)) {
            return false;
        }
        return mo67462a(i7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo67463a(int i, int i2, int i3) {
        if (i > 8 || i2 > 4 || i3 > 4) {
            return false;
        }
        this.f48661n.mo67471a(i2, i);
        int i4 = 1 << i3;
        this.f48659l.mo67468a(i4);
        this.f48660m.mo67468a(i4);
        this.f48664q = i4 - 1;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0115, code lost:
        r17.f48648a.mo67460b();
        r17.f48648a.mo67453a();
        r17.f48649b.mo67480a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0124, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67464a(java.io.InputStream r18, java.io.OutputStream r19, long r20) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.p839a.p841b.C19918b.mo67464a(java.io.InputStream, java.io.OutputStream, long):boolean");
    }
}
