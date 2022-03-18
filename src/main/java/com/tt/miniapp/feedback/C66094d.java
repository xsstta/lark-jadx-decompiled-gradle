package com.tt.miniapp.feedback;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapp.feedback.screenrecord.C66167d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.feedback.d */
public class C66094d {

    /* renamed from: a */
    public static final String f166834a = (C66100e.f166842a + "logging.flag");

    /* renamed from: b */
    public List<AbstractC66158g> f166835b = new ArrayList();

    /* renamed from: c */
    private IAppContext f166836c;

    /* renamed from: d */
    public void mo231261d() {
        C66100e.m258867a(this.f166836c).mo231265a();
    }

    /* renamed from: e */
    public void mo231262e() {
        C66167d.m259090a(this.f166836c).mo231479a(new FeedbackLogHandler$6(this));
    }

    /* renamed from: f */
    public void mo231263f() {
        C66167d.m259090a(this.f166836c).mo231481b(new FeedbackLogHandler$7(this));
    }

    /* renamed from: g */
    public boolean mo231264g() {
        return m258854a(AppbrandContext.getInst().getApplicationContext());
    }

    /* renamed from: i */
    private void m258857i() {
        m258856h();
        Observable.create(new Action() {
            /* class com.tt.miniapp.feedback.C66094d.C660951 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                File file = new File(C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()), "TT/feedback");
                if (!file.exists()) {
                    file.mkdirs();
                }
                for (AbstractC66158g gVar : C66094d.this.f166835b) {
                    gVar.mo231253a();
                }
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    /* renamed from: b */
    public void mo231259b() {
        Observable.create(new Action() {
            /* class com.tt.miniapp.feedback.C66094d.C660973 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                for (AbstractC66158g gVar : C66094d.this.f166835b) {
                    gVar.mo231254b();
                }
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    /* renamed from: h */
    private void m258856h() {
        this.f166835b.add(new C66088a(this.f166836c));
        this.f166835b.add(new C66092c(this.f166836c));
        this.f166835b.add(new C66159h(this.f166836c));
        this.f166835b.add(new C66090b(this.f166836c));
    }

    /* renamed from: a */
    public void mo231256a() {
        Observable.create(new Action() {
            /* class com.tt.miniapp.feedback.C66094d.C660962 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66094d.this.mo231262e();
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: c */
    public void mo231260c() {
        Observable.create(new Action() {
            /* class com.tt.miniapp.feedback.C66094d.C660984 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                for (AbstractC66158g gVar : C66094d.this.f166835b) {
                    gVar.mo231255c();
                }
                C66094d.this.f166835b.clear();
                C66094d.this.mo231261d();
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
        Observable.create(new Action() {
            /* class com.tt.miniapp.feedback.C66094d.C660995 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66094d.this.mo231263f();
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: b */
    private SharedPreferences m258855b(Context context) {
        return C12899a.m53203a(context, "feedback_config");
    }

    public C66094d(IAppContext iAppContext) {
        this.f166836c = iAppContext;
        m258857i();
    }

    /* renamed from: a */
    public static C66094d m258853a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234296q();
    }

    /* renamed from: a */
    private boolean m258854a(Context context) {
        return m258855b(context).getBoolean("is_open", false);
    }

    /* renamed from: a */
    public void mo231258a(boolean z) {
        if (!z) {
            mo231260c();
            return;
        }
        mo231257a(AppbrandContext.getInst().getApplicationContext(), true);
        if (this.f166835b.size() <= 0) {
            m258857i();
        }
        mo231256a();
    }

    /* renamed from: a */
    public void mo231257a(Context context, boolean z) {
        m258855b(context).edit().putBoolean("is_open", z).apply();
    }
}
