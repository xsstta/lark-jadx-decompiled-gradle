package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import io.reactivex.AbstractC68307f;

public interface IDownloader {

    public enum TransStatus {
        TRANSFORMING,
        TRANSFORM_COMPLETED,
        TRANSFORM_FAILED
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader$a */
    public static class C7022a<T extends AbstractC6946a> {
        /* renamed from: a */
        public void mo25448a(int i) {
        }

        /* renamed from: a */
        public void mo25449a(AbstractC6949c<T> cVar) {
        }

        /* renamed from: a */
        public void mo27533a(TransStatus transStatus) {
        }

        /* renamed from: a */
        public void mo25450a(DriveException driveException) {
        }

        /* renamed from: a */
        public void mo25451a(String str) {
        }

        /* renamed from: a */
        public void mo25452a(String str, int i) {
        }

        /* renamed from: a */
        public void mo25453a(String str, String str2) {
        }

        /* renamed from: b */
        public void mo25454b(AbstractC6949c<T> cVar) {
        }

        /* renamed from: c */
        public void mo25455c(AbstractC6949c<T> cVar) {
        }
    }

    /* renamed from: a */
    AbstractC68307f<Boolean> mo27578a(AbstractC6949c cVar, C7022a aVar);

    /* renamed from: a */
    void mo27579a(AbstractC6949c cVar);

    /* renamed from: a */
    void mo27580a(AbstractC7013c cVar);

    /* renamed from: b */
    AbstractC68307f<Boolean> mo27581b(AbstractC6949c cVar, C7022a aVar);

    /* renamed from: c */
    AbstractC68307f<Boolean> mo27582c(AbstractC6949c cVar, C7022a aVar);

    /* renamed from: d */
    AbstractC68307f<Boolean> mo27583d(AbstractC6949c cVar, C7022a aVar);
}
