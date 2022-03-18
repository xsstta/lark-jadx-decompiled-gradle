package com.ss.android.lark.create.groupchat.impl.type;

import android.content.Context;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.type.AbstractC36413d;
import com.ss.android.lark.create.groupchat.impl.type.C36410c;

/* renamed from: com.ss.android.lark.create.groupchat.impl.type.b */
public class C36409b extends BasePresenter<BaseModel, AbstractC36413d.AbstractC36414a, AbstractC36413d.AbstractC36414a.AbstractC36415a> {

    /* renamed from: a */
    C36410c f93942a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC36413d.AbstractC36414a.AbstractC36415a createViewDelegate() {
        return null;
    }

    /* renamed from: b */
    public boolean mo134263b() {
        C36410c cVar = this.f93942a;
        if (cVar != null) {
            return cVar.mo134265a();
        }
        return false;
    }

    public C36409b(Context context, C36410c.AbstractC36412a aVar, GroupCreateInfo groupCreateInfo) {
        this.f93942a = new C36410c(context, groupCreateInfo, aVar);
        BaseModel baseModel = new BaseModel();
        setView(this.f93942a);
        setModel(baseModel);
        this.f93942a.setViewDelegate(createViewDelegate());
    }
}
