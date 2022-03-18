package com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.infra.widget.p2450d.C49266a;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.a.d */
public class C64813d extends AbstractC49023c<C64805a.AbstractC64807b.AbstractC64808a> implements C64805a.AbstractC64807b {

    /* renamed from: c */
    protected final Context f163408c;

    /* renamed from: d */
    protected C64805a.AbstractC64807b.AbstractC64808a f163409d;

    /* renamed from: e */
    private DialogC49246b f163410e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163409d = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        C49266a.m194149b();
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64807b
    /* renamed from: e */
    public void mo223683e() {
        DialogC49246b bVar = this.f163410e;
        if (bVar != null && bVar.isShowing()) {
            this.f163410e.dismiss();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64807b
    /* renamed from: d */
    public void mo223682d() {
        if (this.f163410e == null) {
            DialogC49246b bVar = new DialogC49246b(this.f163408c, true);
            this.f163410e = bVar;
            bVar.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64813d.DialogInterface$OnKeyListenerC648141 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || C64813d.this.f163409d == null) {
                        return false;
                    }
                    C64813d.this.f163409d.mo223686b();
                    return false;
                }
            });
        }
        this.f163410e.show();
    }

    public C64813d(Context context) {
        this.f163408c = context;
    }

    /* renamed from: a */
    public void mo171188a(C64805a.AbstractC64807b.AbstractC64808a aVar) {
        this.f163409d = aVar;
    }
}
