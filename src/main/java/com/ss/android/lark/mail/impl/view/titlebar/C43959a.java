package com.ss.android.lark.mail.impl.view.titlebar;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.view.titlebar.a */
public class C43959a {

    /* renamed from: a */
    private ActionDialog.C43926b f111544a;

    /* renamed from: b */
    private List<AbsButton> f111545b;

    /* renamed from: a */
    public ActionDialog.C43926b mo156425a() {
        return this.f111544a;
    }

    /* renamed from: b */
    public List<AbsButton> mo156426b() {
        return this.f111545b;
    }

    /* renamed from: c */
    public boolean mo156427c() {
        return CollectionUtils.isEmpty(this.f111545b);
    }

    public C43959a(ActionDialog.C43926b bVar, List<AbsButton> list) {
        this.f111544a = bVar;
        this.f111545b = list;
    }
}
