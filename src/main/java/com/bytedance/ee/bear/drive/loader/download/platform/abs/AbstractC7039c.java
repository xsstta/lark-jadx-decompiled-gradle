package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.c */
public interface AbstractC7039c {

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.c$a */
    public interface AbstractC7040a {
        /* renamed from: a */
        AbstractC7043e mo27595a(AbstractC6949c cVar) throws Throwable;

        /* renamed from: a */
        void mo27596a();

        /* renamed from: a */
        void mo27597a(AbstractC7041b bVar);
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.c$b */
    public interface AbstractC7041b {
        void onTransformStart();
    }

    /* renamed from: a */
    AbstractC7040a mo27587a();

    /* renamed from: a */
    AbstractC7043e mo27588a(AbstractC6949c cVar) throws Throwable;

    /* renamed from: a */
    String mo27590a(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority);

    /* renamed from: b */
    String mo27592b(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority);

    /* renamed from: b */
    boolean mo27593b(String str);

    /* renamed from: c */
    String mo27594c(AbstractC6949c cVar, DownloadCallback downloadCallback, DrivePriority.DownloadPriority downloadPriority);
}
