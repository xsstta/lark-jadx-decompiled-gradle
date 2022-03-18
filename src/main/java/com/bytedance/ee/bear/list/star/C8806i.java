package com.bytedance.ee.bear.list.star;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.service.C10917c;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.star.i */
public class C8806i extends AbstractC8509a {
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: d */
    public String mo33271d() {
        return "star";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: e */
    public String mo33272e() {
        return "favorites";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: f */
    public String mo33273f() {
        return "none";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        if (this.f23026h == null || !this.f23026h.mo20041b()) {
            Toast.showFailureText(this.f23020b, this.f23020b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_module", "favorites");
        bundle.putString("key_token", "star");
        bundle.putBoolean("key_sort_filter_enable", false);
        bundle.putParcelable("key_sort_strategy", this.f23027i);
        C8140a.m32491a(this.f23019a.getActivity(), C8777j.class, bundle);
        ListAnalysis.m32523a("ccm_space_favorites_page_click", mo33273f(), "", "filter", "ccm_space_header_filter_view", "", "", C8275a.f22369b.mo32555b(), "", "", false, false, false, 0, null, "");
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a, com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        super.mo30965b(z);
        ListAnalysis.m32518a("ccm_space_favorites_page_click", mo33273f(), "", "", "", C8275a.f22369b.mo32555b(), "", false, false, false, 0, "");
    }

    C8806i(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        super(aVar, context, cVar, appBarLayout);
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33267a(C7667e eVar, Context context, C10917c cVar, View view) {
        view.setVisibility(8);
    }
}
