package com.ss.android.lark.mail.impl.home.aggregation.folder;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lark.pb.email.client.v1.MailDeleteFolderResponse;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42295n;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;

public class FolderManagerPage extends BaseManagePage {

    /* renamed from: f */
    C42419a f107973f = new C42419a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    /* renamed from: a */
    public void mo152578a() {
        super.mo152578a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    public AbstractC42401a getModel() {
        return this.f107973f;
    }

    public FolderManagerPage(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    /* renamed from: a */
    public void mo152579a(Activity activity) {
        super.mo152579a(activity);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    /* renamed from: a */
    public void mo152580a(UDButton uDButton) {
        if (uDButton != null) {
            uDButton.setText(R.string.Mail_Folder_CreateNewFolder);
            uDButton.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.folder.FolderManagerPage.View$OnClickListenerC424151 */

                public void onClick(View view) {
                    if (FolderManagerPage.this.getContext() != null) {
                        C42699a.m170273c(FolderManagerPage.this.getContext(), 0);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo152641b(MailLabelEntity mailLabelEntity) {
        Log.m165389i("FolderManagerPage", "onEditEntity");
        C42187a.m168459C();
        C42699a.m170297p(getContext(), mailLabelEntity.mo151527k());
    }

    /* renamed from: a */
    public String mo152640a(MailLabelEntity mailLabelEntity) {
        int i;
        if (mailLabelEntity != null) {
            i = mailLabelEntity.mo151537u();
        } else {
            i = 1;
        }
        if (i > 1) {
            return C43819s.m173686a(R.string.Mail_Folder_DeleteFolderDesc, "FolderName", mailLabelEntity.mo151528l());
        }
        return C43819s.m173686a(R.string.Mail_Folder_ConfirmDeleteWithoutSubfolders, "FolderName", mailLabelEntity.mo151528l());
    }

    /* renamed from: c */
    public void mo152642c(MailLabelEntity mailLabelEntity) {
        final C42295n nVar;
        Log.m165389i("FolderManagerPage", "onDeleteFolder");
        mo152582a(true);
        C42187a.m168462F();
        if (getContext() == null) {
            nVar = null;
        } else {
            nVar = (C42295n) C42344d.m169091a(C42295n.class, getContext());
        }
        if (nVar != null) {
            nVar.mo152418b(null, "delete", "folder");
        }
        C42176e.m168344a().mo152268q(mailLabelEntity.mo151527k(), new IGetDataCallback<MailDeleteFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.folder.FolderManagerPage.C424162 */

            /* renamed from: a */
            public void onSuccess(MailDeleteFolderResponse mailDeleteFolderResponse) {
                C42295n nVar = nVar;
                if (nVar != null) {
                    nVar.mo152372a("success", 0);
                }
                Log.m165389i("FolderManagerPage", "onDeleteFolder onSuccess");
                FolderManagerPage.this.mo152582a(false);
                MailToast.m173704a(C43819s.m173684a((int) R.string.Mail_Folder_DeletedSuccessfully), MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C42295n nVar = nVar;
                if (nVar != null) {
                    if (errorResult != null) {
                        nVar.mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                    nVar.mo152372a("rust_fail", 0);
                }
                Log.m165389i("FolderManagerPage", "onDeleteFolder onError");
                FolderManagerPage.this.mo152582a(false);
                MailToast.m173698a((int) R.string.Mail_Folder_DeleteFailed, MailToast.Type.FAIL);
                C42209j.m168612a("folder_delete_custom_fail", "toast");
            }
        });
    }

    public FolderManagerPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderManagerPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
