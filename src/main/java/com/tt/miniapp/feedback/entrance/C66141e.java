package com.tt.miniapp.feedback.entrance;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.feedback.entrance.AbstractC66114a;
import com.tt.miniapp.feedback.entrance.C66137d;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tt.miniapp.feedback.entrance.e */
public class C66141e extends AbstractC66114a {

    /* renamed from: g */
    public List<FAQItemVO> f166943g;

    /* renamed from: h */
    public boolean f166944h;

    /* renamed from: i */
    public AbstractC66144a f166945i;

    /* renamed from: j */
    public AppType f166946j;

    /* renamed from: k */
    private C66137d f166947k;

    /* renamed from: l */
    private RecyclerView f166948l;

    /* renamed from: com.tt.miniapp.feedback.entrance.e$a */
    public interface AbstractC66144a {
        /* renamed from: a */
        void mo231335a(FAQItemVO fAQItemVO);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: d */
    public int mo231299d() {
        return R.layout.microapp_m_fragment_feedback_faq_list;
    }

    /* renamed from: e */
    private void m258966e() {
        RecyclerView recyclerView = (RecyclerView) this.f166872f.findViewById(R.id.microapp_m_faq_list);
        this.f166948l = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f166868b));
        C66137d dVar = new C66137d(this.f166868b);
        this.f166947k = dVar;
        dVar.mo231342a(new C66137d.AbstractC66139a() {
            /* class com.tt.miniapp.feedback.entrance.C66141e.C661432 */

            @Override // com.tt.miniapp.feedback.entrance.C66137d.AbstractC66139a
            /* renamed from: a */
            public void mo231337a(View view, int i) {
                Fragment fragment;
                Fragment fragment2;
                C66020b.m258531a("mp_feedback_item_click", C66141e.this.f166870d, C67448a.m262353a().mo234181b(C67440a.m262344a(C66141e.this.f166946j, C66141e.this.f166870d.appId))).mo231092a();
                FAQItemVO fAQItemVO = C66141e.this.f166943g.get(i);
                JSONArray c = fAQItemVO.mo231391c();
                if (c == null || c.length() <= 0) {
                    if (C66141e.this.f166944h) {
                        if (C66141e.this.f166867a != null) {
                            C66141e.this.f166867a.mo231286c().popBackStack(C66119b.class.getSimpleName(), 0);
                        }
                        fragment2 = null;
                    } else if (TextUtils.isEmpty(fAQItemVO.mo231392d()) || fAQItemVO.mo231392d().equals("null")) {
                        fragment2 = C66119b.m258917a(fAQItemVO, C66141e.this.f166870d, C66141e.this.f166946j);
                    } else {
                        fragment2 = View$OnClickListenerC66133c.m258949a(fAQItemVO, C66141e.this.f166946j);
                    }
                    if (C66141e.this.f166945i != null) {
                        C66141e.this.f166945i.mo231335a(fAQItemVO);
                    }
                    fragment = fragment2;
                } else {
                    fragment = C66141e.m258963a(c, C66141e.this.f166944h, C66141e.this.f166945i, C66141e.this.f166946j);
                }
                if (fragment != null && C66141e.this.f166867a != null) {
                    C66141e.this.f166867a.mo231280a(C66141e.this, fragment);
                }
            }
        });
        this.f166948l.setAdapter(this.f166947k);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: b */
    public void mo231297b() {
        super.mo231297b();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f166943g = arguments.getParcelableArrayList("key_faq_list");
            this.f166944h = arguments.getBoolean("key_is_select_scene", false);
            this.f166946j = (AppType) arguments.getSerializable("key_app_type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: c */
    public void mo231298c() {
        super.mo231298c();
        m258966e();
        List<FAQItemVO> list = this.f166943g;
        if ((list == null || list.isEmpty()) && this.f166867a != null) {
            this.f166867a.mo231281a(new AbstractC66114a.AbstractC66118b() {
                /* class com.tt.miniapp.feedback.entrance.C66141e.C661421 */

                @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66118b
                /* renamed from: a */
                public void mo231291a(List<FAQItemVO> list) {
                    C66141e.this.f166943g = list;
                    C66141e eVar = C66141e.this;
                    eVar.mo231346a(eVar.f166943g);
                }
            });
        } else {
            mo231346a(this.f166943g);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a
    /* renamed from: a */
    public void mo231296a() {
        super.mo231296a();
        ((TextView) this.f166872f.findViewById(R.id.microapp_m_page_title)).setText(getText(R.string.microapp_m_feedback_faq_list_title));
    }

    /* renamed from: a */
    public void mo231346a(List<FAQItemVO> list) {
        this.f166947k.mo231344a(list);
        this.f166947k.notifyDataSetChanged();
    }

    /* renamed from: a */
    private static List<FAQItemVO> m258965a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(FAQItemVO.m259005a(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C66141e m258964a(boolean z, AbstractC66144a aVar, AppType appType) {
        C66141e eVar = new C66141e();
        eVar.f166945i = aVar;
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_select_scene", z);
        bundle.putSerializable("key_app_type", appType);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* renamed from: a */
    public static C66141e m258963a(JSONArray jSONArray, boolean z, AbstractC66144a aVar, AppType appType) {
        List<FAQItemVO> list;
        C66141e eVar = new C66141e();
        eVar.f166945i = aVar;
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_select_scene", z);
        try {
            list = m258965a(jSONArray);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_FAQListFragment", e);
            list = null;
        }
        bundle.putParcelableArrayList("key_faq_list", (ArrayList) list);
        bundle.putSerializable("key_app_type", appType);
        eVar.setArguments(bundle);
        return eVar;
    }
}
