package com.bytedance.ee.bear.sheet.attachment;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.sheet.attachment.AttachmentModelList;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.attachment.c */
public class C11033c extends AbstractC1142af implements AbstractC6214a {
    private final C1174u<Boolean> active;
    private final C1177w<List<AttachmentModelList.AttachmentModel>> attachmentList;
    private AbstractC11034a delegate;
    private int panelHeight;

    /* renamed from: com.bytedance.ee.bear.sheet.attachment.c$a */
    public interface AbstractC11034a {
        void onSelectAttachment(AttachmentModelList.AttachmentModel attachmentModel);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "sheetAttachmentList";
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return true;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public LiveData<Boolean> getActive() {
        return this.active;
    }

    public C1177w<List<AttachmentModelList.AttachmentModel>> getAttachmentList() {
        return this.attachmentList;
    }

    public void closeAttachmentPanel() {
        getAttachmentList().mo5929b(new ArrayList());
    }

    public C11033c() {
        C1177w<List<AttachmentModelList.AttachmentModel>> wVar = new C1177w<>();
        this.attachmentList = wVar;
        C1174u<Boolean> uVar = new C1174u<>();
        this.active = uVar;
        uVar.mo6042a(wVar, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.attachment.$$Lambda$c$LsBf__eBTWOx3a2MNIkHF1rzIA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11033c.this.lambda$new$0$c((List) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return this.panelHeight;
    }

    public void notifyPanelHeightChange(int i) {
        this.panelHeight = i;
    }

    public void setDelegate(AbstractC11034a aVar) {
        this.delegate = aVar;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void requestNotFocus(Context context) {
        this.attachmentList.mo5929b(new ArrayList());
    }

    public void selectAttachmentItem(AttachmentModelList.AttachmentModel attachmentModel) {
        AbstractC11034a aVar = this.delegate;
        if (aVar != null) {
            aVar.onSelectAttachment(attachmentModel);
        } else {
            C13479a.m54758a("AttachmentViewModel", "selectAttachment, delegate is null");
        }
    }

    public /* synthetic */ void lambda$new$0$c(List list) {
        boolean z;
        C1174u<Boolean> uVar = this.active;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        uVar.mo5929b(Boolean.valueOf(z));
    }
}
