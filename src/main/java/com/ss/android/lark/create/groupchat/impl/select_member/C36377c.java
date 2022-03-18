package com.ss.android.lark.create.groupchat.impl.select_member;

import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.inside.C36336b;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.c */
public class C36377c extends BaseModel implements AbstractC36395h.AbstractC36396a {

    /* renamed from: a */
    private GroupCreateInfo f93855a;

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36396a
    /* renamed from: b */
    public GroupCreateInfo mo134178b() {
        return this.f93855a;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36395h.AbstractC36396a
    /* renamed from: a */
    public List<C36391e> mo134177a() {
        ArrayList arrayList = new ArrayList();
        C36376b bVar = new C36376b(C36336b.class.getName(), R.string.Lark_Legacy_CommonGroupTip);
        bVar.f93854a = this.f93855a;
        arrayList.add(bVar);
        return arrayList;
    }

    public C36377c(GroupCreateInfo groupCreateInfo) {
        this.f93855a = groupCreateInfo;
    }
}
