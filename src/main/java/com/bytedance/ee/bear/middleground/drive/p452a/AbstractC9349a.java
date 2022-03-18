package com.bytedance.ee.bear.middleground.drive.p452a;

import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.C9366e;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import io.reactivex.AbstractC68307f;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.drive.a.a */
public interface AbstractC9349a {
    /* renamed from: a */
    int mo35615a(String str);

    /* renamed from: a */
    int mo35616a(String str, UploadCallback uploadCallback);

    /* renamed from: a */
    int mo35617a(String[] strArr);

    /* renamed from: a */
    String mo35618a(DownloadRequestInfo downloadRequestInfo);

    /* renamed from: a */
    String mo35619a(UploadRequestInfo uploadRequestInfo);

    /* renamed from: a */
    String mo35620a(C9361b bVar);

    /* renamed from: a */
    List<DriveFile> mo35621a(String str, String str2);

    /* renamed from: a */
    List<String> mo35622a(List<DownloadRequestInfo> list);

    /* renamed from: a */
    void mo35623a();

    /* renamed from: a */
    void mo35624a(BinderIUploadStateMonitor binderIUploadStateMonitor);

    /* renamed from: a */
    void mo35625a(C9366e eVar);

    /* renamed from: a */
    void mo35626a(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor);

    /* renamed from: a */
    void mo35627a(String str, String str2, String str3, GetDownloadedRangesCallback getDownloadedRangesCallback);

    /* renamed from: a */
    void mo35628a(boolean z);

    /* renamed from: a */
    byte[] mo35629a(byte[] bArr, String str, String str2);

    /* renamed from: b */
    int mo35630b(String[] strArr);

    /* renamed from: b */
    AbstractC68307f<Integer> mo35631b(boolean z);

    /* renamed from: b */
    String mo35632b(DownloadRequestInfo downloadRequestInfo);

    /* renamed from: b */
    void mo35633b();

    /* renamed from: b */
    void mo35634b(C9366e eVar);

    /* renamed from: b */
    void mo35635b(String str, String str2);

    /* renamed from: c */
    int mo35636c(String[] strArr);

    /* renamed from: c */
    boolean mo35637c();

    /* renamed from: d */
    void mo35638d();

    /* renamed from: e */
    void mo35639e();

    /* renamed from: f */
    AbstractC68307f<Integer> mo35640f();

    /* renamed from: g */
    void mo35641g();

    /* renamed from: h */
    int mo35642h();

    /* renamed from: i */
    int mo35643i();

    /* renamed from: j */
    NetworkLevel mo35644j();
}
