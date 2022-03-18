package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.larksuite.component.ui.dialog.u */
public class C25648u implements ILKUIGlobalDialog {

    /* renamed from: a */
    protected C25639g f62614a;

    /* renamed from: b */
    protected Context f62615b;

    /* renamed from: c */
    protected boolean f62616c;

    /* renamed from: d */
    protected DialogC25637f f62617d;

    @Override // com.larksuite.component.ui.dialog.ILKUIGlobalDialog
    /* renamed from: b */
    public boolean mo89213b() {
        return this.f62616c;
    }

    @Override // com.larksuite.component.ui.dialog.ILKUIGlobalDialog
    /* renamed from: a */
    public void mo89212a() {
        this.f62616c = false;
        DialogC25637f fVar = this.f62617d;
        if (fVar != null) {
            fVar.dismiss();
            this.f62617d = null;
        }
    }

    /* renamed from: b */
    public void mo89296b(Context context) {
        this.f62615b = context;
    }

    public C25648u(C25639g gVar) {
        this.f62614a = gVar;
    }

    /* renamed from: a */
    public void mo89295a(Context context) {
        XLKUIGlobalDialogActivity.m91735a(this);
        Intent intent = new Intent(context, XLKUIGlobalDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
