package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import java.util.List;

public class an extends BaseListView<AbstractC8544i.AbstractC8545a> implements AbstractC8320ae {

    /* renamed from: a */
    public final AbstractC8327a f22478a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.folder.an$a */
    public interface AbstractC8327a {
        /* renamed from: a */
        void mo32692a();

        /* renamed from: a */
        void mo32693a(int i, int i2);

        /* renamed from: b */
        void mo32696b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "my_root";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "MyRootFolderView";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "personal";
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m34419e() {
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: c */
    public void mo32244c() {
        super.mo32244c();
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m34418a();
    }

    /* renamed from: a */
    private void m34418a() {
        boolean z;
        if (C4511g.m18594d().mo17344E() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ListAnalysis.m32497a(C5234y.m21391b(), mo32618m());
        } else {
            ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, "home", (String) null);
        }
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8534e(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new al(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f23100l.mo33511a(false, EmptyCategory.f23240d);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$an$bue7QfkK6vI4ilyPar6SqLgOlI */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                an.this.m34419e();
            }
        });
        this.f23100l.mo33508a(new LoadStateView.AbstractC8570b() {
            /* class com.bytedance.ee.bear.list.folder.an.C83261 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: b */
            public void mo32736b() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: c */
            public void mo32737c() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: a */
            public void mo32735a() {
                if (an.this.f22478a != null) {
                    an.this.f22478a.mo32696b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8369l(document, mo32618m(), "", "");
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    public void b_(boolean z) {
        super.b_(z);
        if (z) {
            m34418a();
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
    public void onRefresh(AbstractC27129h hVar) {
        super.onRefresh(hVar);
        AbstractC8327a aVar = this.f22478a;
        if (aVar != null) {
            aVar.mo32692a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        super.mo32733a(folderSortStrategy);
        if (folderSortStrategy.mo31554d() != FilterType.ALL.getType()) {
            this.f23100l.mo33506a(EmptyCategory.f23241e);
        } else {
            this.f23100l.mo33506a(EmptyCategory.f23240d);
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8320ae
    /* renamed from: a */
    public void mo32716a(SmartRefreshLayout smartRefreshLayout) {
        String g = mo32615g();
        C13479a.m54764b(g, "setRefreshLayout()...refreshLayout = " + smartRefreshLayout);
        this.f23099k = smartRefreshLayout;
        mo33352x();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new FolderDetailItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8324ah(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8636b mo32734b(Document document, boolean z) {
        return new aj(this.f23092d, this.f23094f, document, this.f23103o, z, mo32618m());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32732a(int i, boolean z) {
        super.mo32732a(i, z);
        this.f23100l.mo33504a(i + this.f23102n.mo33378c());
    }

    an(Context context, View view, C7718l lVar, C10917c cVar, AbstractC8327a aVar) {
        super(context, view, lVar, cVar);
        this.f22478a = aVar;
    }

    @Override // com.bytedance.ee.bear.widgets.BaseRecyclerView.AbstractC11798a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super.mo32605a(i, i2, iArr, iArr2, i3);
        AbstractC8327a aVar = this.f22478a;
        if (aVar != null) {
            aVar.mo32693a(i, i2);
        }
    }
}
