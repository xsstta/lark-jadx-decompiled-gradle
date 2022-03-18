package com.bytedance.ee.bear;

import android.os.Bundle;
import com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.c */
public interface AbstractC4967c {

    /* renamed from: com.bytedance.ee.bear.c$a */
    public interface AbstractC4968a {
        /* renamed from: a */
        void mo19663a(DriveManualCacheStatus driveManualCacheStatus);
    }

    /* renamed from: a */
    AbstractC68307f<Boolean> mo19645a();

    /* renamed from: a */
    AbstractC68307f<Boolean> mo19646a(int i, ArrayList<DriveOfflineDoc> arrayList);

    /* renamed from: a */
    AbstractC68307f<Boolean> mo19647a(long j);

    /* renamed from: a */
    AbstractC68307f<Long> mo19648a(String str, String str2);

    /* renamed from: a */
    String mo19649a(DownloadRequestInfo downloadRequestInfo);

    /* renamed from: a */
    void mo19650a(Bundle bundle);

    /* renamed from: a */
    void mo19651a(ImportFileEntity importFileEntity);

    /* renamed from: a */
    void mo19652a(BinderIUploadStateMonitor binderIUploadStateMonitor);

    /* renamed from: a */
    void mo19653a(String str);

    /* renamed from: a */
    void mo19654a(String str, String str2, Bundle bundle, int i);

    /* renamed from: a */
    void mo19655a(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor);

    /* renamed from: a */
    void mo19656a(String str, String str2, String str3);

    /* renamed from: a */
    void mo19657a(ArrayList<String> arrayList);

    /* renamed from: a */
    void mo19658a(boolean z, String str, AbstractC4968a aVar, Bundle bundle);

    /* renamed from: b */
    String mo19659b(DownloadRequestInfo downloadRequestInfo);

    /* renamed from: b */
    void mo19660b();

    /* renamed from: b */
    void mo19661b(String str);

    /* renamed from: b */
    void mo19662b(String str, String str2, Bundle bundle, int i);
}
