package com.ss.lark.android.passport.biz.feature.country;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.widget.p2445c.C49262d;
import com.ss.android.lark.passport.infra.widget.quick_sidebar.C49274a;
import com.ss.android.lark.passport.infra.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.passport.infra.widget.quick_sidebar.p2451a.AbstractC49275a;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView;
import com.ss.lark.android.passport.biz.feature.country.C64747i;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.f */
public class C64737f extends BaseCountrySelectView implements C64747i.AbstractC64749b {

    /* renamed from: h */
    public RecyclerView f163288h;

    /* renamed from: i */
    public RecyclerView f163289i;

    /* renamed from: j */
    public ViewGroup f163290j;

    /* renamed from: k */
    private QuickSideBarView f163291k;

    /* renamed from: l */
    private EditText f163292l;

    /* renamed from: m */
    private C64715b f163293m;

    /* renamed from: n */
    private C64715b f163294n;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m254266j();
    }

    /* renamed from: k */
    private boolean m254267k() {
        String language = this.f163232e.getResources().getConfiguration().locale.getLanguage();
        language.hashCode();
        if (!language.equals("ja")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.feature.country.BaseCountrySelectView
    /* renamed from: f */
    public void mo223559f() {
        this.f163291k = (QuickSideBarView) this.f163234g.findViewById(R.id.quickSideBarView);
        m254264h();
        m254265i();
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: g */
    public void mo223568g() {
        this.f163292l.setText("");
        this.f163289i.setVisibility(8);
        this.f163288h.setVisibility(0);
        this.f163288h.getLayoutManager().scrollToPosition(0);
    }

    /* renamed from: j */
    private void m254266j() {
        this.f163293m.mo223570a(mo223557d());
        this.f163294n.mo223570a(mo223557d());
        this.f163291k.setOnQuickSideBarTouchListener(new AbstractC49275a() {
            /* class com.ss.lark.android.passport.biz.feature.country.C64737f.C647381 */

            @Override // com.ss.android.lark.passport.infra.widget.quick_sidebar.p2451a.AbstractC49275a
            /* renamed from: a */
            public void mo171855a(boolean z) {
            }

            @Override // com.ss.android.lark.passport.infra.widget.quick_sidebar.p2451a.AbstractC49275a
            /* renamed from: a */
            public void mo171854a(String str, int i, float f) {
                if (C49274a.m194167a().containsKey(str)) {
                    ((LinearLayoutManager) C64737f.this.f163288h.getLayoutManager()).scrollToPositionWithOffset(C49274a.m194167a().get(str).intValue(), 0);
                }
            }
        });
        this.f163292l.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.feature.country.C64737f.C647392 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                if (TextUtils.isEmpty(obj)) {
                    C64737f.this.f163289i.setVisibility(8);
                    C64737f.this.f163290j.setVisibility(0);
                    return;
                }
                C64737f.this.f163230c.mo223595a(obj);
            }
        });
        this.f163292l.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.feature.country.C64737f.C647403 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                if (C49203q.m193977c((Activity) C64737f.this.f163232e)) {
                    C49203q.m193973a(C64737f.this.f163232e);
                }
                C64737f.this.f163233f.mo223560a();
                return true;
            }
        });
    }

    /* renamed from: h */
    private void m254264h() {
        this.f163290j = (ViewGroup) this.f163234g.findViewById(R.id.country_display_layout);
        this.f163288h = (RecyclerView) this.f163234g.findViewById(R.id.contactView);
        this.f163288h.setLayoutManager(new LinearLayoutManager(this.f163232e, 1, false));
        C64715b bVar = new C64715b();
        this.f163293m = bVar;
        this.f163288h.setAdapter(bVar);
        if (m254267k()) {
            C49262d dVar = new C49262d(this.f163293m);
            if (this.f163288h.getItemDecorationCount() > 0) {
                this.f163288h.removeItemDecorationAt(0);
            }
            this.f163288h.addItemDecoration(dVar);
        }
    }

    /* renamed from: i */
    private void m254265i() {
        this.f163289i = (RecyclerView) this.f163234g.findViewById(R.id.search_country_result_view);
        this.f163294n = new C64715b();
        this.f163289i.setLayoutManager(new LinearLayoutManager(this.f163232e, 1, false));
        this.f163289i.setAdapter(this.f163294n);
        EditText editText = (EditText) this.f163234g.findViewById(R.id.search_et);
        this.f163292l = editText;
        C49154ag.m193834a(editText, C49154ag.m193828a(this.f163232e, 16.0f), 0, 0, 0);
    }

    /* renamed from: b */
    private void m254263b(List<CountryBean> list) {
        this.f163291k.setLetters(C49274a.m194166a(list));
        this.f163291k.setVisibility(0);
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: a */
    public void mo223567a(List<CountryBean> list) {
        this.f163290j.setVisibility(8);
        this.f163289i.setVisibility(0);
        this.f163294n.mo223569a();
        this.f163294n.mo223571a(list);
        this.f163294n.notifyDataSetChanged();
    }

    @Override // com.ss.lark.android.passport.biz.feature.country.C64747i.AbstractC64749b
    /* renamed from: a */
    public void mo223566a(CountrySelectModel.CountryInfo countryInfo) {
        this.f163293m.mo223569a();
        this.f163293m.mo223571a(countryInfo.getCountryData());
        this.f163293m.mo223572b(countryInfo.getCountryTopData());
        this.f163293m.notifyDataSetChanged();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(countryInfo.getCountryTopData());
        arrayList.addAll(countryInfo.getCountryData());
        if (m254267k()) {
            m254263b(arrayList);
        }
    }

    public C64737f(Context context, BaseCountrySelectView.ViewDependency aVar, ViewGroup viewGroup) {
        super(context, aVar, viewGroup);
    }
}
