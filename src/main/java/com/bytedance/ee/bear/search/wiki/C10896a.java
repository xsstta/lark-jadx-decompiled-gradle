package com.bytedance.ee.bear.search.wiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.AbstractC10782a;
import com.bytedance.ee.bear.search.C10825h;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.report.SearchReport;
import com.bytedance.ee.bear.search.wiki.space.WikiSpaceActivity;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.search.wiki.a */
public class C10896a extends C10825h {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: s */
    public boolean mo40840s() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.search.wiki.a$a */
    public static class C10897a extends AbstractC10782a.C10787b {
        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo40841a() {
            super.mo40841a();
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: c */
        public void mo40844c() {
            super.mo40844c();
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: d */
        public /* bridge */ /* synthetic */ void mo40845d() {
            super.mo40845d();
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: e */
        public /* bridge */ /* synthetic */ void mo40846e() {
            super.mo40846e();
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: j */
        public /* bridge */ /* synthetic */ void mo40851j() {
            super.mo40851j();
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: k */
        public void mo40852k() {
            this.f28927s.setVisibility(8);
            this.f28922n.setVisibility(0);
        }

        public C10897a(View view) {
            super(view);
        }

        @Override // com.bytedance.ee.bear.search.AbstractC10782a.C10787b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo40842a(boolean z) {
            super.mo40842a(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: b */
    public void mo40820b() {
        this.f28878e.mo40842a(true);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        m45315E();
        super.onDestroy();
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: r */
    public NetService.C5076e mo40839r() {
        return C10841k.m44951a("wiki");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.C10825h
    /* renamed from: t */
    public void mo40941t() {
        super.mo40941t();
        mo41437C();
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
    @Override // com.bytedance.ee.bear.search.C10825h
    /* renamed from: v */
    public void mo40943v() {
        m45315E();
        m45314D();
        super.mo40943v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo41437C() {
        this.f29011v.f29035k.setVisibility(8);
        this.f29011v.f29034j.setVisibility(8);
    }

    /* renamed from: D */
    private void m45314D() {
        if (this.f28887n != null && this.f29010u != null) {
            SearchReport.m44868a(this.f28892s, this.f28893t, "wiki", "search_request", "none", this.f29010u.length(), this.f29010u, this.f28887n.mo40974b(), this.f28887n.mo40975c());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.C10825h
    /* renamed from: u */
    public void mo40942u() {
        this.f29011v.f29040p.setVisibility(8);
        this.f29011v.f29041q.setVisibility(8);
        this.f29011v.mo40949a(R.drawable.wiki_search_left_icon);
        this.f29011v.mo40952b(R.string.Doc_Facade_Wiki);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b, com.bytedance.ee.bear.search.C10825h
    /* renamed from: x */
    public void mo40945x() {
        if (getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), WikiSpaceActivity.class), 4);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
        }
    }

    /* renamed from: E */
    private void m45315E() {
        boolean z;
        if (this.f28887n != null && this.f29013x != null && this.f28874a != null && this.f28874a.f28965c >= 0) {
            String str = this.f28892s;
            int i = this.f28893t;
            this.f28893t = i + 1;
            int length = this.f29013x.length();
            String str2 = this.f29013x;
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
    public void mo40814a(View view) {
        this.f28878e = new C10897a(view);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.C10825h, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28886m = 1;
        SearchReport.m44871a(this.f28892s, "wiki");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40816a(SearchRecord searchRecord) {
        searchRecord.setFrom("wiki");
        super.mo40816a(searchRecord);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.C10825h, com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        m45317d(document, i);
        super.mo40815a(document, i);
    }

    /* renamed from: b */
    public static C10825h m45316b(String str, String str2) {
        C10896a aVar = new C10896a();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_SEARCH_KEYWORD", str);
        bundle.putString("KEY_SEARCH_SOURCE", str2);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* renamed from: d */
    private void m45317d(Document document, int i) {
        if (this.f28887n != null && this.f29010u != null) {
            SearchReport.m44869a(this.f28892s, this.f28893t, "wiki", "result_click", "ccm_docs_page_view", this.f29010u.length(), this.f29010u, this.f28887n.mo40974b(), this.f28887n.mo40975c(), document.mo32472o(), C8275a.m34050a(document.mo32483t()), Integer.valueOf(i));
        }
    }
}
