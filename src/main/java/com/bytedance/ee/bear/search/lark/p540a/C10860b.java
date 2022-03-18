package com.bytedance.ee.bear.search.lark.p540a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.search.AbstractC10782a;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.wiki.space.WikiSpaceActivity;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.search.lark.a.b */
public class C10860b extends C10852a implements AbstractC10816c {
    @Override // com.bytedance.ee.bear.search.AbstractC10816c
    /* renamed from: a */
    public Fragment mo40910a() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: s */
    public boolean mo40840s() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.search.lark.a.b$a */
    public static class C10861a extends AbstractC10782a.C10787b {
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

        public C10861a(View view) {
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

    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: r */
    public NetService.C5076e mo40839r() {
        return C10841k.m44951a("wiki");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.lark.p540a.C10852a
    /* renamed from: t */
    public void mo40941t() {
        super.mo40941t();
        mo40993A();
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
    /* renamed from: A */
    public void mo40993A() {
        this.f29106u.f29126j.setVisibility(8);
        this.f29106u.f29125i.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.lark.p540a.C10852a
    /* renamed from: u */
    public void mo40942u() {
        this.f29106u.f29131o.setVisibility(8);
        this.f29106u.f29132p.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b, com.bytedance.ee.bear.search.lark.p540a.C10852a
    /* renamed from: x */
    public void mo40945x() {
        if (getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), WikiSpaceActivity.class), 4);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40814a(View view) {
        this.f28878e = new C10861a(view);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.search.lark.p540a.C10852a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28886m = 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40816a(SearchRecord searchRecord) {
        searchRecord.setFrom("wiki");
        super.mo40816a(searchRecord);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10816c, com.bytedance.ee.bear.search.lark.p540a.C10852a
    /* renamed from: a */
    public void mo40989a(String str) {
        super.mo40989a(str);
    }
}
