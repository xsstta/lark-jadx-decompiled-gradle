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
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractC11840f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.t */
public class C10085t implements AbstractC10034i {

    /* renamed from: a */
    protected Context f27259a;

    /* renamed from: b */
    LinearLayout f27260b;

    /* renamed from: c */
    protected C10037k f27261c;

    /* renamed from: d */
    protected AbstractC10034i.AbstractC10035a f27262d;

    /* renamed from: e */
    protected FolderPermSetInfo f27263e;

    /* renamed from: f */
    protected int f27264f;

    /* renamed from: g */
    private C10917c f27265g;

    /* renamed from: h */
    private View f27266h;

    /* renamed from: i */
    private UDNotice f27267i;

    /* renamed from: j */
    private boolean f27268j;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f27262d = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m41978b();
        mo38429a();
    }

    /* renamed from: b */
    private void m41978b() {
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
        this.f27268j = z;
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
    public void mo38429a() {
        ((BaseTitleBar) this.f27266h.findViewById(R.id.share_link_title)).setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10085t.C100861 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                PermissionAnalyticV2.m39694o();
                if (C10085t.this.f27259a instanceof Activity) {
                    ((Activity) C10085t.this.f27259a).finish();
                }
            }
        });
        this.f27267i = (UDNotice) this.f27266h.findViewById(R.id.banner);
        this.f27260b = (LinearLayout) this.f27266h.findViewById(R.id.share_link_share_root);
        RecyclerView recyclerView = (RecyclerView) this.f27266h.findViewById(R.id.share_link_share_list);
        C13479a.m54764b("LinkShareSettingView", "adminCanCross: " + this.f27263e.mo38875k() + ", externalAccess: " + this.f27263e.mo38876l());
        C10077q qVar = new C10077q(this.f27259a, this.f27263e.mo38877m(), this.f27268j, this.f27263e.mo38875k(), this.f27263e.mo38884t(), this.f27263e.mo38883s());
        C10037k kVar = new C10037k(this.f27259a, qVar.mo38335a());
        this.f27261c = kVar;
        kVar.mo33373b(this.f27264f);
        this.f27261c.mo70668a((BaseQuickAdapter.AbstractC20911a) new AbstractC11840f() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10085t.C100872 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractC11840f
            /* renamed from: a */
            public void mo38328a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                if (C10085t.this.f27262d != null) {
                    C10085t.this.f27262d.mo38345a((LinkShareItem) C10085t.this.f27261c.mo70685d(i), C10085t.this.f27264f);
                }
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f27259a));
        recyclerView.setAdapter(this.f27261c);
        mo38332a(qVar.mo38336b());
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC10034i.AbstractC10035a aVar) {
        this.f27262d = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i
    /* renamed from: a */
    public void mo38334a(C10037k.AbstractC10038a aVar) {
        C10037k kVar = this.f27261c;
        if (kVar != null) {
            kVar.mo38353a(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10034i
    /* renamed from: a */
    public void mo38332a(int i) {
        this.f27264f = i;
        this.f27261c.mo33373b(i);
        this.f27261c.notifyDataSetChanged();
    }

    C10085t(Context context, C10917c cVar, View view, FolderPermSetInfo folderPermSetInfo) {
        this.f27259a = context;
        this.f27265g = cVar;
        this.f27266h = view;
        this.f27263e = folderPermSetInfo;
    }
}
