package com.bytedance.ee.bear.document.offline.file.upload;

import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p704g.C13665a;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.d */
public class C5947d implements AbstractC5948e.AbstractC5949a {

    /* renamed from: a */
    private C5937c f16668a;

    /* renamed from: b */
    private FileUploadModel f16669b;

    /* renamed from: c */
    private List<String> f16670c;

    /* renamed from: a */
    private boolean m23986a() {
        return !this.f16669b.getContentType().contains("image");
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
    /* renamed from: b */
    public void mo18064b(String str) {
        List<String> list;
        if (m23986a() && (list = this.f16670c) != null) {
            list.remove(str);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
    /* renamed from: a */
    public void mo18062a(float f) {
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40259b(C13665a.m55439a(new UploadProgressModel(f, this.f16669b.getUuids()[0])));
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e.AbstractC5949a
    /* renamed from: a */
    public void mo18063a(String str) {
        List<String> list;
        C13479a.m54764b("FileUploadCallbackImpl", "onUploadStart, save uploadKey");
        if (this.f16668a.mo23969h() == null) {
            this.f16668a.mo23970h(str);
            C5955d.m24025b().mo24082b(this.f16668a);
        }
        if (m23986a() && (list = this.f16670c) != null && !list.contains(str)) {
            this.f16670c.add(str);
        }
    }

    public C5947d(C5937c cVar, FileUploadModel fileUploadModel, List<String> list) {
        this.f16668a = cVar;
        this.f16669b = fileUploadModel;
        this.f16670c = list;
    }
}
