package com.bytedance.ee.bear.bitable.card.viewmodel.upload;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.BitableAttachmentUploadManager;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.UploadAttachmentEntity;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GetPendingEditHandler implements AbstractC7945d<GetPendingEditData> {

    /* renamed from: a */
    private BitableAttachmentUploadManager f14044a;

    public static class GetPendingEditData implements NonProguard {
        public String baseToken;
        public String recordId;
        public String tableId;
        public String viewId;
    }

    /* renamed from: a */
    public void mo18656a(BitableAttachmentUploadManager aVar) {
        this.f14044a = aVar;
    }

    public static class PendingEditResultBean implements NonProguard {
        public int pendingType;

        public PendingEditResultBean(int i) {
            this.pendingType = i;
        }
    }

    /* renamed from: a */
    public void handle(GetPendingEditData getPendingEditData, AbstractC7947h hVar) {
        BitableAttachmentUploadManager aVar = this.f14044a;
        if (aVar == null || getPendingEditData == null) {
            C13479a.m54758a("GetPendingEditHandler", "handle, attachmentUploadManager or data is null");
            return;
        }
        ArrayList<UploadAttachmentEntity> findUploadingAttachmentList = aVar.findUploadingAttachmentList(getPendingEditData.recordId);
        HashMap hashMap = new HashMap();
        if (findUploadingAttachmentList != null && !findUploadingAttachmentList.isEmpty()) {
            Iterator<UploadAttachmentEntity> it = findUploadingAttachmentList.iterator();
            while (it.hasNext()) {
                UploadAttachmentEntity next = it.next();
                if (hashMap.get(next.getFieldId()) == null) {
                    hashMap.put(next.getFieldId(), new PendingEditResultBean(0));
                }
            }
        }
        hVar.mo17188a(new JSONObject(hashMap));
    }
}
