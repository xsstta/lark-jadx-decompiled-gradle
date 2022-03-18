package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

public interface Request {

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED
    }

    /* renamed from: a */
    void mo28452a();

    /* renamed from: b */
    void mo28453b();
}
