package com.bytedance.ee.bear.list.list;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.ToCUtil;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.p426d.C8263g;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.list.j */
public class View$OnClickListenerC8546j extends BaseQuickAdapter<Document, C20923c> implements View.OnClickListener, AbstractC8538g {

    /* renamed from: a */
    private AbstractC8538g.AbstractC8541c f23158a;

    /* renamed from: b */
    protected C10917c f23159b;

    /* renamed from: c */
    protected AccountService.Account f23160c;

    /* renamed from: d */
    public AbstractC8538g.AbstractC8539a f23161d;

    /* renamed from: e */
    protected AbstractC8538g.AbstractC8540b f23162e;

    /* renamed from: f */
    protected boolean f23163f = C5084ad.m20847d().mo20038b().mo20041b();

    /* renamed from: g */
    protected int f23164g;

    /* renamed from: h */
    protected String f23165h;

    /* renamed from: i */
    protected boolean f23166i = C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false);

    /* renamed from: j */
    private final DocsLinearLayoutManager f23167j;

    /* renamed from: k */
    private final String f23168k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18916a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32806a(Document document) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo33386d() {
        return true;
    }

    /* renamed from: s */
    private boolean m35663s() {
        return this.f23163f;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33372a(List<Document> list) {
        this.f51214t = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        int layoutPosition = cVar.getLayoutPosition() - mo70678c();
        if (cVar instanceof C8551k) {
            mo32803a((C8551k) cVar, document, layoutPosition);
            C10917c cVar2 = this.f23159b;
            boolean z = this.f23163f;
            ListAnalysis.m32511a(cVar2, z, document, "tab_" + this.f23168k);
            return;
        }
        C13479a.m54764b("ListStyleAdapter", "convert()...helper = " + cVar + ", position = " + layoutPosition);
    }

    /* renamed from: e */
    public void mo33387e() {
        if (SwipeMenuLayout.getViewCache() != null) {
            SwipeMenuLayout.getViewCache().mo30347d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.bytedance.ee.bear.list.list.AbstractC8538g, com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemCount() {
        return mo70678c() + this.f51214t.size();
    }

    public void onClick(View view) {
        mo33387e();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33368a(AccountService.Account account) {
        this.f23160c = account;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    private boolean m35661b(Document document) {
        if (!TextUtils.isEmpty(document.mo32375B()) || m35663s() || document.mo32483t() == C8275a.f22370c.mo32555b() || (document.mo32483t() != C8275a.f22377j.mo32555b() && document.mo32483t() != C8275a.f22373f.mo32555b() && document.mo32464l())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33369a(AbstractC8538g.AbstractC8539a aVar) {
        this.f23161d = aVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33370a(AbstractC8538g.AbstractC8540b bVar) {
        this.f23162e = bVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: b */
    public void mo33373b(int i) {
        C13479a.m54764b("ListStyleAdapter", "updateSortStrategy()...strategy = " + i);
        this.f23164g = i;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: a */
    public void mo33371a(AbstractC8538g.AbstractC8541c cVar) {
        this.f23158a = cVar;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8538g
    /* renamed from: b */
    public void mo33374b(boolean z) {
        C13479a.m54764b("ListStyleAdapter", "changeNetworkState()...isConnect = " + z);
        this.f23163f = z;
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
        return new C8551k(LayoutInflater.from(this.f51211q).inflate(R.layout.list_list_item, viewGroup, false));
    }

    /* renamed from: b */
    private void m35660b(C8551k kVar, Document document) {
        kVar.f23190j.setManualOffline(document.mo32409Y());
        kVar.f23190j.setSyncState(document.mo32486u());
        kVar.mo33389a(document.mo32486u());
        if (document.mo32486u() != 3) {
            return;
        }
        if (document.mo32409Y()) {
            document.mo32436e(7);
        } else {
            document.mo32436e(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33385a(Document document, ImageView imageView) {
        String str;
        AccountService.Account account = this.f23160c;
        if (account != null) {
            str = account.f14591h;
        } else {
            str = "";
        }
        new C8263g(this.f23159b, this.f51211q, document, str, false, imageView, this.f23166i).mo32361a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        kVar.f23184d.setText(C8292f.m34130a(this.f51211q, document));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35658a(Document document, SwipeMenuLayout swipeMenuLayout, boolean z) {
        AbstractC8538g.AbstractC8541c cVar = this.f23158a;
        if (cVar != null) {
            cVar.mo33339d(document, z);
        }
    }

    /* renamed from: b */
    private void m35659b(C8551k kVar, final int i, final Document document) {
        kVar.f23187g.setImageResource(R.drawable.ud_icon_more_outlined);
        C13747j.m55728a(kVar.f23187g, (int) R.color.static_white);
        kVar.f23187g.setTag(document);
        kVar.f23187g.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j.C85482 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (View$OnClickListenerC8546j.this.f23162e != null) {
                    View$OnClickListenerC8546j.this.f23162e.mo32606a(view, i, document, false);
                }
                View$OnClickListenerC8546j.this.mo33387e();
            }
        });
    }

    /* renamed from: c */
    private void m35662c(C8551k kVar, final int i, final Document document) {
        kVar.f23188h.setImageResource(R.drawable.ud_icon_share_label_outlined);
        C13747j.m55728a(kVar.f23188h, (int) R.color.static_white);
        kVar.f23188h.setTag(document);
        kVar.f23188h.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j.C85493 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (View$OnClickListenerC8546j.this.f23162e != null) {
                    View$OnClickListenerC8546j.this.f23162e.mo33338d(view, i, document, false);
                }
                View$OnClickListenerC8546j.this.mo33387e();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32586a(C8551k kVar, final int i, final Document document) {
        kVar.f23189i.setImageResource(R.drawable.ud_icon_delete_trash_outlined);
        C13747j.m55728a(kVar.f23189i, (int) R.color.static_white);
        kVar.f23189i.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j.C85504 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (View$OnClickListenerC8546j.this.f23162e != null) {
                    View$OnClickListenerC8546j.this.f23162e.mo32610b(view, i, document, false);
                }
                View$OnClickListenerC8546j.this.mo33387e();
            }
        });
        kVar.f23189i.setTag(document);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32803a(C8551k kVar, final Document document, final int i) {
        boolean z;
        boolean z2;
        float f;
        kVar.f23181a.mo30349e();
        kVar.f23181a.setLayoutManager(this.f23167j);
        kVar.f23181a.mo30343a(new SwipeMenuLayout.AbstractC7739a(document) {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$j$ICT3mq3bj0a2gx5h4WPLcsN5cck */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.AbstractC7739a
            public final void onMenuStateChanged(SwipeMenuLayout swipeMenuLayout, boolean z) {
                View$OnClickListenerC8546j.this.m35658a((View$OnClickListenerC8546j) this.f$1, (Document) swipeMenuLayout, (SwipeMenuLayout) z);
            }
        });
        kVar.f23182b.setTag(document);
        kVar.f23182b.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j.C85471 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (View$OnClickListenerC8546j.this.f23161d != null) {
                    View$OnClickListenerC8546j.this.f23161d.mo33341e(view, i, document, false);
                }
            }
        });
        kVar.f23183c.setTitle(C8292f.m34193g(this.f51211q, document));
        ListTitleView listTitleView = kVar.f23183c;
        boolean z3 = true;
        if (!document.mo32400P() || NodeType.isShortcut(document.ao()) || !mo32806a(document) || !ToCUtil.f23737a.mo33873a(this.f23160c)) {
            z = false;
        } else {
            z = true;
        }
        listTitleView.setExternalVisible(z);
        ListTitleView listTitleView2 = kVar.f23183c;
        if (!mo18916a() || !FolderVersion.isShareFolderV2(document.an()) || !C4211a.m17514a().mo16536a("spacekit.mobile.single_container_tag_enable", false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        listTitleView2.setSecondVisible(z2);
        ListTitleView listTitleView3 = kVar.f23183c;
        if (!document.mo32456j() || !mo33386d()) {
            z3 = false;
        }
        listTitleView3.setStarVisible(z3);
        if (NodeType.isShortcut(document.ao())) {
            kVar.f23186f.setVisibility(0);
            kVar.f23184d.setText(R.string.CreationMobile_Wiki_Shortcuts_ShortcutLabel_Placeholder);
        } else {
            kVar.f23186f.setVisibility(8);
            mo32727a(kVar, document);
            m35660b(kVar, document);
        }
        mo33385a(document, kVar.f23185e);
        m35659b(kVar, i, document);
        m35662c(kVar, i, document);
        mo32586a(kVar, i, document);
        ConstraintLayout constraintLayout = kVar.f23182b;
        if (m35661b(document)) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        constraintLayout.setAlpha(f);
    }

    public View$OnClickListenerC8546j(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super((int) R.layout.list_list_item);
        this.f23159b = cVar;
        this.f23168k = str;
        this.f23165h = str2;
        this.f23167j = docsLinearLayoutManager;
    }
}
