package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.loader.model.DriveException;

public interface IProcessor {
    /* renamed from: a */
    Result mo27686a();

    /* renamed from: b */
    void mo27687b();

    public static final class Result {

        /* renamed from: a */
        private final DriveException f19071a;

        /* renamed from: b */
        private final Type f19072b;

        public enum Type {
            SUCCESS,
            FAIL_AND_CONTINUE,
            FAIL_AND_INTERRUPT
        }

        /* renamed from: b */
        public Type mo27694b() {
            return this.f19072b;
        }

        /* renamed from: c */
        public DriveException mo27695c() {
            return this.f19071a;
        }

        /* renamed from: a */
        public static Result m28190a() {
            return new Result(Type.SUCCESS, null);
        }

        /* renamed from: a */
        public static Result m28191a(DriveException driveException) {
            return new Result(Type.FAIL_AND_CONTINUE, driveException);
        }

        /* renamed from: b */
        public static Result m28192b(DriveException driveException) {
            return new Result(Type.FAIL_AND_INTERRUPT, driveException);
        }

        private Result(Type type, DriveException driveException) {
            this.f19072b = type;
            this.f19071a = driveException;
        }
    }
}
