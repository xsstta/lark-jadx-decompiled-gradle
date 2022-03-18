package com.ss.android.videoshop.p3202h;

import android.animation.TimeInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.videoshop.fullscreen.C64164b;
import com.ss.ttvideoengine.Resolution;

/* renamed from: com.ss.android.videoshop.h.a */
public class C64169a {

    /* renamed from: a */
    public static final C64169a f162108a;

    /* renamed from: b */
    private static final C64164b f162109b = new C64164b(true);

    /* renamed from: c */
    private boolean f162110c;

    /* renamed from: d */
    private boolean f162111d;

    /* renamed from: e */
    private int f162112e;

    /* renamed from: f */
    private TimeInterpolator f162113f;

    /* renamed from: g */
    private boolean f162114g;

    /* renamed from: h */
    private int f162115h;

    /* renamed from: i */
    private boolean f162116i;

    /* renamed from: j */
    private boolean f162117j;

    /* renamed from: k */
    private int f162118k;

    /* renamed from: l */
    private int f162119l;

    /* renamed from: m */
    private int f162120m;

    /* renamed from: n */
    private int f162121n;

    /* renamed from: o */
    private Resolution f162122o;

    /* renamed from: p */
    private C64164b f162123p;

    /* renamed from: q */
    private boolean f162124q;

    /* renamed from: c */
    public int mo222307c() {
        return this.f162118k;
    }

    /* renamed from: d */
    public int mo222309d() {
        return this.f162119l;
    }

    /* renamed from: e */
    public boolean mo222310e() {
        return this.f162111d;
    }

    /* renamed from: f */
    public int mo222311f() {
        return this.f162112e;
    }

    /* renamed from: g */
    public TimeInterpolator mo222312g() {
        return this.f162113f;
    }

    /* renamed from: h */
    public int mo222313h() {
        return this.f162115h;
    }

    /* renamed from: i */
    public boolean mo222314i() {
        return this.f162116i;
    }

    /* renamed from: j */
    public boolean mo222315j() {
        return this.f162117j;
    }

    /* renamed from: k */
    public boolean mo222316k() {
        return this.f162114g;
    }

    /* renamed from: l */
    public int mo222317l() {
        return this.f162121n;
    }

    /* renamed from: m */
    public int mo222318m() {
        return this.f162120m;
    }

    /* renamed from: n */
    public Resolution mo222319n() {
        return this.f162122o;
    }

    /* renamed from: o */
    public C64164b mo222320o() {
        return this.f162123p;
    }

    /* renamed from: p */
    public boolean mo222321p() {
        return this.f162124q;
    }

    /* renamed from: com.ss.android.videoshop.h.a$a */
    public static class C64171a {

        /* renamed from: a */
        public boolean f162125a = true;

        /* renamed from: b */
        public int f162126b;

        /* renamed from: c */
        public int f162127c = 1;

        /* renamed from: d */
        public boolean f162128d;

        /* renamed from: e */
        public int f162129e = LocationRequest.PRIORITY_HD_ACCURACY;

        /* renamed from: f */
        public TimeInterpolator f162130f;

        /* renamed from: g */
        public boolean f162131g = true;

        /* renamed from: h */
        public int f162132h = ParticipantRepo.f117150c;

        /* renamed from: i */
        public boolean f162133i;

        /* renamed from: j */
        public boolean f162134j;

        /* renamed from: k */
        public int f162135k = 1;

        /* renamed from: l */
        public int f162136l = 1;

        /* renamed from: m */
        public Resolution f162137m;

        /* renamed from: n */
        public C64164b f162138n;

        /* renamed from: o */
        public boolean f162139o;

        /* renamed from: a */
        public C64169a mo222323a() {
            return new C64169a(this);
        }

        /* renamed from: a */
        public C64171a mo222322a(int i) {
            this.f162132h = i;
            return this;
        }
    }

    private C64169a() {
        this.f162112e = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f162120m = 1;
        this.f162121n = 1;
    }

    /* renamed from: b */
    public boolean mo222306b() {
        return this.f162110c;
    }

    static {
        C64169a aVar = new C64169a();
        f162108a = aVar;
        aVar.f162110c = true;
        aVar.f162118k = 0;
        aVar.f162119l = 1;
        aVar.f162111d = false;
        aVar.f162112e = LocationRequest.PRIORITY_HD_ACCURACY;
        aVar.f162113f = null;
        aVar.f162114g = true;
        aVar.f162115h = ParticipantRepo.f117150c;
        aVar.f162116i = false;
        aVar.f162117j = false;
    }

    /* renamed from: a */
    public static C64169a m252178a() {
        C64169a aVar = new C64169a();
        aVar.f162110c = true;
        aVar.f162118k = 0;
        aVar.f162119l = 1;
        aVar.f162111d = false;
        aVar.f162112e = LocationRequest.PRIORITY_HD_ACCURACY;
        aVar.f162113f = null;
        aVar.f162120m = 1;
        aVar.f162121n = 1;
        aVar.f162114g = true;
        aVar.f162115h = ParticipantRepo.f117150c;
        aVar.f162116i = false;
        aVar.f162117j = false;
        aVar.f162123p = f162109b;
        aVar.f162124q = true;
        return aVar;
    }

    /* renamed from: a */
    public void mo222301a(int i) {
        this.f162118k = i;
    }

    /* renamed from: b */
    public void mo222304b(int i) {
        this.f162119l = i;
    }

    /* renamed from: a */
    public void mo222302a(Resolution resolution) {
        this.f162122o = resolution;
    }

    /* renamed from: b */
    public void mo222305b(boolean z) {
        this.f162117j = z;
    }

    /* renamed from: c */
    public void mo222308c(boolean z) {
        this.f162114g = z;
    }

    /* renamed from: a */
    public void mo222303a(boolean z) {
        this.f162116i = z;
    }

    private C64169a(C64171a aVar) {
        this.f162112e = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f162120m = 1;
        this.f162121n = 1;
        this.f162110c = aVar.f162125a;
        this.f162118k = aVar.f162126b;
        this.f162119l = aVar.f162127c;
        this.f162111d = aVar.f162128d;
        this.f162112e = aVar.f162129e;
        this.f162113f = aVar.f162130f;
        this.f162114g = aVar.f162131g;
        this.f162115h = aVar.f162132h;
        this.f162117j = aVar.f162134j;
        this.f162116i = aVar.f162133i;
        this.f162120m = aVar.f162136l;
        this.f162121n = aVar.f162135k;
        this.f162122o = aVar.f162137m;
        this.f162123p = aVar.f162138n;
        this.f162124q = aVar.f162139o;
    }
}
