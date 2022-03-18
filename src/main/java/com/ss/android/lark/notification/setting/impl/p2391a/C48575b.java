package com.ss.android.lark.notification.setting.impl.p2391a;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.notification.C48405b;
import com.ss.android.lark.notification.setting.impl.p2391a.C48580e;
import com.ss.android.lark.notification.setting.impl.setting.C48601b;
import com.ss.android.lark.setting.C54114b;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;

/* renamed from: com.ss.android.lark.notification.setting.impl.a.b */
public class C48575b extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public final Context f122209a;

    /* renamed from: b */
    private View f122210b;

    /* renamed from: c */
    private C48578d f122211c;

    /* renamed from: d */
    private final C48580e.AbstractC48582a f122212d = new C48580e.AbstractC48582a() {
        /* class com.ss.android.lark.notification.setting.impl.p2391a.C48575b.C485761 */

        @Override // com.ss.android.lark.notification.setting.impl.p2391a.C48580e.AbstractC48582a
        /* renamed from: a */
        public void mo169661a() {
            if (C36512a.m144041a().mo134770b(ContainerType.Right) instanceof C48601b) {
                C48405b.m190967a(C48575b.this.f122209a);
            }
        }

        @Override // com.ss.android.lark.notification.setting.impl.p2391a.C48580e.AbstractC48582a
        /* renamed from: a */
        public void mo169662a(View view) {
            if (DesktopUtil.m144301a(C48575b.this.f122209a)) {
                C48575b.this.mo185301a(view, true);
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
        return m191475h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        return m191475h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.NOTIFICATION.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
        C48578d dVar = this.f122211c;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public void mo132399g() {
        C48578d dVar = this.f122211c;
        if (dVar != null) {
            dVar.mo169665c();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
        m191476i();
        this.f122211c.mo169666d();
    }

    /* renamed from: i */
    private void m191476i() {
        C48580e eVar = new C48580e(this.f122209a, this.f122212d);
        C48578d dVar = new C48578d(this.f122209a, new C48577c(), eVar);
        this.f122211c = dVar;
        dVar.create();
    }

    /* renamed from: h */
    private View m191475h() {
        if (this.f122210b == null) {
            View b = this.f122211c.mo169664b();
            this.f122210b = b;
            b.setMinimumHeight(UIUtils.dp2px(this.f122209a, (float) C54114b.f133989d));
            int dp2px = UIUtils.dp2px(this.f122209a, 16.0f);
            this.f122210b.setPadding(dp2px, 0, dp2px, 0);
        }
        return this.f122210b;
    }

    public C48575b(Context context) {
        this.f122209a = context;
        m191476i();
    }
}
