package com.bytedance.ee.bear.list;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineDialogCallback;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public class DocumentUtils$1 extends BinderIManualOfflineCallback.Stub {
    final /* synthetic */ Activity val$activity;

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
    public void onDownloadStatusChange() {
    }

    DocumentUtils$1(Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5110c
    public void onShowConfirmDownloadDialog(Document document, long j, BinderIManualOfflineDialogCallback binderIManualOfflineDialogCallback) {
        if (!C13726a.m55676b(this.val$activity)) {
            C13479a.m54758a("DocumentUtils", "onManualOfflineDoc(), activity isFinishing()");
            return;
        }
        String string = this.val$activity.getString(R.string.Doc_Facade_OfflineDisconnectWIFI);
        new BearUDDialogBuilder(this.val$activity).mo45353a(string).mo45357b(C10539a.m43639a(this.val$activity, R.string.Doc_Facade_OfflineMaxFileTips, "size", C13675f.m55508b(j))).mo45360c(8388611).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_OfflineWIFIDownload, new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.$$Lambda$DocumentUtils$1$LXXMV_ocB0M0wcd65tRfnjPPjw */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                DocumentUtils$1.lambda$onShowConfirmDownloadDialog$0(BinderIManualOfflineDialogCallback.this, this.f$1, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_OfflineProcess, new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.$$Lambda$DocumentUtils$1$L9xJhFhC6bsdpGmMYNqZSMw3Zmo */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                DocumentUtils$1.lambda$onShowConfirmDownloadDialog$1(BinderIManualOfflineDialogCallback.this, this.f$1, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary2, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
    }
}
