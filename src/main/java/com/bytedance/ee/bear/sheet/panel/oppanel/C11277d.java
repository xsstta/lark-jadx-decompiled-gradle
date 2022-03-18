package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.listener.IHeightChangeListener;
import com.bytedance.ee.bear.fileselector.listener.OnDismissListener;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11274c;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.d */
public class C11277d extends AbstractC11270a {

    /* renamed from: b */
    private C11274c f30319b = new C11274c();

    /* renamed from: c */
    private C6238c f30320c;

    /* renamed from: d */
    private C11271b f30321d;

    /* renamed from: e */
    private View f30322e;

    /* renamed from: f */
    private C11088a f30323f;

    /* renamed from: d */
    private IHeightChangeListener m46858d() {
        return new IHeightChangeListener() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.C11277d.C112781 */
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m46860f() {
        this.f30321d.setActive(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: c */
    public String mo42711c() {
        return SubPanelEnum.insert.name();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo43167a(SheetItem[] sheetItemArr) {
        this.f30319b.mo43219a(sheetItemArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m46859e(String str) {
        return mo42710b().showBadges(str);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.oppanel.AbstractC11270a, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30320c = (C6238c) aj.m5366a(getActivity()).mo6005a(C6238c.class);
        this.f30323f = new C11088a();
        this.f30321d = (C11271b) C4950k.m20474a(this, C11271b.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public boolean mo43168a(String str) {
        boolean z;
        if (!OperationEnum.uploadImage.name().equals(str) || mo43170c(str)) {
            return false;
        }
        FileSelectConfig.C7789d defaultBuilder = this.f30320c.getDefaultBuilder(getActivity());
        if (((DocViewModel) C4950k.m20474a(this, DocViewModel.class)).getOpenSource() != DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        defaultBuilder.mo30472j(z);
        defaultBuilder.mo30461f(true);
        defaultBuilder.mo30466a(m46858d());
        defaultBuilder.mo30468h(this.f30322e.getHeight());
        defaultBuilder.mo30474l(true);
        defaultBuilder.mo30458a(new OnDismissListener() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$d$eXac1xjUFjcDvMgrXsohuaRuQCE */

            @Override // com.bytedance.ee.bear.fileselector.listener.OnDismissListener
            public final void onDismiss() {
                C11277d.this.m46860f();
            }
        });
        this.f30320c.showInsertImageSelectorPanel(getActivity(), defaultBuilder, "SubPanelInsertFragment");
        this.f30321d.setActive(false);
        return true;
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.insert_list);
        C11274c cVar = new C11274c();
        this.f30319b = cVar;
        cVar.mo43218a(new AbstractC11286a.AbstractC11287a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$5Q_JP7MQplABueDZ6_Zv9tUw0c */

            @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a.AbstractC11287a
            public final void clickItem(String str, String str2) {
                C11277d.this.mo43166a(str, str2);
            }
        });
        this.f30319b.mo43217a(new C11274c.AbstractC11276b() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$d$5RCZKU3UzoJo6l4k3e6MnR22Hs */

            @Override // com.bytedance.ee.bear.sheet.panel.oppanel.C11274c.AbstractC11276b
            public final boolean showBadge(String str) {
                return C11277d.this.m46859e(str);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.f30319b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sheet_oppanel_insert_fragment, viewGroup, false);
        this.f30322e = inflate;
        return inflate;
    }
}
