package com.ss.android.lark.member_manage.impl.pick_member;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.base.adapter.C45047e;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;

/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.b */
public class C45147b implements IFuncBinder<C45047e, C45084c> {

    /* renamed from: a */
    Chat f114303a;

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

    public C45147b(Chat chat) {
        this.f114303a = chat;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public boolean mo159331a(C45084c cVar) {
        if (cVar.mo159508d() || cVar.mo159511f()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public int mo159326a(C45084c cVar, int i) {
        if (cVar.mo159508d()) {
            return -1;
        }
        return cVar.mo159514i() * 'd';
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

    /* renamed from: b */
    public void mo159664b(C45047e eVar, C45084c cVar) {
        if (cVar.mo159508d() || cVar.mo159511f()) {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), false, false));
        } else {
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b()));
        }
    }

    /* renamed from: a */
    public void mo159327a(C45047e eVar, C45084c cVar) {
        mo159664b(eVar, cVar);
        if (this.f114303a == null || (!cVar.mo159508d() && !cVar.mo159511f() && cVar.mo159512g().mo159529e() != Chatter.ChatterType.BOT)) {
            eVar.itemView.setEnabled(true);
            eVar.f114059a.mo184665a(new CheckBoxModel(cVar.mo159504b(), true, true));
            return;
        }
        eVar.itemView.setEnabled(false);
        eVar.f114059a.mo184665a(new CheckBoxModel(false, false, false));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder
    /* renamed from: a */
    public void mo159330a(C45084c cVar, IFuncBinder.AbstractC45040c cVar2) {
        if (cVar2 != null) {
            cVar2.mo159337a(cVar);
        }
    }
}
