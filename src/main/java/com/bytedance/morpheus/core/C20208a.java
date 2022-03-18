package com.bytedance.morpheus.core;

import android.app.PendingIntent;

/* renamed from: com.bytedance.morpheus.core.a */
public class C20208a {

    /* renamed from: a */
    private String f49352a;

    /* renamed from: b */
    private int f49353b;

    /* renamed from: c */
    private int f49354c;

    /* renamed from: d */
    private long f49355d;

    /* renamed from: e */
    private long f49356e;

    /* renamed from: f */
    private long f49357f;

    /* renamed from: g */
    private int f49358g;

    /* renamed from: h */
    private PendingIntent f49359h;

    /* renamed from: i */
    private Exception f49360i;

    /* renamed from: a */
    public long mo68377a() {
        return this.f49357f;
    }

    /* renamed from: b */
    public String mo68382b() {
        return this.f49352a;
    }

    /* renamed from: c */
    public int mo68385c() {
        return this.f49354c;
    }

    /* renamed from: d */
    public int mo68387d() {
        return this.f49353b;
    }

    /* renamed from: e */
    public long mo68388e() {
        return this.f49355d;
    }

    /* renamed from: f */
    public long mo68389f() {
        return this.f49356e;
    }

    /* renamed from: g */
    public int mo68390g() {
        return this.f49358g;
    }

    /* renamed from: h */
    public PendingIntent mo68391h() {
        return this.f49359h;
    }

    /* renamed from: i */
    public Exception mo68392i() {
        return this.f49360i;
    }

    public String toString() {
        return "MorpheusState{packageName='" + this.f49352a + '\'' + ", versionCode=" + this.f49353b + ", status=" + this.f49354c + ", totalBytesToDownload=" + this.f49355d + ", bytesDownloaded=" + this.f49356e + ", downloadTime=" + this.f49357f + ", errorCode=" + this.f49358g + ", resolutionIntent=" + this.f49359h + ", exception=" + this.f49360i + '}';
    }

    /* renamed from: a */
    public void mo68378a(int i) {
        this.f49354c = i;
    }

    /* renamed from: b */
    public void mo68383b(int i) {
        this.f49353b = i;
    }

    /* renamed from: c */
    public void mo68386c(int i) {
        this.f49358g = i;
    }

    /* renamed from: a */
    public void mo68379a(long j) {
        this.f49355d = j;
    }

    /* renamed from: b */
    public void mo68384b(long j) {
        this.f49356e = j;
    }

    /* renamed from: a */
    public void mo68380a(PendingIntent pendingIntent) {
        this.f49359h = pendingIntent;
    }

    /* renamed from: a */
    public void mo68381a(Exception exc) {
        this.f49360i = exc;
    }

    public C20208a(String str, int i, int i2) {
        this.f49352a = str;
        this.f49353b = i;
        this.f49354c = i2;
    }
}
