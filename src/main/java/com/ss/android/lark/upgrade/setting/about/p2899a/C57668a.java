package com.ss.android.lark.upgrade.setting.about.p2899a;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.upgrade.setting.about.AboutLauncher;
import com.ss.android.lark.upgrade.setting.about.p2899a.C57681e;

/* renamed from: com.ss.android.lark.upgrade.setting.about.a.a */
public class C57668a extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Context f142129a;

    /* renamed from: b */
    private C57677d f142130b;

    /* renamed from: c */
    private View f142131c;

    /* renamed from: d */
    private C57681e.AbstractC57683a f142132d = new C57681e.AbstractC57683a() {
        /* class com.ss.android.lark.upgrade.setting.about.p2899a.C57668a.C576691 */

        @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57681e.AbstractC57683a
        /* renamed from: a */
        public void mo195774a() {
            AboutLauncher.f142147a.mo195791a(C57668a.this.f142129a);
        }

        @Override // com.ss.android.lark.upgrade.setting.about.p2899a.C57681e.AbstractC57683a
        /* renamed from: a */
        public void mo195775a(View view) {
            if (DesktopUtil.m144301a(C57668a.this.f142129a)) {
                C57668a.this.mo185301a(view, true);
            }
        }
    };

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public /* synthetic */ void mo132391a() {
        AbstractC54126b.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public /* synthetic */ void aA_() {
        AbstractC54126b.CC.$default$aA_(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public /* synthetic */ boolean mo132398f() {
        return AbstractC54125a.CC.$default$f(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        return m223903h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        return m223903h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.ABOUT.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
        C57677d dVar = this.f142130b;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public void mo132399g() {
        C57677d dVar = this.f142130b;
        if (dVar != null) {
            dVar.mo195787c();
        }
    }

    /* renamed from: h */
    private View m223903h() {
        if (this.f142131c == null) {
            this.f142131c = this.f142130b.mo195788d();
        }
        return this.f142131c;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
        m223904i();
        this.f142130b.mo195786b();
    }

    /* renamed from: i */
    private void m223904i() {
        C57677d dVar = new C57677d(new C57675c(), new C57681e(this.f142129a, this.f142132d));
        this.f142130b = dVar;
        dVar.create();
    }

    public C57668a(Context context) {
        this.f142129a = context;
    }
}
