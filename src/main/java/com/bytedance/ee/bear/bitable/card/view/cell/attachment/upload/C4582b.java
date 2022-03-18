package com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload;

import com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e;
import com.bytedance.ee.bear.document.offline.file.upload.FileUploadModel;
import com.bytedance.ee.bear.document.offline.file.upload.UploadResult;
import io.reactivex.AbstractC68307f;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.b */
public class C4582b implements AbstractC5948e {
    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18067a(String str, AbstractC5948e.AbstractC5949a aVar) {
        return AbstractC68307f.m265097b();
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18066a(FileUploadModel fileUploadModel, boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, AbstractC5948e.AbstractC5949a aVar) {
        if (aVar != null) {
            aVar.mo18063a("");
            aVar.mo18062a(100.0f);
            aVar.mo18064b("");
        }
        UploadResult uploadResult = new UploadResult();
        uploadResult.setCode(0);
        uploadResult.setMessage("pending upload");
        return AbstractC68307f.m265083a(uploadResult);
    }
}
