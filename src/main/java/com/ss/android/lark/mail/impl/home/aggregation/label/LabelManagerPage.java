package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLabelResponse;
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

public class LabelManagerPage extends BaseManagePage {

    /* renamed from: f */
    C42430a f108009f = new C42430a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    /* renamed from: a */
    public void mo152578a() {
        super.mo152578a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    public AbstractC42401a getModel() {
        return this.f108009f;
    }

    public LabelManagerPage(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo152641b(MailLabelEntity mailLabelEntity) {
        C42699a.m170264b(getContext(), mailLabelEntity.mo151527k());
    }

    /* renamed from: a */
    public String mo152640a(MailLabelEntity mailLabelEntity) {
        return getContext().getResources().getString(R.string.Mail_CustomLabels_Remove_Label_Confirmation_Empty).replace("{{name}}", mailLabelEntity.mo151528l());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseManagePage
    /* renamed from: a */
    public void mo152580a(UDButton uDButton) {
        if (uDButton != null) {
            uDButton.setText(R.string.Mail_Label_CreateNewLabel);
            uDButton.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelManagerPage.View$OnClickListenerC424271 */

                public void onClick(View view) {
                    if (LabelManagerPage.this.getContext() != null) {
                        C42699a.m170262b(LabelManagerPage.this.getContext(), 0);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo152642c(final MailLabelEntity mailLabelEntity) {
        final C42295n nVar;
        mo152582a(true);
        C42187a.m168548k();
        if (getContext() == null) {
            nVar = null;
        } else {
            nVar = (C42295n) C42344d.m169091a(C42295n.class, getContext());
        }
        if (nVar != null) {
            nVar.mo152418b(null, "delete", "label");
        }
        C42176e.m168344a().mo152253f(mailLabelEntity.mo151527k(), new IGetDataCallback<MailDeleteLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelManagerPage.C424282 */

            /* renamed from: a */
            public void onSuccess(MailDeleteLabelResponse mailDeleteLabelResponse) {
                C42295n nVar = nVar;
                if (nVar != null) {
                    nVar.mo152372a("success", 0);
                }
                Log.m165389i("LabelManagerPage", "onDeleteLabel onSuccess");
                LabelManagerPage.this.mo152582a(false);
                MailToast.m173704a(C43819s.m173684a((int) R.string.Mail_CustomLabels_Delete_Label_Notification).replace("{{name}}", mailLabelEntity.mo151528l()), MailToast.Type.SUCCESS);
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
                Log.m165389i("LabelManagerPage", "onDeleteLabel onError");
                LabelManagerPage.this.mo152582a(false);
                MailToast.m173698a((int) R.string.Mail_Label_DeleteFailed, MailToast.Type.FAIL);
                C42209j.m168612a("label_delete_custom_fail", "toast");
            }
        });
    }

    public LabelManagerPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LabelManagerPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
