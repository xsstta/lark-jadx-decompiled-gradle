package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45082a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;

/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.a */
public class C45088a implements IFuncBinder<C45047e, C45084c> {
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
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        if (cVar instanceof C45082a) {
            return ((C45082a) cVar).mo159491a();
        }
        return new C45082a(cVar).mo159491a();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        if (cVar.mo159508d()) {
            return -1;
        }
        return cVar.mo159514i() * 'd';
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        mo159551b(eVar, cVar);
    }

    /* renamed from: b */
    public void mo159551b(C45047e eVar, C45084c cVar) {
        if (cVar instanceof C45082a) {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), ((C45082a) cVar).mo159491a()));
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
