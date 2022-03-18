package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.d */
public class C9707d extends C9638a {
    /* renamed from: a */
    private String m40179a(UserInfo userInfo) {
        if (DocUserPermission.canEdit(userInfo.getPermission())) {
            return this.f51211q.getString(R.string.Doc_Share_Editable);
        }
        if (DocUserPermission.canRead(userInfo.getPermission())) {
            return this.f51211q.getString(R.string.Doc_Share_Readable);
        }
        if (DocUserPermission.isFullAccess(userInfo.getPermission())) {
            return this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_FullAccess_Options);
        }
        return this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_NoAccess_Options);
    }

    public C9707d(Locale locale, AccountService.Account account) {
        super(locale, account);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        super.mo16806a(cVar, userInfo);
        m40180b(cVar, userInfo);
    }

    /* renamed from: b */
    private void m40180b(final C20923c cVar, final UserInfo userInfo) {
        TextView textView = (TextView) cVar.mo70740b(R.id.share_item_permission);
        textView.setText(m40179a(userInfo));
        C97081 r2 = new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9707d.C97081 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9707d.this.f25880b != null) {
                    C9707d.this.f25880b.mo36860a(userInfo, cVar.getLayoutPosition());
                }
            }
        };
        textView.setOnClickListener(r2);
        ((ImageView) cVar.mo70740b(R.id.share_item_permission_icon)).setOnClickListener(r2);
    }
}
