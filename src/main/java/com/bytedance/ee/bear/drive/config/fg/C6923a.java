package com.bytedance.ee.bear.drive.config.fg;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.config.fg.a */
public class C6923a {

    /* renamed from: a */
    private volatile int f18693a = 10;

    /* renamed from: b */
    private volatile int f18694b = 6;

    /* renamed from: c */
    private volatile int f18695c = 10;

    /* renamed from: d */
    private volatile int f18696d = 5;

    /* renamed from: e */
    private volatile long f18697e = 20971520;

    /* renamed from: f */
    private volatile long f18698f = 819200;

    /* renamed from: g */
    private volatile String f18699g = "mHcowwObyiKEfLXnamrnCnjmGCoxo8dSe7N5TTpQcxE/bivsZEsqoNDxFGfOYMhGzopzZWB+xNhNoJ3otiHAmNkOIkG7yMJZzMh71EHBULE=";

    /* renamed from: h */
    private volatile int f18700h;

    /* renamed from: i */
    private volatile DrivePreviewConfig f18701i;

    /* renamed from: j */
    private volatile boolean f18702j;

    /* renamed from: k */
    private volatile DriveCacheConfig f18703k;

    /* renamed from: a */
    public boolean mo27214a() {
        return false;
    }

    /* renamed from: b */
    public int mo27215b() {
        return this.f18693a;
    }

    /* renamed from: c */
    public int mo27218c() {
        return this.f18694b;
    }

    /* renamed from: d */
    public int mo27220d() {
        return this.f18695c;
    }

    /* renamed from: e */
    public int mo27222e() {
        return this.f18696d;
    }

    /* renamed from: f */
    public long mo27224f() {
        return this.f18697e;
    }

    /* renamed from: g */
    public long mo27225g() {
        return this.f18698f;
    }

    /* renamed from: h */
    public int mo27226h() {
        return this.f18700h;
    }

    /* renamed from: j */
    public boolean mo27228j() {
        return this.f18702j;
    }

    /* renamed from: i */
    public DrivePreviewConfig mo27227i() {
        if (this.f18701i == null) {
            return new DrivePreviewConfig();
        }
        return this.f18701i;
    }

    /* renamed from: k */
    public DriveCacheConfig mo27229k() {
        if (this.f18703k != null) {
            return this.f18703k;
        }
        C13479a.m54775e("DriveConfig", "getDriveCacheConfig() mDriveCacheConfig is null,return empty value.");
        return new DriveCacheConfig();
    }

    public String toString() {
        return "DriveConfig{, mPreloadRecentCount=" + this.f18693a + ", mPreloadStarCount=" + this.f18694b + ", mPreloadPinCount=" + this.f18695c + ", mPreloadFileMaxSize=" + this.f18697e + ", mPdfKey='" + this.f18699g + '\'' + ", mImportFileMaxSize=" + this.f18700h + ", mDrivePreviewConfig=" + this.f18701i + ", mPreloadCacheVideoSize=" + this.f18698f + ", mDriveCacheConfig=" + this.f18703k + '}';
    }

    /* renamed from: a */
    public void mo27209a(int i) {
        this.f18693a = i;
    }

    /* renamed from: a */
    public void mo27210a(long j) {
        this.f18697e = j;
    }

    /* renamed from: b */
    public void mo27216b(int i) {
        this.f18694b = i;
    }

    /* renamed from: c */
    public void mo27219c(int i) {
        this.f18695c = i;
    }

    /* renamed from: d */
    public void mo27221d(int i) {
        this.f18696d = i;
    }

    /* renamed from: e */
    public void mo27223e(int i) {
        this.f18700h = i;
    }

    /* renamed from: a */
    public void mo27211a(DriveCacheConfig driveCacheConfig) {
        this.f18703k = driveCacheConfig;
    }

    /* renamed from: b */
    public void mo27217b(long j) {
        this.f18698f = j;
    }

    /* renamed from: a */
    public void mo27212a(DrivePreviewConfig drivePreviewConfig) {
        this.f18701i = drivePreviewConfig;
    }

    /* renamed from: a */
    public void mo27213a(boolean z) {
        this.f18702j = z;
    }
}
