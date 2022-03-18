package com.ss.android.lark.member_manage.impl.show_member.p2260a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import java.util.Locale;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.a.b */
public class C45188b implements IFuncBinder<C45047e, C45084c> {

    /* renamed from: a */
    private Locale f114384a = GroupMemberManageModule.m177902a().getLanguageSetting();

    /* renamed from: b */
    private Chat f114385b;

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159325a() {
        return 1;
    }

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

    public C45188b(Chat chat) {
        this.f114385b = chat;
    }

    /* renamed from: a */
    private void m179327a(C45047e eVar) {
        eVar.f114059a.mo184665a(new CheckBoxModel(false, false, false));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        if (cVar.mo159508d()) {
            return -1;
        }
        return cVar.mo159514i();
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        m179327a(eVar);
        eVar.itemView.setEnabled(true);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159329a(C45084c cVar, IFuncBinder.AbstractC45039b bVar) {
        if (bVar != null) {
            bVar.mo159336c(cVar);
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
