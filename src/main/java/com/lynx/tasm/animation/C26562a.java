package com.lynx.tasm.animation;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.animation.a */
public class C26562a implements Cloneable {

    /* renamed from: a */
    private String f65678a;

    /* renamed from: b */
    private long f65679b;

    /* renamed from: c */
    private long f65680c;

    /* renamed from: d */
    private int f65681d;

    /* renamed from: e */
    private int f65682e;

    /* renamed from: f */
    private float f65683f;

    /* renamed from: g */
    private float f65684g;

    /* renamed from: h */
    private float f65685h;

    /* renamed from: i */
    private float f65686i;

    /* renamed from: j */
    private int f65687j;

    /* renamed from: k */
    private int f65688k;

    /* renamed from: l */
    private int f65689l = -1;

    /* renamed from: m */
    private int f65690m;

    /* renamed from: n */
    private int f65691n = -1;

    /* renamed from: o */
    private int f65692o;

    /* renamed from: o */
    public int mo94401o() {
        return (int) this.f65683f;
    }

    /* renamed from: a */
    public String mo94373a() {
        return this.f65678a;
    }

    /* renamed from: b */
    public long mo94378b() {
        return this.f65679b;
    }

    /* renamed from: c */
    public long mo94382c() {
        return this.f65680c;
    }

    /* renamed from: d */
    public int mo94385d() {
        return this.f65681d;
    }

    /* renamed from: e */
    public int mo94388e() {
        return this.f65682e;
    }

    /* renamed from: f */
    public float mo94390f() {
        return this.f65683f;
    }

    /* renamed from: g */
    public float mo94392g() {
        return this.f65684g;
    }

    /* renamed from: h */
    public float mo94394h() {
        return this.f65685h;
    }

    /* renamed from: i */
    public float mo94395i() {
        return this.f65686i;
    }

    /* renamed from: j */
    public int mo94396j() {
        return this.f65687j;
    }

    /* renamed from: k */
    public int mo94397k() {
        return this.f65688k;
    }

    /* renamed from: l */
    public int mo94398l() {
        return this.f65689l;
    }

    /* renamed from: m */
    public int mo94399m() {
        return this.f65690m;
    }

    /* renamed from: n */
    public int mo94400n() {
        return this.f65691n;
    }

    public C26562a() {
    }

    /* renamed from: a */
    public void mo94374a(float f) {
        this.f65683f = f;
    }

    /* renamed from: b */
    public void mo94379b(float f) {
        this.f65684g = f;
    }

    /* renamed from: c */
    public void mo94383c(float f) {
        this.f65685h = f;
    }

    /* renamed from: d */
    public void mo94386d(float f) {
        this.f65686i = f;
    }

    /* renamed from: e */
    public void mo94389e(int i) {
        this.f65689l = i;
    }

    /* renamed from: f */
    public void mo94391f(int i) {
        this.f65690m = i;
    }

    /* renamed from: g */
    public void mo94393g(int i) {
        this.f65691n = i;
    }

    /* renamed from: a */
    public void mo94375a(int i) {
        this.f65681d = i;
    }

    /* renamed from: b */
    public void mo94380b(int i) {
        this.f65682e = i;
    }

    /* renamed from: c */
    public void mo94384c(int i) {
        this.f65687j = i;
    }

    /* renamed from: d */
    public void mo94387d(int i) {
        this.f65688k = i;
    }

    /* renamed from: a */
    public void mo94376a(long j) {
        this.f65679b = j;
    }

    /* renamed from: b */
    public void mo94381b(long j) {
        this.f65680c = j;
    }

    /* renamed from: a */
    public void mo94377a(String str) {
        this.f65678a = str;
    }

    public C26562a(C26562a aVar) {
        this.f65678a = aVar.f65678a;
        this.f65679b = aVar.f65679b;
        this.f65680c = aVar.f65680c;
        this.f65681d = aVar.f65681d;
        this.f65682e = aVar.f65682e;
        this.f65683f = aVar.f65683f;
        this.f65684g = aVar.f65684g;
        this.f65685h = aVar.f65685h;
        this.f65686i = aVar.f65686i;
        this.f65687j = aVar.f65687j;
        this.f65688k = aVar.f65688k;
        this.f65689l = aVar.f65689l;
        this.f65690m = aVar.f65690m;
        this.f65691n = aVar.f65691n;
        this.f65692o = aVar.f65692o;
    }

    /* renamed from: a */
    public static C26562a m96287a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        if (readableArray.size() != 13) {
            LLog.m96424c();
        }
        C26562a aVar = new C26562a();
        aVar.mo94377a(readableArray.getString(0));
        aVar.mo94376a(readableArray.getLong(1));
        int a = aVar.mo94372a(readableArray, 2);
        int i = a + 1;
        aVar.mo94381b(readableArray.getLong(a));
        int i2 = i + 1;
        aVar.mo94387d(readableArray.getInt(i) - 1);
        int i3 = i2 + 1;
        aVar.mo94391f(readableArray.getInt(i2));
        aVar.mo94389e(readableArray.getInt(i3));
        aVar.mo94393g(readableArray.getInt(i3 + 1));
        return aVar;
    }

    /* renamed from: a */
    public int mo94372a(ReadableArray readableArray, int i) {
        if (readableArray == null || readableArray.size() < 6) {
            mo94380b(0);
            mo94384c(0);
            mo94374a(BitmapDescriptorFactory.HUE_RED);
            mo94379b(BitmapDescriptorFactory.HUE_RED);
            mo94383c(BitmapDescriptorFactory.HUE_RED);
            mo94386d(BitmapDescriptorFactory.HUE_RED);
            return i;
        }
        mo94380b(readableArray.getInt(i));
        mo94384c(readableArray.getInt(i + 1));
        mo94374a((float) readableArray.getDouble(i + 2));
        mo94379b((float) readableArray.getDouble(i + 3));
        mo94383c((float) readableArray.getDouble(i + 4));
        mo94386d((float) readableArray.getDouble(i + 5));
        return i + 6;
    }
}
