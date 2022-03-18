package com.bytedance.ee.bear.drive.biz.versions.model;

import com.bytedance.ee.bear.drive.biz.versions.model.DriveVersionHistoryRecord;

/* renamed from: com.bytedance.ee.bear.drive.biz.versions.model.a */
public interface AbstractC6848a {

    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.model.a$a */
    public static class C6849a implements AbstractC6848a {
        @Override // com.bytedance.ee.bear.drive.biz.versions.model.AbstractC6848a
        /* renamed from: a */
        public int mo27006a() {
            return 1;
        }
    }

    /* renamed from: a */
    int mo27006a();

    /* renamed from: com.bytedance.ee.bear.drive.biz.versions.model.a$b */
    public static class C6850b implements AbstractC6848a {

        /* renamed from: a */
        private DriveVersionHistoryRecord.RecordBean f18618a;

        @Override // com.bytedance.ee.bear.drive.biz.versions.model.AbstractC6848a
        /* renamed from: a */
        public int mo27006a() {
            return 0;
        }

        /* renamed from: b */
        public DriveVersionHistoryRecord.RecordBean mo27007b() {
            return this.f18618a;
        }

        public C6850b(DriveVersionHistoryRecord.RecordBean recordBean) {
            this.f18618a = recordBean;
        }
    }
}
