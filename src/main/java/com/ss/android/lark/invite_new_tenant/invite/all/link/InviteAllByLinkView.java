package com.ss.android.lark.invite_new_tenant.invite.all.link;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class InviteAllByLinkView implements C40550a.AbstractC40552b {

    /* renamed from: a */
    public Context f102965a;

    /* renamed from: b */
    public AbstractC40549a f102966b;

    /* renamed from: c */
    private C40550a.AbstractC40552b.AbstractC40553a f102967c;
    @BindView(4727)
    ImageView mAvatarIv;
    @BindView(4740)
    Button mCopyBtn;
    @BindView(4739)
    TextView mInviteUrlTv;
    @BindView(4728)
    TextView mNameTv;

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.InviteAllByLinkView$a */
    public interface AbstractC40549a {
        /* renamed from: a */
        void mo146670a(InviteAllByLinkView inviteAllByLinkView);

        /* renamed from: a */
        void mo146671a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f102966b.mo146670a(this);
        this.mCopyBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.link.InviteAllByLinkView.C405481 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                String charSequence = InviteAllByLinkView.this.mInviteUrlTv.getText().toString();
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = "";
                }
                InviteAllByLinkView.this.f102966b.mo146671a(charSequence);
                LKUIToast.show(InviteAllByLinkView.this.f102965a, (int) R.string.Lark_Legacy_CopySuccess);
                StatisticsManager.m160654a("invite_tenant_via_link_copy");
            }
        });
        this.mCopyBtn.setEnabled(false);
    }

    /* renamed from: a */
    public void setViewDelegate(C40550a.AbstractC40552b.AbstractC40553a aVar) {
        this.f102967c = aVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a.AbstractC40552b
    /* renamed from: a */
    public void mo146669a(String str) {
        LKUIToast.show(this.f102965a, str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a.AbstractC40552b
    /* renamed from: a */
    public void mo146667a(C40547a aVar) {
        this.mInviteUrlTv.setText(aVar.f102964a);
        this.mCopyBtn.setEnabled(true);
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.link.C40550a.AbstractC40552b
    /* renamed from: a */
    public void mo146666a(C40534a aVar) {
        this.mNameTv.setText(aVar.mo146644c());
        C40531a.m160431a().mo143862e().mo143864a(this.f102965a, aVar.mo146643b(), aVar.mo146642a(), this.mAvatarIv, UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
    }

    public InviteAllByLinkView(Context context, AbstractC40549a aVar) {
        this.f102965a = context;
        this.f102966b = aVar;
    }
}
