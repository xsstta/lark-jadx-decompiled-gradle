package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.feedback.C66094d;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.C67556a;

/* renamed from: com.tt.miniapp.titlemenu.item.h */
public class C66942h extends C66937e {

    /* renamed from: a */
    private C66899a f168843a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "record_problem";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168843a;
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: c */
    public void mo232939c() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        this.f168843a.setIcon(m261008a(applicationContext));
        this.f168843a.setLabel(m261009b(applicationContext));
        super.mo232939c();
    }

    /* renamed from: f */
    public boolean mo232965f() {
        if (C66094d.m258853a(this.f168835d) == null || !C66094d.m258853a(this.f168835d).mo231264g()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Drawable m261008a(Context context) {
        if (mo232965f()) {
            return context.getDrawable(2131234578);
        }
        return context.getDrawable(2131234590);
    }

    /* renamed from: b */
    private String m261009b(Context context) {
        if (mo232965f()) {
            return context.getString(R.string.microapp_m_endandupload);
        }
        return context.getString(R.string.microapp_m_record_problem);
    }

    public C66942h(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        boolean z;
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168843a = aVar;
        aVar.setIcon(m261008a(activity));
        this.f168843a.setLabel(m261009b(activity));
        this.f168843a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66942h.View$OnClickListenerC669431 */

            public void onClick(View view) {
                if (C66094d.m258853a(iAppContext) != null) {
                    if (C66942h.this.mo232965f()) {
                        C66913e.m260951a("mp_record_issues_finish_click", iAppContext);
                    } else {
                        C66913e.m260951a("mp_record_issues_start_click", iAppContext);
                    }
                    C66094d.m258853a(iAppContext).mo231258a(!C66942h.this.mo232965f());
                }
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
        if (!AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().isLocalTest() || !C67556a.m262941a("uploadFeedback")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f168843a.setVisibility(0);
        } else {
            this.f168843a.setVisibility(8);
        }
    }
}
