package com.ss.android.lark.upgrade.setting.about.p2899a;

import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.biz.core.api.az;
import com.ss.android.lark.upgrade.impl.C57642b;
import com.ss.android.lark.upgrade.setting.about.p2899a.C57670b;

/* renamed from: com.ss.android.lark.upgrade.setting.about.a.c */
public class C57675c extends BaseModel implements C57670b.AbstractC57671a {

    /* renamed from: a */
    public C57670b.AbstractC57671a.AbstractC57672a f142134a;

    /* renamed from: b */
    private az f142135b = new az() {
        /* class com.ss.android.lark.upgrade.setting.about.p2899a.C57675c.C576761 */

        @Override // com.ss.android.lark.biz.core.api.az
        /* renamed from: a */
        public void mo105622a(boolean z) {
        }

        @Override // com.ss.android.lark.biz.core.api.az
        /* renamed from: b */
        public void mo105623b(boolean z) {
            if (C57675c.this.f142134a != null) {
                C57675c.this.f142134a.mo195779a(z);
            }
        }
    };

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57671a
    /* renamed from: b */
    public void mo195778b() {
        C57642b.m223804a().mo195733e();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57671a
    /* renamed from: a */
    public boolean mo195777a() {
        return C57642b.m223804a().mo195732d();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C57642b.m223804a().mo195714a(this.f142135b);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C57642b.m223804a().mo195727b(this.f142135b);
        this.f142134a = null;
        super.destroy();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57670b.AbstractC57671a
    /* renamed from: a */
    public void mo195776a(C57670b.AbstractC57671a.AbstractC57672a aVar) {
        this.f142134a = aVar;
    }
}
