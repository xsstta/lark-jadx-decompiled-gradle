package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.list.sort.C8787o;
import com.bytedance.ee.bear.service.C10917c;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.share.i */
public class C8734i extends AbstractC8509a {
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: d */
    public String mo33271d() {
        return "shared_file";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: e */
    public String mo33272e() {
        return "shared";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: f */
    public String mo33273f() {
        return "sharetome";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        if (this.f23026h == null || !this.f23026h.mo20041b()) {
            Toast.showFailureText(this.f23020b, this.f23020b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_token", mo33271d());
        bundle.putParcelable("key_sort_strategy", this.f23027i);
        C8140a.m32491a(this.f23019a.getActivity(), C8787o.class, bundle);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        if (this.f23026h == null || !this.f23026h.mo20041b()) {
            Toast.showFailureText(this.f23020b, this.f23020b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_module", "shared");
        bundle.putString("key_sub_module", mo33273f());
        bundle.putString("key_token", "shared_file");
        bundle.putBoolean("key_sort_filter_enable", false);
        bundle.putParcelable("key_sort_strategy", this.f23027i);
        C8140a.m32491a(this.f23019a.getActivity(), C8777j.class, bundle);
        ListAnalysis.m32523a("ccm_space_shared_page_click", "shared", mo33273f(), "filter", "ccm_space_header_filter_view", "", "", C8275a.f22369b.mo32555b(), "", "", false, false, false, 0, null, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33268a(FolderSortStrategy folderSortStrategy) {
        super.mo33268a(folderSortStrategy);
        this.f23021c.mo33136a(m36711a(folderSortStrategy.mo31549b()));
        this.f23022d.mo33136a(m36711a(folderSortStrategy.mo31549b()));
    }

    /* renamed from: a */
    private String m36711a(int i) {
        if (i == ShareFileSort.CREATE_TIME.getRank()) {
            return this.f23020b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        }
        if (i == ShareFileSort.SHARE_TIME.getRank()) {
            return this.f23020b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Shared);
        }
        return this.f23020b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a, com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        super.mo30965b(z);
        ListAnalysis.m32518a("ccm_space_shared_page_view", "shared", mo33273f(), "", "", C8275a.f22369b.mo32555b(), "", false, false, false, 0, "");
    }

    C8734i(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        super(aVar, context, cVar, appBarLayout);
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33267a(C7667e eVar, Context context, C10917c cVar, View view) {
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a) {
            this.f23024f = new an(context, view, cVar);
            this.f23023e = new am(eVar, context, new al(cVar), this.f23024f, cVar);
            this.f23023e.create();
            return;
        }
        view.findViewById(R.id.header_banner_view).setVisibility(8);
    }
}
