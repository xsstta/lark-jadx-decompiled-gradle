package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.model.a */
public class C6799a {

    /* renamed from: a */
    private FileSystemObject f18484a;

    /* renamed from: b */
    private boolean f18485b;

    /* renamed from: c */
    private int f18486c;

    /* renamed from: a */
    public FileSystemObject mo26764a() {
        return this.f18484a;
    }

    /* renamed from: b */
    public boolean mo26767b() {
        return this.f18485b;
    }

    /* renamed from: d */
    public int mo26769d() {
        return this.f18486c;
    }

    /* renamed from: c */
    public boolean mo26768c() {
        return this.f18484a instanceof Directory;
    }

    public C6799a(FileSystemObject fileSystemObject) {
        this.f18484a = fileSystemObject;
    }

    /* renamed from: a */
    public void mo26765a(int i) {
        this.f18486c = i;
    }

    /* renamed from: a */
    public void mo26766a(boolean z) {
        this.f18485b = z;
    }
}
