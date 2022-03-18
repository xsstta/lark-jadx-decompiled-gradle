package com.ss.android.lark.location.dto;

import android.location.Location;

public class LarkLocation extends Location {

    /* renamed from: a */
    String f105646a;

    /* renamed from: b */
    String f105647b;

    /* renamed from: c */
    String f105648c;

    /* renamed from: d */
    String f105649d;

    /* renamed from: e */
    String f105650e;

    /* renamed from: f */
    String f105651f;

    /* renamed from: g */
    int f105652g;

    /* renamed from: h */
    boolean f105653h;

    /* renamed from: i */
    boolean f105654i;

    /* renamed from: j */
    int f105655j = -1;

    /* renamed from: k */
    String f105656k;

    /* renamed from: l */
    CoordinateSystem f105657l = CoordinateSystem.WGS;

    public enum CoordinateSystem {
        DEFAULT(0),
        WGS(1),
        GCJ(2);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static CoordinateSystem forNumber(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return WGS;
            }
            if (i != 2) {
                return DEFAULT;
            }
            return GCJ;
        }

        private CoordinateSystem(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public String mo149606a() {
        return this.f105646a;
    }

    /* renamed from: b */
    public String mo149610b() {
        return this.f105647b;
    }

    /* renamed from: c */
    public String mo149612c() {
        return this.f105648c;
    }

    /* renamed from: d */
    public String mo149614d() {
        return this.f105649d;
    }

    /* renamed from: e */
    public String mo149616e() {
        return this.f105650e;
    }

    /* renamed from: f */
    public String mo149618f() {
        return this.f105651f;
    }

    /* renamed from: g */
    public int mo149620g() {
        return this.f105652g;
    }

    /* renamed from: h */
    public int mo149621h() {
        return this.f105655j;
    }

    /* renamed from: i */
    public String mo149622i() {
        return this.f105656k;
    }

    /* renamed from: j */
    public boolean mo149623j() {
        return this.f105653h;
    }

    /* renamed from: k */
    public boolean mo149624k() {
        return this.f105654i;
    }

    /* renamed from: l */
    public CoordinateSystem mo149625l() {
        return this.f105657l;
    }

    /* renamed from: a */
    public void mo149607a(CoordinateSystem coordinateSystem) {
        this.f105657l = coordinateSystem;
    }

    /* renamed from: b */
    public void mo149611b(String str) {
        this.f105647b = str;
    }

    /* renamed from: c */
    public void mo149613c(String str) {
        this.f105648c = str;
    }

    /* renamed from: d */
    public void mo149615d(String str) {
        this.f105649d = str;
    }

    /* renamed from: e */
    public void mo149617e(String str) {
        this.f105650e = str;
    }

    /* renamed from: f */
    public void mo149619f(String str) {
        this.f105651f = str;
    }

    public LarkLocation(Location location) {
        super(location);
    }

    /* renamed from: a */
    public void mo149608a(String str) {
        this.f105646a = str;
    }

    /* renamed from: a */
    public void mo149609a(boolean z) {
        this.f105653h = z;
    }
}
