package com.ss.android.lark.member_manage.impl.select_ding_member;

import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.localtime.LocalTimeModel;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.a */
public class C45156a implements IFuncBinder<C45047e, C45084c> {
    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159325a() {
        return 2;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public /* synthetic */ void mo159328a(C45084c cVar, IFuncBinder.AbstractC45038a aVar) {
        IFuncBinder.CC.$default$a(this, cVar, aVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: b */
    public boolean mo159332b() {
        return false;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        C45085e g = cVar.mo159512g();
        if (g == null) {
            return false;
        }
        return !g.mo159538l();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        return cVar.mo159514i();
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        mo159691b(eVar, cVar);
        m179221c(eVar, cVar);
    }

    /* renamed from: b */
    public void mo159691b(C45047e eVar, C45084c cVar) {
        eVar.f114059a.setVisibility(0);
        if (!mo159331a(cVar)) {
            eVar.f114059a.mo184665a(new CheckBoxModel(false, false));
        } else {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), true));
        }
    }

    /* renamed from: c */
    private void m179221c(C45047e eVar, C45084c cVar) {
        if (cVar.mo159512g() != null && cVar.mo159512g().mo159539m() != null) {
            eVar.f114059a.mo184666a(new LocalTimeModel(GroupMemberManageModule.m177902a().getSettingDependency().mo143800a(), GroupMemberManageModule.m177902a().getLanguageDependency().mo143801a().booleanValue(), cVar.mo159512g().mo159539m().getTimeZoneId()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159329a(C45084c cVar, IFuncBinder.AbstractC45039b bVar) {
        if (bVar != null) {
            if (cVar.mo159504b()) {
                bVar.mo159334a(cVar);
            } else {
                bVar.mo159335b(cVar);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159330a(C45084c cVar, IFuncBinder.AbstractC45040c cVar2) {
        if (cVar2 != null) {
            cVar2.mo159337a(cVar);
        }
    }
}
