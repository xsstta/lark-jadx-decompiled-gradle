package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractC11840f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.c */
public class C10025c implements AbstractC10034i {

    /* renamed from: a */
    protected Context f27101a;

    /* renamed from: b */
    LinearLayout f27102b;

    /* renamed from: c */
    protected C10037k f27103c;

    /* renamed from: d */
    protected AbstractC10034i.AbstractC10035a f27104d;

    /* renamed from: e */
    protected DocPermSetInfo f27105e;

    /* renamed from: f */
    protected int f27106f;

    /* renamed from: g */
    private View f27107g;

    /* renamed from: h */
    private UDNotice f27108h;

    /* renamed from: i */
    private boolean f27109i;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f27104d = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m41720b();
        mo38331a();
    }

    /* renamed from: b */
    private void m41720b() {
        boolean z;
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        boolean b = ToCUtil.f26828a.mo37760b(f);
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22259a();
        boolean z2 = false;
        if (b || a) {
            z = true;
        } else {
            z = false;
        }
        this.f27109i = z;
        StringBuilder sb = new StringBuilder();
        sb.append("account == null: ");
        if (f == null) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", isConsumer = ");
        sb.append(b);
        sb.append(", canRemoveOrg = ");
        sb.append(a);
        C13479a.m54764b("LinkShareSettingView", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38331a() {
        ((BaseTitleBar) this.f27107g.findViewById(R.id.share_link_title)).setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10025c.C100261 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                PermissionAnalyticV2.m39694o();
                if (C10025c.this.f27101a instanceof Activity) {
                    ((Activity) C10025c.this.f27101a).finish();
                }
            }
        });
        this.f27108h = (UDNotice) this.f27107g.findViewById(R.id.banner);
        this.f27102b = (LinearLayout) this.f27107g.findViewById(R.id.share_link_share_root);
        RecyclerView recyclerView = (RecyclerView) this.f27107g.findViewById(R.id.share_link_share_list);
        C10024b bVar = new C10024b(this.f27101a, this.f27105e, this.f27109i);
        C10037k kVar = new C10037k(this.f27101a, bVar.mo38329a());
        this.f27103c = kVar;
        kVar.mo33373b(this.f27106f);
        this.f27103c.mo70668a((BaseQuickAdapter.AbstractC20911a) new AbstractC11840f() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10025c.C100272 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractC11840f
            /* renamed from: a */
            public void mo38328a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                if (C10025c.this.f27104d != null) {
                    C10025c.this.f27104d.mo38345a((LinkShareItem) C10025c.this.f27103c.mo70685d(i), C10025c.this.f27106f);
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f27101a));
        recyclerView.setAdapter(this.f27103c);
        mo38332a(bVar.mo38330b());
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC10034i.AbstractC10035a aVar) {
        this.f27104d = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i
    /* renamed from: a */
    public void mo38334a(C10037k.AbstractC10038a aVar) {
        C10037k kVar = this.f27103c;
        if (kVar != null) {
            kVar.mo38353a(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i
    /* renamed from: a */
    public void mo38332a(int i) {
        this.f27106f = i;
        this.f27103c.mo33373b(i);
        this.f27103c.notifyDataSetChanged();
    }

    C10025c(Context context, View view, DocPermSetInfo docPermSetInfo) {
        this.f27101a = context;
        this.f27107g = view;
        this.f27105e = docPermSetInfo;
    }
}
