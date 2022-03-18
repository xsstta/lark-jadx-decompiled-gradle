package com.bytedance.ee.bear.middleground.drive;

import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.C9366e;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9403j;
import com.bytedance.ee.bear.middleground.drive.rustsdk.init.C9399b;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.b */
public class C9350b implements AbstractC9349a {
    C9350b() {
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35623a() {
        C9399b.m38827a();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35628a(boolean z) {
        C9379g.m38738a().mo35804b(z);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35627a(String str, String str2, String str3, GetDownloadedRangesCallback getDownloadedRangesCallback) {
        C9379g.m38738a().mo35796a(str, str2, str3, getDownloadedRangesCallback);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35626a(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
        C9403j.m38871a().mo35860a(str, str2, binderIUploadStateMonitor);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public byte[] mo35629a(byte[] bArr, String str, String str2) {
        return C9379g.m38738a().mo35797a(bArr, str, str2);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public void mo35633b() {
        C9399b.m38827a().mo35851c();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: d */
    public void mo35638d() {
        C9399b.m38827a().mo35852d();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: e */
    public void mo35639e() {
        C9399b.m38827a().mo35853e();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: g */
    public void mo35641g() {
        C9379g.m38738a().mo35802b();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ Integer m38624k() throws Exception {
        return Integer.valueOf(C9379g.m38738a().mo35805c());
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: f */
    public AbstractC68307f<Integer> mo35640f() {
        return AbstractC68307f.m265099b((Callable) $$Lambda$b$tVdOmpy6cF_NI6mPBY8SuCZtPbc.INSTANCE).mo238010b((Object) -1);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: h */
    public int mo35642h() {
        return C9379g.m38738a().mo35809d();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: i */
    public int mo35643i() {
        return C9403j.m38871a().mo35863c();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: j */
    public NetworkLevel mo35644j() {
        return C9379g.m38738a().mo35810f();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: c */
    public boolean mo35637c() {
        return C9399b.m38827a().mo35850b();
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35624a(BinderIUploadStateMonitor binderIUploadStateMonitor) {
        C9403j.m38871a().mo35859a(binderIUploadStateMonitor);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Integer m38623c(boolean z) throws Exception {
        return Integer.valueOf(C9379g.m38738a().mo35806c(z));
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public int mo35615a(String str) {
        return C9379g.m38738a().mo35786a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public int mo35630b(String[] strArr) {
        return C9379g.m38738a().mo35788a(strArr);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public AbstractC68307f<Integer> mo35631b(boolean z) {
        return AbstractC68307f.m265099b((Callable) new Callable(z) {
            /* class com.bytedance.ee.bear.middleground.drive.$$Lambda$b$9blePCjgCaXWP_23ZlTXQaneIvg */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9350b.m38623c(this.f$0);
            }
        }).mo238010b((Object) -1);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: c */
    public int mo35636c(String[] strArr) {
        return C9379g.m38738a().mo35807c(strArr);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public int mo35617a(String[] strArr) {
        return C9379g.m38738a().mo35798b(strArr);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public String mo35632b(DownloadRequestInfo downloadRequestInfo) {
        return C9379g.m38738a().mo35799b(downloadRequestInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public String mo35618a(DownloadRequestInfo downloadRequestInfo) {
        return C9379g.m38738a().mo35789a(downloadRequestInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public void mo35634b(C9366e eVar) {
        C9379g.m38738a().mo35803b(eVar);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public String mo35619a(UploadRequestInfo uploadRequestInfo) {
        return C9379g.m38738a().mo35790a(uploadRequestInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public String mo35620a(C9361b bVar) {
        return C9379g.m38738a().mo35791a(bVar);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public List<String> mo35622a(List<DownloadRequestInfo> list) {
        return C9379g.m38738a().mo35793a(list);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public void mo35625a(C9366e eVar) {
        C9379g.m38738a().mo35795a(eVar);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public int mo35616a(String str, UploadCallback uploadCallback) {
        return C9379g.m38738a().mo35787a(str, uploadCallback);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: b */
    public void mo35635b(String str, String str2) {
        C9379g.m38738a().mo35808c(str, str2);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a
    /* renamed from: a */
    public List<DriveFile> mo35621a(String str, String str2) {
        return C9379g.m38738a().mo35792a(str, str2);
    }
}
