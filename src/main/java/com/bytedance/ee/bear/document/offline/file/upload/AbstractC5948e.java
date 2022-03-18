package com.bytedance.ee.bear.document.offline.file.upload;

import io.reactivex.AbstractC68307f;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.e */
public interface AbstractC5948e {

    /* renamed from: com.bytedance.ee.bear.document.offline.file.upload.e$a */
    public interface AbstractC5949a {
        /* renamed from: a */
        void mo18062a(float f);

        /* renamed from: a */
        void mo18063a(String str);

        /* renamed from: b */
        void mo18064b(String str);
    }

    /* renamed from: a */
    AbstractC68307f<UploadResult> mo18066a(FileUploadModel fileUploadModel, boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, AbstractC5949a aVar);

    /* renamed from: a */
    AbstractC68307f<UploadResult> mo18067a(String str, AbstractC5949a aVar);
}
