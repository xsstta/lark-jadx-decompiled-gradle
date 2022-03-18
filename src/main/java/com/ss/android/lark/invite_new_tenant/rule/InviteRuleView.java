package com.ss.android.lark.invite_new_tenant.rule;

import android.content.Context;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.invite_new_tenant.rule.C40620a;
import com.ss.android.lark.invite_new_tenant.rule.p2068a.C40624a;

public class InviteRuleView implements C40620a.AbstractC40622b {

    /* renamed from: a */
    private C40620a.AbstractC40622b.AbstractC40623a f103047a;

    /* renamed from: b */
    private Context f103048b;

    /* renamed from: c */
    private AbstractC40619a f103049c;
    @BindView(4509)
    TextView mRichTextView;

    /* renamed from: com.ss.android.lark.invite_new_tenant.rule.InviteRuleView$a */
    public interface AbstractC40619a {
        /* renamed from: a */
        void mo146751a(InviteRuleView inviteRuleView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f103049c.mo146751a(this);
        this.mRichTextView.setTextSize(16.0f);
    }

    /* renamed from: a */
    public void setViewDelegate(C40620a.AbstractC40622b.AbstractC40623a aVar) {
        this.f103047a = aVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.rule.C40620a.AbstractC40622b
    /* renamed from: a */
    public void mo146754a(String str) {
        LKUIToast.show(this.f103048b, str);
    }

    @Override // com.ss.android.lark.invite_new_tenant.rule.C40620a.AbstractC40622b
    /* renamed from: a */
    public void mo146753a(C40624a aVar) {
        this.mRichTextView.setText(aVar.mo146756a());
    }

    public InviteRuleView(Context context, AbstractC40619a aVar) {
        this.f103048b = context;
        this.f103049c = aVar;
    }
}
