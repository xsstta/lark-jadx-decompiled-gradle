package com.ss.android.lark.reaction.widget.detailwindow.p2561a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52994a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.b */
public class C52996b extends Fragment {

    /* renamed from: a */
    public C52994a f130909a;

    /* renamed from: b */
    public boolean f130910b;

    /* renamed from: c */
    private C53001e f130911c;

    /* renamed from: d */
    private ViewGroup f130912d;

    /* renamed from: e */
    private RecyclerView f130913e;

    /* renamed from: f */
    private C53002b.AbstractC53005b f130914f;

    /* renamed from: g */
    private C53002b.AbstractC53004a f130915g;

    /* renamed from: h */
    private LKUIStatus f130916h;

    /* renamed from: i */
    private CallbackManager f130917i = new CallbackManager();

    /* renamed from: a */
    public RecyclerView mo181032a() {
        return this.f130913e;
    }

    /* renamed from: d */
    private void m205257d() {
        this.f130909a.mo181030a(new C52994a.AbstractC52995a() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.p2561a.$$Lambda$b$at0JUTehW_A5BurtWKJOL9ViyQo */

            @Override // com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52994a.AbstractC52995a
            public final void click(String str) {
                C52996b.lambda$at0JUTehW_A5BurtWKJOL9ViyQo(C52996b.this, str);
            }
        });
    }

    /* renamed from: b */
    public void mo181035b() {
        LKUIStatus lKUIStatus = this.f130916h;
        if (lKUIStatus != null && lKUIStatus.mo89851h()) {
            this.f130916h.mo89847d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo181035b();
        this.f130917i.cancelCallbacks();
    }

    /* renamed from: e */
    private void m205258e() {
        this.f130913e.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C52994a aVar = new C52994a(getContext(), this.f130911c.mo181039a());
        this.f130909a = aVar;
        this.f130913e.setAdapter(aVar);
    }

    /* renamed from: c */
    private void m205256c() {
        this.f130916h = new LKUIStatus.C25680a(this.f130912d).mo89856a((float) C52990a.m205224a(this.f130912d.getContext(), 100.0f)).mo89859a();
        if (this.f130910b && this.f130911c.mo181039a().size() < this.f130911c.mo181042b()) {
            this.f130916h.mo89837a();
            this.f130911c.mo181040a(new UIGetDataCallback((IGetDataCallback) this.f130917i.wrapAndAddCallback(new IGetDataCallback<ReactionDetailViewModel>() {
                /* class com.ss.android.lark.reaction.widget.detailwindow.p2561a.C52996b.C529971 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C52996b.this.f130910b = false;
                    C52996b.this.mo181035b();
                }

                /* renamed from: a */
                public void onSuccess(ReactionDetailViewModel reactionDetailViewModel) {
                    C52996b.this.f130909a.mo181031a(reactionDetailViewModel.getUserInfoList());
                    C52996b.this.f130910b = false;
                    C52996b.this.mo181035b();
                }
            })));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205255a(String str) {
        C53002b.AbstractC53005b bVar = this.f130914f;
        if (bVar != null) {
            bVar.onItemClicked(str);
        }
    }

    /* renamed from: a */
    public void mo181033a(C53002b.AbstractC53004a aVar) {
        this.f130915g = aVar;
    }

    /* renamed from: a */
    public void mo181034a(C53002b.AbstractC53005b bVar) {
        this.f130914f = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f130911c = new C53001e(this.f130915g);
        if (getArguments() != null) {
            ReactionDetailViewModel reactionDetailViewModel = (ReactionDetailViewModel) getArguments().getSerializable("reaction_info");
            this.f130910b = getArguments().getBoolean("need_loading");
            if (reactionDetailViewModel != null) {
                this.f130911c.mo181041a(reactionDetailViewModel);
            }
        }
    }

    /* renamed from: a */
    public static C52996b m205254a(ReactionDetailViewModel reactionDetailViewModel, boolean z) {
        C52996b bVar = new C52996b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("reaction_info", reactionDetailViewModel);
        bundle.putSerializable("need_loading", Boolean.valueOf(z));
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f130913e = (RecyclerView) this.f130912d.findViewById(R.id.vp_reaction_list);
        m205258e();
        m205256c();
        m205257d();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_reaction_list_pager, viewGroup, false);
        this.f130912d = viewGroup2;
        return viewGroup2;
    }
}
