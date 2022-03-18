package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.e */
public class C9709e extends C9638a {

    /* renamed from: c */
    private boolean f26196c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo37045b(UserInfo userInfo) {
        if (!userInfo.isCan_modify_perm() || userInfo.isOwner() || this.f25879a == null || TextUtils.equals(this.f25879a.f14584a, userInfo.getId())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo37044a(UserInfo userInfo) {
        if (userInfo.getPermission() == 3) {
            return this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_FullAccess_Options);
        }
        if (userInfo.getPermission() == 2) {
            return this.f51211q.getString(R.string.Doc_Share_Editable);
        }
        if (userInfo.getPermission() == 1) {
            return this.f51211q.getString(R.string.Doc_Share_Readable);
        }
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        super.mo16806a(cVar, userInfo);
        if (this.f26196c) {
            m40186c(cVar, userInfo);
        } else {
            m40185b(cVar, userInfo);
        }
    }

    /* renamed from: b */
    private void m40185b(final C20923c cVar, final UserInfo userInfo) {
        m40184a(cVar, false);
        ((ImageView) cVar.mo70740b(R.id.share_collaborator_delete)).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9709e.C97101 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9709e.this.f25880b != null) {
                    C9709e.this.f25880b.mo36860a(userInfo, cVar.getLayoutPosition());
                }
            }
        });
    }

    /* renamed from: a */
    private void m40184a(C20923c cVar, boolean z) {
        ImageView imageView = (ImageView) cVar.mo70740b(R.id.share_collaborator_delete);
        TextView textView = (TextView) cVar.mo70740b(R.id.share_item_permission);
        ImageView imageView2 = (ImageView) cVar.mo70740b(R.id.share_item_permission_icon);
        if (z) {
            imageView.setVisibility(8);
            textView.setVisibility(0);
            imageView2.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView.setVisibility(8);
        imageView2.setVisibility(8);
    }

    /* renamed from: c */
    private void m40186c(final C20923c cVar, final UserInfo userInfo) {
        float f;
        int i;
        m40184a(cVar, true);
        TextView textView = (TextView) cVar.mo70740b(R.id.share_item_permission);
        ImageView imageView = (ImageView) cVar.mo70740b(R.id.share_item_permission_icon);
        textView.setText(mo37044a(userInfo));
        boolean b = mo37045b(userInfo);
        textView.setEnabled(b);
        if (b) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView.setAlpha(f);
        if (b) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        imageView.setEnabled(b);
        C97112 r2 = new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9709e.C97112 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9709e.this.f25880b != null) {
                    C9709e.this.f25880b.mo36860a(userInfo, cVar.getLayoutPosition());
                }
            }
        };
        textView.setOnClickListener(r2);
        imageView.setOnClickListener(r2);
    }

    public C9709e(Locale locale, AccountService.Account account, boolean z) {
        super(locale, account);
        this.f26196c = z;
    }
}
