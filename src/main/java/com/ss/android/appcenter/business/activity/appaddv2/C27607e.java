package com.ss.android.appcenter.business.activity.appaddv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a;
import com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27595b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.e */
public class C27607e extends Fragment {

    /* renamed from: a */
    public C27591a f68859a;

    /* renamed from: b */
    public RecyclerView f68860b;

    /* renamed from: c */
    public C2048a f68861c;

    /* renamed from: d */
    private String f68862d;

    /* renamed from: e */
    private String f68863e;

    /* renamed from: f */
    private StatusController f68864f;

    /* renamed from: g */
    private C27584a f68865g;

    /* renamed from: e */
    private void m100750e() {
        StatusController statusController = this.f68864f;
        if (statusController != null) {
            statusController.mo100033a(StatusController.Status.LOADING);
        }
    }

    /* renamed from: a */
    public void mo98330a() {
        StatusController statusController = this.f68864f;
        if (statusController != null) {
            statusController.mo100033a(StatusController.Status.CONTENT);
        }
    }

    /* renamed from: b */
    public void mo98332b() {
        StatusController statusController = this.f68864f;
        if (statusController != null) {
            statusController.mo100033a(StatusController.Status.ERROR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f68860b = null;
        this.f68859a = null;
        this.f68861c = null;
        this.f68865g = null;
        this.f68864f = null;
    }

    /* renamed from: c */
    public void mo98333c() {
        StatusController statusController = this.f68864f;
        if (statusController != null) {
            statusController.mo100033a(StatusController.Status.GUIDE);
        }
    }

    /* renamed from: d */
    private void m100749d() {
        this.f68865g = (C27584a) aj.m5366a(getActivity()).mo6005a(C27584a.class);
        mo98331a("request local and net");
        this.f68865g.getTagDataLiveData(this.f68862d).mo5923a(getActivity(), new AbstractC1178x<C27595b>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27607e.C276092 */

            /* renamed from: a */
            public void onChanged(C27595b bVar) {
                if (bVar == null) {
                    C27607e.this.mo98331a("tagDataLiveData onChange: data is null. showError");
                    C27607e.this.mo98332b();
                } else if (C28182f.m103238c(bVar.mo98311a())) {
                    C27607e.this.mo98331a("tagDataLiveData onChange: data list size 0. showGuide");
                    C27607e.this.mo98333c();
                } else {
                    C27607e.this.mo98331a("tagDataLiveData onChange: data ready. showContent");
                    if (C27607e.this.f68859a != null) {
                        C27607e.this.f68859a.mo98308a(bVar);
                        C27607e.this.mo98330a();
                    }
                }
            }
        });
        this.f68865g.requestTagDataFromLocal(this.f68862d);
        this.f68865g.requestTagDataFromNet(this.f68862d);
        this.f68865g.getUserItemListLiveData().mo5923a(getActivity(), new AbstractC1178x<List<ItemInfo>>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27607e.C276103 */

            /* renamed from: a */
            public void onChanged(List<ItemInfo> list) {
                if (list != null) {
                    C27607e.this.mo98331a("UserItemList onchanged. refresh adapter");
                    if (C27607e.this.f68859a != null) {
                        C27607e.this.f68859a.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100748c(View view) {
        mo98331a("click retry. showLoading");
        m100750e();
        this.f68865g.requestTagDataFromNet(this.f68862d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f68862d = getArguments().getString("tagId");
        this.f68863e = getArguments().getString("tagName");
    }

    /* renamed from: a */
    private void m100746a(View view) {
        StatusController statusController = new StatusController(view.findViewById(R.id.recycler), view.findViewById(R.id.error), new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27607e.C276081 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                if (C27607e.this.f68861c != null) {
                    C27607e.this.f68861c.mo10130b();
                }
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                if (C27607e.this.f68860b == null || C27607e.this.f68860b.getContext() == null) {
                    C27607e.this.mo98331a("switchOn>>> mRecyclerView or mRecyclerView.getContext is null");
                    return;
                }
                C27607e eVar = C27607e.this;
                eVar.f68861c = C2052c.m8960a(eVar.f68860b).mo10132a(C27607e.this.f68859a).mo10139e(R.layout.workplace_addapp_appadapter_skeleton_item).mo10133a(UIUtils.canShowSkeleton()).mo10134a();
                C27607e.this.f68860b.setVisibility(0);
            }
        });
        this.f68864f = statusController;
        statusController.mo100032a(view.findViewById(R.id.guide), StatusController.Status.GUIDE);
        this.f68864f.mo100036a(true);
    }

    /* renamed from: b */
    private void m100747b(View view) {
        view.findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$e$u6ELYUEX8aOVQyd7aIktNIaWf4 */

            public final void onClick(View view) {
                C27607e.this.m100748c(view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.f68860b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C27591a aVar = new C27591a(null, getContext(), (C27584a) aj.m5366a(getActivity()).mo6005a(C27584a.class));
        this.f68859a = aVar;
        this.f68860b.setAdapter(aVar);
        this.f68860b.setItemViewCacheSize(-1);
        this.f68860b.getItemAnimator().setChangeDuration(0);
    }

    /* renamed from: a */
    public void mo98331a(String str) {
        C28184h.m103250d("App_Add_Page", "TagFragment id:" + this.f68862d + ". name:" + this.f68863e + ". msg:" + str);
    }

    /* renamed from: a */
    public static C27607e m100745a(String str, String str2) {
        C28184h.m103250d("App_Add_Page", "newInstance TagFragment tadId:" + str + " tagName:" + str2);
        C27607e eVar = new C27607e();
        Bundle bundle = new Bundle();
        bundle.putString("tagId", str);
        bundle.putString("tagName", str2);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.workplace_addapp_tag_fragment, viewGroup, false);
        m100746a(inflate);
        m100747b(inflate);
        m100750e();
        m100749d();
        mo98331a("init finish. showLoading");
        return inflate;
    }
}
