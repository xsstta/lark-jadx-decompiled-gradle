package com.ss.android.lark.platform.batterymonitor;

public final class ConditionState {

    /* renamed from: a */
    private int f128594a;

    /* renamed from: b */
    private int f128595b;

    /* renamed from: c */
    private int f128596c;

    /* renamed from: d */
    private int f128597d;

    public @interface AppState {
    }

    public @interface ChargeState {
    }

    public @interface NetworkState {
    }

    public @interface ScreenState {
    }

    /* renamed from: a */
    public int mo177800a() {
        return this.f128594a;
    }

    /* renamed from: b */
    public int mo177801b() {
        return this.f128595b;
    }

    /* renamed from: c */
    public int mo177802c() {
        return this.f128596c;
    }

    /* renamed from: d */
    public int mo177803d() {
        return this.f128597d;
    }

    /* renamed from: com.ss.android.lark.platform.batterymonitor.ConditionState$a */
    public static class C51717a {

        /* renamed from: a */
        public int f128598a = 4;

        /* renamed from: b */
        public int f128599b;

        /* renamed from: c */
        public int f128600c = 1;

        /* renamed from: d */
        public int f128601d;

        /* renamed from: a */
        public ConditionState mo177808a() {
            return new ConditionState(this);
        }

        /* renamed from: a */
        public C51717a mo177807a(int i) {
            this.f128598a = i;
            return this;
        }

        /* renamed from: b */
        public C51717a mo177809b(int i) {
            this.f128599b = i;
            return this;
        }

        /* renamed from: c */
        public C51717a mo177810c(int i) {
            this.f128600c = i;
            return this;
        }

        /* renamed from: d */
        public C51717a mo177811d(int i) {
            this.f128601d = i;
            return this;
        }
    }

    /* renamed from: e */
    public boolean mo177804e() {
        if (this.f128594a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo177805f() {
        if (this.f128596c == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[appState= " + this.f128594a + ", chargeState= " + this.f128596c + ", networkState= " + this.f128597d + ", screenState= " + this.f128595b + "]";
    }

    private ConditionState(C51717a aVar) {
        this.f128594a = aVar.f128598a;
        this.f128595b = aVar.f128599b;
        this.f128596c = aVar.f128600c;
        this.f128597d = aVar.f128601d;
    }
}
