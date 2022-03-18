package com.ss.android.appcenter.business.activity.appaddv2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a;
import com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27595b;
import com.ss.android.appcenter.business.net.dto.C27737a;
import com.ss.android.appcenter.business.net.searchitem.SearchItemData;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28181e;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28193m;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.common.view.SearchBar;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.d */
public class C27603d extends Fragment {

    /* renamed from: a */
    public SearchBar f68844a;

    /* renamed from: b */
    public TextView f68845b;

    /* renamed from: c */
    public View f68846c;

    /* renamed from: d */
    public C27584a f68847d;

    /* renamed from: e */
    public C27591a f68848e;

    /* renamed from: f */
    private LinearLayout f68849f;

    /* renamed from: g */
    private TextView f68850g;

    /* renamed from: h */
    private View f68851h;

    /* renamed from: i */
    private RecyclerView f68852i;

    /* renamed from: j */
    private View f68853j;

    /* renamed from: k */
    private View f68854k;

    /* renamed from: l */
    private StatusController f68855l;

    /* renamed from: a */
    public static C27603d m100728a() {
        return new C27603d();
    }

    /* renamed from: b */
    public void mo98323b() {
        this.f68855l.mo100033a(StatusController.Status.EMPTY);
    }

    /* renamed from: d */
    public void mo98325d() {
        this.f68855l.mo100033a(StatusController.Status.GUIDE);
    }

    /* renamed from: e */
    public void mo98326e() {
        this.f68855l.mo100033a(StatusController.Status.LOADING);
    }

    /* renamed from: f */
    public void mo98327f() {
        this.f68855l.mo100033a(StatusController.Status.CONTENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m100735i() {
        C28181e.m103233a(this.f68844a.getEditView());
    }

    /* renamed from: c */
    public void mo98324c() {
        this.f68855l.mo100033a(StatusController.Status.ERROR);
    }

    /* renamed from: h */
    private void m100734h() {
        C27584a aVar = (C27584a) aj.m5366a(getActivity()).mo6005a(C27584a.class);
        this.f68847d = aVar;
        aVar.getSearchLiveData().mo5923a(this, new AbstractC1178x<SearchItemData>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27603d.C276063 */

            /* renamed from: a */
            public void onChanged(SearchItemData searchItemData) {
                if (searchItemData == null) {
                    C28184h.m103250d("App_Add_Page", "SearchItemData onChanged. data is empty. showError");
                    C27603d.this.mo98324c();
                } else if (TextUtils.isEmpty(C27603d.this.f68844a.getText()) || !TextUtils.equals(searchItemData.getQuery(), C27603d.this.f68844a.getText())) {
                    C28184h.m103250d("App_Add_Page", "SearchItemData onChanged. the recent query is" + C27603d.this.f68844a.getText() + ".the old query is" + searchItemData.getQuery());
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C27737a aVar : searchItemData.getAvailableItems()) {
                        aVar.mo98963a(true);
                    }
                    arrayList.addAll(searchItemData.getAvailableItems());
                    for (C27737a aVar2 : searchItemData.getUnavailableItems()) {
                        aVar2.mo98963a(false);
                    }
                    arrayList.addAll(searchItemData.getUnavailableItems());
                    if (arrayList.size() == 0) {
                        C28184h.m103250d("App_Add_Page", "SearchItemData onChanged. list is empty. showGuide");
                        C27603d.this.mo98323b();
                        return;
                    }
                    C28184h.m103250d("App_Add_Page", "SearchItemData onChanged. data is ready. showContent");
                    C27603d.this.f68848e.mo98308a(new C27595b(arrayList, false));
                    C27603d.this.mo98327f();
                }
            }
        });
    }

    /* renamed from: g */
    private void m100733g() {
        StatusController statusController = new StatusController(this.f68852i, this.f68853j, this.f68850g);
        this.f68855l = statusController;
        statusController.mo100032a(this.f68851h, StatusController.Status.GUIDE);
        this.f68855l.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27603d.C276041 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                C27603d.this.f68846c.setVisibility(8);
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                int indexOf = C27603d.this.getResources().getString(R.string.OpenPlatform_AppCenter_Search_No_Result).indexOf(SmActions.ACTION_CALLING_ENTRY);
                String text = C27603d.this.f68844a.getText();
                String a = C28209p.m103298a(C27603d.this.getContext(), (int) R.string.OpenPlatform_AppCenter_Search_No_Result, "search_key", text);
                int indexOf2 = a.indexOf(text, indexOf);
                C27603d.this.f68845b.setText(C28193m.m103267a(a, indexOf2, text.length() + indexOf2, text, ContextCompat.getColor(C27603d.this.getContext(), R.color.text_link_hover)));
                C27603d.this.f68846c.setVisibility(0);
            }
        }, StatusController.Status.EMPTY);
        this.f68855l.mo100036a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100731c(View view) {
        this.f68847d.showAddFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C28181e.m103233a(this.f68844a.getEditView());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100732d(View view) {
        C28184h.m103250d("App_Add_Page", "click retry. SearchFragment showLoading");
        mo98326e();
        this.f68847d.search(this.f68844a.getText());
    }

    /* renamed from: a */
    private void m100729a(View view) {
        view.findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$d$Qbv8Gtvje2rmyxRPs5v74fOuOoI */

            public final void onClick(View view) {
                C27603d.this.m100732d(view);
            }
        });
        this.f68844a.setTextChangeListener(new SearchBar.AbstractC28217a() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27603d.C276052 */

            @Override // com.ss.android.appcenter.common.view.SearchBar.AbstractC28217a
            /* renamed from: a */
            public void mo98328a(Editable editable) {
                String obj = editable.toString();
                C28184h.m103250d("App_Add_Page", "search key:" + obj);
                if (TextUtils.isEmpty(obj)) {
                    C27603d.this.mo98325d();
                    return;
                }
                C27603d.this.mo98326e();
                C27603d.this.f68847d.search(obj);
            }
        });
        this.f68854k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$d$LhY1wios02pqoWsKC7SWvneSUg */

            public final void onClick(View view) {
                C27603d.this.m100731c(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        C27591a aVar = new C27591a(null, getContext(), (C27584a) aj.m5366a(getActivity()).mo6005a(C27584a.class));
        this.f68848e = aVar;
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemViewCacheSize(-1);
        recyclerView.getItemAnimator().setChangeDuration(0);
        recyclerView.post(new Runnable() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$d$i35XQhnIXO1iAR7RXWU4TFGD190 */

            public final void run() {
                C27603d.this.m100735i();
            }
        });
    }

    /* renamed from: b */
    private void m100730b(View view) {
        this.f68844a = (SearchBar) view.findViewById(R.id.search_bar);
        this.f68845b = (TextView) view.findViewById(R.id.tv_empty_tip);
        this.f68849f = (LinearLayout) view.findViewById(R.id.container);
        this.f68850g = (TextView) view.findViewById(R.id.loading);
        this.f68851h = view.findViewById(R.id.guide);
        this.f68852i = (RecyclerView) view.findViewById(R.id.recycler);
        this.f68853j = view.findViewById(R.id.error);
        this.f68846c = view.findViewById(R.id.empty);
        this.f68854k = view.findViewById(R.id.cancel);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.workplace_addapp_search_fragment, viewGroup, false);
        m100730b(inflate);
        m100733g();
        m100729a(inflate);
        m100734h();
        C28184h.m103250d("App_Add_Page", "SearchFragment finish init. showLoading");
        mo98325d();
        return inflate;
    }
}
