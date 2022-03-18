package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35598e;
import com.ss.android.lark.contact.impl.contacts_group.join.C35610b;
import com.ss.android.lark.contact.impl.contacts_group.manage.C35627b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.c */
public class C35596c extends BaseModel implements AbstractC35598e.AbstractC35599a {

    /* renamed from: a */
    private AbstractC35602f f92086a;

    public C35596c(AbstractC35602f fVar) {
        this.f92086a = fVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.AbstractC35598e.AbstractC35599a
    /* renamed from: a */
    public List<C29527a> mo131274a(Context context) {
        ArrayList arrayList = new ArrayList();
        C35627b bVar = new C35627b();
        bVar.mo131310a(this.f92086a);
        C35610b bVar2 = new C35610b();
        bVar2.mo131286a(this.f92086a);
        arrayList.add(new C29527a(bVar, UIUtils.getString(context, R.string.Lark_Groups_MyGroups)));
        arrayList.add(new C29527a(bVar2, UIUtils.getString(context, R.string.Lark_Legacy_GroupJoinedGroup)));
        return arrayList;
    }
}
