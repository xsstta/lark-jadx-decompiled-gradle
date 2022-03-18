package com.ss.android.lark.member_manage.impl.show_member.common_group;

import com.ss.android.lark.member_manage.impl.base.adapter.AbstractC45048g;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.a */
public class C45189a implements IFuncBinder<C45047e, C45084c>, AbstractC45048g {

    /* renamed from: a */
    private boolean f114388a = true;

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public /* synthetic */ void mo159328a(C45084c cVar, IFuncBinder.AbstractC45038a aVar) {
        IFuncBinder.CC.$default$a(this, cVar, aVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: b */
    public boolean mo159332b() {
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159325a() {
        if (this.f114388a) {
            return 1;
        }
        return 2;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.AbstractC45048g
    /* renamed from: a */
    public void mo159359a(boolean z) {
        this.f114388a = z;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        return cVar.mo159514i();
    }

    /* renamed from: b */
    public void mo159744b(C45047e eVar, C45084c cVar) {
        if (this.f114388a) {
            eVar.f114059a.mo184665a(new CheckBoxModel(false, false, false));
        } else {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), true, true));
        }
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        mo159744b(eVar, cVar);
        eVar.itemView.setEnabled(true);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159329a(C45084c cVar, IFuncBinder.AbstractC45039b bVar) {
        if (bVar != null) {
            if (this.f114388a) {
                bVar.mo159336c(cVar);
            } else if (cVar.mo159504b()) {
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
