package com.ss.android.lark.littleapp.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkbrand.p653g.AbstractC13062a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.service.p2132a.C41437d;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.ss.android.lark.littleapp.view.d */
public class C41468d implements AbstractC44552i, AbstractC44552i.AbstractC44556d {

    /* renamed from: a */
    public Context f105421a;

    /* renamed from: b */
    public TabAppInfo f105422b;

    /* renamed from: c */
    public GadgetMainTabView f105423c;

    /* renamed from: d */
    public AbstractC13062a f105424d;

    /* renamed from: e */
    private ITitleController f105425e;

    /* renamed from: f */
    private int f105426f;

    /* renamed from: g */
    private GadgetNavigationTabView f105427g;

    /* renamed from: h */
    private ITitleInfo f105428h;

    /* renamed from: i */
    private final C41460a f105429i;

    /* renamed from: j */
    private AbstractC44552i.AbstractC44553a f105430j = new AbstractC44552i.AbstractC44553a() {
        /* class com.ss.android.lark.littleapp.view.C41468d.C414691 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            if (C41468d.this.f105422b != null) {
                boolean equals = TextUtils.equals(C41468d.this.f105422b.getKey(), str);
                boolean equals2 = TextUtils.equals(C41468d.this.f105422b.getKey(), str2);
                if (equals && !equals2) {
                    if (C41468d.this.f105423c != null) {
                        C41468d.this.f105423c.mo110683b();
                    }
                    if (C41468d.this.f105424d != null) {
                        C41468d.this.f105424d.mo49114a(false);
                    }
                }
                if (!equals && equals2) {
                    if (C41468d.this.f105423c != null) {
                        C41468d.this.f105423c.mo110677a();
                    }
                    if (C41468d.this.f105424d != null) {
                        C41468d.this.f105424d.mo49114a(true);
                    }
                }
            }
        }
    };

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f105426f;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f105430j;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return this.f105422b.getKey();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        this.f105429i.mo149231a();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44556d
    /* renamed from: q */
    public void mo103432q() {
        this.f105429i.mo149238c();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
        C25529d.m91150b();
        C67866g.m264028a(new Runnable() {
            /* class com.ss.android.lark.littleapp.view.C41468d.RunnableC414702 */

            public void run() {
                C41437d.m164411e().mo149199a(C41468d.this.f105421a, 1004, "gadget_tab", IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS);
            }
        }, 5000);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        if (this.f105428h == null) {
            this.f105428h = mo149247a();
        }
        return this.f105428h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ITitleInfo mo149247a() {
        return new C41471e(this.f105421a, this.f105422b);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f105423c == null) {
            GadgetMainTabView a = mo149246a(this.f105422b);
            this.f105423c = a;
            this.f105429i.mo149233a(a);
            this.f105429i.mo149238c();
        }
        return this.f105423c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f105427g == null) {
            GadgetNavigationTabView b = mo149248b(this.f105422b);
            this.f105427g = b;
            this.f105429i.mo149234a(b);
            this.f105429i.mo149238c();
        }
        return this.f105427g;
    }

    /* renamed from: o */
    public int mo149249o() {
        if (C41354g.m163939a().getMainDependency().mo144241a(this.f105422b.getKey()) == TabType.Main) {
            return 1506;
        }
        return 1507;
    }

    /* renamed from: p */
    private void m164529p() {
        TabAppInfo tabAppInfo = this.f105422b;
        if (tabAppInfo == null || tabAppInfo.getExtra() == null) {
            this.f105426f = 1;
            return;
        }
        String appID = this.f105422b.getExtra().getAppID();
        if (TextUtils.isEmpty(appID)) {
            this.f105426f = 1;
        } else if (C25529d.m91148a(appID, "embed")) {
            this.f105426f = 10;
        } else {
            this.f105426f = 1;
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        if (this.f105424d == null) {
            AbstractC13062a a = C41466c.m164526a(this.f105422b.getExtra().getAppID(), mo149249o(), this.f105421a, this.f105422b.getKey());
            this.f105424d = a;
            a.mo49112a(this.f105425e);
        }
        return this.f105424d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GadgetMainTabView mo149246a(TabAppInfo tabAppInfo) {
        GadgetMainTabView gadgetMainTabView = new GadgetMainTabView(this.f105421a);
        gadgetMainTabView.setTabAppInfo(tabAppInfo);
        return gadgetMainTabView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public GadgetNavigationTabView mo149248b(TabAppInfo tabAppInfo) {
        GadgetNavigationTabView gadgetNavigationTabView = new GadgetNavigationTabView(this.f105421a);
        gadgetNavigationTabView.setTabAppInfo(tabAppInfo);
        return gadgetNavigationTabView;
    }

    public C41468d(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        this.f105421a = context;
        this.f105425e = iTitleController;
        this.f105422b = tabAppInfo;
        this.f105429i = C41460a.m164504a(tabAppInfo);
        m164529p();
    }
}
