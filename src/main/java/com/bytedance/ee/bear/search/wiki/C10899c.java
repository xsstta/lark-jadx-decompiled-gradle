package com.bytedance.ee.bear.search.wiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.C10845l;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.report.SearchReport;
import com.bytedance.ee.bear.search.wiki.space.WikiSpaceActivity;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.search.wiki.c */
public class C10899c extends C10845l {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: b */
    public void mo40820b() {
        this.f28878e.mo40842a(true);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        m45341z();
        super.onDestroy();
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: r */
    public NetService.C5076e mo40839r() {
        return C10841k.m44951a("wiki");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: q */
    public NetService.C5076e mo40838q() {
        NetService.C5076e q = super.mo40838q();
        q.mo20145a("from", "wiki");
        return q;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.C10845l
    /* renamed from: u */
    public void mo40942u() {
        m45341z();
        m45340y();
        super.mo40942u();
    }

    /* renamed from: y */
    private void m45340y() {
        if (this.f28887n != null && this.f28887n.f29061a != null) {
            SearchReport.m44868a(this.f28892s, this.f28893t, "wiki", "search_request", "none", this.f28887n.f29061a.length(), this.f28887n.f29061a, this.f28887n.mo40974b(), this.f28887n.mo40975c());
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b, com.bytedance.ee.bear.search.C10845l
    /* renamed from: x */
    public void mo40945x() {
        if (getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), WikiSpaceActivity.class), 4);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
        }
    }

    /* renamed from: z */
    private void m45341z() {
        boolean z;
        if (this.f28887n != null && this.f29087y != null && this.f28874a != null && this.f28874a.f28965c >= 0) {
            String str = this.f28892s;
            int i = this.f28893t;
            this.f28893t = i + 1;
            int length = this.f29087y.length();
            String str2 = this.f29087y;
            boolean b = this.f28887n.mo40974b();
            String c = this.f28887n.mo40975c();
            if (this.f28874a.getItemCount() != 0) {
                z = true;
            } else {
                z = false;
            }
            SearchReport.m44867a(str, i, "wiki", length, str2, b, c, z, this.f28874a.mo40895a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40816a(SearchRecord searchRecord) {
        searchRecord.setFrom("wiki");
        super.mo40816a(searchRecord);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28886m = 1;
        SearchReport.m44871a(this.f28892s, "wiki");
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.C10845l, com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        m45339d(document, i);
        super.mo40815a(document, i);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.C10845l, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f29083u.mo40986c(R.drawable.wiki_search_left_icon);
        this.f29083u.mo40987d(R.string.Doc_Facade_Wiki);
    }

    /* renamed from: d */
    private void m45339d(Document document, int i) {
        if (this.f28887n != null && this.f28887n.f29061a != null) {
            SearchReport.m44869a(this.f28892s, this.f28893t, "wiki", "result_click", "ccm_docs_page_view", this.f28887n.f29061a.length(), this.f28887n.f29061a, this.f28887n.mo40974b(), this.f28887n.mo40975c(), document.mo32472o(), C8275a.m34050a(document.mo32483t()), Integer.valueOf(i));
        }
    }
}
