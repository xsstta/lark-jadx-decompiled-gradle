package com.bytedance.ee.bear.document.offline.file.upload;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.c */
public class C5945c implements AbstractC5948e {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.file.upload.c$a */
    public static class C5946a implements UploadCallback {
        private final AbstractC5948e.AbstractC5949a callback;
        private final AbstractC68323g<UploadResult> emitter;

        public C5946a(AbstractC5948e.AbstractC5949a aVar, AbstractC68323g<UploadResult> gVar) {
            this.callback = aVar;
            this.emitter = gVar;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
        public boolean onFailed(String str, int i, String str2, long j) {
            UploadResult uploadResult = new UploadResult();
            uploadResult.setCode(i);
            if (!this.emitter.isCancelled()) {
                this.emitter.onNext(uploadResult);
                this.emitter.onComplete();
            }
            AbstractC5948e.AbstractC5949a aVar = this.callback;
            if (aVar != null) {
                aVar.mo18064b(str);
            }
            C13479a.m54758a("DriveFileUploadHelper", "onFailed()... key = " + C13598b.m55197d(str) + ", errorCode = " + i);
            return false;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
        public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
            AbstractC5948e.AbstractC5949a aVar;
            if (status == DriveFile.Status.SUCCESS) {
                UploadResult uploadResult = new UploadResult();
                uploadResult.setFileToken(str2);
                uploadResult.setCode(0);
                if (!this.emitter.isCancelled()) {
                    this.emitter.onNext(uploadResult);
                    this.emitter.onComplete();
                }
                AbstractC5948e.AbstractC5949a aVar2 = this.callback;
                if (aVar2 != null) {
                    aVar2.mo18064b(str);
                }
            }
            if (status != DriveFile.Status.INFLIGHT || (aVar = this.callback) == null) {
                return true;
            }
            aVar.mo18062a((((float) j) * 1.0f) / ((float) j2));
            return true;
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18067a(String str, AbstractC5948e.AbstractC5949a aVar) {
        return AbstractC68307f.m265080a(new AbstractC68324h(str, aVar) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$c$7j9kUvCTbZlC0FnOh9ka2oVFRsI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AbstractC5948e.AbstractC5949a f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C5945c.m23982a(this.f$0, this.f$1, gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23982a(String str, AbstractC5948e.AbstractC5949a aVar, AbstractC68323g gVar) throws Exception {
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35616a(str, new C5946a(aVar, gVar));
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18066a(FileUploadModel fileUploadModel, boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, AbstractC5948e.AbstractC5949a aVar) {
        HashMap hashMap;
        if (map3 != null) {
            hashMap = new HashMap(map3);
        } else {
            hashMap = new HashMap();
        }
        hashMap.put("size_checker", String.valueOf(((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40014a()));
        return AbstractC68307f.m265080a(new AbstractC68324h(z, str, fileUploadModel, hashMap, aVar, map2) {
            /* class com.bytedance.ee.bear.document.offline.file.upload.$$Lambda$c$K625M9ndnSaFZHqPWQJbFMHJywk */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ FileUploadModel f$2;
            public final /* synthetic */ Map f$3;
            public final /* synthetic */ AbstractC5948e.AbstractC5949a f$4;
            public final /* synthetic */ Map f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C5945c.m23983a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, gVar);
            }
        }, BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23983a(boolean z, String str, FileUploadModel fileUploadModel, Map map, AbstractC5948e.AbstractC5949a aVar, Map map2, AbstractC68323g gVar) throws Exception {
        UploadRequestInfo.C9359a aVar2 = new UploadRequestInfo.C9359a();
        if (z) {
            aVar2.mo35742b(str);
        } else {
            aVar2.mo35739a(str);
        }
        UploadRequestInfo.C9359a a = aVar2.mo35744c(C13675f.m55511b(z, str)).mo35745d(fileUploadModel.getMountNodeToken()).mo35746e(fileUploadModel.getMountPoint()).mo35736a(DrivePriority.UploadPriority.USER_INTERACTION).mo35743b(map).mo35737a(new C5946a(aVar, gVar));
        if (fileUploadModel.getContentType().contains("image")) {
            a.mo35740a(map2).mo35738a(UploadRequestInfo.UploadType.IMG);
        }
        String a2 = ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35619a(a.mo35741a());
        if (!TextUtils.equals(a2, "-1") && aVar != null) {
            aVar.mo18063a(a2);
        }
    }
}
