package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9726a;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.larksuite.suite.R;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.e */
public class C9822e extends AbstractC9726a {
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.AbstractC9726a
    /* renamed from: c */
    public AbstractC9753a mo37148c() {
        boolean z;
        AccountService.Account account = this.f26250f;
        Locale locale = this.f26251g;
        boolean q = this.f26248d.mo38844q();
        if ((!this.f26248d.mo38844q() || !this.f26248d.ab()) && !this.f26248d.mo38816Y()) {
            z = false;
        } else {
            z = true;
        }
        C9812b bVar = new C9812b(account, locale, q, z);
        bVar.mo37326a((C9812b.AbstractC9818b) new C9812b.AbstractC9818b() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$e$w2PTBTGlmtMlXCMu0yoKY7BDymM */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9818b
            public final void onEditPermission(int i, UserInfo userInfo) {
                C9822e.this.m40551d(i, userInfo);
            }
        });
        bVar.mo37325a((C9812b.AbstractC9817a) new C9812b.AbstractC9817a() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$e$BNK73THQGPYHPAFrs0tdPXlC8qY */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9817a
            public final void onAvatarClick(int i, UserInfo userInfo) {
                C9822e.this.m40550c(i, userInfo);
            }
        });
        bVar.mo37327a((C9812b.AbstractC9819c) new C9812b.AbstractC9819c() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.$$Lambda$e$HKL6ndVvEWSbNK6hEBR1baNnD4 */

            @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.AbstractC9819c
            public final void onTipsClick(int i, UserInfo userInfo) {
                C9822e.this.m40549b(i, userInfo);
            }
        });
        return bVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m40551d(int i, UserInfo userInfo) {
        if (this.f26249e != null) {
            this.f26249e.mo37190a(i, userInfo);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m40550c(int i, UserInfo userInfo) {
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(userInfo.getId(), this.f26248d.mo38828d());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m40549b(int i, UserInfo userInfo) {
        boolean z;
        int i2;
        if (userInfo.getOwnerType() == 5 || userInfo.getOwnerType() == 11) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = R.string.Doc_Share_FolderMembersExternalContent;
        } else {
            i2 = R.string.Doc_Permission_ExternalSharingTooltip;
        }
        new BearUDDialogBuilder(this.f26245a).mo45362d(i2).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_OfflineKnow, (DialogInterface.OnClickListener) null).mo45361c(false).mo45359b();
    }

    C9822e(Context context, C10917c cVar, C7718l lVar, View view, DocPermSetInfo docPermSetInfo) {
        super(context, cVar, lVar, view, docPermSetInfo);
    }
}
