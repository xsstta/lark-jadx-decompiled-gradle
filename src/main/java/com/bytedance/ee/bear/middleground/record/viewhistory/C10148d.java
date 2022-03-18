package com.bytedance.ee.bear.middleground.record.viewhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.middleground.record.C10115a;
import com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a;
import com.bytedance.ee.bear.middleground.record.viewhistory.C10151e;
import com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.d */
public class C10148d extends C7667e {

    /* renamed from: d */
    static final /* synthetic */ boolean f27411d = true;

    /* renamed from: a */
    public int f27412a;

    /* renamed from: b */
    public String f27413b;

    /* renamed from: c */
    public C10151e f27414c;

    /* renamed from: e */
    private final String f27415e = "ViewHistoryFragment";

    /* renamed from: f */
    private RecyclerView f27416f;

    /* renamed from: g */
    private SmartRefreshLayout f27417g;

    /* renamed from: h */
    private TextView f27418h;

    /* renamed from: i */
    private SpaceEmptyState f27419i;

    /* renamed from: j */
    private C10144a f27420j;

    /* renamed from: k */
    private List<RecordListResult.C10143a> f27421k;

    /* renamed from: l */
    private int f27422l;

    /* renamed from: m */
    private C11824c f27423m;

    /* renamed from: c */
    public void mo38579c() {
        this.f27423m.m49046e();
    }

    /* renamed from: g */
    private void m42215g() {
        C10151e eVar = (C10151e) aj.m5364a(this).mo6005a(C10151e.class);
        this.f27414c = eVar;
        eVar.attach(this.f27413b, this.f27412a);
        this.f27414c.pull();
        this.f27414c.getResultMutableLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.$$Lambda$d$HaPQ813lYNgXzF4FJDsH6O5xHTY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10148d.this.m42212a((C10148d) ((RecordListResult) obj));
            }
        });
        this.f27414c.getmLoadingMoreState().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.$$Lambda$d$yzWd5PIGUDIG7ifE8ZHhFpFjbss */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10148d.this.m42213a((C10148d) ((C10151e.C10153a) obj));
            }
        });
    }

    /* renamed from: a */
    public void mo38577a() {
        this.f27419i.setVisibility(0);
        this.f27419i.setTitle("");
        this.f27419i.setDesc("");
        this.f27419i.setPrimaryText("");
        this.f27419i.setImageRes(null);
    }

    /* renamed from: b */
    public void mo38578b() {
        this.f27423m.mo45303c();
        this.f27419i.setVisibility(0);
        this.f27419i.setTitle(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_empty));
        this.f27419i.setDesc("");
        this.f27419i.setPrimaryText("");
        this.f27419i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
    }

    /* renamed from: f */
    public void mo38582f() {
        this.f27423m.mo45303c();
        this.f27419i.setVisibility(0);
        this.f27419i.setTitle(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_NoPermissionToUse_title));
        this.f27419i.setDesc(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_NoPermissionToUse_desc));
        this.f27419i.setPrimaryText("");
        this.f27419i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_access));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C10151e.C10153a b = this.f27414c.getmLoadingMoreState().mo5927b();
        Objects.requireNonNull(b);
        if (b.f27427a == 9) {
            mo38577a();
            this.f27414c.pull();
        }
    }

    /* renamed from: h */
    private void m42216h() {
        this.f27421k = new ArrayList();
        this.f27417g.mo96415m(f27411d);
        this.f27417g.mo96367b((AbstractC27125d) new LoadMoreFooter(getContext()));
        this.f27416f.setLayoutManager(new LinearLayoutManager(getContext()));
        C10144a aVar = new C10144a(getContext(), this.f27421k);
        this.f27420j = aVar;
        this.f27416f.setAdapter(aVar);
        this.f27417g.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.$$Lambda$d$LgiB1wOtqCSVlkvdZwA2onBcSI */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                C10148d.this.m42214a((C10148d) hVar);
            }
        });
    }

    /* renamed from: d */
    public void mo38580d() {
        this.f27419i.setVisibility(0);
        this.f27423m.mo45303c();
        this.f27419i.setTitle(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_FailedToLoad_title));
        this.f27419i.setDesc(C10539a.m43639a(getContext(), R.string.CreationMobile_Stats_Visits_FailedToLoad_desc1, "reload", C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_FailedToLoad_desc2)));
        this.f27419i.setPrimaryText(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_FailedToLoad_desc2));
        this.f27419i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        this.f27419i.setPrimaryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.C10148d.View$OnClickListenerC101491 */

            public void onClick(View view) {
                C10148d.this.mo38577a();
                C10148d.this.f27414c.pull();
            }
        });
    }

    /* renamed from: e */
    public void mo38581e() {
        this.f27423m.mo45303c();
        this.f27419i.setVisibility(0);
        this.f27419i.setTitle(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_NoPermission_title));
        SpaceEmptyState spaceEmptyState = this.f27419i;
        spaceEmptyState.setDesc(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_PrivacyOff_desc) + C10539a.m43639a(getContext(), R.string.CreationMobile_Stats_Visits_PrivacyOff_desc2, "privacy_settings", C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Stats_Visits_PrivacyOff_descBtn)));
        this.f27419i.setPrimaryText(C13749l.m55745a(getContext(), (int) R.string.CreationMobile_Common_PrivacySettings_tab));
        this.f27419i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_access));
        this.f27419i.setPrimaryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.C10148d.View$OnClickListenerC101502 */

            public void onClick(View view) {
                C10115a.m42133a("setting", "ccm_space_docs_details_setting_view");
                ((AbstractC10116a) KoinJavaComponent.m268610a(AbstractC10116a.class)).mo38524a(C10148d.this.f27413b, C10148d.this.f27412a, "record");
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42214a(AbstractC27129h hVar) {
        this.f27414c.pull();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (f27411d || arguments != null) {
            this.f27412a = arguments.getInt("TYPE", 0);
            this.f27413b = arguments.getString("TOKEN", "");
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m42211a(View view) {
        this.f27416f = (RecyclerView) view.findViewById(R.id.read_record_recycler_view);
        this.f27417g = (SmartRefreshLayout) view.findViewById(R.id.read_record_refresh_layout);
        this.f27418h = (TextView) view.findViewById(R.id.hidden);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view.findViewById(R.id.read_record_found_empty_state);
        this.f27419i = spaceEmptyState;
        spaceEmptyState.setVisibility(0);
        C11824c cVar = new C11824c(getContext());
        this.f27423m = cVar;
        cVar.mo45301a(0);
        this.f27422l = 1;
        m42215g();
        m42216h();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42212a(RecordListResult recordListResult) {
        this.f27423m.mo45303c();
        this.f27419i.setVisibility(4);
        this.f27417g.mo96416n();
        if (this.f27422l == 1) {
            C10115a.m42135b("normal");
            if (recordListResult.uv <= 200) {
                HashMap hashMap = new HashMap();
                hashMap.put("doc_visits_total", String.valueOf(recordListResult.uv));
                hashMap.put("doc_visits_hidden", String.valueOf(recordListResult.uvHidden));
                this.f27418h.setText(C10539a.m43640a(getContext(), R.string.CreationMobile_Stats_Visits_title, hashMap));
            } else {
                this.f27418h.setText(C10539a.m43639a(getContext(), R.string.CreationMobile_Stats_Visits_TooMany, "doc_visits_total", String.valueOf(recordListResult.uv)));
            }
        }
        this.f27421k.addAll(recordListResult.users);
        this.f27420j.notifyDataSetChanged();
        this.f27422l++;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42213a(C10151e.C10153a aVar) {
        int i = aVar.f27427a;
        if (i == 0) {
            this.f27417g.mo96416n();
        } else if (i == 1) {
            mo38579c();
        } else if (i == 2) {
            mo38580d();
        } else if (i == 3) {
            this.f27417g.mo96416n();
        } else if (i == 4) {
            this.f27417g.mo96415m(false);
            RecordListResult.C10143a aVar2 = new RecordListResult.C10143a();
            aVar2.f27388i = 0;
            this.f27421k.add(aVar2);
            this.f27420j.notifyDataSetChanged();
        } else if (i == 5) {
            C10115a.m42135b("normal");
            mo38578b();
        } else if (i == 8) {
            C10115a.m42135b("no_admin_permission");
            mo38582f();
        } else if (i == 9) {
            C10115a.m42135b("no_owner_permission");
            mo38581e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m42211a(view);
    }

    /* renamed from: a */
    public static Fragment m42210a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE", i);
        bundle.putString("TOKEN", str);
        C10148d dVar = new C10148d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.view_history_main_fragment, viewGroup, false);
    }
}
