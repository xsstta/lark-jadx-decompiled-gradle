package com.bytedance.ee.bear.list.list;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.ToCUtil;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.p426d.C8258b;
import com.bytedance.ee.bear.list.p426d.C8263g;
import com.bytedance.ee.bear.list.preload.C8666b;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.list.e */
public class C8534e extends BaseQuickAdapter<Document, C20923c> implements AbstractC8538g {

    /* renamed from: a */
    private final String f23133a;

    /* renamed from: b */
    protected C10917c f23134b;

    /* renamed from: c */
    protected AccountService.Account f23135c;

    /* renamed from: d */
    public AbstractC8538g.AbstractC8539a f23136d;

    /* renamed from: e */
    protected AbstractC8538g.AbstractC8540b f23137e;

    /* renamed from: f */
    protected boolean f23138f = C5084ad.m20847d().mo20038b().mo20041b();

    /* renamed from: g */
    protected int f23139g;

    /* renamed from: h */
    protected String f23140h;

    /* renamed from: i */
    protected boolean f23141i = C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false);

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33371a(AbstractC8538g.AbstractC8541c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18916a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32801a(Document document) {
        return true;
    }

    /* renamed from: d */
    private boolean m35589d() {
        return this.f23138f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.bytedance.ee.bear.list.list.AbstractC8538g, com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemCount() {
        return mo70678c() + this.f51214t.size();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33368a(AccountService.Account account) {
        this.f23135c = account;
        notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: b */
    public void mo33373b(int i) {
        C13479a.m54764b("GridStyleAdapter", "updateSortStrategy()...strategy = " + i);
        this.f23139g = i;
    }

    /* renamed from: b */
    private boolean m35588b(Document document) {
        if (!TextUtils.isEmpty(document.mo32375B()) || m35589d() || ((document.mo32464l() && document.mo32483t() != C8275a.f22377j.mo32555b() && document.mo32483t() != C8275a.f22373f.mo32555b()) || document.mo32483t() == C8275a.f22370c.mo32555b())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33369a(AbstractC8538g.AbstractC8539a aVar) {
        this.f23136d = aVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33370a(AbstractC8538g.AbstractC8540b bVar) {
        this.f23137e = bVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: b */
    public void mo33374b(boolean z) {
        C13479a.m54764b("GridStyleAdapter", "changeNetworkState()...isConnect = " + z);
        this.f23138f = z;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33372a(List<Document> list) {
        this.f51214t = list;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo33367a(int i, Document document) {
        super.mo70664a(i, (Object) document);
    }

    /* access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        return new C8537f(C8666b.m36220a().mo33672a(this.f51211q));
    }

    /* renamed from: a */
    private void m35587a(Document document, ImageView imageView) {
        String str;
        AccountService.Account account = this.f23135c;
        if (account != null) {
            str = account.f14591h;
        } else {
            str = "";
        }
        new C8263g(this.f23134b, this.f51211q, document, str, true, imageView, this.f23141i).mo32361a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        int layoutPosition = cVar.getLayoutPosition() - mo70678c();
        if (cVar instanceof C8537f) {
            mo32798a((C8537f) cVar, document, layoutPosition);
            C10917c cVar2 = this.f23134b;
            boolean z = this.f23138f;
            ListAnalysis.m32511a(cVar2, z, document, "tab_" + this.f23133a);
            return;
        }
        C13479a.m54764b("GridStyleAdapter", "convert()...helper = " + cVar);
    }

    public C8534e(C10917c cVar, String str, String str2) {
        super((int) R.layout.list_grid_item);
        this.f23134b = cVar;
        this.f23133a = str;
        this.f23140h = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32798a(C8537f fVar, final Document document, final int i) {
        boolean z;
        int i2;
        float f;
        fVar.f23148a.setVisibility(0);
        fVar.f23148a.setTag(document);
        fVar.f23148a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.C8534e.C85351 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8534e.this.f23136d != null) {
                    C8534e.this.f23136d.mo33341e(view, i, document, true);
                }
            }
        });
        fVar.f23154g.setTitle(C8292f.m34193g(this.f51211q, document));
        ListTitleView listTitleView = fVar.f23154g;
        if (!document.mo32400P() || NodeType.isShortcut(document.ao()) || !mo32801a(document) || !ToCUtil.f23737a.mo33873a(this.f23135c)) {
            z = false;
        } else {
            z = true;
        }
        listTitleView.setExternalVisible(z);
        fVar.f23155h.setTag(document);
        fVar.f23155h.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.C8534e.C85362 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8534e.this.f23137e != null) {
                    C8534e.this.f23137e.mo32606a(view, i, document, true);
                }
            }
        });
        View view = fVar.f23151d;
        if (!document.mo32456j() || !mo18916a()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (NodeType.isShortcut(document.ao())) {
            fVar.f23153f.setVisibility(0);
        } else {
            fVar.f23153f.setVisibility(8);
            fVar.f23156i.mo32364a();
            fVar.f23156i.setManualOffline(document.mo32409Y());
            fVar.f23156i.setSyncState(document.mo32486u());
            if (document.mo32486u() == 3) {
                if (document.mo32409Y()) {
                    document.mo32436e(7);
                } else {
                    document.mo32436e(0);
                }
            }
        }
        m35587a(document, fVar.f23152e);
        new C8258b(this.f51211q, this.f23134b, document, fVar.getItemId(), this.f23138f).mo32358a().mo32357a(fVar.f23149b, fVar.f23150c);
        ViewGroup viewGroup = fVar.f23148a;
        if (m35588b(document)) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        viewGroup.setAlpha(f);
    }
}
