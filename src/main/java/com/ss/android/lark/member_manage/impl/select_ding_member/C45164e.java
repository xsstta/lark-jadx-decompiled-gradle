package com.ss.android.lark.member_manage.impl.select_ding_member;

import com.larksuite.suite.R;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.e */
public class C45164e extends AbstractC45074b {

    /* renamed from: c */
    AbstractC45166g.AbstractC45169b f114349c;

    /* renamed from: d */
    AbstractC45166g.AbstractC45167a f114350d;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public void mo159456c(C45084c cVar) {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: f */
    public void mo159461f() {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: e */
    public void mo159460e() {
        AbstractC45166g.AbstractC45167a.C45168a j = this.f114350d.mo159694j();
        if (j != null) {
            this.f114349c.mo159697a(j.f114352a, j.f114353b);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public void mo159458d(C45084c cVar) {
        C45085e g = cVar.mo159512g();
        if (g != null && g.mo159538l()) {
            this.f114349c.mo159410d(UIHelper.getString(R.string.Lark_Notification_DndBuzzUnable));
        }
    }

    public C45164e(AbstractC45166g.AbstractC45169b bVar, AbstractC45166g.AbstractC45167a aVar) {
        super(bVar, aVar);
        this.f114349c = bVar;
        this.f114350d = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b
    /* renamed from: a */
    public void mo159452a(C45084c cVar, boolean z) {
        C45085e g;
        super.mo159452a(cVar, z);
        if (z && (g = cVar.mo159512g()) != null && this.f114350d.mo159692a(g.mo159537k())) {
            this.f114349c.mo159410d(UIHelper.getString(R.string.Lark_Notification_DndBuzzTips));
        }
    }
}
